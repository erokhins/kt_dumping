'MethodTransformer' @ [27:40] ==> public constructor MethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaClassConstructorDescriptor]

'methodNode' @ [32:21] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[ValueParameterDescriptorImpl]

'instructions' @ [32:32] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toArray' @ [32:45] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'apply' @ [32:55] ==> @InlineOnly public inline fun <T> (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?).apply(block: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?).() -> Unit): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Array<(org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)>..kotlin.Array<out (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)>?)

'reverse' @ [32:63] ==> public fun <T> Array<(AbstractInsnNode..AbstractInsnNode?)>.reverse(): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'arrayListOf' @ [33:29] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'hashSetOf' @ [35:29] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LabelNode

'insns' @ [36:22] ==> val insns: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'when {
                insn is LabelNode ->
                    currentLabels.add(insn)
                insn.opcode == Opcodes.GOTO &&
                (insn as JumpInsnNode).label in currentLabels ->
                    insnsToRemove.add(insn)
                insn.isMeaningful ->
                    currentLabels.clear()
            }' @ [37:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'insn' @ [38:17] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'currentLabels' @ [39:21] ==> val currentLabels: HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'add' @ [39:35] ==> public open fun add(element: LabelNode): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'insn' @ [39:39] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'insn' @ [40:17] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'opcode' @ [40:22] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'GOTO' @ [40:40] ==> public const final val GOTO: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'in' @ [41:17] ==> public open fun contains(element: LabelNode): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'insn' @ [41:18] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'label' @ [41:40] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'currentLabels' @ [41:49] ==> val currentLabels: HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'insnsToRemove' @ [42:21] ==> val insnsToRemove: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'add' @ [42:35] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'insn' @ [42:39] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'insn' @ [43:17] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'isMeaningful' @ [43:22] ==> public val AbstractInsnNode.isMeaningful: Boolean defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[PropertyDescriptorImpl]

'currentLabels' @ [44:21] ==> val currentLabels: HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'clear' @ [44:35] ==> public open fun clear(): Unit defined in java.util.HashSet[JavaMethodDescriptor]

'insnsToRemove' @ [48:30] ==> val insnsToRemove: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

'methodNode' @ [49:13] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[ValueParameterDescriptorImpl]

'instructions' @ [49:24] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [49:37] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insnToRemove' @ [49:44] ==> val insnToRemove: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer.transform[LocalVariableDescriptor]

