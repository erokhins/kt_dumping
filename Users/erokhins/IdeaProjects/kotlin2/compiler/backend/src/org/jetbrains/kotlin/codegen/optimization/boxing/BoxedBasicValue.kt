'StrictBasicValue' @ [27:46] ==> public constructor StrictBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[ClassConstructorDescriptorImpl]

'type' @ [27:63] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue.<init>[ValueParameterDescriptorImpl]

'this' @ [31:40] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[LazyClassReceiverParameterDescriptor]

'other' @ [31:49] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue.equals[ValueParameterDescriptorImpl]

'identityHashCode' @ [32:38] ==> public open fun identityHashCode(p0: (Any..Any?)): Int defined in java.lang.System[JavaMethodDescriptor]

'this' @ [32:55] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[LazyClassReceiverParameterDescriptor]

'BoxedBasicValue' @ [40:5] ==> public constructor BoxedBasicValue(type: Type) defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[ClassConstructorDescriptorImpl]

'boxedType' @ [40:21] ==> value-parameter boxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.CleanBoxedValue.<init>[ValueParameterDescriptorImpl]

'BoxedValueDescriptor' @ [41:31] ==> public constructor BoxedValueDescriptor(boxedType: Type, boxingInsn: AbstractInsnNode, progressionIterator: ProgressionIteratorBasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[ClassConstructorDescriptorImpl]

'boxedType' @ [41:52] ==> value-parameter boxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.CleanBoxedValue.<init>[ValueParameterDescriptorImpl]

'boxingInsn' @ [41:63] ==> value-parameter boxingInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.CleanBoxedValue.<init>[ValueParameterDescriptorImpl]

'progressionIterator' @ [41:75] ==> value-parameter progressionIterator: ProgressionIteratorBasicValue? defined in org.jetbrains.kotlin.codegen.optimization.boxing.CleanBoxedValue.<init>[ValueParameterDescriptorImpl]

'tainted' @ [44:45] ==> private final var tainted: TaintedBoxedValue? defined in org.jetbrains.kotlin.codegen.optimization.boxing.CleanBoxedValue[PropertyDescriptorImpl]

'TaintedBoxedValue' @ [44:56] ==> public constructor TaintedBoxedValue(boxedBasicValue: CleanBoxedValue) defined in org.jetbrains.kotlin.codegen.optimization.boxing.TaintedBoxedValue[ClassConstructorDescriptorImpl]

'this' @ [44:74] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.boxing.CleanBoxedValue[LazyClassReceiverParameterDescriptor]

'also' @ [44:80] ==> @InlineOnly @SinceKotlin public inline fun <T> TaintedBoxedValue.also(block: (TaintedBoxedValue) -> Unit): TaintedBoxedValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TaintedBoxedValue

'tainted' @ [44:87] ==> private final var tainted: TaintedBoxedValue? defined in org.jetbrains.kotlin.codegen.optimization.boxing.CleanBoxedValue[PropertyDescriptorImpl]

'it' @ [44:97] ==> value-parameter it: TaintedBoxedValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.CleanBoxedValue.taint.<anonymous>[ValueParameterDescriptorImpl]

'BoxedBasicValue' @ [48:73] ==> public constructor BoxedBasicValue(type: Type) defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[ClassConstructorDescriptorImpl]

'boxedBasicValue' @ [48:89] ==> value-parameter boxedBasicValue: CleanBoxedValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.TaintedBoxedValue.<init>[ValueParameterDescriptorImpl]

'type' @ [48:105] ==> public final val CleanBoxedValue.type: (Type..Type?)[MyPropertyDescriptor]

'boxedBasicValue' @ [49:37] ==> private final val boxedBasicValue: CleanBoxedValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.TaintedBoxedValue[PropertyDescriptorImpl]

'descriptor' @ [49:53] ==> public open val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.CleanBoxedValue[PropertyDescriptorImpl]

'this' @ [51:45] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.boxing.TaintedBoxedValue[LazyClassReceiverParameterDescriptor]

'HashSet' @ [60:35] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AbstractInsnNode

'HashSet' @ [61:41] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<AbstractInsnNode, Type>

'HashSet' @ [62:39] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'HashSet' @ [63:30] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> BoxedValueDescriptor

'getUnboxedType' @ [66:29] ==> public fun getUnboxedType(boxedType: Type): Type defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxedBasicValue.kt[SimpleFunctionDescriptorImpl]

'boxedType' @ [66:44] ==> private final val boxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'associatedInsns' @ [68:32] ==> private final val associatedInsns: HashSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'toList' @ [68:48] ==> public fun <T> Iterable<AbstractInsnNode>.toList(): List<AbstractInsnNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'associatedInsns' @ [71:9] ==> private final val associatedInsns: HashSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'add' @ [71:25] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'insnNode' @ [71:29] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor.addInsn[ValueParameterDescriptorImpl]

'associatedVariables' @ [75:9] ==> private final val associatedVariables: HashSet<Int> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'add' @ [75:29] ==> public open fun add(element: Int): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'index' @ [75:33] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor.addVariableIndex[ValueParameterDescriptorImpl]

'ArrayList' @ [79:13] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (Int..Int?)>..Collection<(Int..Int?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'associatedVariables' @ [79:23] ==> private final val associatedVariables: HashSet<Int> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'mergedWith' @ [82:9] ==> private final val mergedWith: HashSet<BoxedValueDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'add' @ [82:20] ==> public open fun add(element: BoxedValueDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'descriptor' @ [82:24] ==> value-parameter descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor.addMergedWith[ValueParameterDescriptorImpl]

'mergedWith' @ [86:13] ==> private final val mergedWith: HashSet<BoxedValueDescriptor> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'isSafeToRemove' @ [89:9] ==> public final var isSafeToRemove: Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'unboxedType' @ [92:26] ==> public final val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'size' @ [92:38] ==> public final val Type.size: Int[MyPropertyDescriptor]

'progressionIterator' @ [94:39] ==> public final val progressionIterator: ProgressionIteratorBasicValue? defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'unboxingWithCastInsns' @ [97:9] ==> private final val unboxingWithCastInsns: HashSet<Pair<AbstractInsnNode, Type>> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'add' @ [97:31] ==> public open fun add(element: Pair<AbstractInsnNode, Type>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'create' @ [97:40] ==> @NotNull public open fun <A : (Any..Any?), B : (Any..Any?)> create(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (Type..Type?)): Pair<(AbstractInsnNode..AbstractInsnNode?), (Type..Type?)> defined in com.intellij.openapi.util.Pair[JavaMethodDescriptor]
Inferred types:
    <A : (Any..Any?)> -> AbstractInsnNode
    <B : (Any..Any?)> -> Type

'insn' @ [97:47] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor.addUnboxingWithCastTo[ValueParameterDescriptorImpl]

'type' @ [97:53] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor.addUnboxingWithCastTo[ValueParameterDescriptorImpl]

'unboxingWithCastInsns' @ [101:13] ==> private final val unboxingWithCastInsns: HashSet<Pair<AbstractInsnNode, Type>> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'unboxPrimitiveTypeOrNull' @ [106:33] ==> @Nullable public open fun unboxPrimitiveTypeOrNull(@NotNull boxedType: Type): Type? defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'boxedType' @ [106:58] ==> value-parameter boxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.getUnboxedType[ValueParameterDescriptorImpl]

'primitiveType' @ [107:9] ==> val primitiveType: Type? defined in org.jetbrains.kotlin.codegen.optimization.boxing.getUnboxedType[LocalVariableDescriptor]

'primitiveType' @ [107:39] ==> val primitiveType: Type? defined in org.jetbrains.kotlin.codegen.optimization.boxing.getUnboxedType[LocalVariableDescriptor]

'boxedType' @ [109:9] ==> value-parameter boxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.getUnboxedType[ValueParameterDescriptorImpl]

'K_CLASS_TYPE' @ [109:31] ==> public final val K_CLASS_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'JAVA_CLASS_TYPE' @ [109:61] ==> public final val JAVA_CLASS_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'IllegalArgumentException' @ [111:11] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'boxedType' @ [111:86] ==> value-parameter boxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.getUnboxedType[ValueParameterDescriptorImpl]

