'MethodTransformer' @ [28:46] ==> public constructor MethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaClassConstructorDescriptor]

'transformWithResult' @ [30:9] ==> public final fun transformWithResult(internalClassName: String, methodNode: MethodNode): DeadCodeEliminationMethodTransformer.Result defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer[SimpleFunctionDescriptorImpl]

'internalClassName' @ [30:29] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.transform[ValueParameterDescriptorImpl]

'methodNode' @ [30:48] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.transform[ValueParameterDescriptorImpl]

'analyze' @ [34:22] ==> @NotNull public open fun <V : (Value..Value?)> analyze(@NotNull internalClassName: String, @NotNull node: MethodNode, @NotNull interpreter: Interpreter<(BasicValue..BasicValue?)>): (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaMethodDescriptor]
Inferred types:
    <V : (Value..Value?)> -> (org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)

'internalClassName' @ [34:30] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.transformWithResult[ValueParameterDescriptorImpl]

'methodNode' @ [34:49] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.transformWithResult[ValueParameterDescriptorImpl]

'OptimizationBasicInterpreter' @ [34:61] ==> public constructor OptimizationBasicInterpreter() defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaClassConstructorDescriptor]

'removeDeadCodeByFrames' @ [35:16] ==> public final fun removeDeadCodeByFrames(methodNode: MethodNode, frames: Array<out Any?>): DeadCodeEliminationMethodTransformer.Result defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [35:39] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.transformWithResult[ValueParameterDescriptorImpl]

'frames' @ [35:51] ==> val frames: (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.transformWithResult[LocalVariableDescriptor]

'ArrayList' @ [39:29] ==> public final fun <E> <init>(): ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> AbstractInsnNode

'methodNode' @ [41:21] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[ValueParameterDescriptorImpl]

'instructions' @ [41:32] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toArray' @ [41:45] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insns' @ [42:19] ==> val insns: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[LocalVariableDescriptor]

'indices' @ [42:25] ==> public val <T> Array<out (AbstractInsnNode..AbstractInsnNode?)>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'insns' @ [43:24] ==> val insns: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[LocalVariableDescriptor]

'i' @ [43:30] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[LocalVariableDescriptor]

'shouldRemove' @ [44:17] ==> private final fun shouldRemove(insn: AbstractInsnNode, index: Int, frames: Array<out Any?>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer[SimpleFunctionDescriptorImpl]

'insn' @ [44:30] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[LocalVariableDescriptor]

'i' @ [44:36] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[LocalVariableDescriptor]

'frames' @ [44:39] ==> value-parameter frames: Array<out Any?> defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[ValueParameterDescriptorImpl]

'insnsToRemove' @ [45:17] ==> val insnsToRemove: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[LocalVariableDescriptor]

'add' @ [45:31] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'insn' @ [45:35] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[LocalVariableDescriptor]

'methodNode' @ [49:9] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[ValueParameterDescriptorImpl]

'remove' @ [49:20] ==> public fun MethodNode.remove(instructions: Collection<AbstractInsnNode>): Unit defined in org.jetbrains.kotlin.codegen.inline in file MethodInlinerUtil.kt[SimpleFunctionDescriptorImpl]

'insnsToRemove' @ [49:27] ==> val insnsToRemove: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[LocalVariableDescriptor]

'methodNode' @ [52:9] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[ValueParameterDescriptorImpl]

'removeEmptyCatchBlocks' @ [52:20] ==> public fun MethodNode.removeEmptyCatchBlocks(): Unit defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'Result' @ [54:16] ==> public constructor Result(removedNodes: Set<AbstractInsnNode>) defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.Result[ClassConstructorDescriptorImpl]

'insnsToRemove' @ [54:23] ==> val insnsToRemove: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.removeDeadCodeByFrames[LocalVariableDescriptor]

'toSet' @ [54:37] ==> public fun <T> Iterable<AbstractInsnNode>.toSet(): Set<AbstractInsnNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'when (insn) {
                is LabelNode ->
                    // Do not remove label nodes because they can be referred by try/catch blocks or local variables table
                    false
                is LineNumberNode ->
                    isDeadLineNumber(insn, index, frames)
                else ->
                    frames[index] == null
            }' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'insn' @ [58:19] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.shouldRemove[ValueParameterDescriptorImpl]

'isDeadLineNumber' @ [63:21] ==> private final fun isDeadLineNumber(insn: LineNumberNode, index: Int, frames: Array<out Any?>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer[SimpleFunctionDescriptorImpl]

'insn' @ [63:38] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.shouldRemove[ValueParameterDescriptorImpl]

'index' @ [63:44] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.shouldRemove[ValueParameterDescriptorImpl]

'frames' @ [63:51] ==> value-parameter frames: Array<out Any?> defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.shouldRemove[ValueParameterDescriptorImpl]

'frames' @ [65:21] ==> value-parameter frames: Array<out Any?> defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.shouldRemove[ValueParameterDescriptorImpl]

'index' @ [65:28] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.shouldRemove[ValueParameterDescriptorImpl]

'insn' @ [71:40] ==> value-parameter insn: LineNumberNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[ValueParameterDescriptorImpl]

'index' @ [72:27] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[ValueParameterDescriptorImpl]

'finger' @ [75:13] ==> var finger: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[LocalVariableDescriptor]

'finger' @ [75:22] ==> var finger: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[LocalVariableDescriptor]

'next' @ [75:29] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'fingerIndex' @ [76:13] ==> var fingerIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[LocalVariableDescriptor]

'when (finger) {
                is LabelNode ->
                    continue@loop
                is LineNumberNode ->
                    if (finger.line != insn.line) return hasDeadInsn
                else -> {
                    if (frames[fingerIndex] != null) return false
                    hasDeadInsn = true
                }
            }' @ [77:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'finger' @ [77:19] ==> var finger: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[LocalVariableDescriptor]

'finger' @ [81:25] ==> var finger: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[LocalVariableDescriptor]

'line' @ [81:32] ==> public final var line: Int defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'insn' @ [81:40] ==> value-parameter insn: LineNumberNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[ValueParameterDescriptorImpl]

'line' @ [81:45] ==> public final var line: Int defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'hasDeadInsn' @ [81:58] ==> var hasDeadInsn: Boolean defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[LocalVariableDescriptor]

'frames' @ [83:25] ==> value-parameter frames: Array<out Any?> defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[ValueParameterDescriptorImpl]

'fingerIndex' @ [83:32] ==> var fingerIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[LocalVariableDescriptor]

'hasDeadInsn' @ [84:21] ==> var hasDeadInsn: Boolean defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.isDeadLineNumber[LocalVariableDescriptor]

'removedNodes' @ [92:36] ==> private final val removedNodes: Set<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.Result[PropertyDescriptorImpl]

'isNotEmpty' @ [92:49] ==> @InlineOnly public inline fun <T> Collection<AbstractInsnNode>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'removedNodes' @ [93:49] ==> private final val removedNodes: Set<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.Result[PropertyDescriptorImpl]

'contains' @ [93:62] ==> public abstract fun contains(element: AbstractInsnNode): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'node' @ [93:71] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.Result.isRemoved[ValueParameterDescriptorImpl]

'!' @ [94:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isRemoved' @ [94:48] ==> public final fun isRemoved(node: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.Result[SimpleFunctionDescriptorImpl]

'node' @ [94:58] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.Result.isAlive[ValueParameterDescriptorImpl]

