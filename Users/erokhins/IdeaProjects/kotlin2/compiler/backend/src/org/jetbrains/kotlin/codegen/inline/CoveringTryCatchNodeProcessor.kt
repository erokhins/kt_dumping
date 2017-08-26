'IntervalMetaInfo' @ [25:70] ==> public constructor IntervalMetaInfo<T : SplittableInterval<TryCatchBlockNodeInfo>>() defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <T : SplittableInterval<T>> -> TryCatchBlockNodeInfo

'IntervalMetaInfo' @ [26:68] ==> public constructor IntervalMetaInfo<T : SplittableInterval<LocalVarNodeWrapper>>() defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <T : SplittableInterval<T>> -> LocalVarNodeWrapper

'parameterSize' @ [28:35] ==> value-parameter parameterSize: Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.<init>[ValueParameterDescriptorImpl]

'tryBlocksMetaInfo' @ [32:16] ==> public final val tryBlocksMetaInfo: IntervalMetaInfo<TryCatchBlockNodeInfo> defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[PropertyDescriptorImpl]

'intervalStarts' @ [32:34] ==> public final val intervalStarts: (LinkedListMultimap<(LabelNode..LabelNode?), (TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>..LinkedListMultimap<(LabelNode..LabelNode?), (TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'get' @ [32:49] ==> public open fun get(@Nullable p0: LabelNode?): (MutableList<(TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>..List<(TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>?) defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]

'label' @ [32:53] ==> value-parameter label: LabelNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.getStartNodes[ValueParameterDescriptorImpl]

'tryBlocksMetaInfo' @ [36:16] ==> public final val tryBlocksMetaInfo: IntervalMetaInfo<TryCatchBlockNodeInfo> defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[PropertyDescriptorImpl]

'intervalEnds' @ [36:34] ==> public final val intervalEnds: (LinkedListMultimap<(LabelNode..LabelNode?), (TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>..LinkedListMultimap<(LabelNode..LabelNode?), (TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'get' @ [36:47] ==> public open fun get(@Nullable p0: LabelNode?): (MutableList<(TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>..List<(TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>?) defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]

'label' @ [36:51] ==> value-parameter label: LabelNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.getEndNodes[ValueParameterDescriptorImpl]

'curInstr' @ [40:13] ==> value-parameter curInstr: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[ValueParameterDescriptorImpl]

'curInstr' @ [40:40] ==> value-parameter curInstr: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[ValueParameterDescriptorImpl]

'getLoadStoreArgSize' @ [41:27] ==> internal fun getLoadStoreArgSize(opcode: Int): Int defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'curInstr' @ [41:47] ==> value-parameter curInstr: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[ValueParameterDescriptorImpl]

'opcode' @ [41:56] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'if (curInstr is VarInsnNode) curInstr.`var` else (curInstr as IincInsnNode).`var`' @ [42:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'curInstr' @ [42:32] ==> value-parameter curInstr: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[ValueParameterDescriptorImpl]

'curInstr' @ [42:57] ==> value-parameter curInstr: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[ValueParameterDescriptorImpl]

'`var`' @ [42:66] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'curInstr' @ [42:78] ==> value-parameter curInstr: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[ValueParameterDescriptorImpl]

'`var`' @ [42:104] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.IincInsnNode[JavaPropertyDescriptor]

'nextFreeLocalIndex' @ [43:13] ==> public final var nextFreeLocalIndex: Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[PropertyDescriptorImpl]

'max' @ [43:39] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'nextFreeLocalIndex' @ [43:43] ==> public final var nextFreeLocalIndex: Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[PropertyDescriptorImpl]

'varIndex' @ [43:63] ==> val varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[LocalVariableDescriptor]

'argSize' @ [43:74] ==> val argSize: Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[LocalVariableDescriptor]

'curInstr' @ [46:13] ==> value-parameter curInstr: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[ValueParameterDescriptorImpl]

'tryBlocksMetaInfo' @ [47:13] ==> public final val tryBlocksMetaInfo: IntervalMetaInfo<TryCatchBlockNodeInfo> defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[PropertyDescriptorImpl]

'processCurrent' @ [47:31] ==> public final fun processCurrent(curIns: LabelNode, directOrder: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[SimpleFunctionDescriptorImpl]

'curInstr' @ [47:46] ==> value-parameter curInstr: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[ValueParameterDescriptorImpl]

'directOrder' @ [47:56] ==> value-parameter directOrder: Boolean defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[ValueParameterDescriptorImpl]

'localVarsMetaInfo' @ [48:13] ==> public final val localVarsMetaInfo: IntervalMetaInfo<LocalVarNodeWrapper> defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[PropertyDescriptorImpl]

'processCurrent' @ [48:31] ==> public final fun processCurrent(curIns: LabelNode, directOrder: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[SimpleFunctionDescriptorImpl]

'curInstr' @ [48:46] ==> value-parameter curInstr: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[ValueParameterDescriptorImpl]

'directOrder' @ [48:56] ==> value-parameter directOrder: Boolean defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.processInstruction[ValueParameterDescriptorImpl]

'Comparator' @ [55:20] ==> @FunctionalInterface public fun <T : (Any..Any?)> Comparator(function: ((TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?), (TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)) -> Int): Comparator<(TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)> defined in java.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo..org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo?)

'instructionIndex' @ [56:26] ==> public abstract fun instructionIndex(inst: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[SimpleFunctionDescriptorImpl]

't1' @ [56:43] ==> value-parameter t1: TryCatchBlockNodeInfo defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'handler' @ [56:46] ==> public open val handler: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'instructionIndex' @ [56:57] ==> public abstract fun instructionIndex(inst: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[SimpleFunctionDescriptorImpl]

't2' @ [56:74] ==> value-parameter t2: TryCatchBlockNodeInfo defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'handler' @ [56:77] ==> public open val handler: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'result' @ [57:17] ==> var result: Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[LocalVariableDescriptor]

'result' @ [58:17] ==> var result: Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[LocalVariableDescriptor]

'instructionIndex' @ [58:26] ==> public abstract fun instructionIndex(inst: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[SimpleFunctionDescriptorImpl]

't1' @ [58:43] ==> value-parameter t1: TryCatchBlockNodeInfo defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'startLabel' @ [58:46] ==> public open val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'instructionIndex' @ [58:60] ==> public abstract fun instructionIndex(inst: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[SimpleFunctionDescriptorImpl]

't2' @ [58:77] ==> value-parameter t2: TryCatchBlockNodeInfo defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'startLabel' @ [58:80] ==> public open val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'result' @ [59:21] ==> var result: Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[LocalVariableDescriptor]

'assert' @ [60:21] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

't1' @ [60:77] ==> value-parameter t1: TryCatchBlockNodeInfo defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'handler' @ [60:80] ==> public open val handler: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

't2' @ [60:92] ==> value-parameter t2: TryCatchBlockNodeInfo defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'handler' @ [60:95] ==> public open val handler: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'result' @ [61:21] ==> var result: Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[LocalVariableDescriptor]

'instructionIndex' @ [61:30] ==> public abstract fun instructionIndex(inst: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[SimpleFunctionDescriptorImpl]

't1' @ [61:47] ==> value-parameter t1: TryCatchBlockNodeInfo defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'endLabel' @ [61:50] ==> public open val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'instructionIndex' @ [61:62] ==> public abstract fun instructionIndex(inst: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[SimpleFunctionDescriptorImpl]

't2' @ [61:79] ==> value-parameter t2: TryCatchBlockNodeInfo defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'endLabel' @ [61:82] ==> public open val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'result' @ [64:13] ==> var result: Int defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks.<anonymous>[LocalVariableDescriptor]

'sort' @ [67:21] ==> public open fun <T : (Any..Any?)> sort(p0: (MutableList<(TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>..List<(TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>?), p1: (Comparator<in (TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>..Comparator<in (TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)>?)): Unit defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo..org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo?)

'intervals' @ [67:26] ==> value-parameter intervals: List<TryCatchBlockNodeInfo> defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks[ValueParameterDescriptorImpl]

'comp' @ [67:37] ==> val comp: Comparator<(TryCatchBlockNodeInfo..TryCatchBlockNodeInfo?)> defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks[LocalVariableDescriptor]

'intervals' @ [68:16] ==> value-parameter intervals: List<TryCatchBlockNodeInfo> defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.sortTryCatchBlocks[ValueParameterDescriptorImpl]

'node' @ [72:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.substituteTryBlockNodes[ValueParameterDescriptorImpl]

'tryCatchBlocks' @ [72:14] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'clear' @ [72:29] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'sortTryCatchBlocks' @ [73:9] ==> public final fun sortTryCatchBlocks(intervals: List<TryCatchBlockNodeInfo>): List<TryCatchBlockNodeInfo> defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[SimpleFunctionDescriptorImpl]

'tryBlocksMetaInfo' @ [73:28] ==> public final val tryBlocksMetaInfo: IntervalMetaInfo<TryCatchBlockNodeInfo> defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[PropertyDescriptorImpl]

'allIntervals' @ [73:46] ==> public final val allIntervals: ArrayList<TryCatchBlockNodeInfo> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'tryBlocksMetaInfo' @ [74:22] ==> public final val tryBlocksMetaInfo: IntervalMetaInfo<TryCatchBlockNodeInfo> defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[PropertyDescriptorImpl]

'getMeaningfulIntervals' @ [74:40] ==> public fun <T : SplittableInterval<TryCatchBlockNodeInfo>> IntervalMetaInfo<TryCatchBlockNodeInfo>.getMeaningfulIntervals(): List<TryCatchBlockNodeInfo> defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : SplittableInterval<T>> -> TryCatchBlockNodeInfo

'node' @ [75:13] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.substituteTryBlockNodes[ValueParameterDescriptorImpl]

'tryCatchBlocks' @ [75:18] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'add' @ [75:33] ==> public abstract fun add(element: (TryCatchBlockNode..TryCatchBlockNode?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'info' @ [75:37] ==> val info: TryCatchBlockNodeInfo defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.substituteTryBlockNodes[LocalVariableDescriptor]

'node' @ [75:42] ==> public final val node: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'node' @ [80:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.substituteLocalVarTable[ValueParameterDescriptorImpl]

'localVariables' @ [80:14] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'clear' @ [80:29] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'localVarsMetaInfo' @ [81:22] ==> public final val localVarsMetaInfo: IntervalMetaInfo<LocalVarNodeWrapper> defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[PropertyDescriptorImpl]

'getMeaningfulIntervals' @ [81:40] ==> public fun <T : SplittableInterval<LocalVarNodeWrapper>> IntervalMetaInfo<LocalVarNodeWrapper>.getMeaningfulIntervals(): List<LocalVarNodeWrapper> defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : SplittableInterval<T>> -> LocalVarNodeWrapper

'node' @ [82:13] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.substituteLocalVarTable[ValueParameterDescriptorImpl]

'localVariables' @ [82:18] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'add' @ [82:33] ==> public abstract fun add(element: (LocalVariableNode..LocalVariableNode?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'info' @ [82:37] ==> val info: LocalVarNodeWrapper defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor.substituteLocalVarTable[LocalVariableDescriptor]

'node' @ [82:42] ==> public final val node: LocalVariableNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[PropertyDescriptorImpl]

'create' @ [88:45] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>..LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>?) defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> LabelNode
    <V : (Any..Any?)> -> T

'create' @ [89:43] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>..LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>?) defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> LabelNode
    <V : (Any..Any?)> -> T

'arrayListOf' @ [90:38] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<T> /* = ArrayList<T> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'linkedSetOf' @ [91:43] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<T> /* = LinkedHashSet<T> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'intervalStarts' @ [94:9] ==> public final val intervalStarts: (LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>..LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'put' @ [94:24] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: LabelNode?, @Nullable p1: T?): Boolean defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]

'newInfo' @ [94:28] ==> value-parameter newInfo: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.addNewInterval[ValueParameterDescriptorImpl]

'startLabel' @ [94:36] ==> public abstract val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.SplittableInterval[PropertyDescriptorImpl]

'newInfo' @ [94:48] ==> value-parameter newInfo: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.addNewInterval[ValueParameterDescriptorImpl]

'intervalEnds' @ [95:9] ==> public final val intervalEnds: (LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>..LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'put' @ [95:22] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: LabelNode?, @Nullable p1: T?): Boolean defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]

'newInfo' @ [95:26] ==> value-parameter newInfo: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.addNewInterval[ValueParameterDescriptorImpl]

'endLabel' @ [95:34] ==> public abstract val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.SplittableInterval[PropertyDescriptorImpl]

'newInfo' @ [95:44] ==> value-parameter newInfo: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.addNewInterval[ValueParameterDescriptorImpl]

'allIntervals' @ [96:9] ==> public final val allIntervals: ArrayList<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'add' @ [96:22] ==> public open fun add(element: T): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'newInfo' @ [96:26] ==> value-parameter newInfo: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.addNewInterval[ValueParameterDescriptorImpl]

'intervalStarts' @ [100:9] ==> public final val intervalStarts: (LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>..LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'remove' @ [100:24] ==> @CanIgnoreReturnValue public open fun remove(@Nullable p0: Any?, @Nullable p1: Any?): Boolean defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]

'oldStart' @ [100:31] ==> value-parameter oldStart: LabelNode defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.remapStartLabel[ValueParameterDescriptorImpl]

'remapped' @ [100:41] ==> value-parameter remapped: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.remapStartLabel[ValueParameterDescriptorImpl]

'intervalStarts' @ [101:9] ==> public final val intervalStarts: (LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>..LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'put' @ [101:24] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: LabelNode?, @Nullable p1: T?): Boolean defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]

'remapped' @ [101:28] ==> value-parameter remapped: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.remapStartLabel[ValueParameterDescriptorImpl]

'startLabel' @ [101:37] ==> public abstract val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.SplittableInterval[PropertyDescriptorImpl]

'remapped' @ [101:49] ==> value-parameter remapped: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.remapStartLabel[ValueParameterDescriptorImpl]

'intervalEnds' @ [105:9] ==> public final val intervalEnds: (LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>..LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'remove' @ [105:22] ==> @CanIgnoreReturnValue public open fun remove(@Nullable p0: Any?, @Nullable p1: Any?): Boolean defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]

'oldEnd' @ [105:29] ==> value-parameter oldEnd: LabelNode defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.remapEndLabel[ValueParameterDescriptorImpl]

'remapped' @ [105:37] ==> value-parameter remapped: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.remapEndLabel[ValueParameterDescriptorImpl]

'intervalEnds' @ [106:9] ==> public final val intervalEnds: (LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>..LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'put' @ [106:22] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: LabelNode?, @Nullable p1: T?): Boolean defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]

'remapped' @ [106:26] ==> value-parameter remapped: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.remapEndLabel[ValueParameterDescriptorImpl]

'endLabel' @ [106:35] ==> public abstract val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.SplittableInterval[PropertyDescriptorImpl]

'remapped' @ [106:45] ==> value-parameter remapped: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.remapEndLabel[ValueParameterDescriptorImpl]

'currentIntervals' @ [110:16] ==> public final val currentIntervals: MutableSet<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'map' @ [110:33] ==> public inline fun <T, R> Iterable<T>.map(transform: (T) -> SplitPair<T>): List<SplitPair<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> SplitPair<T>

'split' @ [110:39] ==> public final fun split(interval: T, by: Interval, keepStart: Boolean): SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[SimpleFunctionDescriptorImpl]

'it' @ [110:45] ==> value-parameter it: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.splitCurrentIntervals.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [110:49] ==> value-parameter by: Interval defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.splitCurrentIntervals[ValueParameterDescriptorImpl]

'keepStart' @ [110:53] ==> value-parameter keepStart: Boolean defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.splitCurrentIntervals[ValueParameterDescriptorImpl]

'getInterval' @ [114:9] ==> private final fun getInterval(curIns: LabelNode, isOpen: Boolean): (MutableList<(T..T?)>..List<(T..T?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[SimpleFunctionDescriptorImpl]

'curIns' @ [114:21] ==> value-parameter curIns: LabelNode defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent[ValueParameterDescriptorImpl]

'directOrder' @ [114:29] ==> value-parameter directOrder: Boolean defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent[ValueParameterDescriptorImpl]

'forEach' @ [114:42] ==> @HidesMembers public inline fun <T> Iterable<(T..T?)>.forEach(action: ((T..T?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'currentIntervals' @ [115:25] ==> public final val currentIntervals: MutableSet<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'add' @ [115:42] ==> public abstract fun add(element: T): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [115:46] ==> value-parameter it: (T..T?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [116:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'added' @ [116:20] ==> val added: Boolean defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent.<anonymous>[LocalVariableDescriptor]

'curIns' @ [116:57] ==> value-parameter curIns: LabelNode defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent[ValueParameterDescriptorImpl]

'it' @ [116:66] ==> value-parameter it: (T..T?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent.<anonymous>[ValueParameterDescriptorImpl]

'getInterval' @ [119:9] ==> private final fun getInterval(curIns: LabelNode, isOpen: Boolean): (MutableList<(T..T?)>..List<(T..T?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[SimpleFunctionDescriptorImpl]

'curIns' @ [119:21] ==> value-parameter curIns: LabelNode defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent[ValueParameterDescriptorImpl]

'!' @ [119:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'directOrder' @ [119:30] ==> value-parameter directOrder: Boolean defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent[ValueParameterDescriptorImpl]

'forEach' @ [119:43] ==> @HidesMembers public inline fun <T> Iterable<(T..T?)>.forEach(action: ((T..T?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'currentIntervals' @ [120:27] ==> public final val currentIntervals: MutableSet<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'remove' @ [120:44] ==> public abstract fun remove(element: T): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [120:51] ==> value-parameter it: (T..T?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [121:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'removed' @ [121:20] ==> val removed: Boolean defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent.<anonymous>[LocalVariableDescriptor]

'curIns' @ [121:59] ==> value-parameter curIns: LabelNode defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent[ValueParameterDescriptorImpl]

'it' @ [121:68] ==> value-parameter it: (T..T?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.processCurrent.<anonymous>[ValueParameterDescriptorImpl]

'interval' @ [126:21] ==> value-parameter interval: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.split[ValueParameterDescriptorImpl]

'split' @ [126:30] ==> public abstract fun split(splitBy: Interval, keepStart: Boolean): SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.SplittableInterval[SimpleFunctionDescriptorImpl]

'by' @ [126:36] ==> value-parameter by: Interval defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.split[ValueParameterDescriptorImpl]

'keepStart' @ [126:40] ==> value-parameter keepStart: Boolean defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.split[ValueParameterDescriptorImpl]

'if (!keepStart) {
            remapStartLabel(split.newPart.startLabel, split.patchedPart)
        }
        else {
            remapEndLabel(split.newPart.endLabel, split.patchedPart)
        }' @ [127:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [127:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'keepStart' @ [127:14] ==> value-parameter keepStart: Boolean defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.split[ValueParameterDescriptorImpl]

'remapStartLabel' @ [128:13] ==> private final fun remapStartLabel(oldStart: LabelNode, remapped: T): Unit defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[SimpleFunctionDescriptorImpl]

'split' @ [128:29] ==> val split: SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.split[LocalVariableDescriptor]

'newPart' @ [128:35] ==> public final val newPart: T defined in org.jetbrains.kotlin.codegen.inline.SplitPair[PropertyDescriptorImpl]

'startLabel' @ [128:43] ==> public abstract val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.SplittableInterval[PropertyDescriptorImpl]

'split' @ [128:55] ==> val split: SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.split[LocalVariableDescriptor]

'patchedPart' @ [128:61] ==> public final val patchedPart: T defined in org.jetbrains.kotlin.codegen.inline.SplitPair[PropertyDescriptorImpl]

'remapEndLabel' @ [131:13] ==> private final fun remapEndLabel(oldEnd: LabelNode, remapped: T): Unit defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[SimpleFunctionDescriptorImpl]

'split' @ [131:27] ==> val split: SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.split[LocalVariableDescriptor]

'newPart' @ [131:33] ==> public final val newPart: T defined in org.jetbrains.kotlin.codegen.inline.SplitPair[PropertyDescriptorImpl]

'endLabel' @ [131:41] ==> public abstract val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.SplittableInterval[PropertyDescriptorImpl]

'split' @ [131:51] ==> val split: SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.split[LocalVariableDescriptor]

'patchedPart' @ [131:57] ==> public final val patchedPart: T defined in org.jetbrains.kotlin.codegen.inline.SplitPair[PropertyDescriptorImpl]

'addNewInterval' @ [133:9] ==> public final fun addNewInterval(newInfo: T): Unit defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[SimpleFunctionDescriptorImpl]

'split' @ [133:24] ==> val split: SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.split[LocalVariableDescriptor]

'newPart' @ [133:30] ==> public final val newPart: T defined in org.jetbrains.kotlin.codegen.inline.SplitPair[PropertyDescriptorImpl]

'split' @ [134:16] ==> val split: SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.split[LocalVariableDescriptor]

'split' @ [138:25] ==> public final fun split(interval: T, by: Interval, keepStart: Boolean): SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[SimpleFunctionDescriptorImpl]

'interval' @ [138:31] ==> value-parameter interval: T defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.splitAndRemoveInterval[ValueParameterDescriptorImpl]

'by' @ [138:41] ==> value-parameter by: Interval defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.splitAndRemoveInterval[ValueParameterDescriptorImpl]

'keepStart' @ [138:45] ==> value-parameter keepStart: Boolean defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.splitAndRemoveInterval[ValueParameterDescriptorImpl]

'currentIntervals' @ [139:23] ==> public final val currentIntervals: MutableSet<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'remove' @ [139:40] ==> public abstract fun remove(element: T): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'splitPair' @ [139:47] ==> val splitPair: SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.splitAndRemoveInterval[LocalVariableDescriptor]

'patchedPart' @ [139:57] ==> public final val patchedPart: T defined in org.jetbrains.kotlin.codegen.inline.SplitPair[PropertyDescriptorImpl]

'assert' @ [140:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'removed' @ [140:16] ==> val removed: Boolean defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.splitAndRemoveInterval[LocalVariableDescriptor]

'splitPair' @ [140:55] ==> val splitPair: SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.splitAndRemoveInterval[LocalVariableDescriptor]

'splitPair' @ [141:16] ==> val splitPair: SplitPair<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.splitAndRemoveInterval[LocalVariableDescriptor]

'if (isOpen) intervalStarts.get(curIns) else intervalEnds.get(curIns)' @ [145:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (MutableList<(T..T?)>..List<(T..T?)>?), elseBranch: (MutableList<(T..T?)>..List<(T..T?)>?)): (MutableList<(T..T?)>..List<(T..T?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.MutableList<(T..T?)>..kotlin.collections.List<(T..T?)>?)

'isOpen' @ [145:17] ==> value-parameter isOpen: Boolean defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.getInterval[ValueParameterDescriptorImpl]

'intervalStarts' @ [145:25] ==> public final val intervalStarts: (LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>..LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'get' @ [145:40] ==> public open fun get(@Nullable p0: LabelNode?): (MutableList<(T..T?)>..List<(T..T?)>?) defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]

'curIns' @ [145:44] ==> value-parameter curIns: LabelNode defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.getInterval[ValueParameterDescriptorImpl]

'intervalEnds' @ [145:57] ==> public final val intervalEnds: (LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>..LinkedListMultimap<(LabelNode..LabelNode?), (T..T?)>?) defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'get' @ [145:70] ==> public open fun get(@Nullable p0: LabelNode?): (MutableList<(T..T?)>..List<(T..T?)>?) defined in com.google.common.collect.LinkedListMultimap[JavaMethodDescriptor]

'curIns' @ [145:74] ==> value-parameter curIns: LabelNode defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo.getInterval[ValueParameterDescriptorImpl]

'SimpleInterval' @ [148:41] ==> public constructor SimpleInterval(startLabel: LabelNode, endLabel: LabelNode) defined in org.jetbrains.kotlin.codegen.inline.SimpleInterval[ClassConstructorDescriptorImpl]

'start' @ [148:56] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'end' @ [148:63] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'isMeaningless' @ [148:68] ==> public fun Interval.isMeaningless(): Boolean defined in org.jetbrains.kotlin.codegen.inline in file CoveringTryCatchNodeProcessor.kt[SimpleFunctionDescriptorImpl]

'this' @ [151:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.isMeaningless[ReceiverParameterDescriptorImpl]

'startLabel' @ [151:22] ==> public abstract val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'this' @ [152:33] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.isMeaningless[ReceiverParameterDescriptorImpl]

'endLabel' @ [152:38] ==> public abstract val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'end' @ [153:12] ==> var end: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.isMeaningless[LocalVariableDescriptor]

'start' @ [153:19] ==> val start: LabelNode defined in org.jetbrains.kotlin.codegen.inline.isMeaningless[LocalVariableDescriptor]

'!' @ [153:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'end' @ [153:29] ==> var end: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.isMeaningless[LocalVariableDescriptor]

'isMeaningful' @ [153:33] ==> public val AbstractInsnNode.isMeaningful: Boolean defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[PropertyDescriptorImpl]

'end' @ [154:9] ==> var end: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.isMeaningless[LocalVariableDescriptor]

'end' @ [154:15] ==> var end: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.isMeaningless[LocalVariableDescriptor]

'previous' @ [154:19] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'start' @ [156:12] ==> val start: LabelNode defined in org.jetbrains.kotlin.codegen.inline.isMeaningless[LocalVariableDescriptor]

'end' @ [156:21] ==> var end: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.isMeaningless[LocalVariableDescriptor]

'allIntervals' @ [160:12] ==> public final val allIntervals: ArrayList<T> defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[PropertyDescriptorImpl]

'filterNot' @ [160:25] ==> public inline fun <T> Iterable<T>.filterNot(predicate: (T) -> Boolean): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'it' @ [160:37] ==> value-parameter it: T defined in org.jetbrains.kotlin.codegen.inline.getMeaningfulIntervals.<anonymous>[ValueParameterDescriptorImpl]

'isMeaningless' @ [160:40] ==> public fun Interval.isMeaningless(): Boolean defined in org.jetbrains.kotlin.codegen.inline in file CoveringTryCatchNodeProcessor.kt[SimpleFunctionDescriptorImpl]

'CoveringTryCatchNodeProcessor' @ [163:68] ==> public constructor CoveringTryCatchNodeProcessor(parameterSize: Int) defined in org.jetbrains.kotlin.codegen.inline.CoveringTryCatchNodeProcessor[ClassConstructorDescriptorImpl]

'parameterSize' @ [163:98] ==> value-parameter parameterSize: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultProcessor.<init>[ValueParameterDescriptorImpl]

'node' @ [165:9] ==> public final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.DefaultProcessor[PropertyDescriptorImpl]

'tryCatchBlocks' @ [165:14] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'forEach' @ [165:29] ==> @HidesMembers public inline fun <T> Iterable<(TryCatchBlockNode..TryCatchBlockNode?)>.forEach(action: ((TryCatchBlockNode..TryCatchBlockNode?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode..org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode?)

'tryBlocksMetaInfo' @ [166:13] ==> public final val tryBlocksMetaInfo: IntervalMetaInfo<TryCatchBlockNodeInfo> defined in org.jetbrains.kotlin.codegen.inline.DefaultProcessor[PropertyDescriptorImpl]

'addNewInterval' @ [166:31] ==> public final fun addNewInterval(newInfo: TryCatchBlockNodeInfo): Unit defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[SimpleFunctionDescriptorImpl]

'TryCatchBlockNodeInfo' @ [166:46] ==> public constructor TryCatchBlockNodeInfo(node: TryCatchBlockNode, onlyCopyNotProcess: Boolean) defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[ClassConstructorDescriptorImpl]

'it' @ [166:68] ==> value-parameter it: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.inline.DefaultProcessor.<init>.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [168:9] ==> public final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.DefaultProcessor[PropertyDescriptorImpl]

'localVariables' @ [168:14] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'forEach' @ [168:29] ==> @HidesMembers public inline fun <T> Iterable<(LocalVariableNode..LocalVariableNode?)>.forEach(action: ((LocalVariableNode..LocalVariableNode?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.LocalVariableNode..org.jetbrains.org.objectweb.asm.tree.LocalVariableNode?)

'localVarsMetaInfo' @ [169:13] ==> public final val localVarsMetaInfo: IntervalMetaInfo<LocalVarNodeWrapper> defined in org.jetbrains.kotlin.codegen.inline.DefaultProcessor[PropertyDescriptorImpl]

'addNewInterval' @ [169:31] ==> public final fun addNewInterval(newInfo: LocalVarNodeWrapper): Unit defined in org.jetbrains.kotlin.codegen.inline.IntervalMetaInfo[SimpleFunctionDescriptorImpl]

'LocalVarNodeWrapper' @ [169:46] ==> public constructor LocalVarNodeWrapper(node: LocalVariableNode) defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[ClassConstructorDescriptorImpl]

'it' @ [169:66] ==> value-parameter it: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.inline.DefaultProcessor.<init>.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [173:66] ==> public final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.DefaultProcessor[PropertyDescriptorImpl]

'instructions' @ [173:71] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [173:84] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'inst' @ [173:92] ==> value-parameter inst: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.DefaultProcessor.instructionIndex[ValueParameterDescriptorImpl]

'node' @ [178:17] ==> public final val node: LocalVariableNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[PropertyDescriptorImpl]

'start' @ [178:22] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'node' @ [180:17] ==> public final val node: LocalVariableNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[PropertyDescriptorImpl]

'end' @ [180:22] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'if (keepStart) {
            val oldEnd = endLabel
            node.end = splitBy.startLabel
            Pair(splitBy.endLabel, oldEnd)
        }
        else {
            val oldStart = startLabel
            node.start = splitBy.endLabel
            Pair(oldStart, splitBy.startLabel)
        }' @ [183:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<LabelNode, LabelNode>, elseBranch: Pair<LabelNode, LabelNode>): Pair<LabelNode, LabelNode>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<LabelNode, LabelNode>

'keepStart' @ [183:35] ==> value-parameter keepStart: Boolean defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper.split[ValueParameterDescriptorImpl]

'endLabel' @ [184:26] ==> public open val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[PropertyDescriptorImpl]

'node' @ [185:13] ==> public final val node: LocalVariableNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[PropertyDescriptorImpl]

'end' @ [185:18] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'splitBy' @ [185:24] ==> value-parameter splitBy: Interval defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper.split[ValueParameterDescriptorImpl]

'startLabel' @ [185:32] ==> public abstract val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'Pair' @ [186:13] ==> public constructor Pair<out A, out B>(first: LabelNode, second: LabelNode) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> LabelNode
    <out B> -> LabelNode

'splitBy' @ [186:18] ==> value-parameter splitBy: Interval defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper.split[ValueParameterDescriptorImpl]

'endLabel' @ [186:26] ==> public abstract val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'oldEnd' @ [186:36] ==> val oldEnd: LabelNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper.split[LocalVariableDescriptor]

'startLabel' @ [189:28] ==> public open val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[PropertyDescriptorImpl]

'node' @ [190:13] ==> public final val node: LocalVariableNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[PropertyDescriptorImpl]

'start' @ [190:18] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'splitBy' @ [190:26] ==> value-parameter splitBy: Interval defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper.split[ValueParameterDescriptorImpl]

'endLabel' @ [190:34] ==> public abstract val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'Pair' @ [191:13] ==> public constructor Pair<out A, out B>(first: LabelNode, second: LabelNode) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> LabelNode
    <out B> -> LabelNode

'oldStart' @ [191:18] ==> val oldStart: LabelNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper.split[LocalVariableDescriptor]

'splitBy' @ [191:28] ==> value-parameter splitBy: Interval defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper.split[ValueParameterDescriptorImpl]

'startLabel' @ [191:36] ==> public abstract val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'SplitPair' @ [194:16] ==> public constructor SplitPair<out T : Interval>(patchedPart: LocalVarNodeWrapper, newPart: LocalVarNodeWrapper) defined in org.jetbrains.kotlin.codegen.inline.SplitPair[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Interval> -> LocalVarNodeWrapper

'this' @ [194:26] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[LazyClassReceiverParameterDescriptor]

'LocalVarNodeWrapper' @ [194:32] ==> public constructor LocalVarNodeWrapper(node: LocalVariableNode) defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[ClassConstructorDescriptorImpl]

'LocalVariableNode' @ [195:17] ==> public constructor LocalVariableNode(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: (LabelNode..LabelNode?), p4: (LabelNode..LabelNode?), p5: Int) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaClassConstructorDescriptor]

'node' @ [195:35] ==> public final val node: LocalVariableNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[PropertyDescriptorImpl]

'name' @ [195:40] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'node' @ [195:46] ==> public final val node: LocalVariableNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[PropertyDescriptorImpl]

'desc' @ [195:51] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'node' @ [195:57] ==> public final val node: LocalVariableNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[PropertyDescriptorImpl]

'signature' @ [195:62] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'newPartInterval' @ [195:73] ==> val newPartInterval: Pair<LabelNode, LabelNode> defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper.split[LocalVariableDescriptor]

'first' @ [195:89] ==> public final val first: LabelNode defined in kotlin.Pair[DeserializedPropertyDescriptor]

'newPartInterval' @ [195:96] ==> val newPartInterval: Pair<LabelNode, LabelNode> defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper.split[LocalVariableDescriptor]

'second' @ [195:112] ==> public final val second: LabelNode defined in kotlin.Pair[DeserializedPropertyDescriptor]

'node' @ [195:120] ==> public final val node: LocalVariableNode defined in org.jetbrains.kotlin.codegen.inline.LocalVarNodeWrapper[PropertyDescriptorImpl]

'index' @ [195:125] ==> public final var index: Int defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

