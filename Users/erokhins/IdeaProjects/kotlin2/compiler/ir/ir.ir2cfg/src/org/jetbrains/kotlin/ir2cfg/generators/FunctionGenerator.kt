'FunctionBuilder' @ [32:19] ==> public constructor FunctionBuilder(function: IrFunction) defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[ClassConstructorDescriptorImpl]

'function' @ [32:35] ==> public final val function: IrFunction defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'MergeCfgElement' @ [34:16] ==> public constructor MergeCfgElement(from: IrElement, name: String) defined in org.jetbrains.kotlin.ir2cfg.nodes.MergeCfgElement[ClassConstructorDescriptorImpl]

'function' @ [34:32] ==> public final val function: IrFunction defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'mutableMapOf' @ [36:23] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<IrLoop, IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrLoop
    <V> -> IrStatement

'mutableMapOf' @ [38:21] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<IrLoop, IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrLoop
    <V> -> IrStatement

'FunctionVisitor' @ [41:23] ==> public constructor FunctionVisitor() defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[ClassConstructorDescriptorImpl]

'function' @ [42:9] ==> public final val function: IrFunction defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'accept' @ [42:18] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<IrStatement?, Boolean>, data: Boolean): IrStatement? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> IrStatement?
    <D> -> Boolean

'visitor' @ [42:25] ==> val visitor: FunctionGenerator.FunctionVisitor defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.generate[LocalVariableDescriptor]

'builder' @ [43:16] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'build' @ [43:24] ==> public open fun build(): ControlFlowGraph defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'this' @ [48:95] ==> <this> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.process[ReceiverParameterDescriptorImpl]

'accept' @ [48:100] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<IrStatement?, Boolean>, data: Boolean): IrStatement? defined in org.jetbrains.kotlin.ir.IrElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> IrStatement?
    <D> -> Boolean

'this@FunctionVisitor' @ [48:107] ==> <this> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[LazyClassReceiverParameterDescriptor]

'includeSelf' @ [48:129] ==> value-parameter includeSelf: Boolean = ... defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.process[ValueParameterDescriptorImpl]

'data' @ [51:17] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitFunction[ValueParameterDescriptorImpl]

'builder' @ [52:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'add' @ [52:25] ==> public open fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'declaration' @ [52:29] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitFunction[ValueParameterDescriptorImpl]

'declaration' @ [54:26] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitFunction[ValueParameterDescriptorImpl]

'body' @ [54:38] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'process' @ [54:44] ==> private final inline fun <reified IE : IrElement> IrBody.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrBody

'if (data) declaration else null' @ [54:57] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrFunction?, elseBranch: IrFunction?): IrFunction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrFunction?

'data' @ [54:61] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitFunction[ValueParameterDescriptorImpl]

'declaration' @ [54:67] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitFunction[ValueParameterDescriptorImpl]

'result' @ [55:17] ==> val result: IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitFunction[LocalVariableDescriptor]

'!' @ [55:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [55:36] ==> val result: IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitFunction[LocalVariableDescriptor]

'isNothing' @ [55:43] ==> private final fun IrElement?.isNothing(): Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]

'builder' @ [56:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [56:25] ==> public open fun jump(to: IrStatement, from: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'exit' @ [56:30] ==> public final val exit: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'result' @ [56:43] ==> val result: IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitFunction[LocalVariableDescriptor]

'result' @ [58:20] ==> val result: IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitFunction[LocalVariableDescriptor]

'statements' @ [63:31] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrStatementContainer[DeserializedPropertyDescriptor]

'result' @ [64:17] ==> var result: IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.process[LocalVariableDescriptor]

'statement' @ [64:26] ==> val statement: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.process[LocalVariableDescriptor]

'process' @ [64:36] ==> private final inline fun <reified IE : IrElement> IrStatement.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrStatement

'result' @ [66:20] ==> var result: IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.process[LocalVariableDescriptor]

'this' @ [69:46] ==> <this> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.isNothing[ReceiverParameterDescriptorImpl]

'isNothing' @ [69:85] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [69:95] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'body' @ [72:20] ==> value-parameter body: IrBlockBody defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitBlockBody[ValueParameterDescriptorImpl]

'process' @ [72:25] ==> private final fun IrStatementContainer.process(): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [76:20] ==> value-parameter expression: IrContainerExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitContainerExpression[ValueParameterDescriptorImpl]

'process' @ [76:31] ==> private final fun IrStatementContainer.process(): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [76:44] ==> value-parameter expression: IrContainerExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitContainerExpression[ValueParameterDescriptorImpl]

'declaration' @ [80:13] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitVariable[ValueParameterDescriptorImpl]

'initializer' @ [80:25] ==> public abstract var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'process' @ [80:38] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'if (data) {
                builder.add(declaration)
                declaration
            }
            else null' @ [81:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrStatement?, elseBranch: IrStatement?): IrStatement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrStatement?

'data' @ [81:24] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitVariable[ValueParameterDescriptorImpl]

'builder' @ [82:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'add' @ [82:25] ==> public open fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'declaration' @ [82:29] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitVariable[ValueParameterDescriptorImpl]

'declaration' @ [83:17] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitVariable[ValueParameterDescriptorImpl]

'expression' @ [89:13] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitReturn[ValueParameterDescriptorImpl]

'value' @ [89:24] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'process' @ [89:30] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'data' @ [90:17] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitReturn[ValueParameterDescriptorImpl]

'builder' @ [91:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'add' @ [91:25] ==> public open fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [91:29] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitReturn[ValueParameterDescriptorImpl]

'builder' @ [93:13] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [93:21] ==> public open fun jump(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'exit' @ [93:26] ==> public final val exit: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'expression' @ [94:20] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitReturn[ValueParameterDescriptorImpl]

'body' @ [98:20] ==> value-parameter body: IrExpressionBody defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitExpressionBody[ValueParameterDescriptorImpl]

'expression' @ [98:25] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpressionBody[DeserializedPropertyDescriptor]

'process' @ [98:36] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'data' @ [102:17] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitExpression[ValueParameterDescriptorImpl]

'builder' @ [103:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'add' @ [103:25] ==> public open fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [103:29] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitExpression[ValueParameterDescriptorImpl]

'expression' @ [105:20] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitExpression[ValueParameterDescriptorImpl]

'data' @ [109:17] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[ValueParameterDescriptorImpl]

'builder' @ [110:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'add' @ [110:25] ==> public open fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [110:29] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[ValueParameterDescriptorImpl]

'MergeCfgElement' @ [112:28] ==> public constructor MergeCfgElement(from: IrElement, name: String) defined in org.jetbrains.kotlin.ir2cfg.nodes.MergeCfgElement[ClassConstructorDescriptorImpl]

'expression' @ [112:44] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[ValueParameterDescriptorImpl]

'expression' @ [113:28] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[ValueParameterDescriptorImpl]

'branches' @ [113:39] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.IrWhen[DeserializedPropertyDescriptor]

'branches' @ [114:28] ==> val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[LocalVariableDescriptor]

'branch' @ [115:33] ==> val branch: IrBranch defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[LocalVariableDescriptor]

'condition' @ [115:40] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'condition' @ [116:17] ==> val condition: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[LocalVariableDescriptor]

'process' @ [116:27] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'builder' @ [117:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [117:25] ==> public open fun jump(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'condition' @ [117:30] ==> val condition: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[LocalVariableDescriptor]

'branches' @ [119:28] ==> val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[LocalVariableDescriptor]

'branch' @ [120:30] ==> val branch: IrBranch defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[LocalVariableDescriptor]

'result' @ [120:37] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'builder' @ [121:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'move' @ [121:25] ==> public open fun move(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'branch' @ [121:30] ==> val branch: IrBranch defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[LocalVariableDescriptor]

'condition' @ [121:37] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'if (!result.process().isNothing()) {
                    builder.jump(whenExit)
                }
                else {
                    builder.move(branch.condition)
                }' @ [122:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [122:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [122:22] ==> val result: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[LocalVariableDescriptor]

'process' @ [122:29] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'isNothing' @ [122:39] ==> private final fun IrElement?.isNothing(): Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]

'builder' @ [123:21] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [123:29] ==> public open fun jump(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'whenExit' @ [123:34] ==> val whenExit: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[LocalVariableDescriptor]

'builder' @ [126:21] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'move' @ [126:29] ==> public open fun move(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'branch' @ [126:34] ==> val branch: IrBranch defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[LocalVariableDescriptor]

'condition' @ [126:41] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'whenExit' @ [129:20] ==> val whenExit: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhen[LocalVariableDescriptor]

'data' @ [133:17] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'builder' @ [134:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'add' @ [134:25] ==> public open fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'loop' @ [134:29] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'MergeCfgElement' @ [136:24] ==> public constructor MergeCfgElement(from: IrElement, name: String) defined in org.jetbrains.kotlin.ir2cfg.nodes.MergeCfgElement[ClassConstructorDescriptorImpl]

'loop' @ [136:40] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'loopExits' @ [137:13] ==> public final val loopExits: MutableMap<IrLoop, IrStatement> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'loop' @ [137:23] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'exit' @ [137:31] ==> val exit: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[LocalVariableDescriptor]

'MergeCfgElement' @ [138:25] ==> public constructor MergeCfgElement(from: IrElement, name: String) defined in org.jetbrains.kotlin.ir2cfg.nodes.MergeCfgElement[ClassConstructorDescriptorImpl]

'loop' @ [138:41] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'loopEntries' @ [139:13] ==> public final val loopEntries: MutableMap<IrLoop, IrStatement> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'loop' @ [139:25] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'entry' @ [139:33] ==> val entry: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[LocalVariableDescriptor]

'builder' @ [140:13] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [140:21] ==> public open fun jump(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'entry' @ [140:26] ==> val entry: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[LocalVariableDescriptor]

'loop' @ [141:29] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'condition' @ [141:34] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[DeserializedPropertyDescriptor]

'condition' @ [142:13] ==> val condition: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[LocalVariableDescriptor]

'process' @ [142:23] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'builder' @ [143:13] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [143:21] ==> public open fun jump(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'condition' @ [143:26] ==> val condition: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[LocalVariableDescriptor]

'loop' @ [144:24] ==> value-parameter loop: IrWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[ValueParameterDescriptorImpl]

'body' @ [144:29] ==> public abstract var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrWhileLoop[DeserializedPropertyDescriptor]

'!' @ [145:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'body' @ [145:18] ==> val body: IrExpression? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[LocalVariableDescriptor]

'process' @ [145:24] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'isNothing' @ [145:34] ==> private final fun IrElement?.isNothing(): Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]

'builder' @ [146:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [146:25] ==> public open fun jump(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'entry' @ [146:30] ==> val entry: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[LocalVariableDescriptor]

'builder' @ [148:13] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [148:21] ==> public open fun jump(to: IrStatement, from: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'exit' @ [148:26] ==> val exit: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[LocalVariableDescriptor]

'condition' @ [148:39] ==> val condition: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[LocalVariableDescriptor]

'exit' @ [149:20] ==> val exit: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitWhileLoop[LocalVariableDescriptor]

'data' @ [153:17] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'builder' @ [154:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'add' @ [154:25] ==> public open fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'loop' @ [154:29] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'MergeCfgElement' @ [156:24] ==> public constructor MergeCfgElement(from: IrElement, name: String) defined in org.jetbrains.kotlin.ir2cfg.nodes.MergeCfgElement[ClassConstructorDescriptorImpl]

'loop' @ [156:40] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'loopExits' @ [157:13] ==> public final val loopExits: MutableMap<IrLoop, IrStatement> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'loop' @ [157:23] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'exit' @ [157:31] ==> val exit: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'MergeCfgElement' @ [158:25] ==> public constructor MergeCfgElement(from: IrElement, name: String) defined in org.jetbrains.kotlin.ir2cfg.nodes.MergeCfgElement[ClassConstructorDescriptorImpl]

'loop' @ [158:41] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'loopEntries' @ [159:13] ==> public final val loopEntries: MutableMap<IrLoop, IrStatement> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'loop' @ [159:25] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'entry' @ [159:33] ==> val entry: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'builder' @ [160:13] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [160:21] ==> public open fun jump(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'entry' @ [160:26] ==> val entry: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'loop' @ [161:24] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'body' @ [161:29] ==> public abstract var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[DeserializedPropertyDescriptor]

'loop' @ [162:29] ==> value-parameter loop: IrDoWhileLoop defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[ValueParameterDescriptorImpl]

'condition' @ [162:34] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop[DeserializedPropertyDescriptor]

'!' @ [163:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'body' @ [163:18] ==> val body: IrExpression? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'process' @ [163:24] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'isNothing' @ [163:34] ==> private final fun IrElement?.isNothing(): Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [164:17] ==> val condition: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'process' @ [164:27] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'builder' @ [165:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [165:25] ==> public open fun jump(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'condition' @ [165:30] ==> val condition: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'builder' @ [166:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [166:25] ==> public open fun jump(to: IrStatement, from: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'entry' @ [166:30] ==> val entry: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'condition' @ [166:44] ==> val condition: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'builder' @ [167:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [167:25] ==> public open fun jump(to: IrStatement, from: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'exit' @ [167:30] ==> val exit: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'condition' @ [167:43] ==> val condition: IrExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'builder' @ [169:13] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'move' @ [169:21] ==> public open fun move(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'exit' @ [169:26] ==> val exit: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'exit' @ [170:20] ==> val exit: MergeCfgElement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitDoWhileLoop[LocalVariableDescriptor]

'data' @ [174:17] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitBreak[ValueParameterDescriptorImpl]

'builder' @ [175:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'add' @ [175:25] ==> public open fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'jump' @ [175:29] ==> value-parameter jump: IrBreak defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitBreak[ValueParameterDescriptorImpl]

'builder' @ [177:13] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [177:21] ==> public open fun jump(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'loopExits' @ [177:26] ==> public final val loopExits: MutableMap<IrLoop, IrStatement> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [177:36] ==> value-parameter jump: IrBreak defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitBreak[ValueParameterDescriptorImpl]

'loop' @ [177:41] ==> public abstract var loop: IrLoop defined in org.jetbrains.kotlin.ir.expressions.IrBreak[DeserializedPropertyDescriptor]

'AssertionError' @ [177:56] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'jump' @ [177:98] ==> value-parameter jump: IrBreak defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitBreak[ValueParameterDescriptorImpl]

'loop' @ [177:103] ==> public abstract var loop: IrLoop defined in org.jetbrains.kotlin.ir.expressions.IrBreak[DeserializedPropertyDescriptor]

'dump' @ [177:108] ==> public fun IrElement.dump(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'jump' @ [178:20] ==> value-parameter jump: IrBreak defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitBreak[ValueParameterDescriptorImpl]

'data' @ [182:17] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitContinue[ValueParameterDescriptorImpl]

'builder' @ [183:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'add' @ [183:25] ==> public open fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'jump' @ [183:29] ==> value-parameter jump: IrContinue defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitContinue[ValueParameterDescriptorImpl]

'builder' @ [185:13] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [185:21] ==> public open fun jump(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'loopEntries' @ [185:26] ==> public final val loopEntries: MutableMap<IrLoop, IrStatement> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'jump' @ [185:38] ==> value-parameter jump: IrContinue defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitContinue[ValueParameterDescriptorImpl]

'loop' @ [185:43] ==> public abstract var loop: IrLoop defined in org.jetbrains.kotlin.ir.expressions.IrContinue[DeserializedPropertyDescriptor]

'AssertionError' @ [185:58] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'jump' @ [185:101] ==> value-parameter jump: IrContinue defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitContinue[ValueParameterDescriptorImpl]

'loop' @ [185:106] ==> public abstract var loop: IrLoop defined in org.jetbrains.kotlin.ir.expressions.IrContinue[DeserializedPropertyDescriptor]

'dump' @ [185:111] ==> public fun IrElement.dump(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'jump' @ [186:20] ==> value-parameter jump: IrContinue defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitContinue[ValueParameterDescriptorImpl]

'expression' @ [190:13] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [190:24] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'process' @ [190:42] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'expression' @ [191:13] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'extensionReceiver' @ [191:24] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'process' @ [191:43] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'expression' @ [192:36] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'descriptor' @ [192:47] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'valueParameters' @ [192:58] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'expression' @ [193:17] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'getValueArgument' @ [193:28] ==> public fun IrMemberAccessExpression.getValueArgument(valueParameterDescriptor: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]

'valueParameter' @ [193:45] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitMemberAccess[LocalVariableDescriptor]

'process' @ [193:62] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'data' @ [195:17] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'builder' @ [196:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'add' @ [196:25] ==> public open fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [196:29] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'expression' @ [198:20] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitMemberAccess[ValueParameterDescriptorImpl]

'expression' @ [202:13] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'argument' @ [202:24] ==> public abstract var argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'process' @ [202:33] ==> private final inline fun <reified IE : IrElement> IrExpression.process(includeSelf: Boolean = ...): IrStatement? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified IE : IrElement> -> IrExpression

'data' @ [203:17] ==> value-parameter data: Boolean defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'builder' @ [204:17] ==> public final val builder: FunctionBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator[PropertyDescriptorImpl]

'add' @ [204:25] ==> public open fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [204:29] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'expression' @ [206:20] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionGenerator.FunctionVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'TODO' @ [210:13] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

