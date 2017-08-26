'UninitializedNewValueMarkerInterpreter' @ [74:23] ==> public constructor UninitializedNewValueMarkerInterpreter() defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter[ClassConstructorDescriptorImpl]

'CustomFramesMethodAnalyzer' @ [75:18] ==> public constructor CustomFramesMethodAnalyzer<V : Value>(owner: String, method: MethodNode, interpreter: Interpreter<(BasicValue..BasicValue?)>, frameFactory: (Int, Int) -> Frame<(BasicValue..BasicValue?)>) defined in org.jetbrains.kotlin.codegen.optimization.common.CustomFramesMethodAnalyzer[ClassConstructorDescriptorImpl]
Inferred types:
    <V : Value> -> (org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)

'methodNode' @ [75:53] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[ValueParameterDescriptorImpl]

'interpreter' @ [75:65] ==> val interpreter: UninitializedNewValueMarkerInterpreter defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'analyze' @ [75:108] ==> public final fun analyze(): Array<Frame<(BasicValue..BasicValue?)>?> defined in org.jetbrains.kotlin.codegen.optimization.common.CustomFramesMethodAnalyzer[SimpleFunctionDescriptorImpl]

'component1' @ [77:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [77:18] ==> public final operator fun component2(): (AbstractInsnNode..AbstractInsnNode?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [77:27] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[ValueParameterDescriptorImpl]

'instructions' @ [77:38] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toArray' @ [77:51] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'withIndex' @ [77:61] ==> public fun <T> Array<out (AbstractInsnNode..AbstractInsnNode?)>.withIndex(): Iterable<IndexedValue<(AbstractInsnNode..AbstractInsnNode?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'frames' @ [78:21] ==> val frames: Array<Frame<(BasicValue..BasicValue?)>?> defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'index' @ [78:28] ==> val index: Int defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'frame' @ [79:34] ==> val frame: Frame<(BasicValue..BasicValue?)> defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'getUninitializedValueForConstructorCall' @ [79:40] ==> private fun Frame<BasicValue>.getUninitializedValueForConstructorCall(insn: AbstractInsnNode): UninitializedNewValue? defined in org.jetbrains.kotlin.codegen.coroutines[SimpleFunctionDescriptorImpl]

'insn' @ [79:80] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'interpreter' @ [81:49] ==> val interpreter: UninitializedNewValueMarkerInterpreter defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'uninitializedValuesToCopyUsages' @ [81:61] ==> public final val uninitializedValuesToCopyUsages: HashMap<AbstractInsnNode, MutableSet<AbstractInsnNode>> /* = HashMap<AbstractInsnNode, MutableSet<AbstractInsnNode>> */ defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter[PropertyDescriptorImpl]

'uninitializedValue' @ [81:93] ==> val uninitializedValue: UninitializedNewValue defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'newInsn' @ [81:112] ==> public final val newInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValue[PropertyDescriptorImpl]

'assert' @ [82:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'copyUsages' @ [82:16] ==> val copyUsages: Set<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'size' @ [82:27] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'copyUsages' @ [85:13] ==> val copyUsages: Set<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'size' @ [85:24] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'copyUsages' @ [87:10] ==> val copyUsages: Set<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'uninitializedValue' @ [87:23] ==> val uninitializedValue: UninitializedNewValue defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'newInsn' @ [87:42] ==> public final val newInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValue[PropertyDescriptorImpl]

'forEach' @ [87:51] ==> @HidesMembers public inline fun <T> Iterable<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'methodNode' @ [88:13] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[ValueParameterDescriptorImpl]

'instructions' @ [88:24] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [88:37] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'it' @ [88:44] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentTypes' @ [91:61] ==> public open fun getArgumentTypes(p0: (String..String?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'insn' @ [91:79] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'desc' @ [91:103] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'size' @ [91:109] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'arrayListOf' @ [92:27] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Type> /* = ArrayList<Type> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'methodNode' @ [93:28] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[ValueParameterDescriptorImpl]

'maxLocals' @ [93:39] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'until' @ [95:19] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'indexOfConstructorArgumentFromTopOfStack' @ [95:27] ==> val indexOfConstructorArgumentFromTopOfStack: Int defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'frame' @ [96:25] ==> val frame: Frame<(BasicValue..BasicValue?)> defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'getStack' @ [96:31] ==> public open fun getStack(p0: Int): (BasicValue..BasicValue?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'frame' @ [96:40] ==> val frame: Frame<(BasicValue..BasicValue?)> defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'stackSize' @ [96:46] ==> public final val <V : (Value..Value?)> Frame<(BasicValue..BasicValue?)>.stackSize: Int[MyPropertyDescriptor]
Inferred types:
    <V : (Value..Value?)> -> (org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)

'i' @ [96:62] ==> val i: Int defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'value' @ [97:24] ==> val value: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'type' @ [97:30] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'methodNode' @ [98:13] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[ValueParameterDescriptorImpl]

'instructions' @ [98:24] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [98:37] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [98:50] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'VarInsnNode' @ [98:56] ==> public constructor VarInsnNode(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaClassConstructorDescriptor]

'type' @ [98:68] ==> val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'getOpcode' @ [98:73] ==> public open fun getOpcode(p0: Int): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'ISTORE' @ [98:91] ==> public const final val ISTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'nextVarIndex' @ [98:100] ==> var nextVarIndex: Int defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'nextVarIndex' @ [99:13] ==> var nextVarIndex: Int defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'type' @ [99:29] ==> val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'size' @ [99:34] ==> public final val Type.size: Int[MyPropertyDescriptor]

'storedTypes' @ [100:13] ==> val storedTypes: ArrayList<Type> /* = ArrayList<Type> */ defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'add' @ [100:25] ==> public open fun add(element: Type): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'type' @ [100:29] ==> val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'methodNode' @ [102:9] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[ValueParameterDescriptorImpl]

'maxLocals' @ [102:20] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'max' @ [102:37] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'methodNode' @ [102:41] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[ValueParameterDescriptorImpl]

'maxLocals' @ [102:52] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'nextVarIndex' @ [102:63] ==> var nextVarIndex: Int defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'methodNode' @ [104:9] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[ValueParameterDescriptorImpl]

'instructions' @ [104:20] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [104:33] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (InsnList..InsnList?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [104:46] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'insnListOf' @ [104:52] ==> public fun insnListOf(vararg insns: AbstractInsnNode): InsnList defined in org.jetbrains.kotlin.codegen.optimization.common[SimpleFunctionDescriptorImpl]

'TypeInsnNode' @ [105:17] ==> public constructor TypeInsnNode(p0: Int, p1: (String..String?)) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaClassConstructorDescriptor]

'NEW' @ [105:38] ==> public const final val NEW: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'uninitializedValue' @ [105:43] ==> val uninitializedValue: UninitializedNewValue defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'newInsn' @ [105:62] ==> public final val newInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValue[PropertyDescriptorImpl]

'desc' @ [105:70] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaPropertyDescriptor]

'InsnNode' @ [106:17] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'DUP' @ [106:34] ==> public const final val DUP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'storedTypes' @ [109:22] ==> val storedTypes: ArrayList<Type> /* = ArrayList<Type> */ defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'reversed' @ [109:34] ==> public fun <T> Iterable<Type>.reversed(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'nextVarIndex' @ [110:13] ==> var nextVarIndex: Int defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'type' @ [110:29] ==> val type: Type defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'size' @ [110:34] ==> public final val Type.size: Int[MyPropertyDescriptor]

'methodNode' @ [111:13] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[ValueParameterDescriptorImpl]

'instructions' @ [111:24] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [111:37] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [111:50] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'VarInsnNode' @ [111:56] ==> public constructor VarInsnNode(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaClassConstructorDescriptor]

'type' @ [111:68] ==> val type: Type defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'getOpcode' @ [111:73] ==> public open fun getOpcode(p0: Int): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'ILOAD' @ [111:91] ==> public const final val ILOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'nextVarIndex' @ [111:99] ==> var nextVarIndex: Int defined in org.jetbrains.kotlin.codegen.coroutines.processUninitializedStores[LocalVariableDescriptor]

'StrictBasicValue' @ [118:5] ==> public constructor StrictBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[ClassConstructorDescriptorImpl]

'getObjectType' @ [118:27] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'internalName' @ [118:41] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValue.<init>[ValueParameterDescriptorImpl]

'internalName' @ [119:69] ==> public final val internalName: String defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValue[PropertyDescriptorImpl]

'Frame<BasicValue>' @ [122:71] ==> public constructor Frame<V : (Value..Value?)>(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Value..Value?)> -> BasicValue

'nLocals' @ [122:89] ==> value-parameter nLocals: Int defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueFrame.<init>[ValueParameterDescriptorImpl]

'nStack' @ [122:98] ==> value-parameter nStack: Int defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueFrame.<init>[ValueParameterDescriptorImpl]

'getUninitializedValueForConstructorCall' @ [124:46] ==> private fun Frame<BasicValue>.getUninitializedValueForConstructorCall(insn: AbstractInsnNode): UninitializedNewValue? defined in org.jetbrains.kotlin.codegen.coroutines[SimpleFunctionDescriptorImpl]

'insn' @ [124:86] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueFrame.execute[ValueParameterDescriptorImpl]

'super' @ [126:9] ==> <this> defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueFrame[LazyClassReceiverParameterDescriptor]

'execute' @ [126:15] ==> public open fun execute(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (Interpreter<(BasicValue..BasicValue?)>..Interpreter<(BasicValue..BasicValue?)>?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'insn' @ [126:23] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueFrame.execute[ValueParameterDescriptorImpl]

'interpreter' @ [126:29] ==> value-parameter interpreter: Interpreter<BasicValue>? defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueFrame.execute[ValueParameterDescriptorImpl]

'replaceTopValueWithInitialized' @ [128:13] ==> val replaceTopValueWithInitialized: Boolean defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueFrame.execute[LocalVariableDescriptor]

'pop' @ [130:25] ==> public open fun pop(): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueFrame[JavaMethodDescriptor]

'push' @ [133:13] ==> public open fun push(p0: (BasicValue..BasicValue?)): Unit defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueFrame[JavaMethodDescriptor]

'StrictBasicValue' @ [133:18] ==> public constructor StrictBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[ClassConstructorDescriptorImpl]

'value' @ [133:35] ==> val value: UninitializedNewValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueFrame.execute[LocalVariableDescriptor]

'type' @ [133:41] ==> public final val UninitializedNewValue.type: (Type..Type?)[MyPropertyDescriptor]

'!' @ [144:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'insn' @ [144:10] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.getUninitializedValueForConstructorCall[ValueParameterDescriptorImpl]

'isConstructorCall' @ [144:15] ==> private fun AbstractInsnNode.isConstructorCall(): Boolean defined in org.jetbrains.kotlin.codegen.coroutines[SimpleFunctionDescriptorImpl]

'assert' @ [146:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'insn' @ [146:12] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.getUninitializedValueForConstructorCall[ValueParameterDescriptorImpl]

'opcode' @ [146:17] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'INVOKESPECIAL' @ [146:35] ==> public const final val INVOKESPECIAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [146:109] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.getUninitializedValueForConstructorCall[ValueParameterDescriptorImpl]

'opcode' @ [146:114] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'+' @ [147:40] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'getArgumentTypes' @ [147:45] ==> public open fun getArgumentTypes(p0: (String..String?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'insn' @ [147:63] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.getUninitializedValueForConstructorCall[ValueParameterDescriptorImpl]

'desc' @ [147:87] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'size' @ [147:93] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'getStack' @ [148:20] ==> public open fun getStack(p0: Int): (BasicValue..BasicValue?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'stackSize' @ [148:29] ==> public final val <V : (Value..Value?)> Frame<BasicValue>.stackSize: Int[MyPropertyDescriptor]
Inferred types:
    <V : (Value..Value?)> -> BasicValue

'paramsCountIncludingReceiver' @ [148:42] ==> val paramsCountIncludingReceiver: Int defined in org.jetbrains.kotlin.codegen.coroutines.getUninitializedValueForConstructorCall[LocalVariableDescriptor]

'error' @ [148:106] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assert' @ [150:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'getStack' @ [150:12] ==> public open fun getStack(p0: Int): (BasicValue..BasicValue?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'stackSize' @ [150:21] ==> public final val <V : (Value..Value?)> Frame<BasicValue>.stackSize: Int[MyPropertyDescriptor]
Inferred types:
    <V : (Value..Value?)> -> BasicValue

'paramsCountIncludingReceiver' @ [150:33] ==> val paramsCountIncludingReceiver: Int defined in org.jetbrains.kotlin.codegen.coroutines.getUninitializedValueForConstructorCall[LocalVariableDescriptor]

'newValue' @ [154:12] ==> val newValue: UninitializedNewValue defined in org.jetbrains.kotlin.codegen.coroutines.getUninitializedValueForConstructorCall[LocalVariableDescriptor]

'this' @ [157:52] ==> <this> defined in org.jetbrains.kotlin.codegen.coroutines.isConstructorCall[ReceiverParameterDescriptorImpl]

'this' @ [157:78] ==> <this> defined in org.jetbrains.kotlin.codegen.coroutines.isConstructorCall[ReceiverParameterDescriptorImpl]

'name' @ [157:83] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'OptimizationBasicInterpreter' @ [159:56] ==> public constructor OptimizationBasicInterpreter() defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaClassConstructorDescriptor]

'hashMapOf' @ [160:43] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<AbstractInsnNode, MutableSet<AbstractInsnNode>> /* = HashMap<AbstractInsnNode, MutableSet<AbstractInsnNode>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> MutableSet<AbstractInsnNode>

'insn' @ [162:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.newOperation[ValueParameterDescriptorImpl]

'opcode' @ [162:18] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NEW' @ [162:36] ==> public const final val NEW: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'uninitializedValuesToCopyUsages' @ [163:13] ==> public final val uninitializedValuesToCopyUsages: HashMap<AbstractInsnNode, MutableSet<AbstractInsnNode>> /* = HashMap<AbstractInsnNode, MutableSet<AbstractInsnNode>> */ defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter[PropertyDescriptorImpl]

'getOrPut' @ [163:45] ==> public inline fun <K, V> MutableMap<AbstractInsnNode, MutableSet<AbstractInsnNode>>.getOrPut(key: AbstractInsnNode, defaultValue: () -> MutableSet<AbstractInsnNode>): MutableSet<AbstractInsnNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractInsnNode
    <V> -> MutableSet<AbstractInsnNode>

'insn' @ [163:54] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.newOperation[ValueParameterDescriptorImpl]

'mutableSetOf' @ [163:62] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<AbstractInsnNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'UninitializedNewValue' @ [164:20] ==> public constructor UninitializedNewValue(newInsn: TypeInsnNode, internalName: String) defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValue[ClassConstructorDescriptorImpl]

'insn' @ [164:42] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.newOperation[ValueParameterDescriptorImpl]

'insn' @ [164:64] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.newOperation[ValueParameterDescriptorImpl]

'desc' @ [164:69] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaPropertyDescriptor]

'super' @ [166:16] ==> <this> defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter[LazyClassReceiverParameterDescriptor]

'newOperation' @ [166:22] ==> @Override public open fun newOperation(@NotNull insn: AbstractInsnNode): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [166:35] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.newOperation[ValueParameterDescriptorImpl]

'value' @ [170:13] ==> value-parameter value: BasicValue? defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.copyOperation[ValueParameterDescriptorImpl]

'uninitializedValuesToCopyUsages' @ [171:13] ==> public final val uninitializedValuesToCopyUsages: HashMap<AbstractInsnNode, MutableSet<AbstractInsnNode>> /* = HashMap<AbstractInsnNode, MutableSet<AbstractInsnNode>> */ defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter[PropertyDescriptorImpl]

'value' @ [171:45] ==> value-parameter value: BasicValue? defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.copyOperation[ValueParameterDescriptorImpl]

'newInsn' @ [171:51] ==> public final val newInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValue[PropertyDescriptorImpl]

'add' @ [171:62] ==> public abstract fun add(element: AbstractInsnNode): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'insn' @ [171:66] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.copyOperation[ValueParameterDescriptorImpl]

'value' @ [172:20] ==> value-parameter value: BasicValue? defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.copyOperation[ValueParameterDescriptorImpl]

'super' @ [174:16] ==> <this> defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter[LazyClassReceiverParameterDescriptor]

'copyOperation' @ [174:22] ==> @Override public open fun copyOperation(@NotNull insn: AbstractInsnNode, value: (BasicValue..BasicValue?)): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [174:36] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.copyOperation[ValueParameterDescriptorImpl]

'value' @ [174:42] ==> value-parameter value: BasicValue? defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.copyOperation[ValueParameterDescriptorImpl]

'v' @ [178:13] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [178:19] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [178:29] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [179:13] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

'StrictBasicValue' @ [179:19] ==> public companion object defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[FakeCallableDescriptorForObject]

'UNINITIALIZED_VALUE' @ [179:36] ==> @JvmField public final val UNINITIALIZED_VALUE: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue.Companion[PropertyDescriptorImpl]

'w' @ [179:59] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

'StrictBasicValue' @ [179:65] ==> public companion object defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[FakeCallableDescriptorForObject]

'UNINITIALIZED_VALUE' @ [179:82] ==> @JvmField public final val UNINITIALIZED_VALUE: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue.Companion[PropertyDescriptorImpl]

'StrictBasicValue' @ [180:20] ==> public companion object defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[FakeCallableDescriptorForObject]

'UNINITIALIZED_VALUE' @ [180:37] ==> @JvmField public final val UNINITIALIZED_VALUE: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue.Companion[PropertyDescriptorImpl]

'v' @ [183:13] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [183:43] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [184:18] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

'newInsn' @ [184:48] ==> public final val newInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValue[PropertyDescriptorImpl]

'w' @ [184:61] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

'newInsn' @ [184:91] ==> public final val newInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValue[PropertyDescriptorImpl]

'StrictBasicValue' @ [186:24] ==> public companion object defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[FakeCallableDescriptorForObject]

'UNINITIALIZED_VALUE' @ [186:41] ==> @JvmField public final val UNINITIALIZED_VALUE: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue.Companion[PropertyDescriptorImpl]

'v' @ [189:20] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

'super' @ [192:16] ==> <this> defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter[LazyClassReceiverParameterDescriptor]

'merge' @ [192:22] ==> @NotNull @Override public open fun merge(@NotNull v: BasicValue, @NotNull w: BasicValue): BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'v' @ [192:28] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [192:31] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.coroutines.UninitializedNewValueMarkerInterpreter.merge[ValueParameterDescriptorImpl]

