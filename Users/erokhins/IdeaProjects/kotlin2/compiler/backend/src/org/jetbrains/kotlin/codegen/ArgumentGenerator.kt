'assert' @ [41:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'valueArgumentsByIndex' @ [41:16] ==> value-parameter valueArgumentsByIndex: List<ResolvedValueArgument> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[ValueParameterDescriptorImpl]

'size' @ [41:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'actualArgs' @ [41:46] ==> value-parameter actualArgs: List<ResolvedValueArgument> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[ValueParameterDescriptorImpl]

'size' @ [41:57] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'valueArgumentsByIndex' @ [42:70] ==> value-parameter valueArgumentsByIndex: List<ResolvedValueArgument> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[ValueParameterDescriptorImpl]

'size' @ [42:92] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'actualArgs' @ [42:103] ==> value-parameter actualArgs: List<ResolvedValueArgument> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[ValueParameterDescriptorImpl]

'size' @ [42:114] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'valueArgumentsByIndex' @ [45:25] ==> value-parameter valueArgumentsByIndex: List<ResolvedValueArgument> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[ValueParameterDescriptorImpl]

'mapToIndex' @ [45:47] ==> public fun <K> Iterable<ResolvedValueArgument>.mapToIndex(): Map<ResolvedValueArgument, Int> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ResolvedValueArgument

'actualArgs' @ [47:39] ==> value-parameter actualArgs: List<ResolvedValueArgument> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[ValueParameterDescriptorImpl]

'filter' @ [47:50] ==> public inline fun <T> Iterable<ResolvedValueArgument>.filter(predicate: (ResolvedValueArgument) -> Boolean): List<ResolvedValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedValueArgument

'it' @ [47:59] ==> value-parameter it: ResolvedValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [47:89] ==> public inline fun <T, R> Iterable<ResolvedValueArgument>.map(transform: (ResolvedValueArgument) -> ArgumentAndDeclIndex): List<ArgumentAndDeclIndex> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedValueArgument
    <R> -> ArgumentAndDeclIndex

'ArgumentAndDeclIndex' @ [48:13] ==> public constructor ArgumentAndDeclIndex(arg: ResolvedValueArgument, declIndex: Int) defined in org.jetbrains.kotlin.codegen.ArgumentAndDeclIndex[ClassConstructorDescriptorImpl]

'it' @ [48:34] ==> value-parameter it: ResolvedValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'arg2Index' @ [48:38] ==> val arg2Index: Map<ResolvedValueArgument, Int> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'it' @ [48:48] ==> value-parameter it: ResolvedValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'toMutableList' @ [49:11] ==> public fun <T> Collection<ArgumentAndDeclIndex>.toMutableList(): MutableList<ArgumentAndDeclIndex> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArgumentAndDeclIndex

'valueArgumentsByIndex' @ [51:9] ==> value-parameter valueArgumentsByIndex: List<ResolvedValueArgument> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[ValueParameterDescriptorImpl]

'withIndex' @ [51:31] ==> public fun <T> Iterable<ResolvedValueArgument>.withIndex(): Iterable<IndexedValue<ResolvedValueArgument>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedValueArgument

'forEach' @ [51:43] ==> @HidesMembers public inline fun <T> Iterable<IndexedValue<ResolvedValueArgument>>.forEach(action: (IndexedValue<ResolvedValueArgument>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<ResolvedValueArgument>

'it' @ [52:17] ==> value-parameter it: IndexedValue<ResolvedValueArgument> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [52:20] ==> public final val value: ResolvedValueArgument defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'actualArgsWithDeclIndex' @ [53:17] ==> val actualArgsWithDeclIndex: MutableList<ArgumentAndDeclIndex> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'add' @ [53:41] ==> public abstract fun add(index: Int, element: ArgumentAndDeclIndex): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [53:45] ==> value-parameter it: IndexedValue<ResolvedValueArgument> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [53:48] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'ArgumentAndDeclIndex' @ [53:55] ==> public constructor ArgumentAndDeclIndex(arg: ResolvedValueArgument, declIndex: Int) defined in org.jetbrains.kotlin.codegen.ArgumentAndDeclIndex[ClassConstructorDescriptorImpl]

'it' @ [53:76] ==> value-parameter it: IndexedValue<ResolvedValueArgument> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [53:79] ==> public final val value: ResolvedValueArgument defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'it' @ [53:86] ==> value-parameter it: IndexedValue<ResolvedValueArgument> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [53:89] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'DefaultCallArgs' @ [58:27] ==> public constructor DefaultCallArgs(size: Int) defined in org.jetbrains.kotlin.codegen.DefaultCallArgs[ClassConstructorDescriptorImpl]

'calleeDescriptor' @ [58:43] ==> value-parameter calleeDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[ValueParameterDescriptorImpl]

'unwrapFrontendVersion' @ [58:61] ==> public fun <D : CallableDescriptor> CallableDescriptor.unwrapFrontendVersion(): CallableDescriptor defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'valueParameters' @ [58:86] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [58:103] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'actualArgsWithDeclIndex' @ [60:39] ==> val actualArgsWithDeclIndex: MutableList<ArgumentAndDeclIndex> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'argumentWithDeclIndex' @ [61:28] ==> val argumentWithDeclIndex: ArgumentAndDeclIndex defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'arg' @ [61:50] ==> public final val arg: ResolvedValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentAndDeclIndex[PropertyDescriptorImpl]

'argumentWithDeclIndex' @ [62:29] ==> val argumentWithDeclIndex: ArgumentAndDeclIndex defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'declIndex' @ [62:51] ==> public final val declIndex: Int defined in org.jetbrains.kotlin.codegen.ArgumentAndDeclIndex[PropertyDescriptorImpl]

'when (argument) {
                is ExpressionValueArgument -> {
                    generateExpression(declIndex, argument)
                }
                is DefaultValueArgument -> {
                    defaultArgs.mark(declIndex)
                    generateDefault(declIndex, argument)
                }
                is VarargValueArgument -> {
                    generateVararg(declIndex, argument)
                }
                else -> {
                    generateOther(declIndex, argument)
                }
            }' @ [64:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'argument' @ [64:19] ==> val argument: ResolvedValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'generateExpression' @ [66:21] ==> protected open fun generateExpression(i: Int, argument: ExpressionValueArgument): Unit defined in org.jetbrains.kotlin.codegen.ArgumentGenerator[SimpleFunctionDescriptorImpl]

'declIndex' @ [66:40] ==> val declIndex: Int defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'argument' @ [66:51] ==> val argument: ResolvedValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'defaultArgs' @ [69:21] ==> val defaultArgs: DefaultCallArgs defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'mark' @ [69:33] ==> public final fun mark(index: Int): Unit defined in org.jetbrains.kotlin.codegen.DefaultCallArgs[SimpleFunctionDescriptorImpl]

'declIndex' @ [69:38] ==> val declIndex: Int defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'generateDefault' @ [70:21] ==> protected open fun generateDefault(i: Int, argument: DefaultValueArgument): Unit defined in org.jetbrains.kotlin.codegen.ArgumentGenerator[SimpleFunctionDescriptorImpl]

'declIndex' @ [70:37] ==> val declIndex: Int defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'argument' @ [70:48] ==> val argument: ResolvedValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'generateVararg' @ [73:21] ==> protected open fun generateVararg(i: Int, argument: VarargValueArgument): Unit defined in org.jetbrains.kotlin.codegen.ArgumentGenerator[SimpleFunctionDescriptorImpl]

'declIndex' @ [73:36] ==> val declIndex: Int defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'argument' @ [73:47] ==> val argument: ResolvedValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'generateOther' @ [76:21] ==> protected open fun generateOther(i: Int, argument: ResolvedValueArgument): Unit defined in org.jetbrains.kotlin.codegen.ArgumentGenerator[SimpleFunctionDescriptorImpl]

'declIndex' @ [76:35] ==> val declIndex: Int defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'argument' @ [76:46] ==> val argument: ResolvedValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'reorderArgumentsIfNeeded' @ [81:9] ==> protected open fun reorderArgumentsIfNeeded(args: List<ArgumentAndDeclIndex>): Unit defined in org.jetbrains.kotlin.codegen.ArgumentGenerator[SimpleFunctionDescriptorImpl]

'actualArgsWithDeclIndex' @ [81:34] ==> val actualArgsWithDeclIndex: MutableList<ArgumentAndDeclIndex> defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'defaultArgs' @ [83:16] ==> val defaultArgs: DefaultCallArgs defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generate[LocalVariableDescriptor]

'UnsupportedOperationException' @ [87:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'i' @ [87:86] ==> value-parameter i: Int defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generateExpression[ValueParameterDescriptorImpl]

'argument' @ [87:90] ==> value-parameter argument: ExpressionValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generateExpression[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [91:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'i' @ [91:83] ==> value-parameter i: Int defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generateDefault[ValueParameterDescriptorImpl]

'argument' @ [91:87] ==> value-parameter argument: DefaultValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generateDefault[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [95:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'i' @ [95:82] ==> value-parameter i: Int defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generateVararg[ValueParameterDescriptorImpl]

'argument' @ [95:86] ==> value-parameter argument: VarargValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generateVararg[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [99:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'i' @ [99:75] ==> value-parameter i: Int defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generateOther[ValueParameterDescriptorImpl]

'argument' @ [99:79] ==> value-parameter argument: ResolvedValueArgument defined in org.jetbrains.kotlin.codegen.ArgumentGenerator.generateOther[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [103:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

