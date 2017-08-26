'linkedSetOf' @ [32:34] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<JumpInsnNode> /* = LinkedHashSet<JumpInsnNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JumpInsnNode

'arrayListOf' @ [33:37] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'arrayListOf' @ [34:38] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'insertTryCatchBlocksMarkers' @ [37:43] ==> internal fun insertTryCatchBlocksMarkers(methodNode: MethodNode): Map<AbstractInsnNode, AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]

'methodNode' @ [37:71] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'hashMapOf' @ [38:44] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<AbstractInsnNode, MutableList<AbstractInsnNode>> /* = HashMap<AbstractInsnNode, MutableList<AbstractInsnNode>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> MutableList<AbstractInsnNode>

'hashMapOf' @ [40:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<AbstractInsnNode, AbstractInsnNode> /* = HashMap<AbstractInsnNode, AbstractInsnNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> AbstractInsnNode

'isThereAnyTryCatch' @ [44:9] ==> public final val isThereAnyTryCatch: Boolean defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'saveStackMarkerForRestoreMarker' @ [44:30] ==> public final val saveStackMarkerForRestoreMarker: Map<AbstractInsnNode, AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'isNotEmpty' @ [44:62] ==> @InlineOnly public inline fun <K, V> Map<out AbstractInsnNode, AbstractInsnNode>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> AbstractInsnNode

'component1' @ [45:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractInsnNode, AbstractInsnNode>.component1(): AbstractInsnNode defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> AbstractInsnNode

'component2' @ [45:24] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractInsnNode, AbstractInsnNode>.component2(): AbstractInsnNode defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> AbstractInsnNode

'saveStackMarkerForRestoreMarker' @ [45:33] ==> public final val saveStackMarkerForRestoreMarker: Map<AbstractInsnNode, AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'restoreStackMarkersForSaveMarker' @ [46:13] ==> public final val restoreStackMarkersForSaveMarker: HashMap<AbstractInsnNode, MutableList<AbstractInsnNode>> /* = HashMap<AbstractInsnNode, MutableList<AbstractInsnNode>> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'getOrPut' @ [46:46] ==> public inline fun <K, V> MutableMap<AbstractInsnNode, MutableList<AbstractInsnNode>>.getOrPut(key: AbstractInsnNode, defaultValue: () -> MutableList<AbstractInsnNode>): MutableList<AbstractInsnNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> MutableList<AbstractInsnNode>

'save' @ [46:55] ==> val save: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>[LocalVariableDescriptor]

'SmartList' @ [46:63] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AbstractInsnNode

'add' @ [46:77] ==> public abstract fun add(element: AbstractInsnNode): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'restore' @ [46:81] ==> val restore: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>[LocalVariableDescriptor]

'Stack' @ [49:34] ==> public constructor Stack<T : (Any..Any?)>() defined in com.intellij.util.containers.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AbstractInsnNode

'InsnSequence' @ [51:9] ==> public constructor InsnSequence(insnList: InsnList) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'methodNode' @ [51:22] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'instructions' @ [51:33] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'forEach' @ [51:47] ==> public inline fun <T> Sequence<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'parsePseudoInsnOrNull' @ [52:30] ==> public fun parsePseudoInsnOrNull(insn: AbstractInsnNode): PseudoInsn? defined in org.jetbrains.kotlin.codegen.pseudoInsns in file PseudoInsns.kt[SimpleFunctionDescriptorImpl]

'insnNode' @ [52:52] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[ValueParameterDescriptorImpl]

'when {
                pseudoInsn == PseudoInsn.FIX_STACK_BEFORE_JUMP ->
                    visitFixStackBeforeJump(insnNode)
                pseudoInsn == PseudoInsn.FAKE_ALWAYS_TRUE_IFEQ ->
                    visitFakeAlwaysTrueIfeq(insnNode)
                pseudoInsn == PseudoInsn.FAKE_ALWAYS_FALSE_IFEQ ->
                    visitFakeAlwaysFalseIfeq(insnNode)
                isBeforeInlineMarker(insnNode) -> {
                    inlineMarkersStack.push(insnNode)
                }
                isAfterInlineMarker(insnNode) -> {
                    assert(inlineMarkersStack.isNotEmpty()) { "Mismatching after inline method marker at ${indexOf(insnNode)}" }
                    openingInlineMethodMarker[insnNode] = inlineMarkersStack.pop()
                }
            }' @ [53:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'pseudoInsn' @ [54:17] ==> val pseudoInsn: PseudoInsn? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[LocalVariableDescriptor]

'FIX_STACK_BEFORE_JUMP' @ [54:42] ==> enum entry FIX_STACK_BEFORE_JUMP defined in org.jetbrains.kotlin.codegen.pseudoInsns.PseudoInsn[FakeCallableDescriptorForObject]

'visitFixStackBeforeJump' @ [55:21] ==> private final fun visitFixStackBeforeJump(insnNode: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[SimpleFunctionDescriptorImpl]

'insnNode' @ [55:45] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[ValueParameterDescriptorImpl]

'pseudoInsn' @ [56:17] ==> val pseudoInsn: PseudoInsn? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[LocalVariableDescriptor]

'FAKE_ALWAYS_TRUE_IFEQ' @ [56:42] ==> enum entry FAKE_ALWAYS_TRUE_IFEQ defined in org.jetbrains.kotlin.codegen.pseudoInsns.PseudoInsn[FakeCallableDescriptorForObject]

'visitFakeAlwaysTrueIfeq' @ [57:21] ==> private final fun visitFakeAlwaysTrueIfeq(insnNode: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[SimpleFunctionDescriptorImpl]

'insnNode' @ [57:45] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[ValueParameterDescriptorImpl]

'pseudoInsn' @ [58:17] ==> val pseudoInsn: PseudoInsn? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[LocalVariableDescriptor]

'FAKE_ALWAYS_FALSE_IFEQ' @ [58:42] ==> enum entry FAKE_ALWAYS_FALSE_IFEQ defined in org.jetbrains.kotlin.codegen.pseudoInsns.PseudoInsn[FakeCallableDescriptorForObject]

'visitFakeAlwaysFalseIfeq' @ [59:21] ==> private final fun visitFakeAlwaysFalseIfeq(insnNode: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[SimpleFunctionDescriptorImpl]

'insnNode' @ [59:46] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[ValueParameterDescriptorImpl]

'isBeforeInlineMarker' @ [60:17] ==> internal fun isBeforeInlineMarker(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'insnNode' @ [60:38] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[ValueParameterDescriptorImpl]

'inlineMarkersStack' @ [61:21] ==> val inlineMarkersStack: Stack<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>[LocalVariableDescriptor]

'push' @ [61:40] ==> public open fun push(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'insnNode' @ [61:45] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[ValueParameterDescriptorImpl]

'isAfterInlineMarker' @ [63:17] ==> internal fun isAfterInlineMarker(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'insnNode' @ [63:37] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [64:21] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'inlineMarkersStack' @ [64:28] ==> val inlineMarkersStack: Stack<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>[LocalVariableDescriptor]

'isNotEmpty' @ [64:47] ==> @InlineOnly public inline fun <T> Collection<(AbstractInsnNode..AbstractInsnNode?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'indexOf' @ [64:108] ==> private final fun indexOf(node: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[SimpleFunctionDescriptorImpl]

'insnNode' @ [64:116] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[ValueParameterDescriptorImpl]

'openingInlineMethodMarker' @ [65:21] ==> public final val openingInlineMethodMarker: HashMap<AbstractInsnNode, AbstractInsnNode> /* = HashMap<AbstractInsnNode, AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'insnNode' @ [65:47] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>.<anonymous>[ValueParameterDescriptorImpl]

'inlineMarkersStack' @ [65:59] ==> val inlineMarkersStack: Stack<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>[LocalVariableDescriptor]

'pop' @ [65:78] ==> public open fun pop(): (AbstractInsnNode..AbstractInsnNode?) defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'inlineMarkersStack' @ [70:13] ==> val inlineMarkersStack: Stack<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.<init>[LocalVariableDescriptor]

'isNotEmpty' @ [70:32] ==> @InlineOnly public inline fun <T> Collection<(AbstractInsnNode..AbstractInsnNode?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'consistentInlineMarkers' @ [71:13] ==> public final var consistentInlineMarkers: Boolean defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'insnNode' @ [76:20] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.visitFixStackBeforeJump[ValueParameterDescriptorImpl]

'next' @ [76:29] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'assert' @ [77:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'next' @ [77:16] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.visitFixStackBeforeJump[LocalVariableDescriptor]

'opcode' @ [77:21] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'GOTO' @ [77:39] ==> public const final val GOTO: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'indexOf' @ [77:50] ==> private final fun indexOf(node: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[SimpleFunctionDescriptorImpl]

'insnNode' @ [77:58] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.visitFixStackBeforeJump[ValueParameterDescriptorImpl]

'breakContinueGotoNodes' @ [78:9] ==> public final val breakContinueGotoNodes: LinkedHashSet<JumpInsnNode> /* = LinkedHashSet<JumpInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'add' @ [78:32] ==> public open fun add(element: JumpInsnNode): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'next' @ [78:36] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.visitFixStackBeforeJump[LocalVariableDescriptor]

'assert' @ [82:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'insnNode' @ [82:16] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.visitFakeAlwaysTrueIfeq[ValueParameterDescriptorImpl]

'next' @ [82:25] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'opcode' @ [82:30] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFEQ' @ [82:48] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'indexOf' @ [82:59] ==> private final fun indexOf(node: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[SimpleFunctionDescriptorImpl]

'insnNode' @ [82:67] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.visitFakeAlwaysTrueIfeq[ValueParameterDescriptorImpl]

'fakeAlwaysTrueIfeqMarkers' @ [83:9] ==> public final val fakeAlwaysTrueIfeqMarkers: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'add' @ [83:35] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'insnNode' @ [83:39] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.visitFakeAlwaysTrueIfeq[ValueParameterDescriptorImpl]

'assert' @ [87:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'insnNode' @ [87:16] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.visitFakeAlwaysFalseIfeq[ValueParameterDescriptorImpl]

'next' @ [87:25] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'opcode' @ [87:30] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFEQ' @ [87:48] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'indexOf' @ [87:59] ==> private final fun indexOf(node: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[SimpleFunctionDescriptorImpl]

'insnNode' @ [87:67] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.visitFakeAlwaysFalseIfeq[ValueParameterDescriptorImpl]

'fakeAlwaysFalseIfeqMarkers' @ [88:9] ==> public final val fakeAlwaysFalseIfeqMarkers: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'add' @ [88:36] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'insnNode' @ [88:40] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.visitFakeAlwaysFalseIfeq[ValueParameterDescriptorImpl]

'methodNode' @ [91:51] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'instructions' @ [91:62] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [91:75] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'node' @ [91:83] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext.indexOf[ValueParameterDescriptorImpl]

'breakContinueGotoNodes' @ [94:13] ==> public final val breakContinueGotoNodes: LinkedHashSet<JumpInsnNode> /* = LinkedHashSet<JumpInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'isNotEmpty' @ [94:36] ==> @InlineOnly public inline fun <T> Collection<JumpInsnNode>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JumpInsnNode

'fakeAlwaysTrueIfeqMarkers' @ [95:13] ==> public final val fakeAlwaysTrueIfeqMarkers: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'isNotEmpty' @ [95:39] ==> @InlineOnly public inline fun <T> Collection<AbstractInsnNode>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'fakeAlwaysFalseIfeqMarkers' @ [96:13] ==> public final val fakeAlwaysFalseIfeqMarkers: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'isNotEmpty' @ [96:40] ==> @InlineOnly public inline fun <T> Collection<AbstractInsnNode>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'isThereAnyTryCatch' @ [97:13] ==> public final val isThereAnyTryCatch: Boolean defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'openingInlineMethodMarker' @ [98:13] ==> public final val openingInlineMethodMarker: HashMap<AbstractInsnNode, AbstractInsnNode> /* = HashMap<AbstractInsnNode, AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'isNotEmpty' @ [98:39] ==> @InlineOnly public inline fun <K, V> Map<out AbstractInsnNode, AbstractInsnNode>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> AbstractInsnNode

'breakContinueGotoNodes' @ [101:13] ==> public final val breakContinueGotoNodes: LinkedHashSet<JumpInsnNode> /* = LinkedHashSet<JumpInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'isNotEmpty' @ [101:36] ==> @InlineOnly public inline fun <T> Collection<JumpInsnNode>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JumpInsnNode

'isThereAnyTryCatch' @ [102:13] ==> public final val isThereAnyTryCatch: Boolean defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'openingInlineMethodMarker' @ [103:13] ==> public final val openingInlineMethodMarker: HashMap<AbstractInsnNode, AbstractInsnNode> /* = HashMap<AbstractInsnNode, AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'isNotEmpty' @ [103:39] ==> @InlineOnly public inline fun <K, V> Map<out AbstractInsnNode, AbstractInsnNode>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> AbstractInsnNode

