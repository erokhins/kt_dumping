'MethodTransformer' @ [29:35] ==> public constructor MethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaClassConstructorDescriptor]

'FixStackContext' @ [31:23] ==> public constructor FixStackContext(methodNode: MethodNode) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[ClassConstructorDescriptorImpl]

'methodNode' @ [31:39] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[ValueParameterDescriptorImpl]

'!' @ [33:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'context' @ [33:14] ==> val context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[LocalVariableDescriptor]

'hasAnyMarkers' @ [33:22] ==> public final fun hasAnyMarkers(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[SimpleFunctionDescriptorImpl]

'!' @ [36:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'context' @ [36:14] ==> val context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[LocalVariableDescriptor]

'consistentInlineMarkers' @ [36:22] ==> public final var consistentInlineMarkers: Boolean defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'InsnSequence' @ [37:13] ==> public constructor InsnSequence(insnList: InsnList) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'methodNode' @ [37:26] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[ValueParameterDescriptorImpl]

'instructions' @ [37:37] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'forEach' @ [37:51] ==> public inline fun <T> Sequence<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'isInlineMarker' @ [38:21] ==> internal fun isInlineMarker(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'insnNode' @ [38:36] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform.<anonymous>[ValueParameterDescriptorImpl]

'methodNode' @ [39:21] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[ValueParameterDescriptorImpl]

'instructions' @ [39:32] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [39:45] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insnNode' @ [39:52] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [43:13] ==> val context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[LocalVariableDescriptor]

'isAnalysisRequired' @ [43:21] ==> public final fun isAnalysisRequired(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[SimpleFunctionDescriptorImpl]

'analyzeAndTransformBreakContinueGotos' @ [44:13] ==> private final fun analyzeAndTransformBreakContinueGotos(context: FixStackContext, internalClassName: String, methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer[SimpleFunctionDescriptorImpl]

'context' @ [44:51] ==> val context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[LocalVariableDescriptor]

'internalClassName' @ [44:60] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[ValueParameterDescriptorImpl]

'methodNode' @ [44:79] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[ValueParameterDescriptorImpl]

'removeAlwaysFalseIfeqMarkers' @ [45:13] ==> private final fun removeAlwaysFalseIfeqMarkers(context: FixStackContext, methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer[SimpleFunctionDescriptorImpl]

'context' @ [45:42] ==> val context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[LocalVariableDescriptor]

'methodNode' @ [45:51] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[ValueParameterDescriptorImpl]

'analyzeAndTransformSaveRestoreStack' @ [46:13] ==> private final fun analyzeAndTransformSaveRestoreStack(context: FixStackContext, internalClassName: String, methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer[SimpleFunctionDescriptorImpl]

'context' @ [46:49] ==> val context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[LocalVariableDescriptor]

'internalClassName' @ [46:58] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[ValueParameterDescriptorImpl]

'methodNode' @ [46:77] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[ValueParameterDescriptorImpl]

'removeAlwaysTrueIfeqMarkers' @ [49:9] ==> private final fun removeAlwaysTrueIfeqMarkers(context: FixStackContext, methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer[SimpleFunctionDescriptorImpl]

'context' @ [49:37] ==> val context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[LocalVariableDescriptor]

'methodNode' @ [49:46] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[ValueParameterDescriptorImpl]

'removeAlwaysFalseIfeqMarkers' @ [50:9] ==> private final fun removeAlwaysFalseIfeqMarkers(context: FixStackContext, methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer[SimpleFunctionDescriptorImpl]

'context' @ [50:38] ==> val context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[LocalVariableDescriptor]

'methodNode' @ [50:47] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transform[ValueParameterDescriptorImpl]

'FixStackAnalyzer' @ [54:24] ==> public constructor FixStackAnalyzer(owner: String, method: MethodNode, context: FixStackContext, skipBreakContinueGotoEdges: Boolean = ...) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackAnalyzer[ClassConstructorDescriptorImpl]

'internalClassName' @ [54:41] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[ValueParameterDescriptorImpl]

'methodNode' @ [54:60] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[ValueParameterDescriptorImpl]

'context' @ [54:72] ==> value-parameter context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[ValueParameterDescriptorImpl]

'analyzer' @ [55:9] ==> val analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[LocalVariableDescriptor]

'analyze' @ [55:18] ==> public final fun analyze(): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackAnalyzer[SimpleFunctionDescriptorImpl]

'methodNode' @ [57:9] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[ValueParameterDescriptorImpl]

'maxStack' @ [57:20] ==> public final var maxStack: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'methodNode' @ [57:31] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[ValueParameterDescriptorImpl]

'maxStack' @ [57:42] ==> public final var maxStack: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'analyzer' @ [57:53] ==> val analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[LocalVariableDescriptor]

'maxExtraStackSize' @ [57:62] ==> public final val maxExtraStackSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackAnalyzer[PropertyDescriptorImpl]

'arrayListOf' @ [59:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'transformBreakContinueGotos' @ [61:9] ==> private final fun transformBreakContinueGotos(methodNode: MethodNode, fixStackContext: FixStackContext, actions: MutableList<() -> Unit>, analyzer: FixStackAnalyzer): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [61:37] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[ValueParameterDescriptorImpl]

'context' @ [61:49] ==> value-parameter context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[ValueParameterDescriptorImpl]

'actions' @ [61:58] ==> val actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[LocalVariableDescriptor]

'analyzer' @ [61:67] ==> val analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[LocalVariableDescriptor]

'actions' @ [63:9] ==> val actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformBreakContinueGotos[LocalVariableDescriptor]

'forEach' @ [63:17] ==> @HidesMembers public inline fun <T> Iterable<() -> Unit>.forEach(action: (() -> Unit) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'invoke' @ [63:27] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'FixStackAnalyzer' @ [67:24] ==> public constructor FixStackAnalyzer(owner: String, method: MethodNode, context: FixStackContext, skipBreakContinueGotoEdges: Boolean = ...) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackAnalyzer[ClassConstructorDescriptorImpl]

'internalClassName' @ [67:41] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformSaveRestoreStack[ValueParameterDescriptorImpl]

'methodNode' @ [67:60] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformSaveRestoreStack[ValueParameterDescriptorImpl]

'context' @ [67:72] ==> value-parameter context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformSaveRestoreStack[ValueParameterDescriptorImpl]

'analyzer' @ [68:9] ==> val analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformSaveRestoreStack[LocalVariableDescriptor]

'analyze' @ [68:18] ==> public final fun analyze(): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackAnalyzer[SimpleFunctionDescriptorImpl]

'arrayListOf' @ [70:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'transformSaveRestoreStackMarkers' @ [72:9] ==> private final fun transformSaveRestoreStackMarkers(methodNode: MethodNode, context: FixStackContext, actions: MutableList<() -> Unit>, analyzer: FixStackAnalyzer): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [72:42] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformSaveRestoreStack[ValueParameterDescriptorImpl]

'context' @ [72:54] ==> value-parameter context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformSaveRestoreStack[ValueParameterDescriptorImpl]

'actions' @ [72:63] ==> val actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformSaveRestoreStack[LocalVariableDescriptor]

'analyzer' @ [72:72] ==> val analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformSaveRestoreStack[LocalVariableDescriptor]

'actions' @ [74:9] ==> val actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.analyzeAndTransformSaveRestoreStack[LocalVariableDescriptor]

'forEach' @ [74:17] ==> @HidesMembers public inline fun <T> Iterable<() -> Unit>.forEach(action: (() -> Unit) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'invoke' @ [74:27] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'context' @ [78:9] ==> value-parameter context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.removeAlwaysFalseIfeqMarkers[ValueParameterDescriptorImpl]

'fakeAlwaysFalseIfeqMarkers' @ [78:17] ==> public final val fakeAlwaysFalseIfeqMarkers: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'forEach' @ [78:44] ==> @HidesMembers public inline fun <T> Iterable<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'removeAlwaysFalseIfeq' @ [79:13] ==> public fun removeAlwaysFalseIfeq(methodNode: MethodNode, node: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [79:35] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.removeAlwaysFalseIfeqMarkers[ValueParameterDescriptorImpl]

'marker' @ [79:47] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.removeAlwaysFalseIfeqMarkers.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [81:9] ==> value-parameter context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.removeAlwaysFalseIfeqMarkers[ValueParameterDescriptorImpl]

'fakeAlwaysFalseIfeqMarkers' @ [81:17] ==> public final val fakeAlwaysFalseIfeqMarkers: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'clear' @ [81:44] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'context' @ [85:9] ==> value-parameter context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.removeAlwaysTrueIfeqMarkers[ValueParameterDescriptorImpl]

'fakeAlwaysTrueIfeqMarkers' @ [85:17] ==> public final val fakeAlwaysTrueIfeqMarkers: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'forEach' @ [85:43] ==> @HidesMembers public inline fun <T> Iterable<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'replaceAlwaysTrueIfeqWithGoto' @ [86:13] ==> public fun replaceAlwaysTrueIfeqWithGoto(methodNode: MethodNode, node: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [86:43] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.removeAlwaysTrueIfeqMarkers[ValueParameterDescriptorImpl]

'marker' @ [86:55] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.removeAlwaysTrueIfeqMarkers.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [88:9] ==> value-parameter context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.removeAlwaysTrueIfeqMarkers[ValueParameterDescriptorImpl]

'fakeAlwaysTrueIfeqMarkers' @ [88:17] ==> public final val fakeAlwaysTrueIfeqMarkers: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'clear' @ [88:43] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'fixStackContext' @ [97:9] ==> value-parameter fixStackContext: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos[ValueParameterDescriptorImpl]

'breakContinueGotoNodes' @ [97:25] ==> public final val breakContinueGotoNodes: LinkedHashSet<JumpInsnNode> /* = LinkedHashSet<JumpInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackContext[PropertyDescriptorImpl]

'forEach' @ [97:48] ==> @HidesMembers public inline fun <T> Iterable<JumpInsnNode>.forEach(action: (JumpInsnNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JumpInsnNode

'methodNode' @ [98:29] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos[ValueParameterDescriptorImpl]

'instructions' @ [98:40] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [98:53] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'gotoNode' @ [98:61] ==> value-parameter gotoNode: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[ValueParameterDescriptorImpl]

'methodNode' @ [99:30] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos[ValueParameterDescriptorImpl]

'instructions' @ [99:41] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'indexOf' @ [99:54] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'gotoNode' @ [99:62] ==> value-parameter gotoNode: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[ValueParameterDescriptorImpl]

'label' @ [99:71] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'analyzer' @ [101:35] ==> value-parameter analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos[ValueParameterDescriptorImpl]

'getActualStackSize' @ [101:44] ==> public final fun getActualStackSize(location: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackAnalyzer[SimpleFunctionDescriptorImpl]

'gotoNode' @ [101:63] ==> value-parameter gotoNode: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[ValueParameterDescriptorImpl]

'analyzer' @ [102:37] ==> value-parameter analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos[ValueParameterDescriptorImpl]

'getExpectedStackSize' @ [102:46] ==> public final fun getExpectedStackSize(location: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackAnalyzer[SimpleFunctionDescriptorImpl]

'gotoNode' @ [102:67] ==> value-parameter gotoNode: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[ValueParameterDescriptorImpl]

'label' @ [102:76] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'if (actualStackSize >= 0 && expectedStackSize >= 0) {
                assert(expectedStackSize <= actualStackSize) {
                    "Label at $labelIndex, jump at $gotoIndex: stack underflow: $expectedStackSize > $actualStackSize"
                }
                val actualStackContent = analyzer.getActualStack(gotoNode)
                                         ?: throw AssertionError("Jump at $gotoIndex should be alive")
                actions.add { replaceMarkerWithPops(methodNode, gotoNode.previous, expectedStackSize, actualStackContent) }
            }
            else if (actualStackSize >= 0 && expectedStackSize < 0) {
                throw AssertionError("Live jump $gotoIndex to dead label $labelIndex")
            }
            else {
                val marker = gotoNode.previous
                actions.add { methodNode.instructions.remove(marker) }
            }' @ [104:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'actualStackSize' @ [104:17] ==> val actualStackSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'expectedStackSize' @ [104:41] ==> val expectedStackSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'assert' @ [105:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expectedStackSize' @ [105:24] ==> val expectedStackSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'actualStackSize' @ [105:45] ==> val actualStackSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'labelIndex' @ [106:32] ==> val labelIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'gotoIndex' @ [106:53] ==> val gotoIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'expectedStackSize' @ [106:82] ==> val expectedStackSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'actualStackSize' @ [106:103] ==> val actualStackSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'analyzer' @ [108:42] ==> value-parameter analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos[ValueParameterDescriptorImpl]

'getActualStack' @ [108:51] ==> public final fun getActualStack(location: AbstractInsnNode): List<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackAnalyzer[SimpleFunctionDescriptorImpl]

'gotoNode' @ [108:66] ==> value-parameter gotoNode: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [109:51] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'gotoIndex' @ [109:76] ==> val gotoIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'actions' @ [110:17] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos[ValueParameterDescriptorImpl]

'add' @ [110:25] ==> public abstract fun add(element: () -> Unit): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'replaceMarkerWithPops' @ [110:31] ==> public fun replaceMarkerWithPops(methodNode: MethodNode, node: AbstractInsnNode, expectedStackSize: Int, stackContent: List<BasicValue>): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [110:53] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos[ValueParameterDescriptorImpl]

'gotoNode' @ [110:65] ==> value-parameter gotoNode: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[ValueParameterDescriptorImpl]

'previous' @ [110:74] ==> public final val JumpInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'expectedStackSize' @ [110:84] ==> val expectedStackSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'actualStackContent' @ [110:103] ==> val actualStackContent: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'if (actualStackSize >= 0 && expectedStackSize < 0) {
                throw AssertionError("Live jump $gotoIndex to dead label $labelIndex")
            }
            else {
                val marker = gotoNode.previous
                actions.add { methodNode.instructions.remove(marker) }
            }' @ [112:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'actualStackSize' @ [112:22] ==> val actualStackSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'expectedStackSize' @ [112:46] ==> val expectedStackSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'AssertionError' @ [113:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'gotoIndex' @ [113:50] ==> val gotoIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'labelIndex' @ [113:75] ==> val labelIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'gotoNode' @ [116:30] ==> value-parameter gotoNode: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[ValueParameterDescriptorImpl]

'previous' @ [116:39] ==> public final val JumpInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'actions' @ [117:17] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos[ValueParameterDescriptorImpl]

'add' @ [117:25] ==> public abstract fun add(element: () -> Unit): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [117:31] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos[ValueParameterDescriptorImpl]

'instructions' @ [117:42] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [117:55] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'marker' @ [117:62] ==> val marker: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBreakContinueGotos.<anonymous>[LocalVariableDescriptor]

'LocalVariablesManager' @ [128:37] ==> public constructor LocalVariablesManager(context: FixStackContext, methodNode: MethodNode) defined in org.jetbrains.kotlin.codegen.optimization.fixStack.LocalVariablesManager[ClassConstructorDescriptorImpl]

'context' @ [128:59] ==> value-parameter context: FixStackContext defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'methodNode' @ [128:68] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'InsnSequence' @ [129:9] ==> public constructor InsnSequence(insnList: InsnList) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'methodNode' @ [129:22] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'instructions' @ [129:33] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'forEach' @ [129:47] ==> public inline fun <T> Sequence<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'parsePseudoInsnOrNull' @ [130:30] ==> public fun parsePseudoInsnOrNull(insn: AbstractInsnNode): PseudoInsn? defined in org.jetbrains.kotlin.codegen.pseudoInsns in file PseudoInsns.kt[SimpleFunctionDescriptorImpl]

'marker' @ [130:52] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers.<anonymous>[ValueParameterDescriptorImpl]

'when {
                pseudoInsn == PseudoInsn.SAVE_STACK_BEFORE_TRY ->
                    transformSaveStackMarker(methodNode, actions, analyzer, marker, localVariablesManager)
                pseudoInsn == PseudoInsn.RESTORE_STACK_IN_TRY_CATCH ->
                    transformRestoreStackMarker(methodNode, actions, marker, localVariablesManager)
                isBeforeInlineMarker(marker) ->
                    transformBeforeInlineCallMarker(methodNode, actions, analyzer, marker, localVariablesManager)
                isAfterInlineMarker(marker) ->
                    transformAfterInlineCallMarker(methodNode, actions, analyzer, marker, localVariablesManager)
            }' @ [131:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'pseudoInsn' @ [132:17] ==> val pseudoInsn: PseudoInsn? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'SAVE_STACK_BEFORE_TRY' @ [132:42] ==> enum entry SAVE_STACK_BEFORE_TRY defined in org.jetbrains.kotlin.codegen.pseudoInsns.PseudoInsn[FakeCallableDescriptorForObject]

'transformSaveStackMarker' @ [133:21] ==> private final fun transformSaveStackMarker(methodNode: MethodNode, actions: MutableList<() -> Unit>, analyzer: FixStackAnalyzer, marker: AbstractInsnNode, localVariablesManager: LocalVariablesManager): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [133:46] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'actions' @ [133:58] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'analyzer' @ [133:67] ==> value-parameter analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'marker' @ [133:77] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers.<anonymous>[ValueParameterDescriptorImpl]

'localVariablesManager' @ [133:85] ==> val localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[LocalVariableDescriptor]

'pseudoInsn' @ [134:17] ==> val pseudoInsn: PseudoInsn? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers.<anonymous>[LocalVariableDescriptor]

'RESTORE_STACK_IN_TRY_CATCH' @ [134:42] ==> enum entry RESTORE_STACK_IN_TRY_CATCH defined in org.jetbrains.kotlin.codegen.pseudoInsns.PseudoInsn[FakeCallableDescriptorForObject]

'transformRestoreStackMarker' @ [135:21] ==> private final fun transformRestoreStackMarker(methodNode: MethodNode, actions: MutableList<() -> Unit>, marker: AbstractInsnNode, localVariablesManager: LocalVariablesManager): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [135:49] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'actions' @ [135:61] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'marker' @ [135:70] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers.<anonymous>[ValueParameterDescriptorImpl]

'localVariablesManager' @ [135:78] ==> val localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[LocalVariableDescriptor]

'isBeforeInlineMarker' @ [136:17] ==> internal fun isBeforeInlineMarker(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'marker' @ [136:38] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers.<anonymous>[ValueParameterDescriptorImpl]

'transformBeforeInlineCallMarker' @ [137:21] ==> private final fun transformBeforeInlineCallMarker(methodNode: MethodNode, actions: MutableList<() -> Unit>, analyzer: FixStackAnalyzer, inlineMarker: AbstractInsnNode, localVariablesManager: LocalVariablesManager): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [137:53] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'actions' @ [137:65] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'analyzer' @ [137:74] ==> value-parameter analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'marker' @ [137:84] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers.<anonymous>[ValueParameterDescriptorImpl]

'localVariablesManager' @ [137:92] ==> val localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[LocalVariableDescriptor]

'isAfterInlineMarker' @ [138:17] ==> internal fun isAfterInlineMarker(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'marker' @ [138:37] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers.<anonymous>[ValueParameterDescriptorImpl]

'transformAfterInlineCallMarker' @ [139:21] ==> private final fun transformAfterInlineCallMarker(methodNode: MethodNode, actions: MutableList<() -> Unit>, analyzer: FixStackAnalyzer, inlineMarker: AbstractInsnNode, localVariablesManager: LocalVariablesManager): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [139:52] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'actions' @ [139:64] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'analyzer' @ [139:73] ==> value-parameter analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[ValueParameterDescriptorImpl]

'marker' @ [139:83] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers.<anonymous>[ValueParameterDescriptorImpl]

'localVariablesManager' @ [139:91] ==> val localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveRestoreStackMarkers[LocalVariableDescriptor]

'analyzer' @ [151:32] ==> value-parameter analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'getStackToSpill' @ [151:41] ==> public final fun getStackToSpill(location: AbstractInsnNode): List<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackAnalyzer[SimpleFunctionDescriptorImpl]

'marker' @ [151:57] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'if (savedStackValues != null) {
            val savedStackDescriptor = localVariablesManager.allocateVariablesForSaveStackMarker(marker, savedStackValues)
            actions.add { saveStack(methodNode, marker, savedStackDescriptor) }
        }
        else {
            // marker is dead code
            localVariablesManager.allocateVariablesForSaveStackMarker(marker, emptyList())
            actions.add { methodNode.instructions.remove(marker) }
        }' @ [152:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'savedStackValues' @ [152:13] ==> val savedStackValues: List<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[LocalVariableDescriptor]

'localVariablesManager' @ [153:40] ==> value-parameter localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'allocateVariablesForSaveStackMarker' @ [153:62] ==> public final fun allocateVariablesForSaveStackMarker(saveStackMarker: AbstractInsnNode, savedStackValues: List<BasicValue>): SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.LocalVariablesManager[SimpleFunctionDescriptorImpl]

'marker' @ [153:98] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'savedStackValues' @ [153:106] ==> val savedStackValues: List<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[LocalVariableDescriptor]

'actions' @ [154:13] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'add' @ [154:21] ==> public abstract fun add(element: () -> Unit): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'saveStack' @ [154:27] ==> public fun saveStack(methodNode: MethodNode, nodeToReplace: AbstractInsnNode, savedStackDescriptor: SavedStackDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [154:37] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'marker' @ [154:49] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'savedStackDescriptor' @ [154:57] ==> val savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[LocalVariableDescriptor]

'localVariablesManager' @ [158:13] ==> value-parameter localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'allocateVariablesForSaveStackMarker' @ [158:35] ==> public final fun allocateVariablesForSaveStackMarker(saveStackMarker: AbstractInsnNode, savedStackValues: List<BasicValue>): SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.LocalVariablesManager[SimpleFunctionDescriptorImpl]

'marker' @ [158:71] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'emptyList' @ [158:79] ==> public fun <T> emptyList(): List<BasicValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'actions' @ [159:13] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'add' @ [159:21] ==> public abstract fun add(element: () -> Unit): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [159:27] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'instructions' @ [159:38] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [159:51] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'marker' @ [159:58] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformSaveStackMarker[ValueParameterDescriptorImpl]

'localVariablesManager' @ [169:36] ==> value-parameter localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformRestoreStackMarker[ValueParameterDescriptorImpl]

'getSavedStackDescriptor' @ [169:58] ==> public final fun getSavedStackDescriptor(restoreStackMarker: AbstractInsnNode): SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.LocalVariablesManager[SimpleFunctionDescriptorImpl]

'marker' @ [169:82] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformRestoreStackMarker[ValueParameterDescriptorImpl]

'actions' @ [170:9] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformRestoreStackMarker[ValueParameterDescriptorImpl]

'add' @ [170:17] ==> public abstract fun add(element: () -> Unit): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'restoreStack' @ [170:23] ==> public fun restoreStack(methodNode: MethodNode, location: AbstractInsnNode, savedStackDescriptor: SavedStackDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [170:36] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformRestoreStackMarker[ValueParameterDescriptorImpl]

'marker' @ [170:48] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformRestoreStackMarker[ValueParameterDescriptorImpl]

'savedStackDescriptor' @ [170:56] ==> val savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformRestoreStackMarker[LocalVariableDescriptor]

'localVariablesManager' @ [171:9] ==> value-parameter localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformRestoreStackMarker[ValueParameterDescriptorImpl]

'markRestoreStackMarkerEmitted' @ [171:31] ==> public final fun markRestoreStackMarkerEmitted(restoreStackMarker: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.LocalVariablesManager[SimpleFunctionDescriptorImpl]

'marker' @ [171:61] ==> value-parameter marker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformRestoreStackMarker[ValueParameterDescriptorImpl]

'localVariablesManager' @ [181:36] ==> value-parameter localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'getBeforeInlineDescriptor' @ [181:58] ==> public final fun getBeforeInlineDescriptor(afterInlineMarker: AbstractInsnNode): SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.LocalVariablesManager[SimpleFunctionDescriptorImpl]

'inlineMarker' @ [181:84] ==> value-parameter inlineMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'analyzer' @ [182:39] ==> value-parameter analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'getActualStack' @ [182:48] ==> public final fun getActualStack(location: AbstractInsnNode): List<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackAnalyzer[SimpleFunctionDescriptorImpl]

'inlineMarker' @ [182:63] ==> value-parameter inlineMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'if (stackContentAfterInline != null && savedStackDescriptor.isNotEmpty()) {
            when (stackContentAfterInline.size) {
                1 -> {
                    val returnValue = stackContentAfterInline.last()
                    val returnValueLocalVarIndex = localVariablesManager.createReturnValueVariable(returnValue)
                    actions.add {
                        restoreStackWithReturnValue(methodNode, inlineMarker, savedStackDescriptor,
                                                    returnValue, returnValueLocalVarIndex
                        )
                    }
                }
                0 ->
                    actions.add { restoreStack(methodNode, inlineMarker, savedStackDescriptor) }
                else ->
                    throw AssertionError("Inline method should not leave more than 1 value on stack")
            }
        }
        else {
            // after inline marker is dead code
            actions.add { methodNode.instructions.remove(inlineMarker) }
        }' @ [183:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'stackContentAfterInline' @ [183:13] ==> val stackContentAfterInline: List<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[LocalVariableDescriptor]

'savedStackDescriptor' @ [183:48] ==> val savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[LocalVariableDescriptor]

'isNotEmpty' @ [183:69] ==> public final fun isNotEmpty(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor[SimpleFunctionDescriptorImpl]

'when (stackContentAfterInline.size) {
                1 -> {
                    val returnValue = stackContentAfterInline.last()
                    val returnValueLocalVarIndex = localVariablesManager.createReturnValueVariable(returnValue)
                    actions.add {
                        restoreStackWithReturnValue(methodNode, inlineMarker, savedStackDescriptor,
                                                    returnValue, returnValueLocalVarIndex
                        )
                    }
                }
                0 ->
                    actions.add { restoreStack(methodNode, inlineMarker, savedStackDescriptor) }
                else ->
                    throw AssertionError("Inline method should not leave more than 1 value on stack")
            }' @ [184:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'stackContentAfterInline' @ [184:19] ==> val stackContentAfterInline: List<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[LocalVariableDescriptor]

'size' @ [184:43] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'stackContentAfterInline' @ [186:39] ==> val stackContentAfterInline: List<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[LocalVariableDescriptor]

'last' @ [186:63] ==> public fun <T> List<BasicValue>.last(): BasicValue defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'localVariablesManager' @ [187:52] ==> value-parameter localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'createReturnValueVariable' @ [187:74] ==> public final fun createReturnValueVariable(returnValue: BasicValue): Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.LocalVariablesManager[SimpleFunctionDescriptorImpl]

'returnValue' @ [187:100] ==> val returnValue: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[LocalVariableDescriptor]

'actions' @ [188:21] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'add' @ [188:29] ==> public abstract fun add(element: () -> Unit): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'restoreStackWithReturnValue' @ [189:25] ==> public fun restoreStackWithReturnValue(methodNode: MethodNode, nodeToReplace: AbstractInsnNode, savedStackDescriptor: SavedStackDescriptor, returnValue: BasicValue, returnValueLocalVarIndex: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [189:53] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'inlineMarker' @ [189:65] ==> value-parameter inlineMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'savedStackDescriptor' @ [189:79] ==> val savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[LocalVariableDescriptor]

'returnValue' @ [190:53] ==> val returnValue: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[LocalVariableDescriptor]

'returnValueLocalVarIndex' @ [190:66] ==> val returnValueLocalVarIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[LocalVariableDescriptor]

'actions' @ [195:21] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'add' @ [195:29] ==> public abstract fun add(element: () -> Unit): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'restoreStack' @ [195:35] ==> public fun restoreStack(methodNode: MethodNode, location: AbstractInsnNode, savedStackDescriptor: SavedStackDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [195:48] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'inlineMarker' @ [195:60] ==> value-parameter inlineMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'savedStackDescriptor' @ [195:74] ==> val savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[LocalVariableDescriptor]

'AssertionError' @ [197:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'actions' @ [202:13] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'add' @ [202:21] ==> public abstract fun add(element: () -> Unit): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [202:27] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'instructions' @ [202:38] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [202:51] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'inlineMarker' @ [202:58] ==> value-parameter inlineMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'localVariablesManager' @ [204:9] ==> value-parameter localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'markAfterInlineMarkerEmitted' @ [204:31] ==> public final fun markAfterInlineMarkerEmitted(afterInlineMarker: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack.LocalVariablesManager[SimpleFunctionDescriptorImpl]

'inlineMarker' @ [204:60] ==> value-parameter inlineMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformAfterInlineCallMarker[ValueParameterDescriptorImpl]

'analyzer' @ [214:32] ==> value-parameter analyzer: FixStackAnalyzer defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

'getStackToSpill' @ [214:41] ==> public final fun getStackToSpill(location: AbstractInsnNode): List<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackAnalyzer[SimpleFunctionDescriptorImpl]

'inlineMarker' @ [214:57] ==> value-parameter inlineMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

'if (savedStackValues != null) {
            val savedStackDescriptor = localVariablesManager.allocateVariablesForBeforeInlineMarker(inlineMarker, savedStackValues)
            actions.add { saveStack(methodNode, inlineMarker, savedStackDescriptor) }
        }
        else {
            // before inline marker is dead code
            localVariablesManager.allocateVariablesForBeforeInlineMarker(inlineMarker, emptyList())
            actions.add { methodNode.instructions.remove(inlineMarker) }
        }' @ [215:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'savedStackValues' @ [215:13] ==> val savedStackValues: List<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[LocalVariableDescriptor]

'localVariablesManager' @ [216:40] ==> value-parameter localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

'allocateVariablesForBeforeInlineMarker' @ [216:62] ==> public final fun allocateVariablesForBeforeInlineMarker(beforeInlineMarker: AbstractInsnNode, savedStackValues: List<BasicValue>): SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.LocalVariablesManager[SimpleFunctionDescriptorImpl]

'inlineMarker' @ [216:101] ==> value-parameter inlineMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

'savedStackValues' @ [216:115] ==> val savedStackValues: List<BasicValue>? defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[LocalVariableDescriptor]

'actions' @ [217:13] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

'add' @ [217:21] ==> public abstract fun add(element: () -> Unit): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'saveStack' @ [217:27] ==> public fun saveStack(methodNode: MethodNode, nodeToReplace: AbstractInsnNode, savedStackDescriptor: SavedStackDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [217:37] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

'inlineMarker' @ [217:49] ==> value-parameter inlineMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

'savedStackDescriptor' @ [217:63] ==> val savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[LocalVariableDescriptor]

'localVariablesManager' @ [221:13] ==> value-parameter localVariablesManager: LocalVariablesManager defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

'allocateVariablesForBeforeInlineMarker' @ [221:35] ==> public final fun allocateVariablesForBeforeInlineMarker(beforeInlineMarker: AbstractInsnNode, savedStackValues: List<BasicValue>): SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.LocalVariablesManager[SimpleFunctionDescriptorImpl]

'inlineMarker' @ [221:74] ==> value-parameter inlineMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

'emptyList' @ [221:88] ==> public fun <T> emptyList(): List<BasicValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'actions' @ [222:13] ==> value-parameter actions: MutableList<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

'add' @ [222:21] ==> public abstract fun add(element: () -> Unit): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [222:27] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

'instructions' @ [222:38] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [222:51] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'inlineMarker' @ [222:58] ==> value-parameter inlineMarker: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.FixStackMethodTransformer.transformBeforeInlineCallMarker[ValueParameterDescriptorImpl]

