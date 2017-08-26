'MethodTransformer' @ [24:45] ==> public constructor MethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaClassConstructorDescriptor]

'TransformerForMethod' @ [26:9] ==> public constructor TransformerForMethod(methodNode: MethodNode) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[ClassConstructorDescriptorImpl]

'methodNode' @ [26:30] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.transform[ValueParameterDescriptorImpl]

'transform' @ [26:42] ==> public final fun transform(): Unit defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'methodNode' @ [30:28] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'instructions' @ [30:39] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'hashMapOf' @ [31:29] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<Label, LabelNode> /* = HashMap<Label, LabelNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Label
    <V> -> LabelNode

'rewriteLabelInstructions' @ [34:17] ==> private final fun rewriteLabelInstructions(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'rewriteNonLabelInstructions' @ [35:17] ==> private final fun rewriteNonLabelInstructions(): Unit defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'rewriteTryCatchBlocks' @ [36:17] ==> private final fun rewriteTryCatchBlocks(): Unit defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'rewriteLocalVars' @ [37:17] ==> private final fun rewriteLocalVars(): Unit defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'methodNode' @ [38:17] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'removeEmptyCatchBlocks' @ [38:28] ==> public fun MethodNode.removeEmptyCatchBlocks(): Unit defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'instructions' @ [44:28] ==> public final val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'first' @ [44:41] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'thisNode' @ [45:20] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'if (thisNode is LabelNode) {
                    val prevNode = thisNode.previous
                    if (prevNode is LabelNode) {
                        newLabelNodes[thisNode.label] = prevNode
                        removedAnyLabels = true
                        thisNode = instructions.removeNodeGetNext(thisNode)
                    }
                    else {
                        newLabelNodes[thisNode.label] = thisNode
                        thisNode = thisNode.next
                    }
                }
                else {
                    thisNode = thisNode.next
                }' @ [46:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'thisNode' @ [46:21] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'thisNode' @ [47:36] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'previous' @ [47:45] ==> public final val LabelNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'if (prevNode is LabelNode) {
                        newLabelNodes[thisNode.label] = prevNode
                        removedAnyLabels = true
                        thisNode = instructions.removeNodeGetNext(thisNode)
                    }
                    else {
                        newLabelNodes[thisNode.label] = thisNode
                        thisNode = thisNode.next
                    }' @ [48:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'prevNode' @ [48:25] ==> val prevNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'newLabelNodes' @ [49:25] ==> public final val newLabelNodes: HashMap<Label, LabelNode> /* = HashMap<Label, LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'thisNode' @ [49:39] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'label' @ [49:48] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'prevNode' @ [49:57] ==> val prevNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'removedAnyLabels' @ [50:25] ==> var removedAnyLabels: Boolean defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'thisNode' @ [51:25] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'instructions' @ [51:36] ==> public final val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'removeNodeGetNext' @ [51:49] ==> public fun InsnList.removeNodeGetNext(oldNode: AbstractInsnNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization in file LabelNormalizationMethodTransformer.kt[SimpleFunctionDescriptorImpl]

'thisNode' @ [51:67] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'newLabelNodes' @ [54:25] ==> public final val newLabelNodes: HashMap<Label, LabelNode> /* = HashMap<Label, LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'thisNode' @ [54:39] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'label' @ [54:48] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'thisNode' @ [54:57] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'thisNode' @ [55:25] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'thisNode' @ [55:36] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'next' @ [55:45] ==> public final val LabelNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'thisNode' @ [59:21] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'thisNode' @ [59:32] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'next' @ [59:41] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'removedAnyLabels' @ [62:20] ==> var removedAnyLabels: Boolean defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabelInstructions[LocalVariableDescriptor]

'instructions' @ [66:28] ==> public final val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'first' @ [66:41] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'thisNode' @ [67:20] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteNonLabelInstructions[LocalVariableDescriptor]

'thisNode' @ [68:17] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteNonLabelInstructions[LocalVariableDescriptor]

'when (thisNode) {
                    is JumpInsnNode ->
                        rewriteJumpInsn(thisNode)
                    is LineNumberNode ->
                        rewriteLineNumberNode(thisNode)
                    is LookupSwitchInsnNode ->
                        rewriteLookupSwitchInsn(thisNode)
                    is TableSwitchInsnNode ->
                        rewriteTableSwitchInsn(thisNode)
                    is FrameNode ->
                        rewriteFrameNode(thisNode)
                    else ->
                        thisNode.next
                }' @ [68:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (AbstractInsnNode..AbstractInsnNode?), entry1: (AbstractInsnNode..AbstractInsnNode?), entry2: (AbstractInsnNode..AbstractInsnNode?), entry3: (AbstractInsnNode..AbstractInsnNode?), entry4: (AbstractInsnNode..AbstractInsnNode?), entry5: (AbstractInsnNode..AbstractInsnNode?)): (AbstractInsnNode..AbstractInsnNode?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'thisNode' @ [68:34] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteNonLabelInstructions[LocalVariableDescriptor]

'rewriteJumpInsn' @ [70:25] ==> private final fun rewriteJumpInsn(oldJumpNode: JumpInsnNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'thisNode' @ [70:41] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteNonLabelInstructions[LocalVariableDescriptor]

'rewriteLineNumberNode' @ [72:25] ==> private final fun rewriteLineNumberNode(oldLineNode: LineNumberNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'thisNode' @ [72:47] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteNonLabelInstructions[LocalVariableDescriptor]

'rewriteLookupSwitchInsn' @ [74:25] ==> private final fun rewriteLookupSwitchInsn(oldSwitchNode: LookupSwitchInsnNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'thisNode' @ [74:49] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteNonLabelInstructions[LocalVariableDescriptor]

'rewriteTableSwitchInsn' @ [76:25] ==> private final fun rewriteTableSwitchInsn(oldSwitchNode: TableSwitchInsnNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'thisNode' @ [76:48] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteNonLabelInstructions[LocalVariableDescriptor]

'rewriteFrameNode' @ [78:25] ==> private final fun rewriteFrameNode(oldFrameNode: FrameNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'thisNode' @ [78:42] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteNonLabelInstructions[LocalVariableDescriptor]

'thisNode' @ [80:25] ==> var thisNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteNonLabelInstructions[LocalVariableDescriptor]

'next' @ [80:34] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'instructions' @ [86:17] ==> public final val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'replaceNodeGetNext' @ [86:30] ==> public fun InsnList.replaceNodeGetNext(oldNode: AbstractInsnNode, newNode: AbstractInsnNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization in file LabelNormalizationMethodTransformer.kt[SimpleFunctionDescriptorImpl]

'oldLineNode' @ [86:49] ==> value-parameter oldLineNode: LineNumberNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLineNumberNode[ValueParameterDescriptorImpl]

'oldLineNode' @ [86:62] ==> value-parameter oldLineNode: LineNumberNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLineNumberNode[ValueParameterDescriptorImpl]

'rewriteLabels' @ [86:74] ==> private final fun LineNumberNode.rewriteLabels(): AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'instructions' @ [89:17] ==> public final val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'replaceNodeGetNext' @ [89:30] ==> public fun InsnList.replaceNodeGetNext(oldNode: AbstractInsnNode, newNode: AbstractInsnNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization in file LabelNormalizationMethodTransformer.kt[SimpleFunctionDescriptorImpl]

'oldJumpNode' @ [89:49] ==> value-parameter oldJumpNode: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteJumpInsn[ValueParameterDescriptorImpl]

'oldJumpNode' @ [89:62] ==> value-parameter oldJumpNode: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteJumpInsn[ValueParameterDescriptorImpl]

'rewriteLabels' @ [89:74] ==> private final fun JumpInsnNode.rewriteLabels(): AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'instructions' @ [92:17] ==> public final val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'replaceNodeGetNext' @ [92:30] ==> public fun InsnList.replaceNodeGetNext(oldNode: AbstractInsnNode, newNode: AbstractInsnNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization in file LabelNormalizationMethodTransformer.kt[SimpleFunctionDescriptorImpl]

'oldSwitchNode' @ [92:49] ==> value-parameter oldSwitchNode: LookupSwitchInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLookupSwitchInsn[ValueParameterDescriptorImpl]

'oldSwitchNode' @ [92:64] ==> value-parameter oldSwitchNode: LookupSwitchInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLookupSwitchInsn[ValueParameterDescriptorImpl]

'rewriteLabels' @ [92:78] ==> private final fun LookupSwitchInsnNode.rewriteLabels(): AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'instructions' @ [95:17] ==> public final val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'replaceNodeGetNext' @ [95:30] ==> public fun InsnList.replaceNodeGetNext(oldNode: AbstractInsnNode, newNode: AbstractInsnNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization in file LabelNormalizationMethodTransformer.kt[SimpleFunctionDescriptorImpl]

'oldSwitchNode' @ [95:49] ==> value-parameter oldSwitchNode: TableSwitchInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteTableSwitchInsn[ValueParameterDescriptorImpl]

'oldSwitchNode' @ [95:64] ==> value-parameter oldSwitchNode: TableSwitchInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteTableSwitchInsn[ValueParameterDescriptorImpl]

'rewriteLabels' @ [95:78] ==> private final fun TableSwitchInsnNode.rewriteLabels(): AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'instructions' @ [98:17] ==> public final val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'replaceNodeGetNext' @ [98:30] ==> public fun InsnList.replaceNodeGetNext(oldNode: AbstractInsnNode, newNode: AbstractInsnNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization in file LabelNormalizationMethodTransformer.kt[SimpleFunctionDescriptorImpl]

'oldFrameNode' @ [98:49] ==> value-parameter oldFrameNode: FrameNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteFrameNode[ValueParameterDescriptorImpl]

'oldFrameNode' @ [98:63] ==> value-parameter oldFrameNode: FrameNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteFrameNode[ValueParameterDescriptorImpl]

'rewriteLabels' @ [98:76] ==> private final fun FrameNode.rewriteLabels(): AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'methodNode' @ [101:13] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'tryCatchBlocks' @ [101:24] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'methodNode' @ [101:41] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'tryCatchBlocks' @ [101:52] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'map' @ [101:67] ==> public inline fun <T, R> Iterable<(TryCatchBlockNode..TryCatchBlockNode?)>.map(transform: ((TryCatchBlockNode..TryCatchBlockNode?)) -> TryCatchBlockNode): List<TryCatchBlockNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode..org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode?)
    <R> -> TryCatchBlockNode

'TryCatchBlockNode' @ [102:30] ==> public constructor TryCatchBlockNode(p0: (LabelNode..LabelNode?), p1: (LabelNode..LabelNode?), p2: (LabelNode..LabelNode?), p3: (String..String?)) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaClassConstructorDescriptor]

'getNew' @ [102:48] ==> private final fun getNew(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'oldTcb' @ [102:55] ==> value-parameter oldTcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'start' @ [102:62] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'getNew' @ [102:70] ==> private final fun getNew(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'oldTcb' @ [102:77] ==> value-parameter oldTcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'end' @ [102:84] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'getNew' @ [102:90] ==> private final fun getNew(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'oldTcb' @ [102:97] ==> value-parameter oldTcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'handler' @ [102:104] ==> public final var handler: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'oldTcb' @ [102:114] ==> value-parameter oldTcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [102:121] ==> public final var type: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'newTcb' @ [103:17] ==> val newTcb: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteTryCatchBlocks.<anonymous>[LocalVariableDescriptor]

'visibleTypeAnnotations' @ [103:24] ==> public final var visibleTypeAnnotations: (MutableList<(TypeAnnotationNode..TypeAnnotationNode?)>..List<(TypeAnnotationNode..TypeAnnotationNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'oldTcb' @ [103:49] ==> value-parameter oldTcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'visibleTypeAnnotations' @ [103:56] ==> public final var visibleTypeAnnotations: (MutableList<(TypeAnnotationNode..TypeAnnotationNode?)>..List<(TypeAnnotationNode..TypeAnnotationNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'newTcb' @ [104:17] ==> val newTcb: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteTryCatchBlocks.<anonymous>[LocalVariableDescriptor]

'invisibleTypeAnnotations' @ [104:24] ==> public final var invisibleTypeAnnotations: (MutableList<(TypeAnnotationNode..TypeAnnotationNode?)>..List<(TypeAnnotationNode..TypeAnnotationNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'oldTcb' @ [104:51] ==> value-parameter oldTcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'invisibleTypeAnnotations' @ [104:58] ==> public final var invisibleTypeAnnotations: (MutableList<(TypeAnnotationNode..TypeAnnotationNode?)>..List<(TypeAnnotationNode..TypeAnnotationNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'newTcb' @ [105:17] ==> val newTcb: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteTryCatchBlocks.<anonymous>[LocalVariableDescriptor]

'methodNode' @ [110:13] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'localVariables' @ [110:24] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'methodNode' @ [110:41] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'localVariables' @ [110:52] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'map' @ [110:67] ==> public inline fun <T, R> Iterable<(LocalVariableNode..LocalVariableNode?)>.map(transform: ((LocalVariableNode..LocalVariableNode?)) -> LocalVariableNode): List<LocalVariableNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.LocalVariableNode..org.jetbrains.org.objectweb.asm.tree.LocalVariableNode?)
    <R> -> LocalVariableNode

'LocalVariableNode' @ [111:17] ==> public constructor LocalVariableNode(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: (LabelNode..LabelNode?), p4: (LabelNode..LabelNode?), p5: Int) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaClassConstructorDescriptor]

'oldVar' @ [112:25] ==> value-parameter oldVar: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLocalVars.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [112:32] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'oldVar' @ [113:25] ==> value-parameter oldVar: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLocalVars.<anonymous>[ValueParameterDescriptorImpl]

'desc' @ [113:32] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'oldVar' @ [114:25] ==> value-parameter oldVar: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLocalVars.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [114:32] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'getNew' @ [115:25] ==> private final fun getNew(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'oldVar' @ [115:32] ==> value-parameter oldVar: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLocalVars.<anonymous>[ValueParameterDescriptorImpl]

'start' @ [115:39] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'getNew' @ [116:25] ==> private final fun getNew(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'oldVar' @ [116:32] ==> value-parameter oldVar: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLocalVars.<anonymous>[ValueParameterDescriptorImpl]

'end' @ [116:39] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'oldVar' @ [117:25] ==> value-parameter oldVar: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLocalVars.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [117:32] ==> public final var index: Int defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'LineNumberNode' @ [123:17] ==> public constructor LineNumberNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaClassConstructorDescriptor]

'line' @ [123:32] ==> public final var line: Int defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'getNewOrOld' @ [123:38] ==> private final fun getNewOrOld(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'start' @ [123:50] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'JumpInsnNode' @ [126:17] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'opcode' @ [126:30] ==> public final var JumpInsnNode.opcode: Int[MyPropertyDescriptor]

'getNew' @ [126:38] ==> private final fun getNew(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'label' @ [126:45] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'LookupSwitchInsnNode' @ [129:30] ==> public constructor LookupSwitchInsnNode(p0: (LabelNode..LabelNode?), p1: (IntArray..IntArray?), p2: (Array<(LabelNode..LabelNode?)>..Array<out (LabelNode..LabelNode?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.LookupSwitchInsnNode[JavaClassConstructorDescriptor]

'getNew' @ [129:51] ==> private final fun getNew(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'dflt' @ [129:58] ==> public final var dflt: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LookupSwitchInsnNode[JavaPropertyDescriptor]

'keys' @ [129:65] ==> public final var keys: (MutableList<(Int..Int?)>..List<(Int..Int?)>?) defined in org.jetbrains.org.objectweb.asm.tree.LookupSwitchInsnNode[JavaPropertyDescriptor]

'toIntArray' @ [129:70] ==> public fun Collection<Int>.toIntArray(): IntArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'emptyArray' @ [129:84] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<(LabelNode..LabelNode?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (org.jetbrains.org.objectweb.asm.tree.LabelNode..org.jetbrains.org.objectweb.asm.tree.LabelNode?)

'switchNode' @ [130:13] ==> val switchNode: LookupSwitchInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels[LocalVariableDescriptor]

'labels' @ [130:24] ==> public final var labels: (MutableList<(LabelNode..LabelNode?)>..List<(LabelNode..LabelNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.LookupSwitchInsnNode[JavaPropertyDescriptor]

'labels' @ [130:33] ==> public final var labels: (MutableList<(LabelNode..LabelNode?)>..List<(LabelNode..LabelNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.LookupSwitchInsnNode[JavaPropertyDescriptor]

'map' @ [130:40] ==> public inline fun <T, R> Iterable<(LabelNode..LabelNode?)>.map(transform: ((LabelNode..LabelNode?)) -> LabelNode): List<LabelNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.LabelNode..org.jetbrains.org.objectweb.asm.tree.LabelNode?)
    <R> -> LabelNode

'getNew' @ [130:46] ==> private final fun getNew(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'it' @ [130:53] ==> value-parameter it: (LabelNode..LabelNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels.<anonymous>[ValueParameterDescriptorImpl]

'switchNode' @ [131:20] ==> val switchNode: LookupSwitchInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels[LocalVariableDescriptor]

'TableSwitchInsnNode' @ [135:30] ==> public constructor TableSwitchInsnNode(p0: Int, p1: Int, p2: (LabelNode..LabelNode?), vararg p3: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.TableSwitchInsnNode[JavaClassConstructorDescriptor]

'min' @ [135:50] ==> public final var min: Int defined in org.jetbrains.org.objectweb.asm.tree.TableSwitchInsnNode[JavaPropertyDescriptor]

'max' @ [135:55] ==> public final var max: Int defined in org.jetbrains.org.objectweb.asm.tree.TableSwitchInsnNode[JavaPropertyDescriptor]

'getNew' @ [135:60] ==> private final fun getNew(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'dflt' @ [135:67] ==> public final var dflt: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TableSwitchInsnNode[JavaPropertyDescriptor]

'switchNode' @ [136:13] ==> val switchNode: TableSwitchInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels[LocalVariableDescriptor]

'labels' @ [136:24] ==> public final var labels: (MutableList<(LabelNode..LabelNode?)>..List<(LabelNode..LabelNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.TableSwitchInsnNode[JavaPropertyDescriptor]

'labels' @ [136:33] ==> public final var labels: (MutableList<(LabelNode..LabelNode?)>..List<(LabelNode..LabelNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.TableSwitchInsnNode[JavaPropertyDescriptor]

'map' @ [136:40] ==> public inline fun <T, R> Iterable<(LabelNode..LabelNode?)>.map(transform: ((LabelNode..LabelNode?)) -> LabelNode): List<LabelNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.LabelNode..org.jetbrains.org.objectweb.asm.tree.LabelNode?)
    <R> -> LabelNode

'getNew' @ [136:46] ==> private final fun getNew(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'it' @ [136:53] ==> value-parameter it: (LabelNode..LabelNode?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels.<anonymous>[ValueParameterDescriptorImpl]

'switchNode' @ [137:20] ==> val switchNode: TableSwitchInsnNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels[LocalVariableDescriptor]

'FrameNode' @ [141:29] ==> public constructor FrameNode(p0: Int, p1: Int, p2: (Array<(Any..Any?)>..Array<out (Any..Any?)>?), p3: Int, p4: (Array<(Any..Any?)>..Array<out (Any..Any?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.FrameNode[JavaClassConstructorDescriptor]

'type' @ [141:39] ==> public final var type: Int defined in org.jetbrains.org.objectweb.asm.tree.FrameNode[JavaPropertyDescriptor]

'emptyArray' @ [141:48] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<(Any..Any?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (kotlin.Any..kotlin.Any?)

'emptyArray' @ [141:65] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<(Any..Any?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (kotlin.Any..kotlin.Any?)

'frameNode' @ [142:13] ==> val frameNode: FrameNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels[LocalVariableDescriptor]

'local' @ [142:23] ==> public final var local: (MutableList<(Any..Any?)>..List<(Any..Any?)>?) defined in org.jetbrains.org.objectweb.asm.tree.FrameNode[JavaPropertyDescriptor]

'local' @ [142:31] ==> public final var local: (MutableList<(Any..Any?)>..List<(Any..Any?)>?) defined in org.jetbrains.org.objectweb.asm.tree.FrameNode[JavaPropertyDescriptor]

'map' @ [142:37] ==> public inline fun <T, R> Iterable<(Any..Any?)>.map(transform: ((Any..Any?)) -> (Any..Any?)): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)
    <R> -> (kotlin.Any..kotlin.Any?)

'if (it is LabelNode) getNewOrOld(it) else it' @ [142:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'it' @ [142:47] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels.<anonymous>[ValueParameterDescriptorImpl]

'getNewOrOld' @ [142:64] ==> private final fun getNewOrOld(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'it' @ [142:76] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [142:85] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels.<anonymous>[ValueParameterDescriptorImpl]

'frameNode' @ [143:13] ==> val frameNode: FrameNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels[LocalVariableDescriptor]

'stack' @ [143:23] ==> public final var stack: (MutableList<(Any..Any?)>..List<(Any..Any?)>?) defined in org.jetbrains.org.objectweb.asm.tree.FrameNode[JavaPropertyDescriptor]

'stack' @ [143:31] ==> public final var stack: (MutableList<(Any..Any?)>..List<(Any..Any?)>?) defined in org.jetbrains.org.objectweb.asm.tree.FrameNode[JavaPropertyDescriptor]

'map' @ [143:37] ==> public inline fun <T, R> Iterable<(Any..Any?)>.map(transform: ((Any..Any?)) -> (Any..Any?)): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)
    <R> -> (kotlin.Any..kotlin.Any?)

'if (it is LabelNode) getNewOrOld(it) else it' @ [143:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'it' @ [143:47] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels.<anonymous>[ValueParameterDescriptorImpl]

'getNewOrOld' @ [143:64] ==> private final fun getNewOrOld(oldLabelNode: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[SimpleFunctionDescriptorImpl]

'it' @ [143:76] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [143:85] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels.<anonymous>[ValueParameterDescriptorImpl]

'frameNode' @ [144:20] ==> val frameNode: FrameNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.rewriteLabels[LocalVariableDescriptor]

'newLabelNodes' @ [148:17] ==> public final val newLabelNodes: HashMap<Label, LabelNode> /* = HashMap<Label, LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'oldLabelNode' @ [148:31] ==> value-parameter oldLabelNode: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.getNew[ValueParameterDescriptorImpl]

'label' @ [148:44] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'newLabelNodes' @ [151:17] ==> public final val newLabelNodes: HashMap<Label, LabelNode> /* = HashMap<Label, LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod[PropertyDescriptorImpl]

'oldLabelNode' @ [151:31] ==> value-parameter oldLabelNode: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.getNewOrOld[ValueParameterDescriptorImpl]

'label' @ [151:44] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'oldLabelNode' @ [151:54] ==> value-parameter oldLabelNode: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer.TransformerForMethod.getNewOrOld[ValueParameterDescriptorImpl]

'insertBefore' @ [156:5] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'oldNode' @ [156:18] ==> value-parameter oldNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.replaceNodeGetNext[ValueParameterDescriptorImpl]

'newNode' @ [156:27] ==> value-parameter newNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.replaceNodeGetNext[ValueParameterDescriptorImpl]

'remove' @ [157:5] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'oldNode' @ [157:12] ==> value-parameter oldNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.replaceNodeGetNext[ValueParameterDescriptorImpl]

'newNode' @ [158:12] ==> value-parameter newNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.replaceNodeGetNext[ValueParameterDescriptorImpl]

'next' @ [158:20] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'oldNode' @ [162:16] ==> value-parameter oldNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.removeNodeGetNext[ValueParameterDescriptorImpl]

'next' @ [162:24] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'remove' @ [163:5] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'oldNode' @ [163:12] ==> value-parameter oldNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.removeNodeGetNext[ValueParameterDescriptorImpl]

'next' @ [164:12] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.removeNodeGetNext[LocalVariableDescriptor]

