'MethodTransformer' @ [38:42] ==> public constructor MethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaClassConstructorDescriptor]

'RedundantBoxingInterpreter' @ [41:27] ==> public constructor RedundantBoxingInterpreter(insnList: InsnList) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingInterpreter[ClassConstructorDescriptorImpl]

'node' @ [41:54] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[ValueParameterDescriptorImpl]

'instructions' @ [41:59] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'analyze' @ [42:40] ==> @NotNull public open fun <V : (Value..Value?)> analyze(@NotNull internalClassName: String, @NotNull node: MethodNode, @NotNull interpreter: Interpreter<(BasicValue..BasicValue?)>): (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaMethodDescriptor]
Inferred types:
    <V : (Value..Value?)> -> BasicValue

'internalClassName' @ [42:48] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[ValueParameterDescriptorImpl]

'node' @ [42:67] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[ValueParameterDescriptorImpl]

'interpreter' @ [42:73] ==> val interpreter: RedundantBoxingInterpreter defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[LocalVariableDescriptor]

'interpretPopInstructionsForBoxedValues' @ [44:9] ==> private final fun interpretPopInstructionsForBoxedValues(interpreter: RedundantBoxingInterpreter, node: MethodNode, frames: Array<out Frame<BasicValue>?>): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'interpreter' @ [44:48] ==> val interpreter: RedundantBoxingInterpreter defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[LocalVariableDescriptor]

'node' @ [44:61] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[ValueParameterDescriptorImpl]

'frames' @ [44:67] ==> val frames: (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[LocalVariableDescriptor]

'interpreter' @ [46:32] ==> val interpreter: RedundantBoxingInterpreter defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[LocalVariableDescriptor]

'candidatesBoxedValues' @ [46:44] ==> public final val candidatesBoxedValues: RedundantBoxedValuesCollection defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingInterpreter[PropertyDescriptorImpl]

'!' @ [48:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'valuesToOptimize' @ [48:14] ==> val valuesToOptimize: RedundantBoxedValuesCollection defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[LocalVariableDescriptor]

'isEmpty' @ [48:31] ==> public final val RedundantBoxedValuesCollection.isEmpty: Boolean[MyPropertyDescriptor]

'removeValuesClashingWithVariables' @ [50:13] ==> private final fun removeValuesClashingWithVariables(values: RedundantBoxedValuesCollection, node: MethodNode, frames: Array<Frame<BasicValue>>): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'valuesToOptimize' @ [50:47] ==> val valuesToOptimize: RedundantBoxedValuesCollection defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[LocalVariableDescriptor]

'node' @ [50:65] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[ValueParameterDescriptorImpl]

'frames' @ [50:71] ==> val frames: (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[LocalVariableDescriptor]

'adaptLocalVariableTableForBoxedValues' @ [52:13] ==> private final fun adaptLocalVariableTableForBoxedValues(node: MethodNode, frames: Array<Frame<BasicValue>>): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [52:51] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[ValueParameterDescriptorImpl]

'frames' @ [52:57] ==> val frames: (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[LocalVariableDescriptor]

'node' @ [54:13] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[ValueParameterDescriptorImpl]

'remapLocalVariables' @ [54:18] ==> public fun MethodNode.remapLocalVariables(remapping: IntArray): Unit defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'buildVariablesRemapping' @ [54:38] ==> private final fun buildVariablesRemapping(values: RedundantBoxedValuesCollection, node: MethodNode): IntArray defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'valuesToOptimize' @ [54:62] ==> val valuesToOptimize: RedundantBoxedValuesCollection defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[LocalVariableDescriptor]

'node' @ [54:80] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[ValueParameterDescriptorImpl]

'adaptInstructionsForBoxedValues' @ [56:13] ==> private final fun adaptInstructionsForBoxedValues(node: MethodNode, values: RedundantBoxedValuesCollection): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [56:45] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[ValueParameterDescriptorImpl]

'valuesToOptimize' @ [56:51] ==> val valuesToOptimize: RedundantBoxedValuesCollection defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.transform[LocalVariableDescriptor]

'frames' @ [65:19] ==> value-parameter frames: Array<out Frame<BasicValue>?> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[ValueParameterDescriptorImpl]

'indices' @ [65:26] ==> public val <T> Array<out Frame<BasicValue>?>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Frame<BasicValue>?

'node' @ [66:24] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[ValueParameterDescriptorImpl]

'instructions' @ [66:29] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'i' @ [66:42] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[LocalVariableDescriptor]

'insn' @ [67:17] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[LocalVariableDescriptor]

'opcode' @ [67:22] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'POP' @ [67:40] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [67:47] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[LocalVariableDescriptor]

'opcode' @ [67:52] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'POP2' @ [67:70] ==> public const final val POP2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'frames' @ [71:25] ==> value-parameter frames: Array<out Frame<BasicValue>?> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[ValueParameterDescriptorImpl]

'i' @ [71:32] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[LocalVariableDescriptor]

'frame' @ [73:23] ==> val frame: Frame<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[LocalVariableDescriptor]

'top' @ [73:29] ==> public fun <V : Value> Frame<BasicValue>.top(): BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> BasicValue

'interpreter' @ [74:13] ==> value-parameter interpreter: RedundantBoxingInterpreter defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[ValueParameterDescriptorImpl]

'processPopInstruction' @ [74:25] ==> public final fun processPopInstruction(insnNode: AbstractInsnNode, value: BasicValue): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [74:47] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[LocalVariableDescriptor]

'top' @ [74:53] ==> val top: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[LocalVariableDescriptor]

'top' @ [76:17] ==> val top: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[LocalVariableDescriptor]

'size' @ [76:21] ==> public final val BasicValue.size: Int[MyPropertyDescriptor]

'insn' @ [76:34] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[LocalVariableDescriptor]

'opcode' @ [76:39] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'POP2' @ [76:57] ==> public const final val POP2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'interpreter' @ [77:17] ==> value-parameter interpreter: RedundantBoxingInterpreter defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[ValueParameterDescriptorImpl]

'processPopInstruction' @ [77:29] ==> public final fun processPopInstruction(insnNode: AbstractInsnNode, value: BasicValue): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [77:51] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[LocalVariableDescriptor]

'frame' @ [77:57] ==> val frame: Frame<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.interpretPopInstructionsForBoxedValues[LocalVariableDescriptor]

'peek' @ [77:63] ==> public fun <V : Value> Frame<BasicValue>.peek(offset: Int): BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> BasicValue

'removeValuesClashingWithVariablesPass' @ [87:16] ==> private final fun removeValuesClashingWithVariablesPass(values: RedundantBoxedValuesCollection, node: MethodNode, frames: Array<out Frame<BasicValue>?>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'values' @ [87:54] ==> value-parameter values: RedundantBoxedValuesCollection defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariables[ValueParameterDescriptorImpl]

'node' @ [87:62] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariables[ValueParameterDescriptorImpl]

'frames' @ [87:68] ==> value-parameter frames: Array<Frame<BasicValue>> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariables[ValueParameterDescriptorImpl]

'node' @ [99:35] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[ValueParameterDescriptorImpl]

'localVariables' @ [99:40] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'!=' @ [100:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'getType' @ [100:22] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'localVariableNode' @ [100:30] ==> val localVariableNode: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'desc' @ [100:48] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'sort' @ [100:54] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'OBJECT' @ [100:67] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'getValuesStoredOrLoadedToVariable' @ [104:34] ==> private final fun getValuesStoredOrLoadedToVariable(localVariableNode: LocalVariableNode, node: MethodNode, frames: Array<out Frame<BasicValue>?>): List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'localVariableNode' @ [104:68] ==> val localVariableNode: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'node' @ [104:87] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[ValueParameterDescriptorImpl]

'frames' @ [104:93] ==> value-parameter frames: Array<out Frame<BasicValue>?> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[ValueParameterDescriptorImpl]

'variableValues' @ [106:25] ==> val variableValues: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'filterIsInstance' @ [106:40] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<BoxedBasicValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> BoxedBasicValue

'boxed' @ [108:17] ==> val boxed: List<BoxedBasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'isEmpty' @ [108:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'boxed' @ [110:30] ==> val boxed: List<BoxedBasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'first' @ [110:36] ==> public fun <T> List<BoxedBasicValue>.first(): BoxedBasicValue defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BoxedBasicValue

'descriptor' @ [110:44] ==> public abstract val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[PropertyDescriptorImpl]

'isUnsafeToRemoveBoxingForConnectedValues' @ [111:17] ==> private final fun isUnsafeToRemoveBoxingForConnectedValues(usedValues: List<BasicValue>, unboxedType: Type): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'variableValues' @ [111:58] ==> val variableValues: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'firstBoxed' @ [111:74] ==> val firstBoxed: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'unboxedType' @ [111:85] ==> public final val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'boxed' @ [112:31] ==> val boxed: List<BoxedBasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'value' @ [113:38] ==> val value: BoxedBasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'descriptor' @ [113:44] ==> public abstract val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[PropertyDescriptorImpl]

'descriptor' @ [114:25] ==> val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'isSafeToRemove' @ [114:36] ==> public final var isSafeToRemove: Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'values' @ [115:25] ==> value-parameter values: RedundantBoxedValuesCollection defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[ValueParameterDescriptorImpl]

'remove' @ [115:32] ==> public open fun remove(@NotNull descriptor: BoxedValueDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxedValuesCollection[JavaMethodDescriptor]

'descriptor' @ [115:39] ==> val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'needToRepeat' @ [116:25] ==> var needToRepeat: Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'needToRepeat' @ [122:16] ==> var needToRepeat: Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.removeValuesClashingWithVariablesPass[LocalVariableDescriptor]

'usedValues' @ [126:13] ==> value-parameter usedValues: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.isUnsafeToRemoveBoxingForConnectedValues[ValueParameterDescriptorImpl]

'any' @ [126:24] ==> public inline fun <T> Iterable<BasicValue>.any(predicate: (BasicValue) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'input' @ [127:21] ==> value-parameter input: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.isUnsafeToRemoveBoxingForConnectedValues.<anonymous>[ValueParameterDescriptorImpl]

'StrictBasicValue' @ [127:31] ==> public companion object defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[FakeCallableDescriptorForObject]

'UNINITIALIZED_VALUE' @ [127:48] ==> @JvmField public final val UNINITIALIZED_VALUE: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue.Companion[PropertyDescriptorImpl]

'input' @ [128:21] ==> value-parameter input: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.isUnsafeToRemoveBoxingForConnectedValues.<anonymous>[ValueParameterDescriptorImpl]

'input' @ [130:34] ==> value-parameter input: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.isUnsafeToRemoveBoxingForConnectedValues.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [130:40] ==> public abstract val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[PropertyDescriptorImpl]

'!' @ [131:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [131:18] ==> val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.isUnsafeToRemoveBoxingForConnectedValues.<anonymous>[LocalVariableDescriptor]

'isSafeToRemove' @ [131:29] ==> public final var isSafeToRemove: Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'descriptor' @ [131:47] ==> val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.isUnsafeToRemoveBoxingForConnectedValues.<anonymous>[LocalVariableDescriptor]

'unboxedType' @ [131:58] ==> public final val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'unboxedType' @ [131:73] ==> value-parameter unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.isUnsafeToRemoveBoxingForConnectedValues[ValueParameterDescriptorImpl]

'node' @ [135:35] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptLocalVariableTableForBoxedValues[ValueParameterDescriptorImpl]

'localVariables' @ [135:40] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'!=' @ [136:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'getType' @ [136:22] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'localVariableNode' @ [136:30] ==> val localVariableNode: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptLocalVariableTableForBoxedValues[LocalVariableDescriptor]

'desc' @ [136:48] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'sort' @ [136:54] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'OBJECT' @ [136:67] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'getValuesStoredOrLoadedToVariable' @ [140:27] ==> private final fun getValuesStoredOrLoadedToVariable(localVariableNode: LocalVariableNode, node: MethodNode, frames: Array<out Frame<BasicValue>?>): List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'localVariableNode' @ [140:61] ==> val localVariableNode: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptLocalVariableTableForBoxedValues[LocalVariableDescriptor]

'node' @ [140:80] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptLocalVariableTableForBoxedValues[ValueParameterDescriptorImpl]

'frames' @ [140:86] ==> value-parameter frames: Array<Frame<BasicValue>> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptLocalVariableTableForBoxedValues[ValueParameterDescriptorImpl]

'value' @ [141:21] ==> val value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptLocalVariableTableForBoxedValues[LocalVariableDescriptor]

'value' @ [143:34] ==> val value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptLocalVariableTableForBoxedValues[LocalVariableDescriptor]

'descriptor' @ [143:40] ==> public abstract val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[PropertyDescriptorImpl]

'!' @ [144:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [144:22] ==> val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptLocalVariableTableForBoxedValues[LocalVariableDescriptor]

'isSafeToRemove' @ [144:33] ==> public final var isSafeToRemove: Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'localVariableNode' @ [145:17] ==> val localVariableNode: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptLocalVariableTableForBoxedValues[LocalVariableDescriptor]

'desc' @ [145:35] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'descriptor' @ [145:42] ==> val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptLocalVariableTableForBoxedValues[LocalVariableDescriptor]

'unboxedType' @ [145:53] ==> public final val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'descriptor' @ [145:65] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'ArrayList' @ [155:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> BasicValue

'node' @ [156:24] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[ValueParameterDescriptorImpl]

'instructions' @ [156:29] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insnList' @ [157:34] ==> val insnList: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'indexOf' @ [157:43] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'localVariableNode' @ [157:51] ==> value-parameter localVariableNode: LocalVariableNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[ValueParameterDescriptorImpl]

'start' @ [157:69] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'insnList' @ [158:32] ==> val insnList: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'indexOf' @ [158:41] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'localVariableNode' @ [158:49] ==> value-parameter localVariableNode: LocalVariableNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[ValueParameterDescriptorImpl]

'end' @ [158:67] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'frames' @ [160:9] ==> value-parameter frames: Array<out Frame<BasicValue>?> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[ValueParameterDescriptorImpl]

'localVariableStart' @ [160:16] ==> val localVariableStart: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'let' @ [160:37] ==> @InlineOnly public inline fun <T, R> Frame<BasicValue>.let(block: (Frame<BasicValue>) -> Boolean?): Boolean? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Frame<BasicValue>
    <R> -> Boolean?

'frameForStartInsn' @ [161:13] ==> value-parameter frameForStartInsn: Frame<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable.<anonymous>[ValueParameterDescriptorImpl]

'getLocal' @ [161:31] ==> public open fun getLocal(p0: Int): (BasicValue..BasicValue?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'localVariableNode' @ [161:40] ==> value-parameter localVariableNode: LocalVariableNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[ValueParameterDescriptorImpl]

'index' @ [161:58] ==> public final var index: Int defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'let' @ [161:66] ==> @InlineOnly public inline fun <T, R> BasicValue.let(block: (BasicValue) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue
    <R> -> Boolean

'values' @ [162:17] ==> val values: ArrayList<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'add' @ [162:24] ==> public open fun add(element: BasicValue): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'localVarValue' @ [162:28] ==> value-parameter localVarValue: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'localVariableStart' @ [166:19] ==> val localVariableStart: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'localVariableEnd' @ [166:44] ==> val localVariableEnd: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'i' @ [167:17] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'i' @ [167:26] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'insnList' @ [167:31] ==> val insnList: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'size' @ [167:40] ==> public open fun size(): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'frames' @ [168:25] ==> value-parameter frames: Array<out Frame<BasicValue>?> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[ValueParameterDescriptorImpl]

'i' @ [168:32] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'insnList' @ [169:24] ==> val insnList: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'i' @ [169:33] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'insn' @ [170:18] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'opcode' @ [170:23] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ASTORE' @ [170:41] ==> public const final val ASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [170:51] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'opcode' @ [170:56] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ALOAD' @ [170:74] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'==' @ [171:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'insn' @ [171:18] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'`var`' @ [171:39] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'localVariableNode' @ [171:48] ==> value-parameter localVariableNode: LocalVariableNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[ValueParameterDescriptorImpl]

'index' @ [171:66] ==> public final var index: Int defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'if (insn.getOpcode() == Opcodes.ASTORE) {
                    values.add(frame.top()!!)
                }
                else {
                    values.add(frame.getLocal(insn.`var`))
                }' @ [172:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'insn' @ [172:21] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'getOpcode' @ [172:26] ==> public open fun getOpcode(): Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaMethodDescriptor]

'ASTORE' @ [172:49] ==> public const final val ASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'values' @ [173:21] ==> val values: ArrayList<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'add' @ [173:28] ==> public open fun add(element: BasicValue): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'frame' @ [173:32] ==> val frame: Frame<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'top' @ [173:38] ==> public fun <V : Value> Frame<BasicValue>.top(): BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> BasicValue

'values' @ [176:21] ==> val values: ArrayList<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'add' @ [176:28] ==> public open fun add(element: BasicValue): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'frame' @ [176:32] ==> val frame: Frame<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'getLocal' @ [176:38] ==> public open fun getLocal(p0: Int): (BasicValue..BasicValue?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'insn' @ [176:47] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'`var`' @ [176:52] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'values' @ [181:16] ==> val values: ArrayList<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.getValuesStoredOrLoadedToVariable[LocalVariableDescriptor]

'HashSet' @ [185:31] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'values' @ [186:33] ==> value-parameter values: RedundantBoxedValuesCollection defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[ValueParameterDescriptorImpl]

'valueDescriptor' @ [187:17] ==> val valueDescriptor: (BoxedValueDescriptor..BoxedValueDescriptor?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'isDoubleSize' @ [187:33] ==> public final fun isDoubleSize(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[SimpleFunctionDescriptorImpl]

'doubleSizedVars' @ [188:17] ==> val doubleSizedVars: HashSet<Int> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'addAll' @ [188:33] ==> public open fun addAll(elements: Collection<Int>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'valueDescriptor' @ [188:40] ==> val valueDescriptor: (BoxedValueDescriptor..BoxedValueDescriptor?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'getVariablesIndexes' @ [188:56] ==> public final fun getVariablesIndexes(): List<Int> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[SimpleFunctionDescriptorImpl]

'node' @ [192:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[ValueParameterDescriptorImpl]

'maxLocals' @ [192:14] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'doubleSizedVars' @ [192:27] ==> val doubleSizedVars: HashSet<Int> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'size' @ [192:43] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'IntArray' @ [193:25] ==> public constructor IntArray(size: Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'node' @ [193:34] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[ValueParameterDescriptorImpl]

'maxLocals' @ [193:39] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remapping' @ [194:19] ==> val remapping: IntArray defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'indices' @ [194:29] ==> public val IntArray.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'remapping' @ [195:13] ==> val remapping: IntArray defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'i' @ [195:23] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'i' @ [195:28] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'doubleSizedVars' @ [198:26] ==> val doubleSizedVars: HashSet<Int> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'varIndex' @ [199:23] ==> val varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'remapping' @ [199:37] ==> val remapping: IntArray defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'lastIndex' @ [199:47] ==> public val IntArray.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]

'remapping' @ [200:17] ==> val remapping: IntArray defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'i' @ [200:27] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'remapping' @ [204:16] ==> val remapping: IntArray defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.buildVariablesRemapping[LocalVariableDescriptor]

'values' @ [211:23] ==> value-parameter values: RedundantBoxedValuesCollection defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValues[ValueParameterDescriptorImpl]

'adaptInstructionsForBoxedValue' @ [212:13] ==> private final fun adaptInstructionsForBoxedValue(node: MethodNode, value: BoxedValueDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [212:44] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValues[ValueParameterDescriptorImpl]

'value' @ [212:50] ==> val value: (BoxedValueDescriptor..BoxedValueDescriptor?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValues[LocalVariableDescriptor]

'adaptBoxingInstruction' @ [217:9] ==> private final fun adaptBoxingInstruction(node: MethodNode, value: BoxedValueDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [217:32] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValue[ValueParameterDescriptorImpl]

'value' @ [217:38] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValue[ValueParameterDescriptorImpl]

'value' @ [219:22] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValue[ValueParameterDescriptorImpl]

'getUnboxingWithCastInsns' @ [219:28] ==> public final fun getUnboxingWithCastInsns(): Set<Pair<AbstractInsnNode, Type>> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[SimpleFunctionDescriptorImpl]

'adaptCastInstruction' @ [220:13] ==> private final fun adaptCastInstruction(node: MethodNode, value: BoxedValueDescriptor, castWithType: Pair<AbstractInsnNode, Type>): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [220:34] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValue[ValueParameterDescriptorImpl]

'value' @ [220:40] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValue[ValueParameterDescriptorImpl]

'cast' @ [220:47] ==> val cast: Pair<AbstractInsnNode, Type> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValue[LocalVariableDescriptor]

'value' @ [223:22] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValue[ValueParameterDescriptorImpl]

'getAssociatedInsns' @ [223:28] ==> public final fun getAssociatedInsns(): List<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[SimpleFunctionDescriptorImpl]

'adaptInstruction' @ [224:13] ==> private final fun adaptInstruction(node: MethodNode, insn: AbstractInsnNode, value: BoxedValueDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [224:30] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValue[ValueParameterDescriptorImpl]

'insn' @ [224:36] ==> val insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValue[LocalVariableDescriptor]

'value' @ [224:42] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstructionsForBoxedValue[ValueParameterDescriptorImpl]

'if (!value.isFromProgressionIterator()) {
            node.instructions.remove(value.boxingInsn)
        }
        else {
            val iterator = value.progressionIterator ?: error("iterator should not be null because isFromProgressionIterator returns true")

            //add checkcast to kotlin/<T>Iterator before next() call
            node.instructions.insertBefore(value.boxingInsn, TypeInsnNode(Opcodes.CHECKCAST, iterator.type.internalName))

            //invoke concrete method (kotlin/<T>iterator.next<T>())
            node.instructions.set(
                    value.boxingInsn,
                    MethodInsnNode(
                            Opcodes.INVOKEVIRTUAL,
                            iterator.type.internalName, iterator.nextMethodName, iterator.nextMethodDesc,
                            false
                    )
            )
        }' @ [229:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [229:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'value' @ [229:14] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[ValueParameterDescriptorImpl]

'isFromProgressionIterator' @ [229:20] ==> public final fun isFromProgressionIterator(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[SimpleFunctionDescriptorImpl]

'node' @ [230:13] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[ValueParameterDescriptorImpl]

'instructions' @ [230:18] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [230:31] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'value' @ [230:38] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[ValueParameterDescriptorImpl]

'boxingInsn' @ [230:44] ==> public final val boxingInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'value' @ [233:28] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[ValueParameterDescriptorImpl]

'progressionIterator' @ [233:34] ==> public final val progressionIterator: ProgressionIteratorBasicValue? defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'error' @ [233:57] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'node' @ [236:13] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[ValueParameterDescriptorImpl]

'instructions' @ [236:18] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [236:31] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'value' @ [236:44] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[ValueParameterDescriptorImpl]

'boxingInsn' @ [236:50] ==> public final val boxingInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'TypeInsnNode' @ [236:62] ==> public constructor TypeInsnNode(p0: Int, p1: (String..String?)) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaClassConstructorDescriptor]

'CHECKCAST' @ [236:83] ==> public const final val CHECKCAST: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'iterator' @ [236:94] ==> val iterator: ProgressionIteratorBasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[LocalVariableDescriptor]

'type' @ [236:103] ==> public final val ProgressionIteratorBasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'internalName' @ [236:108] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'node' @ [239:13] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[ValueParameterDescriptorImpl]

'instructions' @ [239:18] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'set' @ [239:31] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'value' @ [240:21] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[ValueParameterDescriptorImpl]

'boxingInsn' @ [240:27] ==> public final val boxingInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'MethodInsnNode' @ [241:21] ==> public constructor MethodInsnNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaClassConstructorDescriptor]

'INVOKEVIRTUAL' @ [242:37] ==> public const final val INVOKEVIRTUAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'iterator' @ [243:29] ==> val iterator: ProgressionIteratorBasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[LocalVariableDescriptor]

'type' @ [243:38] ==> public final val ProgressionIteratorBasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'internalName' @ [243:43] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'iterator' @ [243:57] ==> val iterator: ProgressionIteratorBasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[LocalVariableDescriptor]

'nextMethodName' @ [243:66] ==> public final val ProgressionIteratorBasicValue.nextMethodName: String[MyPropertyDescriptor]

'iterator' @ [243:82] ==> val iterator: ProgressionIteratorBasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptBoxingInstruction[LocalVariableDescriptor]

'nextMethodDesc' @ [243:91] ==> public final val ProgressionIteratorBasicValue.nextMethodDesc: String[MyPropertyDescriptor]

'castWithType' @ [255:24] ==> value-parameter castWithType: Pair<AbstractInsnNode, Type> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptCastInstruction[ValueParameterDescriptorImpl]

'getFirst' @ [255:37] ==> public final fun getFirst(): (AbstractInsnNode..AbstractInsnNode?) defined in com.intellij.openapi.util.Pair[JavaMethodDescriptor]

'MethodNode' @ [256:33] ==> public constructor MethodNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'ASM5' @ [256:52] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'InstructionAdapter' @ [257:9] ==> public constructor InstructionAdapter(p0: (MethodVisitor..MethodVisitor?)) defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaClassConstructorDescriptor]

'castInsnsListener' @ [257:28] ==> val castInsnsListener: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptCastInstruction[LocalVariableDescriptor]

'cast' @ [257:47] ==> public open fun cast(p0: (Type..Type?), p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'value' @ [257:52] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptCastInstruction[ValueParameterDescriptorImpl]

'unboxedType' @ [257:58] ==> public final val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'castWithType' @ [257:71] ==> value-parameter castWithType: Pair<AbstractInsnNode, Type> defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptCastInstruction[ValueParameterDescriptorImpl]

'getSecond' @ [257:84] ==> public final fun getSecond(): (Type..Type?) defined in com.intellij.openapi.util.Pair[JavaMethodDescriptor]

'castInsnsListener' @ [259:22] ==> val castInsnsListener: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptCastInstruction[LocalVariableDescriptor]

'instructions' @ [259:40] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toArray' @ [259:53] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'node' @ [260:13] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptCastInstruction[ValueParameterDescriptorImpl]

'instructions' @ [260:18] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [260:31] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'castInsn' @ [260:44] ==> val castInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptCastInstruction[LocalVariableDescriptor]

'insn' @ [260:54] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptCastInstruction[LocalVariableDescriptor]

'node' @ [263:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptCastInstruction[ValueParameterDescriptorImpl]

'instructions' @ [263:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [263:27] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'castInsn' @ [263:34] ==> val castInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptCastInstruction[LocalVariableDescriptor]

'value' @ [269:28] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'isDoubleSize' @ [269:34] ==> public final fun isDoubleSize(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[SimpleFunctionDescriptorImpl]

'when (insn.opcode) {
            Opcodes.POP ->
                if (isDoubleSize) {
                    node.instructions.set(insn, InsnNode(Opcodes.POP2))
                }

            Opcodes.DUP ->
                if (isDoubleSize) {
                    node.instructions.set(insn, InsnNode(Opcodes.DUP2))
                }

            Opcodes.ASTORE, Opcodes.ALOAD -> {
                val storeOpcode = value.unboxedType.getOpcode(if (insn.opcode == Opcodes.ASTORE) Opcodes.ISTORE else Opcodes.ILOAD)
                node.instructions.set(insn, VarInsnNode(storeOpcode, (insn as VarInsnNode).`var`))
            }

            Opcodes.INSTANCEOF -> {
                node.instructions.insertBefore(
                        insn,
                        InsnNode(if (isDoubleSize) Opcodes.POP2 else Opcodes.POP)
                )
                node.instructions.set(insn, InsnNode(Opcodes.ICONST_1))
            }

            Opcodes.INVOKESTATIC -> {
                when {
                    insn.isAreEqualIntrinsic() ->
                        adaptAreEqualIntrinsic(node, insn, value)
                    insn.isJavaLangComparableCompareTo() ->
                        adaptJavaLangComparableCompareTo(node, insn, value)
                    insn.isJavaLangClassBoxing() ||
                    insn.isJavaLangClassUnboxing() ->
                        node.instructions.remove(insn)
                    else ->
                        throwCannotAdaptInstruction(insn)
                }
            }

            Opcodes.INVOKEINTERFACE -> {
                if (insn.isJavaLangComparableCompareTo()) {
                    adaptJavaLangComparableCompareTo(node, insn, value)
                }
                else {
                    throwCannotAdaptInstruction(insn)
                }
            }

            Opcodes.CHECKCAST,
            Opcodes.INVOKEVIRTUAL ->
                node.instructions.remove(insn)

            else ->
                throwCannotAdaptInstruction(insn)
        }' @ [271:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit, entry6: Unit, entry7: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'insn' @ [271:15] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'opcode' @ [271:20] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'POP' @ [272:21] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isDoubleSize' @ [273:21] ==> val isDoubleSize: Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[LocalVariableDescriptor]

'node' @ [274:21] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'instructions' @ [274:26] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'set' @ [274:39] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [274:43] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'InsnNode' @ [274:49] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'POP2' @ [274:66] ==> public const final val POP2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'DUP' @ [277:21] ==> public const final val DUP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isDoubleSize' @ [278:21] ==> val isDoubleSize: Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[LocalVariableDescriptor]

'node' @ [279:21] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'instructions' @ [279:26] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'set' @ [279:39] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [279:43] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'InsnNode' @ [279:49] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'DUP2' @ [279:66] ==> public const final val DUP2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ASTORE' @ [282:21] ==> public const final val ASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ALOAD' @ [282:37] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [283:35] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'unboxedType' @ [283:41] ==> public final val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'getOpcode' @ [283:53] ==> public open fun getOpcode(p0: Int): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'if (insn.opcode == Opcodes.ASTORE) Opcodes.ISTORE else Opcodes.ILOAD' @ [283:63] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'insn' @ [283:67] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'opcode' @ [283:72] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ASTORE' @ [283:90] ==> public const final val ASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ISTORE' @ [283:106] ==> public const final val ISTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ILOAD' @ [283:126] ==> public const final val ILOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'node' @ [284:17] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'instructions' @ [284:22] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'set' @ [284:35] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [284:39] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'VarInsnNode' @ [284:45] ==> public constructor VarInsnNode(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaClassConstructorDescriptor]

'storeOpcode' @ [284:57] ==> val storeOpcode: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[LocalVariableDescriptor]

'insn' @ [284:71] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'`var`' @ [284:92] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'INSTANCEOF' @ [287:21] ==> public const final val INSTANCEOF: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'node' @ [288:17] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'instructions' @ [288:22] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [288:35] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [289:25] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'InsnNode' @ [290:25] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'if (isDoubleSize) Opcodes.POP2 else Opcodes.POP' @ [290:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isDoubleSize' @ [290:38] ==> val isDoubleSize: Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[LocalVariableDescriptor]

'POP2' @ [290:60] ==> public const final val POP2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'POP' @ [290:78] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'node' @ [292:17] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'instructions' @ [292:22] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'set' @ [292:35] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [292:39] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'InsnNode' @ [292:45] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'ICONST_1' @ [292:62] ==> public const final val ICONST_1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'INVOKESTATIC' @ [295:21] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'when {
                    insn.isAreEqualIntrinsic() ->
                        adaptAreEqualIntrinsic(node, insn, value)
                    insn.isJavaLangComparableCompareTo() ->
                        adaptJavaLangComparableCompareTo(node, insn, value)
                    insn.isJavaLangClassBoxing() ||
                    insn.isJavaLangClassUnboxing() ->
                        node.instructions.remove(insn)
                    else ->
                        throwCannotAdaptInstruction(insn)
                }' @ [296:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'insn' @ [297:21] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'isAreEqualIntrinsic' @ [297:26] ==> public fun AbstractInsnNode.isAreEqualIntrinsic(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing[SimpleFunctionDescriptorImpl]

'adaptAreEqualIntrinsic' @ [298:25] ==> private final fun adaptAreEqualIntrinsic(node: MethodNode, insn: AbstractInsnNode, value: BoxedValueDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [298:48] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'insn' @ [298:54] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'value' @ [298:60] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'insn' @ [299:21] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'isJavaLangComparableCompareTo' @ [299:26] ==> public fun AbstractInsnNode.isJavaLangComparableCompareTo(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing[SimpleFunctionDescriptorImpl]

'adaptJavaLangComparableCompareTo' @ [300:25] ==> private final fun adaptJavaLangComparableCompareTo(node: MethodNode, insn: AbstractInsnNode, value: BoxedValueDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [300:58] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'insn' @ [300:64] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'value' @ [300:70] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'insn' @ [301:21] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'isJavaLangClassBoxing' @ [301:26] ==> public fun AbstractInsnNode.isJavaLangClassBoxing(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing[SimpleFunctionDescriptorImpl]

'insn' @ [302:21] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'isJavaLangClassUnboxing' @ [302:26] ==> public fun AbstractInsnNode.isJavaLangClassUnboxing(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing[SimpleFunctionDescriptorImpl]

'node' @ [303:25] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'instructions' @ [303:30] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [303:43] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [303:50] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'throwCannotAdaptInstruction' @ [305:25] ==> private final fun throwCannotAdaptInstruction(insn: AbstractInsnNode): Nothing defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'insn' @ [305:53] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'INVOKEINTERFACE' @ [309:21] ==> public const final val INVOKEINTERFACE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (insn.isJavaLangComparableCompareTo()) {
                    adaptJavaLangComparableCompareTo(node, insn, value)
                }
                else {
                    throwCannotAdaptInstruction(insn)
                }' @ [310:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'insn' @ [310:21] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'isJavaLangComparableCompareTo' @ [310:26] ==> public fun AbstractInsnNode.isJavaLangComparableCompareTo(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing[SimpleFunctionDescriptorImpl]

'adaptJavaLangComparableCompareTo' @ [311:21] ==> private final fun adaptJavaLangComparableCompareTo(node: MethodNode, insn: AbstractInsnNode, value: BoxedValueDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [311:54] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'insn' @ [311:60] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'value' @ [311:66] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'throwCannotAdaptInstruction' @ [314:21] ==> private final fun throwCannotAdaptInstruction(insn: AbstractInsnNode): Nothing defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'insn' @ [314:49] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'CHECKCAST' @ [318:21] ==> public const final val CHECKCAST: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'INVOKEVIRTUAL' @ [319:21] ==> public const final val INVOKEVIRTUAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'node' @ [320:17] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'instructions' @ [320:22] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [320:35] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [320:42] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'throwCannotAdaptInstruction' @ [323:17] ==> private final fun throwCannotAdaptInstruction(insn: AbstractInsnNode): Nothing defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'insn' @ [323:45] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptInstruction[ValueParameterDescriptorImpl]

'AssertionError' @ [328:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'insn' @ [328:63] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.throwCannotAdaptInstruction[ValueParameterDescriptorImpl]

'insnText' @ [328:68] ==> internal val AbstractInsnNode?.insnText: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'value' @ [335:27] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsic[ValueParameterDescriptorImpl]

'unboxedType' @ [335:33] ==> public final val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'when (unboxedType.sort) {
            Type.BOOLEAN, Type.BYTE, Type.SHORT, Type.INT, Type.CHAR ->
                adaptAreEqualIntrinsicForInt(node, insn)
            Type.LONG ->
                adaptAreEqualIntrinsicForLong(node, insn)
            Type.OBJECT ->
                {}
            else ->
                throw AssertionError("Unexpected unboxed type kind: $unboxedType")
        }' @ [337:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'unboxedType' @ [337:15] ==> val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsic[LocalVariableDescriptor]

'sort' @ [337:27] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'BOOLEAN' @ [338:18] ==> public const final val BOOLEAN: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'BYTE' @ [338:32] ==> public const final val BYTE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'SHORT' @ [338:43] ==> public const final val SHORT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'INT' @ [338:55] ==> public const final val INT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'CHAR' @ [338:65] ==> public const final val CHAR: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'adaptAreEqualIntrinsicForInt' @ [339:17] ==> private final fun adaptAreEqualIntrinsicForInt(node: MethodNode, insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [339:46] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsic[ValueParameterDescriptorImpl]

'insn' @ [339:52] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsic[ValueParameterDescriptorImpl]

'LONG' @ [340:18] ==> public const final val LONG: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'adaptAreEqualIntrinsicForLong' @ [341:17] ==> private final fun adaptAreEqualIntrinsicForLong(node: MethodNode, insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [341:47] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsic[ValueParameterDescriptorImpl]

'insn' @ [341:53] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsic[ValueParameterDescriptorImpl]

'OBJECT' @ [342:18] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'AssertionError' @ [345:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'unboxedType' @ [345:70] ==> val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsic[LocalVariableDescriptor]

'node' @ [350:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt[ValueParameterDescriptorImpl]

'instructions' @ [350:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [350:27] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'insn' @ [351:24] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt[ValueParameterDescriptorImpl]

'next' @ [351:29] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'if (next != null && (next.opcode == Opcodes.IFEQ || next.opcode == Opcodes.IFNE)) {
                fuseAreEqualWithBranch(node, insn, Opcodes.IF_ICMPNE, Opcodes.IF_ICMPEQ)
                remove(insn)
                remove(next)
            }
            else {
                ifEqual1Else0(node, insn, Opcodes.IF_ICMPNE)
                remove(insn)
            }' @ [352:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'next' @ [352:17] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt.<anonymous>[LocalVariableDescriptor]

'next' @ [352:34] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt.<anonymous>[LocalVariableDescriptor]

'opcode' @ [352:39] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFEQ' @ [352:57] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'next' @ [352:65] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt.<anonymous>[LocalVariableDescriptor]

'opcode' @ [352:70] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFNE' @ [352:88] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'fuseAreEqualWithBranch' @ [353:17] ==> private final fun fuseAreEqualWithBranch(node: MethodNode, insn: AbstractInsnNode, ifEqualOpcode: Int, ifNotEqualOpcode: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [353:40] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt[ValueParameterDescriptorImpl]

'insn' @ [353:46] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt[ValueParameterDescriptorImpl]

'IF_ICMPNE' @ [353:60] ==> public const final val IF_ICMPNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPEQ' @ [353:79] ==> public const final val IF_ICMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'remove' @ [354:17] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [354:24] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt[ValueParameterDescriptorImpl]

'remove' @ [355:17] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'next' @ [355:24] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt.<anonymous>[LocalVariableDescriptor]

'ifEqual1Else0' @ [358:17] ==> private final fun ifEqual1Else0(node: MethodNode, insn: AbstractInsnNode, ifneOpcode: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [358:31] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt[ValueParameterDescriptorImpl]

'insn' @ [358:37] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt[ValueParameterDescriptorImpl]

'IF_ICMPNE' @ [358:51] ==> public const final val IF_ICMPNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'remove' @ [359:17] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [359:24] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForInt[ValueParameterDescriptorImpl]

'node' @ [365:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong[ValueParameterDescriptorImpl]

'instructions' @ [365:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [365:27] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'insertBefore' @ [366:13] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [366:26] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong[ValueParameterDescriptorImpl]

'InsnNode' @ [366:32] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'LCMP' @ [366:49] ==> public const final val LCMP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [367:24] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong[ValueParameterDescriptorImpl]

'next' @ [367:29] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'if (next != null && (next.opcode == Opcodes.IFEQ || next.opcode == Opcodes.IFNE)) {
                fuseAreEqualWithBranch(node, insn, Opcodes.IFNE, Opcodes.IFEQ)
                remove(insn)
                remove(next)
            }
            else {
                ifEqual1Else0(node, insn, Opcodes.IFNE)
                remove(insn)
            }' @ [368:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'next' @ [368:17] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong.<anonymous>[LocalVariableDescriptor]

'next' @ [368:34] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong.<anonymous>[LocalVariableDescriptor]

'opcode' @ [368:39] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFEQ' @ [368:57] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'next' @ [368:65] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong.<anonymous>[LocalVariableDescriptor]

'opcode' @ [368:70] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFNE' @ [368:88] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'fuseAreEqualWithBranch' @ [369:17] ==> private final fun fuseAreEqualWithBranch(node: MethodNode, insn: AbstractInsnNode, ifEqualOpcode: Int, ifNotEqualOpcode: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [369:40] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong[ValueParameterDescriptorImpl]

'insn' @ [369:46] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong[ValueParameterDescriptorImpl]

'IFNE' @ [369:60] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFEQ' @ [369:74] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'remove' @ [370:17] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [370:24] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong[ValueParameterDescriptorImpl]

'remove' @ [371:17] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'next' @ [371:24] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong.<anonymous>[LocalVariableDescriptor]

'ifEqual1Else0' @ [374:17] ==> private final fun ifEqual1Else0(node: MethodNode, insn: AbstractInsnNode, ifneOpcode: Int): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [374:31] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong[ValueParameterDescriptorImpl]

'insn' @ [374:37] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong[ValueParameterDescriptorImpl]

'IFNE' @ [374:51] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'remove' @ [375:17] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [375:24] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptAreEqualIntrinsicForLong[ValueParameterDescriptorImpl]

'node' @ [386:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch[ValueParameterDescriptorImpl]

'instructions' @ [386:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [386:27] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'insn' @ [387:24] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch[ValueParameterDescriptorImpl]

'next' @ [387:29] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'assert' @ [388:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'next' @ [388:20] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch.<anonymous>[LocalVariableDescriptor]

'next' @ [388:69] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch.<anonymous>[LocalVariableDescriptor]

'next' @ [389:30] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch.<anonymous>[LocalVariableDescriptor]

'label' @ [389:52] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'when {
                next.getOpcode() == Opcodes.IFEQ ->
                    insertBefore(insn, JumpInsnNode(ifEqualOpcode, nextLabel))
                next.getOpcode() == Opcodes.IFNE ->
                    insertBefore(insn, JumpInsnNode(ifNotEqualOpcode, nextLabel))
                else ->
                    throw AssertionError("IFEQ or IFNE expected: ${next.insnOpcodeText}")
            }' @ [390:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'next' @ [391:17] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch.<anonymous>[LocalVariableDescriptor]

'getOpcode' @ [391:22] ==> public open fun getOpcode(): Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaMethodDescriptor]

'IFEQ' @ [391:45] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insertBefore' @ [392:21] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [392:34] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch[ValueParameterDescriptorImpl]

'JumpInsnNode' @ [392:40] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'ifEqualOpcode' @ [392:53] ==> value-parameter ifEqualOpcode: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch[ValueParameterDescriptorImpl]

'nextLabel' @ [392:68] ==> val nextLabel: (LabelNode..LabelNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch.<anonymous>[LocalVariableDescriptor]

'next' @ [393:17] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch.<anonymous>[LocalVariableDescriptor]

'getOpcode' @ [393:22] ==> public open fun getOpcode(): Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaMethodDescriptor]

'IFNE' @ [393:45] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insertBefore' @ [394:21] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [394:34] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch[ValueParameterDescriptorImpl]

'JumpInsnNode' @ [394:40] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'ifNotEqualOpcode' @ [394:53] ==> value-parameter ifNotEqualOpcode: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch[ValueParameterDescriptorImpl]

'nextLabel' @ [394:71] ==> val nextLabel: (LabelNode..LabelNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch.<anonymous>[LocalVariableDescriptor]

'AssertionError' @ [396:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'next' @ [396:68] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.fuseAreEqualWithBranch.<anonymous>[LocalVariableDescriptor]

'insnOpcodeText' @ [396:73] ==> internal val AbstractInsnNode?.insnOpcodeText: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'node' @ [402:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0[ValueParameterDescriptorImpl]

'instructions' @ [402:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [402:27] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'LabelNode' @ [403:29] ==> public constructor LabelNode(p0: (Label..Label?)) defined in org.jetbrains.org.objectweb.asm.tree.LabelNode[JavaClassConstructorDescriptor]

'Label' @ [403:39] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'LabelNode' @ [404:25] ==> public constructor LabelNode(p0: (Label..Label?)) defined in org.jetbrains.org.objectweb.asm.tree.LabelNode[JavaClassConstructorDescriptor]

'Label' @ [404:35] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'insertBefore' @ [405:13] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [405:26] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0[ValueParameterDescriptorImpl]

'JumpInsnNode' @ [405:32] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'ifneOpcode' @ [405:45] ==> value-parameter ifneOpcode: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0[ValueParameterDescriptorImpl]

'lNotEqual' @ [405:57] ==> val lNotEqual: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0.<anonymous>[LocalVariableDescriptor]

'insertBefore' @ [406:13] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [406:26] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0[ValueParameterDescriptorImpl]

'InsnNode' @ [406:32] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'ICONST_1' @ [406:49] ==> public const final val ICONST_1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insertBefore' @ [407:13] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [407:26] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0[ValueParameterDescriptorImpl]

'JumpInsnNode' @ [407:32] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'GOTO' @ [407:53] ==> public const final val GOTO: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'lDone' @ [407:59] ==> val lDone: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0.<anonymous>[LocalVariableDescriptor]

'insertBefore' @ [408:13] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [408:26] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0[ValueParameterDescriptorImpl]

'lNotEqual' @ [408:32] ==> val lNotEqual: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0.<anonymous>[LocalVariableDescriptor]

'insertBefore' @ [409:13] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [409:26] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0[ValueParameterDescriptorImpl]

'InsnNode' @ [409:32] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'ICONST_0' @ [409:49] ==> public const final val ICONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insertBefore' @ [410:13] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [410:26] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0[ValueParameterDescriptorImpl]

'lDone' @ [410:32] ==> val lDone: LabelNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.ifEqual1Else0.<anonymous>[LocalVariableDescriptor]

'value' @ [419:27] ==> value-parameter value: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareTo[ValueParameterDescriptorImpl]

'unboxedType' @ [419:33] ==> public final val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'when (unboxedType.sort) {
            Type.BOOLEAN, Type.BYTE, Type.SHORT, Type.INT, Type.CHAR -> 
                adaptJavaLangComparableCompareToForInt(node, insn)
            Type.LONG -> 
                adaptJavaLangComparableCompareToForLong(node, insn)
            Type.FLOAT -> 
                adaptJavaLangComparableCompareToForFloat(node, insn)
            Type.DOUBLE -> 
                adaptJavaLangComparableCompareToForDouble(node, insn)
            else -> 
                throw AssertionError("Unexpected unboxed type kind: $unboxedType")
        }' @ [421:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'unboxedType' @ [421:15] ==> val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareTo[LocalVariableDescriptor]

'sort' @ [421:27] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'BOOLEAN' @ [422:18] ==> public const final val BOOLEAN: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'BYTE' @ [422:32] ==> public const final val BYTE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'SHORT' @ [422:43] ==> public const final val SHORT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'INT' @ [422:55] ==> public const final val INT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'CHAR' @ [422:65] ==> public const final val CHAR: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'adaptJavaLangComparableCompareToForInt' @ [423:17] ==> private final fun adaptJavaLangComparableCompareToForInt(node: MethodNode, insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [423:56] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareTo[ValueParameterDescriptorImpl]

'insn' @ [423:62] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareTo[ValueParameterDescriptorImpl]

'LONG' @ [424:18] ==> public const final val LONG: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'adaptJavaLangComparableCompareToForLong' @ [425:17] ==> private final fun adaptJavaLangComparableCompareToForLong(node: MethodNode, insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [425:57] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareTo[ValueParameterDescriptorImpl]

'insn' @ [425:63] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareTo[ValueParameterDescriptorImpl]

'FLOAT' @ [426:18] ==> public const final val FLOAT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'adaptJavaLangComparableCompareToForFloat' @ [427:17] ==> private final fun adaptJavaLangComparableCompareToForFloat(node: MethodNode, insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [427:58] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareTo[ValueParameterDescriptorImpl]

'insn' @ [427:64] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareTo[ValueParameterDescriptorImpl]

'DOUBLE' @ [428:18] ==> public const final val DOUBLE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'adaptJavaLangComparableCompareToForDouble' @ [429:17] ==> private final fun adaptJavaLangComparableCompareToForDouble(node: MethodNode, insn: AbstractInsnNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [429:59] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareTo[ValueParameterDescriptorImpl]

'insn' @ [429:65] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareTo[ValueParameterDescriptorImpl]

'AssertionError' @ [431:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'unboxedType' @ [431:70] ==> val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareTo[LocalVariableDescriptor]

'node' @ [436:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt[ValueParameterDescriptorImpl]

'instructions' @ [436:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [436:27] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'insn' @ [437:24] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt[ValueParameterDescriptorImpl]

'next' @ [437:29] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'next' @ [438:25] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'next' @ [438:31] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'when {
                next != null && next2 != null &&
                next.opcode == Opcodes.ICONST_0 &&
                next2.opcode >= Opcodes.IF_ICMPEQ && next2.opcode <= Opcodes.IF_ICMPLE -> {
                    // Fuse: compareTo + ICONST_0 + IF_ICMPxx -> IF_ICMPxx
                    remove(insn)
                    remove(next)
                }

                next != null &&
                next.opcode >= Opcodes.IFEQ && next.opcode <= Opcodes.IFLE -> {
                    // Fuse: compareTo + IFxx -> IF_ICMPxx
                    val nextLabel = (next as JumpInsnNode).label
                    val ifCmpOpcode = next.opcode - Opcodes.IFEQ + Opcodes.IF_ICMPEQ
                    insertBefore(insn, JumpInsnNode(ifCmpOpcode, nextLabel))
                    remove(insn)
                    remove(next)
                }

                else -> {
                    // Can't fuse with branching instruction. Use Intrinsics#compare(int, int).
                    set(insn, MethodInsnNode(Opcodes.INVOKESTATIC, IntrinsicMethods.INTRINSICS_CLASS_NAME, "compare", "(II)I", false))
                }
            }' @ [439:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'next' @ [440:17] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'next2' @ [440:33] ==> val next2: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'next' @ [441:17] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'opcode' @ [441:22] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ICONST_0' @ [441:40] ==> public const final val ICONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'next2' @ [442:17] ==> val next2: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'opcode' @ [442:23] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IF_ICMPEQ' @ [442:41] ==> public const final val IF_ICMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'next2' @ [442:54] ==> val next2: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'opcode' @ [442:60] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IF_ICMPLE' @ [442:78] ==> public const final val IF_ICMPLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'remove' @ [444:21] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [444:28] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt[ValueParameterDescriptorImpl]

'remove' @ [445:21] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'next' @ [445:28] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'next' @ [448:17] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'next' @ [449:17] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'opcode' @ [449:22] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFEQ' @ [449:40] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'next' @ [449:48] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'opcode' @ [449:53] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFLE' @ [449:71] ==> public const final val IFLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'next' @ [451:38] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'label' @ [451:60] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'next' @ [452:39] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'opcode' @ [452:44] ==> public final var JumpInsnNode.opcode: Int[MyPropertyDescriptor]

'IFEQ' @ [452:61] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPEQ' @ [452:76] ==> public const final val IF_ICMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insertBefore' @ [453:21] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [453:34] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt[ValueParameterDescriptorImpl]

'JumpInsnNode' @ [453:40] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'ifCmpOpcode' @ [453:53] ==> val ifCmpOpcode: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'nextLabel' @ [453:66] ==> val nextLabel: (LabelNode..LabelNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'remove' @ [454:21] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [454:28] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt[ValueParameterDescriptorImpl]

'remove' @ [455:21] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'next' @ [455:28] ==> val next: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt.<anonymous>[LocalVariableDescriptor]

'set' @ [460:21] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [460:25] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForInt[ValueParameterDescriptorImpl]

'MethodInsnNode' @ [460:31] ==> public constructor MethodInsnNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaClassConstructorDescriptor]

'INVOKESTATIC' @ [460:54] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'INTRINSICS_CLASS_NAME' @ [460:85] ==> public const final val INTRINSICS_CLASS_NAME: String defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethods[JavaPropertyDescriptor]

'node' @ [467:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForLong[ValueParameterDescriptorImpl]

'instructions' @ [467:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'set' @ [467:27] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [467:31] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForLong[ValueParameterDescriptorImpl]

'InsnNode' @ [467:37] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'LCMP' @ [467:54] ==> public const final val LCMP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'node' @ [471:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForFloat[ValueParameterDescriptorImpl]

'instructions' @ [471:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'set' @ [471:27] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [471:31] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForFloat[ValueParameterDescriptorImpl]

'MethodInsnNode' @ [471:37] ==> public constructor MethodInsnNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaClassConstructorDescriptor]

'INVOKESTATIC' @ [471:60] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'node' @ [475:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForDouble[ValueParameterDescriptorImpl]

'instructions' @ [475:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'set' @ [475:27] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [475:31] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.RedundantBoxingMethodTransformer.adaptJavaLangComparableCompareToForDouble[ValueParameterDescriptorImpl]

'MethodInsnNode' @ [475:37] ==> public constructor MethodInsnNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaClassConstructorDescriptor]

'INVOKESTATIC' @ [475:60] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

