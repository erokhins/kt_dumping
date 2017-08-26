'lowerTailRecursionCalls' @ [40:9] ==> private fun lowerTailRecursionCalls(context: BackendContext, irFunction: IrFunction): Unit defined in org.jetbrains.kotlin.backend.common.lower in file TailrecLowering.kt[SimpleFunctionDescriptorImpl]

'context' @ [40:33] ==> public final val context: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.TailrecLowering[PropertyDescriptorImpl]

'irFunction' @ [40:42] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.TailrecLowering.lower[ValueParameterDescriptorImpl]

'collectTailRecursionCalls' @ [45:30] ==> public fun collectTailRecursionCalls(irFunction: IrFunction): Set<IrCall> defined in org.jetbrains.kotlin.backend.common in file TailRecursionCallsCollector.kt[SimpleFunctionDescriptorImpl]

'irFunction' @ [45:56] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[ValueParameterDescriptorImpl]

'tailRecursionCalls' @ [46:9] ==> val tailRecursionCalls: Set<IrCall> defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[LocalVariableDescriptor]

'isEmpty' @ [46:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'irFunction' @ [50:19] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[ValueParameterDescriptorImpl]

'body' @ [50:30] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'context' @ [51:19] ==> value-parameter context: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[ValueParameterDescriptorImpl]

'createIrBuilder' @ [51:27] ==> public fun BackendContext.createIrBuilder(symbol: IrSymbol, startOffset: Int = ..., endOffset: Int = ...): DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower in file LowerUtils.kt[SimpleFunctionDescriptorImpl]

'irFunction' @ [51:43] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[ValueParameterDescriptorImpl]

'symbol' @ [51:54] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'at' @ [51:62] ==> public fun <T : IrBuilder> DeclarationIrBuilder.at(element: IrElement): DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrBuilder> -> DeclarationIrBuilder

'oldBody' @ [51:65] ==> val oldBody: IrBlockBody defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[LocalVariableDescriptor]

'irFunction' @ [53:22] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[ValueParameterDescriptorImpl]

'explicitParameters' @ [53:33] ==> public val IrFunction.explicitParameters: List<IrValueParameterSymbol> defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'irFunction' @ [55:5] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[ValueParameterDescriptorImpl]

'body' @ [55:16] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'builder' @ [55:23] ==> val builder: DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[LocalVariableDescriptor]

'irBlockBody' @ [55:31] ==> public inline fun IrGeneratorWithScope.irBlockBody(startOffset: Int = ..., endOffset: Int = ..., body: IrBlockBodyBuilder.() -> Unit): IrBlockBody defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'parameters' @ [57:35] ==> val parameters: List<IrValueParameterSymbol> defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[LocalVariableDescriptor]

'associate' @ [57:46] ==> public inline fun <T, K, V> Iterable<IrValueParameterSymbol>.associate(transform: (IrValueParameterSymbol) -> Pair<IrValueParameterSymbol, IrVariableSymbol>): Map<IrValueParameterSymbol, IrVariableSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameterSymbol
    <K> -> IrValueParameterSymbol
    <V> -> IrVariableSymbol

'it' @ [58:13] ==> value-parameter it: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'irTemporaryVar' @ [58:19] ==> public fun <T : IrElement> IrStatementsBuilder<IrBlockBody>.irTemporaryVar(value: IrExpression, nameHint: String? = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrBlockBody

'irGet' @ [58:34] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'it' @ [58:40] ==> value-parameter it: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [58:56] ==> value-parameter it: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'suggestVariableName' @ [58:59] ==> private fun IrValueParameterSymbol.suggestVariableName(): String defined in org.jetbrains.kotlin.backend.common.lower in file TailrecLowering.kt[SimpleFunctionDescriptorImpl]

'symbol' @ [58:82] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'+' @ [62:9] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedSimpleFunctionDescriptor]

'irWhile' @ [62:10] ==> public fun IrBuilderWithScope.irWhile(origin: IrStatementOrigin? = ...): IrWhileLoopImpl defined in org.jetbrains.kotlin.ir.builders in file IrBuilders.kt[SimpleFunctionDescriptorImpl]

'apply' @ [62:20] ==> @InlineOnly public inline fun <T> IrWhileLoopImpl.apply(block: IrWhileLoopImpl.() -> Unit): IrWhileLoopImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrWhileLoopImpl

'this' @ [63:24] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'condition' @ [64:13] ==> public open lateinit var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedPropertyDescriptor]

'irTrue' @ [64:25] ==> public fun IrBuilderWithScope.irTrue(): IrConstImpl<Boolean> defined in org.jetbrains.kotlin.ir.builders in file IrBuilders.kt[SimpleFunctionDescriptorImpl]

'body' @ [66:13] ==> public open var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedPropertyDescriptor]

'irBlock' @ [66:20] ==> public inline fun IrGeneratorWithScope.irBlock(startOffset: Int = ..., endOffset: Int = ..., origin: IrStatementOrigin? = ..., resultType: KotlinType? = ..., body: IrBlockBuilder.() -> Unit): IrExpression defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [66:28] ==> public open val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedPropertyDescriptor]

'endOffset' @ [66:41] ==> public open val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedPropertyDescriptor]

'context' @ [66:65] ==> value-parameter context: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[ValueParameterDescriptorImpl]

'builtIns' @ [66:73] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.BackendContext[PropertyDescriptorImpl]

'unitType' @ [66:82] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'parameters' @ [68:38] ==> val parameters: List<IrValueParameterSymbol> defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[LocalVariableDescriptor]

'associate' @ [68:49] ==> public inline fun <T, K, V> Iterable<IrValueParameterSymbol>.associate(transform: (IrValueParameterSymbol) -> Pair<IrValueParameterSymbol, IrVariableSymbol>): Map<IrValueParameterSymbol, IrVariableSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameterSymbol
    <K> -> IrValueParameterSymbol
    <V> -> IrVariableSymbol

'parameterToVariable' @ [69:36] ==> val parameterToVariable: Map<IrValueParameterSymbol, IrVariableSymbol> defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>[LocalVariableDescriptor]

'it' @ [69:56] ==> value-parameter it: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [70:21] ==> value-parameter it: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'irTemporary' @ [70:27] ==> public fun <T : IrElement> IrStatementsBuilder<IrBlock>.irTemporary(value: IrExpression, nameHint: String? = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrBlock

'irGet' @ [70:39] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'variable' @ [70:45] ==> val variable: IrVariableSymbol defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [70:67] ==> value-parameter it: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'suggestVariableName' @ [70:70] ==> private fun IrValueParameterSymbol.suggestVariableName(): String defined in org.jetbrains.kotlin.backend.common.lower in file TailrecLowering.kt[SimpleFunctionDescriptorImpl]

'symbol' @ [70:93] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'BodyTransformer' @ [73:35] ==> public constructor BodyTransformer(builder: IrBuilderWithScope, irFunction: IrFunction, loop: IrLoop, parameterToNew: Map<IrValueParameterSymbol, IrValueSymbol>, parameterToVariable: Map<IrValueParameterSymbol, IrVariableSymbol>, tailRecursionCalls: Set<IrCall>) defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[ClassConstructorDescriptorImpl]

'builder' @ [73:51] ==> val builder: DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[LocalVariableDescriptor]

'irFunction' @ [73:60] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[ValueParameterDescriptorImpl]

'loop' @ [73:72] ==> val loop: IrWhileLoopImpl defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>[LocalVariableDescriptor]

'parameterToNew' @ [74:25] ==> val parameterToNew: Map<IrValueParameterSymbol, IrVariableSymbol> defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'parameterToVariable' @ [74:41] ==> val parameterToVariable: Map<IrValueParameterSymbol, IrVariableSymbol> defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>[LocalVariableDescriptor]

'tailRecursionCalls' @ [74:62] ==> val tailRecursionCalls: Set<IrCall> defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[LocalVariableDescriptor]

'oldBody' @ [76:17] ==> val oldBody: IrBlockBody defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls[LocalVariableDescriptor]

'statements' @ [76:25] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[DeserializedPropertyDescriptor]

'forEach' @ [76:36] ==> @HidesMembers public inline fun <T> Iterable<IrStatement>.forEach(action: (IrStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'+' @ [77:21] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'it' @ [77:22] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [77:25] ==> public open fun <D> transform(transformer: IrElementTransformer<Nothing?>, data: Nothing?): IrStatement defined in org.jetbrains.kotlin.ir.IrStatement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> Nothing?

'transformer' @ [77:35] ==> val transformer: BodyTransformer defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'+' @ [80:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irBreak' @ [80:18] ==> public fun IrBuilderWithScope.irBreak(loop: IrLoop): IrBreakImpl defined in org.jetbrains.kotlin.ir.builders in file IrBuilders.kt[SimpleFunctionDescriptorImpl]

'loop' @ [80:26] ==> val loop: IrWhileLoopImpl defined in org.jetbrains.kotlin.backend.common.lower.lowerTailRecursionCalls.<anonymous>.<anonymous>[LocalVariableDescriptor]

'IrElementTransformerVoid' @ [93:5] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'irFunction' @ [95:22] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[PropertyDescriptorImpl]

'explicitParameters' @ [95:33] ==> public val IrFunction.explicitParameters: List<IrValueParameterSymbol> defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'expression' @ [98:9] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.visitGetValue[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [98:20] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [98:42] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[LazyClassReceiverParameterDescriptor]

'parameterToNew' @ [99:21] ==> public final val parameterToNew: Map<IrValueParameterSymbol, IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[PropertyDescriptorImpl]

'expression' @ [99:36] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.visitGetValue[ValueParameterDescriptorImpl]

'symbol' @ [99:47] ==> public abstract val symbol: IrValueSymbol defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [99:65] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.visitGetValue[ValueParameterDescriptorImpl]

'builder' @ [100:16] ==> public final val builder: IrBuilderWithScope defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[PropertyDescriptorImpl]

'at' @ [100:24] ==> public fun <T : IrBuilder> IrBuilderWithScope.at(element: IrElement): IrBuilderWithScope defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrBuilder> -> IrBuilderWithScope

'expression' @ [100:27] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.visitGetValue[ValueParameterDescriptorImpl]

'irGet' @ [100:39] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'value' @ [100:45] ==> val value: IrValueSymbol defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.visitGetValue[LocalVariableDescriptor]

'expression' @ [104:9] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.visitCall[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [104:20] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [104:42] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[LazyClassReceiverParameterDescriptor]

'expression' @ [105:13] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.visitCall[ValueParameterDescriptorImpl]

'tailRecursionCalls' @ [105:28] ==> public final val tailRecursionCalls: Set<IrCall> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[PropertyDescriptorImpl]

'expression' @ [106:20] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.visitCall[ValueParameterDescriptorImpl]

'builder' @ [109:16] ==> public final val builder: IrBuilderWithScope defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[PropertyDescriptorImpl]

'at' @ [109:24] ==> public fun <T : IrBuilder> IrBuilderWithScope.at(element: IrElement): IrBuilderWithScope defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrBuilder> -> IrBuilderWithScope

'expression' @ [109:27] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.visitCall[ValueParameterDescriptorImpl]

'genTailCall' @ [109:39] ==> private final fun IrBuilderWithScope.genTailCall(expression: IrCall): IrExpression defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [109:51] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.visitCall[ValueParameterDescriptorImpl]

'this' @ [112:70] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall[ReceiverParameterDescriptorImpl]

'irBlock' @ [112:75] ==> public inline fun IrGeneratorWithScope.irBlock(expression: IrExpression, origin: IrStatementOrigin? = ..., resultType: KotlinType? = ..., body: IrBlockBuilder.() -> Unit): IrExpression defined in org.jetbrains.kotlin.backend.common.lower in file LowerUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [112:83] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall[ValueParameterDescriptorImpl]

'expression' @ [114:35] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall[ValueParameterDescriptorImpl]

'getArgumentsWithSymbols' @ [114:46] ==> public fun IrFunctionAccessExpression.getArgumentsWithSymbols(): List<Pair<IrValueParameterSymbol, IrExpression>> defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'map' @ [114:72] ==> public inline fun <T, R> Iterable<Pair<IrValueParameterSymbol, IrExpression>>.map(transform: (Pair<IrValueParameterSymbol, IrExpression>) -> Pair<IrValueParameterSymbol, IrExpression>): List<Pair<IrValueParameterSymbol, IrExpression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<IrValueParameterSymbol, IrExpression>
    <R> -> Pair<IrValueParameterSymbol, IrExpression>

'component1' @ [114:79] ==> public final operator fun component1(): IrValueParameterSymbol defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [114:90] ==> public final operator fun component2(): IrExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'parameter' @ [115:13] ==> val parameter: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[LocalVariableDescriptor]

'argument' @ [115:26] ==> val argument: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[LocalVariableDescriptor]

'parameterToArgument' @ [119:9] ==> val parameterToArgument: List<Pair<IrValueParameterSymbol, IrExpression>> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>[LocalVariableDescriptor]

'forEach' @ [119:29] ==> @HidesMembers public inline fun <T> Iterable<Pair<IrValueParameterSymbol, IrExpression>>.forEach(action: (Pair<IrValueParameterSymbol, IrExpression>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<IrValueParameterSymbol, IrExpression>

'component1' @ [119:40] ==> public final operator fun component1(): IrValueParameterSymbol defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [119:51] ==> public final operator fun component2(): IrExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'at' @ [120:13] ==> public fun <T : IrBuilder> IrBlockBuilder.at(element: IrElement): IrBlockBuilder defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrBuilder> -> IrBlockBuilder

'argument' @ [120:16] ==> val argument: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[LocalVariableDescriptor]

'+' @ [123:13] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irSetVar' @ [123:14] ==> public fun IrBuilderWithScope.irSetVar(variable: IrVariableSymbol, value: IrExpression): IrSetVariableImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'parameterToVariable' @ [123:23] ==> public final val parameterToVariable: Map<IrValueParameterSymbol, IrVariableSymbol> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[PropertyDescriptorImpl]

'parameter' @ [123:43] ==> val parameter: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[LocalVariableDescriptor]

'argument' @ [123:57] ==> val argument: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[LocalVariableDescriptor]

'parameterToArgument' @ [126:35] ==> val parameterToArgument: List<Pair<IrValueParameterSymbol, IrExpression>> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>[LocalVariableDescriptor]

'map' @ [126:55] ==> public inline fun <T, R> Iterable<Pair<IrValueParameterSymbol, IrExpression>>.map(transform: (Pair<IrValueParameterSymbol, IrExpression>) -> IrValueParameterSymbol): List<IrValueParameterSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<IrValueParameterSymbol, IrExpression>
    <R> -> IrValueParameterSymbol

'component1' @ [126:62] ==> public final operator fun component1(): IrValueParameterSymbol defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [126:73] ==> public final operator fun component2(): IrExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'parameter' @ [126:79] ==> val parameter: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toSet' @ [126:91] ==> public fun <T> Iterable<IrValueParameterSymbol>.toSet(): Set<IrValueParameterSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameterSymbol

'parameters' @ [129:9] ==> public final val parameters: List<IrValueParameterSymbol> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[PropertyDescriptorImpl]

'filter' @ [129:20] ==> public inline fun <T> Iterable<IrValueParameterSymbol>.filter(predicate: (IrValueParameterSymbol) -> Boolean): List<IrValueParameterSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameterSymbol

'it' @ [129:29] ==> value-parameter it: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'specifiedParameters' @ [129:36] ==> val specifiedParameters: Set<IrValueParameterSymbol> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>[LocalVariableDescriptor]

'forEach' @ [129:58] ==> @HidesMembers public inline fun <T> Iterable<IrValueParameterSymbol>.forEach(action: (IrValueParameterSymbol) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameterSymbol

'parameter' @ [131:40] ==> value-parameter parameter: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [131:50] ==> public abstract val owner: IrValueParameter defined in org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol[DeserializedPropertyDescriptor]

'defaultValue' @ [131:56] ==> public abstract var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'expression' @ [131:70] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpressionBody[DeserializedPropertyDescriptor]

'Error' @ [132:27] ==> public final fun <init>(p0: (String..String?)): Error /* = Error */ defined in kotlin.Error[TypeAliasConstructorDescriptorImpl]

'parameter' @ [132:61] ==> value-parameter parameter: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'originalDefaultValue' @ [135:32] ==> val originalDefaultValue: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[LocalVariableDescriptor]

'deepCopyWithVariables' @ [136:22] ==> @Suppress public fun <T : IrElement> IrExpression.deepCopyWithVariables(): IrExpression defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrElement> -> IrExpression

'transform' @ [137:22] ==> public open fun <D> transform(transformer: IrElementTransformer<Nothing?>, data: Nothing?): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> Nothing?

'IrElementTransformerVoid' @ [137:41] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'expression' @ [140:29] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [140:40] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [140:62] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'parameterToVariable' @ [142:50] ==> public final val parameterToVariable: Map<IrValueParameterSymbol, IrVariableSymbol> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[PropertyDescriptorImpl]

'expression' @ [142:70] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'symbol' @ [142:81] ==> public abstract val symbol: IrValueSymbol defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [142:99] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'IrGetValueImpl' @ [143:36] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'expression' @ [144:37] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'startOffset' @ [144:48] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [144:61] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'endOffset' @ [144:72] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'variableSymbol' @ [145:37] ==> val variableSymbol: IrVariableSymbol defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>.<no name provided>.visitGetValue[LocalVariableDescriptor]

'expression' @ [145:53] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>.<no name provided>.visitGetValue[ValueParameterDescriptorImpl]

'origin' @ [145:64] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'+' @ [150:13] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irSetVar' @ [150:14] ==> public fun IrBuilderWithScope.irSetVar(variable: IrVariableSymbol, value: IrExpression): IrSetVariableImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'parameterToVariable' @ [150:23] ==> public final val parameterToVariable: Map<IrValueParameterSymbol, IrVariableSymbol> defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[PropertyDescriptorImpl]

'parameter' @ [150:43] ==> value-parameter parameter: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'defaultValue' @ [150:57] ==> val defaultValue: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer.genTailCall.<anonymous>.<anonymous>[LocalVariableDescriptor]

'+' @ [154:9] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irContinue' @ [154:10] ==> public fun IrBuilderWithScope.irContinue(loop: IrLoop): IrContinueImpl defined in org.jetbrains.kotlin.ir.builders in file IrBuilders.kt[SimpleFunctionDescriptorImpl]

'loop' @ [154:21] ==> public final val loop: IrLoop defined in org.jetbrains.kotlin.backend.common.lower.BodyTransformer[PropertyDescriptorImpl]

'if (descriptor.name.isSpecial) {
    val oldNameStr = descriptor.name.asString()
    "$" + oldNameStr.substring(1, oldNameStr.length - 1)
} else {
    descriptor.name.identifier
}' @ [158:68] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'descriptor' @ [158:72] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol[DeserializedPropertyDescriptor]

'name' @ [158:83] ==> public final val ParameterDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [158:88] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'descriptor' @ [159:22] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol[DeserializedPropertyDescriptor]

'name' @ [159:33] ==> public final val ParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [159:38] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'+' @ [160:5] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'oldNameStr' @ [160:11] ==> val oldNameStr: String defined in org.jetbrains.kotlin.backend.common.lower.suggestVariableName[LocalVariableDescriptor]

'substring' @ [160:22] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'oldNameStr' @ [160:35] ==> val oldNameStr: String defined in org.jetbrains.kotlin.backend.common.lower.suggestVariableName[LocalVariableDescriptor]

'length' @ [160:46] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'descriptor' @ [162:5] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol[DeserializedPropertyDescriptor]

'name' @ [162:16] ==> public final val ParameterDescriptor.name: Name[MyPropertyDescriptor]

'identifier' @ [162:21] ==> public final val Name.identifier: String[MyPropertyDescriptor]

