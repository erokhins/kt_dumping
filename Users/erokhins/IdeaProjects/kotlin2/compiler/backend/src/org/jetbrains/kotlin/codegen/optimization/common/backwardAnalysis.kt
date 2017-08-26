'ControlFlowGraph' @ [35:17] ==> public companion object defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph[FakeCallableDescriptorForObject]

'build' @ [35:34] ==> @JvmStatic public final fun build(node: MethodNode): ControlFlowGraph defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion[SimpleFunctionDescriptorImpl]

'node' @ [35:40] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[ValueParameterDescriptorImpl]

'node' @ [36:20] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[ValueParameterDescriptorImpl]

'instructions' @ [36:25] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'..' @ [38:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'insnList' @ [38:22] ==> val insnList: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'size' @ [38:31] ==> public open fun size(): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'map' @ [38:39] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> F): List<F> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> F

'interpreter' @ [38:45] ==> value-parameter interpreter: BackwardAnalysisInterpreter<F> defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[ValueParameterDescriptorImpl]

'newFrame' @ [38:57] ==> public abstract fun newFrame(maxLocals: Int): F defined in org.jetbrains.kotlin.codegen.optimization.common.BackwardAnalysisInterpreter[SimpleFunctionDescriptorImpl]

'node' @ [38:66] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[ValueParameterDescriptorImpl]

'maxLocals' @ [38:71] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toMutableList' @ [38:84] ==> public fun <T> Collection<F>.toMutableList(): MutableList<F> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> F

'insnList' @ [39:21] ==> val insnList: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'toArray' @ [39:30] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'wereChanges' @ [45:9] ==> var wereChanges: Boolean defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'insnArray' @ [46:22] ==> val insnArray: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'insnList' @ [47:25] ==> val insnList: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'indexOf' @ [47:34] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [47:42] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'interpreter' @ [48:28] ==> value-parameter interpreter: BackwardAnalysisInterpreter<F> defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[ValueParameterDescriptorImpl]

'newFrame' @ [48:40] ==> public abstract fun newFrame(maxLocals: Int): F defined in org.jetbrains.kotlin.codegen.optimization.common.BackwardAnalysisInterpreter[SimpleFunctionDescriptorImpl]

'node' @ [48:49] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[ValueParameterDescriptorImpl]

'maxLocals' @ [48:54] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'graph' @ [49:36] ==> val graph: ControlFlowGraph defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'getSuccessorsIndices' @ [49:42] ==> public final fun getSuccessorsIndices(insn: AbstractInsnNode): List<Int> defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph[SimpleFunctionDescriptorImpl]

'insn' @ [49:63] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'newFrame' @ [50:17] ==> val newFrame: F defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'mergeFrom' @ [50:26] ==> public abstract fun mergeFrom(other: F): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.VarFrame[SimpleFunctionDescriptorImpl]

'frames' @ [50:36] ==> val frames: MutableList<F> defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'successorIndex' @ [50:43] ==> val successorIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'interpreter' @ [53:13] ==> value-parameter interpreter: BackwardAnalysisInterpreter<F> defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[ValueParameterDescriptorImpl]

'def' @ [53:25] ==> public abstract fun def(frame: F, insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.BackwardAnalysisInterpreter[SimpleFunctionDescriptorImpl]

'newFrame' @ [53:29] ==> val newFrame: F defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'insn' @ [53:39] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'interpreter' @ [54:13] ==> value-parameter interpreter: BackwardAnalysisInterpreter<F> defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[ValueParameterDescriptorImpl]

'use' @ [54:25] ==> public abstract fun use(frame: F, insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.BackwardAnalysisInterpreter[SimpleFunctionDescriptorImpl]

'newFrame' @ [54:29] ==> val newFrame: F defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'insn' @ [54:39] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'frames' @ [56:17] ==> val frames: MutableList<F> defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'index' @ [56:24] ==> val index: Int defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'newFrame' @ [56:34] ==> val newFrame: F defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'frames' @ [57:17] ==> val frames: MutableList<F> defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'index' @ [57:24] ==> val index: Int defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'newFrame' @ [57:33] ==> val newFrame: F defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'wereChanges' @ [58:17] ==> var wereChanges: Boolean defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'wereChanges' @ [62:14] ==> var wereChanges: Boolean defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

'frames' @ [64:12] ==> val frames: MutableList<F> defined in org.jetbrains.kotlin.codegen.optimization.common.analyze[LocalVariableDescriptor]

