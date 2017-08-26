'Array' @ [26:50] ==> public constructor Array<T>(size: Int, init: (Int) -> MutableList<Int>) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> MutableList<Int>

'insns' @ [26:56] ==> private final val insns: InsnList defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph[PropertyDescriptorImpl]

'size' @ [26:62] ==> public open fun size(): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'arrayListOf' @ [26:72] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'getSuccessorsIndices' @ [28:67] ==> public final fun getSuccessorsIndices(index: Int): List<Int> defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph[SimpleFunctionDescriptorImpl]

'insns' @ [28:88] ==> private final val insns: InsnList defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph[PropertyDescriptorImpl]

'indexOf' @ [28:94] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [28:102] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.getSuccessorsIndices[ValueParameterDescriptorImpl]

'edges' @ [29:55] ==> private final val edges: Array<MutableList<Int>> defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph[PropertyDescriptorImpl]

'index' @ [29:61] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.getSuccessorsIndices[ValueParameterDescriptorImpl]

'JvmStatic' @ [32:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ControlFlowGraph' @ [34:25] ==> private constructor ControlFlowGraph(insns: InsnList) defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph[ClassConstructorDescriptorImpl]

'node' @ [34:42] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build[ValueParameterDescriptorImpl]

'instructions' @ [34:47] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'graph' @ [37:17] ==> val graph: ControlFlowGraph defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build[LocalVariableDescriptor]

'edges' @ [37:23] ==> private final val edges: Array<MutableList<Int>> defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph[PropertyDescriptorImpl]

'from' @ [37:29] ==> value-parameter from: Int defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build.addEdge[ValueParameterDescriptorImpl]

'add' @ [37:35] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'to' @ [37:39] ==> value-parameter to: Int defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build.addEdge[ValueParameterDescriptorImpl]

'MethodAnalyzer<BasicValue>' @ [40:22] ==> public constructor MethodAnalyzer<V : Value>(owner: String, method: MethodNode, interpreter: Interpreter<BasicValue>) defined in org.jetbrains.kotlin.codegen.optimization.common.MethodAnalyzer[ClassConstructorDescriptorImpl]
Inferred types:
    <V : Value> -> BasicValue

'node' @ [40:57] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build[ValueParameterDescriptorImpl]

'OptimizationBasicInterpreter' @ [40:63] ==> public constructor OptimizationBasicInterpreter() defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaClassConstructorDescriptor]

'addEdge' @ [42:21] ==> local final fun addEdge(from: Int, to: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build[SimpleFunctionDescriptorImpl]

'insn' @ [42:29] ==> value-parameter insn: Int defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build.<no name provided>.visitControlFlowEdge[ValueParameterDescriptorImpl]

'successor' @ [42:35] ==> value-parameter successor: Int defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build.<no name provided>.visitControlFlowEdge[ValueParameterDescriptorImpl]

'addEdge' @ [47:21] ==> local final fun addEdge(from: Int, to: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build[SimpleFunctionDescriptorImpl]

'insn' @ [47:29] ==> value-parameter insn: Int defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build.<no name provided>.visitControlFlowExceptionEdge[ValueParameterDescriptorImpl]

'successor' @ [47:35] ==> value-parameter successor: Int defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build.<no name provided>.visitControlFlowExceptionEdge[ValueParameterDescriptorImpl]

'analyze' @ [50:15] ==> public final fun analyze(): Array<Frame<BasicValue>?> defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build.<no name provided>[SimpleFunctionDescriptorImpl]

'graph' @ [52:20] ==> val graph: ControlFlowGraph defined in org.jetbrains.kotlin.codegen.optimization.common.ControlFlowGraph.Companion.build[LocalVariableDescriptor]

