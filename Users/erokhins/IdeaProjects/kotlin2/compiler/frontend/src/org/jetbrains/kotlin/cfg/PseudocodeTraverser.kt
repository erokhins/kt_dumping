'getInstructions' @ [32:24] ==> public fun Pseudocode.getInstructions(traversalOrder: TraversalOrder): List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser in file PseudocodeTraverser.kt[SimpleFunctionDescriptorImpl]

'traversalOrder' @ [32:40] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[ValueParameterDescriptorImpl]

'instructions' @ [33:25] ==> val instructions: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'instruction' @ [34:13] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'instruction' @ [35:13] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'body' @ [35:25] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'traverse' @ [35:30] ==> public fun Pseudocode.traverse(traversalOrder: TraversalOrder, analyzeInstruction: (Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser in file PseudocodeTraverser.kt[SimpleFunctionDescriptorImpl]

'traversalOrder' @ [35:39] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[ValueParameterDescriptorImpl]

'analyzeInstruction' @ [35:55] ==> value-parameter analyzeInstruction: (Instruction) -> Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[ValueParameterDescriptorImpl]

'invoke' @ [37:9] ==> public abstract operator fun invoke(p1: Instruction): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'instruction' @ [37:28] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'getInstructions' @ [46:24] ==> public fun Pseudocode.getInstructions(traversalOrder: TraversalOrder): List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser in file PseudocodeTraverser.kt[SimpleFunctionDescriptorImpl]

'traversalOrder' @ [46:40] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[ValueParameterDescriptorImpl]

'instructions' @ [47:25] ==> val instructions: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'instruction' @ [48:13] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'instruction' @ [49:13] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'body' @ [49:25] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'traverse' @ [49:30] ==> public fun <D> Pseudocode.traverse(traversalOrder: TraversalOrder, edgesMap: Map<Instruction, Edges<D>>, analyzeInstruction: (Instruction, D, D) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'traversalOrder' @ [49:39] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[ValueParameterDescriptorImpl]

'edgesMap' @ [49:55] ==> value-parameter edgesMap: Map<Instruction, Edges<D>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[ValueParameterDescriptorImpl]

'analyzeInstruction' @ [49:65] ==> value-parameter analyzeInstruction: (Instruction, D, D) -> Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[ValueParameterDescriptorImpl]

'edgesMap' @ [51:21] ==> value-parameter edgesMap: Map<Instruction, Edges<D>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[ValueParameterDescriptorImpl]

'instruction' @ [51:30] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'edges' @ [52:13] ==> val edges: Edges<D>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'invoke' @ [53:13] ==> public abstract operator fun invoke(p1: Instruction, p2: D, p3: D): Unit defined in kotlin.Function3[FunctionInvokeDescriptor]

'instruction' @ [53:32] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'edges' @ [53:45] ==> val edges: Edges<D>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'incoming' @ [53:51] ==> public final val incoming: D defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[PropertyDescriptorImpl]

'edges' @ [53:61] ==> val edges: Edges<D>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverse[LocalVariableDescriptor]

'outgoing' @ [53:67] ==> public final val outgoing: D defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[PropertyDescriptorImpl]

'LinkedHashMap' @ [64:20] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Instruction
    <V : (Any..Any?)> -> Edges<I>

'edgesMap' @ [65:5] ==> val edgesMap: LinkedHashMap<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData[LocalVariableDescriptor]

'put' @ [65:14] ==> public open fun put(key: Instruction, value: Edges<I>): Edges<I>? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'getStartInstruction' @ [65:18] ==> public fun Pseudocode.getStartInstruction(traversalOrder: TraversalOrder): Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser in file PseudocodeTraverser.kt[SimpleFunctionDescriptorImpl]

'traversalOrder' @ [65:38] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData[ValueParameterDescriptorImpl]

'Edges' @ [65:55] ==> public constructor Edges<out T>(incoming: I, outgoing: I) defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> I

'initialInfo' @ [65:61] ==> value-parameter initialInfo: I defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData[ValueParameterDescriptorImpl]

'initialInfo' @ [65:74] ==> value-parameter initialInfo: I defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData[ValueParameterDescriptorImpl]

'mutableMapOf' @ [67:19] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<Instruction, Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Instruction
    <V> -> Boolean

'collectDataFromSubgraph' @ [69:9] ==> private fun <I : ControlFlowInfo<*, *>> Pseudocode.collectDataFromSubgraph(traversalOrder: TraversalOrder, edgesMap: MutableMap<Instruction, Edges<I>>, mergeEdges: (Instruction, Collection<I>) -> Edges<I>, updateEdge: (Instruction, Instruction, I) -> I, previousSubGraphInstructions: Collection<Instruction>, changed: MutableMap<Instruction, Boolean>, isLocal: Boolean): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]
Inferred types:
    <I : ControlFlowInfo<*, *>> -> I

'traversalOrder' @ [70:17] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData[ValueParameterDescriptorImpl]

'edgesMap' @ [70:33] ==> val edgesMap: LinkedHashMap<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData[LocalVariableDescriptor]

'mergeEdges' @ [71:17] ==> value-parameter mergeEdges: (Instruction, Collection<I>) -> Edges<I> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData[ValueParameterDescriptorImpl]

'updateEdge' @ [71:29] ==> value-parameter updateEdge: (Instruction, Instruction, I) -> I defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData[ValueParameterDescriptorImpl]

'emptyList' @ [71:53] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(Instruction..Instruction?)>..List<(Instruction..Instruction?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Instruction

'changed' @ [71:79] ==> val changed: MutableMap<Instruction, Boolean> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData[LocalVariableDescriptor]

'changed' @ [72:14] ==> val changed: MutableMap<Instruction, Boolean> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData[LocalVariableDescriptor]

'any' @ [72:22] ==> public inline fun <K, V> Map<out Instruction, Boolean>.any(predicate: (Map.Entry<Instruction, Boolean>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Instruction
    <V> -> Boolean

'it' @ [72:28] ==> value-parameter it: Map.Entry<Instruction, Boolean> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [72:31] ==> public abstract val value: Boolean defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'edgesMap' @ [74:12] ==> val edgesMap: LinkedHashMap<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectData[LocalVariableDescriptor]

'getInstructions' @ [86:24] ==> public fun Pseudocode.getInstructions(traversalOrder: TraversalOrder): List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser in file PseudocodeTraverser.kt[SimpleFunctionDescriptorImpl]

'traversalOrder' @ [86:40] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'getStartInstruction' @ [87:28] ==> public fun Pseudocode.getStartInstruction(traversalOrder: TraversalOrder): Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser in file PseudocodeTraverser.kt[SimpleFunctionDescriptorImpl]

'traversalOrder' @ [87:48] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'instructions' @ [89:25] ==> val instructions: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'instruction' @ [90:23] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'isStartInstruction' @ [90:35] ==> public fun Instruction.isStartInstruction(traversalOrder: TraversalOrder): Boolean defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser in file PseudocodeTraverser.kt[SimpleFunctionDescriptorImpl]

'traversalOrder' @ [90:54] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'!' @ [91:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [91:14] ==> value-parameter isLocal: Boolean defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'isStart' @ [91:25] ==> val isStart: Boolean defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'getPreviousIncludingSubGraphInstructions' @ [94:36] ==> private fun getPreviousIncludingSubGraphInstructions(instruction: Instruction, traversalOrder: TraversalOrder, startInstruction: Instruction, previousSubGraphInstructions: Collection<Instruction>): Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser in file PseudocodeTraverser.kt[SimpleFunctionDescriptorImpl]

'instruction' @ [94:77] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'traversalOrder' @ [94:90] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'startInstruction' @ [94:106] ==> val startInstruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'previousSubGraphInstructions' @ [94:124] ==> value-parameter previousSubGraphInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'instruction' @ [96:13] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'instruction' @ [97:40] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'body' @ [97:52] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'subroutinePseudocode' @ [98:13] ==> val subroutinePseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'collectDataFromSubgraph' @ [98:34] ==> private fun <I : ControlFlowInfo<*, *>> Pseudocode.collectDataFromSubgraph(traversalOrder: TraversalOrder, edgesMap: MutableMap<Instruction, Edges<I>>, mergeEdges: (Instruction, Collection<I>) -> Edges<I>, updateEdge: (Instruction, Instruction, I) -> I, previousSubGraphInstructions: Collection<Instruction>, changed: MutableMap<Instruction, Boolean>, isLocal: Boolean): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]
Inferred types:
    <I : ControlFlowInfo<*, *>> -> I

'traversalOrder' @ [99:21] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'edgesMap' @ [99:37] ==> value-parameter edgesMap: MutableMap<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'mergeEdges' @ [99:47] ==> value-parameter mergeEdges: (Instruction, Collection<I>) -> Edges<I> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'updateEdge' @ [99:59] ==> value-parameter updateEdge: (Instruction, Instruction, I) -> I defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'previousInstructions' @ [99:71] ==> val previousInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'changed' @ [99:93] ==> value-parameter changed: MutableMap<Instruction, Boolean> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'subroutinePseudocode' @ [100:35] ==> val subroutinePseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'getLastInstruction' @ [100:56] ==> public fun Pseudocode.getLastInstruction(traversalOrder: TraversalOrder): Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser in file PseudocodeTraverser.kt[SimpleFunctionDescriptorImpl]

'traversalOrder' @ [100:75] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'edgesMap' @ [101:33] ==> value-parameter edgesMap: MutableMap<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'instruction' @ [101:42] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'edgesMap' @ [102:28] ==> value-parameter edgesMap: MutableMap<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'lastInstruction' @ [102:37] ==> val lastInstruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'newValue' @ [103:32] ==> val newValue: Edges<I>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'let' @ [103:42] ==> @InlineOnly public inline fun <T, R> Edges<I>.let(block: (Edges<I>) -> Edges<I>): Edges<I> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Edges<I>
    <R> -> Edges<I>

'Edges' @ [104:17] ==> public constructor Edges<out T>(incoming: I, outgoing: I) defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> I

'invoke' @ [104:23] ==> public abstract operator fun invoke(p1: Instruction, p2: Instruction, p3: I): I defined in kotlin.Function3[FunctionInvokeDescriptor]

'lastInstruction' @ [104:34] ==> val lastInstruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'instruction' @ [104:51] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'it' @ [104:64] ==> value-parameter it: Edges<I> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph.<anonymous>[ValueParameterDescriptorImpl]

'incoming' @ [104:67] ==> public final val incoming: I defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[PropertyDescriptorImpl]

'invoke' @ [104:78] ==> public abstract operator fun invoke(p1: Instruction, p2: Instruction, p3: I): I defined in kotlin.Function3[FunctionInvokeDescriptor]

'lastInstruction' @ [104:89] ==> val lastInstruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'instruction' @ [104:106] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'it' @ [104:119] ==> value-parameter it: Edges<I> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph.<anonymous>[ValueParameterDescriptorImpl]

'outgoing' @ [104:122] ==> public final val outgoing: I defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[PropertyDescriptorImpl]

'updateEdgeDataForInstruction' @ [106:13] ==> private fun <I : ControlFlowInfo<*, *>> updateEdgeDataForInstruction(instruction: Instruction, previousValue: Edges<I>?, newValue: Edges<I>?, edgesMap: MutableMap<Instruction, Edges<I>>, changed: MutableMap<Instruction, Boolean>): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]
Inferred types:
    <I : ControlFlowInfo<*, *>> -> I

'instruction' @ [106:42] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'previousValue' @ [106:55] ==> val previousValue: Edges<I>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'updatedValue' @ [106:70] ==> val updatedValue: Edges<I>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'edgesMap' @ [106:84] ==> value-parameter edgesMap: MutableMap<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'changed' @ [106:94] ==> value-parameter changed: MutableMap<Instruction, Boolean> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'edgesMap' @ [111:33] ==> value-parameter edgesMap: MutableMap<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'instruction' @ [111:42] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'previousDataValue' @ [112:13] ==> val previousDataValue: Edges<I>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'previousInstructions' @ [112:42] ==> val previousInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'all' @ [112:63] ==> public inline fun <T> Iterable<Instruction>.all(predicate: (Instruction) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'changed' @ [112:69] ==> value-parameter changed: MutableMap<Instruction, Boolean> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'it' @ [112:77] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph.<anonymous>[ValueParameterDescriptorImpl]

'changed' @ [113:13] ==> value-parameter changed: MutableMap<Instruction, Boolean> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'instruction' @ [113:21] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'HashSet' @ [117:33] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> I

'previousInstructions' @ [119:37] ==> val previousInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'edgesMap' @ [120:32] ==> value-parameter edgesMap: MutableMap<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'previousInstruction' @ [120:41] ==> val previousInstruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'previousData' @ [121:17] ==> val previousData: Edges<I>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'incomingEdgesData' @ [122:17] ==> val incomingEdgesData: HashSet<I> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'add' @ [122:35] ==> public open fun add(element: I): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'invoke' @ [122:39] ==> public abstract operator fun invoke(p1: Instruction, p2: Instruction, p3: I): I defined in kotlin.Function3[FunctionInvokeDescriptor]

'previousInstruction' @ [123:25] ==> val previousInstruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'instruction' @ [123:46] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'previousData' @ [123:59] ==> val previousData: Edges<I>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'outgoing' @ [123:72] ==> public final val outgoing: I defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[PropertyDescriptorImpl]

'invoke' @ [126:26] ==> public abstract operator fun invoke(p1: Instruction, p2: Collection<I>): Edges<I> defined in kotlin.Function2[FunctionInvokeDescriptor]

'instruction' @ [126:37] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'incomingEdgesData' @ [126:50] ==> val incomingEdgesData: HashSet<I> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'updateEdgeDataForInstruction' @ [127:9] ==> private fun <I : ControlFlowInfo<*, *>> updateEdgeDataForInstruction(instruction: Instruction, previousValue: Edges<I>?, newValue: Edges<I>?, edgesMap: MutableMap<Instruction, Edges<I>>, changed: MutableMap<Instruction, Boolean>): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]
Inferred types:
    <I : ControlFlowInfo<*, *>> -> I

'instruction' @ [127:38] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'previousDataValue' @ [127:51] ==> val previousDataValue: Edges<I>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'mergedData' @ [127:70] ==> val mergedData: Edges<I> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[LocalVariableDescriptor]

'edgesMap' @ [127:82] ==> value-parameter edgesMap: MutableMap<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'changed' @ [127:92] ==> value-parameter changed: MutableMap<Instruction, Boolean> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.collectDataFromSubgraph[ValueParameterDescriptorImpl]

'instruction' @ [137:20] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getPreviousIncludingSubGraphInstructions[ValueParameterDescriptorImpl]

'getPreviousInstructions' @ [137:32] ==> public fun Instruction.getPreviousInstructions(traversalOrder: TraversalOrder): Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser in file PseudocodeTraverser.kt[SimpleFunctionDescriptorImpl]

'traversalOrder' @ [137:56] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getPreviousIncludingSubGraphInstructions[ValueParameterDescriptorImpl]

'instruction' @ [138:9] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getPreviousIncludingSubGraphInstructions[ValueParameterDescriptorImpl]

'startInstruction' @ [138:24] ==> value-parameter startInstruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getPreviousIncludingSubGraphInstructions[ValueParameterDescriptorImpl]

'previousSubGraphInstructions' @ [138:44] ==> value-parameter previousSubGraphInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getPreviousIncludingSubGraphInstructions[ValueParameterDescriptorImpl]

'isEmpty' @ [138:73] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'previous' @ [139:16] ==> val previous: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getPreviousIncludingSubGraphInstructions[LocalVariableDescriptor]

'ArrayList' @ [141:18] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (Instruction..Instruction?)>..Collection<(Instruction..Instruction?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction..org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction?)

'previous' @ [141:28] ==> val previous: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getPreviousIncludingSubGraphInstructions[LocalVariableDescriptor]

'result' @ [142:5] ==> val result: ArrayList<(Instruction..Instruction?)> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getPreviousIncludingSubGraphInstructions[LocalVariableDescriptor]

'addAll' @ [142:12] ==> public open fun addAll(elements: Collection<(Instruction..Instruction?)>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'previousSubGraphInstructions' @ [142:19] ==> value-parameter previousSubGraphInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getPreviousIncludingSubGraphInstructions[ValueParameterDescriptorImpl]

'result' @ [143:12] ==> val result: ArrayList<(Instruction..Instruction?)> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getPreviousIncludingSubGraphInstructions[LocalVariableDescriptor]

'if (previousValue != newValue && newValue != null) {
        changed[instruction] = true
        edgesMap.put(instruction, newValue)
    }
    else {
        changed[instruction] = false
    }' @ [153:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'previousValue' @ [153:9] ==> value-parameter previousValue: Edges<I>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.updateEdgeDataForInstruction[ValueParameterDescriptorImpl]

'newValue' @ [153:26] ==> value-parameter newValue: Edges<I>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.updateEdgeDataForInstruction[ValueParameterDescriptorImpl]

'newValue' @ [153:38] ==> value-parameter newValue: Edges<I>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.updateEdgeDataForInstruction[ValueParameterDescriptorImpl]

'changed' @ [154:9] ==> value-parameter changed: MutableMap<Instruction, Boolean> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.updateEdgeDataForInstruction[ValueParameterDescriptorImpl]

'instruction' @ [154:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.updateEdgeDataForInstruction[ValueParameterDescriptorImpl]

'edgesMap' @ [155:9] ==> value-parameter edgesMap: MutableMap<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.updateEdgeDataForInstruction[ValueParameterDescriptorImpl]

'put' @ [155:18] ==> public abstract fun put(key: Instruction, value: Edges<I>): Edges<I>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'instruction' @ [155:22] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.updateEdgeDataForInstruction[ValueParameterDescriptorImpl]

'newValue' @ [155:35] ==> value-parameter newValue: Edges<I>? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.updateEdgeDataForInstruction[ValueParameterDescriptorImpl]

'changed' @ [158:9] ==> value-parameter changed: MutableMap<Instruction, Boolean> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.updateEdgeDataForInstruction[ValueParameterDescriptorImpl]

'instruction' @ [158:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.updateEdgeDataForInstruction[ValueParameterDescriptorImpl]

'HashSet' @ [173:44] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Instruction

'FORWARD' @ [174:33] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'ArrayDeque' @ [178:17] ==> public constructor ArrayDeque<E : (Any..Any?)>() defined in java.util.ArrayDeque[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Instruction

'stack' @ [179:5] ==> val stack: ArrayDeque<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions[LocalVariableDescriptor]

'push' @ [179:11] ==> public open fun push(p0: (Instruction..Instruction?)): Unit defined in java.util.ArrayDeque[JavaMethodDescriptor]

'rootInstruction' @ [179:16] ==> value-parameter rootInstruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions[ValueParameterDescriptorImpl]

'!' @ [181:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'stack' @ [181:13] ==> val stack: ArrayDeque<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions[LocalVariableDescriptor]

'isEmpty' @ [181:19] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'stack' @ [182:27] ==> val stack: ArrayDeque<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions[LocalVariableDescriptor]

'pop' @ [182:33] ==> public open fun pop(): (Instruction..Instruction?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'!' @ [183:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'visited' @ [183:14] ==> value-parameter visited: MutableSet<Instruction> = ... defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions[ValueParameterDescriptorImpl]

'add' @ [183:22] ==> public abstract fun add(element: Instruction): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'instruction' @ [183:26] ==> val instruction: (Instruction..Instruction?) defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions[LocalVariableDescriptor]

'when (handler?.let { it(instruction) } ?: TraverseInstructionResult.CONTINUE) {
            TraverseInstructionResult.CONTINUE -> instruction.getNextInstructions(order).forEach { stack.push(it) }
            TraverseInstructionResult.SKIP -> {}
            TraverseInstructionResult.HALT -> return false
        }' @ [184:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'handler' @ [184:15] ==> value-parameter handler: ((Instruction) -> TraverseInstructionResult)? defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions[ValueParameterDescriptorImpl]

'let' @ [184:24] ==> @InlineOnly public inline fun <T, R> ((Instruction) -> TraverseInstructionResult).let(block: ((Instruction) -> TraverseInstructionResult) -> TraverseInstructionResult): TraverseInstructionResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<Instruction, TraverseInstructionResult>
    <R> -> TraverseInstructionResult

'invoke' @ [184:30] ==> public abstract operator fun invoke(p1: Instruction): TraverseInstructionResult defined in kotlin.Function1[FunctionInvokeDescriptor]

'instruction' @ [184:33] ==> val instruction: (Instruction..Instruction?) defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions[LocalVariableDescriptor]

'CONTINUE' @ [184:77] ==> enum entry CONTINUE defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'CONTINUE' @ [185:39] ==> enum entry CONTINUE defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'instruction' @ [185:51] ==> val instruction: (Instruction..Instruction?) defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions[LocalVariableDescriptor]

'getNextInstructions' @ [185:63] ==> public fun Instruction.getNextInstructions(traversalOrder: TraversalOrder): Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser in file PseudocodeTraverser.kt[SimpleFunctionDescriptorImpl]

'order' @ [185:83] ==> value-parameter order: TraversalOrder = ... defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions[ValueParameterDescriptorImpl]

'forEach' @ [185:90] ==> @HidesMembers public inline fun <T> Iterable<Instruction>.forEach(action: (Instruction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'stack' @ [185:100] ==> val stack: ArrayDeque<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions[LocalVariableDescriptor]

'push' @ [185:106] ==> public open fun push(p0: (Instruction..Instruction?)): Unit defined in java.util.ArrayDeque[JavaMethodDescriptor]

'it' @ [185:111] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.traverseFollowingInstructions.<anonymous>[ValueParameterDescriptorImpl]

'SKIP' @ [186:39] ==> enum entry SKIP defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'HALT' @ [187:39] ==> enum entry HALT defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'if (traversalOrder == FORWARD) enterInstruction else sinkInstruction' @ [199:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Instruction, elseBranch: Instruction): Instruction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Instruction

'traversalOrder' @ [199:13] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getStartInstruction[ValueParameterDescriptorImpl]

'FORWARD' @ [199:31] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'enterInstruction' @ [199:40] ==> public abstract val enterInstruction: SubroutineEnterInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'sinkInstruction' @ [199:62] ==> public abstract val sinkInstruction: SubroutineSinkInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'if (traversalOrder == FORWARD) sinkInstruction else enterInstruction' @ [202:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Instruction, elseBranch: Instruction): Instruction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Instruction

'traversalOrder' @ [202:13] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getLastInstruction[ValueParameterDescriptorImpl]

'FORWARD' @ [202:31] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'sinkInstruction' @ [202:40] ==> public abstract val sinkInstruction: SubroutineSinkInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'enterInstruction' @ [202:61] ==> public abstract val enterInstruction: SubroutineEnterInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'if (traversalOrder == FORWARD) instructions else reversedInstructions' @ [205:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Instruction>, elseBranch: List<Instruction>): List<Instruction>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Instruction>

'traversalOrder' @ [205:13] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getInstructions[ValueParameterDescriptorImpl]

'FORWARD' @ [205:31] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'instructions' @ [205:40] ==> public abstract val instructions: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'reversedInstructions' @ [205:58] ==> public abstract val reversedInstructions: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'if (traversalOrder == FORWARD) nextInstructions else previousInstructions' @ [208:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<Instruction>, elseBranch: Collection<Instruction>): Collection<Instruction>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<Instruction>

'traversalOrder' @ [208:13] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getNextInstructions[ValueParameterDescriptorImpl]

'FORWARD' @ [208:31] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'nextInstructions' @ [208:40] ==> public abstract val nextInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'previousInstructions' @ [208:62] ==> public abstract val previousInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'if (traversalOrder == FORWARD) previousInstructions else nextInstructions' @ [211:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<Instruction>, elseBranch: Collection<Instruction>): Collection<Instruction>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<Instruction>

'traversalOrder' @ [211:13] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.getPreviousInstructions[ValueParameterDescriptorImpl]

'FORWARD' @ [211:31] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'previousInstructions' @ [211:40] ==> public abstract val previousInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'nextInstructions' @ [211:66] ==> public abstract val nextInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'if (traversalOrder == FORWARD) this is SubroutineEnterInstruction else this is SubroutineSinkInstruction' @ [214:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'traversalOrder' @ [214:13] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.isStartInstruction[ValueParameterDescriptorImpl]

'FORWARD' @ [214:31] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'this' @ [214:40] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.isStartInstruction[ReceiverParameterDescriptorImpl]

'this' @ [214:80] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.isStartInstruction[ReceiverParameterDescriptorImpl]

