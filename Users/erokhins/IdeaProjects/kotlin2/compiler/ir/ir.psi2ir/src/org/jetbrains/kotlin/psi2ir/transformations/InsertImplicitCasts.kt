'element' @ [40:5] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.psi2ir.transformations.insertImplicitCasts[ValueParameterDescriptorImpl]

'transformChildren' @ [40:13] ==> public abstract fun <D> transformChildren(transformer: IrElementTransformer<Nothing?>, data: Nothing?): Unit defined in org.jetbrains.kotlin.ir.IrElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> Nothing?

'InsertImplicitCasts' @ [40:31] ==> public constructor InsertImplicitCasts(builtIns: KotlinBuiltIns) defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[ClassConstructorDescriptorImpl]

'builtIns' @ [40:51] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.transformations.insertImplicitCasts[ValueParameterDescriptorImpl]

'IrElementTransformerVoid' @ [43:58] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'expression' @ [45:9] ==> value-parameter expression: IrCallableReference defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitCallableReference[ValueParameterDescriptorImpl]

'transformPostfix' @ [45:20] ==> protected final inline fun <T : IrElement> IrCallableReference.transformPostfix(body: IrCallableReference.() -> Unit): IrCallableReference defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrCallableReference

'transformReceiverArguments' @ [46:13] ==> private final fun IrMemberAccessExpression.transformReceiverArguments(): Unit defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'dispatchReceiver' @ [50:9] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'dispatchReceiver' @ [50:28] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'cast' @ [50:46] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'descriptor' @ [50:51] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'dispatchReceiverParameter' @ [50:62] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [50:89] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'extensionReceiver' @ [51:9] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'extensionReceiver' @ [51:29] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'cast' @ [51:48] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'descriptor' @ [51:53] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'extensionReceiverParameter' @ [51:64] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [51:92] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'expression' @ [55:13] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitMemberAccess[ValueParameterDescriptorImpl]

'transformPostfix' @ [55:24] ==> protected final inline fun <T : IrElement> IrMemberAccessExpression.transformPostfix(body: IrMemberAccessExpression.() -> Unit): IrMemberAccessExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrMemberAccessExpression

'transformReceiverArguments' @ [56:17] ==> private final fun IrMemberAccessExpression.transformReceiverArguments(): Unit defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'descriptor' @ [57:31] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'valueParameters' @ [57:42] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'indices' @ [57:58] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'getValueArgument' @ [58:36] ==> public abstract fun getValueArgument(index: Int): IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedSimpleFunctionDescriptor]

'index' @ [58:53] ==> val index: Int defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitMemberAccess.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [59:41] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'valueParameters' @ [59:52] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'index' @ [59:68] ==> val index: Int defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitMemberAccess.<anonymous>[LocalVariableDescriptor]

'type' @ [59:75] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'putValueArgument' @ [60:21] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedSimpleFunctionDescriptor]

'index' @ [60:38] ==> val index: Int defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitMemberAccess.<anonymous>[LocalVariableDescriptor]

'argument' @ [60:45] ==> val argument: IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitMemberAccess.<anonymous>[LocalVariableDescriptor]

'cast' @ [60:54] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'parameterType' @ [60:59] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitMemberAccess.<anonymous>[LocalVariableDescriptor]

'body' @ [65:13] ==> value-parameter body: IrBlockBody defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitBlockBody[ValueParameterDescriptorImpl]

'transformPostfix' @ [65:18] ==> protected final inline fun <T : IrElement> IrBlockBody.transformPostfix(body: IrBlockBody.() -> Unit): IrBlockBody defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrBlockBody

'statements' @ [66:17] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[DeserializedPropertyDescriptor]

'forEachIndexed' @ [66:28] ==> public inline fun <T> Iterable<IrStatement>.forEachIndexed(action: (index: Int, IrStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'irStatement' @ [67:25] ==> value-parameter irStatement: IrStatement defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitBlockBody.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [68:25] ==> value-parameter body: IrBlockBody defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitBlockBody[ValueParameterDescriptorImpl]

'statements' @ [68:30] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[DeserializedPropertyDescriptor]

'i' @ [68:41] ==> value-parameter i: Int defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitBlockBody.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'irStatement' @ [68:46] ==> value-parameter irStatement: IrStatement defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitBlockBody.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'coerceToUnit' @ [68:58] ==> private final fun IrExpression.coerceToUnit(): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'expression' @ [74:13] ==> value-parameter expression: IrContainerExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitContainerExpression[ValueParameterDescriptorImpl]

'transformPostfix' @ [74:24] ==> protected final inline fun <T : IrElement> IrContainerExpression.transformPostfix(body: IrContainerExpression.() -> Unit): IrContainerExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrContainerExpression

'statements' @ [75:21] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrContainerExpression[DeserializedPropertyDescriptor]

'isEmpty' @ [75:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'this' @ [75:50] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitContainerExpression.<anonymous>[ReceiverParameterDescriptorImpl]

'statements' @ [77:33] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrContainerExpression[DeserializedPropertyDescriptor]

'lastIndex' @ [77:44] ==> public val <T> List<IrStatement>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IrStatement

'statements' @ [78:17] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrContainerExpression[DeserializedPropertyDescriptor]

'forEachIndexed' @ [78:28] ==> public inline fun <T> Iterable<IrStatement>.forEachIndexed(action: (index: Int, IrStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'irStatement' @ [79:25] ==> value-parameter irStatement: IrStatement defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitContainerExpression.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'statements' @ [80:25] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrContainerExpression[DeserializedPropertyDescriptor]

'i' @ [80:36] ==> value-parameter i: Int defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitContainerExpression.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (i == lastIndex)
                                    irStatement.cast(type)
                                else
                                    irStatement.coerceToUnit()' @ [81:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'i' @ [81:37] ==> value-parameter i: Int defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitContainerExpression.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lastIndex' @ [81:42] ==> val lastIndex: Int defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitContainerExpression.<anonymous>[LocalVariableDescriptor]

'irStatement' @ [82:37] ==> value-parameter irStatement: IrStatement defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitContainerExpression.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'cast' @ [82:49] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'type' @ [82:54] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrContainerExpression[DeserializedPropertyDescriptor]

'irStatement' @ [84:37] ==> value-parameter irStatement: IrStatement defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitContainerExpression.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'coerceToUnit' @ [84:49] ==> private final fun IrExpression.coerceToUnit(): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'expression' @ [90:13] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitReturn[ValueParameterDescriptorImpl]

'transformPostfix' @ [90:24] ==> protected final inline fun <T : IrElement> IrReturn.transformPostfix(body: IrReturn.() -> Unit): IrReturn defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrReturn

'value' @ [91:17] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'value' @ [91:25] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'cast' @ [91:31] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'expression' @ [91:36] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitReturn[ValueParameterDescriptorImpl]

'returnTarget' @ [91:47] ==> public abstract val returnTarget: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'returnType' @ [91:60] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'expression' @ [95:13] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitSetVariable[ValueParameterDescriptorImpl]

'transformPostfix' @ [95:24] ==> protected final inline fun <T : IrElement> IrSetVariable.transformPostfix(body: IrSetVariable.() -> Unit): IrSetVariable defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrSetVariable

'value' @ [96:17] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[DeserializedPropertyDescriptor]

'value' @ [96:25] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[DeserializedPropertyDescriptor]

'cast' @ [96:31] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'expression' @ [96:36] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitSetVariable[ValueParameterDescriptorImpl]

'descriptor' @ [96:47] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrSetVariable[DeserializedPropertyDescriptor]

'type' @ [96:58] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'expression' @ [100:13] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitSetField[ValueParameterDescriptorImpl]

'transformPostfix' @ [100:24] ==> protected final inline fun <T : IrElement> IrSetField.transformPostfix(body: IrSetField.() -> Unit): IrSetField defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrSetField

'value' @ [101:17] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSetField[DeserializedPropertyDescriptor]

'value' @ [101:25] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSetField[DeserializedPropertyDescriptor]

'cast' @ [101:31] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'expression' @ [101:36] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitSetField[ValueParameterDescriptorImpl]

'descriptor' @ [101:47] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrSetField[DeserializedPropertyDescriptor]

'type' @ [101:58] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'declaration' @ [105:13] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitVariable[ValueParameterDescriptorImpl]

'transformPostfix' @ [105:25] ==> protected final inline fun <T : IrElement> IrVariable.transformPostfix(body: IrVariable.() -> Unit): IrVariable defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrVariable

'initializer' @ [106:17] ==> public abstract var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'initializer' @ [106:31] ==> public abstract var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'cast' @ [106:44] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'declaration' @ [106:49] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitVariable[ValueParameterDescriptorImpl]

'descriptor' @ [106:61] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'type' @ [106:72] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'declaration' @ [110:13] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitField[ValueParameterDescriptorImpl]

'transformPostfix' @ [110:25] ==> protected final inline fun <T : IrElement> IrField.transformPostfix(body: IrField.() -> Unit): IrField defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrField

'initializer' @ [111:17] ==> public abstract var initializer: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'coerceInnerExpression' @ [111:30] ==> private final fun IrExpressionBody.coerceInnerExpression(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'descriptor' @ [111:52] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'type' @ [111:63] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'declaration' @ [115:13] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitFunction[ValueParameterDescriptorImpl]

'transformPostfix' @ [115:25] ==> protected final inline fun <T : IrElement> IrFunction.transformPostfix(body: IrFunction.() -> Unit): IrFunction defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrFunction

'valueParameters' @ [116:17] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'forEach' @ [116:33] ==> @HidesMembers public inline fun <T> Iterable<IrValueParameter>.forEach(action: (IrValueParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'it' @ [117:21] ==> value-parameter it: IrValueParameter defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'defaultValue' @ [117:24] ==> public abstract var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'coerceInnerExpression' @ [117:38] ==> private final fun IrExpressionBody.coerceInnerExpression(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'it' @ [117:60] ==> value-parameter it: IrValueParameter defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [117:63] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'type' @ [117:74] ==> public final val ParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'expression' @ [122:13] ==> value-parameter expression: IrWhen defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitWhen[ValueParameterDescriptorImpl]

'transformPostfix' @ [122:24] ==> protected final inline fun <T : IrElement> IrWhen.transformPostfix(body: IrWhen.() -> Unit): IrWhen defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrWhen

'branches' @ [123:34] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.IrWhen[DeserializedPropertyDescriptor]

'irBranch' @ [124:21] ==> val irBranch: IrBranch defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitWhen.<anonymous>[LocalVariableDescriptor]

'condition' @ [124:30] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'irBranch' @ [124:42] ==> val irBranch: IrBranch defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitWhen.<anonymous>[LocalVariableDescriptor]

'condition' @ [124:51] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'cast' @ [124:61] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'builtIns' @ [124:66] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[PropertyDescriptorImpl]

'booleanType' @ [124:75] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'irBranch' @ [125:21] ==> val irBranch: IrBranch defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitWhen.<anonymous>[LocalVariableDescriptor]

'result' @ [125:30] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'irBranch' @ [125:39] ==> val irBranch: IrBranch defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitWhen.<anonymous>[LocalVariableDescriptor]

'result' @ [125:48] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'cast' @ [125:55] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'type' @ [125:60] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrWhen[DeserializedPropertyDescriptor]

'loop' @ [130:13] ==> value-parameter loop: IrLoop defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitLoop[ValueParameterDescriptorImpl]

'transformPostfix' @ [130:18] ==> protected final inline fun <T : IrElement> IrLoop.transformPostfix(body: IrLoop.() -> Unit): IrLoop defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrLoop

'condition' @ [131:17] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrLoop[DeserializedPropertyDescriptor]

'condition' @ [131:29] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrLoop[DeserializedPropertyDescriptor]

'cast' @ [131:39] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'builtIns' @ [131:44] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[PropertyDescriptorImpl]

'booleanType' @ [131:53] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'body' @ [132:17] ==> public abstract var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrLoop[DeserializedPropertyDescriptor]

'body' @ [132:24] ==> public abstract var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrLoop[DeserializedPropertyDescriptor]

'coerceToUnit' @ [132:30] ==> private final fun IrExpression.coerceToUnit(): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'expression' @ [136:13] ==> value-parameter expression: IrThrow defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitThrow[ValueParameterDescriptorImpl]

'transformPostfix' @ [136:24] ==> protected final inline fun <T : IrElement> IrThrow.transformPostfix(body: IrThrow.() -> Unit): IrThrow defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrThrow

'value' @ [137:17] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrThrow[DeserializedPropertyDescriptor]

'value' @ [137:25] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrThrow[DeserializedPropertyDescriptor]

'cast' @ [137:31] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'builtIns' @ [137:36] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[PropertyDescriptorImpl]

'throwable' @ [137:45] ==> public final val KotlinBuiltIns.throwable: ClassDescriptor[MyPropertyDescriptor]

'defaultType' @ [137:55] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'aTry' @ [141:13] ==> value-parameter aTry: IrTry defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitTry[ValueParameterDescriptorImpl]

'transformPostfix' @ [141:18] ==> protected final inline fun <T : IrElement> IrTry.transformPostfix(body: IrTry.() -> Unit): IrTry defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrTry

'tryResult' @ [142:17] ==> public abstract var tryResult: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTry[DeserializedPropertyDescriptor]

'tryResult' @ [142:29] ==> public abstract var tryResult: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrTry[DeserializedPropertyDescriptor]

'cast' @ [142:39] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'type' @ [142:44] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTry[DeserializedPropertyDescriptor]

'catches' @ [144:32] ==> public abstract val catches: List<IrCatch> defined in org.jetbrains.kotlin.ir.expressions.IrTry[DeserializedPropertyDescriptor]

'aCatch' @ [145:21] ==> val aCatch: IrCatch defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitTry.<anonymous>[LocalVariableDescriptor]

'result' @ [145:28] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrCatch[DeserializedPropertyDescriptor]

'aCatch' @ [145:37] ==> val aCatch: IrCatch defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitTry.<anonymous>[LocalVariableDescriptor]

'result' @ [145:44] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrCatch[DeserializedPropertyDescriptor]

'cast' @ [145:51] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'type' @ [145:56] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTry[DeserializedPropertyDescriptor]

'finallyExpression' @ [148:17] ==> public abstract var finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrTry[DeserializedPropertyDescriptor]

'finallyExpression' @ [148:37] ==> public abstract var finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrTry[DeserializedPropertyDescriptor]

'coerceToUnit' @ [148:56] ==> private final fun IrExpression.coerceToUnit(): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'expression' @ [152:13] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitVararg[ValueParameterDescriptorImpl]

'transformPostfix' @ [152:24] ==> protected final inline fun <T : IrElement> IrVararg.transformPostfix(body: IrVararg.() -> Unit): IrVararg defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrVararg

'elements' @ [153:17] ==> public abstract val elements: List<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'forEachIndexed' @ [153:26] ==> public inline fun <T> Iterable<IrVarargElement>.forEachIndexed(action: (index: Int, IrVarargElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVarargElement

'when (element) {
                        is IrSpreadElement ->
                            element.expression = element.expression.cast(expression.type)
                        is IrExpression ->
                            putElement(i, element.cast(varargElementType))
                    }' @ [154:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [154:27] ==> value-parameter element: IrVarargElement defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [156:29] ==> value-parameter element: IrVarargElement defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [156:37] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSpreadElement[DeserializedPropertyDescriptor]

'element' @ [156:50] ==> value-parameter element: IrVarargElement defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [156:58] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSpreadElement[DeserializedPropertyDescriptor]

'cast' @ [156:69] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'expression' @ [156:74] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitVararg[ValueParameterDescriptorImpl]

'type' @ [156:85] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'putElement' @ [158:29] ==> public abstract fun putElement(i: Int, element: IrVarargElement): Unit defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedSimpleFunctionDescriptor]

'i' @ [158:40] ==> value-parameter i: Int defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [158:43] ==> value-parameter element: IrVarargElement defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'cast' @ [158:51] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'varargElementType' @ [158:56] ==> public abstract val varargElementType: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'expression' @ [164:9] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpressionBody[DeserializedPropertyDescriptor]

'expression' @ [164:22] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpressionBody[DeserializedPropertyDescriptor]

'cast' @ [164:33] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'expectedType' @ [164:38] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.coerceInnerExpression[ValueParameterDescriptorImpl]

'expectedType' @ [168:13] ==> value-parameter expectedType: KotlinType? defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ValueParameterDescriptorImpl]

'this' @ [168:42] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ReceiverParameterDescriptorImpl]

'expectedType' @ [169:13] ==> value-parameter expectedType: KotlinType? defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ValueParameterDescriptorImpl]

'isError' @ [169:26] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'this' @ [169:42] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ReceiverParameterDescriptorImpl]

'expectedType' @ [171:39] ==> value-parameter expectedType: KotlinType? defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ValueParameterDescriptorImpl]

'makeNotNullable' @ [171:52] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'this' @ [173:25] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ReceiverParameterDescriptorImpl]

'type' @ [173:30] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'when {
            KotlinBuiltIns.isUnit(expectedType) ->
                coerceToUnit()
            valueType.isNullabilityFlexible() && valueType.containsNull() && !expectedType.containsNull() -> {
                val nonNullValueType = valueType.upperIfFlexible().makeNotNullable()
                IrTypeOperatorCallImpl(
                        startOffset, endOffset, nonNullValueType,
                        IrTypeOperator.IMPLICIT_NOTNULL, nonNullValueType, this
                ).cast(expectedType)
            }
            KotlinTypeChecker.DEFAULT.isSubtypeOf(valueType.makeNotNullable(), expectedType) ->
                this
            KotlinBuiltIns.isInt(valueType) && notNullableExpectedType.isBuiltInIntegerType() ->
                IrTypeOperatorCallImpl(startOffset, endOffset, notNullableExpectedType,
                                       IrTypeOperator.IMPLICIT_INTEGER_COERCION, notNullableExpectedType, this)
            else ->
                IrTypeOperatorCallImpl(startOffset, endOffset, expectedType,
                                       IrTypeOperator.IMPLICIT_CAST, expectedType, this)
        }' @ [175:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression, entry3: IrExpression, entry4: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'isUnit' @ [176:28] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expectedType' @ [176:35] ==> value-parameter expectedType: KotlinType? defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ValueParameterDescriptorImpl]

'coerceToUnit' @ [177:17] ==> private final fun IrExpression.coerceToUnit(): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'valueType' @ [178:13] ==> val valueType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[LocalVariableDescriptor]

'isNullabilityFlexible' @ [178:23] ==> public fun KotlinType.isNullabilityFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'valueType' @ [178:50] ==> val valueType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[LocalVariableDescriptor]

'containsNull' @ [178:60] ==> public fun KotlinType.containsNull(): Boolean defined in org.jetbrains.kotlin.psi2ir[SimpleFunctionDescriptorImpl]

'!' @ [178:78] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [178:79] ==> value-parameter expectedType: KotlinType? defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ValueParameterDescriptorImpl]

'containsNull' @ [178:92] ==> public fun KotlinType.containsNull(): Boolean defined in org.jetbrains.kotlin.psi2ir[SimpleFunctionDescriptorImpl]

'valueType' @ [179:40] ==> val valueType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[LocalVariableDescriptor]

'upperIfFlexible' @ [179:50] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'makeNotNullable' @ [179:68] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'IrTypeOperatorCallImpl' @ [180:17] ==> public constructor IrTypeOperatorCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, operator: IrTypeOperator, typeOperand: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTypeOperatorCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [181:25] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'endOffset' @ [181:38] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'nonNullValueType' @ [181:49] ==> val nonNullValueType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[LocalVariableDescriptor]

'IMPLICIT_NOTNULL' @ [182:40] ==> enum entry IMPLICIT_NOTNULL defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'nonNullValueType' @ [182:58] ==> val nonNullValueType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[LocalVariableDescriptor]

'this' @ [182:76] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ReceiverParameterDescriptorImpl]

'cast' @ [183:19] ==> private final fun IrExpression.cast(expectedType: KotlinType?): IrExpression defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'expectedType' @ [183:24] ==> value-parameter expectedType: KotlinType? defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ValueParameterDescriptorImpl]

'DEFAULT' @ [185:31] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [185:39] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'valueType' @ [185:51] ==> val valueType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[LocalVariableDescriptor]

'makeNotNullable' @ [185:61] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [185:80] ==> value-parameter expectedType: KotlinType? defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ValueParameterDescriptorImpl]

'this' @ [186:17] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ReceiverParameterDescriptorImpl]

'isInt' @ [187:28] ==> public open fun isInt(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'valueType' @ [187:34] ==> val valueType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[LocalVariableDescriptor]

'notNullableExpectedType' @ [187:48] ==> val notNullableExpectedType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[LocalVariableDescriptor]

'isBuiltInIntegerType' @ [187:72] ==> private final fun KotlinType.isBuiltInIntegerType(): Boolean defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[SimpleFunctionDescriptorImpl]

'IrTypeOperatorCallImpl' @ [188:17] ==> public constructor IrTypeOperatorCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, operator: IrTypeOperator, typeOperand: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTypeOperatorCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [188:40] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'endOffset' @ [188:53] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'notNullableExpectedType' @ [188:64] ==> val notNullableExpectedType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[LocalVariableDescriptor]

'IMPLICIT_INTEGER_COERCION' @ [189:55] ==> enum entry IMPLICIT_INTEGER_COERCION defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'notNullableExpectedType' @ [189:82] ==> val notNullableExpectedType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[LocalVariableDescriptor]

'this' @ [189:107] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ReceiverParameterDescriptorImpl]

'IrTypeOperatorCallImpl' @ [191:17] ==> public constructor IrTypeOperatorCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, operator: IrTypeOperator, typeOperand: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTypeOperatorCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [191:40] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'endOffset' @ [191:53] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'expectedType' @ [191:64] ==> value-parameter expectedType: KotlinType? defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ValueParameterDescriptorImpl]

'IMPLICIT_CAST' @ [192:55] ==> enum entry IMPLICIT_CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'expectedType' @ [192:70] ==> value-parameter expectedType: KotlinType? defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ValueParameterDescriptorImpl]

'this' @ [192:84] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.cast[ReceiverParameterDescriptorImpl]

'this' @ [197:25] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.coerceToUnit[ReceiverParameterDescriptorImpl]

'type' @ [197:30] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'if (KotlinTypeChecker.DEFAULT.isSubtypeOf(valueType, builtIns.unitType))
            this
        else
            IrTypeOperatorCallImpl(startOffset, endOffset, builtIns.unitType,
                                   IrTypeOperator.IMPLICIT_COERCION_TO_UNIT, builtIns.unitType, this)' @ [199:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'DEFAULT' @ [199:38] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [199:46] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'valueType' @ [199:58] ==> val valueType: KotlinType defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.coerceToUnit[LocalVariableDescriptor]

'builtIns' @ [199:69] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[PropertyDescriptorImpl]

'unitType' @ [199:78] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'this' @ [200:13] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.coerceToUnit[ReceiverParameterDescriptorImpl]

'IrTypeOperatorCallImpl' @ [202:13] ==> public constructor IrTypeOperatorCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, operator: IrTypeOperator, typeOperand: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTypeOperatorCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [202:36] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'endOffset' @ [202:49] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'builtIns' @ [202:60] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[PropertyDescriptorImpl]

'unitType' @ [202:69] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'IMPLICIT_COERCION_TO_UNIT' @ [203:51] ==> enum entry IMPLICIT_COERCION_TO_UNIT defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'builtIns' @ [203:78] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts[PropertyDescriptorImpl]

'unitType' @ [203:87] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'this' @ [203:97] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.coerceToUnit[ReceiverParameterDescriptorImpl]

'isByte' @ [207:28] ==> public open fun isByte(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [207:35] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.isBuiltInIntegerType[ReceiverParameterDescriptorImpl]

'isShort' @ [208:28] ==> public open fun isShort(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [208:36] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.isBuiltInIntegerType[ReceiverParameterDescriptorImpl]

'isInt' @ [209:28] ==> public open fun isInt(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [209:34] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.isBuiltInIntegerType[ReceiverParameterDescriptorImpl]

'isLong' @ [210:28] ==> public open fun isLong(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [210:35] ==> <this> defined in org.jetbrains.kotlin.psi2ir.transformations.InsertImplicitCasts.isBuiltInIntegerType[ReceiverParameterDescriptorImpl]

