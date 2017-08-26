'MethodTransformer' @ [38:45] ==> public constructor MethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaClassConstructorDescriptor]

'TransformerPass' @ [40:16] ==> public constructor TransformerPass(internalClassName: String, methodNode: MethodNode) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[ClassConstructorDescriptorImpl]

'internalClassName' @ [40:32] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.transform[ValueParameterDescriptorImpl]

'methodNode' @ [40:51] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.transform[ValueParameterDescriptorImpl]

'run' @ [40:63] ==> public final fun run(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'hashMapOf' @ [47:42] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<AbstractInsnNode, Int> /* = HashMap<AbstractInsnNode, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> Int

'analyzeTypesAndRemoveDeadCode' @ [48:41] ==> private final fun analyzeTypesAndRemoveDeadCode(stackOnThrowExceptionsHolder: MutableMap<AbstractInsnNode, Int>): Map<AbstractInsnNode, Type> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'stackOnThrowExceptions' @ [48:71] ==> val stackOnThrowExceptions: HashMap<AbstractInsnNode, Int> /* = HashMap<AbstractInsnNode, Int> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.run[LocalVariableDescriptor]

'eliminateRedundantChecks' @ [49:13] ==> private final fun eliminateRedundantChecks(checkedReferenceTypes: Map<AbstractInsnNode, Type>, stackOnThrowExceptions: MutableMap<AbstractInsnNode, Int>): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'checkedReferenceTypes' @ [49:38] ==> val checkedReferenceTypes: Map<AbstractInsnNode, Type> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.run[LocalVariableDescriptor]

'stackOnThrowExceptions' @ [49:61] ==> val stackOnThrowExceptions: HashMap<AbstractInsnNode, Int> /* = HashMap<AbstractInsnNode, Int> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.run[LocalVariableDescriptor]

'changes' @ [51:20] ==> private final var changes: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'methodNode' @ [55:25] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [55:36] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toArray' @ [55:49] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'analyze' @ [56:26] ==> @NotNull public open fun <V : (Value..Value?)> analyze(@NotNull internalClassName: String, @NotNull node: MethodNode, @NotNull interpreter: Interpreter<(BasicValue..BasicValue?)>): (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaMethodDescriptor]
Inferred types:
    <V : (Value..Value?)> -> BasicValue

'internalClassName' @ [56:34] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'methodNode' @ [56:53] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'OptimizationBasicInterpreter' @ [56:65] ==> public constructor OptimizationBasicInterpreter() defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaClassConstructorDescriptor]

'HashMap' @ [58:41] ==> public final fun <K, V> <init>(): HashMap<AbstractInsnNode, Type> /* = HashMap<AbstractInsnNode, Type> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> Type

'insns' @ [59:23] ==> val insns: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'indices' @ [59:29] ==> public val <T> Array<out (AbstractInsnNode..AbstractInsnNode?)>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'insns' @ [60:28] ==> val insns: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'i' @ [60:34] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'frames' @ [61:29] ==> val frames: (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'i' @ [61:36] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'if (insn.isInstanceOfOrNullCheck()) {
                    checkedReferenceTypes[insn] = frame?.top()?.type ?: continue
                }
                else if (insn.isCheckParameterIsNotNull() || insn.isCheckExpressionValueIsNotNull()) {
                    checkedReferenceTypes[insn] = frame?.peek(1)?.type ?: continue
                }
                else if (insn.isThrowNpeIntrinsic()) {
                    stackOnThrowExceptionsHolder[insn] = frame?.maxStackSize ?: continue
                }' @ [62:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'insn' @ [62:21] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'isInstanceOfOrNullCheck' @ [62:26] ==> internal fun AbstractInsnNode.isInstanceOfOrNullCheck(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'checkedReferenceTypes' @ [63:21] ==> val checkedReferenceTypes: HashMap<AbstractInsnNode, Type> /* = HashMap<AbstractInsnNode, Type> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'insn' @ [63:43] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'frame' @ [63:51] ==> val frame: (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'top' @ [63:58] ==> public fun <V : Value> Frame<(BasicValue..BasicValue?)>.top(): BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> (org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)

'type' @ [63:65] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'if (insn.isCheckParameterIsNotNull() || insn.isCheckExpressionValueIsNotNull()) {
                    checkedReferenceTypes[insn] = frame?.peek(1)?.type ?: continue
                }
                else if (insn.isThrowNpeIntrinsic()) {
                    stackOnThrowExceptionsHolder[insn] = frame?.maxStackSize ?: continue
                }' @ [65:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'insn' @ [65:26] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'isCheckParameterIsNotNull' @ [65:31] ==> internal fun AbstractInsnNode.isCheckParameterIsNotNull(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'insn' @ [65:62] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'isCheckExpressionValueIsNotNull' @ [65:67] ==> internal fun AbstractInsnNode.isCheckExpressionValueIsNotNull(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'checkedReferenceTypes' @ [66:21] ==> val checkedReferenceTypes: HashMap<AbstractInsnNode, Type> /* = HashMap<AbstractInsnNode, Type> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'insn' @ [66:43] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'frame' @ [66:51] ==> val frame: (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'peek' @ [66:58] ==> public fun <V : Value> Frame<(BasicValue..BasicValue?)>.peek(offset: Int): BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> (org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)

'type' @ [66:67] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'insn' @ [68:26] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'isThrowNpeIntrinsic' @ [68:31] ==> internal fun AbstractInsnNode.isThrowNpeIntrinsic(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'stackOnThrowExceptionsHolder' @ [69:21] ==> value-parameter stackOnThrowExceptionsHolder: MutableMap<AbstractInsnNode, Int> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[ValueParameterDescriptorImpl]

'insn' @ [69:50] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'frame' @ [69:58] ==> val frame: (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'maxStackSize' @ [69:65] ==> public final val <V : (Value..Value?)> Frame<(BasicValue..BasicValue?)>.maxStackSize: Int[MyPropertyDescriptor]
Inferred types:
    <V : (Value..Value?)> -> (org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)

'DeadCodeEliminationMethodTransformer' @ [73:29] ==> public constructor DeadCodeEliminationMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer[ClassConstructorDescriptorImpl]

'removeDeadCodeByFrames' @ [73:68] ==> public final fun removeDeadCodeByFrames(methodNode: MethodNode, frames: Array<out Any?>): DeadCodeEliminationMethodTransformer.Result defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [73:91] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'frames' @ [73:103] ==> val frames: (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'dceResult' @ [74:17] ==> val dceResult: DeadCodeEliminationMethodTransformer.Result defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'hasRemovedAnything' @ [74:27] ==> public final fun hasRemovedAnything(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer.Result[SimpleFunctionDescriptorImpl]

'changes' @ [75:17] ==> private final var changes: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'checkedReferenceTypes' @ [78:20] ==> val checkedReferenceTypes: HashMap<AbstractInsnNode, Type> /* = HashMap<AbstractInsnNode, Type> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeTypesAndRemoveDeadCode[LocalVariableDescriptor]

'injectNullabilityAssumptions' @ [85:42] ==> private final fun injectNullabilityAssumptions(checkedReferenceTypes: Map<AbstractInsnNode, Type>, stackOnThrowExceptions: MutableMap<AbstractInsnNode, Int>): RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'checkedReferenceTypes' @ [85:71] ==> value-parameter checkedReferenceTypes: Map<AbstractInsnNode, Type> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.eliminateRedundantChecks[ValueParameterDescriptorImpl]

'stackOnThrowExceptions' @ [85:94] ==> value-parameter stackOnThrowExceptions: MutableMap<AbstractInsnNode, Int> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.eliminateRedundantChecks[ValueParameterDescriptorImpl]

'analyzeNullabilities' @ [87:34] ==> private final fun analyzeNullabilities(): Map<AbstractInsnNode, StrictBasicValue> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'nullabilityAssumptions' @ [89:13] ==> val nullabilityAssumptions: RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.eliminateRedundantChecks[LocalVariableDescriptor]

'revert' @ [89:36] ==> public final fun revert(): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[SimpleFunctionDescriptorImpl]

'transformTrivialChecks' @ [91:13] ==> private final fun transformTrivialChecks(nullabilityMap: Map<AbstractInsnNode, StrictBasicValue>): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'nullabilityMap' @ [91:36] ==> val nullabilityMap: Map<AbstractInsnNode, StrictBasicValue> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.eliminateRedundantChecks[LocalVariableDescriptor]

'NullabilityAssumptionsBuilder' @ [97:13] ==> public constructor NullabilityAssumptionsBuilder(checkedReferenceTypes: Map<AbstractInsnNode, Type>, stackOnThrowExceptions: MutableMap<AbstractInsnNode, Int>) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[ClassConstructorDescriptorImpl]

'checkedReferenceTypes' @ [97:43] ==> value-parameter checkedReferenceTypes: Map<AbstractInsnNode, Type> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.injectNullabilityAssumptions[ValueParameterDescriptorImpl]

'stackOnThrowExceptions' @ [97:66] ==> value-parameter stackOnThrowExceptions: MutableMap<AbstractInsnNode, Int> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.injectNullabilityAssumptions[ValueParameterDescriptorImpl]

'injectNullabilityAssumptions' @ [97:90] ==> public final fun injectNullabilityAssumptions(): RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'analyze' @ [100:26] ==> @NotNull public open fun <V : (Value..Value?)> analyze(@NotNull internalClassName: String, @NotNull node: MethodNode, @NotNull interpreter: Interpreter<(BasicValue..BasicValue?)>): (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaMethodDescriptor]
Inferred types:
    <V : (Value..Value?)> -> BasicValue

'internalClassName' @ [100:34] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'methodNode' @ [100:53] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'NullabilityInterpreter' @ [100:65] ==> public constructor NullabilityInterpreter() defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter[ClassConstructorDescriptorImpl]

'methodNode' @ [101:25] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [101:36] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toArray' @ [101:49] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'LinkedHashMap' @ [102:34] ==> public final fun <K, V> <init>(): LinkedHashMap<AbstractInsnNode, StrictBasicValue> /* = LinkedHashMap<AbstractInsnNode, StrictBasicValue> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> StrictBasicValue

'insns' @ [103:23] ==> val insns: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'indices' @ [103:29] ==> public val <T> Array<out (AbstractInsnNode..AbstractInsnNode?)>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'frames' @ [104:29] ==> val frames: (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'i' @ [104:36] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'insns' @ [105:28] ==> val insns: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'i' @ [105:34] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'when {
                    insn.isInstanceOfOrNullCheck() -> frame.top()
                    insn.isCheckExpressionValueIsNotNull() -> frame.peek(1)
                    else -> null
                }' @ [107:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BasicValue?, entry1: BasicValue?, entry2: BasicValue?): BasicValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BasicValue?

'insn' @ [108:21] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'isInstanceOfOrNullCheck' @ [108:26] ==> internal fun AbstractInsnNode.isInstanceOfOrNullCheck(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'frame' @ [108:55] ==> val frame: Frame<(BasicValue..BasicValue?)> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'top' @ [108:61] ==> public fun <V : Value> Frame<(BasicValue..BasicValue?)>.top(): BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> (org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)

'insn' @ [109:21] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'isCheckExpressionValueIsNotNull' @ [109:26] ==> internal fun AbstractInsnNode.isCheckExpressionValueIsNotNull(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'frame' @ [109:63] ==> val frame: Frame<(BasicValue..BasicValue?)> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'peek' @ [109:69] ==> public fun <V : Value> Frame<(BasicValue..BasicValue?)>.peek(offset: Int): BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> (org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)

'value' @ [113:35] ==> val value: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'getNullability' @ [113:41] ==> public fun BasicValue.getNullability(): Nullability defined in org.jetbrains.kotlin.codegen.optimization.nullCheck in file nullabilityValues.kt[SimpleFunctionDescriptorImpl]

'nullability' @ [114:21] ==> val nullability: Nullability defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'NULLABLE' @ [114:48] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

'nullabilityMap' @ [115:17] ==> val nullabilityMap: LinkedHashMap<AbstractInsnNode, StrictBasicValue> /* = LinkedHashMap<AbstractInsnNode, StrictBasicValue> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'insn' @ [115:32] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'value' @ [115:40] ==> val value: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'nullabilityMap' @ [117:20] ==> val nullabilityMap: LinkedHashMap<AbstractInsnNode, StrictBasicValue> /* = LinkedHashMap<AbstractInsnNode, StrictBasicValue> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.analyzeNullabilities[LocalVariableDescriptor]

'component1' @ [121:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractInsnNode, StrictBasicValue>.component1(): AbstractInsnNode defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> StrictBasicValue

'component2' @ [121:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractInsnNode, StrictBasicValue>.component2(): StrictBasicValue defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> StrictBasicValue

'nullabilityMap' @ [121:35] ==> value-parameter nullabilityMap: Map<AbstractInsnNode, StrictBasicValue> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[ValueParameterDescriptorImpl]

'value' @ [122:35] ==> val value: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'getNullability' @ [122:41] ==> public fun BasicValue.getNullability(): Nullability defined in org.jetbrains.kotlin.codegen.optimization.nullCheck in file nullabilityValues.kt[SimpleFunctionDescriptorImpl]

'when (insn.opcode) {
                    Opcodes.IFNULL -> transformTrivialNullJump(insn as JumpInsnNode, nullability == Nullability.NULL)
                    Opcodes.IFNONNULL -> transformTrivialNullJump(insn as JumpInsnNode, nullability == Nullability.NOT_NULL)
                    Opcodes.INSTANCEOF -> transformInstanceOf(insn as TypeInsnNode, nullability, value)

                    Opcodes.INVOKESTATIC -> {
                        if (insn.isCheckExpressionValueIsNotNull()) {
                            transformTrivialCheckExpressionValueIsNotNull(insn, nullability)
                        }
                    }
                }' @ [123:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'insn' @ [123:23] ==> val insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'opcode' @ [123:28] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFNULL' @ [124:29] ==> public const final val IFNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'transformTrivialNullJump' @ [124:39] ==> private final fun transformTrivialNullJump(insn: JumpInsnNode, alwaysTrue: Boolean): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'insn' @ [124:64] ==> val insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'nullability' @ [124:86] ==> val nullability: Nullability defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'NULL' @ [124:113] ==> enum entry NULL defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

'IFNONNULL' @ [125:29] ==> public const final val IFNONNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'transformTrivialNullJump' @ [125:42] ==> private final fun transformTrivialNullJump(insn: JumpInsnNode, alwaysTrue: Boolean): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'insn' @ [125:67] ==> val insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'nullability' @ [125:89] ==> val nullability: Nullability defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'NOT_NULL' @ [125:116] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

'INSTANCEOF' @ [126:29] ==> public const final val INSTANCEOF: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'transformInstanceOf' @ [126:43] ==> private final fun transformInstanceOf(insn: TypeInsnNode, nullability: Nullability, value: StrictBasicValue): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'insn' @ [126:63] ==> val insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'nullability' @ [126:85] ==> val nullability: Nullability defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'value' @ [126:98] ==> val value: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'INVOKESTATIC' @ [128:29] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [129:29] ==> val insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'isCheckExpressionValueIsNotNull' @ [129:34] ==> internal fun AbstractInsnNode.isCheckExpressionValueIsNotNull(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'transformTrivialCheckExpressionValueIsNotNull' @ [130:29] ==> private final fun transformTrivialCheckExpressionValueIsNotNull(insn: AbstractInsnNode, nullability: Nullability): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'insn' @ [130:75] ==> val insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'nullability' @ [130:81] ==> val nullability: Nullability defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialChecks[LocalVariableDescriptor]

'changes' @ [138:13] ==> private final var changes: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'methodNode' @ [140:13] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [140:24] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [140:37] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'popReferenceValueBefore' @ [141:17] ==> internal fun InsnList.popReferenceValueBefore(insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck in file RedundantNullCheckMethodTransformer.kt[SimpleFunctionDescriptorImpl]

'insn' @ [141:41] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialNullJump[ValueParameterDescriptorImpl]

'if (alwaysTrue) {
                    set(insn, JumpInsnNode(Opcodes.GOTO, insn.label))
                }
                else {
                    remove(insn)
                }' @ [142:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'alwaysTrue' @ [142:21] ==> value-parameter alwaysTrue: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialNullJump[ValueParameterDescriptorImpl]

'set' @ [143:21] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [143:25] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialNullJump[ValueParameterDescriptorImpl]

'JumpInsnNode' @ [143:31] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'GOTO' @ [143:52] ==> public const final val GOTO: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [143:58] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialNullJump[ValueParameterDescriptorImpl]

'label' @ [143:63] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'remove' @ [146:21] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [146:28] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialNullJump[ValueParameterDescriptorImpl]

'ReifiedTypeInliner' @ [152:17] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner[FakeCallableDescriptorForObject]

'isOperationReifiedMarker' @ [152:36] ==> public final fun isOperationReifiedMarker(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner.Companion[SimpleFunctionDescriptorImpl]

'insn' @ [152:61] ==> value-parameter insn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformInstanceOf[ValueParameterDescriptorImpl]

'previous' @ [152:66] ==> public final val TypeInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'if (nullability == Nullability.NULL) {
                changes = true
                transformTrivialInstanceOf(insn, false)
            }
            else if (nullability == Nullability.NOT_NULL && value.type.internalName == insn.desc) {
                changes = true
                transformTrivialInstanceOf(insn, true)
            }' @ [153:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'nullability' @ [153:17] ==> value-parameter nullability: Nullability defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformInstanceOf[ValueParameterDescriptorImpl]

'NULL' @ [153:44] ==> enum entry NULL defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

'changes' @ [154:17] ==> private final var changes: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'transformTrivialInstanceOf' @ [155:17] ==> private final fun transformTrivialInstanceOf(insn: AbstractInsnNode, constValue: Boolean): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'insn' @ [155:44] ==> value-parameter insn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformInstanceOf[ValueParameterDescriptorImpl]

'nullability' @ [157:22] ==> value-parameter nullability: Nullability defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformInstanceOf[ValueParameterDescriptorImpl]

'NOT_NULL' @ [157:49] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

'value' @ [157:61] ==> value-parameter value: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformInstanceOf[ValueParameterDescriptorImpl]

'type' @ [157:67] ==> public final val StrictBasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'internalName' @ [157:72] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'insn' @ [157:88] ==> value-parameter insn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformInstanceOf[ValueParameterDescriptorImpl]

'desc' @ [157:93] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaPropertyDescriptor]

'changes' @ [158:17] ==> private final var changes: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'transformTrivialInstanceOf' @ [159:17] ==> private final fun transformTrivialInstanceOf(insn: AbstractInsnNode, constValue: Boolean): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[SimpleFunctionDescriptorImpl]

'insn' @ [159:44] ==> value-parameter insn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformInstanceOf[ValueParameterDescriptorImpl]

'methodNode' @ [164:13] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [164:24] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [164:37] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'popReferenceValueBefore' @ [165:17] ==> internal fun InsnList.popReferenceValueBefore(insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck in file RedundantNullCheckMethodTransformer.kt[SimpleFunctionDescriptorImpl]

'insn' @ [165:41] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialInstanceOf[ValueParameterDescriptorImpl]

'set' @ [166:17] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [166:21] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialInstanceOf[ValueParameterDescriptorImpl]

'if (constValue) InsnNode(Opcodes.ICONST_1) else InsnNode(Opcodes.ICONST_0)' @ [166:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InsnNode, elseBranch: InsnNode): InsnNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InsnNode

'constValue' @ [166:31] ==> value-parameter constValue: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialInstanceOf[ValueParameterDescriptorImpl]

'InsnNode' @ [166:43] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'ICONST_1' @ [166:60] ==> public const final val ICONST_1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'InsnNode' @ [166:75] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'ICONST_0' @ [166:92] ==> public const final val ICONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'nullability' @ [171:17] ==> value-parameter nullability: Nullability defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialCheckExpressionValueIsNotNull[ValueParameterDescriptorImpl]

'NOT_NULL' @ [171:44] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.Nullability[FakeCallableDescriptorForObject]

'insn' @ [172:27] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialCheckExpressionValueIsNotNull[ValueParameterDescriptorImpl]

'previous' @ [172:32] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'takeIf' @ [172:42] ==> @InlineOnly @SinceKotlin public inline fun <T> AbstractInsnNode.takeIf(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'it' @ [172:51] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialCheckExpressionValueIsNotNull.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [172:54] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'LDC' @ [172:72] ==> public const final val LDC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'methodNode' @ [173:13] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [173:24] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [173:37] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'popReferenceValueBefore' @ [174:17] ==> internal fun InsnList.popReferenceValueBefore(insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck in file RedundantNullCheckMethodTransformer.kt[SimpleFunctionDescriptorImpl]

'ldcInsn' @ [174:41] ==> val ldcInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialCheckExpressionValueIsNotNull[LocalVariableDescriptor]

'remove' @ [175:17] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'ldcInsn' @ [175:24] ==> val ldcInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialCheckExpressionValueIsNotNull[LocalVariableDescriptor]

'remove' @ [176:17] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [176:24] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.transformTrivialCheckExpressionValueIsNotNull[ValueParameterDescriptorImpl]

'HashMap' @ [185:53] ==> public final fun <K, V> <init>(): HashMap<Int, MutableList<AbstractInsnNode>> /* = HashMap<Int, MutableList<AbstractInsnNode>> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> Int
    <V> -> MutableList<AbstractInsnNode>

'collectVariableDependentChecks' @ [188:17] ==> private final fun collectVariableDependentChecks(): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'injectAssumptions' @ [189:24] ==> private final fun injectAssumptions(): RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'methodNode' @ [193:40] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [193:51] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'when {
                        insn.isInstanceOfOrNullCheck() -> {
                            val previous = insn.previous ?: continue@insnLoop
                            if (previous.opcode == Opcodes.ALOAD) {
                                addDependentCheck(insn, previous as VarInsnNode)
                            }
                            else if (previous.opcode == Opcodes.DUP) {
                                val previous2 = previous.previous ?: continue@insnLoop
                                if (previous2.opcode == Opcodes.ALOAD) {
                                    addDependentCheck(insn, previous2 as VarInsnNode)
                                }
                            }
                        }

                        insn.isCheckParameterIsNotNull() -> {
                            val ldcInsn = insn.previous ?: continue@insnLoop
                            if (ldcInsn.opcode != Opcodes.LDC) continue@insnLoop
                            val aLoadInsn = ldcInsn.previous ?: continue@insnLoop
                            if (aLoadInsn.opcode != Opcodes.ALOAD) continue@insnLoop
                            addDependentCheck(insn, aLoadInsn as VarInsnNode)
                        }

                        insn.isCheckExpressionValueIsNotNull() -> {
                            val ldcInsn = insn.previous ?: continue@insnLoop
                            if (ldcInsn.opcode != Opcodes.LDC) continue@insnLoop
                            var aLoadInsn: VarInsnNode? = null
                            val insn1 = ldcInsn.previous ?: continue@insnLoop
                            if (insn1.opcode == Opcodes.ALOAD) {
                                aLoadInsn = insn1 as VarInsnNode
                            }
                            else if (insn1.opcode == Opcodes.DUP) {
                                val insn2 = insn1.previous ?: continue@insnLoop
                                if (insn2.opcode == Opcodes.ALOAD) {
                                    aLoadInsn = insn2 as VarInsnNode
                                }
                            }
                            if (aLoadInsn == null) continue@insnLoop
                            addDependentCheck(insn, aLoadInsn)
                        }

                    }' @ [194:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'insn' @ [195:25] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'isInstanceOfOrNullCheck' @ [195:30] ==> internal fun AbstractInsnNode.isInstanceOfOrNullCheck(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'insn' @ [196:44] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'previous' @ [196:49] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'if (previous.opcode == Opcodes.ALOAD) {
                                addDependentCheck(insn, previous as VarInsnNode)
                            }
                            else if (previous.opcode == Opcodes.DUP) {
                                val previous2 = previous.previous ?: continue@insnLoop
                                if (previous2.opcode == Opcodes.ALOAD) {
                                    addDependentCheck(insn, previous2 as VarInsnNode)
                                }
                            }' @ [197:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'previous' @ [197:33] ==> val previous: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'opcode' @ [197:42] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ALOAD' @ [197:60] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addDependentCheck' @ [198:33] ==> private final fun addDependentCheck(insn: AbstractInsnNode, aLoadInsn: VarInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'insn' @ [198:51] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'previous' @ [198:57] ==> val previous: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'previous' @ [200:38] ==> val previous: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'opcode' @ [200:47] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'DUP' @ [200:65] ==> public const final val DUP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'previous' @ [201:49] ==> val previous: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'previous' @ [201:58] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'previous2' @ [202:37] ==> val previous2: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'opcode' @ [202:47] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ALOAD' @ [202:65] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addDependentCheck' @ [203:37] ==> private final fun addDependentCheck(insn: AbstractInsnNode, aLoadInsn: VarInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'insn' @ [203:55] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'previous2' @ [203:61] ==> val previous2: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'insn' @ [208:25] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'isCheckParameterIsNotNull' @ [208:30] ==> internal fun AbstractInsnNode.isCheckParameterIsNotNull(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'insn' @ [209:43] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'previous' @ [209:48] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'ldcInsn' @ [210:33] ==> val ldcInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'opcode' @ [210:41] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'LDC' @ [210:59] ==> public const final val LDC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ldcInsn' @ [211:45] ==> val ldcInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'previous' @ [211:53] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'aLoadInsn' @ [212:33] ==> val aLoadInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'opcode' @ [212:43] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ALOAD' @ [212:61] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addDependentCheck' @ [213:29] ==> private final fun addDependentCheck(insn: AbstractInsnNode, aLoadInsn: VarInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'insn' @ [213:47] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'aLoadInsn' @ [213:53] ==> val aLoadInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'insn' @ [216:25] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'isCheckExpressionValueIsNotNull' @ [216:30] ==> internal fun AbstractInsnNode.isCheckExpressionValueIsNotNull(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'insn' @ [217:43] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'previous' @ [217:48] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'ldcInsn' @ [218:33] ==> val ldcInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'opcode' @ [218:41] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'LDC' @ [218:59] ==> public const final val LDC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ldcInsn' @ [220:41] ==> val ldcInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'previous' @ [220:49] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'if (insn1.opcode == Opcodes.ALOAD) {
                                aLoadInsn = insn1 as VarInsnNode
                            }
                            else if (insn1.opcode == Opcodes.DUP) {
                                val insn2 = insn1.previous ?: continue@insnLoop
                                if (insn2.opcode == Opcodes.ALOAD) {
                                    aLoadInsn = insn2 as VarInsnNode
                                }
                            }' @ [221:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'insn1' @ [221:33] ==> val insn1: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'opcode' @ [221:39] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ALOAD' @ [221:57] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'aLoadInsn' @ [222:33] ==> var aLoadInsn: VarInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'insn1' @ [222:45] ==> val insn1: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'insn1' @ [224:38] ==> val insn1: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'opcode' @ [224:44] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'DUP' @ [224:62] ==> public const final val DUP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn1' @ [225:45] ==> val insn1: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'previous' @ [225:51] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'insn2' @ [226:37] ==> val insn2: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'opcode' @ [226:43] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ALOAD' @ [226:61] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'aLoadInsn' @ [227:37] ==> var aLoadInsn: VarInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'insn2' @ [227:49] ==> val insn2: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'aLoadInsn' @ [230:33] ==> var aLoadInsn: VarInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'addDependentCheck' @ [231:29] ==> private final fun addDependentCheck(insn: AbstractInsnNode, aLoadInsn: VarInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'insn' @ [231:47] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'aLoadInsn' @ [231:53] ==> var aLoadInsn: VarInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.collectVariableDependentChecks[LocalVariableDescriptor]

'checksDependingOnVariable' @ [239:17] ==> private final val checksDependingOnVariable: HashMap<Int, MutableList<AbstractInsnNode>> /* = HashMap<Int, MutableList<AbstractInsnNode>> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[PropertyDescriptorImpl]

'getOrPut' @ [239:43] ==> public inline fun <K, V> MutableMap<Int, MutableList<AbstractInsnNode>>.getOrPut(key: Int, defaultValue: () -> MutableList<AbstractInsnNode>): MutableList<AbstractInsnNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> MutableList<AbstractInsnNode>

'aLoadInsn' @ [239:52] ==> value-parameter aLoadInsn: VarInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.addDependentCheck[ValueParameterDescriptorImpl]

'`var`' @ [239:62] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'SmartList' @ [240:21] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AbstractInsnNode

'add' @ [241:19] ==> public abstract fun add(element: AbstractInsnNode): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'insn' @ [241:23] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.addDependentCheck[ValueParameterDescriptorImpl]

'NullabilityAssumptions' @ [245:46] ==> public constructor NullabilityAssumptions() defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[ClassConstructorDescriptorImpl]

'component1' @ [246:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, MutableList<AbstractInsnNode>>.component1(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> MutableList<AbstractInsnNode>

'component2' @ [246:33] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, MutableList<AbstractInsnNode>>.component2(): MutableList<AbstractInsnNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> MutableList<AbstractInsnNode>

'checksDependingOnVariable' @ [246:53] ==> private final val checksDependingOnVariable: HashMap<Int, MutableList<AbstractInsnNode>> /* = HashMap<Int, MutableList<AbstractInsnNode>> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[PropertyDescriptorImpl]

'dependentChecks' @ [247:39] ==> val dependentChecks: MutableList<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptions[LocalVariableDescriptor]

'checkedReferenceTypes' @ [248:39] ==> public final val checkedReferenceTypes: Map<AbstractInsnNode, Type> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[PropertyDescriptorImpl]

'checkInsn' @ [248:61] ==> val checkInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptions[LocalVariableDescriptor]

'OBJECT_TYPE' @ [249:51] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'nullabilityAssumptions' @ [250:25] ==> val nullabilityAssumptions: RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptions[LocalVariableDescriptor]

'injectAssumptionsForCheck' @ [250:48] ==> private final fun RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.injectAssumptionsForCheck(varIndex: Int, insn: AbstractInsnNode, varType: Type): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'varIndex' @ [250:74] ==> val varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptions[LocalVariableDescriptor]

'checkInsn' @ [250:84] ==> val checkInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptions[LocalVariableDescriptor]

'varType' @ [250:95] ==> val varType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptions[LocalVariableDescriptor]

'methodNode' @ [253:30] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [253:41] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insn' @ [254:25] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptions[LocalVariableDescriptor]

'isThrowNpeIntrinsic' @ [254:30] ==> internal fun AbstractInsnNode.isThrowNpeIntrinsic(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'nullabilityAssumptions' @ [255:25] ==> val nullabilityAssumptions: RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptions[LocalVariableDescriptor]

'injectCodeForThrowNpe' @ [255:48] ==> private final fun RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.injectCodeForThrowNpe(insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'insn' @ [255:70] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptions[LocalVariableDescriptor]

'nullabilityAssumptions' @ [258:24] ==> val nullabilityAssumptions: RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptions[LocalVariableDescriptor]

'when (insn.opcode) {
                    Opcodes.IFNULL,
                    Opcodes.IFNONNULL ->
                        injectAssumptionsForNullCheck(varIndex, insn as JumpInsnNode, varType)
                    Opcodes.INVOKESTATIC -> {
                        assert(insn.isCheckParameterIsNotNull() || insn.isCheckExpressionValueIsNotNull()) {
                            "Expected non-null assertion: ${insn.debugText}"
                        }
                        injectAssumptionsForNotNullAssertion(varIndex, insn, varType)
                    }
                    Opcodes.INSTANCEOF ->
                        injectAssumptionsForInstanceOfCheck(varIndex, insn, varType)
                }' @ [262:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'insn' @ [262:23] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'opcode' @ [262:28] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFNULL' @ [263:29] ==> public const final val IFNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFNONNULL' @ [264:29] ==> public const final val IFNONNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'injectAssumptionsForNullCheck' @ [265:25] ==> private final fun RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.injectAssumptionsForNullCheck(varIndex: Int, insn: JumpInsnNode, varType: Type): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'varIndex' @ [265:55] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'insn' @ [265:65] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'varType' @ [265:87] ==> value-parameter varType: Type defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'INVOKESTATIC' @ [266:29] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'assert' @ [267:25] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'insn' @ [267:32] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'isCheckParameterIsNotNull' @ [267:37] ==> internal fun AbstractInsnNode.isCheckParameterIsNotNull(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'insn' @ [267:68] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'isCheckExpressionValueIsNotNull' @ [267:73] ==> internal fun AbstractInsnNode.isCheckExpressionValueIsNotNull(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck[SimpleFunctionDescriptorImpl]

'insn' @ [268:61] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'debugText' @ [268:66] ==> public val AbstractInsnNode?.debugText: String defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[PropertyDescriptorImpl]

'injectAssumptionsForNotNullAssertion' @ [270:25] ==> private final fun RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.injectAssumptionsForNotNullAssertion(varIndex: Int, insn: AbstractInsnNode, varType: Type): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'varIndex' @ [270:62] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'insn' @ [270:72] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'varType' @ [270:78] ==> value-parameter varType: Type defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'INSTANCEOF' @ [272:29] ==> public const final val INSTANCEOF: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'injectAssumptionsForInstanceOfCheck' @ [273:25] ==> private final fun RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.injectAssumptionsForInstanceOfCheck(varIndex: Int, insn: AbstractInsnNode, varType: Type): Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[SimpleFunctionDescriptorImpl]

'varIndex' @ [273:61] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'insn' @ [273:71] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'varType' @ [273:77] ==> value-parameter varType: Type defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForCheck[ValueParameterDescriptorImpl]

'insn' @ [284:35] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'opcode' @ [284:40] ==> public final var JumpInsnNode.opcode: Int[MyPropertyDescriptor]

'IFNULL' @ [284:58] ==> public const final val IFNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [285:37] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'label' @ [285:42] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'originalLabels' @ [286:17] ==> public final val originalLabels: HashMap<JumpInsnNode, LabelNode> /* = HashMap<JumpInsnNode, LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[PropertyDescriptorImpl]

'insn' @ [286:32] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'originalLabel' @ [286:40] ==> val originalLabel: (LabelNode..LabelNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[LocalVariableDescriptor]

'insn' @ [287:17] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'label' @ [287:22] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'synthetic' @ [287:30] ==> public final fun <T : AbstractInsnNode> synthetic(insn: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : AbstractInsnNode> -> LabelNode

'LabelNode' @ [287:40] ==> public constructor LabelNode(p0: (Label..Label?)) defined in org.jetbrains.org.objectweb.asm.tree.LabelNode[JavaClassConstructorDescriptor]

'Label' @ [287:50] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'if (jumpsIfNull) insn.label else insn' @ [289:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (AbstractInsnNode..AbstractInsnNode?), elseBranch: (AbstractInsnNode..AbstractInsnNode?)): (AbstractInsnNode..AbstractInsnNode?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'jumpsIfNull' @ [289:43] ==> val jumpsIfNull: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[LocalVariableDescriptor]

'insn' @ [289:56] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'label' @ [289:61] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'insn' @ [289:72] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'if (jumpsIfNull) insn else insn.label' @ [290:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (AbstractInsnNode..AbstractInsnNode?), elseBranch: (AbstractInsnNode..AbstractInsnNode?)): (AbstractInsnNode..AbstractInsnNode?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'jumpsIfNull' @ [290:46] ==> val jumpsIfNull: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[LocalVariableDescriptor]

'insn' @ [290:59] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'insn' @ [290:69] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'label' @ [290:74] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'methodNode' @ [292:17] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [292:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [292:41] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'add' @ [293:21] ==> public open fun add(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [293:25] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'label' @ [293:30] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'insert' @ [295:21] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (InsnList..InsnList?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insertAfterNull' @ [295:28] ==> val insertAfterNull: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[LocalVariableDescriptor]

'listOfSynthetics' @ [295:45] ==> public final inline fun listOfSynthetics(block: InstructionAdapter.() -> Unit): InsnList defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[SimpleFunctionDescriptorImpl]

'aconst' @ [296:25] ==> public open fun aconst(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'store' @ [297:25] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'varIndex' @ [297:31] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'varType' @ [297:41] ==> value-parameter varType: Type defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'jumpsIfNull' @ [298:29] ==> val jumpsIfNull: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[LocalVariableDescriptor]

'goTo' @ [299:29] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'originalLabel' @ [299:34] ==> val originalLabel: (LabelNode..LabelNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[LocalVariableDescriptor]

'label' @ [299:48] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'insert' @ [303:21] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (InsnList..InsnList?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insertAfterNonNull' @ [303:28] ==> val insertAfterNonNull: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[LocalVariableDescriptor]

'listOfSynthetics' @ [303:48] ==> public final inline fun listOfSynthetics(block: InstructionAdapter.() -> Unit): InsnList defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[SimpleFunctionDescriptorImpl]

'anew' @ [304:25] ==> public open fun anew(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'varType' @ [304:30] ==> value-parameter varType: Type defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'store' @ [305:25] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'varIndex' @ [305:31] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'varType' @ [305:41] ==> value-parameter varType: Type defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[ValueParameterDescriptorImpl]

'!' @ [306:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'jumpsIfNull' @ [306:30] ==> val jumpsIfNull: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[LocalVariableDescriptor]

'goTo' @ [307:29] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'originalLabel' @ [307:34] ==> val originalLabel: (LabelNode..LabelNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNullCheck[LocalVariableDescriptor]

'label' @ [307:48] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'methodNode' @ [325:17] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [325:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insert' @ [325:41] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (InsnList..InsnList?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [325:48] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNotNullAssertion[ValueParameterDescriptorImpl]

'listOfSynthetics' @ [325:54] ==> public final inline fun listOfSynthetics(block: InstructionAdapter.() -> Unit): InsnList defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[SimpleFunctionDescriptorImpl]

'anew' @ [326:21] ==> public open fun anew(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'varType' @ [326:26] ==> value-parameter varType: Type defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNotNullAssertion[ValueParameterDescriptorImpl]

'store' @ [327:21] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'varIndex' @ [327:27] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNotNullAssertion[ValueParameterDescriptorImpl]

'varType' @ [327:37] ==> value-parameter varType: Type defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForNotNullAssertion[ValueParameterDescriptorImpl]

'insn' @ [339:28] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[ValueParameterDescriptorImpl]

'next' @ [339:33] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'next' @ [340:21] ==> val next: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'opcode' @ [340:26] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFEQ' @ [340:44] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'next' @ [340:52] ==> val next: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'opcode' @ [340:57] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFNE' @ [340:75] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'next' @ [341:21] ==> val next: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'next' @ [342:39] ==> val next: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'opcode' @ [342:44] ==> public final var JumpInsnNode.opcode: Int[MyPropertyDescriptor]

'IFNE' @ [342:62] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (jumpsIfInstance) {
                    originalLabel = next.label
                    originalLabels[next] = next.label
                    val newLabel = synthetic(LabelNode(Label()))
                    methodNode.instructions.add(newLabel)
                    next.label = newLabel
                    insertAfterNotNull = newLabel
                }
                else {
                    originalLabel = null
                    insertAfterNotNull = next
                }' @ [346:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'jumpsIfInstance' @ [346:21] ==> val jumpsIfInstance: Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'originalLabel' @ [347:21] ==> val originalLabel: LabelNode? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'next' @ [347:37] ==> val next: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'label' @ [347:42] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'originalLabels' @ [348:21] ==> public final val originalLabels: HashMap<JumpInsnNode, LabelNode> /* = HashMap<JumpInsnNode, LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[PropertyDescriptorImpl]

'next' @ [348:36] ==> val next: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'next' @ [348:44] ==> val next: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'label' @ [348:49] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'synthetic' @ [349:36] ==> public final fun <T : AbstractInsnNode> synthetic(insn: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : AbstractInsnNode> -> LabelNode

'LabelNode' @ [349:46] ==> public constructor LabelNode(p0: (Label..Label?)) defined in org.jetbrains.org.objectweb.asm.tree.LabelNode[JavaClassConstructorDescriptor]

'Label' @ [349:56] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'methodNode' @ [350:21] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [350:32] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'add' @ [350:45] ==> public open fun add(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'newLabel' @ [350:49] ==> val newLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'next' @ [351:21] ==> val next: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'label' @ [351:26] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'newLabel' @ [351:34] ==> val newLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'insertAfterNotNull' @ [352:21] ==> val insertAfterNotNull: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'newLabel' @ [352:42] ==> val newLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'originalLabel' @ [355:21] ==> val originalLabel: LabelNode? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'insertAfterNotNull' @ [356:21] ==> val insertAfterNotNull: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'next' @ [356:42] ==> val next: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'methodNode' @ [359:17] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [359:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [359:41] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'insert' @ [360:21] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (InsnList..InsnList?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insertAfterNotNull' @ [360:28] ==> val insertAfterNotNull: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'listOfSynthetics' @ [360:48] ==> public final inline fun listOfSynthetics(block: InstructionAdapter.() -> Unit): InsnList defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[SimpleFunctionDescriptorImpl]

'anew' @ [361:25] ==> public open fun anew(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'varType' @ [361:30] ==> value-parameter varType: Type defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[ValueParameterDescriptorImpl]

'store' @ [362:25] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'varIndex' @ [362:31] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[ValueParameterDescriptorImpl]

'varType' @ [362:41] ==> value-parameter varType: Type defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[ValueParameterDescriptorImpl]

'originalLabel' @ [363:29] ==> val originalLabel: LabelNode? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'goTo' @ [364:29] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'originalLabel' @ [364:34] ==> val originalLabel: LabelNode? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectAssumptionsForInstanceOfCheck[LocalVariableDescriptor]

'label' @ [364:48] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'methodNode' @ [371:17] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [371:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [371:41] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'insert' @ [372:21] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (InsnList..InsnList?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [372:28] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectCodeForThrowNpe[ValueParameterDescriptorImpl]

'listOfSynthetics' @ [372:34] ==> public final inline fun listOfSynthetics(block: InstructionAdapter.() -> Unit): InsnList defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[SimpleFunctionDescriptorImpl]

'aconst' @ [373:25] ==> public open fun aconst(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'athrow' @ [374:25] ==> public open fun athrow(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'methodNode' @ [378:17] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'maxStack' @ [378:28] ==> public final var maxStack: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'max' @ [378:44] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'methodNode' @ [378:48] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'maxStack' @ [378:59] ==> public final var maxStack: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'+' @ [378:69] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'stackOnThrowExceptions' @ [378:70] ==> public final val stackOnThrowExceptions: MutableMap<AbstractInsnNode, Int> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder[PropertyDescriptorImpl]

'insn' @ [378:93] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptionsBuilder.injectCodeForThrowNpe[ValueParameterDescriptorImpl]

'-' @ [378:102] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'HashMap' @ [384:34] ==> public final fun <K, V> <init>(): HashMap<JumpInsnNode, LabelNode> /* = HashMap<JumpInsnNode, LabelNode> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> JumpInsnNode
    <V> -> LabelNode

'ArrayList' @ [385:41] ==> public final fun <E> <init>(): ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> AbstractInsnNode

'syntheticInstructions' @ [388:17] ==> public final val syntheticInstructions: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[PropertyDescriptorImpl]

'add' @ [388:39] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'insn' @ [388:43] ==> value-parameter insn: T defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.synthetic[ValueParameterDescriptorImpl]

'insn' @ [389:24] ==> value-parameter insn: T defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.synthetic[ValueParameterDescriptorImpl]

'withInstructionAdapter' @ [393:32] ==> public inline fun withInstructionAdapter(block: InstructionAdapter.() -> Unit): InsnList defined in org.jetbrains.kotlin.codegen.coroutines[SimpleFunctionDescriptorImpl]

'block' @ [393:55] ==> value-parameter block: InstructionAdapter.() -> Unit defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.listOfSynthetics[ValueParameterDescriptorImpl]

'insnList' @ [394:30] ==> val insnList: InsnList defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.listOfSynthetics[LocalVariableDescriptor]

'synthetic' @ [395:21] ==> public final fun <T : AbstractInsnNode> synthetic(insn: (AbstractInsnNode..AbstractInsnNode?)): (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : AbstractInsnNode> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'insn' @ [395:31] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.listOfSynthetics[LocalVariableDescriptor]

'insnList' @ [397:24] ==> val insnList: InsnList defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.listOfSynthetics[LocalVariableDescriptor]

'methodNode' @ [401:17] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass[PropertyDescriptorImpl]

'instructions' @ [401:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [401:41] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'syntheticInstructions' @ [402:21] ==> public final val syntheticInstructions: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[PropertyDescriptorImpl]

'forEach' @ [402:43] ==> @HidesMembers public inline fun <T> Iterable<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'remove' @ [402:53] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'it' @ [402:60] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.revert.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [404:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<JumpInsnNode, LabelNode>.component1(): JumpInsnNode defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JumpInsnNode
    <V> -> LabelNode

'component2' @ [404:33] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<JumpInsnNode, LabelNode>.component2(): LabelNode defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JumpInsnNode
    <V> -> LabelNode

'originalLabels' @ [404:51] ==> public final val originalLabels: HashMap<JumpInsnNode, LabelNode> /* = HashMap<JumpInsnNode, LabelNode> */ defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions[PropertyDescriptorImpl]

'jumpInsn' @ [405:21] ==> val jumpInsn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.revert[LocalVariableDescriptor]

'label' @ [405:30] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'originalLabel' @ [405:38] ==> val originalLabel: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.RedundantNullCheckMethodTransformer.TransformerPass.NullabilityAssumptions.revert[LocalVariableDescriptor]

'opcode' @ [413:9] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'INSTANCEOF' @ [413:27] ==> public const final val INSTANCEOF: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [414:9] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFNULL' @ [414:27] ==> public const final val IFNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [415:9] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFNONNULL' @ [415:27] ==> public const final val IFNONNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isInsn' @ [418:9] ==> internal inline fun <reified T : AbstractInsnNode> AbstractInsnNode.isInsn(opcode: Int, condition: MethodInsnNode.() -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.optimization.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : AbstractInsnNode> -> MethodInsnNode

'INVOKESTATIC' @ [418:40] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'owner' @ [419:13] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'INTRINSICS_CLASS_NAME' @ [419:39] ==> public const final val INTRINSICS_CLASS_NAME: String defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethods[JavaPropertyDescriptor]

'name' @ [420:13] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'desc' @ [421:13] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'isInsn' @ [425:9] ==> internal inline fun <reified T : AbstractInsnNode> AbstractInsnNode.isInsn(opcode: Int, condition: MethodInsnNode.() -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.optimization.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : AbstractInsnNode> -> MethodInsnNode

'INVOKESTATIC' @ [425:40] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'owner' @ [426:13] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'INTRINSICS_CLASS_NAME' @ [426:39] ==> public const final val INTRINSICS_CLASS_NAME: String defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethods[JavaPropertyDescriptor]

'name' @ [427:13] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'desc' @ [428:13] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'isInsn' @ [432:9] ==> internal inline fun <reified T : AbstractInsnNode> AbstractInsnNode.isInsn(opcode: Int, condition: MethodInsnNode.() -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.optimization.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : AbstractInsnNode> -> MethodInsnNode

'INVOKESTATIC' @ [432:40] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'owner' @ [433:13] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'INTRINSICS_CLASS_NAME' @ [433:39] ==> public const final val INTRINSICS_CLASS_NAME: String defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethods[JavaPropertyDescriptor]

'name' @ [434:13] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'desc' @ [435:13] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'insn' @ [439:16] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.popReferenceValueBefore[ValueParameterDescriptorImpl]

'previous' @ [439:21] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'when (prev?.opcode) {
        Opcodes.ACONST_NULL,
        Opcodes.DUP,
        Opcodes.ALOAD ->
            remove(prev)
        else ->
            insertBefore(insn, InsnNode(Opcodes.POP))
    }' @ [440:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'prev' @ [440:11] ==> val prev: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.popReferenceValueBefore[LocalVariableDescriptor]

'opcode' @ [440:17] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ACONST_NULL' @ [441:17] ==> public const final val ACONST_NULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'DUP' @ [442:17] ==> public const final val DUP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ALOAD' @ [443:17] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'remove' @ [444:13] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'prev' @ [444:20] ==> val prev: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.popReferenceValueBefore[LocalVariableDescriptor]

'insertBefore' @ [446:13] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [446:26] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.popReferenceValueBefore[ValueParameterDescriptorImpl]

'InsnNode' @ [446:32] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'POP' @ [446:49] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

