'TransformationMethodVisitor' @ [37:5] ==> public constructor TransformationMethodVisitor(@NotNull delegate: MethodVisitor, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable exceptions: (Array<(String..String?)>?..Array<out (String..String?)>?)) defined in org.jetbrains.kotlin.codegen.TransformationMethodVisitor[JavaClassConstructorDescriptor]

'delegate' @ [37:33] ==> value-parameter delegate: MethodVisitor defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.<init>[ValueParameterDescriptorImpl]

'access' @ [37:43] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.<init>[ValueParameterDescriptorImpl]

'name' @ [37:51] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.<init>[ValueParameterDescriptorImpl]

'desc' @ [37:57] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.<init>[ValueParameterDescriptorImpl]

'signature' @ [37:63] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.<init>[ValueParameterDescriptorImpl]

'exceptions' @ [37:74] ==> value-parameter exceptions: Array<String>? defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.<init>[ValueParameterDescriptorImpl]

'MANDATORY_METHOD_TRANSFORMER' @ [40:9] ==> private final val MANDATORY_METHOD_TRANSFORMER: CompositeMethodTransformer defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion[PropertyDescriptorImpl]

'transform' @ [40:38] ==> public open fun transform(internalClassName: String, methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.transformer.CompositeMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [40:56] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.performTransformations[ValueParameterDescriptorImpl]

'canBeOptimized' @ [41:13] ==> public final fun canBeOptimized(node: MethodNode): Boolean defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion[SimpleFunctionDescriptorImpl]

'methodNode' @ [41:28] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.performTransformations[ValueParameterDescriptorImpl]

'!' @ [41:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'disableOptimization' @ [41:44] ==> private final val disableOptimization: Boolean defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor[PropertyDescriptorImpl]

'OPTIMIZATION_TRANSFORMER' @ [42:13] ==> private final val OPTIMIZATION_TRANSFORMER: CompositeMethodTransformer defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion[PropertyDescriptorImpl]

'transform' @ [42:38] ==> public open fun transform(internalClassName: String, methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.transformer.CompositeMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [42:56] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.performTransformations[ValueParameterDescriptorImpl]

'methodNode' @ [44:9] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.performTransformations[ValueParameterDescriptorImpl]

'prepareForEmitting' @ [44:20] ==> public fun MethodNode.prepareForEmitting(): Unit defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'CompositeMethodTransformer' @ [50:52] ==> public constructor CompositeMethodTransformer(vararg transformers: MethodTransformer) defined in org.jetbrains.kotlin.codegen.optimization.transformer.CompositeMethodTransformer[ClassConstructorDescriptorImpl]

'FixStackWithLabelNormalizationMethodTransformer' @ [51:17] ==> public constructor FixStackWithLabelNormalizationMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.FixStackWithLabelNormalizationMethodTransformer[ClassConstructorDescriptorImpl]

'MethodVerifier' @ [52:17] ==> public constructor MethodVerifier(checkPoint: String) defined in org.jetbrains.kotlin.codegen.optimization.MethodVerifier[ClassConstructorDescriptorImpl]

'CompositeMethodTransformer' @ [55:48] ==> public constructor CompositeMethodTransformer(vararg transformers: MethodTransformer) defined in org.jetbrains.kotlin.codegen.optimization.transformer.CompositeMethodTransformer[ClassConstructorDescriptorImpl]

'CapturedVarsOptimizationMethodTransformer' @ [56:17] ==> public constructor CapturedVarsOptimizationMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.CapturedVarsOptimizationMethodTransformer[ClassConstructorDescriptorImpl]

'RedundantNullCheckMethodTransformer' @ [57:17] ==> public constructor RedundantNullCheckMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer[ClassConstructorDescriptorImpl]

'RedundantCheckCastEliminationMethodTransformer' @ [58:17] ==> public constructor RedundantCheckCastEliminationMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.RedundantCheckCastEliminationMethodTransformer[ClassConstructorDescriptorImpl]

'ConstantConditionEliminationMethodTransformer' @ [59:17] ==> public constructor ConstantConditionEliminationMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer[ClassConstructorDescriptorImpl]

'RedundantBoxingMethodTransformer' @ [60:17] ==> public constructor RedundantBoxingMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[ClassConstructorDescriptorImpl]

'StackPeepholeOptimizationsTransformer' @ [61:17] ==> public constructor StackPeepholeOptimizationsTransformer() defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer[ClassConstructorDescriptorImpl]

'PopBackwardPropagationTransformer' @ [62:17] ==> public constructor PopBackwardPropagationTransformer() defined in org.jetbrains.kotlin.codegen.optimization.boxing.PopBackwardPropagationTransformer[ClassConstructorDescriptorImpl]

'DeadCodeEliminationMethodTransformer' @ [63:17] ==> public constructor DeadCodeEliminationMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer[ClassConstructorDescriptorImpl]

'RedundantGotoMethodTransformer' @ [64:17] ==> public constructor RedundantGotoMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.RedundantGotoMethodTransformer[ClassConstructorDescriptorImpl]

'RedundantNopsCleanupMethodTransformer' @ [65:17] ==> public constructor RedundantNopsCleanupMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.RedundantNopsCleanupMethodTransformer[ClassConstructorDescriptorImpl]

'MethodVerifier' @ [66:17] ==> public constructor MethodVerifier(checkPoint: String) defined in org.jetbrains.kotlin.codegen.optimization.MethodVerifier[ClassConstructorDescriptorImpl]

'node' @ [70:37] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion.canBeOptimized[ValueParameterDescriptorImpl]

'instructions' @ [70:42] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'size' @ [70:55] ==> public open fun size(): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'node' @ [70:65] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion.canBeOptimized[ValueParameterDescriptorImpl]

'maxLocals' @ [70:70] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [70:82] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion.canBeOptimized[ValueParameterDescriptorImpl]

'maxStack' @ [70:87] ==> public final var maxStack: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'*' @ [70:100] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'totalFramesSizeMb' @ [71:20] ==> val totalFramesSizeMb: Int defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion.canBeOptimized[LocalVariableDescriptor]

'MEMORY_LIMIT_BY_METHOD_MB' @ [71:40] ==> private final val MEMORY_LIMIT_BY_METHOD_MB: Int defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion[PropertyDescriptorImpl]

'node' @ [75:29] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion.canBeOptimizedUsingSourceInterpreter[ValueParameterDescriptorImpl]

'maxLocals' @ [75:34] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [75:46] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion.canBeOptimizedUsingSourceInterpreter[ValueParameterDescriptorImpl]

'maxStack' @ [75:51] ==> public final var maxStack: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [76:30] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion.canBeOptimizedUsingSourceInterpreter[ValueParameterDescriptorImpl]

'instructions' @ [76:35] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'size' @ [76:48] ==> public open fun size(): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'toLong' @ [76:55] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodSize' @ [77:37] ==> val methodSize: Long defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion.canBeOptimizedUsingSourceInterpreter[LocalVariableDescriptor]

'methodSize' @ [77:50] ==> val methodSize: Long defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion.canBeOptimizedUsingSourceInterpreter[LocalVariableDescriptor]

'frameSize' @ [77:63] ==> val frameSize: Int defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion.canBeOptimizedUsingSourceInterpreter[LocalVariableDescriptor]

'*' @ [77:76] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'totalFramesSizeMb' @ [78:20] ==> val totalFramesSizeMb: Long defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion.canBeOptimizedUsingSourceInterpreter[LocalVariableDescriptor]

'MEMORY_LIMIT_BY_METHOD_MB' @ [78:40] ==> private final val MEMORY_LIMIT_BY_METHOD_MB: Int defined in org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.Companion[PropertyDescriptorImpl]

