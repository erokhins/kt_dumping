'irDeclarationContainer' @ [54:9] ==> value-parameter irDeclarationContainer: IrDeclarationContainer defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'declarations' @ [54:32] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer[DeserializedPropertyDescriptor]

'transformFlat' @ [54:45] ==> public inline fun <T> MutableList<IrDeclaration>.transformFlat(transformation: (IrDeclaration) -> List<IrDeclaration>?): Unit defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'if (memberDeclaration is IrFunction)
                lower(memberDeclaration)
            else
                null' @ [55:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<IrDeclaration>?, elseBranch: List<IrDeclaration>?): List<IrDeclaration>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<IrDeclaration>?

'memberDeclaration' @ [55:17] ==> value-parameter memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[ValueParameterDescriptorImpl]

'lower' @ [56:17] ==> private final fun lower(irFunction: IrFunction): List<IrFunction> defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator[SimpleFunctionDescriptorImpl]

'memberDeclaration' @ [56:23] ==> value-parameter memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [63:27] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator[PropertyDescriptorImpl]

'ir' @ [63:35] ==> public abstract val ir: Ir<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'symbols' @ [63:38] ==> public abstract val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.ir.Ir[PropertyDescriptorImpl]

'irFunction' @ [66:34] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'descriptor' @ [66:45] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'!' @ [68:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [68:14] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'needsDefaultArgumentsLowering' @ [68:33] ==> private val CallableMemberDescriptor.needsDefaultArgumentsLowering: Boolean defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[PropertyDescriptorImpl]

'listOf' @ [69:20] ==> public fun <T> listOf(element: IrFunction): List<IrFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunction

'irFunction' @ [69:27] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'functionDescriptor' @ [71:22] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'valueParameters' @ [71:41] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'mapNotNull' @ [72:18] ==> public inline fun <T, R : Any> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.mapNotNull(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> IrExpressionBody?): List<IrExpressionBody> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R : Any> -> IrExpressionBody

'irFunction' @ [72:29] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'getDefault' @ [72:40] ==> public fun IrFunction.getDefault(parameter: ValueParameterDescriptor): IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'it' @ [72:51] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [75:9] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [75:25] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'name' @ [75:44] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [75:49] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'bodies' @ [75:72] ==> val bodies: List<IrExpressionBody> defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'size' @ [75:79] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'functionDescriptor' @ [76:9] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'overriddenDescriptors' @ [76:28] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'forEach' @ [76:50] ==> @HidesMembers public inline fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.forEach(action: ((FunctionDescriptor..FunctionDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'context' @ [76:60] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator[PropertyDescriptorImpl]

'log' @ [76:68] ==> public abstract fun log(message: () -> String): Unit defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[SimpleFunctionDescriptorImpl]

'it' @ [76:92] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[ValueParameterDescriptorImpl]

'bodies' @ [77:13] ==> val bodies: List<IrExpressionBody> defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'isNotEmpty' @ [77:20] ==> @InlineOnly public inline fun <T> Collection<IrExpressionBody>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpressionBody

'functionDescriptor' @ [78:33] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'generateDefaultsFunction' @ [78:52] ==> private fun FunctionDescriptor.generateDefaultsFunction(context: CommonBackendContext): IrFunction defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'context' @ [78:77] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator[PropertyDescriptorImpl]

'newIrFunction' @ [79:30] ==> val newIrFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'descriptor' @ [79:44] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'log' @ [80:13] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [80:19] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'descriptor' @ [80:42] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'context' @ [81:27] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator[PropertyDescriptorImpl]

'createIrBuilder' @ [81:35] ==> public fun BackendContext.createIrBuilder(symbol: IrSymbol, startOffset: Int = ..., endOffset: Int = ...): DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower in file LowerUtils.kt[SimpleFunctionDescriptorImpl]

'newIrFunction' @ [81:51] ==> val newIrFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'symbol' @ [81:65] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'builder' @ [82:24] ==> val builder: DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'irBlockBody' @ [82:32] ==> public inline fun IrGeneratorWithScope.irBlockBody(irElement: IrElement, body: IrBlockBodyBuilder.() -> Unit): IrBlockBody defined in org.jetbrains.kotlin.backend.common.lower in file LowerUtils.kt[SimpleFunctionDescriptorImpl]

'irFunction' @ [82:44] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'mutableListOf' @ [83:30] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<IrVariableSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVariableSymbol

'mutableMapOf' @ [84:33] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<ValueDescriptor, IrValueSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueDescriptor
    <V> -> IrValueSymbol

'descriptor' @ [85:21] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'extensionReceiverParameter' @ [85:32] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'variables' @ [86:21] ==> val variables: MutableMap<ValueDescriptor, IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'functionDescriptor' @ [86:31] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'extensionReceiverParameter' @ [86:50] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'newIrFunction' @ [87:29] ==> val newIrFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'extensionReceiverParameter' @ [87:43] ==> public abstract var extensionReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'symbol' @ [87:72] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'functionDescriptor' @ [90:40] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'valueParameters' @ [90:59] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'newIrFunction' @ [91:43] ==> val newIrFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'valueParameters' @ [91:57] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'valueParameter' @ [91:73] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'index' @ [91:88] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'symbol' @ [91:95] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'IrVariableSymbolImpl' @ [93:29] ==> public constructor IrVariableSymbolImpl(descriptor: VariableDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrVariableSymbolImpl[DeserializedClassConstructorDescriptor]

'scope' @ [93:50] ==> public open val scope: Scope defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedPropertyDescriptor]

'createTemporaryVariableDescriptor' @ [93:56] ==> private fun Scope.createTemporaryVariableDescriptor(parameterDescriptor: ParameterDescriptor?): VariableDescriptor defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'parameterSymbol' @ [93:90] ==> val parameterSymbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [93:106] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol[DeserializedPropertyDescriptor]

'params' @ [94:21] ==> val params: MutableList<IrVariableSymbol> defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'add' @ [94:28] ==> public abstract fun add(element: IrVariableSymbol): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'temporaryVariableSymbol' @ [94:32] ==> val temporaryVariableSymbol: IrVariableSymbolImpl defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'variables' @ [95:21] ==> val variables: MutableMap<ValueDescriptor, IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'put' @ [95:31] ==> public abstract fun put(key: ValueDescriptor, value: IrValueSymbol): IrValueSymbol? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'valueParameter' @ [95:35] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'temporaryVariableSymbol' @ [95:51] ==> val temporaryVariableSymbol: IrVariableSymbolImpl defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'if (valueParameter.hasDefaultValue()) {
                        val kIntAnd = symbols.intAnd
                        val condition = irNotEquals(irCall(kIntAnd).apply {
                            dispatchReceiver = irGet(maskParameterSymbol(newIrFunction, valueParameter.index / 32))
                            putValueArgument(0, irInt(1 shl (valueParameter.index % 32)))
                        }, irInt(0))
                        val expressionBody = getDefaultParameterExpressionBody(irFunction, valueParameter)

                        /* Use previously calculated values in next expression. */
                        expressionBody.transformChildrenVoid(object:IrElementTransformerVoid() {
                            override fun visitGetValue(expression: IrGetValue): IrExpression {
                                log("GetValue: ${expression.descriptor}")
                                val valueSymbol = variables[expression.descriptor] ?: return expression
                                return irGet(valueSymbol)
                            }
                        })
                        val variableInitialization = irIfThenElse(
                                type      = temporaryVariableSymbol.descriptor.type,
                                condition = condition,
                                thenPart  = expressionBody.expression,
                                elsePart  = irGet(parameterSymbol))
                        + scope.createTemporaryVariable(
                                symbol  = temporaryVariableSymbol,
                                initializer = variableInitialization)
                        /* Mapping calculated values with its origin variables. */
                    } else {
                        + scope.createTemporaryVariable(
                                symbol  = temporaryVariableSymbol,
                                initializer = irGet(parameterSymbol))
                    }' @ [96:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'valueParameter' @ [96:25] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'hasDefaultValue' @ [96:40] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'symbols' @ [97:39] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator[PropertyDescriptorImpl]

'intAnd' @ [97:47] ==> public final val intAnd: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'irNotEquals' @ [98:41] ==> public fun IrBuilderWithScope.irNotEquals(arg1: IrExpression, arg2: IrExpression): IrExpression defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irCall' @ [98:53] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'kIntAnd' @ [98:60] ==> val kIntAnd: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'apply' @ [98:69] ==> @InlineOnly public inline fun <T> IrCall.apply(block: IrCall.() -> Unit): IrCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'dispatchReceiver' @ [99:29] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'irGet' @ [99:48] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'maskParameterSymbol' @ [99:54] ==> private fun maskParameterSymbol(function: IrFunction, number: Int): IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'newIrFunction' @ [99:74] ==> val newIrFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'valueParameter' @ [99:89] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'index' @ [99:104] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'putValueArgument' @ [100:29] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'irInt' @ [100:49] ==> public fun IrBuilderWithScope.irInt(value: Int): IrConstImpl<Int> defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'shl' @ [100:55] ==> public final infix fun shl(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'valueParameter' @ [100:62] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'index' @ [100:77] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'irInt' @ [101:28] ==> public fun IrBuilderWithScope.irInt(value: Int): IrConstImpl<Int> defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'getDefaultParameterExpressionBody' @ [102:46] ==> private fun getDefaultParameterExpressionBody(irFunction: IrFunction, valueParameter: ValueParameterDescriptor): IrExpressionBody defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'irFunction' @ [102:80] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'valueParameter' @ [102:92] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'expressionBody' @ [105:25] ==> val expressionBody: IrExpressionBody defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'transformChildrenVoid' @ [105:40] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'IrElementTransformerVoid' @ [105:69] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'log' @ [107:33] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [107:50] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'descriptor' @ [107:61] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'variables' @ [108:51] ==> val variables: MutableMap<ValueDescriptor, IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'expression' @ [108:61] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'descriptor' @ [108:72] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [108:94] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'irGet' @ [109:40] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'valueSymbol' @ [109:46] ==> val valueSymbol: IrValueSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>.<no name provided>.visitGetValue[LocalVariableDescriptor]

'irIfThenElse' @ [112:54] ==> public fun IrBuilderWithScope.irIfThenElse(type: KotlinType, condition: IrExpression, thenPart: IrExpression, elsePart: IrExpression): IrIfThenElseImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'temporaryVariableSymbol' @ [113:45] ==> val temporaryVariableSymbol: IrVariableSymbolImpl defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [113:69] ==> public open val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrVariableSymbolImpl[DeserializedPropertyDescriptor]

'type' @ [113:80] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'condition' @ [114:45] ==> val condition: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'expressionBody' @ [115:45] ==> val expressionBody: IrExpressionBody defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'expression' @ [115:60] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpressionBody[DeserializedPropertyDescriptor]

'irGet' @ [116:45] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'parameterSymbol' @ [116:51] ==> val parameterSymbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'+' @ [117:25] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedSimpleFunctionDescriptor]

'scope' @ [117:27] ==> public open val scope: Scope defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedPropertyDescriptor]

'createTemporaryVariable' @ [117:33] ==> private fun Scope.createTemporaryVariable(symbol: IrVariableSymbol, initializer: IrExpression): IrVariableImpl defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'temporaryVariableSymbol' @ [118:43] ==> val temporaryVariableSymbol: IrVariableSymbolImpl defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'variableInitialization' @ [119:47] ==> val variableInitialization: IrIfThenElseImpl defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'+' @ [122:25] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedSimpleFunctionDescriptor]

'scope' @ [122:27] ==> public open val scope: Scope defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedPropertyDescriptor]

'createTemporaryVariable' @ [122:33] ==> private fun Scope.createTemporaryVariable(symbol: IrVariableSymbol, initializer: IrExpression): IrVariableImpl defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'temporaryVariableSymbol' @ [123:43] ==> val temporaryVariableSymbol: IrVariableSymbolImpl defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'irGet' @ [124:47] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'parameterSymbol' @ [124:53] ==> val parameterSymbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'if (irFunction is IrConstructor) {
                    + IrDelegatingConstructorCallImpl(
                            startOffset = irFunction.startOffset,
                            endOffset   = irFunction.endOffset,
                            symbol = irFunction.symbol, descriptor = irFunction.symbol.descriptor
                    ).apply {
                        params.forEachIndexed { i, variable ->
                            putValueArgument(i, irGet(variable))
                        }
                        if (functionDescriptor.dispatchReceiverParameter != null) {
                            dispatchReceiver = irGet(newIrFunction.dispatchReceiverParameter!!.symbol)
                        }
                    }
                } else {
                    +irReturn(irCall(irFunction.symbol).apply {
                        if (functionDescriptor.dispatchReceiverParameter != null) {
                            dispatchReceiver = irGet(newIrFunction.dispatchReceiverParameter!!.symbol)
                        }
                        if (functionDescriptor.extensionReceiverParameter != null) {
                            extensionReceiver = irGet(variables[functionDescriptor.extensionReceiverParameter!!]!!)
                        }
                        params.forEachIndexed { i, variable ->
                            putValueArgument(i, irGet(variable))
                        }
                    })
                }' @ [127:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'irFunction' @ [127:21] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'+' @ [128:21] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedSimpleFunctionDescriptor]

'IrDelegatingConstructorCallImpl' @ [128:23] ==> public constructor IrDelegatingConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol, descriptor: ClassConstructorDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedClassConstructorDescriptor]

'irFunction' @ [129:43] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'startOffset' @ [129:54] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'irFunction' @ [130:43] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'endOffset' @ [130:54] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'irFunction' @ [131:38] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'symbol' @ [131:49] ==> public abstract val symbol: IrConstructorSymbol defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'irFunction' @ [131:70] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'symbol' @ [131:81] ==> public abstract val symbol: IrConstructorSymbol defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'descriptor' @ [131:88] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol[DeserializedPropertyDescriptor]

'apply' @ [132:23] ==> @InlineOnly public inline fun <T> IrDelegatingConstructorCallImpl.apply(block: IrDelegatingConstructorCallImpl.() -> Unit): IrDelegatingConstructorCallImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDelegatingConstructorCallImpl

'params' @ [133:25] ==> val params: MutableList<IrVariableSymbol> defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'forEachIndexed' @ [133:32] ==> public inline fun <T> Iterable<IrVariableSymbol>.forEachIndexed(action: (index: Int, IrVariableSymbol) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVariableSymbol

'putValueArgument' @ [134:29] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedSimpleFunctionDescriptor]

'i' @ [134:46] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'irGet' @ [134:49] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'variable' @ [134:55] ==> value-parameter variable: IrVariableSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'functionDescriptor' @ [136:29] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [136:48] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'dispatchReceiver' @ [137:29] ==> public open var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedPropertyDescriptor]

'irGet' @ [137:48] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'newIrFunction' @ [137:54] ==> val newIrFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [137:68] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'symbol' @ [137:96] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'+' @ [141:21] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedSimpleFunctionDescriptor]

'irReturn' @ [141:22] ==> public fun IrBuilderWithScope.irReturn(value: IrExpression): IrReturnImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irCall' @ [141:31] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irFunction' @ [141:38] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'symbol' @ [141:49] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'apply' @ [141:57] ==> @InlineOnly public inline fun <T> IrCall.apply(block: IrCall.() -> Unit): IrCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'functionDescriptor' @ [142:29] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [142:48] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'dispatchReceiver' @ [143:29] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'irGet' @ [143:48] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'newIrFunction' @ [143:54] ==> val newIrFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [143:68] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'symbol' @ [143:96] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'functionDescriptor' @ [145:29] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'extensionReceiverParameter' @ [145:48] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'extensionReceiver' @ [146:29] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'irGet' @ [146:49] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'variables' @ [146:55] ==> val variables: MutableMap<ValueDescriptor, IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'functionDescriptor' @ [146:65] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'extensionReceiverParameter' @ [146:84] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'params' @ [148:25] ==> val params: MutableList<IrVariableSymbol> defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[LocalVariableDescriptor]

'forEachIndexed' @ [148:32] ==> public inline fun <T> Iterable<IrVariableSymbol>.forEachIndexed(action: (index: Int, IrVariableSymbol) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVariableSymbol

'putValueArgument' @ [149:29] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'i' @ [149:46] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'irGet' @ [149:49] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'variable' @ [149:55] ==> value-parameter variable: IrVariableSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'irFunction' @ [155:13] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'valueParameters' @ [155:24] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'forEach' @ [155:40] ==> @HidesMembers public inline fun <T> Iterable<IrValueParameter>.forEach(action: (IrValueParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'it' @ [156:17] ==> value-parameter it: IrValueParameter defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower.<anonymous>[ValueParameterDescriptorImpl]

'defaultValue' @ [156:20] ==> public abstract var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'if (functionDescriptor is ClassConstructorDescriptor)
                listOf(irFunction, IrConstructorImpl(
                        startOffset = irFunction.startOffset,
                        endOffset   = irFunction.endOffset,
                        descriptor  = descriptor as ClassConstructorDescriptor,
                        origin      = DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER,
                        body        = body).apply { createParameterDeclarations() })
            else
                listOf(irFunction, IrFunctionImpl(
                        startOffset = irFunction.startOffset,
                        endOffset   = irFunction.endOffset,
                        descriptor  = descriptor,
                        origin      = DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER,
                        body        = body).apply { createParameterDeclarations() })' @ [158:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<IrFunction>, elseBranch: List<IrFunction>): List<IrFunction>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<IrFunction>

'functionDescriptor' @ [158:24] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'listOf' @ [159:17] ==> public fun <T> listOf(vararg elements: IrFunction): List<IrFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunction

'irFunction' @ [159:24] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'IrConstructorImpl' @ [159:36] ==> public constructor IrConstructorImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassConstructorDescriptor, body: IrBody) defined in org.jetbrains.kotlin.ir.declarations.impl.IrConstructorImpl[DeserializedClassConstructorDescriptor]

'irFunction' @ [160:39] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'startOffset' @ [160:50] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'irFunction' @ [161:39] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'endOffset' @ [161:50] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'descriptor' @ [162:39] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER' @ [163:39] ==> public object DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[FakeCallableDescriptorForObject]

'body' @ [164:39] ==> val body: IrBlockBody defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'apply' @ [164:45] ==> @InlineOnly public inline fun <T> IrConstructorImpl.apply(block: IrConstructorImpl.() -> Unit): IrConstructorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrConstructorImpl

'createParameterDeclarations' @ [164:53] ==> public fun IrFunction.createParameterDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [166:17] ==> public fun <T> listOf(vararg elements: IrFunction): List<IrFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunction

'irFunction' @ [166:24] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'IrFunctionImpl' @ [166:36] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor, body: IrBody?) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedClassConstructorDescriptor]

'irFunction' @ [167:39] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'startOffset' @ [167:50] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'irFunction' @ [168:39] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'endOffset' @ [168:50] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'descriptor' @ [169:39] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER' @ [170:39] ==> public object DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[FakeCallableDescriptorForObject]

'body' @ [171:39] ==> val body: IrBlockBody defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[LocalVariableDescriptor]

'apply' @ [171:45] ==> @InlineOnly public inline fun <T> IrFunctionImpl.apply(block: IrFunctionImpl.() -> Unit): IrFunctionImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunctionImpl

'createParameterDeclarations' @ [171:53] ==> public fun IrFunction.createParameterDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [173:16] ==> public fun <T> listOf(element: IrFunction): List<IrFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunction

'irFunction' @ [173:23] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.lower[ValueParameterDescriptorImpl]

'context' @ [177:35] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator[PropertyDescriptorImpl]

'log' @ [177:43] ==> public abstract fun log(message: () -> String): Unit defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[SimpleFunctionDescriptorImpl]

'msg' @ [177:67] ==> value-parameter msg: String defined in org.jetbrains.kotlin.backend.common.lower.DefaultArgumentStubGenerator.log[ValueParameterDescriptorImpl]

'IrTemporaryVariableDescriptorImpl' @ [181:9] ==> public constructor IrTemporaryVariableDescriptorImpl(containingDeclaration: DeclarationDescriptor, name: Name, outType: KotlinType, isMutable: Boolean = ...) defined in org.jetbrains.kotlin.ir.descriptors.IrTemporaryVariableDescriptorImpl[DeserializedClassConstructorDescriptor]

'this' @ [182:41] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.createTemporaryVariableDescriptor[ReceiverParameterDescriptorImpl]

'scopeOwner' @ [182:46] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'parameterDescriptor' @ [183:41] ==> value-parameter parameterDescriptor: ParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.createTemporaryVariableDescriptor[ValueParameterDescriptorImpl]

'name' @ [183:63] ==> public final val ParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [183:68] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'synthesizedName' @ [183:79] ==> public val String.synthesizedName: Name defined in org.jetbrains.kotlin.backend.common.descriptors in file utils.kt[PropertyDescriptorImpl]

'parameterDescriptor' @ [184:41] ==> value-parameter parameterDescriptor: ParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.createTemporaryVariableDescriptor[ValueParameterDescriptorImpl]

'type' @ [184:61] ==> public final val ParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'IrVariableImpl' @ [188:9] ==> public constructor IrVariableImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrVariableSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[DeserializedClassConstructorDescriptor]

'initializer' @ [189:31] ==> value-parameter initializer: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.createTemporaryVariable[ValueParameterDescriptorImpl]

'startOffset' @ [189:43] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'initializer' @ [190:31] ==> value-parameter initializer: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.createTemporaryVariable[ValueParameterDescriptorImpl]

'endOffset' @ [190:43] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'IR_TEMPORARY_VARIABLE' @ [191:51] ==> public object IR_TEMPORARY_VARIABLE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'symbol' @ [192:31] ==> value-parameter symbol: IrVariableSymbol defined in org.jetbrains.kotlin.backend.common.lower.createTemporaryVariable[ValueParameterDescriptorImpl]

'apply' @ [192:39] ==> @InlineOnly public inline fun <T> IrVariableImpl.apply(block: IrVariableImpl.() -> Unit): IrVariableImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVariableImpl

'this' @ [194:13] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.createTemporaryVariable.<anonymous>[ReceiverParameterDescriptorImpl]

'initializer' @ [194:18] ==> public open var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl[DeserializedPropertyDescriptor]

'initializer' @ [194:32] ==> value-parameter initializer: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.createTemporaryVariable[ValueParameterDescriptorImpl]

'irFunction' @ [198:12] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.getDefaultParameterExpressionBody[ValueParameterDescriptorImpl]

'getDefault' @ [198:23] ==> public fun IrFunction.getDefault(parameter: ValueParameterDescriptor): IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'valueParameter' @ [198:34] ==> value-parameter valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.getDefaultParameterExpressionBody[ValueParameterDescriptorImpl]

'TODO' @ [198:53] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'maskParameterSymbol' @ [202:9] ==> private fun maskParameterSymbol(function: IrFunction, number: Int): IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'function' @ [202:29] ==> value-parameter function: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.maskParameterDescriptor[ValueParameterDescriptorImpl]

'number' @ [202:39] ==> value-parameter number: Int defined in org.jetbrains.kotlin.backend.common.lower.maskParameterDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [202:47] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol[DeserializedPropertyDescriptor]

'function' @ [204:9] ==> value-parameter function: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.maskParameterSymbol[ValueParameterDescriptorImpl]

'valueParameters' @ [204:18] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'single' @ [204:34] ==> public inline fun <T> Iterable<IrValueParameter>.single(predicate: (IrValueParameter) -> Boolean): IrValueParameter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'it' @ [204:43] ==> value-parameter it: IrValueParameter defined in org.jetbrains.kotlin.backend.common.lower.maskParameterSymbol.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [204:46] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'name' @ [204:57] ==> public final val ParameterDescriptor.name: Name[MyPropertyDescriptor]

'parameterMaskName' @ [204:65] ==> private fun parameterMaskName(number: Int): Name defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'number' @ [204:83] ==> value-parameter number: Int defined in org.jetbrains.kotlin.backend.common.lower.maskParameterSymbol[ValueParameterDescriptorImpl]

'symbol' @ [204:93] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'descriptor' @ [206:73] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.markerParameterDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [206:84] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'single' @ [206:100] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.single(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [206:109] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.markerParameterDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [206:112] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'kConstructorMarkerName' @ [206:120] ==> internal val kConstructorMarkerName: Name defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[PropertyDescriptorImpl]

'when {
        KotlinBuiltIns.isFloat(type)   -> return IrConstImpl.float     (expression.startOffset, expression.endOffset, type, 0.0F)
        KotlinBuiltIns.isDouble(type)  -> return IrConstImpl.double    (expression.startOffset, expression.endOffset, type, 0.0)
        KotlinBuiltIns.isBoolean(type) -> return IrConstImpl.boolean   (expression.startOffset, expression.endOffset, type, false)
        KotlinBuiltIns.isByte(type)    -> return IrConstImpl.byte      (expression.startOffset, expression.endOffset, type, 0)
        KotlinBuiltIns.isChar(type)    -> return IrConstImpl.char      (expression.startOffset, expression.endOffset, type, 0.toChar())
        KotlinBuiltIns.isShort(type)   -> return IrConstImpl.short     (expression.startOffset, expression.endOffset, type, 0)
        KotlinBuiltIns.isInt(type)     -> return IrConstImpl.int       (expression.startOffset, expression.endOffset, type, 0)
        KotlinBuiltIns.isLong(type)    -> return IrConstImpl.long      (expression.startOffset, expression.endOffset, type, 0)
        else                           -> return IrConstImpl.constNull (expression.startOffset, expression.endOffset, type.builtIns.nullableNothingType)
    }' @ [209:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing, entry4: Nothing, entry5: Nothing, entry6: Nothing, entry7: Nothing, entry8: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'isFloat' @ [210:24] ==> public open fun isFloat(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [210:32] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'IrConstImpl' @ [210:50] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'float' @ [210:62] ==> public final fun float(startOffset: Int, endOffset: Int, type: KotlinType, value: Float): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [210:73] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'startOffset' @ [210:84] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'expression' @ [210:97] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'endOffset' @ [210:108] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'type' @ [210:119] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'isDouble' @ [211:24] ==> public open fun isDouble(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [211:33] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'IrConstImpl' @ [211:50] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'double' @ [211:62] ==> public final fun double(startOffset: Int, endOffset: Int, type: KotlinType, value: Double): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [211:73] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'startOffset' @ [211:84] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'expression' @ [211:97] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'endOffset' @ [211:108] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'type' @ [211:119] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'isBoolean' @ [212:24] ==> public open fun isBoolean(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [212:34] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'IrConstImpl' @ [212:50] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'boolean' @ [212:62] ==> public final fun boolean(startOffset: Int, endOffset: Int, type: KotlinType, value: Boolean): IrConstImpl<Boolean> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [212:73] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'startOffset' @ [212:84] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'expression' @ [212:97] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'endOffset' @ [212:108] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'type' @ [212:119] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'isByte' @ [213:24] ==> public open fun isByte(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [213:31] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'IrConstImpl' @ [213:50] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'byte' @ [213:62] ==> public final fun byte(startOffset: Int, endOffset: Int, type: KotlinType, value: Byte): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [213:73] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'startOffset' @ [213:84] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'expression' @ [213:97] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'endOffset' @ [213:108] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'type' @ [213:119] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'isChar' @ [214:24] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [214:31] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'IrConstImpl' @ [214:50] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'char' @ [214:62] ==> public final fun char(startOffset: Int, endOffset: Int, type: KotlinType, value: Char): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [214:73] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'startOffset' @ [214:84] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'expression' @ [214:97] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'endOffset' @ [214:108] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'type' @ [214:119] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'toChar' @ [214:127] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'isShort' @ [215:24] ==> public open fun isShort(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [215:32] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'IrConstImpl' @ [215:50] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'short' @ [215:62] ==> public final fun short(startOffset: Int, endOffset: Int, type: KotlinType, value: Short): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [215:73] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'startOffset' @ [215:84] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'expression' @ [215:97] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'endOffset' @ [215:108] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'type' @ [215:119] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'isInt' @ [216:24] ==> public open fun isInt(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [216:30] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'IrConstImpl' @ [216:50] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'int' @ [216:62] ==> public final fun int(startOffset: Int, endOffset: Int, type: KotlinType, value: Int): IrConstImpl<Int> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [216:73] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'startOffset' @ [216:84] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'expression' @ [216:97] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'endOffset' @ [216:108] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'type' @ [216:119] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'isLong' @ [217:24] ==> public open fun isLong(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [217:31] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'IrConstImpl' @ [217:50] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'long' @ [217:62] ==> public final fun long(startOffset: Int, endOffset: Int, type: KotlinType, value: Long): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [217:73] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'startOffset' @ [217:84] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'expression' @ [217:97] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'endOffset' @ [217:108] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'type' @ [217:119] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'IrConstImpl' @ [218:50] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'constNull' @ [218:62] ==> public final fun constNull(startOffset: Int, endOffset: Int, type: KotlinType): IrConstImpl<Nothing?> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [218:73] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'startOffset' @ [218:84] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'expression' @ [218:97] ==> value-parameter expression: IrElement defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'endOffset' @ [218:108] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'type' @ [218:119] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.nullConst[ValueParameterDescriptorImpl]

'builtIns' @ [218:124] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'nullableNothingType' @ [218:133] ==> public final val KotlinBuiltIns.nullableNothingType: SimpleType[MyPropertyDescriptor]

'irBody' @ [225:9] ==> value-parameter irBody: IrBody defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [225:16] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'IrElementTransformerVoid' @ [225:47] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'super' @ [227:17] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitDelegatingConstructorCall' @ [227:23] ==> public open fun visitDelegatingConstructorCall(expression: IrDelegatingConstructorCall): IrExpression defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [227:54] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'expression' @ [228:34] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'descriptor' @ [228:45] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'!' @ [229:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [229:22] ==> val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'needsDefaultArgumentsLowering' @ [229:33] ==> private val CallableMemberDescriptor.needsDefaultArgumentsLowering: Boolean defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[PropertyDescriptorImpl]

'expression' @ [230:28] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'argumentCount' @ [231:38] ==> private final fun argumentCount(expression: IrMemberAccessExpression): Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [231:52] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'argumentsCount' @ [232:21] ==> val argumentsCount: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'descriptor' @ [232:39] ==> val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'valueParameters' @ [232:50] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [232:66] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'expression' @ [233:28] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'component1' @ [234:22] ==> public final operator fun component1(): IrFunctionSymbol defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [234:37] ==> public final operator fun component2(): List<Pair<ValueParameterDescriptor, IrExpression?>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'parametersForCall' @ [234:47] ==> private final fun parametersForCall(expression: IrMemberAccessExpression): Pair<IrFunctionSymbol, List<Pair<ValueParameterDescriptor, IrExpression?>>> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [234:65] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'IrDelegatingConstructorCallImpl' @ [235:24] ==> public constructor IrDelegatingConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol, descriptor: ClassConstructorDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedClassConstructorDescriptor]

'expression' @ [236:39] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'startOffset' @ [236:50] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'expression' @ [237:39] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'endOffset' @ [237:50] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'symbolForCall' @ [238:39] ==> val symbolForCall: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'symbolForCall' @ [239:39] ==> val symbolForCall: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'descriptor' @ [239:53] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol[DeserializedPropertyDescriptor]

'apply' @ [240:26] ==> @InlineOnly public inline fun <T> IrDelegatingConstructorCallImpl.apply(block: IrDelegatingConstructorCallImpl.() -> Unit): IrDelegatingConstructorCallImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDelegatingConstructorCallImpl

'params' @ [241:29] ==> val params: List<Pair<ValueParameterDescriptor, IrExpression?>> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[LocalVariableDescriptor]

'forEach' @ [241:36] ==> @HidesMembers public inline fun <T> Iterable<Pair<ValueParameterDescriptor, IrExpression?>>.forEach(action: (Pair<ValueParameterDescriptor, IrExpression?>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ValueParameterDescriptor, IrExpression?>

'log' @ [242:33] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[SimpleFunctionDescriptorImpl]

'it' @ [242:53] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [242:56] ==> public final val first: ValueParameterDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'index' @ [242:62] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [242:71] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [242:74] ==> public final val first: ValueParameterDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'name' @ [242:80] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [242:85] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ir2string' @ [242:100] ==> public fun ir2string(ir: IrElement?): String defined in org.jetbrains.kotlin.backend.common.ir in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [242:110] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [242:113] ==> public final val second: IrExpression? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'putValueArgument' @ [243:33] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedSimpleFunctionDescriptor]

'it' @ [243:50] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [243:53] ==> public final val first: ValueParameterDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'index' @ [243:59] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [243:66] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [243:69] ==> public final val second: IrExpression? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'dispatchReceiver' @ [245:29] ==> public open var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedPropertyDescriptor]

'expression' @ [245:48] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [245:59] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'super' @ [251:17] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitCall' @ [251:23] ==> public open fun visitCall(expression: IrCall): IrExpression defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [251:33] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'expression' @ [252:42] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [252:53] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'!' @ [254:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [254:22] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'needsDefaultArgumentsLowering' @ [254:41] ==> private val CallableMemberDescriptor.needsDefaultArgumentsLowering: Boolean defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[PropertyDescriptorImpl]

'expression' @ [255:28] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'argumentCount' @ [257:38] ==> private final fun argumentCount(expression: IrMemberAccessExpression): Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [257:52] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'argumentsCount' @ [258:21] ==> val argumentsCount: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'functionDescriptor' @ [258:39] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'valueParameters' @ [258:58] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [258:74] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'expression' @ [259:28] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'component1' @ [260:22] ==> public final operator fun component1(): IrFunctionSymbol defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [260:30] ==> public final operator fun component2(): List<Pair<ValueParameterDescriptor, IrExpression?>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'parametersForCall' @ [260:40] ==> private final fun parametersForCall(expression: IrMemberAccessExpression): Pair<IrFunctionSymbol, List<Pair<ValueParameterDescriptor, IrExpression?>>> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [260:58] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'symbol' @ [261:34] ==> val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'descriptor' @ [261:41] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol[DeserializedPropertyDescriptor]

'descriptor' @ [262:17] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'typeParameters' @ [262:28] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'forEach' @ [262:43] ==> @HidesMembers public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.forEach(action: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'log' @ [262:53] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[SimpleFunctionDescriptorImpl]

'descriptor' @ [262:59] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'it' @ [262:73] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [262:76] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'it' @ [262:86] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [263:17] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'original' @ [263:28] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'typeParameters' @ [263:37] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'forEach' @ [263:52] ==> @HidesMembers public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.forEach(action: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'log' @ [263:62] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[SimpleFunctionDescriptorImpl]

'descriptor' @ [263:69] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'original' @ [263:80] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'it' @ [263:92] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [263:95] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'it' @ [263:106] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>[ValueParameterDescriptorImpl]

'IrCallImpl' @ [264:24] ==> public constructor IrCallImpl(startOffset: Int, endOffset: Int, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ..., origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'expression' @ [265:41] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'startOffset' @ [265:52] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [266:41] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'endOffset' @ [266:52] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'symbol' @ [267:41] ==> val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'descriptor' @ [268:41] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'expression' @ [269:41] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [269:52] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'typeParameters' @ [269:63] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [269:78] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), KotlinType>): List<Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), KotlinType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> Pair<(org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?), KotlinType>

'it' @ [269:82] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [269:89] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'getTypeArgument' @ [269:100] ==> public abstract fun getTypeArgument(typeParameterDescriptor: TypeParameterDescriptor): KotlinType? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'it' @ [269:116] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [269:123] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [269:126] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'toMap' @ [269:141] ==> public fun <K, V> Iterable<Pair<TypeParameterDescriptor, KotlinType>>.toMap(): Map<TypeParameterDescriptor, KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> KotlinType

'apply' @ [270:26] ==> @InlineOnly public inline fun <T> IrCallImpl.apply(block: IrCallImpl.() -> Unit): IrCallImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCallImpl

'params' @ [271:29] ==> val params: List<Pair<ValueParameterDescriptor, IrExpression?>> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[LocalVariableDescriptor]

'forEach' @ [271:36] ==> @HidesMembers public inline fun <T> Iterable<Pair<ValueParameterDescriptor, IrExpression?>>.forEach(action: (Pair<ValueParameterDescriptor, IrExpression?>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ValueParameterDescriptor, IrExpression?>

'log' @ [272:33] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[SimpleFunctionDescriptorImpl]

'it' @ [272:53] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [272:56] ==> public final val first: ValueParameterDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'index' @ [272:62] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [272:71] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [272:74] ==> public final val first: ValueParameterDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'name' @ [272:80] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [272:85] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ir2string' @ [272:100] ==> public fun ir2string(ir: IrElement?): String defined in org.jetbrains.kotlin.backend.common.ir in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [272:110] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [272:113] ==> public final val second: IrExpression? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'putValueArgument' @ [273:33] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedSimpleFunctionDescriptor]

'it' @ [273:50] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [273:53] ==> public final val first: ValueParameterDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'index' @ [273:59] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [273:66] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [273:69] ==> public final val second: IrExpression? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'expression' @ [275:29] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'extensionReceiver' @ [275:40] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'apply' @ [275:59] ==> @InlineOnly public inline fun <T> IrExpression.apply(block: IrExpression.() -> Unit): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'extensionReceiver' @ [276:33] ==> public open var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'expression' @ [276:53] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'extensionReceiver' @ [276:64] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [278:29] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [278:40] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'apply' @ [278:58] ==> @InlineOnly public inline fun <T> IrExpression.apply(block: IrExpression.() -> Unit): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'dispatchReceiver' @ [279:33] ==> public open var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'expression' @ [279:52] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [279:63] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'log' @ [281:29] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[SimpleFunctionDescriptorImpl]

'ir2string' @ [281:54] ==> public fun ir2string(ir: IrElement?): String defined in org.jetbrains.kotlin.backend.common.ir in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [281:64] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'extensionReceiver' @ [281:75] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'log' @ [282:29] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[SimpleFunctionDescriptorImpl]

'ir2string' @ [282:53] ==> public fun ir2string(ir: IrElement?): String defined in org.jetbrains.kotlin.backend.common.ir in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [282:63] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [282:74] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [287:34] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[ValueParameterDescriptorImpl]

'descriptor' @ [287:45] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'if (DescriptorUtils.isOverride(descriptor))
                    DescriptorUtils.getAllOverriddenDescriptors(descriptor).first()
                else
                    descriptor.original' @ [288:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (FunctionDescriptor..FunctionDescriptor?), elseBranch: (FunctionDescriptor..FunctionDescriptor?)): (FunctionDescriptor..FunctionDescriptor?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'isOverride' @ [288:57] ==> public open fun isOverride(@NotNull p0: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [288:68] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'getAllOverriddenDescriptors' @ [289:37] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> getAllOverriddenDescriptors(@NotNull p0: FunctionDescriptor): (MutableSet<(FunctionDescriptor..FunctionDescriptor?)>..Set<(FunctionDescriptor..FunctionDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'descriptor' @ [289:65] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'first' @ [289:77] ==> public fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.first(): (FunctionDescriptor..FunctionDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'descriptor' @ [291:21] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'original' @ [291:32] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'keyDescriptor' @ [292:36] ==> val keyDescriptor: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'generateDefaultsFunction' @ [292:50] ==> private fun FunctionDescriptor.generateDefaultsFunction(context: CommonBackendContext): IrFunction defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'context' @ [292:75] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[PropertyDescriptorImpl]

'realFunction' @ [293:38] ==> val realFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'descriptor' @ [293:51] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'log' @ [295:17] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[SimpleFunctionDescriptorImpl]

'descriptor' @ [295:23] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'realDescriptor' @ [295:38] ==> val realDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'Array' @ [296:34] ==> public constructor Array<T>(size: Int, init: (Int) -> Int) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> Int

'descriptor' @ [296:40] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'valueParameters' @ [296:51] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [296:67] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'mutableListOf' @ [297:30] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Pair<ValueParameterDescriptor, IrExpression?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ValueParameterDescriptor, IrExpression?>

'params' @ [298:17] ==> val params: MutableList<Pair<ValueParameterDescriptor, IrExpression?>> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'addAll' @ [298:24] ==> public abstract fun addAll(elements: Collection<Pair<ValueParameterDescriptor, IrExpression?>>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [298:31] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'valueParameters' @ [298:42] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'mapIndexed' @ [298:58] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.mapIndexed(transform: (index: Int, (ValueParameterDescriptor..ValueParameterDescriptor?)) -> Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), IrExpression?>): List<Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), IrExpression?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> Pair<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?), IrExpression?>

'expression' @ [299:41] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[ValueParameterDescriptorImpl]

'getValueArgument' @ [299:52] ==> public abstract fun getValueArgument(index: Int): IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedSimpleFunctionDescriptor]

'i' @ [299:69] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[ValueParameterDescriptorImpl]

'valueArgument' @ [300:25] ==> val valueArgument: IrExpression? defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[LocalVariableDescriptor]

'i' @ [301:41] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[ValueParameterDescriptorImpl]

'maskValues' @ [302:25] ==> val maskValues: Array<Int> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'maskIndex' @ [302:36] ==> val maskIndex: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[LocalVariableDescriptor]

'maskValues' @ [302:49] ==> val maskValues: Array<Int> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'maskIndex' @ [302:60] ==> val maskIndex: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[LocalVariableDescriptor]

'shl' @ [302:75] ==> public final infix fun shl(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'i' @ [302:82] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[ValueParameterDescriptorImpl]

'realDescriptor' @ [304:52] ==> val realDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'valueParameters' @ [304:67] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'i' @ [304:83] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[ValueParameterDescriptorImpl]

'valueParameterDescriptor' @ [305:32] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[LocalVariableDescriptor]

'valueArgument' @ [305:61] ==> val valueArgument: IrExpression? defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[LocalVariableDescriptor]

'nullConst' @ [305:78] ==> private fun nullConst(expression: IrElement, type: KotlinType): IrExpression? defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [305:88] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[ValueParameterDescriptorImpl]

'valueParameterDescriptor' @ [305:100] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[LocalVariableDescriptor]

'type' @ [305:125] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'pair' @ [306:39] ==> val pair: Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[LocalVariableDescriptor]

'maskValues' @ [308:17] ==> val maskValues: Array<Int> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'forEachIndexed' @ [308:28] ==> public inline fun <T> Array<out Int>.forEachIndexed(action: (index: Int, Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'params' @ [309:21] ==> val params: MutableList<Pair<ValueParameterDescriptor, IrExpression?>> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'maskParameterDescriptor' @ [309:31] ==> private fun maskParameterDescriptor(function: IrFunction, number: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'realFunction' @ [309:55] ==> val realFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'i' @ [309:69] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[ValueParameterDescriptorImpl]

'int' @ [309:87] ==> public final fun int(startOffset: Int, endOffset: Int, type: KotlinType, value: Int): IrConstImpl<Int> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'irBody' @ [310:43] ==> value-parameter irBody: IrBody defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower[ValueParameterDescriptorImpl]

'startOffset' @ [310:50] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBody[DeserializedPropertyDescriptor]

'irBody' @ [311:43] ==> value-parameter irBody: IrBody defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower[ValueParameterDescriptorImpl]

'endOffset' @ [311:50] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBody[DeserializedPropertyDescriptor]

'descriptor' @ [312:43] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'builtIns' @ [312:54] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'intType' @ [312:63] ==> public final val KotlinBuiltIns.intType: SimpleType[MyPropertyDescriptor]

'maskValue' @ [313:43] ==> value-parameter maskValue: Int defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[ValueParameterDescriptorImpl]

'if (expression.descriptor is ClassConstructorDescriptor) {
                    val defaultArgumentMarker = context.ir.symbols.defaultConstructorMarker
                    params += markerParameterDescriptor(realDescriptor) to IrGetObjectValueImpl(
                            startOffset = irBody.startOffset,
                            endOffset   = irBody.endOffset,
                            type        = defaultArgumentMarker.owner.defaultType,
                            symbol      = defaultArgumentMarker)
                }
                else if (context.ir.shouldGenerateHandlerParameterForDefaultBodyFun()) {
                    params += realDescriptor.valueParameters.last() to
                            IrConstImpl.constNull(irBody.startOffset, irBody.endOffset, context.builtIns.any.defaultType)
                }' @ [315:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expression' @ [315:21] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[ValueParameterDescriptorImpl]

'descriptor' @ [315:32] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'context' @ [316:49] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[PropertyDescriptorImpl]

'ir' @ [316:57] ==> public abstract val ir: Ir<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'symbols' @ [316:60] ==> public abstract val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.ir.Ir[PropertyDescriptorImpl]

'defaultConstructorMarker' @ [316:68] ==> public final val defaultConstructorMarker: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'params' @ [317:21] ==> val params: MutableList<Pair<ValueParameterDescriptor, IrExpression?>> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'markerParameterDescriptor' @ [317:31] ==> private fun markerParameterDescriptor(descriptor: FunctionDescriptor): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'realDescriptor' @ [317:57] ==> val realDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'IrGetObjectValueImpl' @ [317:76] ==> public constructor IrGetObjectValueImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl[DeserializedClassConstructorDescriptor]

'irBody' @ [318:43] ==> value-parameter irBody: IrBody defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower[ValueParameterDescriptorImpl]

'startOffset' @ [318:50] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBody[DeserializedPropertyDescriptor]

'irBody' @ [319:43] ==> value-parameter irBody: IrBody defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower[ValueParameterDescriptorImpl]

'endOffset' @ [319:50] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBody[DeserializedPropertyDescriptor]

'defaultArgumentMarker' @ [320:43] ==> val defaultArgumentMarker: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'owner' @ [320:65] ==> public abstract val owner: IrClass defined in org.jetbrains.kotlin.ir.symbols.IrClassSymbol[DeserializedPropertyDescriptor]

'defaultType' @ [320:71] ==> public val IrClass.defaultType: KotlinType defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'defaultArgumentMarker' @ [321:43] ==> val defaultArgumentMarker: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'context' @ [323:26] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[PropertyDescriptorImpl]

'ir' @ [323:34] ==> public abstract val ir: Ir<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'shouldGenerateHandlerParameterForDefaultBodyFun' @ [323:37] ==> public open fun shouldGenerateHandlerParameterForDefaultBodyFun(): Boolean defined in org.jetbrains.kotlin.backend.common.ir.Ir[SimpleFunctionDescriptorImpl]

'params' @ [324:21] ==> val params: MutableList<Pair<ValueParameterDescriptor, IrExpression?>> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'realDescriptor' @ [324:31] ==> val realDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'valueParameters' @ [324:46] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'last' @ [324:62] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.last(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'constNull' @ [325:41] ==> public final fun constNull(startOffset: Int, endOffset: Int, type: KotlinType): IrConstImpl<Nothing?> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'irBody' @ [325:51] ==> value-parameter irBody: IrBody defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower[ValueParameterDescriptorImpl]

'startOffset' @ [325:58] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBody[DeserializedPropertyDescriptor]

'irBody' @ [325:71] ==> value-parameter irBody: IrBody defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower[ValueParameterDescriptorImpl]

'endOffset' @ [325:78] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBody[DeserializedPropertyDescriptor]

'context' @ [325:89] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[PropertyDescriptorImpl]

'builtIns' @ [325:97] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'any' @ [325:106] ==> public final val KotlinBuiltIns.any: ClassDescriptor[MyPropertyDescriptor]

'defaultType' @ [325:110] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'params' @ [327:17] ==> val params: MutableList<Pair<ValueParameterDescriptor, IrExpression?>> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'forEach' @ [327:24] ==> @HidesMembers public inline fun <T> Iterable<Pair<ValueParameterDescriptor, IrExpression?>>.forEach(action: (Pair<ValueParameterDescriptor, IrExpression?>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ValueParameterDescriptor, IrExpression?>

'log' @ [328:21] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[SimpleFunctionDescriptorImpl]

'realDescriptor' @ [328:40] ==> val realDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'name' @ [328:55] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [328:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [328:74] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [328:77] ==> public final val first: ValueParameterDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'index' @ [328:83] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [328:93] ==> value-parameter it: Pair<ValueParameterDescriptor, IrExpression?> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [328:96] ==> public final val first: ValueParameterDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'name' @ [328:102] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [328:107] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'Pair' @ [330:24] ==> public constructor Pair<out A, out B>(first: IrFunctionSymbol, second: MutableList<Pair<ValueParameterDescriptor, IrExpression?>>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> IrFunctionSymbol
    <out B> -> MutableList<Pair<ValueParameterDescriptor, IrExpression?>>

'realFunction' @ [330:29] ==> val realFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'symbol' @ [330:42] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'params' @ [330:50] ==> val params: MutableList<Pair<ValueParameterDescriptor, IrExpression?>> defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.parametersForCall[LocalVariableDescriptor]

'expression' @ [334:21] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.argumentCount[ValueParameterDescriptorImpl]

'descriptor' @ [334:32] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'valueParameters' @ [334:43] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'count' @ [334:59] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.count(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'expression' @ [334:67] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.argumentCount[ValueParameterDescriptorImpl]

'getValueArgument' @ [334:78] ==> public fun IrMemberAccessExpression.getValueArgument(valueParameterDescriptor: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]

'it' @ [334:95] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.lower.<no name provided>.argumentCount.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [338:36] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector[PropertyDescriptorImpl]

'log' @ [338:44] ==> public abstract fun log(message: () -> String): Unit defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[SimpleFunctionDescriptorImpl]

'msg' @ [338:68] ==> value-parameter msg: String defined in org.jetbrains.kotlin.backend.common.lower.DefaultParameterInjector.log[ValueParameterDescriptorImpl]

'valueParameters' @ [342:13] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'any' @ [342:29] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.any(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [342:35] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.<get-needsDefaultArgumentsLowering>.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [342:38] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [342:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [342:63] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.needsDefaultArgumentsLowering[ReceiverParameterDescriptorImpl]

'isInline' @ [342:93] ==> public final val FunctionDescriptor.isInline: Boolean[MyPropertyDescriptor]

'context' @ [345:12] ==> value-parameter context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ValueParameterDescriptorImpl]

'ir' @ [345:20] ==> public abstract val ir: Ir<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'defaultParameterDeclarationsCache' @ [345:23] ==> public final val defaultParameterDeclarationsCache: MutableMap<FunctionDescriptor, IrFunction> defined in org.jetbrains.kotlin.backend.common.ir.Ir[PropertyDescriptorImpl]

'getOrPut' @ [345:57] ==> public inline fun <K, V> MutableMap<FunctionDescriptor, IrFunction>.getOrPut(key: FunctionDescriptor, defaultValue: () -> IrFunction): IrFunction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FunctionDescriptor
    <V> -> IrFunction

'this' @ [345:66] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ReceiverParameterDescriptorImpl]

'when (this) {
            is ClassConstructorDescriptor ->
                ClassConstructorDescriptorImpl.create(
                        /* containingDeclaration = */ containingDeclaration,
                        /* annotations           = */ annotations,
                        /* isPrimary             = */ false,
                        /* source                = */ source)
            else -> {
                val name = Name.identifier("$name\$default")

                SimpleFunctionDescriptorImpl.create(
                        /* containingDeclaration = */ containingDeclaration,
                        /* annotations           = */ annotations,
                        /* name                  = */ name,
                        /* kind                  = */ CallableMemberDescriptor.Kind.SYNTHESIZED,
                        /* source                = */ source)
            }
        }' @ [346:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionDescriptorImpl, entry1: FunctionDescriptorImpl): FunctionDescriptorImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FunctionDescriptorImpl

'this' @ [346:32] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ReceiverParameterDescriptorImpl]

'create' @ [348:48] ==> @NotNull public open fun create(@NotNull p0: ClassDescriptor, @NotNull p1: Annotations, p2: Boolean, @NotNull p3: SourceElement): ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'containingDeclaration' @ [349:55] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'annotations' @ [350:55] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[DeserializedPropertyDescriptor]

'source' @ [352:55] ==> public final val ClassConstructorDescriptor.source: SourceElement[MyPropertyDescriptor]

'identifier' @ [354:33] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [354:46] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'create' @ [356:46] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Name, @NotNull p3: CallableMemberDescriptor.Kind, @NotNull p4: SourceElement): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'containingDeclaration' @ [357:55] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'annotations' @ [358:55] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[DeserializedPropertyDescriptor]

'name' @ [359:55] ==> val name: Name defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'SYNTHESIZED' @ [360:85] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'source' @ [361:55] ==> public final val FunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'MutableList' @ [365:35] ==> @SinceKotlin @InlineOnly public inline fun <T> MutableList(size: Int, init: (index: Int) -> ValueParameterDescriptor): MutableList<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'valueParameters' @ [365:47] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [365:63] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'valueParameter' @ [366:13] ==> private fun valueParameter(descriptor: FunctionDescriptor, index: Int, name: Name, type: KotlinType): ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [366:28] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'valueParameters' @ [366:40] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [366:56] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'i' @ [366:63] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parameterMaskName' @ [366:66] ==> private fun parameterMaskName(number: Int): Name defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'i' @ [366:84] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [366:88] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'builtIns' @ [366:99] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'intType' @ [366:108] ==> public final val KotlinBuiltIns.intType: SimpleType[MyPropertyDescriptor]

'if (this is ClassConstructorDescriptor) {
            syntheticParameters += valueParameter(descriptor, syntheticParameters.last().index + 1,
                                                  kConstructorMarkerName,
                                                  context.ir.symbols.defaultConstructorMarker.owner.defaultType)
        }
        else if (context.ir.shouldGenerateHandlerParameterForDefaultBodyFun()) {
            syntheticParameters += valueParameter(descriptor, syntheticParameters.last().index + 1,
                                                  "handler".synthesizedName,
                                                  context.ir.symbols.any.owner.defaultType)
        }' @ [368:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'this' @ [368:13] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ReceiverParameterDescriptorImpl]

'syntheticParameters' @ [369:13] ==> val syntheticParameters: MutableList<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'valueParameter' @ [369:36] ==> private fun valueParameter(descriptor: FunctionDescriptor, index: Int, name: Name, type: KotlinType): ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [369:51] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'syntheticParameters' @ [369:63] ==> val syntheticParameters: MutableList<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'last' @ [369:83] ==> public fun <T> List<ValueParameterDescriptor>.last(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'index' @ [369:90] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'kConstructorMarkerName' @ [370:51] ==> internal val kConstructorMarkerName: Name defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[PropertyDescriptorImpl]

'context' @ [371:51] ==> value-parameter context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ValueParameterDescriptorImpl]

'ir' @ [371:59] ==> public abstract val ir: Ir<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'symbols' @ [371:62] ==> public abstract val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.ir.Ir[PropertyDescriptorImpl]

'defaultConstructorMarker' @ [371:70] ==> public final val defaultConstructorMarker: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'owner' @ [371:95] ==> public abstract val owner: IrClass defined in org.jetbrains.kotlin.ir.symbols.IrClassSymbol[DeserializedPropertyDescriptor]

'defaultType' @ [371:101] ==> public val IrClass.defaultType: KotlinType defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'context' @ [373:18] ==> value-parameter context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ValueParameterDescriptorImpl]

'ir' @ [373:26] ==> public abstract val ir: Ir<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'shouldGenerateHandlerParameterForDefaultBodyFun' @ [373:29] ==> public open fun shouldGenerateHandlerParameterForDefaultBodyFun(): Boolean defined in org.jetbrains.kotlin.backend.common.ir.Ir[SimpleFunctionDescriptorImpl]

'syntheticParameters' @ [374:13] ==> val syntheticParameters: MutableList<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'valueParameter' @ [374:36] ==> private fun valueParameter(descriptor: FunctionDescriptor, index: Int, name: Name, type: KotlinType): ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [374:51] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'syntheticParameters' @ [374:63] ==> val syntheticParameters: MutableList<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'last' @ [374:83] ==> public fun <T> List<ValueParameterDescriptor>.last(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'index' @ [374:90] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'synthesizedName' @ [375:61] ==> public val String.synthesizedName: Name defined in org.jetbrains.kotlin.backend.common.descriptors in file utils.kt[PropertyDescriptorImpl]

'context' @ [376:51] ==> value-parameter context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ValueParameterDescriptorImpl]

'ir' @ [376:59] ==> public abstract val ir: Ir<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'symbols' @ [376:62] ==> public abstract val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.ir.Ir[PropertyDescriptorImpl]

'any' @ [376:70] ==> public final val any: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'owner' @ [376:74] ==> public abstract val owner: IrClass defined in org.jetbrains.kotlin.ir.symbols.IrClassSymbol[DeserializedPropertyDescriptor]

'defaultType' @ [376:80] ==> public val IrClass.defaultType: KotlinType defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'descriptor' @ [379:9] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'initialize' @ [379:20] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): FunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.FunctionDescriptorImpl[JavaMethodDescriptor]

'extensionReceiverParameter' @ [380:55] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [380:83] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'dispatchReceiverParameter' @ [381:55] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'typeParameters' @ [382:55] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [382:70] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> (TypeParameterDescriptorImpl..TypeParameterDescriptorImpl?)): List<(TypeParameterDescriptorImpl..TypeParameterDescriptorImpl?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> (org.jetbrains.kotlin.descriptors.impl.TypeParameterDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.TypeParameterDescriptorImpl?)

'createForFurtherModification' @ [383:41] ==> public open fun createForFurtherModification(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, p2: Boolean, @NotNull p3: Variance, @NotNull p4: Name, p5: Int, @NotNull p6: SourceElement, @Nullable p7: (((KotlinType..KotlinType?)) -> (Void..Void?))?, @NotNull p8: SupertypeLoopChecker): (TypeParameterDescriptorImpl..TypeParameterDescriptorImpl?) defined in org.jetbrains.kotlin.descriptors.impl.TypeParameterDescriptorImpl[JavaMethodDescriptor]

'descriptor' @ [384:51] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'it' @ [385:51] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [385:54] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.TypeParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [386:51] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isReified' @ [386:54] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

'it' @ [387:51] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'variance' @ [387:54] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'it' @ [388:51] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [388:54] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'it' @ [389:51] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [389:54] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'it' @ [390:51] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [390:54] ==> public final val TypeParameterDescriptor.source: SourceElement[MyPropertyDescriptor]

'EMPTY' @ [392:72] ==> public object EMPTY : SupertypeLoopChecker defined in org.jetbrains.kotlin.descriptors.SupertypeLoopChecker[FakeCallableDescriptorForObject]

'apply' @ [393:15] ==> @InlineOnly public inline fun <T> (TypeParameterDescriptorImpl..TypeParameterDescriptorImpl?).apply(block: (TypeParameterDescriptorImpl..TypeParameterDescriptorImpl?).() -> Unit): (TypeParameterDescriptorImpl..TypeParameterDescriptorImpl?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.impl.TypeParameterDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.TypeParameterDescriptorImpl?)

'it' @ [394:17] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'upperBounds' @ [394:20] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'forEach' @ [394:32] ==> @HidesMembers public inline fun <T> Iterable<(KotlinType..KotlinType?)>.forEach(action: ((KotlinType..KotlinType?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'addUpperBound' @ [394:42] ==> public open fun addUpperBound(@NotNull p0: KotlinType): Unit defined in org.jetbrains.kotlin.descriptors.impl.TypeParameterDescriptorImpl[JavaMethodDescriptor]

'it' @ [394:56] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'setInitialized' @ [395:17] ==> public open fun setInitialized(): Unit defined in org.jetbrains.kotlin.descriptors.impl.TypeParameterDescriptorImpl[JavaMethodDescriptor]

'valueParameters' @ [398:55] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [398:71] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> ValueParameterDescriptorImpl): List<ValueParameterDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> ValueParameterDescriptorImpl

'ValueParameterDescriptorImpl' @ [399:13] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[DeserializedClassConstructorDescriptor]

'descriptor' @ [400:45] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'it' @ [402:45] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [402:48] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [403:45] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [403:48] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [404:45] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [404:48] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'it' @ [405:45] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [405:48] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'it' @ [407:45] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isCrossinline' @ [407:48] ==> public abstract val isCrossinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [408:45] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNoinline' @ [408:48] ==> public abstract val isNoinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [409:45] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [409:48] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [410:45] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [410:48] ==> public final val ValueParameterDescriptor.source: SourceElement[MyPropertyDescriptor]

'syntheticParameters' @ [411:13] ==> val syntheticParameters: MutableList<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'returnType' @ [412:55] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'FINAL' @ [413:64] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'this' @ [414:55] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ReceiverParameterDescriptorImpl]

'visibility' @ [414:60] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'descriptor' @ [415:9] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'isSuspend' @ [415:20] ==> public final var FunctionDescriptorImpl.isSuspend: Boolean[MyPropertyDescriptor]

'this' @ [415:32] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ReceiverParameterDescriptorImpl]

'isSuspend' @ [415:37] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'context' @ [416:9] ==> value-parameter context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ValueParameterDescriptorImpl]

'log' @ [416:17] ==> public abstract fun log(message: () -> String): Unit defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[SimpleFunctionDescriptorImpl]

'this' @ [416:37] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ReceiverParameterDescriptorImpl]

'descriptor' @ [416:46] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'this' @ [418:27] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ReceiverParameterDescriptorImpl]

'startOffsetOrUndefined' @ [418:32] ==> public val DeclarationDescriptorWithSource.startOffsetOrUndefined: Int defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'this' @ [419:25] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction[ReceiverParameterDescriptorImpl]

'endOffsetOrUndefined' @ [419:30] ==> public val DeclarationDescriptorWithSource.endOffsetOrUndefined: Int defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'when (descriptor) {
            is ClassConstructorDescriptor -> IrConstructorImpl(
                    startOffset, endOffset,
                    DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER,
                    descriptor
            )

            else -> IrFunctionImpl(
                    startOffset, endOffset,
                    DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER,
                    descriptor
            )
        }' @ [421:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrFunction, entry1: IrFunction): IrFunction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrFunction

'descriptor' @ [421:40] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'IrConstructorImpl' @ [422:46] ==> public constructor IrConstructorImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassConstructorDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrConstructorImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [423:21] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [423:34] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER' @ [424:21] ==> public object DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[FakeCallableDescriptorForObject]

'descriptor' @ [425:21] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'IrFunctionImpl' @ [428:21] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [429:21] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [429:34] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER' @ [430:21] ==> public object DECLARATION_ORIGIN_FUNCTION_FOR_DEFAULT_PARAMETER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.backend.common.lower in file DefaultArgumentStubGenerator.kt[FakeCallableDescriptorForObject]

'descriptor' @ [431:21] ==> val descriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'result' @ [435:9] ==> val result: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'createParameterDeclarations' @ [435:16] ==> public fun IrFunction.createParameterDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'result' @ [437:9] ==> val result: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.generateDefaultsFunction.<anonymous>[LocalVariableDescriptor]

'IrDeclarationOriginImpl' @ [442:9] ==> public constructor IrDeclarationOriginImpl(name: String) defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOriginImpl[DeserializedClassConstructorDescriptor]

'ValueParameterDescriptorImpl' @ [445:12] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[DeserializedClassConstructorDescriptor]

'descriptor' @ [446:37] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.valueParameter[ValueParameterDescriptorImpl]

'index' @ [448:37] ==> value-parameter index: Int defined in org.jetbrains.kotlin.backend.common.lower.valueParameter[ValueParameterDescriptorImpl]

'EMPTY' @ [449:49] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'name' @ [450:37] ==> value-parameter name: Name defined in org.jetbrains.kotlin.backend.common.lower.valueParameter[ValueParameterDescriptorImpl]

'type' @ [451:37] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.valueParameter[ValueParameterDescriptorImpl]

'NO_SOURCE' @ [456:51] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'synthesizedName' @ [460:48] ==> public val String.synthesizedName: Name defined in org.jetbrains.kotlin.backend.common.descriptors in file utils.kt[PropertyDescriptorImpl]

'number' @ [462:52] ==> value-parameter number: Int defined in org.jetbrains.kotlin.backend.common.lower.parameterMaskName[ValueParameterDescriptorImpl]

'synthesizedName' @ [462:60] ==> public val String.synthesizedName: Name defined in org.jetbrains.kotlin.backend.common.descriptors in file utils.kt[PropertyDescriptorImpl]

