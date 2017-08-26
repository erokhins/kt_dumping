'irFile' @ [46:9] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationLowering.lower[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [46:16] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'StringConcatenationTransformer' @ [46:38] ==> public constructor StringConcatenationTransformer(lower: StringConcatenationLowering) defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[ClassConstructorDescriptorImpl]

'this' @ [46:69] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationLowering[LazyClassReceiverParameterDescriptor]

'IrElementTransformerVoid' @ [50:88] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'mutableListOf' @ [52:33] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<IrBuilderWithScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBuilderWithScope

'lower' @ [53:27] ==> public final val lower: StringConcatenationLowering defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'context' @ [53:33] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationLowering[PropertyDescriptorImpl]

'context' @ [54:28] ==> private final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'builtIns' @ [54:36] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'+' @ [57:13] ==> public operator fun <T> Collection<SimpleType>.plus(element: SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'values' @ [57:27] ==> public final fun values(): Array<PrimitiveType> defined in org.jetbrains.kotlin.builtins.PrimitiveType[SimpleFunctionDescriptorImpl]

'map' @ [57:36] ==> public inline fun <T, R> Array<out PrimitiveType>.map(transform: (PrimitiveType) -> SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrimitiveType
    <R> -> SimpleType

'builtIns' @ [57:42] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'getPrimitiveKotlinType' @ [57:51] ==> @NotNull public open fun getPrimitiveKotlinType(@NotNull p0: PrimitiveType): SimpleType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [57:74] ==> value-parameter it: PrimitiveType defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.typesWithSpecialAppendFunction.<anonymous>[ValueParameterDescriptorImpl]

'builtIns' @ [57:82] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'stringType' @ [57:91] ==> public final val KotlinBuiltIns.stringType: SimpleType[MyPropertyDescriptor]

'identifier' @ [59:37] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'identifier' @ [60:35] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'context' @ [62:33] ==> private final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'ir' @ [62:41] ==> public abstract val ir: Ir<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'symbols' @ [62:44] ==> public abstract val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.ir.Ir[PropertyDescriptorImpl]

'stringBuilder' @ [62:52] ==> public abstract val stringBuilder: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'stringBuilder' @ [65:31] ==> private final val stringBuilder: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'constructors' @ [65:45] ==> public val IrClassSymbol.constructors: Sequence<IrConstructorSymbol> defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'single' @ [65:58] ==> public inline fun <T> Sequence<IrConstructorSymbol>.single(predicate: (IrConstructorSymbol) -> Boolean): IrConstructorSymbol defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrConstructorSymbol

'it' @ [66:9] ==> value-parameter it: IrConstructorSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.constructor.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [66:12] ==> public abstract val owner: IrConstructor defined in org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol[DeserializedPropertyDescriptor]

'valueParameters' @ [66:18] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'size' @ [66:34] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'stringBuilder' @ [69:36] ==> private final val stringBuilder: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'functions' @ [69:50] ==> public val IrClassSymbol.functions: Sequence<IrSimpleFunctionSymbol> defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'single' @ [69:60] ==> public inline fun <T> Sequence<IrSimpleFunctionSymbol>.single(predicate: (IrSimpleFunctionSymbol) -> Boolean): IrSimpleFunctionSymbol defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrSimpleFunctionSymbol

'it' @ [70:9] ==> value-parameter it: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.toStringFunction.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [70:12] ==> public abstract val owner: IrSimpleFunction defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'valueParameters' @ [70:18] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'size' @ [70:34] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'it' @ [70:47] ==> value-parameter it: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.toStringFunction.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [70:50] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'name' @ [70:61] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'nameToString' @ [70:69] ==> private final val nameToString: Name defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'stringBuilder' @ [72:41] ==> private final val stringBuilder: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'functions' @ [72:55] ==> public val IrClassSymbol.functions: Sequence<IrSimpleFunctionSymbol> defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'single' @ [72:65] ==> public inline fun <T> Sequence<IrSimpleFunctionSymbol>.single(predicate: (IrSimpleFunctionSymbol) -> Boolean): IrSimpleFunctionSymbol defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrSimpleFunctionSymbol

'it' @ [73:9] ==> value-parameter it: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.defaultAppendFunction.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [73:12] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'name' @ [73:23] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'nameAppend' @ [73:31] ==> private final val nameAppend: Name defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'it' @ [74:17] ==> value-parameter it: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.defaultAppendFunction.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [74:20] ==> public abstract val owner: IrSimpleFunction defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'valueParameters' @ [74:26] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'size' @ [74:42] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'it' @ [75:17] ==> value-parameter it: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.defaultAppendFunction.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [75:20] ==> public abstract val owner: IrSimpleFunction defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'valueParameters' @ [75:26] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'single' @ [75:42] ==> public fun <T> List<IrValueParameter>.single(): IrValueParameter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'type' @ [75:51] ==> public val IrValueParameter.type: KotlinType defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'builtIns' @ [75:59] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'nullableAnyType' @ [75:68] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'typesWithSpecialAppendFunction' @ [80:13] ==> private final val typesWithSpecialAppendFunction: List<SimpleType> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'map' @ [80:44] ==> public inline fun <T, R> Iterable<SimpleType>.map(transform: (SimpleType) -> Pair<SimpleType, IrSimpleFunctionSymbol?>): List<Pair<SimpleType, IrSimpleFunctionSymbol?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R> -> Pair<SimpleType, IrSimpleFunctionSymbol?>

'type' @ [81:17] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.appendFunctions.<anonymous>[ValueParameterDescriptorImpl]

'stringBuilder' @ [81:25] ==> private final val stringBuilder: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'functions' @ [81:39] ==> public val IrClassSymbol.functions: Sequence<IrSimpleFunctionSymbol> defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'toList' @ [81:49] ==> public fun <T> Sequence<IrSimpleFunctionSymbol>.toList(): List<IrSimpleFunctionSymbol> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrSimpleFunctionSymbol

'atMostOne' @ [81:58] ==> public inline fun <T> Iterable<IrSimpleFunctionSymbol>.atMostOne(predicate: (IrSimpleFunctionSymbol) -> Boolean): IrSimpleFunctionSymbol? defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> IrSimpleFunctionSymbol

'it' @ [82:21] ==> value-parameter it: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.appendFunctions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [82:24] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'name' @ [82:35] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'nameAppend' @ [82:43] ==> private final val nameAppend: Name defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'it' @ [83:29] ==> value-parameter it: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.appendFunctions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [83:32] ==> public abstract val owner: IrSimpleFunction defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'valueParameters' @ [83:38] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'size' @ [83:54] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'it' @ [84:29] ==> value-parameter it: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.appendFunctions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [84:32] ==> public abstract val owner: IrSimpleFunction defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'valueParameters' @ [84:38] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'single' @ [84:54] ==> public fun <T> List<IrValueParameter>.single(): IrValueParameter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'type' @ [84:63] ==> public val IrValueParameter.type: KotlinType defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'type' @ [84:71] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.appendFunctions.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [86:15] ==> public fun <K, V> Iterable<Pair<KotlinType, IrSimpleFunctionSymbol?>>.toMap(): Map<KotlinType, IrSimpleFunctionSymbol?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KotlinType
    <V> -> IrSimpleFunctionSymbol?

'appendFunctions' @ [89:16] ==> private final val appendFunctions: Map<KotlinType, IrFunctionSymbol?> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'type' @ [89:32] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.typeToAppendFunction[ValueParameterDescriptorImpl]

'defaultAppendFunction' @ [89:39] ==> private final val defaultAppendFunction: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'assert' @ [93:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [93:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'buildersStack' @ [93:17] ==> private final val buildersStack: MutableList<IrBuilderWithScope> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'isEmpty' @ [93:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'expression' @ [95:9] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitStringConcatenation[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [95:20] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [95:42] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[LazyClassReceiverParameterDescriptor]

'buildersStack' @ [96:28] ==> private final val buildersStack: MutableList<IrBuilderWithScope> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'last' @ [96:42] ==> public fun <T> List<IrBuilderWithScope>.last(): IrBuilderWithScope defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBuilderWithScope

'blockBuilder' @ [97:16] ==> val blockBuilder: IrBuilderWithScope defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitStringConcatenation[LocalVariableDescriptor]

'irBlock' @ [97:29] ==> public inline fun IrGeneratorWithScope.irBlock(expression: IrExpression, origin: IrStatementOrigin? = ..., resultType: KotlinType? = ..., body: IrBlockBuilder.() -> Unit): IrExpression defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'expression' @ [97:37] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitStringConcatenation[ValueParameterDescriptorImpl]

'irTemporary' @ [98:37] ==> public fun <T : IrElement> IrStatementsBuilder<IrBlock>.irTemporary(value: IrExpression, nameHint: String? = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrBlock

'irCall' @ [98:49] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'constructor' @ [98:56] ==> private final val constructor: IrConstructorSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'symbol' @ [98:70] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'expression' @ [99:13] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitStringConcatenation[ValueParameterDescriptorImpl]

'arguments' @ [99:24] ==> public abstract val arguments: List<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.IrStringConcatenation[DeserializedPropertyDescriptor]

'forEach' @ [99:34] ==> @HidesMembers public inline fun <T> Iterable<IrExpression>.forEach(action: (IrExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'typeToAppendFunction' @ [100:38] ==> private final fun typeToAppendFunction(type: KotlinType): IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[SimpleFunctionDescriptorImpl]

'arg' @ [100:59] ==> value-parameter arg: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitStringConcatenation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [100:63] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'+' @ [101:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irCall' @ [101:18] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'appendFunction' @ [101:25] ==> val appendFunction: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitStringConcatenation.<anonymous>.<anonymous>[LocalVariableDescriptor]

'apply' @ [101:41] ==> @InlineOnly public inline fun <T> IrCall.apply(block: IrCall.() -> Unit): IrCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'dispatchReceiver' @ [102:21] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'irGet' @ [102:40] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'stringBuilderImpl' @ [102:46] ==> val stringBuilderImpl: IrVariableSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitStringConcatenation.<anonymous>[LocalVariableDescriptor]

'putValueArgument' @ [103:21] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'arg' @ [103:41] ==> value-parameter arg: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitStringConcatenation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'+' @ [106:13] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irCall' @ [106:14] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'toStringFunction' @ [106:21] ==> private final val toStringFunction: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'apply' @ [106:39] ==> @InlineOnly public inline fun <T> IrCall.apply(block: IrCall.() -> Unit): IrCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'dispatchReceiver' @ [107:17] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'irGet' @ [107:36] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'stringBuilderImpl' @ [107:42] ==> val stringBuilderImpl: IrVariableSymbol defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitStringConcatenation.<anonymous>[LocalVariableDescriptor]

'declaration' @ [113:13] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitDeclaration[ValueParameterDescriptorImpl]

'super' @ [114:20] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[LazyClassReceiverParameterDescriptor]

'visitDeclaration' @ [114:26] ==> public open fun visitDeclaration(declaration: IrDeclaration): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [114:43] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitDeclaration[ValueParameterDescriptorImpl]

'with' @ [117:9] ==> @InlineOnly public inline fun <T, R> with(receiver: IrSymbolDeclaration<IrSymbol>, block: IrSymbolDeclaration<IrSymbol>.() -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrSymbolDeclaration<IrSymbol>
    <R> -> Nothing

'declaration' @ [117:14] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitDeclaration[ValueParameterDescriptorImpl]

'buildersStack' @ [118:13] ==> private final val buildersStack: MutableList<IrBuilderWithScope> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'add' @ [118:27] ==> public abstract fun add(element: IrBuilderWithScope): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'context' @ [119:21] ==> private final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'createIrBuilder' @ [119:29] ==> public fun BackendContext.createIrBuilder(symbol: IrSymbol, startOffset: Int = ..., endOffset: Int = ...): DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'declaration' @ [119:45] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitDeclaration[ValueParameterDescriptorImpl]

'symbol' @ [119:57] ==> public abstract val symbol: IrSymbol defined in org.jetbrains.kotlin.ir.declarations.IrSymbolDeclaration[DeserializedPropertyDescriptor]

'startOffset' @ [119:65] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrSymbolDeclaration[DeserializedPropertyDescriptor]

'endOffset' @ [119:78] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrSymbolDeclaration[DeserializedPropertyDescriptor]

'transformChildrenVoid' @ [121:13] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this@StringConcatenationTransformer' @ [121:35] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[LazyClassReceiverParameterDescriptor]

'buildersStack' @ [122:13] ==> private final val buildersStack: MutableList<IrBuilderWithScope> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'removeAt' @ [122:27] ==> public abstract fun removeAt(index: Int): IrBuilderWithScope defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'buildersStack' @ [122:36] ==> private final val buildersStack: MutableList<IrBuilderWithScope> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer[PropertyDescriptorImpl]

'lastIndex' @ [122:50] ==> public val <T> List<IrBuilderWithScope>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IrBuilderWithScope

'this@with' @ [123:20] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.StringConcatenationTransformer.visitDeclaration.<anonymous>[ReceiverParameterDescriptorImpl]

