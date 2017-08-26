'BitSet' @ [31:26] ==> public constructor BitSet(p0: Int) defined in java.util.BitSet[JavaClassConstructorDescriptor]

'maxLocals' @ [31:33] ==> public final val maxLocals: Int defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[PropertyDescriptorImpl]

'bitSet' @ [34:9] ==> private final val bitSet: BitSet defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[PropertyDescriptorImpl]

'or' @ [34:16] ==> public open fun or(p0: (BitSet..BitSet?)): Unit defined in java.util.BitSet[JavaMethodDescriptor]

'other' @ [34:19] ==> value-parameter other: VariableLivenessFrame defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame.mergeFrom[ValueParameterDescriptorImpl]

'bitSet' @ [34:25] ==> private final val bitSet: BitSet defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[PropertyDescriptorImpl]

'bitSet' @ [38:9] ==> private final val bitSet: BitSet defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[PropertyDescriptorImpl]

'set' @ [38:16] ==> public open operator fun set(p0: Int, p1: Boolean): Unit defined in java.util.BitSet[JavaMethodDescriptor]

'varIndex' @ [38:20] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame.markAlive[ValueParameterDescriptorImpl]

'bitSet' @ [42:9] ==> private final val bitSet: BitSet defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[PropertyDescriptorImpl]

'set' @ [42:16] ==> public open operator fun set(p0: Int, p1: Boolean): Unit defined in java.util.BitSet[JavaMethodDescriptor]

'varIndex' @ [42:20] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame.markDead[ValueParameterDescriptorImpl]

'bitSet' @ [45:43] ==> private final val bitSet: BitSet defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[PropertyDescriptorImpl]

'get' @ [45:50] ==> public open operator fun get(p0: Int): Boolean defined in java.util.BitSet[JavaMethodDescriptor]

'varIndex' @ [45:54] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame.isAlive[ValueParameterDescriptorImpl]

'other' @ [48:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame.equals[ValueParameterDescriptorImpl]

'bitSet' @ [49:16] ==> private final val bitSet: BitSet defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[PropertyDescriptorImpl]

'other' @ [49:26] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame.equals[ValueParameterDescriptorImpl]

'bitSet' @ [49:32] ==> private final val bitSet: BitSet defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[PropertyDescriptorImpl]

'bitSet' @ [52:31] ==> private final val bitSet: BitSet defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[PropertyDescriptorImpl]

'hashCode' @ [52:38] ==> public open fun hashCode(): Int defined in java.util.BitSet[JavaMethodDescriptor]

'analyze' @ [55:49] ==> @NotNull public open fun <V : (Value..Value?)> analyze(@NotNull internalClassName: String, @NotNull node: MethodNode, @NotNull interpreter: Interpreter<(BasicValue..BasicValue?)>): (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaMethodDescriptor]
Inferred types:
    <V : (Value..Value?)> -> BasicValue

'node' @ [55:65] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.analyzeLiveness[ValueParameterDescriptorImpl]

'OptimizationBasicInterpreter' @ [55:71] ==> public constructor OptimizationBasicInterpreter() defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaClassConstructorDescriptor]

'analyze' @ [56:12] ==> public fun <F : VarFrame<VariableLivenessFrame>> analyze(node: MethodNode, interpreter: BackwardAnalysisInterpreter<VariableLivenessFrame>): List<VariableLivenessFrame> defined in org.jetbrains.kotlin.codegen.optimization.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <F : VarFrame<F>> -> VariableLivenessFrame

'node' @ [56:20] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.analyzeLiveness[ValueParameterDescriptorImpl]

'VariableLivenessFrame' @ [57:49] ==> public constructor VariableLivenessFrame(maxLocals: Int) defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[ClassConstructorDescriptorImpl]

'maxLocals' @ [57:71] ==> value-parameter maxLocals: Int defined in org.jetbrains.kotlin.codegen.optimization.common.analyzeLiveness.<no name provided>.newFrame[ValueParameterDescriptorImpl]

'defVar' @ [58:82] ==> private fun defVar(frame: VariableLivenessFrame, insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.common in file variableLiveness.kt[SimpleFunctionDescriptorImpl]

'frame' @ [58:89] ==> value-parameter frame: VariableLivenessFrame defined in org.jetbrains.kotlin.codegen.optimization.common.analyzeLiveness.<no name provided>.def[ValueParameterDescriptorImpl]

'insn' @ [58:96] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.analyzeLiveness.<no name provided>.def[ValueParameterDescriptorImpl]

'useVar' @ [60:17] ==> private fun useVar(frame: VariableLivenessFrame, insn: AbstractInsnNode, node: MethodNode, typeAnnotatedFrame: Frame<BasicValue>?): Unit defined in org.jetbrains.kotlin.codegen.optimization.common[SimpleFunctionDescriptorImpl]

'frame' @ [60:24] ==> value-parameter frame: VariableLivenessFrame defined in org.jetbrains.kotlin.codegen.optimization.common.analyzeLiveness.<no name provided>.use[ValueParameterDescriptorImpl]

'insn' @ [60:31] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.analyzeLiveness.<no name provided>.use[ValueParameterDescriptorImpl]

'node' @ [60:37] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.analyzeLiveness[ValueParameterDescriptorImpl]

'typeAnnotatedFrames' @ [60:43] ==> val typeAnnotatedFrames: (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.common.analyzeLiveness[LocalVariableDescriptor]

'node' @ [60:63] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.analyzeLiveness[ValueParameterDescriptorImpl]

'instructions' @ [60:68] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [60:81] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [60:89] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.analyzeLiveness.<no name provided>.use[ValueParameterDescriptorImpl]

'insn' @ [66:9] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.defVar[ValueParameterDescriptorImpl]

'insn' @ [66:32] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.defVar[ValueParameterDescriptorImpl]

'isStoreOperation' @ [66:37] ==> public fun AbstractInsnNode.isStoreOperation(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'frame' @ [67:9] ==> value-parameter frame: VariableLivenessFrame defined in org.jetbrains.kotlin.codegen.optimization.common.defVar[ValueParameterDescriptorImpl]

'markDead' @ [67:15] ==> public final fun markDead(varIndex: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[SimpleFunctionDescriptorImpl]

'insn' @ [67:24] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.defVar[ValueParameterDescriptorImpl]

'`var`' @ [67:29] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'node' @ [78:17] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'instructions' @ [78:22] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [78:35] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [78:43] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'node' @ [79:5] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'localVariables' @ [79:10] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'filter' @ [79:25] ==> public inline fun <T> Iterable<(LocalVariableNode..LocalVariableNode?)>.filter(predicate: ((LocalVariableNode..LocalVariableNode?)) -> Boolean): List<(LocalVariableNode..LocalVariableNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.LocalVariableNode..org.jetbrains.org.objectweb.asm.tree.LocalVariableNode?)

'node' @ [80:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'instructions' @ [80:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [80:27] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'it' @ [80:35] ==> value-parameter it: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.useVar.<anonymous>[ValueParameterDescriptorImpl]

'start' @ [80:38] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'index' @ [80:47] ==> val index: Int defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[LocalVariableDescriptor]

'index' @ [80:56] ==> val index: Int defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[LocalVariableDescriptor]

'node' @ [80:64] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'instructions' @ [80:69] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [80:82] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'it' @ [80:90] ==> value-parameter it: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.useVar.<anonymous>[ValueParameterDescriptorImpl]

'end' @ [80:93] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'==' @ [81:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'getType' @ [81:18] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'it' @ [81:26] ==> value-parameter it: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.useVar.<anonymous>[ValueParameterDescriptorImpl]

'desc' @ [81:29] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'sort' @ [81:35] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'typeAnnotatedFrame' @ [81:43] ==> value-parameter typeAnnotatedFrame: Frame<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'getLocal' @ [81:63] ==> public open fun getLocal(p0: Int): (BasicValue..BasicValue?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'it' @ [81:72] ==> value-parameter it: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.useVar.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [81:75] ==> public final var index: Int defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'type' @ [81:83] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'sort' @ [81:89] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'forEach' @ [82:7] ==> @HidesMembers public inline fun <T> Iterable<(LocalVariableNode..LocalVariableNode?)>.forEach(action: ((LocalVariableNode..LocalVariableNode?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.LocalVariableNode..org.jetbrains.org.objectweb.asm.tree.LocalVariableNode?)

'frame' @ [83:9] ==> value-parameter frame: VariableLivenessFrame defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'markAlive' @ [83:15] ==> public final fun markAlive(varIndex: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[SimpleFunctionDescriptorImpl]

'it' @ [83:25] ==> value-parameter it: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.useVar.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [83:28] ==> public final var index: Int defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'if (insn is VarInsnNode && insn.isLoadOperation()) {
        frame.markAlive(insn.`var`)
    }
    else if (insn is IincInsnNode) {
        frame.markAlive(insn.`var`)
    }' @ [86:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'insn' @ [86:9] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'insn' @ [86:32] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'isLoadOperation' @ [86:37] ==> public fun AbstractInsnNode.isLoadOperation(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'frame' @ [87:9] ==> value-parameter frame: VariableLivenessFrame defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'markAlive' @ [87:15] ==> public final fun markAlive(varIndex: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[SimpleFunctionDescriptorImpl]

'insn' @ [87:25] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'`var`' @ [87:30] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'insn' @ [89:14] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'frame' @ [90:9] ==> value-parameter frame: VariableLivenessFrame defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'markAlive' @ [90:15] ==> public final fun markAlive(varIndex: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.VariableLivenessFrame[SimpleFunctionDescriptorImpl]

'insn' @ [90:25] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.useVar[ValueParameterDescriptorImpl]

'`var`' @ [90:30] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.IincInsnNode[JavaPropertyDescriptor]

