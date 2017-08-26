'ExpressionInfo' @ [59:84] ==> public constructor ExpressionInfo(expression: IrExpression) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionInfo[ClassConstructorDescriptorImpl]

'loop' @ [59:99] ==> value-parameter loop: IrLoop defined in org.jetbrains.kotlin.backend.jvm.codegen.LoopInfo.<init>[ValueParameterDescriptorImpl]

'ExpressionInfo' @ [61:38] ==> public constructor ExpressionInfo(expression: IrExpression) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionInfo[ClassConstructorDescriptorImpl]

'tryBlock' @ [61:53] ==> value-parameter tryBlock: IrTry defined in org.jetbrains.kotlin.backend.jvm.codegen.TryInfo.<init>[ValueParameterDescriptorImpl]

'mutableListOf' @ [62:16] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Label> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label

'mutableListOf' @ [66:48] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<VariableInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableInfo

'Stack' @ [68:25] ==> public constructor Stack<E : (Any..Any?)>() defined in java.util.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ExpressionInfo

'BlockInfo' @ [70:20] ==> private constructor BlockInfo(parent: BlockInfo?) defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[ClassConstructorDescriptorImpl]

'this' @ [70:30] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[LazyClassReceiverParameterDescriptor]

'apply' @ [70:36] ==> @InlineOnly public inline fun <T> BlockInfo.apply(block: BlockInfo.() -> Unit): BlockInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BlockInfo

'this@apply' @ [71:9] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo.create.<anonymous>[ReceiverParameterDescriptorImpl]

'infos' @ [71:20] ==> private final val infos: Stack<ExpressionInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'addAll' @ [71:26] ==> public open fun addAll(elements: Collection<(ExpressionInfo..ExpressionInfo?)>): Boolean defined in java.util.Stack[JavaMethodDescriptor]

'this@BlockInfo' @ [71:33] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[LazyClassReceiverParameterDescriptor]

'infos' @ [71:48] ==> private final val infos: Stack<ExpressionInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'infos' @ [75:9] ==> private final val infos: Stack<ExpressionInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'add' @ [75:15] ==> public open fun add(element: (ExpressionInfo..ExpressionInfo?)): Boolean defined in java.util.Stack[JavaMethodDescriptor]

'loop' @ [75:19] ==> value-parameter loop: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo.addInfo[ValueParameterDescriptorImpl]

'assert' @ [79:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'peek' @ [79:17] ==> public final fun peek(): ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'info' @ [79:27] ==> value-parameter info: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo.removeInfo[ValueParameterDescriptorImpl]

'pop' @ [80:9] ==> public final fun pop(): ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'infos' @ [83:33] ==> private final val infos: Stack<ExpressionInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'pop' @ [83:39] ==> public open fun pop(): (ExpressionInfo..ExpressionInfo?) defined in java.util.Stack[JavaMethodDescriptor]

'infos' @ [85:34] ==> private final val infos: Stack<ExpressionInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'peek' @ [85:40] ==> public open fun peek(): (ExpressionInfo..ExpressionInfo?) defined in java.util.Stack[JavaMethodDescriptor]

'infos' @ [87:30] ==> private final val infos: Stack<ExpressionInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'isEmpty' @ [87:36] ==> public open fun isEmpty(): Boolean defined in java.util.Stack[JavaMethodDescriptor]

'infos' @ [89:39] ==> private final val infos: Stack<ExpressionInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'firstIsInstanceOrNull' @ [89:45] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): TryInfo? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TryInfo

'BlockInfo' @ [92:24] ==> private constructor BlockInfo(parent: BlockInfo?) defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[ClassConstructorDescriptorImpl]

'Suppress' @ [98:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'IrIntrinsicMethods' @ [107:22] ==> public constructor IrIntrinsicMethods(irBuiltIns: IrBuiltIns) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicMethods[ClassConstructorDescriptorImpl]

'classCodegen' @ [107:41] ==> public final val classCodegen: ClassCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'context' @ [107:54] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'irBuiltIns' @ [107:62] ==> public open val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'classCodegen' @ [109:22] ==> public final val classCodegen: ClassCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'typeMapper' @ [109:35] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'typeMapper' @ [111:22] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapReturnType' @ [111:33] ==> @NotNull public open fun mapReturnType(@NotNull p0: CallableDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'irFunction' @ [111:47] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'descriptor' @ [111:58] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'classCodegen' @ [113:17] ==> public final val classCodegen: ClassCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'state' @ [113:30] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'mv' @ [116:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'visitCode' @ [116:12] ==> public open fun visitCode(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'BlockInfo' @ [117:20] ==> public companion object defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[FakeCallableDescriptorForObject]

'create' @ [117:30] ==> public final fun create(): BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo.Companion[SimpleFunctionDescriptorImpl]

'irFunction' @ [118:22] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'body' @ [118:33] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'accept' @ [118:39] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<StackValue, BlockInfo>, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.ir.expressions.IrBody[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> StackValue
    <D> -> BlockInfo

'this' @ [118:46] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'info' @ [118:52] ==> val info: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generate[LocalVariableDescriptor]

'typeMapper' @ [122:26] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapReturnType' @ [122:37] ==> @NotNull public open fun mapReturnType(@NotNull p0: CallableDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'irFunction' @ [122:51] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'descriptor' @ [122:62] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'returnType' @ [123:13] ==> val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generate[LocalVariableDescriptor]

'VOID_TYPE' @ [123:32] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'mv' @ [125:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'areturn' @ [125:16] ==> public open fun areturn(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'VOID_TYPE' @ [125:29] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'writeLocalVariablesInTable' @ [127:9] ==> private final fun writeLocalVariablesInTable(info: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'info' @ [127:36] ==> val info: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generate[LocalVariableDescriptor]

'mv' @ [128:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'visitEnd' @ [128:12] ==> public open fun visitEnd(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'body' @ [132:16] ==> value-parameter body: IrBlockBody defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlockBody[ValueParameterDescriptorImpl]

'statements' @ [132:21] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[DeserializedPropertyDescriptor]

'fold' @ [132:32] ==> public inline fun <T, R> Iterable<IrStatement>.fold(initial: (StackValue..StackValue?), operation: (acc: (StackValue..StackValue?), IrStatement) -> (StackValue..StackValue?)): (StackValue..StackValue?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement
    <R> -> (org.jetbrains.kotlin.codegen.StackValue..org.jetbrains.kotlin.codegen.StackValue?)

'none' @ [132:37] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'exp' @ [134:13] ==> value-parameter exp: IrStatement defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlockBody.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [134:17] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<StackValue, BlockInfo>, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.ir.IrStatement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> StackValue
    <D> -> BlockInfo

'this' @ [134:24] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [134:30] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlockBody[ValueParameterDescriptorImpl]

'data' @ [139:20] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock[ValueParameterDescriptorImpl]

'create' @ [139:25] ==> public final fun create(): BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'super' @ [140:16] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'visitBlock' @ [140:22] ==> public open fun visitBlock(expression: IrBlock, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[DeserializedSimpleFunctionDescriptor]

'expression' @ [140:33] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock[ValueParameterDescriptorImpl]

'info' @ [140:45] ==> val info: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock[LocalVariableDescriptor]

'apply' @ [140:51] ==> @InlineOnly public inline fun <T> StackValue.apply(block: StackValue.() -> Unit): StackValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StackValue

'if (!expression.isTransparentScope) {
                writeLocalVariablesInTable(info)
            }
            else {
                info.variables.forEach {
                    data.variables.add(it)
                }
            }' @ [141:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [141:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [141:18] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock[ValueParameterDescriptorImpl]

'isTransparentScope' @ [141:29] ==> public open val isTransparentScope: Boolean defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'writeLocalVariablesInTable' @ [142:17] ==> private final fun writeLocalVariablesInTable(info: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'info' @ [142:44] ==> val info: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock[LocalVariableDescriptor]

'info' @ [145:17] ==> val info: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock[LocalVariableDescriptor]

'variables' @ [145:22] ==> public final val variables: MutableList<VariableInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'forEach' @ [145:32] ==> @HidesMembers public inline fun <T> Iterable<VariableInfo>.forEach(action: (VariableInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableInfo

'data' @ [146:21] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock[ValueParameterDescriptorImpl]

'variables' @ [146:26] ==> public final val variables: MutableList<VariableInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'add' @ [146:36] ==> public abstract fun add(element: VariableInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [146:40] ==> value-parameter it: VariableInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'markNewLabel' @ [153:24] ==> public final fun markNewLabel(): Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'info' @ [154:9] ==> value-parameter info: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.writeLocalVariablesInTable[ValueParameterDescriptorImpl]

'variables' @ [154:14] ==> public final val variables: MutableList<VariableInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'forEach' @ [154:24] ==> @HidesMembers public inline fun <T> Iterable<VariableInfo>.forEach(action: (VariableInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableInfo

'mv' @ [155:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'visitLocalVariable' @ [155:16] ==> public open fun visitLocalVariable(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: (Label..Label?), p4: (Label..Label?), p5: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'it' @ [155:35] ==> value-parameter it: VariableInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.writeLocalVariablesInTable.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [155:38] ==> public final val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.VariableInfo[PropertyDescriptorImpl]

'name' @ [155:49] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [155:54] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [155:66] ==> value-parameter it: VariableInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.writeLocalVariablesInTable.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [155:69] ==> public final val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.VariableInfo[PropertyDescriptorImpl]

'descriptor' @ [155:74] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'it' @ [155:92] ==> value-parameter it: VariableInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.writeLocalVariablesInTable.<anonymous>[ValueParameterDescriptorImpl]

'startLabel' @ [155:95] ==> public final val startLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.VariableInfo[PropertyDescriptorImpl]

'endLabel' @ [155:107] ==> val endLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.writeLocalVariablesInTable[LocalVariableDescriptor]

'it' @ [155:117] ==> value-parameter it: VariableInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.writeLocalVariablesInTable.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [155:120] ==> public final val index: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.VariableInfo[PropertyDescriptorImpl]

'info' @ [158:9] ==> value-parameter info: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.writeLocalVariablesInTable[ValueParameterDescriptorImpl]

'variables' @ [158:14] ==> public final val variables: MutableList<VariableInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'reversed' @ [158:24] ==> public fun <T> Iterable<VariableInfo>.reversed(): List<VariableInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableInfo

'forEach' @ [158:35] ==> @HidesMembers public inline fun <T> Iterable<VariableInfo>.forEach(action: (VariableInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableInfo

'frame' @ [159:13] ==> public final val frame: FrameMap defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'leave' @ [159:19] ==> public open fun leave(p0: (DeclarationDescriptor..DeclarationDescriptor?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'it' @ [159:25] ==> value-parameter it: VariableInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.writeLocalVariablesInTable.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [159:28] ==> public final val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.VariableInfo[PropertyDescriptorImpl]

'expression' @ [164:22] ==> value-parameter expression: IrContainerExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression[ValueParameterDescriptorImpl]

'statements' @ [164:33] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrContainerExpression[DeserializedPropertyDescriptor]

'fold' @ [164:44] ==> public inline fun <T, R> Iterable<IrStatement>.fold(initial: (StackValue..StackValue?), operation: (acc: (StackValue..StackValue?), IrStatement) -> (StackValue..StackValue?)): (StackValue..StackValue?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement
    <R> -> (org.jetbrains.kotlin.codegen.StackValue..org.jetbrains.kotlin.codegen.StackValue?)

'none' @ [164:49] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'exp' @ [167:13] ==> value-parameter exp: IrStatement defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [167:17] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<StackValue, BlockInfo>, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.ir.IrStatement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> StackValue
    <D> -> BlockInfo

'this' @ [167:24] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [167:30] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression[ValueParameterDescriptorImpl]

'coerceNotToUnit' @ [169:9] ==> private final fun coerceNotToUnit(fromType: Type, toType: Type): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'result' @ [169:25] ==> val result: (StackValue..StackValue?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression[LocalVariableDescriptor]

'type' @ [169:32] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'expression' @ [169:38] ==> value-parameter expression: IrContainerExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression[ValueParameterDescriptorImpl]

'asmType' @ [169:49] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'expression' @ [170:16] ==> value-parameter expression: IrContainerExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression[ValueParameterDescriptorImpl]

'onStack' @ [170:27] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'generateCall' @ [174:16] ==> private final fun generateCall(expression: IrMemberAccessExpression, superQualifier: ClassDescriptor?, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [174:29] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitMemberAccess[ValueParameterDescriptorImpl]

'data' @ [174:47] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitMemberAccess[ValueParameterDescriptorImpl]

'expression' @ [178:13] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [178:24] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'generateNewCall' @ [179:20] ==> private final fun generateNewCall(expression: IrCall, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [179:36] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitCall[ValueParameterDescriptorImpl]

'data' @ [179:48] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitCall[ValueParameterDescriptorImpl]

'generateCall' @ [181:16] ==> private final fun generateCall(expression: IrMemberAccessExpression, superQualifier: ClassDescriptor?, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [181:29] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitCall[ValueParameterDescriptorImpl]

'expression' @ [181:41] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitCall[ValueParameterDescriptorImpl]

'superQualifier' @ [181:52] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'data' @ [181:68] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitCall[ValueParameterDescriptorImpl]

'expression' @ [185:20] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewCall[ValueParameterDescriptorImpl]

'asmType' @ [185:31] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'type' @ [186:13] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewCall[LocalVariableDescriptor]

'sort' @ [186:18] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'ARRAY' @ [186:31] ==> public const final val ARRAY: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'generateNewArray' @ [188:20] ==> public final fun generateNewArray(expression: IrCall, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [188:37] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewCall[ValueParameterDescriptorImpl]

'data' @ [188:49] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewCall[ValueParameterDescriptorImpl]

'mv' @ [191:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'anew' @ [191:12] ==> public open fun anew(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'expression' @ [191:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewCall[ValueParameterDescriptorImpl]

'asmType' @ [191:28] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mv' @ [192:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'dup' @ [192:12] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'generateCall' @ [193:9] ==> private final fun generateCall(expression: IrMemberAccessExpression, superQualifier: ClassDescriptor?, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [193:22] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewCall[ValueParameterDescriptorImpl]

'expression' @ [193:34] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewCall[ValueParameterDescriptorImpl]

'superQualifier' @ [193:45] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'data' @ [193:61] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewCall[ValueParameterDescriptorImpl]

'expression' @ [194:16] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewCall[ValueParameterDescriptorImpl]

'onStack' @ [194:27] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'expression' @ [200:20] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[ValueParameterDescriptorImpl]

'descriptor' @ [200:31] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'valueParameters' @ [200:42] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'assert' @ [201:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'args' @ [201:16] ==> val args: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[LocalVariableDescriptor]

'size' @ [201:21] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'args' @ [201:34] ==> val args: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[LocalVariableDescriptor]

'size' @ [201:39] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'+' @ [201:52] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'args' @ [201:85] ==> val args: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[LocalVariableDescriptor]

'size' @ [201:90] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'args' @ [203:13] ==> val args: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[LocalVariableDescriptor]

'size' @ [203:18] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'expression' @ [204:34] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[ValueParameterDescriptorImpl]

'getValueArgument' @ [204:45] ==> public abstract fun getValueArgument(index: Int): IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'gen' @ [205:13] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'sizeExpression' @ [205:17] ==> val sizeExpression: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[LocalVariableDescriptor]

'INT_TYPE' @ [205:38] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'data' @ [205:48] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[ValueParameterDescriptorImpl]

'newArrayInstruction' @ [206:13] ==> public final fun newArrayInstruction(arrayType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [206:33] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[ValueParameterDescriptorImpl]

'type' @ [206:44] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [207:20] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[ValueParameterDescriptorImpl]

'onStack' @ [207:31] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'generateCall' @ [210:16] ==> private final fun generateCall(expression: IrMemberAccessExpression, superQualifier: ClassDescriptor?, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [210:29] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[ValueParameterDescriptorImpl]

'expression' @ [210:41] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[ValueParameterDescriptorImpl]

'superQualifier' @ [210:52] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'data' @ [210:68] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateNewArray[ValueParameterDescriptorImpl]

'resolveToCallable' @ [214:24] ==> private final fun resolveToCallable(irCall: IrMemberAccessExpression, isSuper: Boolean): Callable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [214:42] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'superQualifier' @ [214:54] ==> value-parameter superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'if (callable is IrIntrinsicFunction) {
            return callable.invoke(mv, this, data)
        } else {
            val callGenerator = getOrCreateCallGenerator(expression, expression.descriptor)

            val receiver = expression.dispatchReceiver
            receiver?.apply {
                //gen(receiver, callable.dispatchReceiverType!!, data)
                callGenerator.genValueAndPut(null, this, callable.dispatchReceiverType!!, -1, this@ExpressionCodegen, data)
            }

            expression.extensionReceiver?.apply {
                //gen(this, callable.extensionReceiverType!!, data)
                callGenerator.genValueAndPut(null, this, callable.extensionReceiverType!!, -1, this@ExpressionCodegen, data)
            }

            val defaultMask = DefaultCallArgs(callable.valueParameterTypes.size)
            expression.descriptor.valueParameters.forEachIndexed { i, parameterDescriptor ->
                val arg = expression.getValueArgument(i)
                val parameterType = callable.valueParameterTypes[i]
                when {
                    arg != null -> {
                        callGenerator.genValueAndPut(parameterDescriptor, arg, parameterType, i, this@ExpressionCodegen, data)
                    }
                    parameterDescriptor.hasDefaultValue() -> {
                        callGenerator.putValueIfNeeded(parameterType, StackValue.createDefaultValue(parameterType), ValueKind.DEFAULT_PARAMETER, i, this@ExpressionCodegen)
                        defaultMask.mark(i)
                    }
                    else -> {
                        assert(parameterDescriptor.varargElementType != null)
                        //empty vararg

                        callGenerator.putValueIfNeeded(
                                parameterType,
                                StackValue.operation(parameterType) {
                                    it.aconst(0)
                                    it.newarray(correctElementType(parameterType))
                                },
                                ValueKind.GENERAL_VARARG, i, this@ExpressionCodegen)
                    }
                }
            }

            callGenerator.genCall(
                    callable,
                    defaultMask.generateOnStackIfNeeded(callGenerator, expression.descriptor is ConstructorDescriptor, this),
                    this
            )

            val returnType = expression.descriptor.returnType
            if (returnType != null && KotlinBuiltIns.isNothing(returnType)) {
                mv.aconst(null)
                mv.athrow()
            }
            return StackValue.onStack(callable.returnType)
        }' @ [215:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'callable' @ [215:13] ==> val callable: Callable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'callable' @ [216:20] ==> val callable: Callable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'invoke' @ [216:29] ==> public open fun invoke(v: InstructionAdapter, codegen: ExpressionCodegen, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[SimpleFunctionDescriptorImpl]

'mv' @ [216:36] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'this' @ [216:40] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [216:46] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'getOrCreateCallGenerator' @ [218:33] ==> internal final fun getOrCreateCallGenerator(memberAccessExpression: IrMemberAccessExpression, descriptor: CallableDescriptor): IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [218:58] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'expression' @ [218:70] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'descriptor' @ [218:81] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'expression' @ [220:28] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [220:39] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'receiver' @ [221:13] ==> val receiver: IrExpression? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'apply' @ [221:23] ==> @InlineOnly public inline fun <T> IrExpression.apply(block: IrExpression.() -> Unit): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'callGenerator' @ [223:17] ==> val callGenerator: IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'genValueAndPut' @ [223:31] ==> public open fun genValueAndPut(valueParameterDescriptor: ValueParameterDescriptor?, argumentExpression: IrExpression, parameterType: Type, parameterIndex: Int, codegen: ExpressionCodegen, blockInfo: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator[SimpleFunctionDescriptorImpl]

'this' @ [223:52] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[ReceiverParameterDescriptorImpl]

'callable' @ [223:58] ==> val callable: Callable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'dispatchReceiverType' @ [223:67] ==> public abstract val dispatchReceiverType: Type? defined in org.jetbrains.kotlin.codegen.Callable[DeserializedPropertyDescriptor]

'-' @ [223:91] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'this@ExpressionCodegen' @ [223:95] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [223:119] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'expression' @ [226:13] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'extensionReceiver' @ [226:24] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'apply' @ [226:43] ==> @InlineOnly public inline fun <T> IrExpression.apply(block: IrExpression.() -> Unit): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'callGenerator' @ [228:17] ==> val callGenerator: IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'genValueAndPut' @ [228:31] ==> public open fun genValueAndPut(valueParameterDescriptor: ValueParameterDescriptor?, argumentExpression: IrExpression, parameterType: Type, parameterIndex: Int, codegen: ExpressionCodegen, blockInfo: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator[SimpleFunctionDescriptorImpl]

'this' @ [228:52] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[ReceiverParameterDescriptorImpl]

'callable' @ [228:58] ==> val callable: Callable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'extensionReceiverType' @ [228:67] ==> public abstract val extensionReceiverType: Type? defined in org.jetbrains.kotlin.codegen.Callable[DeserializedPropertyDescriptor]

'-' @ [228:92] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'this@ExpressionCodegen' @ [228:96] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [228:120] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'DefaultCallArgs' @ [231:31] ==> public constructor DefaultCallArgs(size: Int) defined in org.jetbrains.kotlin.codegen.DefaultCallArgs[DeserializedClassConstructorDescriptor]

'callable' @ [231:47] ==> val callable: Callable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'valueParameterTypes' @ [231:56] ==> public abstract val valueParameterTypes: List<Type> defined in org.jetbrains.kotlin.codegen.Callable[DeserializedPropertyDescriptor]

'size' @ [231:76] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'expression' @ [232:13] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'descriptor' @ [232:24] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'valueParameters' @ [232:35] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forEachIndexed' @ [232:51] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEachIndexed(action: (index: Int, (ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'expression' @ [233:27] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'getValueArgument' @ [233:38] ==> public abstract fun getValueArgument(index: Int): IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedSimpleFunctionDescriptor]

'i' @ [233:55] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'callable' @ [234:37] ==> val callable: Callable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'valueParameterTypes' @ [234:46] ==> public abstract val valueParameterTypes: List<Type> defined in org.jetbrains.kotlin.codegen.Callable[DeserializedPropertyDescriptor]

'i' @ [234:66] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'when {
                    arg != null -> {
                        callGenerator.genValueAndPut(parameterDescriptor, arg, parameterType, i, this@ExpressionCodegen, data)
                    }
                    parameterDescriptor.hasDefaultValue() -> {
                        callGenerator.putValueIfNeeded(parameterType, StackValue.createDefaultValue(parameterType), ValueKind.DEFAULT_PARAMETER, i, this@ExpressionCodegen)
                        defaultMask.mark(i)
                    }
                    else -> {
                        assert(parameterDescriptor.varargElementType != null)
                        //empty vararg

                        callGenerator.putValueIfNeeded(
                                parameterType,
                                StackValue.operation(parameterType) {
                                    it.aconst(0)
                                    it.newarray(correctElementType(parameterType))
                                },
                                ValueKind.GENERAL_VARARG, i, this@ExpressionCodegen)
                    }
                }' @ [235:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'arg' @ [236:21] ==> val arg: IrExpression? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[LocalVariableDescriptor]

'callGenerator' @ [237:25] ==> val callGenerator: IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'genValueAndPut' @ [237:39] ==> public open fun genValueAndPut(valueParameterDescriptor: ValueParameterDescriptor?, argumentExpression: IrExpression, parameterType: Type, parameterIndex: Int, codegen: ExpressionCodegen, blockInfo: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator[SimpleFunctionDescriptorImpl]

'parameterDescriptor' @ [237:54] ==> value-parameter parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'arg' @ [237:75] ==> val arg: IrExpression? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[LocalVariableDescriptor]

'parameterType' @ [237:80] ==> val parameterType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[LocalVariableDescriptor]

'i' @ [237:95] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'this@ExpressionCodegen' @ [237:98] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [237:122] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'parameterDescriptor' @ [239:21] ==> value-parameter parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [239:41] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'callGenerator' @ [240:25] ==> val callGenerator: IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'putValueIfNeeded' @ [240:39] ==> public open fun putValueIfNeeded(parameterType: Type, value: StackValue, kind: ValueKind, parameterIndex: Int, codegen: ExpressionCodegen): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator[SimpleFunctionDescriptorImpl]

'parameterType' @ [240:56] ==> val parameterType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[LocalVariableDescriptor]

'createDefaultValue' @ [240:82] ==> public open fun createDefaultValue(@NotNull p0: Type): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'parameterType' @ [240:101] ==> val parameterType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[LocalVariableDescriptor]

'DEFAULT_PARAMETER' @ [240:127] ==> enum entry DEFAULT_PARAMETER defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'i' @ [240:146] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'this@ExpressionCodegen' @ [240:149] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'defaultMask' @ [241:25] ==> val defaultMask: DefaultCallArgs defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'mark' @ [241:37] ==> public final fun mark(index: Int): Unit defined in org.jetbrains.kotlin.codegen.DefaultCallArgs[DeserializedSimpleFunctionDescriptor]

'i' @ [241:42] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [244:25] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'parameterDescriptor' @ [244:32] ==> value-parameter parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [244:52] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'callGenerator' @ [247:25] ==> val callGenerator: IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'putValueIfNeeded' @ [247:39] ==> public open fun putValueIfNeeded(parameterType: Type, value: StackValue, kind: ValueKind, parameterIndex: Int, codegen: ExpressionCodegen): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator[SimpleFunctionDescriptorImpl]

'parameterType' @ [248:33] ==> val parameterType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[LocalVariableDescriptor]

'operation' @ [249:44] ==> public open fun operation(p0: (Type..Type?), p1: (((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?)..(((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?))?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'parameterType' @ [249:54] ==> val parameterType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[LocalVariableDescriptor]

'it' @ [250:37] ==> value-parameter it: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'aconst' @ [250:40] ==> public open fun aconst(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'it' @ [251:37] ==> value-parameter it: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'newarray' @ [251:40] ==> public open fun newarray(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'correctElementType' @ [251:49] ==> @NotNull public open fun correctElementType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'parameterType' @ [251:68] ==> val parameterType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[LocalVariableDescriptor]

'GENERAL_VARARG' @ [253:43] ==> enum entry GENERAL_VARARG defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'i' @ [253:59] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'this@ExpressionCodegen' @ [253:62] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'callGenerator' @ [258:13] ==> val callGenerator: IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'genCall' @ [258:27] ==> public open fun genCall(callableMethod: Callable, callDefault: Boolean, codegen: ExpressionCodegen): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator[SimpleFunctionDescriptorImpl]

'callable' @ [259:21] ==> val callable: Callable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'defaultMask' @ [260:21] ==> val defaultMask: DefaultCallArgs defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'generateOnStackIfNeeded' @ [260:33] ==> public fun DefaultCallArgs.generateOnStackIfNeeded(callGenerator: IrCallGenerator, isConstructor: Boolean, codegen: ExpressionCodegen): Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen in file ExpressionCodegen.kt[SimpleFunctionDescriptorImpl]

'callGenerator' @ [260:57] ==> val callGenerator: IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'expression' @ [260:72] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'descriptor' @ [260:83] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'this' @ [260:120] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'this' @ [261:21] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'expression' @ [264:30] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[ValueParameterDescriptorImpl]

'descriptor' @ [264:41] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'returnType' @ [264:52] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'returnType' @ [265:17] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'isNothing' @ [265:54] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [265:64] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'mv' @ [266:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'aconst' @ [266:20] ==> public open fun aconst(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'mv' @ [267:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'athrow' @ [267:20] ==> public open fun athrow(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'onStack' @ [269:31] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'callable' @ [269:39] ==> val callable: Callable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateCall[LocalVariableDescriptor]

'returnType' @ [269:48] ==> public abstract val returnType: Type defined in org.jetbrains.kotlin.codegen.Callable[DeserializedPropertyDescriptor]

'AssertionError' @ [274:15] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'expression' @ [274:92] ==> value-parameter expression: IrInstanceInitializerCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitInstanceInitializerCall[ValueParameterDescriptorImpl]

'render' @ [274:103] ==> public fun IrElement.render(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'local' @ [279:20] ==> @NotNull public open fun local(p0: Int, @NotNull p1: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'OBJECT_TYPE' @ [279:29] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'put' @ [279:42] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaMethodDescriptor]

'OBJECT_TYPE' @ [279:46] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'mv' @ [279:59] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'super' @ [280:16] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'visitDelegatingConstructorCall' @ [280:22] ==> public open fun visitDelegatingConstructorCall(expression: IrDelegatingConstructorCall, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[DeserializedSimpleFunctionDescriptor]

'expression' @ [280:53] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'data' @ [280:65] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'typeMapper' @ [284:23] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapType' @ [284:34] ==> @NotNull public open fun mapType(@NotNull p0: CallableDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'declaration' @ [284:42] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[ValueParameterDescriptorImpl]

'descriptor' @ [284:54] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'frame' @ [285:21] ==> public final val frame: FrameMap defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'enter' @ [285:27] ==> public open fun enter(p0: (DeclarationDescriptor..DeclarationDescriptor?), p1: (Type..Type?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'declaration' @ [285:33] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[ValueParameterDescriptorImpl]

'descriptor' @ [285:45] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'varType' @ [285:57] ==> val varType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[LocalVariableDescriptor]

'declaration' @ [287:9] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[ValueParameterDescriptorImpl]

'initializer' @ [287:21] ==> public abstract var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'apply' @ [287:34] ==> @InlineOnly public inline fun <T> IrExpression.apply(block: IrExpression.() -> Unit): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'local' @ [288:24] ==> @NotNull public open fun local(p0: Int, @NotNull p1: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'index' @ [288:30] ==> val index: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[LocalVariableDescriptor]

'varType' @ [288:37] ==> val varType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[LocalVariableDescriptor]

'store' @ [288:46] ==> public open fun store(@NotNull p0: StackValue, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaMethodDescriptor]

'gen' @ [288:52] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'this' @ [288:56] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable.<anonymous>[ReceiverParameterDescriptorImpl]

'varType' @ [288:62] ==> val varType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[LocalVariableDescriptor]

'data' @ [288:71] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[ValueParameterDescriptorImpl]

'mv' @ [288:78] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'VariableInfo' @ [291:20] ==> public constructor VariableInfo(descriptor: VariableDescriptor, index: Int, type: Type, startLabel: Label) defined in org.jetbrains.kotlin.backend.jvm.codegen.VariableInfo[ClassConstructorDescriptorImpl]

'declaration' @ [292:17] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[ValueParameterDescriptorImpl]

'descriptor' @ [292:29] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'index' @ [293:17] ==> val index: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[LocalVariableDescriptor]

'varType' @ [294:17] ==> val varType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[LocalVariableDescriptor]

'markNewLabel' @ [295:17] ==> public final fun markNewLabel(): Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'data' @ [297:9] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[ValueParameterDescriptorImpl]

'variables' @ [297:14] ==> public final val variables: MutableList<VariableInfo> defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[PropertyDescriptorImpl]

'add' @ [297:24] ==> public abstract fun add(element: VariableInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'info' @ [297:28] ==> val info: VariableInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVariable[LocalVariableDescriptor]

'none' @ [299:16] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'gen' @ [303:9] ==> public final fun gen(expression: IrElement, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [303:13] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.gen[ValueParameterDescriptorImpl]

'data' @ [303:25] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.gen[ValueParameterDescriptorImpl]

'put' @ [303:31] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [303:35] ==> value-parameter type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.gen[ValueParameterDescriptorImpl]

'mv' @ [303:41] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'onStack' @ [304:16] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [304:24] ==> value-parameter type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.gen[ValueParameterDescriptorImpl]

'expression' @ [308:16] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.gen[ValueParameterDescriptorImpl]

'accept' @ [308:27] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<StackValue, BlockInfo>, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.ir.IrElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> StackValue
    <D> -> BlockInfo

'this' @ [308:34] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [308:40] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.gen[ValueParameterDescriptorImpl]

'generateLocal' @ [312:16] ==> private final fun generateLocal(descriptor: CallableDescriptor, type: Type): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [312:30] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitGetValue[ValueParameterDescriptorImpl]

'descriptor' @ [312:41] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [312:53] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitGetValue[ValueParameterDescriptorImpl]

'asmType' @ [312:64] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'expression' @ [316:29] ==> value-parameter expression: IrFieldAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[ValueParameterDescriptorImpl]

'receiver' @ [316:40] ==> public abstract var receiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrFieldAccessExpression[DeserializedPropertyDescriptor]

'accept' @ [316:50] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<StackValue, BlockInfo>, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> StackValue
    <D> -> BlockInfo

'this' @ [316:57] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [316:63] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[ValueParameterDescriptorImpl]

'none' @ [316:83] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'expression' @ [317:34] ==> value-parameter expression: IrFieldAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[ValueParameterDescriptorImpl]

'descriptor' @ [317:45] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrFieldAccessExpression[DeserializedPropertyDescriptor]

'typeMapper' @ [318:25] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapType' @ [318:36] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'propertyDescriptor' @ [318:44] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[LocalVariableDescriptor]

'type' @ [318:63] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'typeMapper' @ [319:25] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapImplementationOwner' @ [319:36] ==> public open fun mapImplementationOwner(@NotNull p0: DeclarationDescriptor): (Type..Type?) defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'propertyDescriptor' @ [319:59] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[LocalVariableDescriptor]

'propertyDescriptor' @ [320:25] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[LocalVariableDescriptor]

'name' @ [320:44] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [320:49] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'expression' @ [321:24] ==> value-parameter expression: IrFieldAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[ValueParameterDescriptorImpl]

'receiver' @ [321:35] ==> public abstract var receiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrFieldAccessExpression[DeserializedPropertyDescriptor]

'field' @ [322:27] ==> @NotNull public open fun field(@NotNull p0: Type, @NotNull p1: Type, @NotNull p2: String, p3: Boolean, @NotNull p4: StackValue, @Nullable p5: DeclarationDescriptor?): StackValue.Field defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'fieldType' @ [322:33] ==> val fieldType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[LocalVariableDescriptor]

'ownerType' @ [322:44] ==> val ownerType: (Type..Type?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[LocalVariableDescriptor]

'fieldName' @ [322:55] ==> val fieldName: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[LocalVariableDescriptor]

'isStatic' @ [322:66] ==> val isStatic: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[LocalVariableDescriptor]

'receiverValue' @ [322:76] ==> val receiverValue: (StackValue..StackValue?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[LocalVariableDescriptor]

'propertyDescriptor' @ [322:91] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFieldValue[LocalVariableDescriptor]

'generateFieldValue' @ [326:21] ==> private final fun generateFieldValue(expression: IrFieldAccessExpression, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [326:40] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitGetField[ValueParameterDescriptorImpl]

'data' @ [326:52] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitGetField[ValueParameterDescriptorImpl]

'value' @ [327:9] ==> val value: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitGetField[LocalVariableDescriptor]

'put' @ [327:15] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'value' @ [327:19] ==> val value: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitGetField[LocalVariableDescriptor]

'type' @ [327:25] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'mv' @ [327:31] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'onStack' @ [328:16] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'value' @ [328:24] ==> val value: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitGetField[LocalVariableDescriptor]

'type' @ [328:30] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'generateFieldValue' @ [332:26] ==> private final fun generateFieldValue(expression: IrFieldAccessExpression, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [332:45] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetField[ValueParameterDescriptorImpl]

'data' @ [332:57] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetField[ValueParameterDescriptorImpl]

'fieldValue' @ [333:9] ==> val fieldValue: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetField[LocalVariableDescriptor]

'store' @ [333:20] ==> public open fun store(@NotNull p0: StackValue, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'expression' @ [333:26] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetField[ValueParameterDescriptorImpl]

'value' @ [333:37] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSetField[DeserializedPropertyDescriptor]

'accept' @ [333:43] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<StackValue, BlockInfo>, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> StackValue
    <D> -> BlockInfo

'this' @ [333:50] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [333:56] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetField[ValueParameterDescriptorImpl]

'mv' @ [333:63] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'none' @ [334:16] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'findLocalIndex' @ [338:21] ==> private final fun findLocalIndex(descriptor: CallableDescriptor): Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'descriptor' @ [338:36] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateLocal[ValueParameterDescriptorImpl]

'local' @ [339:20] ==> @NotNull public open fun local(p0: Int, @NotNull p1: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'index' @ [339:26] ==> val index: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateLocal[LocalVariableDescriptor]

'type' @ [339:33] ==> value-parameter type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateLocal[ValueParameterDescriptorImpl]

'put' @ [339:39] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaMethodDescriptor]

'type' @ [339:43] ==> value-parameter type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateLocal[ValueParameterDescriptorImpl]

'mv' @ [339:49] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'onStack' @ [340:16] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [340:24] ==> value-parameter type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateLocal[ValueParameterDescriptorImpl]

'frame' @ [344:16] ==> public final val frame: FrameMap defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'getIndex' @ [344:22] ==> public open fun getIndex(p0: (DeclarationDescriptor..DeclarationDescriptor?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'descriptor' @ [344:31] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.findLocalIndex[ValueParameterDescriptorImpl]

'apply' @ [344:43] ==> @InlineOnly public inline fun <T> Int.apply(block: Int.() -> Unit): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'this' @ [345:17] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.findLocalIndex.<anonymous>[ReceiverParameterDescriptorImpl]

'AssertionError' @ [345:33] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [345:88] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.findLocalIndex[ValueParameterDescriptorImpl]

'AssertionError' @ [350:15] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'expression' @ [350:92] ==> value-parameter expression: IrGetObjectValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitGetObjectValue[ValueParameterDescriptorImpl]

'render' @ [350:103] ==> public fun IrElement.render(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [354:15] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'expression' @ [354:92] ==> value-parameter expression: IrGetEnumValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitGetEnumValue[ValueParameterDescriptorImpl]

'render' @ [354:103] ==> public fun IrElement.render(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'expression' @ [358:21] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetVariable[ValueParameterDescriptorImpl]

'value' @ [358:32] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[DeserializedPropertyDescriptor]

'accept' @ [358:38] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<StackValue, BlockInfo>, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> StackValue
    <D> -> BlockInfo

'this' @ [358:45] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [358:51] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetVariable[ValueParameterDescriptorImpl]

'local' @ [359:20] ==> @NotNull public open fun local(p0: Int, @NotNull p1: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'findLocalIndex' @ [359:26] ==> private final fun findLocalIndex(descriptor: CallableDescriptor): Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [359:41] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetVariable[ValueParameterDescriptorImpl]

'descriptor' @ [359:52] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[DeserializedPropertyDescriptor]

'expression' @ [359:65] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetVariable[ValueParameterDescriptorImpl]

'descriptor' @ [359:76] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[DeserializedPropertyDescriptor]

'asmType' @ [359:87] ==> private final val CallableDescriptor.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'store' @ [359:96] ==> public open fun store(@NotNull p0: StackValue, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaMethodDescriptor]

'value' @ [359:102] ==> val value: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetVariable[LocalVariableDescriptor]

'mv' @ [359:109] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'none' @ [360:16] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'expression' @ [364:21] ==> value-parameter expression: IrConst<T> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitConst[ValueParameterDescriptorImpl]

'value' @ [364:32] ==> public abstract val value: T defined in org.jetbrains.kotlin.ir.expressions.IrConst[DeserializedPropertyDescriptor]

'expression' @ [365:20] ==> value-parameter expression: IrConst<T> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitConst[ValueParameterDescriptorImpl]

'asmType' @ [365:31] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'constant' @ [366:20] ==> @NotNull public open fun constant(@Nullable p0: Any?, @NotNull p1: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'value' @ [366:29] ==> val value: T defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitConst[LocalVariableDescriptor]

'type' @ [366:36] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitConst[LocalVariableDescriptor]

'put' @ [366:42] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [366:46] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitConst[LocalVariableDescriptor]

'mv' @ [366:52] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'expression' @ [367:16] ==> value-parameter expression: IrConst<T> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitConst[ValueParameterDescriptorImpl]

'onStack' @ [367:27] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'TODO' @ [371:9] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'element' @ [371:36] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitElement[ValueParameterDescriptorImpl]

'classCodegen' @ [375:9] ==> public final val classCodegen: ClassCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'generateDeclaration' @ [375:22] ==> public final fun generateDeclaration(declaration: IrDeclaration): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[SimpleFunctionDescriptorImpl]

'declaration' @ [375:42] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitClass[ValueParameterDescriptorImpl]

'none' @ [376:16] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'none' @ [380:16] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'expression' @ [384:23] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[ValueParameterDescriptorImpl]

'type' @ [384:34] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'expression' @ [385:20] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[ValueParameterDescriptorImpl]

'asmType' @ [385:31] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'assert' @ [386:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'type' @ [386:16] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'sort' @ [386:21] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'ARRAY' @ [386:34] ==> public const final val ARRAY: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'correctElementType' @ [387:27] ==> @NotNull public open fun correctElementType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'type' @ [387:46] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'expression' @ [388:25] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[ValueParameterDescriptorImpl]

'elements' @ [388:36] ==> public abstract val elements: List<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'arguments' @ [389:20] ==> val arguments: List<IrVarargElement> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'size' @ [389:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'arguments' @ [391:25] ==> val arguments: List<IrVarargElement> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'firstIsInstanceOrNull' @ [391:35] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): IrSpreadElement? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> IrSpreadElement

'if (hasSpread) {
            val arrayOfReferences = KotlinBuiltIns.isArray(outType)
            if (size == 1) {
                // Arrays.copyOf(receiverValue, newLength)
                val argument = (arguments[0] as IrSpreadElement).expression
                val arrayType = if (arrayOfReferences)
                    Type.getType("[Ljava/lang/Object;")
                else
                    Type.getType("[" + elementType.descriptor)
                gen(argument, type, data)
                mv.dup()
                mv.arraylength()
                mv.invokestatic("java/util/Arrays", "copyOf", Type.getMethodDescriptor(arrayType, arrayType, Type.INT_TYPE), false)
                if (arrayOfReferences) {
                    mv.checkcast(type)
                }
            }
            else {
                val owner: String
                val addDescriptor: String
                val toArrayDescriptor: String
                if (arrayOfReferences) {
                    owner = "kotlin/jvm/internal/SpreadBuilder"
                    addDescriptor = "(Ljava/lang/Object;)V"
                    toArrayDescriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;"
                }
                else {
                    val spreadBuilderClassName = AsmUtil.asmPrimitiveTypeToLangPrimitiveType(elementType)!!.typeName.identifier + "SpreadBuilder"
                    owner = "kotlin/jvm/internal/" + spreadBuilderClassName
                    addDescriptor = "(" + elementType.descriptor + ")V"
                    toArrayDescriptor = "()" + type.descriptor
                }
                mv.anew(Type.getObjectType(owner))
                mv.dup()
                mv.iconst(size)
                mv.invokespecial(owner, "<init>", "(I)V", false)
                for (i in 0..size - 1) {
                    mv.dup()
                    val argument = arguments[i]
                    if (argument is IrSpreadElement) {
                        gen(argument.expression, OBJECT_TYPE, data)
                        mv.invokevirtual(owner, "addSpread", "(Ljava/lang/Object;)V", false)
                    }
                    else {
                        gen(argument, elementType, data)
                        mv.invokevirtual(owner, "add", addDescriptor, false)
                    }
                }
                if (arrayOfReferences) {
                    mv.dup()
                    mv.invokevirtual(owner, "size", "()I", false)
                    newArrayInstruction(outType)
                    mv.invokevirtual(owner, "toArray", toArrayDescriptor, false)
                    mv.checkcast(type)
                }
                else {
                    mv.invokevirtual(owner, "toArray", toArrayDescriptor, false)
                }
            }
        }
        else {
            mv.iconst(size)
            newArrayInstruction(expression.type)
            for ((i, element)  in expression.elements.withIndex()) {
                mv.dup()
                StackValue.constant(i, Type.INT_TYPE).put(Type.INT_TYPE, mv)
                val rightSide = gen(element, elementType, data)
                StackValue.arrayElement(elementType, StackValue.onStack(elementType), StackValue.onStack(Type.INT_TYPE)).store(rightSide, mv)
            }
        }' @ [393:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'hasSpread' @ [393:13] ==> val hasSpread: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'isArray' @ [394:52] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'outType' @ [394:60] ==> val outType: KotlinType defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'if (size == 1) {
                // Arrays.copyOf(receiverValue, newLength)
                val argument = (arguments[0] as IrSpreadElement).expression
                val arrayType = if (arrayOfReferences)
                    Type.getType("[Ljava/lang/Object;")
                else
                    Type.getType("[" + elementType.descriptor)
                gen(argument, type, data)
                mv.dup()
                mv.arraylength()
                mv.invokestatic("java/util/Arrays", "copyOf", Type.getMethodDescriptor(arrayType, arrayType, Type.INT_TYPE), false)
                if (arrayOfReferences) {
                    mv.checkcast(type)
                }
            }
            else {
                val owner: String
                val addDescriptor: String
                val toArrayDescriptor: String
                if (arrayOfReferences) {
                    owner = "kotlin/jvm/internal/SpreadBuilder"
                    addDescriptor = "(Ljava/lang/Object;)V"
                    toArrayDescriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;"
                }
                else {
                    val spreadBuilderClassName = AsmUtil.asmPrimitiveTypeToLangPrimitiveType(elementType)!!.typeName.identifier + "SpreadBuilder"
                    owner = "kotlin/jvm/internal/" + spreadBuilderClassName
                    addDescriptor = "(" + elementType.descriptor + ")V"
                    toArrayDescriptor = "()" + type.descriptor
                }
                mv.anew(Type.getObjectType(owner))
                mv.dup()
                mv.iconst(size)
                mv.invokespecial(owner, "<init>", "(I)V", false)
                for (i in 0..size - 1) {
                    mv.dup()
                    val argument = arguments[i]
                    if (argument is IrSpreadElement) {
                        gen(argument.expression, OBJECT_TYPE, data)
                        mv.invokevirtual(owner, "addSpread", "(Ljava/lang/Object;)V", false)
                    }
                    else {
                        gen(argument, elementType, data)
                        mv.invokevirtual(owner, "add", addDescriptor, false)
                    }
                }
                if (arrayOfReferences) {
                    mv.dup()
                    mv.invokevirtual(owner, "size", "()I", false)
                    newArrayInstruction(outType)
                    mv.invokevirtual(owner, "toArray", toArrayDescriptor, false)
                    mv.checkcast(type)
                }
                else {
                    mv.invokevirtual(owner, "toArray", toArrayDescriptor, false)
                }
            }' @ [395:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'size' @ [395:17] ==> val size: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'arguments' @ [397:33] ==> val arguments: List<IrVarargElement> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'expression' @ [397:66] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSpreadElement[DeserializedPropertyDescriptor]

'if (arrayOfReferences)
                    Type.getType("[Ljava/lang/Object;")
                else
                    Type.getType("[" + elementType.descriptor)' @ [398:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Type..Type?), elseBranch: (Type..Type?)): (Type..Type?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'arrayOfReferences' @ [398:37] ==> val arrayOfReferences: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'getType' @ [399:26] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'getType' @ [401:26] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'+' @ [401:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'elementType' @ [401:40] ==> val elementType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'descriptor' @ [401:52] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'gen' @ [402:17] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'argument' @ [402:21] ==> val argument: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'type' @ [402:31] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'data' @ [402:37] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[ValueParameterDescriptorImpl]

'mv' @ [403:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'dup' @ [403:20] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'mv' @ [404:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'arraylength' @ [404:20] ==> public open fun arraylength(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'mv' @ [405:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'invokestatic' @ [405:20] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'getMethodDescriptor' @ [405:68] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'arrayType' @ [405:88] ==> val arrayType: (Type..Type?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'arrayType' @ [405:99] ==> val arrayType: (Type..Type?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'INT_TYPE' @ [405:115] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'arrayOfReferences' @ [406:21] ==> val arrayOfReferences: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'mv' @ [407:21] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'checkcast' @ [407:24] ==> public open fun checkcast(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'type' @ [407:34] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'if (arrayOfReferences) {
                    owner = "kotlin/jvm/internal/SpreadBuilder"
                    addDescriptor = "(Ljava/lang/Object;)V"
                    toArrayDescriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;"
                }
                else {
                    val spreadBuilderClassName = AsmUtil.asmPrimitiveTypeToLangPrimitiveType(elementType)!!.typeName.identifier + "SpreadBuilder"
                    owner = "kotlin/jvm/internal/" + spreadBuilderClassName
                    addDescriptor = "(" + elementType.descriptor + ")V"
                    toArrayDescriptor = "()" + type.descriptor
                }' @ [414:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'arrayOfReferences' @ [414:21] ==> val arrayOfReferences: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'owner' @ [415:21] ==> val owner: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'addDescriptor' @ [416:21] ==> val addDescriptor: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'toArrayDescriptor' @ [417:21] ==> val toArrayDescriptor: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'!!' @ [420:50] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PrimitiveType?): PrimitiveType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PrimitiveType

'asmPrimitiveTypeToLangPrimitiveType' @ [420:58] ==> @Nullable public open fun asmPrimitiveTypeToLangPrimitiveType(p0: (Type..Type?)): PrimitiveType? defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'elementType' @ [420:94] ==> val elementType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'typeName' @ [420:109] ==> public final val PrimitiveType.typeName: Name[MyPropertyDescriptor]

'identifier' @ [420:118] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'owner' @ [421:21] ==> val owner: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'+' @ [421:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'spreadBuilderClassName' @ [421:54] ==> val spreadBuilderClassName: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'addDescriptor' @ [422:21] ==> val addDescriptor: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'+' @ [422:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'elementType' @ [422:43] ==> val elementType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'descriptor' @ [422:55] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'toArrayDescriptor' @ [423:21] ==> val toArrayDescriptor: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'+' @ [423:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'type' @ [423:48] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'descriptor' @ [423:53] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'mv' @ [425:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'anew' @ [425:20] ==> public open fun anew(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'getObjectType' @ [425:30] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'owner' @ [425:44] ==> val owner: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'mv' @ [426:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'dup' @ [426:20] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'mv' @ [427:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'iconst' @ [427:20] ==> public open fun iconst(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'size' @ [427:27] ==> val size: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'mv' @ [428:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'invokespecial' @ [428:20] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'owner' @ [428:34] ==> val owner: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'..' @ [429:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'size' @ [429:30] ==> val size: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'mv' @ [430:21] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'dup' @ [430:24] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'arguments' @ [431:36] ==> val arguments: List<IrVarargElement> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'i' @ [431:46] ==> val i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'if (argument is IrSpreadElement) {
                        gen(argument.expression, OBJECT_TYPE, data)
                        mv.invokevirtual(owner, "addSpread", "(Ljava/lang/Object;)V", false)
                    }
                    else {
                        gen(argument, elementType, data)
                        mv.invokevirtual(owner, "add", addDescriptor, false)
                    }' @ [432:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'argument' @ [432:25] ==> val argument: IrVarargElement defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'gen' @ [433:25] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'argument' @ [433:29] ==> val argument: IrVarargElement defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'expression' @ [433:38] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSpreadElement[DeserializedPropertyDescriptor]

'OBJECT_TYPE' @ [433:50] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'data' @ [433:63] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[ValueParameterDescriptorImpl]

'mv' @ [434:25] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'invokevirtual' @ [434:28] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'owner' @ [434:42] ==> val owner: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'gen' @ [437:25] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'argument' @ [437:29] ==> val argument: IrVarargElement defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'elementType' @ [437:39] ==> val elementType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'data' @ [437:52] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[ValueParameterDescriptorImpl]

'mv' @ [438:25] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'invokevirtual' @ [438:28] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'owner' @ [438:42] ==> val owner: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'addDescriptor' @ [438:56] ==> val addDescriptor: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'if (arrayOfReferences) {
                    mv.dup()
                    mv.invokevirtual(owner, "size", "()I", false)
                    newArrayInstruction(outType)
                    mv.invokevirtual(owner, "toArray", toArrayDescriptor, false)
                    mv.checkcast(type)
                }
                else {
                    mv.invokevirtual(owner, "toArray", toArrayDescriptor, false)
                }' @ [441:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'arrayOfReferences' @ [441:21] ==> val arrayOfReferences: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'mv' @ [442:21] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'dup' @ [442:24] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'mv' @ [443:21] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'invokevirtual' @ [443:24] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'owner' @ [443:38] ==> val owner: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'newArrayInstruction' @ [444:21] ==> public final fun newArrayInstruction(arrayType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'outType' @ [444:41] ==> val outType: KotlinType defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'mv' @ [445:21] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'invokevirtual' @ [445:24] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'owner' @ [445:38] ==> val owner: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'toArrayDescriptor' @ [445:56] ==> val toArrayDescriptor: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'mv' @ [446:21] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'checkcast' @ [446:24] ==> public open fun checkcast(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'type' @ [446:34] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'mv' @ [449:21] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'invokevirtual' @ [449:24] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'owner' @ [449:38] ==> val owner: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'toArrayDescriptor' @ [449:56] ==> val toArrayDescriptor: String defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'mv' @ [454:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'iconst' @ [454:16] ==> public open fun iconst(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'size' @ [454:23] ==> val size: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'newArrayInstruction' @ [455:13] ==> public final fun newArrayInstruction(arrayType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [455:33] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[ValueParameterDescriptorImpl]

'type' @ [455:44] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'component1' @ [456:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [456:22] ==> public final operator fun component2(): IrVarargElement defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'expression' @ [456:35] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[ValueParameterDescriptorImpl]

'elements' @ [456:46] ==> public abstract val elements: List<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'withIndex' @ [456:55] ==> public fun <T> Iterable<IrVarargElement>.withIndex(): Iterable<IndexedValue<IrVarargElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVarargElement

'mv' @ [457:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'dup' @ [457:20] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'constant' @ [458:28] ==> @NotNull public open fun constant(@Nullable p0: Any?, @NotNull p1: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'i' @ [458:37] ==> val i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'INT_TYPE' @ [458:45] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'put' @ [458:55] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'INT_TYPE' @ [458:64] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'mv' @ [458:74] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'gen' @ [459:33] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'element' @ [459:37] ==> val element: IrVarargElement defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'elementType' @ [459:46] ==> val elementType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'data' @ [459:59] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[ValueParameterDescriptorImpl]

'arrayElement' @ [460:28] ==> @NotNull public open fun arrayElement(@NotNull p0: Type, p1: (StackValue..StackValue?), p2: (StackValue..StackValue?)): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'elementType' @ [460:41] ==> val elementType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'onStack' @ [460:65] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'elementType' @ [460:73] ==> val elementType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'onStack' @ [460:98] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'INT_TYPE' @ [460:111] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'store' @ [460:122] ==> public open fun store(@NotNull p0: StackValue, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'rightSide' @ [460:128] ==> val rightSide: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[LocalVariableDescriptor]

'mv' @ [460:139] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'expression' @ [463:16] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitVararg[ValueParameterDescriptorImpl]

'onStack' @ [463:27] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'if (KotlinBuiltIns.isArray(arrayType)) {
            val elementJetType = arrayType.arguments[0].type
//            putReifiedOperationMarkerIfTypeIsReifiedParameter(
//                    elementJetType,
//                    ReifiedTypeInliner.OperationKind.NEW_ARRAY
//            )
            mv.newarray(boxType(elementJetType.asmType))
        }
        else {
            val type = typeMapper.mapType(arrayType)
            mv.newarray(correctElementType(type))
        }' @ [467:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isArray' @ [467:28] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'arrayType' @ [467:36] ==> value-parameter arrayType: KotlinType defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.newArrayInstruction[ValueParameterDescriptorImpl]

'arrayType' @ [468:34] ==> value-parameter arrayType: KotlinType defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.newArrayInstruction[ValueParameterDescriptorImpl]

'arguments' @ [468:44] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'type' @ [468:57] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'mv' @ [473:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'newarray' @ [473:16] ==> public open fun newarray(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'boxType' @ [473:25] ==> @NotNull public open fun boxType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'elementJetType' @ [473:33] ==> val elementJetType: KotlinType defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.newArrayInstruction[LocalVariableDescriptor]

'asmType' @ [473:48] ==> private final val KotlinType.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'typeMapper' @ [476:24] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapType' @ [476:35] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'arrayType' @ [476:43] ==> value-parameter arrayType: KotlinType defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.newArrayInstruction[ValueParameterDescriptorImpl]

'mv' @ [477:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'newarray' @ [477:16] ==> public open fun newarray(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'correctElementType' @ [477:25] ==> @NotNull public open fun correctElementType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'type' @ [477:44] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.newArrayInstruction[LocalVariableDescriptor]

'Label' @ [483:16] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'apply' @ [483:24] ==> @InlineOnly public inline fun <T> Label.apply(block: Label.() -> Unit): Label defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label

'mv' @ [483:32] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'visitLabel' @ [483:35] ==> public open fun visitLabel(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'this' @ [483:46] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.markNewLabel.<anonymous>[ReceiverParameterDescriptorImpl]

'expression' @ [487:21] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitReturn[ValueParameterDescriptorImpl]

'value' @ [487:32] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'apply' @ [487:38] ==> @InlineOnly public inline fun <T> IrExpression.apply(block: IrExpression.() -> Unit): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'gen' @ [488:13] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'this' @ [488:17] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitReturn.<anonymous>[ReceiverParameterDescriptorImpl]

'returnType' @ [488:23] ==> public final val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'data' @ [488:35] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitReturn[ValueParameterDescriptorImpl]

'Label' @ [491:32] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'generateFinallyBlocksIfNeeded' @ [492:9] ==> public final fun generateFinallyBlocksIfNeeded(returnType: Type, afterReturnLabel: Label, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'returnType' @ [492:39] ==> public final val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'afterReturnLabel' @ [492:51] ==> val afterReturnLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitReturn[LocalVariableDescriptor]

'data' @ [492:69] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitReturn[ValueParameterDescriptorImpl]

'mv' @ [494:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'areturn' @ [494:12] ==> public open fun areturn(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'returnType' @ [494:20] ==> public final val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mv' @ [495:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mark' @ [495:12] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'afterReturnLabel' @ [495:17] ==> val afterReturnLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitReturn[LocalVariableDescriptor]

'mv' @ [496:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'nop' @ [496:12] ==> public open fun nop(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'expression' @ [497:16] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitReturn[ValueParameterDescriptorImpl]

'onStack' @ [497:27] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'expression' @ [502:26] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhen[ValueParameterDescriptorImpl]

'asmType' @ [502:37] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'genIfWithBranches' @ [503:9] ==> public final fun genIfWithBranches(branch: IrBranch, data: BlockInfo, type: Type, otherBranches: List<IrBranch>): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [503:27] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhen[ValueParameterDescriptorImpl]

'branches' @ [503:38] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.IrWhen[DeserializedPropertyDescriptor]

'data' @ [503:51] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhen[ValueParameterDescriptorImpl]

'resultType' @ [503:57] ==> val resultType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhen[LocalVariableDescriptor]

'expression' @ [503:69] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhen[ValueParameterDescriptorImpl]

'branches' @ [503:80] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.IrWhen[DeserializedPropertyDescriptor]

'drop' @ [503:89] ==> public fun <T> Iterable<IrBranch>.drop(n: Int): List<IrBranch> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBranch

'expression' @ [504:16] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhen[ValueParameterDescriptorImpl]

'onStack' @ [504:27] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'Label' @ [509:25] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'branch' @ [510:25] ==> value-parameter branch: IrBranch defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[ValueParameterDescriptorImpl]

'condition' @ [510:32] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'branch' @ [511:26] ==> value-parameter branch: IrBranch defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[ValueParameterDescriptorImpl]

'result' @ [511:33] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'branch' @ [513:26] ==> value-parameter branch: IrBranch defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[ValueParameterDescriptorImpl]

'!' @ [514:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'elseBranch' @ [514:14] ==> val elseBranch: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[LocalVariableDescriptor]

'gen' @ [515:13] ==> public final fun gen(expression: IrElement, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'condition' @ [515:17] ==> val condition: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[LocalVariableDescriptor]

'data' @ [515:28] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[ValueParameterDescriptorImpl]

'BranchedValue' @ [516:13] ==> public companion object defined in org.jetbrains.kotlin.codegen.BranchedValue[FakeCallableDescriptorForObject]

'condJump' @ [516:27] ==> public final fun condJump(condition: StackValue, label: Label, jumpIfFalse: Boolean, iv: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.BranchedValue.Companion[DeserializedSimpleFunctionDescriptor]

'onStack' @ [516:47] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'condition' @ [516:55] ==> val condition: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[LocalVariableDescriptor]

'asmType' @ [516:65] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'elseLabel' @ [516:75] ==> val elseLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[LocalVariableDescriptor]

'mv' @ [516:92] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'Label' @ [519:19] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'thenBranch' @ [521:9] ==> val thenBranch: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[LocalVariableDescriptor]

'apply' @ [521:20] ==> @InlineOnly public inline fun <T> IrExpression.apply(block: IrExpression.() -> Unit): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'gen' @ [522:13] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'this' @ [522:17] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches.<anonymous>[ReceiverParameterDescriptorImpl]

'type' @ [522:23] ==> value-parameter type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[ValueParameterDescriptorImpl]

'data' @ [522:29] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[ValueParameterDescriptorImpl]

'mv' @ [526:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'goTo' @ [526:12] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'end' @ [526:17] ==> val end: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[LocalVariableDescriptor]

'mv' @ [527:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mark' @ [527:12] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'elseLabel' @ [527:17] ==> val elseLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[LocalVariableDescriptor]

'!' @ [529:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'otherBranches' @ [529:14] ==> value-parameter otherBranches: List<IrBranch> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[ValueParameterDescriptorImpl]

'isEmpty' @ [529:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'otherBranches' @ [530:30] ==> value-parameter otherBranches: List<IrBranch> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[ValueParameterDescriptorImpl]

'first' @ [530:44] ==> public fun <T> List<IrBranch>.first(): IrBranch defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBranch

'genIfWithBranches' @ [531:13] ==> public final fun genIfWithBranches(branch: IrBranch, data: BlockInfo, type: Type, otherBranches: List<IrBranch>): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'nextBranch' @ [531:31] ==> val nextBranch: IrBranch defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[LocalVariableDescriptor]

'data' @ [531:43] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[ValueParameterDescriptorImpl]

'type' @ [531:49] ==> value-parameter type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[ValueParameterDescriptorImpl]

'otherBranches' @ [531:55] ==> value-parameter otherBranches: List<IrBranch> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[ValueParameterDescriptorImpl]

'drop' @ [531:69] ==> public fun <T> Iterable<IrBranch>.drop(n: Int): List<IrBranch> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBranch

'mv' @ [534:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mark' @ [534:12] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'end' @ [534:17] ==> val end: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genIfWithBranches[LocalVariableDescriptor]

'expression' @ [539:23] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'typeOperand' @ [539:34] ==> public abstract val typeOperand: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'asmType' @ [539:46] ==> private final val KotlinType.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'when (expression.operator) {
            IrTypeOperator.IMPLICIT_COERCION_TO_UNIT -> {
                expression.argument.accept(this, data)
                coerce(expression.argument.asmType, Type.VOID_TYPE, mv)
                return none()
            }

            IrTypeOperator.IMPLICIT_CAST -> {
                gen(expression.argument, asmType, data)
            }

            IrTypeOperator.CAST, IrTypeOperator.SAFE_CAST -> {
                val value = expression.argument.accept(this, data)
                value.put(boxType(value.type), mv)
                if (value.type === Type.VOID_TYPE) {
                    StackValue.putUnitInstance(mv)
                }
                val boxedType = boxType(asmType)
                generateAsCast(mv, expression.typeOperand, boxedType, expression.operator == IrTypeOperator.SAFE_CAST)
                return onStack(boxedType)
            }

            IrTypeOperator.INSTANCEOF, IrTypeOperator.NOT_INSTANCEOF -> {
                gen(expression.argument, OBJECT_TYPE, data)
                val type = boxType(asmType)
                generateIsCheck(mv, expression.typeOperand, type)
                if (IrTypeOperator.NOT_INSTANCEOF == expression.operator) {
                    StackValue.not(StackValue.onStack(Type.BOOLEAN_TYPE)).put(Type.BOOLEAN_TYPE, mv)
                }
            }

            IrTypeOperator.IMPLICIT_NOTNULL -> {
                gen(expression.argument, OBJECT_TYPE, data)
                mv.dup()
                mv.visitLdcInsn("TODO provide message") /*TODO*/
                mv.invokestatic("kotlin/jvm/internal/Intrinsics", "checkExpressionValueIsNotNull",
                               "(Ljava/lang/Object;Ljava/lang/String;)V", false)
            }

            IrTypeOperator.IMPLICIT_INTEGER_COERCION -> {
                gen(expression.argument, Type.INT_TYPE, data)
                StackValue.coerce(Type.INT_TYPE, typeMapper.mapType(expression.type), mv)
            }
        }' @ [540:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any, entry4: Any, entry5: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'expression' @ [540:15] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'operator' @ [540:26] ==> public abstract val operator: IrTypeOperator defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'IMPLICIT_COERCION_TO_UNIT' @ [541:28] ==> enum entry IMPLICIT_COERCION_TO_UNIT defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'expression' @ [542:17] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'argument' @ [542:28] ==> public abstract var argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'accept' @ [542:37] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<StackValue, BlockInfo>, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> StackValue
    <D> -> BlockInfo

'this' @ [542:44] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [542:50] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'coerce' @ [543:17] ==> public open fun coerce(@NotNull p0: Type, @NotNull p1: Type, @NotNull p2: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'expression' @ [543:24] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'argument' @ [543:35] ==> public abstract var argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'asmType' @ [543:44] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'VOID_TYPE' @ [543:58] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'mv' @ [543:69] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'none' @ [544:24] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'IMPLICIT_CAST' @ [547:28] ==> enum entry IMPLICIT_CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'gen' @ [548:17] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [548:21] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'argument' @ [548:32] ==> public abstract var argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'asmType' @ [548:42] ==> val asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[LocalVariableDescriptor]

'data' @ [548:51] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'CAST' @ [551:28] ==> enum entry CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'SAFE_CAST' @ [551:49] ==> enum entry SAFE_CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'expression' @ [552:29] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'argument' @ [552:40] ==> public abstract var argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'accept' @ [552:49] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<StackValue, BlockInfo>, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> StackValue
    <D> -> BlockInfo

'this' @ [552:56] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'data' @ [552:62] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'value' @ [553:17] ==> val value: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[LocalVariableDescriptor]

'put' @ [553:23] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'boxType' @ [553:27] ==> @NotNull public open fun boxType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'value' @ [553:35] ==> val value: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[LocalVariableDescriptor]

'type' @ [553:41] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'mv' @ [553:48] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'value' @ [554:21] ==> val value: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[LocalVariableDescriptor]

'type' @ [554:27] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'VOID_TYPE' @ [554:41] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'putUnitInstance' @ [555:32] ==> public open fun putUnitInstance(@NotNull p0: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'mv' @ [555:48] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'boxType' @ [557:33] ==> @NotNull public open fun boxType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'asmType' @ [557:41] ==> val asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[LocalVariableDescriptor]

'generateAsCast' @ [558:17] ==> public fun generateAsCast(v: InstructionAdapter, kotlinType: KotlinType, asmType: Type, isSafe: Boolean): Unit defined in org.jetbrains.kotlin.codegen[DeserializedSimpleFunctionDescriptor]

'mv' @ [558:32] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'expression' @ [558:36] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'typeOperand' @ [558:47] ==> public abstract val typeOperand: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'boxedType' @ [558:60] ==> val boxedType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[LocalVariableDescriptor]

'expression' @ [558:71] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'operator' @ [558:82] ==> public abstract val operator: IrTypeOperator defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'SAFE_CAST' @ [558:109] ==> enum entry SAFE_CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'onStack' @ [559:24] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'boxedType' @ [559:32] ==> val boxedType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[LocalVariableDescriptor]

'INSTANCEOF' @ [562:28] ==> enum entry INSTANCEOF defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'NOT_INSTANCEOF' @ [562:55] ==> enum entry NOT_INSTANCEOF defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'gen' @ [563:17] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [563:21] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'argument' @ [563:32] ==> public abstract var argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'OBJECT_TYPE' @ [563:42] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'data' @ [563:55] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'boxType' @ [564:28] ==> @NotNull public open fun boxType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'asmType' @ [564:36] ==> val asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[LocalVariableDescriptor]

'generateIsCheck' @ [565:17] ==> public fun generateIsCheck(v: InstructionAdapter, kotlinType: KotlinType, asmType: Type): Unit defined in org.jetbrains.kotlin.codegen[DeserializedSimpleFunctionDescriptor]

'mv' @ [565:33] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'expression' @ [565:37] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'typeOperand' @ [565:48] ==> public abstract val typeOperand: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'type' @ [565:61] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[LocalVariableDescriptor]

'==' @ [566:21] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[DeserializedSimpleFunctionDescriptor]

'NOT_INSTANCEOF' @ [566:36] ==> enum entry NOT_INSTANCEOF defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'expression' @ [566:54] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'operator' @ [566:65] ==> public abstract val operator: IrTypeOperator defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'not' @ [567:32] ==> @NotNull public open fun not(@NotNull p0: StackValue): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'onStack' @ [567:47] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'BOOLEAN_TYPE' @ [567:60] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'put' @ [567:75] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'BOOLEAN_TYPE' @ [567:84] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'mv' @ [567:98] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'IMPLICIT_NOTNULL' @ [571:28] ==> enum entry IMPLICIT_NOTNULL defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'gen' @ [572:17] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [572:21] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'argument' @ [572:32] ==> public abstract var argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'OBJECT_TYPE' @ [572:42] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'data' @ [572:55] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'mv' @ [573:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'dup' @ [573:20] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'mv' @ [574:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'visitLdcInsn' @ [574:20] ==> public open fun visitLdcInsn(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'mv' @ [575:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'invokestatic' @ [575:20] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'IMPLICIT_INTEGER_COERCION' @ [579:28] ==> enum entry IMPLICIT_INTEGER_COERCION defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'gen' @ [580:17] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [580:21] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'argument' @ [580:32] ==> public abstract var argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'INT_TYPE' @ [580:47] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'data' @ [580:57] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'coerce' @ [581:28] ==> public open fun coerce(@NotNull p0: Type, @NotNull p1: Type, @NotNull p2: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'INT_TYPE' @ [581:40] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'typeMapper' @ [581:50] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapType' @ [581:61] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'expression' @ [581:69] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'type' @ [581:80] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'mv' @ [581:87] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'expression' @ [584:16] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTypeOperator[ValueParameterDescriptorImpl]

'onStack' @ [584:27] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'genStringBuilderConstructor' @ [588:17] ==> public open fun genStringBuilderConstructor(p0: (InstructionAdapter..InstructionAdapter?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'mv' @ [588:45] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'expression' @ [589:9] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitStringConcatenation[ValueParameterDescriptorImpl]

'arguments' @ [589:20] ==> public abstract val arguments: List<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.IrStringConcatenation[DeserializedPropertyDescriptor]

'forEach' @ [589:30] ==> @HidesMembers public inline fun <T> Iterable<IrExpression>.forEach(action: (IrExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'genInvokeAppendMethod' @ [590:21] ==> public open fun genInvokeAppendMethod(p0: (InstructionAdapter..InstructionAdapter?), p1: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'mv' @ [590:43] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'gen' @ [590:47] ==> public final fun gen(expression: IrElement, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'it' @ [590:51] ==> value-parameter it: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitStringConcatenation.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [590:55] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitStringConcatenation[ValueParameterDescriptorImpl]

'type' @ [590:61] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'mv' @ [593:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'invokevirtual' @ [593:12] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'expression' @ [594:16] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitStringConcatenation[ValueParameterDescriptorImpl]

'onStack' @ [594:27] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'markNewLabel' @ [598:29] ==> public final fun markNewLabel(): Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'Label' @ [599:24] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'loop' @ [600:25] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[ValueParameterDescriptorImpl]

'condition' @ [600:30] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[DeserializedPropertyDescriptor]

'gen' @ [601:9] ==> public final fun gen(expression: IrElement, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'condition' @ [601:13] ==> val condition: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[LocalVariableDescriptor]

'data' @ [601:24] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[ValueParameterDescriptorImpl]

'BranchedValue' @ [602:9] ==> public companion object defined in org.jetbrains.kotlin.codegen.BranchedValue[FakeCallableDescriptorForObject]

'condJump' @ [602:23] ==> public final fun condJump(condition: StackValue, label: Label, jumpIfFalse: Boolean, iv: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.BranchedValue.Companion[DeserializedSimpleFunctionDescriptor]

'onStack' @ [602:43] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'condition' @ [602:51] ==> val condition: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[LocalVariableDescriptor]

'asmType' @ [602:61] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'endLabel' @ [602:71] ==> val endLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[LocalVariableDescriptor]

'mv' @ [602:87] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'with' @ [604:9] ==> @InlineOnly public inline fun <T, R> with(receiver: LoopInfo, block: LoopInfo.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LoopInfo
    <R> -> Unit

'LoopInfo' @ [604:14] ==> public constructor LoopInfo(loop: IrLoop, continueLabel: Label, breakLabel: Label) defined in org.jetbrains.kotlin.backend.jvm.codegen.LoopInfo[ClassConstructorDescriptorImpl]

'loop' @ [604:23] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[ValueParameterDescriptorImpl]

'continueLabel' @ [604:29] ==> val continueLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[LocalVariableDescriptor]

'endLabel' @ [604:44] ==> val endLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[LocalVariableDescriptor]

'data' @ [605:13] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[ValueParameterDescriptorImpl]

'addInfo' @ [605:18] ==> public final fun addInfo(loop: ExpressionInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'this' @ [605:26] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop.<anonymous>[ReceiverParameterDescriptorImpl]

'loop' @ [606:13] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[ValueParameterDescriptorImpl]

'body' @ [606:18] ==> public abstract var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[DeserializedPropertyDescriptor]

'apply' @ [606:24] ==> @InlineOnly public inline fun <T> IrExpression.apply(block: IrExpression.() -> Unit): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'gen' @ [607:17] ==> public final fun gen(expression: IrElement, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'this' @ [607:21] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'data' @ [607:27] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[ValueParameterDescriptorImpl]

'data' @ [609:13] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[ValueParameterDescriptorImpl]

'removeInfo' @ [609:18] ==> public final fun removeInfo(info: ExpressionInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'this' @ [609:29] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop.<anonymous>[ReceiverParameterDescriptorImpl]

'mv' @ [611:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'goTo' @ [611:12] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'continueLabel' @ [611:17] ==> val continueLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[LocalVariableDescriptor]

'mv' @ [612:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mark' @ [612:12] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endLabel' @ [612:17] ==> val endLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[LocalVariableDescriptor]

'loop' @ [614:16] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitWhileLoop[ValueParameterDescriptorImpl]

'onStack' @ [614:21] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'generateBreakOrContinueExpression' @ [618:9] ==> private final fun generateBreakOrContinueExpression(expression: IrBreakContinue, afterBreakContinueLabel: Label, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'jump' @ [618:43] ==> value-parameter jump: IrBreakContinue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBreakContinue[ValueParameterDescriptorImpl]

'Label' @ [618:49] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'data' @ [618:58] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBreakContinue[ValueParameterDescriptorImpl]

'none' @ [619:16] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'data' @ [627:13] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'isEmpty' @ [627:18] ==> public final fun isEmpty(): Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'UnsupportedOperationException' @ [628:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'data' @ [631:28] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'peek' @ [631:33] ==> public final fun peek(): ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'when (stackElement) {
            is TryInfo -> //noinspection ConstantConditions
                genFinallyBlockOrGoto(stackElement, null, afterBreakContinueLabel, data)
            is LoopInfo -> {
                val loop = expression.loop
                //noinspection ConstantConditions
                if (loop == stackElement.loop) {
                    val label = if (expression is IrBreak) stackElement.breakLabel else stackElement.continueLabel
                    mv.fixStackAndJump(label)
                    mv.mark(afterBreakContinueLabel)
                    return
                }
            }
            else -> throw UnsupportedOperationException("Wrong BlockStackElement in processing stack")
        }' @ [633:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'stackElement' @ [633:15] ==> val stackElement: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[LocalVariableDescriptor]

'genFinallyBlockOrGoto' @ [635:17] ==> private final fun genFinallyBlockOrGoto(tryInfo: TryInfo?, tryCatchBlockEnd: Label?, afterJumpLabel: Label?, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'stackElement' @ [635:39] ==> val stackElement: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[LocalVariableDescriptor]

'afterBreakContinueLabel' @ [635:59] ==> value-parameter afterBreakContinueLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'data' @ [635:84] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'expression' @ [637:28] ==> value-parameter expression: IrBreakContinue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'loop' @ [637:39] ==> public abstract var loop: IrLoop defined in org.jetbrains.kotlin.ir.expressions.IrBreakContinue[DeserializedPropertyDescriptor]

'loop' @ [639:21] ==> val loop: IrLoop defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[LocalVariableDescriptor]

'stackElement' @ [639:29] ==> val stackElement: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[LocalVariableDescriptor]

'loop' @ [639:42] ==> public final val loop: IrLoop defined in org.jetbrains.kotlin.backend.jvm.codegen.LoopInfo[PropertyDescriptorImpl]

'if (expression is IrBreak) stackElement.breakLabel else stackElement.continueLabel' @ [640:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Label, elseBranch: Label): Label[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Label

'expression' @ [640:37] ==> value-parameter expression: IrBreakContinue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'stackElement' @ [640:60] ==> val stackElement: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[LocalVariableDescriptor]

'breakLabel' @ [640:73] ==> public final val breakLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.LoopInfo[PropertyDescriptorImpl]

'stackElement' @ [640:89] ==> val stackElement: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[LocalVariableDescriptor]

'continueLabel' @ [640:102] ==> public final val continueLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.LoopInfo[PropertyDescriptorImpl]

'mv' @ [641:21] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'fixStackAndJump' @ [641:24] ==> public fun InstructionAdapter.fixStackAndJump(label: Label): Unit defined in org.jetbrains.kotlin.codegen.pseudoInsns[DeserializedSimpleFunctionDescriptor]

'label' @ [641:40] ==> val label: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[LocalVariableDescriptor]

'mv' @ [642:21] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mark' @ [642:24] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'afterBreakContinueLabel' @ [642:29] ==> value-parameter afterBreakContinueLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [646:27] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'data' @ [649:9] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'pop' @ [649:14] ==> public final fun pop(): ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'generateBreakOrContinueExpression' @ [650:22] ==> private final fun generateBreakOrContinueExpression(expression: IrBreakContinue, afterBreakContinueLabel: Label, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [650:56] ==> value-parameter expression: IrBreakContinue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'afterBreakContinueLabel' @ [650:68] ==> value-parameter afterBreakContinueLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'data' @ [650:93] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'data' @ [651:9] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[ValueParameterDescriptorImpl]

'addInfo' @ [651:14] ==> public final fun addInfo(loop: ExpressionInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'stackElement' @ [651:22] ==> val stackElement: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[LocalVariableDescriptor]

'result' @ [652:16] ==> val result: Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateBreakOrContinueExpression[LocalVariableDescriptor]

'markNewLabel' @ [656:21] ==> public final fun markNewLabel(): Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'Label' @ [657:24] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'Label' @ [658:29] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'with' @ [660:9] ==> @InlineOnly public inline fun <T, R> with(receiver: LoopInfo, block: LoopInfo.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LoopInfo
    <R> -> Unit

'LoopInfo' @ [660:14] ==> public constructor LoopInfo(loop: IrLoop, continueLabel: Label, breakLabel: Label) defined in org.jetbrains.kotlin.backend.jvm.codegen.LoopInfo[ClassConstructorDescriptorImpl]

'loop' @ [660:23] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[ValueParameterDescriptorImpl]

'continueLabel' @ [660:29] ==> val continueLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[LocalVariableDescriptor]

'endLabel' @ [660:44] ==> val endLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[LocalVariableDescriptor]

'data' @ [661:13] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[ValueParameterDescriptorImpl]

'addInfo' @ [661:18] ==> public final fun addInfo(loop: ExpressionInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'this' @ [661:26] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop.<anonymous>[ReceiverParameterDescriptorImpl]

'loop' @ [662:13] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[ValueParameterDescriptorImpl]

'body' @ [662:18] ==> public abstract var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[DeserializedPropertyDescriptor]

'apply' @ [662:24] ==> @InlineOnly public inline fun <T> IrExpression.apply(block: IrExpression.() -> Unit): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'gen' @ [663:17] ==> public final fun gen(expression: IrElement, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'this' @ [663:21] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'data' @ [663:27] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[ValueParameterDescriptorImpl]

'data' @ [665:13] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[ValueParameterDescriptorImpl]

'removeInfo' @ [665:18] ==> public final fun removeInfo(info: ExpressionInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'this' @ [665:29] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop.<anonymous>[ReceiverParameterDescriptorImpl]

'mv' @ [668:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'visitLabel' @ [668:12] ==> public open fun visitLabel(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'continueLabel' @ [668:23] ==> val continueLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[LocalVariableDescriptor]

'loop' @ [669:25] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[ValueParameterDescriptorImpl]

'condition' @ [669:30] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[DeserializedPropertyDescriptor]

'gen' @ [670:9] ==> public final fun gen(expression: IrElement, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'condition' @ [670:13] ==> val condition: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[LocalVariableDescriptor]

'data' @ [670:24] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[ValueParameterDescriptorImpl]

'BranchedValue' @ [671:9] ==> public companion object defined in org.jetbrains.kotlin.codegen.BranchedValue[FakeCallableDescriptorForObject]

'condJump' @ [671:23] ==> public final fun condJump(condition: StackValue, label: Label, jumpIfFalse: Boolean, iv: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.BranchedValue.Companion[DeserializedSimpleFunctionDescriptor]

'onStack' @ [671:43] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'condition' @ [671:51] ==> val condition: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[LocalVariableDescriptor]

'asmType' @ [671:61] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'entry' @ [671:71] ==> val entry: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[LocalVariableDescriptor]

'mv' @ [671:85] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mv' @ [672:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mark' @ [672:12] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endLabel' @ [672:17] ==> val endLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[LocalVariableDescriptor]

'loop' @ [674:16] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitDoWhileLoop[ValueParameterDescriptorImpl]

'onStack' @ [674:21] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'aTry' @ [678:33] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'finallyExpression' @ [678:38] ==> public abstract var finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrTry[DeserializedPropertyDescriptor]

'if (finallyExpression != null) TryInfo(aTry) else null' @ [679:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TryInfo?, elseBranch: TryInfo?): TryInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TryInfo?

'finallyExpression' @ [679:27] ==> val finallyExpression: IrExpression? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'TryInfo' @ [679:54] ==> public constructor TryInfo(tryBlock: IrTry) defined in org.jetbrains.kotlin.backend.jvm.codegen.TryInfo[ClassConstructorDescriptorImpl]

'aTry' @ [679:62] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'tryInfo' @ [680:13] ==> val tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'data' @ [681:13] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'addInfo' @ [681:18] ==> public final fun addInfo(loop: ExpressionInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'tryInfo' @ [681:26] ==> val tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'markNewLabel' @ [684:29] ==> public final fun markNewLabel(): Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'mv' @ [685:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'nop' @ [685:12] ==> public open fun nop(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'gen' @ [686:9] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'aTry' @ [686:13] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'tryResult' @ [686:18] ==> public abstract var tryResult: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTry[DeserializedPropertyDescriptor]

'aTry' @ [686:29] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'asmType' @ [686:34] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'data' @ [686:43] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'markNewLabel' @ [687:27] ==> public final fun markNewLabel(): Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'getCurrentTryIntervals' @ [689:26] ==> private final fun getCurrentTryIntervals(finallyBlockStackElement: TryInfo?, blockStart: Label, blockEnd: Label): List<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'tryInfo' @ [689:49] ==> val tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'tryBlockStart' @ [689:58] ==> val tryBlockStart: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'tryBlockEnd' @ [689:73] ==> val tryBlockEnd: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'Label' @ [691:32] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'genFinallyBlockOrGoto' @ [692:9] ==> private final fun genFinallyBlockOrGoto(tryInfo: TryInfo?, tryCatchBlockEnd: Label?, afterJumpLabel: Label?, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'tryInfo' @ [692:31] ==> val tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'tryCatchBlockEnd' @ [692:41] ==> val tryCatchBlockEnd: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'data' @ [692:65] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'aTry' @ [694:23] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'catches' @ [694:28] ==> public abstract val catches: List<IrCatch> defined in org.jetbrains.kotlin.ir.expressions.IrTry[DeserializedPropertyDescriptor]

'catches' @ [695:24] ==> val catches: List<IrCatch> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'markNewLabel' @ [696:31] ==> public final fun markNewLabel(): Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'clause' @ [697:30] ==> val clause: IrCatch defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'parameter' @ [697:37] ==> public abstract val parameter: VariableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCatch[DeserializedPropertyDescriptor]

'descriptor' @ [698:34] ==> val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'asmType' @ [698:45] ==> private final val CallableDescriptor.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'frame' @ [699:25] ==> public final val frame: FrameMap defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'enter' @ [699:31] ==> public open fun enter(p0: (DeclarationDescriptor..DeclarationDescriptor?), p1: (Type..Type?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'descriptor' @ [699:37] ==> val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'descriptorType' @ [699:49] ==> val descriptorType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'mv' @ [700:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'store' @ [700:16] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'index' @ [700:22] ==> val index: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'descriptorType' @ [700:29] ==> val descriptorType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'clause' @ [702:29] ==> val clause: IrCatch defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'result' @ [702:36] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrCatch[DeserializedPropertyDescriptor]

'gen' @ [703:13] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'catchBody' @ [703:17] ==> val catchBody: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'catchBody' @ [703:28] ==> val catchBody: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'asmType' @ [703:38] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'data' @ [703:47] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'frame' @ [705:13] ==> public final val frame: FrameMap defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'leave' @ [705:19] ==> public open fun leave(p0: (DeclarationDescriptor..DeclarationDescriptor?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'descriptor' @ [705:25] ==> val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'markNewLabel' @ [707:29] ==> public final fun markNewLabel(): Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'mv' @ [709:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'visitLocalVariable' @ [709:16] ==> public open fun visitLocalVariable(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: (Label..Label?), p4: (Label..Label?), p5: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'descriptor' @ [709:35] ==> val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'name' @ [709:46] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [709:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'descriptorType' @ [709:63] ==> val descriptorType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'descriptor' @ [709:78] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'clauseStart' @ [709:96] ==> val clauseStart: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'clauseEnd' @ [709:109] ==> val clauseEnd: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'index' @ [710:34] ==> val index: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'genFinallyBlockOrGoto' @ [712:13] ==> private final fun genFinallyBlockOrGoto(tryInfo: TryInfo?, tryCatchBlockEnd: Label?, afterJumpLabel: Label?, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'tryInfo' @ [712:35] ==> val tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'if (clause != catches.last() || finallyExpression != null) tryCatchBlockEnd else null' @ [712:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Label?, elseBranch: Label?): Label?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Label?

'clause' @ [712:48] ==> val clause: IrCatch defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'catches' @ [712:58] ==> val catches: List<IrCatch> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'last' @ [712:66] ==> public fun <T> List<IrCatch>.last(): IrCatch defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCatch

'finallyExpression' @ [712:76] ==> val finallyExpression: IrExpression? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'tryCatchBlockEnd' @ [712:103] ==> val tryCatchBlockEnd: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'data' @ [712:137] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'generateExceptionTable' @ [714:13] ==> private final fun generateExceptionTable(catchStart: Label, catchedRegions: List<Label>, exception: String?): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'clauseStart' @ [714:36] ==> val clauseStart: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'tryRegions' @ [714:49] ==> val tryRegions: List<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'descriptorType' @ [714:61] ==> val descriptorType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'internalName' @ [714:76] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'finallyExpression' @ [718:13] ==> val finallyExpression: IrExpression? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'Label' @ [719:37] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'mv' @ [720:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mark' @ [720:16] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'defaultCatchStart' @ [720:21] ==> val defaultCatchStart: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'frame' @ [721:34] ==> public final val frame: FrameMap defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'enterTemp' @ [721:40] ==> public open fun enterTemp(p0: (Type..Type?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'JAVA_THROWABLE_TYPE' @ [721:50] ==> public final val JAVA_THROWABLE_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'mv' @ [722:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'store' @ [722:16] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'savedException' @ [722:22] ==> val savedException: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'JAVA_THROWABLE_TYPE' @ [722:38] ==> public final val JAVA_THROWABLE_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'Label' @ [724:35] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'mv' @ [725:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mark' @ [725:16] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'defaultCatchEnd' @ [725:21] ==> val defaultCatchEnd: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'getCurrentTryIntervals' @ [729:39] ==> private final fun getCurrentTryIntervals(finallyBlockStackElement: TryInfo?, blockStart: Label, blockEnd: Label): List<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'tryInfo' @ [729:62] ==> val tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'tryBlockStart' @ [729:71] ==> val tryBlockStart: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'defaultCatchEnd' @ [729:86] ==> val defaultCatchEnd: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'genFinallyBlockOrGoto' @ [731:13] ==> private final fun genFinallyBlockOrGoto(tryInfo: TryInfo?, tryCatchBlockEnd: Label?, afterJumpLabel: Label?, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'tryInfo' @ [731:35] ==> val tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'data' @ [731:56] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'mv' @ [733:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'load' @ [733:16] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'savedException' @ [733:21] ==> val savedException: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'JAVA_THROWABLE_TYPE' @ [733:37] ==> public final val JAVA_THROWABLE_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'frame' @ [734:13] ==> public final val frame: FrameMap defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'leaveTemp' @ [734:19] ==> public open fun leaveTemp(p0: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'JAVA_THROWABLE_TYPE' @ [734:29] ==> public final val JAVA_THROWABLE_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'mv' @ [736:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'athrow' @ [736:16] ==> public open fun athrow(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'generateExceptionTable' @ [738:13] ==> private final fun generateExceptionTable(catchStart: Label, catchedRegions: List<Label>, exception: String?): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'defaultCatchStart' @ [738:36] ==> val defaultCatchStart: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'defaultCatchRegions' @ [738:55] ==> val defaultCatchRegions: List<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'mv' @ [741:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mark' @ [741:12] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'tryCatchBlockEnd' @ [741:17] ==> val tryCatchBlockEnd: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'tryInfo' @ [742:13] ==> val tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'data' @ [743:13] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'removeInfo' @ [743:18] ==> public final fun removeInfo(info: ExpressionInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'tryInfo' @ [743:29] ==> val tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[LocalVariableDescriptor]

'aTry' @ [746:16] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry[ValueParameterDescriptorImpl]

'onStack' @ [746:21] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'if (finallyBlockStackElement != null) ArrayList<Label>(finallyBlockStackElement.gaps) else emptyList<Label>()' @ [754:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<(Label..Label?)>, elseBranch: List<(Label..Label?)>): List<(Label..Label?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<(org.jetbrains.org.objectweb.asm.Label..org.jetbrains.org.objectweb.asm.Label?)>

'finallyBlockStackElement' @ [754:31] ==> value-parameter finallyBlockStackElement: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getCurrentTryIntervals[ValueParameterDescriptorImpl]

'ArrayList' @ [754:65] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (Label..Label?)>..Collection<(Label..Label?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Label

'finallyBlockStackElement' @ [754:82] ==> value-parameter finallyBlockStackElement: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getCurrentTryIntervals[ValueParameterDescriptorImpl]

'gaps' @ [754:107] ==> public final val gaps: MutableList<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.TryInfo[PropertyDescriptorImpl]

'emptyList' @ [754:118] ==> public fun <T> emptyList(): List<Label> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label

'assert' @ [755:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'gapsInBlock' @ [755:16] ==> val gapsInBlock: List<(Label..Label?)> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getCurrentTryIntervals[LocalVariableDescriptor]

'size' @ [755:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'ArrayList' @ [756:28] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Label

'gapsInBlock' @ [756:45] ==> val gapsInBlock: List<(Label..Label?)> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getCurrentTryIntervals[LocalVariableDescriptor]

'size' @ [756:57] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'blockRegions' @ [757:9] ==> val blockRegions: ArrayList<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getCurrentTryIntervals[LocalVariableDescriptor]

'add' @ [757:22] ==> public open fun add(element: Label): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'blockStart' @ [757:26] ==> value-parameter blockStart: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getCurrentTryIntervals[ValueParameterDescriptorImpl]

'blockRegions' @ [758:9] ==> val blockRegions: ArrayList<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getCurrentTryIntervals[LocalVariableDescriptor]

'addAll' @ [758:22] ==> public open fun addAll(elements: Collection<Label>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'gapsInBlock' @ [758:29] ==> val gapsInBlock: List<(Label..Label?)> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getCurrentTryIntervals[LocalVariableDescriptor]

'blockRegions' @ [759:9] ==> val blockRegions: ArrayList<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getCurrentTryIntervals[LocalVariableDescriptor]

'add' @ [759:22] ==> public open fun add(element: Label): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'blockEnd' @ [759:26] ==> value-parameter blockEnd: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getCurrentTryIntervals[ValueParameterDescriptorImpl]

'blockRegions' @ [760:16] ==> val blockRegions: ArrayList<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getCurrentTryIntervals[LocalVariableDescriptor]

'i' @ [765:16] ==> var i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateExceptionTable[LocalVariableDescriptor]

'catchedRegions' @ [765:20] ==> value-parameter catchedRegions: List<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateExceptionTable[ValueParameterDescriptorImpl]

'size' @ [765:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'catchedRegions' @ [766:31] ==> value-parameter catchedRegions: List<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateExceptionTable[ValueParameterDescriptorImpl]

'i' @ [766:46] ==> var i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateExceptionTable[LocalVariableDescriptor]

'catchedRegions' @ [767:29] ==> value-parameter catchedRegions: List<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateExceptionTable[ValueParameterDescriptorImpl]

'i' @ [767:44] ==> var i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateExceptionTable[LocalVariableDescriptor]

'mv' @ [768:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'visitTryCatchBlock' @ [768:16] ==> public open fun visitTryCatchBlock(p0: (Label..Label?), p1: (Label..Label?), p2: (Label..Label?), p3: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'startRegion' @ [768:35] ==> val startRegion: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateExceptionTable[LocalVariableDescriptor]

'endRegion' @ [768:48] ==> val endRegion: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateExceptionTable[LocalVariableDescriptor]

'catchStart' @ [768:59] ==> value-parameter catchStart: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateExceptionTable[ValueParameterDescriptorImpl]

'exception' @ [768:71] ==> value-parameter exception: String? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateExceptionTable[ValueParameterDescriptorImpl]

'i' @ [769:13] ==> var i: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateExceptionTable[LocalVariableDescriptor]

'tryInfo' @ [779:13] ==> value-parameter tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'assert' @ [780:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'tryInfo' @ [780:20] ==> value-parameter tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'gaps' @ [780:28] ==> public final val gaps: MutableList<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.TryInfo[PropertyDescriptorImpl]

'size' @ [780:33] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'data' @ [782:30] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'pop' @ [782:35] ==> public final fun pop(): ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'assert' @ [783:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'topOfStack' @ [783:20] ==> val topOfStack: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[LocalVariableDescriptor]

'tryInfo' @ [783:35] ==> value-parameter tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'tryInfo' @ [785:28] ==> value-parameter tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'tryBlock' @ [785:36] ==> public final val tryBlock: IrTry defined in org.jetbrains.kotlin.backend.jvm.codegen.TryInfo[PropertyDescriptorImpl]

'markNewLabel' @ [786:32] ==> public final fun markNewLabel(): Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'tryInfo' @ [787:13] ==> value-parameter tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'gaps' @ [787:21] ==> public final val gaps: MutableList<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.TryInfo[PropertyDescriptorImpl]

'add' @ [787:26] ==> public abstract fun add(element: Label): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'finallyStart' @ [787:30] ==> val finallyStart: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[LocalVariableDescriptor]

'gen' @ [790:13] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'tryBlock' @ [790:17] ==> val tryBlock: IrTry defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[LocalVariableDescriptor]

'finallyExpression' @ [790:26] ==> public abstract var finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrTry[DeserializedPropertyDescriptor]

'VOID_TYPE' @ [790:52] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'data' @ [790:63] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'tryCatchBlockEnd' @ [793:13] ==> value-parameter tryCatchBlockEnd: Label? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'mv' @ [794:13] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'goTo' @ [794:16] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'tryCatchBlockEnd' @ [794:21] ==> value-parameter tryCatchBlockEnd: Label? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'tryInfo' @ [797:13] ==> value-parameter tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'afterJumpLabel' @ [798:30] ==> value-parameter afterJumpLabel: Label? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'Label' @ [798:48] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'afterJumpLabel' @ [799:17] ==> value-parameter afterJumpLabel: Label? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'mv' @ [800:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mark' @ [800:20] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'finallyEnd' @ [800:25] ==> val finallyEnd: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[LocalVariableDescriptor]

'tryInfo' @ [802:13] ==> value-parameter tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'gaps' @ [802:21] ==> public final val gaps: MutableList<Label> defined in org.jetbrains.kotlin.backend.jvm.codegen.TryInfo[PropertyDescriptorImpl]

'add' @ [802:26] ==> public abstract fun add(element: Label): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'finallyEnd' @ [802:30] ==> val finallyEnd: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[LocalVariableDescriptor]

'data' @ [804:13] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'addInfo' @ [804:18] ==> public final fun addInfo(loop: ExpressionInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'tryInfo' @ [804:26] ==> value-parameter tryInfo: TryInfo? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.genFinallyBlockOrGoto[ValueParameterDescriptorImpl]

'data' @ [809:13] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[ValueParameterDescriptorImpl]

'hasFinallyBlocks' @ [809:18] ==> public final fun hasFinallyBlocks(): Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'if (Type.VOID_TYPE != returnType) {
                val returnValIndex = frame.enterTemp(returnType)
                val localForReturnValue = StackValue.local(returnValIndex, returnType)
                localForReturnValue.store(StackValue.onStack(returnType), mv)
                doFinallyOnReturn(afterReturnLabel, data)
                localForReturnValue.put(returnType, mv)
                frame.leaveTemp(returnType)
            }
            else {
                doFinallyOnReturn(afterReturnLabel, data)
            }' @ [810:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!=' @ [810:17] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'VOID_TYPE' @ [810:22] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'returnType' @ [810:35] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[ValueParameterDescriptorImpl]

'frame' @ [811:38] ==> public final val frame: FrameMap defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'enterTemp' @ [811:44] ==> public open fun enterTemp(p0: (Type..Type?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'returnType' @ [811:54] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[ValueParameterDescriptorImpl]

'local' @ [812:54] ==> @NotNull public open fun local(p0: Int, @NotNull p1: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'returnValIndex' @ [812:60] ==> val returnValIndex: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[LocalVariableDescriptor]

'returnType' @ [812:76] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[ValueParameterDescriptorImpl]

'localForReturnValue' @ [813:17] ==> val localForReturnValue: StackValue.Local defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[LocalVariableDescriptor]

'store' @ [813:37] ==> public open fun store(@NotNull p0: StackValue, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaMethodDescriptor]

'onStack' @ [813:54] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'returnType' @ [813:62] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[ValueParameterDescriptorImpl]

'mv' @ [813:75] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'doFinallyOnReturn' @ [814:17] ==> private final fun doFinallyOnReturn(afterReturnLabel: Label, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'afterReturnLabel' @ [814:35] ==> value-parameter afterReturnLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[ValueParameterDescriptorImpl]

'data' @ [814:53] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[ValueParameterDescriptorImpl]

'localForReturnValue' @ [815:17] ==> val localForReturnValue: StackValue.Local defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[LocalVariableDescriptor]

'put' @ [815:37] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaMethodDescriptor]

'returnType' @ [815:41] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[ValueParameterDescriptorImpl]

'mv' @ [815:53] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'frame' @ [816:17] ==> public final val frame: FrameMap defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'leaveTemp' @ [816:23] ==> public open fun leaveTemp(p0: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'returnType' @ [816:33] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[ValueParameterDescriptorImpl]

'doFinallyOnReturn' @ [819:17] ==> private final fun doFinallyOnReturn(afterReturnLabel: Label, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'afterReturnLabel' @ [819:35] ==> value-parameter afterReturnLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[ValueParameterDescriptorImpl]

'data' @ [819:53] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateFinallyBlocksIfNeeded[ValueParameterDescriptorImpl]

'!' @ [826:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'data' @ [826:14] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.doFinallyOnReturn[ValueParameterDescriptorImpl]

'isEmpty' @ [826:19] ==> public final fun isEmpty(): Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'data' @ [827:32] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.doFinallyOnReturn[ValueParameterDescriptorImpl]

'peek' @ [827:37] ==> public final fun peek(): ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'when (stackElement) {
                is TryInfo -> genFinallyBlockOrGoto(stackElement, null, afterReturnLabel, data)
                is LoopInfo -> {

                }
                else -> throw UnsupportedOperationException("Wrong BlockStackElement in processing stack")
            }' @ [828:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'stackElement' @ [828:19] ==> val stackElement: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.doFinallyOnReturn[LocalVariableDescriptor]

'genFinallyBlockOrGoto' @ [829:31] ==> private final fun genFinallyBlockOrGoto(tryInfo: TryInfo?, tryCatchBlockEnd: Label?, afterJumpLabel: Label?, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'stackElement' @ [829:53] ==> val stackElement: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.doFinallyOnReturn[LocalVariableDescriptor]

'afterReturnLabel' @ [829:73] ==> value-parameter afterReturnLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.doFinallyOnReturn[ValueParameterDescriptorImpl]

'data' @ [829:91] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.doFinallyOnReturn[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [833:31] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'data' @ [836:13] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.doFinallyOnReturn[ValueParameterDescriptorImpl]

'pop' @ [836:18] ==> public final fun pop(): ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'doFinallyOnReturn' @ [837:13] ==> private final fun doFinallyOnReturn(afterReturnLabel: Label, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'afterReturnLabel' @ [837:31] ==> value-parameter afterReturnLabel: Label defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.doFinallyOnReturn[ValueParameterDescriptorImpl]

'data' @ [837:49] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.doFinallyOnReturn[ValueParameterDescriptorImpl]

'data' @ [838:13] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.doFinallyOnReturn[ValueParameterDescriptorImpl]

'addInfo' @ [838:18] ==> public final fun addInfo(loop: ExpressionInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.BlockInfo[SimpleFunctionDescriptorImpl]

'stackElement' @ [838:26] ==> val stackElement: ExpressionInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.doFinallyOnReturn[LocalVariableDescriptor]

'gen' @ [843:9] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [843:13] ==> value-parameter expression: IrThrow defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitThrow[ValueParameterDescriptorImpl]

'value' @ [843:24] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrThrow[DeserializedPropertyDescriptor]

'JAVA_THROWABLE_TYPE' @ [843:31] ==> public final val JAVA_THROWABLE_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'data' @ [843:52] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitThrow[ValueParameterDescriptorImpl]

'mv' @ [844:9] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'athrow' @ [844:12] ==> public open fun athrow(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'expression' @ [845:16] ==> value-parameter expression: IrThrow defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitThrow[ValueParameterDescriptorImpl]

'onStack' @ [845:27] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'generateClassLiteralReference' @ [849:9] ==> public final fun generateClassLiteralReference(receiverExpression: IrExpression, wrapIntoKClass: Boolean, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [849:39] ==> value-parameter expression: IrClassReference defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitClassReference[ValueParameterDescriptorImpl]

'data' @ [849:57] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitClassReference[ValueParameterDescriptorImpl]

'expression' @ [850:16] ==> value-parameter expression: IrClassReference defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitClassReference[ValueParameterDescriptorImpl]

'onStack' @ [850:27] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'if (receiverExpression !is IrClassReference /* && DescriptorUtils.isObjectQualifier(receiverExpression.descriptor)*/) {
            JavaClassProperty.generateImpl(mv, gen(receiverExpression, data))
        }
        else {
//                if (TypeUtils.isTypeParameter(type)) {
//                    assert(TypeUtils.isReifiedTypeParameter(type)) { "Non-reified type parameter under ::class should be rejected by type checker: " + type }
//                    putReifiedOperationMarkerIfTypeIsReifiedParameter(type, ReifiedTypeInliner.OperationKind.JAVA_CLASS)
//                }

            putJavaLangClassInstance(mv, typeMapper.mapType(receiverExpression.descriptor.defaultType))
        }' @ [858:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'receiverExpression' @ [858:13] ==> value-parameter receiverExpression: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateClassLiteralReference[ValueParameterDescriptorImpl]

'generateImpl' @ [859:31] ==> public final fun generateImpl(v: InstructionAdapter, receiver: StackValue): Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty[DeserializedSimpleFunctionDescriptor]

'mv' @ [859:44] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'gen' @ [859:48] ==> public final fun gen(expression: IrElement, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [859:52] ==> value-parameter receiverExpression: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateClassLiteralReference[ValueParameterDescriptorImpl]

'data' @ [859:72] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateClassLiteralReference[ValueParameterDescriptorImpl]

'putJavaLangClassInstance' @ [867:13] ==> public open fun putJavaLangClassInstance(@NotNull p0: InstructionAdapter, @NotNull p1: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'mv' @ [867:38] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'typeMapper' @ [867:42] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapType' @ [867:53] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'receiverExpression' @ [867:61] ==> value-parameter receiverExpression: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateClassLiteralReference[ValueParameterDescriptorImpl]

'descriptor' @ [867:80] ==> public abstract val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrClassReference[DeserializedPropertyDescriptor]

'defaultType' @ [867:91] ==> public final val ClassifierDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'wrapIntoKClass' @ [870:13] ==> value-parameter wrapIntoKClass: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generateClassLiteralReference[ValueParameterDescriptorImpl]

'wrapJavaClassIntoKClass' @ [871:13] ==> public open fun wrapJavaClassIntoKClass(@NotNull p0: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'mv' @ [871:37] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'toType' @ [877:13] ==> value-parameter toType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.coerceNotToUnit[ValueParameterDescriptorImpl]

'UNIT_TYPE' @ [877:32] ==> public final val UNIT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'coerce' @ [878:13] ==> public open fun coerce(@NotNull p0: Type, @NotNull p1: Type, @NotNull p2: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'fromType' @ [878:20] ==> value-parameter fromType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.coerceNotToUnit[ValueParameterDescriptorImpl]

'toType' @ [878:30] ==> value-parameter toType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.coerceNotToUnit[ValueParameterDescriptorImpl]

'mv' @ [878:38] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'typeMapper' @ [883:17] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapType' @ [883:28] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'this' @ [883:36] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.asmType[ReceiverParameterDescriptorImpl]

'type' @ [883:41] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'onStack' @ [886:28] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'this' @ [886:36] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.onStack[ReceiverParameterDescriptorImpl]

'asmType' @ [886:41] ==> public final val IrExpression.asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'intrinsics' @ [889:25] ==> public final val intrinsics: IrIntrinsicMethods defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'getIntrinsic' @ [889:36] ==> public final fun getIntrinsic(descriptor: CallableMemberDescriptor): IntrinsicMethod? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicMethods[SimpleFunctionDescriptorImpl]

'irCall' @ [889:49] ==> value-parameter irCall: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[ValueParameterDescriptorImpl]

'descriptor' @ [889:56] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'original' @ [889:67] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'intrinsic' @ [890:13] ==> val intrinsic: IntrinsicMethod? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'intrinsic' @ [891:20] ==> val intrinsic: IntrinsicMethod? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'toCallable' @ [891:30] ==> public open fun toCallable(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext): IrIntrinsicFunction defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[SimpleFunctionDescriptorImpl]

'irCall' @ [891:41] ==> value-parameter irCall: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[ValueParameterDescriptorImpl]

'typeMapper' @ [891:49] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapSignatureSkipGeneric' @ [891:60] ==> @NotNull public open fun mapSignatureSkipGeneric(@NotNull p0: FunctionDescriptor): JvmMethodSignature defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'irCall' @ [891:84] ==> value-parameter irCall: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[ValueParameterDescriptorImpl]

'descriptor' @ [891:91] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'classCodegen' @ [891:126] ==> public final val classCodegen: ClassCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'context' @ [891:139] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'irCall' @ [894:26] ==> value-parameter irCall: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[ValueParameterDescriptorImpl]

'descriptor' @ [894:33] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'descriptor' @ [895:13] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'descriptor' @ [897:13] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'descriptor' @ [897:26] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'underlyingConstructorDescriptor' @ [897:37] ==> public abstract val underlyingConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [899:13] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'descriptor' @ [900:13] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'descriptor' @ [900:26] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'getter' @ [900:37] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'descriptor' @ [902:13] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'getDirectMember' @ [902:70] ==> @NotNull public open fun getDirectMember(@NotNull p0: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'descriptor' @ [902:86] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'getDirectMember' @ [903:53] ==> @NotNull public open fun getDirectMember(@NotNull p0: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'descriptor' @ [903:69] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'descriptor' @ [904:13] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'if (descriptor is PropertyGetterDescriptor) {
                propertyDescriptor.getMethod
            }
            else {
                propertyDescriptor.setMethod!!
            }' @ [904:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableDescriptor, elseBranch: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableDescriptor

'descriptor' @ [904:30] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'propertyDescriptor' @ [905:17] ==> val propertyDescriptor: SyntheticJavaPropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'getMethod' @ [905:36] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'propertyDescriptor' @ [908:17] ==> val propertyDescriptor: SyntheticJavaPropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'setMethod' @ [908:36] ==> public abstract val setMethod: FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'typeMapper' @ [911:16] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapToCallableMethod' @ [911:27] ==> @NotNull public open fun mapToCallableMethod(@NotNull p0: FunctionDescriptor, p1: Boolean): CallableMethod defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'descriptor' @ [911:47] ==> var descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[LocalVariableDescriptor]

'isSuper' @ [911:81] ==> value-parameter isSuper: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.resolveToCallable[ValueParameterDescriptorImpl]

'typeMapper' @ [915:17] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapType' @ [915:28] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'this' @ [915:36] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.asmType[ReceiverParameterDescriptorImpl]

'typeMapper' @ [918:17] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapType' @ [918:28] ==> @NotNull public open fun mapType(@NotNull p0: CallableDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'this' @ [918:36] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.asmType[ReceiverParameterDescriptorImpl]

'element' @ [927:13] ==> value-parameter element: IrMemberAccessExpression? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'DefaultCallGenerator' @ [927:53] ==> public object DefaultCallGenerator : IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator[FakeCallableDescriptorForObject]

'!' @ [931:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [931:26] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'isInlineDisabled' @ [931:32] ==> public final val isInlineDisabled: Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'containsReifiedTypeParameters' @ [931:63] ==> public open fun containsReifiedTypeParameters(@NotNull p0: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'descriptor' @ [931:93] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'isInline' @ [931:121] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'descriptor' @ [931:130] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'isArrayConstructorWithLambda' @ [931:156] ==> public open fun isArrayConstructorWithLambda(@NotNull p0: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'descriptor' @ [931:185] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'!' @ [933:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInline' @ [933:14] ==> val isInline: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'DefaultCallGenerator' @ [933:47] ==> public object DefaultCallGenerator : IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator[FakeCallableDescriptorForObject]

'unwrapInitialSignatureDescriptor' @ [935:24] ==> public fun unwrapInitialSignatureDescriptor(function: FunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.codegen[DeserializedSimpleFunctionDescriptor]

'unwrapFakeOverride' @ [935:73] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> unwrapFakeOverride(@NotNull p0: FunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> FunctionDescriptor

'descriptor' @ [935:92] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'original' @ [935:103] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'if (isDefaultCompilation) {
            TODO()
        }
        else {
            IrInlineCodegen(this, state, original, typeParameterMappings!!, IrSourceCompilerForInline(state, element))
        }' @ [936:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrCallGenerator, elseBranch: IrCallGenerator): IrCallGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrCallGenerator

'isDefaultCompilation' @ [936:20] ==> value-parameter isDefaultCompilation: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'TODO' @ [937:13] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'IrInlineCodegen' @ [940:13] ==> public constructor IrInlineCodegen(codegen: ExpressionCodegen, state: GenerationState, function: FunctionDescriptor, typeParameterMappings: TypeParameterMappings, sourceCompiler: SourceCompilerForInline) defined in org.jetbrains.kotlin.backend.jvm.codegen.IrInlineCodegen[ClassConstructorDescriptorImpl]

'this' @ [940:29] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[LazyClassReceiverParameterDescriptor]

'state' @ [940:35] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'original' @ [940:42] ==> val original: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'typeParameterMappings' @ [940:52] ==> value-parameter typeParameterMappings: TypeParameterMappings? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'IrSourceCompilerForInline' @ [940:77] ==> public constructor IrSourceCompilerForInline(state: GenerationState, callElement: IrMemberAccessExpression) defined in org.jetbrains.kotlin.backend.jvm.codegen.IrSourceCompilerForInline[ClassConstructorDescriptorImpl]

'state' @ [940:103] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'element' @ [940:110] ==> value-parameter element: IrMemberAccessExpression? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'descriptor' @ [945:29] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'typeParameters' @ [945:40] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'keysToMap' @ [945:55] ==> public fun <K, V> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.keysToMap(value: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> KotlinType): Map<(TypeParameterDescriptor..TypeParameterDescriptor?), KotlinType> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <V> -> KotlinType

'memberAccessExpression' @ [945:67] ==> value-parameter memberAccessExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'getTypeArgumentOrDefault' @ [945:90] ==> public fun IrMemberAccessExpression.getTypeArgumentOrDefault(typeParameterDescriptor: TypeParameterDescriptor): KotlinType defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]

'it' @ [945:115] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator.<anonymous>[ValueParameterDescriptorImpl]

'TypeParameterMappings' @ [947:24] ==> public constructor TypeParameterMappings() defined in org.jetbrains.kotlin.codegen.inline.TypeParameterMappings[DeserializedClassConstructorDescriptor]

'typeArguments' @ [948:23] ==> val typeArguments: Map<(TypeParameterDescriptor..TypeParameterDescriptor?), KotlinType> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'entries' @ [948:37] ==> public abstract val entries: Set<Map.Entry<(TypeParameterDescriptor..TypeParameterDescriptor?), KotlinType>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'entry' @ [949:23] ==> val entry: Map.Entry<(TypeParameterDescriptor..TypeParameterDescriptor?), KotlinType> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'key' @ [949:29] ==> public abstract val key: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'entry' @ [950:24] ==> val entry: Map.Entry<(TypeParameterDescriptor..TypeParameterDescriptor?), KotlinType> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'value' @ [950:30] ==> public abstract val value: KotlinType defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'key' @ [952:29] ==> val key: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'isReified' @ [952:33] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

'isArrayConstructorWithLambda' @ [952:57] ==> public open fun isArrayConstructorWithLambda(@NotNull p0: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'descriptor' @ [952:86] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'extractReificationArgument' @ [954:55] ==> public fun extractReificationArgument(type: KotlinType): Pair<TypeParameterDescriptor, ReificationArgument>? defined in org.jetbrains.kotlin.codegen[DeserializedSimpleFunctionDescriptor]

'type' @ [954:82] ==> val type: KotlinType defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'if (typeParameterAndReificationArgument == null) {
                val approximatedType = approximateCapturedTypes(entry.value).upper
                // type is not generic
                val signatureWriter = BothSignatureWriter(BothSignatureWriter.Mode.TYPE)
                val asmType = typeMapper.mapTypeParameter(approximatedType, signatureWriter)

                mappings.addParameterMappingToType(
                        key.name.identifier, approximatedType, asmType, signatureWriter.toString(), isReified
                )
            }
            else {
                mappings.addParameterMappingForFurtherReification(
                        key.name.identifier, type, typeParameterAndReificationArgument.second, isReified
                )
            }' @ [955:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'typeParameterAndReificationArgument' @ [955:17] ==> val typeParameterAndReificationArgument: Pair<TypeParameterDescriptor, ReificationArgument>? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'approximateCapturedTypes' @ [956:40] ==> public fun approximateCapturedTypes(type: KotlinType): ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation[DeserializedSimpleFunctionDescriptor]

'entry' @ [956:65] ==> val entry: Map.Entry<(TypeParameterDescriptor..TypeParameterDescriptor?), KotlinType> defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'value' @ [956:71] ==> public abstract val value: KotlinType defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'upper' @ [956:78] ==> public final val upper: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[DeserializedPropertyDescriptor]

'BothSignatureWriter' @ [958:39] ==> public constructor BothSignatureWriter(@NotNull p0: BothSignatureWriter.Mode) defined in org.jetbrains.kotlin.codegen.signature.BothSignatureWriter[JavaClassConstructorDescriptor]

'TYPE' @ [958:84] ==> enum entry TYPE defined in org.jetbrains.kotlin.codegen.signature.BothSignatureWriter.Mode[FakeCallableDescriptorForObject]

'typeMapper' @ [959:31] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mapTypeParameter' @ [959:42] ==> @NotNull public open fun mapTypeParameter(@NotNull p0: KotlinType, @Nullable p1: JvmSignatureWriter?): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'approximatedType' @ [959:59] ==> val approximatedType: KotlinType defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'signatureWriter' @ [959:77] ==> val signatureWriter: BothSignatureWriter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'mappings' @ [961:17] ==> val mappings: TypeParameterMappings defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'addParameterMappingToType' @ [961:26] ==> public final fun addParameterMappingToType(name: String, type: KotlinType, asmType: Type, signature: String, isReified: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline.TypeParameterMappings[DeserializedSimpleFunctionDescriptor]

'key' @ [962:25] ==> val key: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'name' @ [962:29] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'identifier' @ [962:34] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'approximatedType' @ [962:46] ==> val approximatedType: KotlinType defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'asmType' @ [962:64] ==> val asmType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'signatureWriter' @ [962:73] ==> val signatureWriter: BothSignatureWriter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'toString' @ [962:89] ==> public open fun toString(): String defined in org.jetbrains.kotlin.codegen.signature.BothSignatureWriter[JavaMethodDescriptor]

'isReified' @ [962:101] ==> val isReified: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'mappings' @ [966:17] ==> val mappings: TypeParameterMappings defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'addParameterMappingForFurtherReification' @ [966:26] ==> public final fun addParameterMappingForFurtherReification(name: String, type: KotlinType, reificationArgument: ReificationArgument, isReified: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline.TypeParameterMappings[DeserializedSimpleFunctionDescriptor]

'key' @ [967:25] ==> val key: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'name' @ [967:29] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'identifier' @ [967:34] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'type' @ [967:46] ==> val type: KotlinType defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'typeParameterAndReificationArgument' @ [967:52] ==> val typeParameterAndReificationArgument: Pair<TypeParameterDescriptor, ReificationArgument>? defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'second' @ [967:88] ==> public final val second: ReificationArgument defined in kotlin.Pair[DeserializedPropertyDescriptor]

'isReified' @ [967:96] ==> val isReified: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'getOrCreateCallGenerator' @ [972:16] ==> private final fun getOrCreateCallGenerator(descriptor: CallableDescriptor, element: IrMemberAccessExpression?, typeParameterMappings: TypeParameterMappings?, isDefaultCompilation: Boolean): IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'descriptor' @ [972:41] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'memberAccessExpression' @ [972:53] ==> value-parameter memberAccessExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[ValueParameterDescriptorImpl]

'mappings' @ [972:77] ==> val mappings: TypeParameterMappings defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.getOrCreateCallGenerator[LocalVariableDescriptor]

'frame' @ [976:17] ==> public final val frame: FrameMap defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'mv' @ [978:17] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'NameGenerator' @ [979:55] ==> public constructor NameGenerator(p0: (String..String?)) defined in org.jetbrains.kotlin.codegen.inline.NameGenerator[JavaClassConstructorDescriptor]

'classCodegen' @ [979:72] ==> public final val classCodegen: ClassCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'type' @ [979:85] ==> public final val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'internalName' @ [979:90] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'-' @ [982:17] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toInts' @ [1007:18] ==> public final fun toInts(): List<Int> defined in org.jetbrains.kotlin.codegen.DefaultCallArgs[DeserializedSimpleFunctionDescriptor]

'!' @ [1008:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'toInts' @ [1008:10] ==> val toInts: List<Int> defined in org.jetbrains.kotlin.backend.jvm.codegen.generateOnStackIfNeeded[LocalVariableDescriptor]

'isEmpty' @ [1008:17] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'toInts' @ [1009:22] ==> val toInts: List<Int> defined in org.jetbrains.kotlin.backend.jvm.codegen.generateOnStackIfNeeded[LocalVariableDescriptor]

'callGenerator' @ [1010:13] ==> value-parameter callGenerator: IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.generateOnStackIfNeeded[ValueParameterDescriptorImpl]

'putValueIfNeeded' @ [1010:27] ==> public open fun putValueIfNeeded(parameterType: Type, value: StackValue, kind: ValueKind, parameterIndex: Int, codegen: ExpressionCodegen): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator[SimpleFunctionDescriptorImpl]

'INT_TYPE' @ [1010:49] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'constant' @ [1010:70] ==> @NotNull public open fun constant(@Nullable p0: Any?, @NotNull p1: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'mask' @ [1010:79] ==> val mask: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.generateOnStackIfNeeded[LocalVariableDescriptor]

'INT_TYPE' @ [1010:90] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'DEFAULT_MASK' @ [1010:111] ==> enum entry DEFAULT_MASK defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'-' @ [1010:125] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'codegen' @ [1010:129] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.generateOnStackIfNeeded[ValueParameterDescriptorImpl]

'if (isConstructor) AsmTypes.DEFAULT_CONSTRUCTOR_MARKER else AsmTypes.OBJECT_TYPE' @ [1013:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Type..Type?), elseBranch: (Type..Type?)): (Type..Type?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'isConstructor' @ [1013:33] ==> value-parameter isConstructor: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.generateOnStackIfNeeded[ValueParameterDescriptorImpl]

'DEFAULT_CONSTRUCTOR_MARKER' @ [1013:57] ==> public final val DEFAULT_CONSTRUCTOR_MARKER: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'OBJECT_TYPE' @ [1013:98] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'callGenerator' @ [1014:9] ==> value-parameter callGenerator: IrCallGenerator defined in org.jetbrains.kotlin.backend.jvm.codegen.generateOnStackIfNeeded[ValueParameterDescriptorImpl]

'putValueIfNeeded' @ [1014:23] ==> public open fun putValueIfNeeded(parameterType: Type, value: StackValue, kind: ValueKind, parameterIndex: Int, codegen: ExpressionCodegen): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator[SimpleFunctionDescriptorImpl]

'parameterType' @ [1014:40] ==> val parameterType: (Type..Type?) defined in org.jetbrains.kotlin.backend.jvm.codegen.generateOnStackIfNeeded[LocalVariableDescriptor]

'constant' @ [1014:66] ==> @NotNull public open fun constant(@Nullable p0: Any?, @NotNull p1: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'parameterType' @ [1014:81] ==> val parameterType: (Type..Type?) defined in org.jetbrains.kotlin.backend.jvm.codegen.generateOnStackIfNeeded[LocalVariableDescriptor]

'METHOD_HANDLE_IN_DEFAULT' @ [1014:107] ==> enum entry METHOD_HANDLE_IN_DEFAULT defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'-' @ [1014:133] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'codegen' @ [1014:137] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.generateOnStackIfNeeded[ValueParameterDescriptorImpl]

'toInts' @ [1016:12] ==> val toInts: List<Int> defined in org.jetbrains.kotlin.backend.jvm.codegen.generateOnStackIfNeeded[LocalVariableDescriptor]

'isNotEmpty' @ [1016:19] ==> @InlineOnly public inline fun <T> Collection<Int>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

