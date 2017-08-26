'peek' @ [26:9] ==> public fun <V : Value> Frame<V>.peek(offset: Int): V? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> V

'if (stackSize > offset) getStack(stackSize - offset - 1) else null' @ [29:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: V?, elseBranch: V?): V?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> V?

'stackSize' @ [29:13] ==> public final val <V : (Value..Value?)> Frame<V>.stackSize: Int[MyPropertyDescriptor]
Inferred types:
    <V : (Value..Value?)> -> V

'offset' @ [29:25] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peek[ValueParameterDescriptorImpl]

'getStack' @ [29:33] ==> public open fun getStack(p0: Int): (V..V?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'stackSize' @ [29:42] ==> public final val <V : (Value..Value?)> Frame<V>.stackSize: Int[MyPropertyDescriptor]
Inferred types:
    <V : (Value..Value?)> -> V

'offset' @ [29:54] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peek[ValueParameterDescriptorImpl]

'offset0' @ [32:18] ==> value-parameter offset0: Int = ... defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWordsTo[ValueParameterDescriptorImpl]

'totalSize' @ [34:12] ==> var totalSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWordsTo[LocalVariableDescriptor]

'size' @ [34:24] ==> value-parameter size: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWordsTo[ValueParameterDescriptorImpl]

'peek' @ [35:21] ==> public fun <V : Value> Frame<V>.peek(offset: Int): V? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> V

'offset' @ [35:26] ==> var offset: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWordsTo[LocalVariableDescriptor]

'-' @ [35:46] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'dest' @ [36:9] ==> value-parameter dest: MutableList<V> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWordsTo[ValueParameterDescriptorImpl]

'add' @ [36:14] ==> public abstract fun add(element: V): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'value' @ [36:18] ==> val value: V defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWordsTo[LocalVariableDescriptor]

'totalSize' @ [37:9] ==> var totalSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWordsTo[LocalVariableDescriptor]

'value' @ [37:22] ==> val value: V defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWordsTo[LocalVariableDescriptor]

'size' @ [37:28] ==> public final val Value.size: Int[MyPropertyDescriptor]

'totalSize' @ [39:9] ==> var totalSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWordsTo[LocalVariableDescriptor]

'size' @ [39:21] ==> value-parameter size: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWordsTo[ValueParameterDescriptorImpl]

'-' @ [39:34] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'offset' @ [40:12] ==> var offset: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWordsTo[LocalVariableDescriptor]

'ArrayList' @ [44:18] ==> public final fun <E> <init>(p0: Int): ArrayList<V> /* = ArrayList<V> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> V

'size' @ [44:31] ==> value-parameter size: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[ValueParameterDescriptorImpl]

'if (peekWordsTo(result, size) < 0) null else result' @ [45:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<V>?, elseBranch: List<V>?): List<V>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<V>?

'peekWordsTo' @ [45:16] ==> private fun <V : Value> Frame<V>.peekWordsTo(dest: MutableList<V>, size: Int, offset0: Int = ...): Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> V

'result' @ [45:28] ==> val result: ArrayList<V> /* = ArrayList<V> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[LocalVariableDescriptor]

'size' @ [45:36] ==> value-parameter size: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[ValueParameterDescriptorImpl]

'result' @ [45:57] ==> val result: ArrayList<V> /* = ArrayList<V> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[LocalVariableDescriptor]

'ArrayList' @ [49:18] ==> public final fun <E> <init>(p0: Int): ArrayList<V> /* = ArrayList<V> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> V

'size1' @ [49:31] ==> value-parameter size1: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[ValueParameterDescriptorImpl]

'size2' @ [49:39] ==> value-parameter size2: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[ValueParameterDescriptorImpl]

'peekWordsTo' @ [50:18] ==> private fun <V : Value> Frame<V>.peekWordsTo(dest: MutableList<V>, size: Int, offset0: Int = ...): Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> V

'result' @ [50:30] ==> val result: ArrayList<V> /* = ArrayList<V> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[LocalVariableDescriptor]

'size1' @ [50:38] ==> value-parameter size1: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[ValueParameterDescriptorImpl]

'offset' @ [51:9] ==> val offset: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[LocalVariableDescriptor]

'peekWordsTo' @ [52:9] ==> private fun <V : Value> Frame<V>.peekWordsTo(dest: MutableList<V>, size: Int, offset0: Int = ...): Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> V

'result' @ [52:21] ==> val result: ArrayList<V> /* = ArrayList<V> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[LocalVariableDescriptor]

'size2' @ [52:29] ==> value-parameter size2: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[ValueParameterDescriptorImpl]

'offset' @ [52:36] ==> val offset: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[LocalVariableDescriptor]

'result' @ [53:12] ==> val result: ArrayList<V> /* = ArrayList<V> */ defined in org.jetbrains.kotlin.codegen.optimization.fixStack.peekWords[LocalVariableDescriptor]

'savedValues' @ [60:35] ==> public final val savedValues: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor[PropertyDescriptorImpl]

'fold' @ [60:47] ==> public inline fun <T, R> Iterable<BasicValue>.fold(initial: Int, operation: (acc: Int, BasicValue) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue
    <R> -> Int

'size' @ [60:72] ==> value-parameter size: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor.savedValuesSize.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [60:79] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor.savedValuesSize.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [60:85] ==> public final val BasicValue.size: Int[MyPropertyDescriptor]

'firstLocalVarIndex' @ [61:36] ==> public final val firstLocalVarIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor[PropertyDescriptorImpl]

'savedValuesSize' @ [61:57] ==> private final val savedValuesSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor[PropertyDescriptorImpl]

'firstLocalVarIndex' @ [64:16] ==> public final val firstLocalVarIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor[PropertyDescriptorImpl]

'savedValues' @ [64:38] ==> public final val savedValues: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor[PropertyDescriptorImpl]

'savedValues' @ [66:33] ==> public final val savedValues: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor[PropertyDescriptorImpl]

'isNotEmpty' @ [66:45] ==> @InlineOnly public inline fun <T> Collection<BasicValue>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'with' @ [74:5] ==> @InlineOnly public inline fun <T, R> with(receiver: (InsnList..InsnList?), block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'methodNode' @ [74:10] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.saveStack[ValueParameterDescriptorImpl]

'instructions' @ [74:21] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'generateStoreInstructions' @ [75:9] ==> public fun generateStoreInstructions(methodNode: MethodNode, location: AbstractInsnNode, savedStackDescriptor: SavedStackDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [75:35] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.saveStack[ValueParameterDescriptorImpl]

'nodeToReplace' @ [75:47] ==> value-parameter nodeToReplace: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.saveStack[ValueParameterDescriptorImpl]

'savedStackDescriptor' @ [75:62] ==> value-parameter savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.saveStack[ValueParameterDescriptorImpl]

'remove' @ [76:9] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'nodeToReplace' @ [76:16] ==> value-parameter nodeToReplace: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.saveStack[ValueParameterDescriptorImpl]

'with' @ [81:5] ==> @InlineOnly public inline fun <T, R> with(receiver: (InsnList..InsnList?), block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'methodNode' @ [81:10] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStack[ValueParameterDescriptorImpl]

'instructions' @ [81:21] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'generateLoadInstructions' @ [82:9] ==> public fun generateLoadInstructions(methodNode: MethodNode, location: AbstractInsnNode, savedStackDescriptor: SavedStackDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [82:34] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStack[ValueParameterDescriptorImpl]

'location' @ [82:46] ==> value-parameter location: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStack[ValueParameterDescriptorImpl]

'savedStackDescriptor' @ [82:56] ==> value-parameter savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStack[ValueParameterDescriptorImpl]

'remove' @ [83:9] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'location' @ [83:16] ==> value-parameter location: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStack[ValueParameterDescriptorImpl]

'with' @ [94:5] ==> @InlineOnly public inline fun <T, R> with(receiver: (InsnList..InsnList?), block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'methodNode' @ [94:10] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStackWithReturnValue[ValueParameterDescriptorImpl]

'instructions' @ [94:21] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [95:9] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'nodeToReplace' @ [95:22] ==> value-parameter nodeToReplace: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStackWithReturnValue[ValueParameterDescriptorImpl]

'VarInsnNode' @ [95:37] ==> public constructor VarInsnNode(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaClassConstructorDescriptor]

'returnValue' @ [95:49] ==> value-parameter returnValue: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStackWithReturnValue[ValueParameterDescriptorImpl]

'type' @ [95:61] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'getOpcode' @ [95:66] ==> public open fun getOpcode(p0: Int): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'ISTORE' @ [95:84] ==> public const final val ISTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'returnValueLocalVarIndex' @ [95:93] ==> value-parameter returnValueLocalVarIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStackWithReturnValue[ValueParameterDescriptorImpl]

'generateLoadInstructions' @ [96:9] ==> public fun generateLoadInstructions(methodNode: MethodNode, location: AbstractInsnNode, savedStackDescriptor: SavedStackDescriptor): Unit defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [96:34] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStackWithReturnValue[ValueParameterDescriptorImpl]

'nodeToReplace' @ [96:46] ==> value-parameter nodeToReplace: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStackWithReturnValue[ValueParameterDescriptorImpl]

'savedStackDescriptor' @ [96:61] ==> value-parameter savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStackWithReturnValue[ValueParameterDescriptorImpl]

'insertBefore' @ [97:9] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'nodeToReplace' @ [97:22] ==> value-parameter nodeToReplace: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStackWithReturnValue[ValueParameterDescriptorImpl]

'VarInsnNode' @ [97:37] ==> public constructor VarInsnNode(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaClassConstructorDescriptor]

'returnValue' @ [97:49] ==> value-parameter returnValue: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStackWithReturnValue[ValueParameterDescriptorImpl]

'type' @ [97:61] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'getOpcode' @ [97:66] ==> public open fun getOpcode(p0: Int): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'ILOAD' @ [97:84] ==> public const final val ILOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'returnValueLocalVarIndex' @ [97:92] ==> value-parameter returnValueLocalVarIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStackWithReturnValue[ValueParameterDescriptorImpl]

'remove' @ [98:9] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'nodeToReplace' @ [98:16] ==> value-parameter nodeToReplace: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.restoreStackWithReturnValue[ValueParameterDescriptorImpl]

'savedStackDescriptor' @ [103:25] ==> value-parameter savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateLoadInstructions[ValueParameterDescriptorImpl]

'firstLocalVarIndex' @ [103:46] ==> public final val firstLocalVarIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor[PropertyDescriptorImpl]

'savedStackDescriptor' @ [104:19] ==> value-parameter savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateLoadInstructions[ValueParameterDescriptorImpl]

'savedValues' @ [104:40] ==> public final val savedValues: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor[PropertyDescriptorImpl]

'methodNode' @ [105:9] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateLoadInstructions[ValueParameterDescriptorImpl]

'instructions' @ [105:20] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [105:33] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'location' @ [105:46] ==> value-parameter location: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateLoadInstructions[ValueParameterDescriptorImpl]

'VarInsnNode' @ [106:46] ==> public constructor VarInsnNode(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaClassConstructorDescriptor]

'value' @ [106:58] ==> val value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateLoadInstructions[LocalVariableDescriptor]

'type' @ [106:64] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'getOpcode' @ [106:69] ==> public open fun getOpcode(p0: Int): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'ILOAD' @ [106:87] ==> public const final val ILOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'localVarIndex' @ [106:95] ==> var localVarIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateLoadInstructions[LocalVariableDescriptor]

'localVarIndex' @ [107:9] ==> var localVarIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateLoadInstructions[LocalVariableDescriptor]

'value' @ [107:26] ==> val value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateLoadInstructions[LocalVariableDescriptor]

'size' @ [107:32] ==> public final val BasicValue.size: Int[MyPropertyDescriptor]

'savedStackDescriptor' @ [112:25] ==> value-parameter savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateStoreInstructions[ValueParameterDescriptorImpl]

'firstUnusedLocalVarIndex' @ [112:46] ==> public final val firstUnusedLocalVarIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor[PropertyDescriptorImpl]

'savedStackDescriptor' @ [113:19] ==> value-parameter savedStackDescriptor: SavedStackDescriptor defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateStoreInstructions[ValueParameterDescriptorImpl]

'savedValues' @ [113:40] ==> public final val savedValues: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.SavedStackDescriptor[PropertyDescriptorImpl]

'asReversed' @ [113:52] ==> public fun <T> List<BasicValue>.asReversed(): List<BasicValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'localVarIndex' @ [114:9] ==> var localVarIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateStoreInstructions[LocalVariableDescriptor]

'value' @ [114:26] ==> val value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateStoreInstructions[LocalVariableDescriptor]

'size' @ [114:32] ==> public final val BasicValue.size: Int[MyPropertyDescriptor]

'methodNode' @ [115:9] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateStoreInstructions[ValueParameterDescriptorImpl]

'instructions' @ [115:20] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [115:33] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'location' @ [115:46] ==> value-parameter location: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateStoreInstructions[ValueParameterDescriptorImpl]

'VarInsnNode' @ [116:46] ==> public constructor VarInsnNode(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaClassConstructorDescriptor]

'value' @ [116:58] ==> val value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateStoreInstructions[LocalVariableDescriptor]

'type' @ [116:64] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'getOpcode' @ [116:69] ==> public open fun getOpcode(p0: Int): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'ISTORE' @ [116:87] ==> public const final val ISTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'localVarIndex' @ [116:96] ==> var localVarIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.generateStoreInstructions[LocalVariableDescriptor]

'InsnNode' @ [121:9] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'when (top.size) {
                     1 -> Opcodes.POP
                     2 -> Opcodes.POP2
                     else -> throw AssertionError("Unexpected value type size")
                 }' @ [121:18] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'top' @ [121:24] ==> value-parameter top: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.fixStack.getPopInstruction[ValueParameterDescriptorImpl]

'size' @ [121:28] ==> public final val BasicValue.size: Int[MyPropertyDescriptor]

'POP' @ [122:35] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'POP2' @ [123:35] ==> public const final val POP2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'AssertionError' @ [124:36] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'with' @ [128:5] ==> @InlineOnly public inline fun <T, R> with(receiver: (InsnList..InsnList?), block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'methodNode' @ [128:11] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.removeAlwaysFalseIfeq[ValueParameterDescriptorImpl]

'instructions' @ [128:22] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [129:9] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'node' @ [129:16] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.removeAlwaysFalseIfeq[ValueParameterDescriptorImpl]

'next' @ [129:21] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'remove' @ [130:9] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'node' @ [130:16] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.removeAlwaysFalseIfeq[ValueParameterDescriptorImpl]

'with' @ [135:5] ==> @InlineOnly public inline fun <T, R> with(receiver: (InsnList..InsnList?), block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'methodNode' @ [135:11] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceAlwaysTrueIfeqWithGoto[ValueParameterDescriptorImpl]

'instructions' @ [135:22] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [136:20] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceAlwaysTrueIfeqWithGoto[ValueParameterDescriptorImpl]

'next' @ [136:25] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'insertBefore' @ [137:9] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'node' @ [137:22] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceAlwaysTrueIfeqWithGoto[ValueParameterDescriptorImpl]

'JumpInsnNode' @ [137:28] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'GOTO' @ [137:49] ==> public const final val GOTO: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'next' @ [137:55] ==> val next: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceAlwaysTrueIfeqWithGoto.<anonymous>[LocalVariableDescriptor]

'label' @ [137:60] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'remove' @ [138:9] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'node' @ [138:16] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceAlwaysTrueIfeqWithGoto[ValueParameterDescriptorImpl]

'remove' @ [139:9] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'next' @ [139:16] ==> val next: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceAlwaysTrueIfeqWithGoto.<anonymous>[LocalVariableDescriptor]

'with' @ [144:5] ==> @InlineOnly public inline fun <T, R> with(receiver: (InsnList..InsnList?), block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'methodNode' @ [144:11] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceMarkerWithPops[ValueParameterDescriptorImpl]

'instructions' @ [144:22] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'stackContent' @ [145:28] ==> value-parameter stackContent: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceMarkerWithPops[ValueParameterDescriptorImpl]

'subList' @ [145:41] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<BasicValue> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'expectedStackSize' @ [145:49] ==> value-parameter expectedStackSize: Int defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceMarkerWithPops[ValueParameterDescriptorImpl]

'stackContent' @ [145:68] ==> value-parameter stackContent: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceMarkerWithPops[ValueParameterDescriptorImpl]

'size' @ [145:81] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'insert' @ [146:13] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'node' @ [146:20] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceMarkerWithPops[ValueParameterDescriptorImpl]

'getPopInstruction' @ [146:26] ==> public fun getPopInstruction(top: BasicValue): InsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack in file StackTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'stackValue' @ [146:44] ==> val stackValue: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceMarkerWithPops.<anonymous>[LocalVariableDescriptor]

'remove' @ [148:9] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'node' @ [148:16] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.fixStack.replaceMarkerWithPops[ValueParameterDescriptorImpl]

