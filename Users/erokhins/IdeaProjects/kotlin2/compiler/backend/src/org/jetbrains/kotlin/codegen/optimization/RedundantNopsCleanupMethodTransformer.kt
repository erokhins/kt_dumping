'MethodTransformer' @ [31:47] ==> public constructor MethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaClassConstructorDescriptor]

'LabelNormalizationMethodTransformer' @ [33:9] ==> public constructor LabelNormalizationMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer[ClassConstructorDescriptorImpl]

'transform' @ [33:47] ==> public open fun transform(internalClassName: String, methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.LabelNormalizationMethodTransformer[SimpleFunctionDescriptorImpl]

'internalClassName' @ [33:57] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[ValueParameterDescriptorImpl]

'methodNode' @ [33:76] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[ValueParameterDescriptorImpl]

'HashSet' @ [35:28] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AbstractInsnNode

'recordNopsRequiredForTryCatchBlocks' @ [38:9] ==> private final fun recordNopsRequiredForTryCatchBlocks(methodNode: MethodNode, requiredNops: MutableSet<AbstractInsnNode>): Unit defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [38:45] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[ValueParameterDescriptorImpl]

'requiredNops' @ [38:57] ==> val requiredNops: HashSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'recordNopsRequiredForDebugger' @ [41:9] ==> private final fun recordNopsRequiredForDebugger(methodNode: MethodNode, requiredNops: MutableSet<AbstractInsnNode>): Unit defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [41:39] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[ValueParameterDescriptorImpl]

'requiredNops' @ [41:51] ==> val requiredNops: HashSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'methodNode' @ [43:42] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[ValueParameterDescriptorImpl]

'instructions' @ [43:53] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'first' @ [43:66] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'current' @ [44:16] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'if (current.opcode == Opcodes.NOP && !requiredNops.contains(current)) {
                val toRemove = current
                current = current.next
                methodNode.instructions.remove(toRemove)
            }
            else {
                current = current.next
            }' @ [45:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'current' @ [45:17] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'opcode' @ [45:25] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NOP' @ [45:43] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'!' @ [45:50] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'requiredNops' @ [45:51] ==> val requiredNops: HashSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'contains' @ [45:64] ==> public open fun contains(element: AbstractInsnNode): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'current' @ [45:73] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'current' @ [46:32] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'current' @ [47:17] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'current' @ [47:27] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'next' @ [47:35] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'methodNode' @ [48:17] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[ValueParameterDescriptorImpl]

'instructions' @ [48:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [48:41] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'toRemove' @ [48:48] ==> val toRemove: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'current' @ [51:17] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'current' @ [51:27] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.transform[LocalVariableDescriptor]

'next' @ [51:35] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'methodNode' @ [68:22] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[ValueParameterDescriptorImpl]

'instructions' @ [68:33] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insn' @ [69:17] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'insn' @ [70:38] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'findNextOrNull' @ [70:43] ==> public inline fun AbstractInsnNode.findNextOrNull(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [70:60] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [70:84] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger.<anonymous>[ValueParameterDescriptorImpl]

'line' @ [70:87] ==> public final var line: Int defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'insn' @ [70:95] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'line' @ [70:100] ==> public final var line: Int defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'requiredNops' @ [71:17] ==> value-parameter requiredNops: MutableSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[ValueParameterDescriptorImpl]

'addIfNotNull' @ [71:30] ==> public fun <T : Any> MutableCollection<AbstractInsnNode>.addIfNotNull(t: AbstractInsnNode?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> AbstractInsnNode

'getRequiredNopInRange' @ [71:43] ==> internal fun getRequiredNopInRange(firstInclusive: AbstractInsnNode, lastExclusive: AbstractInsnNode?): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization in file RedundantNopsCleanupMethodTransformer.kt[SimpleFunctionDescriptorImpl]

'insn' @ [71:65] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'nextLineNumber' @ [71:71] ==> val nextLineNumber: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'run' @ [75:35] ==> @InlineOnly public inline fun <T, R> RedundantNopsCleanupMethodTransformer.run(block: RedundantNopsCleanupMethodTransformer.() -> List<(AbstractInsnNode..AbstractInsnNode?)>): List<(AbstractInsnNode..AbstractInsnNode?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RedundantNopsCleanupMethodTransformer
    <R> -> List<(org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)>

'hashSetOf' @ [76:26] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LabelNode

'apply' @ [76:49] ==> @InlineOnly public inline fun <T> HashSet<LabelNode> /* = HashSet<LabelNode> */.apply(block: HashSet<LabelNode> /* = HashSet<LabelNode> */.() -> Unit): HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HashSet<LabelNode>

'methodNode' @ [77:39] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[ValueParameterDescriptorImpl]

'localVariables' @ [77:50] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'add' @ [78:21] ==> public open fun add(element: LabelNode): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'localVariable' @ [78:25] ==> val localVariable: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger.<anonymous>.<anonymous>[LocalVariableDescriptor]

'start' @ [78:39] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'add' @ [79:21] ==> public open fun add(element: LabelNode): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'localVariable' @ [79:25] ==> val localVariable: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger.<anonymous>.<anonymous>[LocalVariableDescriptor]

'end' @ [79:39] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'methodNode' @ [83:13] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[ValueParameterDescriptorImpl]

'instructions' @ [83:24] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toArray' @ [83:37] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'filter' @ [83:47] ==> public inline fun <T> Array<out (AbstractInsnNode..AbstractInsnNode?)>.filter(predicate: ((AbstractInsnNode..AbstractInsnNode?)) -> Boolean): List<(AbstractInsnNode..AbstractInsnNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'labels' @ [83:56] ==> val labels: HashSet<LabelNode> /* = HashSet<LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger.<anonymous>[LocalVariableDescriptor]

'contains' @ [83:63] ==> public operator fun <@OnlyInputTypes T> Iterable<(AbstractInsnNode..AbstractInsnNode?)>.contains(element: (AbstractInsnNode..AbstractInsnNode?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'it' @ [83:72] ==> value-parameter it: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'..' @ [87:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'localVariableLabels' @ [87:24] ==> val localVariableLabels: List<(AbstractInsnNode..AbstractInsnNode?)> defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'size' @ [87:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'localVariableLabels' @ [88:25] ==> val localVariableLabels: List<(AbstractInsnNode..AbstractInsnNode?)> defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'i' @ [88:45] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'localVariableLabels' @ [89:23] ==> val localVariableLabels: List<(AbstractInsnNode..AbstractInsnNode?)> defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'i' @ [89:43] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'InsnSequence' @ [90:17] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'begin' @ [90:30] ==> val begin: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'end' @ [90:37] ==> val end: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'any' @ [90:42] ==> public inline fun <T> Sequence<AbstractInsnNode>.any(predicate: (AbstractInsnNode) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'it' @ [90:48] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger.<anonymous>[ValueParameterDescriptorImpl]

'requiredNops' @ [90:54] ==> value-parameter requiredNops: MutableSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[ValueParameterDescriptorImpl]

'requiredNops' @ [91:13] ==> value-parameter requiredNops: MutableSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[ValueParameterDescriptorImpl]

'addIfNotNull' @ [91:26] ==> public fun <T : Any> MutableCollection<AbstractInsnNode>.addIfNotNull(t: AbstractInsnNode?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> AbstractInsnNode

'getRequiredNopInRange' @ [91:39] ==> internal fun getRequiredNopInRange(firstInclusive: AbstractInsnNode, lastExclusive: AbstractInsnNode?): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization in file RedundantNopsCleanupMethodTransformer.kt[SimpleFunctionDescriptorImpl]

'begin' @ [91:61] ==> val begin: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'end' @ [91:68] ==> val end: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForDebugger[LocalVariableDescriptor]

'methodNode' @ [96:21] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForTryCatchBlocks[ValueParameterDescriptorImpl]

'tryCatchBlocks' @ [96:32] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'tcb' @ [97:23] ==> val tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForTryCatchBlocks[LocalVariableDescriptor]

'start' @ [97:27] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'findNextOrNull' @ [97:33] ==> public inline fun AbstractInsnNode.findNextOrNull(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [97:50] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForTryCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'isMeaningful' @ [97:53] ==> public val AbstractInsnNode.isMeaningful: Boolean defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[PropertyDescriptorImpl]

'nop' @ [98:17] ==> val nop: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForTryCatchBlocks[LocalVariableDescriptor]

'opcode' @ [98:22] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NOP' @ [98:40] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'requiredNops' @ [99:17] ==> value-parameter requiredNops: MutableSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForTryCatchBlocks[ValueParameterDescriptorImpl]

'add' @ [99:30] ==> public abstract fun add(element: AbstractInsnNode): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'nop' @ [99:34] ==> val nop: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer.recordNopsRequiredForTryCatchBlocks[LocalVariableDescriptor]

'firstInclusive' @ [108:38] ==> value-parameter firstInclusive: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[ValueParameterDescriptorImpl]

'current' @ [109:12] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[LocalVariableDescriptor]

'current' @ [109:31] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[LocalVariableDescriptor]

'lastExclusive' @ [109:42] ==> value-parameter lastExclusive: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[ValueParameterDescriptorImpl]

'if (current.isMeaningful && current.opcode != Opcodes.NOP) {
            return null
        }
        else if (current.opcode == Opcodes.NOP) {
            lastNop = current
        }' @ [110:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'current' @ [110:13] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[LocalVariableDescriptor]

'isMeaningful' @ [110:21] ==> public val AbstractInsnNode.isMeaningful: Boolean defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[PropertyDescriptorImpl]

'current' @ [110:37] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[LocalVariableDescriptor]

'opcode' @ [110:45] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NOP' @ [110:63] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'current' @ [113:18] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[LocalVariableDescriptor]

'opcode' @ [113:26] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NOP' @ [113:44] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'lastNop' @ [114:13] ==> var lastNop: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[LocalVariableDescriptor]

'current' @ [114:23] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[LocalVariableDescriptor]

'current' @ [116:9] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[LocalVariableDescriptor]

'current' @ [116:19] ==> var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[LocalVariableDescriptor]

'next' @ [116:27] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'lastNop' @ [119:12] ==> var lastNop: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.getRequiredNopInRange[LocalVariableDescriptor]

