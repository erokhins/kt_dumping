'hashSetOf' @ [34:30] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LabelNode

'start' @ [38:9] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'handler' @ [38:18] ==> public final var handler: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'instructions' @ [41:16] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [41:29] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'tcb' @ [41:37] ==> value-parameter tcb: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.debugString[ValueParameterDescriptorImpl]

'start' @ [41:41] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'instructions' @ [41:52] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [41:65] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'tcb' @ [41:73] ==> value-parameter tcb: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.debugString[ValueParameterDescriptorImpl]

'end' @ [41:77] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'instructions' @ [41:86] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [41:99] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'tcb' @ [41:107] ==> value-parameter tcb: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.debugString[ValueParameterDescriptorImpl]

'handler' @ [41:111] ==> public final var handler: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'methodNode' @ [44:9] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertTryCatchBlocksMarkers[ValueParameterDescriptorImpl]

'tryCatchBlocks' @ [44:20] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'isEmpty' @ [44:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'emptyMap' @ [44:53] ==> public fun <K, V> emptyMap(): Map<AbstractInsnNode, AbstractInsnNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> AbstractInsnNode

'collectDecompiledTryDescriptors' @ [46:43] ==> private fun collectDecompiledTryDescriptors(methodNode: MethodNode): Map<LabelNode, DecompiledTryDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file AnalyzeTryCatchBlocks.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [46:75] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertTryCatchBlocksMarkers[ValueParameterDescriptorImpl]

'hashMapOf' @ [48:29] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<LabelNode, LabelNode> /* = HashMap<LabelNode, LabelNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LabelNode
    <V> -> LabelNode

'insertSaveRestoreStackMarkers' @ [49:41] ==> private fun insertSaveRestoreStackMarkers(decompiledTryDescriptorForStart: Map<LabelNode, DecompiledTryDescriptor>, methodNode: MethodNode, newTryStartLabels: MutableMap<LabelNode, LabelNode>): Map<AbstractInsnNode, AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file AnalyzeTryCatchBlocks.kt[SimpleFunctionDescriptorImpl]

'decompiledTryDescriptorForStart' @ [49:71] ==> val decompiledTryDescriptorForStart: Map<LabelNode, DecompiledTryDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertTryCatchBlocksMarkers[LocalVariableDescriptor]

'methodNode' @ [49:104] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertTryCatchBlocksMarkers[ValueParameterDescriptorImpl]

'newTryStartLabels' @ [49:116] ==> val newTryStartLabels: HashMap<LabelNode, LabelNode> /* = HashMap<LabelNode, LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertTryCatchBlocksMarkers[LocalVariableDescriptor]

'transformTryCatchBlocks' @ [51:5] ==> private fun transformTryCatchBlocks(methodNode: MethodNode, newTryStartLabels: HashMap<LabelNode, LabelNode>): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file AnalyzeTryCatchBlocks.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [51:29] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertTryCatchBlocksMarkers[ValueParameterDescriptorImpl]

'newTryStartLabels' @ [51:41] ==> val newTryStartLabels: HashMap<LabelNode, LabelNode> /* = HashMap<LabelNode, LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertTryCatchBlocksMarkers[LocalVariableDescriptor]

'restoreStackToSaveStackMarker' @ [53:12] ==> val restoreStackToSaveStackMarker: Map<AbstractInsnNode, AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertTryCatchBlocksMarkers[LocalVariableDescriptor]

'methodNode' @ [57:5] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.transformTryCatchBlocks[ValueParameterDescriptorImpl]

'tryCatchBlocks' @ [57:16] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'methodNode' @ [57:33] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.transformTryCatchBlocks[ValueParameterDescriptorImpl]

'tryCatchBlocks' @ [57:44] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'map' @ [57:59] ==> public inline fun <T, R> Iterable<(TryCatchBlockNode..TryCatchBlockNode?)>.map(transform: ((TryCatchBlockNode..TryCatchBlockNode?)) -> (TryCatchBlockNode..TryCatchBlockNode?)): List<(TryCatchBlockNode..TryCatchBlockNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode..org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode?)
    <R> -> (org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode..org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode?)

'newTryStartLabels' @ [58:32] ==> value-parameter newTryStartLabels: HashMap<LabelNode, LabelNode> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.transformTryCatchBlocks[ValueParameterDescriptorImpl]

'tcb' @ [58:50] ==> value-parameter tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.transformTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'start' @ [58:54] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'if (newTryStartLabel == null)
            tcb
        else
            TryCatchBlockNode(newTryStartLabel, tcb.end, tcb.handler, tcb.type)' @ [59:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (TryCatchBlockNode..TryCatchBlockNode?), elseBranch: (TryCatchBlockNode..TryCatchBlockNode?)): (TryCatchBlockNode..TryCatchBlockNode?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode..org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode?)

'newTryStartLabel' @ [59:13] ==> val newTryStartLabel: LabelNode? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.transformTryCatchBlocks.<anonymous>[LocalVariableDescriptor]

'tcb' @ [60:13] ==> value-parameter tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.transformTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'TryCatchBlockNode' @ [62:13] ==> public constructor TryCatchBlockNode(p0: (LabelNode..LabelNode?), p1: (LabelNode..LabelNode?), p2: (LabelNode..LabelNode?), p3: (String..String?)) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaClassConstructorDescriptor]

'newTryStartLabel' @ [62:31] ==> val newTryStartLabel: LabelNode? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.transformTryCatchBlocks.<anonymous>[LocalVariableDescriptor]

'tcb' @ [62:49] ==> value-parameter tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.transformTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'end' @ [62:53] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'tcb' @ [62:58] ==> value-parameter tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.transformTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'handler' @ [62:62] ==> public final var handler: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'tcb' @ [62:71] ==> value-parameter tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.transformTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [62:75] ==> public final var type: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'hashMapOf' @ [71:36] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<AbstractInsnNode, AbstractInsnNode> /* = HashMap<AbstractInsnNode, AbstractInsnNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> AbstractInsnNode

'hashMapOf' @ [72:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<LabelNode, AbstractInsnNode> /* = HashMap<LabelNode, AbstractInsnNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LabelNode
    <V> -> AbstractInsnNode

'hashSetOf' @ [73:29] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LabelNode

'decompiledTryDescriptorForStart' @ [75:37] ==> value-parameter decompiledTryDescriptorForStart: Map<LabelNode, DecompiledTryDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'values' @ [75:69] ==> public abstract val values: Collection<DecompiledTryDescriptor> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'with' @ [76:9] ==> @InlineOnly public inline fun <T, R> with(receiver: DecompiledTryDescriptor, block: DecompiledTryDescriptor.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DecompiledTryDescriptor
    <R> -> Unit

'decompiledTryDescriptor' @ [76:14] ==> val decompiledTryDescriptor: DecompiledTryDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[LocalVariableDescriptor]

'if (tryStartLabel !in saveStackMarkerByTryLabel) {
                val nopNode = tryStartLabel.findNextOrNull { it.hasOpcode() }!!
                assert(nopNode.opcode == Opcodes.NOP) { "${methodNode.instructions.indexOf(nopNode)}: try block should start with NOP" }

                val newTryStartLabel = LabelNode(Label())
                newTryStartLabels[tryStartLabel] = newTryStartLabel

                saveStackMarker = PseudoInsn.SAVE_STACK_BEFORE_TRY.createInsnNode()
                val restoreStackMarker = PseudoInsn.RESTORE_STACK_IN_TRY_CATCH.createInsnNode()

                saveStackMarkerByTryLabel[tryStartLabel] = saveStackMarker
                restoreStackToSaveMarker[restoreStackMarker] = saveStackMarker

                methodNode.instructions.insertBefore(nopNode, saveStackMarker)
                methodNode.instructions.insertBefore(nopNode, newTryStartLabel)
                methodNode.instructions.insert(nopNode, restoreStackMarker)
            }
            else {
                saveStackMarker = saveStackMarkerByTryLabel[tryStartLabel]!!
            }' @ [79:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'tryStartLabel' @ [79:17] ==> public final val tryStartLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.DecompiledTryDescriptor[PropertyDescriptorImpl]

'saveStackMarkerByTryLabel' @ [79:35] ==> val saveStackMarkerByTryLabel: HashMap<LabelNode, AbstractInsnNode> /* = HashMap<LabelNode, AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[LocalVariableDescriptor]

'tryStartLabel' @ [80:31] ==> public final val tryStartLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.DecompiledTryDescriptor[PropertyDescriptorImpl]

'findNextOrNull' @ [80:45] ==> public inline fun AbstractInsnNode.findNextOrNull(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [80:62] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasOpcode' @ [80:65] ==> public fun AbstractInsnNode.hasOpcode(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'assert' @ [81:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'nopNode' @ [81:24] ==> val nopNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'opcode' @ [81:32] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NOP' @ [81:50] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'methodNode' @ [81:60] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'instructions' @ [81:71] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [81:84] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'nopNode' @ [81:92] ==> val nopNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'LabelNode' @ [83:40] ==> public constructor LabelNode(p0: (Label..Label?)) defined in org.jetbrains.org.objectweb.asm.tree.LabelNode[JavaClassConstructorDescriptor]

'Label' @ [83:50] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'newTryStartLabels' @ [84:17] ==> value-parameter newTryStartLabels: MutableMap<LabelNode, LabelNode> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'tryStartLabel' @ [84:35] ==> public final val tryStartLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.DecompiledTryDescriptor[PropertyDescriptorImpl]

'newTryStartLabel' @ [84:52] ==> val newTryStartLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'saveStackMarker' @ [86:17] ==> val saveStackMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'createInsnNode' @ [86:68] ==> public final fun createInsnNode(): MethodInsnNode defined in org.jetbrains.kotlin.codegen.pseudoInsns.PseudoInsn[SimpleFunctionDescriptorImpl]

'createInsnNode' @ [87:80] ==> public final fun createInsnNode(): MethodInsnNode defined in org.jetbrains.kotlin.codegen.pseudoInsns.PseudoInsn[SimpleFunctionDescriptorImpl]

'saveStackMarkerByTryLabel' @ [89:17] ==> val saveStackMarkerByTryLabel: HashMap<LabelNode, AbstractInsnNode> /* = HashMap<LabelNode, AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[LocalVariableDescriptor]

'tryStartLabel' @ [89:43] ==> public final val tryStartLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.DecompiledTryDescriptor[PropertyDescriptorImpl]

'saveStackMarker' @ [89:60] ==> val saveStackMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'restoreStackToSaveMarker' @ [90:17] ==> val restoreStackToSaveMarker: HashMap<AbstractInsnNode, AbstractInsnNode> /* = HashMap<AbstractInsnNode, AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[LocalVariableDescriptor]

'restoreStackMarker' @ [90:42] ==> val restoreStackMarker: MethodInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'saveStackMarker' @ [90:64] ==> val saveStackMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'methodNode' @ [92:17] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'instructions' @ [92:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [92:41] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'nopNode' @ [92:54] ==> val nopNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'saveStackMarker' @ [92:63] ==> val saveStackMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'methodNode' @ [93:17] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'instructions' @ [93:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [93:41] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'nopNode' @ [93:54] ==> val nopNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'newTryStartLabel' @ [93:63] ==> val newTryStartLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'methodNode' @ [94:17] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'instructions' @ [94:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insert' @ [94:41] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'nopNode' @ [94:48] ==> val nopNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'restoreStackMarker' @ [94:57] ==> val restoreStackMarker: MethodInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'saveStackMarker' @ [97:17] ==> val saveStackMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'saveStackMarkerByTryLabel' @ [97:35] ==> val saveStackMarkerByTryLabel: HashMap<LabelNode, AbstractInsnNode> /* = HashMap<LabelNode, AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[LocalVariableDescriptor]

'tryStartLabel' @ [97:61] ==> public final val tryStartLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.DecompiledTryDescriptor[PropertyDescriptorImpl]

'handlerStartLabels' @ [100:39] ==> public final val handlerStartLabels: HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.DecompiledTryDescriptor[PropertyDescriptorImpl]

'!' @ [101:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'doneHandlerLabels' @ [101:22] ==> val doneHandlerLabels: HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[LocalVariableDescriptor]

'contains' @ [101:40] ==> public open fun contains(element: LabelNode): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'handlerStartLabel' @ [101:49] ==> val handlerStartLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'doneHandlerLabels' @ [102:21] ==> val doneHandlerLabels: HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[LocalVariableDescriptor]

'add' @ [102:39] ==> public open fun add(element: LabelNode): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'handlerStartLabel' @ [102:43] ==> val handlerStartLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'handlerStartLabel' @ [104:37] ==> val handlerStartLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'findNextOrNull' @ [104:55] ==> public inline fun AbstractInsnNode.findNextOrNull(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [104:72] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasOpcode' @ [104:75] ==> public fun AbstractInsnNode.hasOpcode(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'assert' @ [105:21] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'storeNode' @ [105:28] ==> val storeNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'opcode' @ [105:38] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ASTORE' @ [105:56] ==> public const final val ASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'methodNode' @ [105:69] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'instructions' @ [105:80] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [105:93] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'storeNode' @ [105:101] ==> val storeNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'createInsnNode' @ [107:84] ==> public final fun createInsnNode(): MethodInsnNode defined in org.jetbrains.kotlin.codegen.pseudoInsns.PseudoInsn[SimpleFunctionDescriptorImpl]

'restoreStackToSaveMarker' @ [108:21] ==> val restoreStackToSaveMarker: HashMap<AbstractInsnNode, AbstractInsnNode> /* = HashMap<AbstractInsnNode, AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[LocalVariableDescriptor]

'restoreStackMarker' @ [108:46] ==> val restoreStackMarker: MethodInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'saveStackMarker' @ [108:68] ==> val saveStackMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'methodNode' @ [109:21] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'instructions' @ [109:32] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insert' @ [109:45] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'storeNode' @ [109:52] ==> val storeNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'restoreStackMarker' @ [109:63] ==> val restoreStackMarker: MethodInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'restoreStackToSaveMarker' @ [115:12] ==> val restoreStackToSaveMarker: HashMap<AbstractInsnNode, AbstractInsnNode> /* = HashMap<AbstractInsnNode, AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.insertSaveRestoreStackMarkers[LocalVariableDescriptor]

'hashMapOf' @ [119:91] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<LabelNode, DecompiledTryDescriptor> /* = HashMap<LabelNode, DecompiledTryDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LabelNode
    <V> -> DecompiledTryDescriptor

'hashMapOf' @ [120:93] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<LabelNode, DecompiledTryDescriptor> /* = HashMap<LabelNode, DecompiledTryDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LabelNode
    <V> -> DecompiledTryDescriptor

'methodNode' @ [122:27] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[ValueParameterDescriptorImpl]

'tryCatchBlocks' @ [122:38] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'mapNotNullTo' @ [122:53] ==> public inline fun <T, R : Any, C : MutableCollection<in LabelNode>> Iterable<(TryCatchBlockNode..TryCatchBlockNode?)>.mapNotNullTo(destination: SmartSet<(LabelNode..LabelNode?)>, transform: ((TryCatchBlockNode..TryCatchBlockNode?)) -> LabelNode?): SmartSet<(LabelNode..LabelNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode..org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode?)
    <R : Any> -> LabelNode
    <C : MutableCollection<in R>> -> SmartSet<(org.jetbrains.org.objectweb.asm.tree.LabelNode..org.jetbrains.org.objectweb.asm.tree.LabelNode?)>

'create' @ [122:75] ==> @JvmStatic public final fun <T> create(): SmartSet<(LabelNode..LabelNode?)> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.LabelNode..org.jetbrains.org.objectweb.asm.tree.LabelNode?)

'if (it.isDefaultHandlerNode()) it.handler else null' @ [123:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LabelNode?, elseBranch: LabelNode?): LabelNode?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LabelNode?

'it' @ [123:13] ==> value-parameter it: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'isDefaultHandlerNode' @ [123:16] ==> private fun TryCatchBlockNode.isDefaultHandlerNode(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file AnalyzeTryCatchBlocks.kt[SimpleFunctionDescriptorImpl]

'it' @ [123:40] ==> value-parameter it: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'handler' @ [123:43] ==> public final var handler: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'methodNode' @ [126:17] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[ValueParameterDescriptorImpl]

'tryCatchBlocks' @ [126:28] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'tcb' @ [127:13] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'isDefaultHandlerNode' @ [127:17] ==> private fun TryCatchBlockNode.isDefaultHandlerNode(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file AnalyzeTryCatchBlocks.kt[SimpleFunctionDescriptorImpl]

'assert' @ [128:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'decompiledTryDescriptorForHandler' @ [128:20] ==> val decompiledTryDescriptorForHandler: MutableMap<LabelNode, DecompiledTryDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'containsKey' @ [128:54] ==> public abstract fun containsKey(key: LabelNode): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'tcb' @ [128:66] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'start' @ [128:70] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'methodNode' @ [128:83] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[ValueParameterDescriptorImpl]

'debugString' @ [128:94] ==> private fun MethodNode.debugString(tcb: TryCatchBlockNode): String defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file AnalyzeTryCatchBlocks.kt[SimpleFunctionDescriptorImpl]

'tcb' @ [128:106] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'decompiledTryDescriptorForHandler' @ [131:39] ==> val decompiledTryDescriptorForHandler: MutableMap<LabelNode, DecompiledTryDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'getOrPut' @ [131:73] ==> public inline fun <K, V> MutableMap<LabelNode, DecompiledTryDescriptor>.getOrPut(key: LabelNode, defaultValue: () -> DecompiledTryDescriptor): DecompiledTryDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LabelNode
    <V> -> DecompiledTryDescriptor

'tcb' @ [131:82] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'handler' @ [131:86] ==> public final var handler: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'decompiledTryDescriptorForStart' @ [132:13] ==> val decompiledTryDescriptorForStart: MutableMap<LabelNode, DecompiledTryDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'getOrPut' @ [132:45] ==> public inline fun <K, V> MutableMap<LabelNode, DecompiledTryDescriptor>.getOrPut(key: LabelNode, defaultValue: () -> DecompiledTryDescriptor): DecompiledTryDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LabelNode
    <V> -> DecompiledTryDescriptor

'tcb' @ [132:54] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'start' @ [132:58] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'DecompiledTryDescriptor' @ [133:17] ==> public constructor DecompiledTryDescriptor(tryStartLabel: LabelNode) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.DecompiledTryDescriptor[ClassConstructorDescriptorImpl]

'tcb' @ [133:41] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'start' @ [133:45] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'with' @ [137:9] ==> @InlineOnly public inline fun <T, R> with(receiver: DecompiledTryDescriptor, block: DecompiledTryDescriptor.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DecompiledTryDescriptor
    <R> -> Unit

'decompiledTryDescriptor' @ [137:14] ==> val decompiledTryDescriptor: DecompiledTryDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'tcb' @ [138:17] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'isDefaultHandlerNode' @ [138:21] ==> private fun TryCatchBlockNode.isDefaultHandlerNode(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file AnalyzeTryCatchBlocks.kt[SimpleFunctionDescriptorImpl]

'assert' @ [139:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'defaultHandlerTcb' @ [139:24] ==> public final var defaultHandlerTcb: TryCatchBlockNode? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.DecompiledTryDescriptor[PropertyDescriptorImpl]

'methodNode' @ [140:24] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[ValueParameterDescriptorImpl]

'debugString' @ [140:35] ==> private fun MethodNode.debugString(tcb: TryCatchBlockNode): String defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file AnalyzeTryCatchBlocks.kt[SimpleFunctionDescriptorImpl]

'tcb' @ [140:47] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'methodNode' @ [140:90] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[ValueParameterDescriptorImpl]

'debugString' @ [140:101] ==> private fun MethodNode.debugString(tcb: TryCatchBlockNode): String defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file AnalyzeTryCatchBlocks.kt[SimpleFunctionDescriptorImpl]

'defaultHandlerTcb' @ [140:113] ==> public final var defaultHandlerTcb: TryCatchBlockNode? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.DecompiledTryDescriptor[PropertyDescriptorImpl]

'defaultHandlerTcb' @ [143:17] ==> public final var defaultHandlerTcb: TryCatchBlockNode? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.DecompiledTryDescriptor[PropertyDescriptorImpl]

'tcb' @ [143:37] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'tcb' @ [146:17] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'handler' @ [146:21] ==> public final var handler: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'defaultHandlers' @ [146:33] ==> val defaultHandlers: SmartSet<(LabelNode..LabelNode?)> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'handlerStartLabels' @ [147:17] ==> public final val handlerStartLabels: HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.DecompiledTryDescriptor[PropertyDescriptorImpl]

'add' @ [147:36] ==> public open fun add(element: LabelNode): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'tcb' @ [147:40] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

'handler' @ [147:44] ==> public final var handler: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'decompiledTryDescriptorForStart' @ [152:12] ==> val decompiledTryDescriptorForStart: MutableMap<LabelNode, DecompiledTryDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.collectDecompiledTryDescriptors[LocalVariableDescriptor]

