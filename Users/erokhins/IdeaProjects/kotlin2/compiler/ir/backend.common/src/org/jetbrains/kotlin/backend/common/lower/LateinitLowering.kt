'irFile' @ [38:9] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [38:16] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'IrElementTransformerVoid' @ [38:46] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'declaration' @ [40:21] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'descriptor' @ [40:33] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'isLateInit' @ [40:44] ==> public final val PropertyDescriptor.isLateInit: Boolean[MyPropertyDescriptor]

'declaration' @ [40:58] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'descriptor' @ [40:70] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'kind' @ [40:81] ==> public final val PropertyDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [40:86] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'transformGetter' @ [41:21] ==> private final fun transformGetter(backingFieldSymbol: IrFieldSymbol, getter: IrFunction): Unit defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>[SimpleFunctionDescriptorImpl]

'declaration' @ [41:37] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'backingField' @ [41:49] ==> public abstract var backingField: IrField? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'symbol' @ [41:64] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'declaration' @ [41:72] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'getter' @ [41:84] ==> public abstract var getter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'declaration' @ [42:24] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'backingFieldSymbol' @ [46:28] ==> value-parameter backingFieldSymbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[ValueParameterDescriptorImpl]

'descriptor' @ [46:47] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFieldSymbol[DeserializedPropertyDescriptor]

'type' @ [46:58] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'assert' @ [47:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [47:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPrimitiveType' @ [47:41] ==> public open fun isPrimitiveType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [47:57] ==> val type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[LocalVariableDescriptor]

'getter' @ [48:35] ==> value-parameter getter: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[ValueParameterDescriptorImpl]

'startOffset' @ [48:42] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'getter' @ [49:33] ==> value-parameter getter: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[ValueParameterDescriptorImpl]

'endOffset' @ [49:40] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'context' @ [50:33] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering[PropertyDescriptorImpl]

'createIrBuilder' @ [50:41] ==> public fun BackendContext.createIrBuilder(symbol: IrSymbol, startOffset: Int = ..., endOffset: Int = ...): DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'getter' @ [50:57] ==> value-parameter getter: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[ValueParameterDescriptorImpl]

'symbol' @ [50:64] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'startOffset' @ [50:72] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[LocalVariableDescriptor]

'endOffset' @ [50:85] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[LocalVariableDescriptor]

'irBuilder' @ [51:17] ==> val irBuilder: DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[LocalVariableDescriptor]

'run' @ [51:27] ==> @InlineOnly public inline fun <T, R> DeclarationIrBuilder.run(block: DeclarationIrBuilder.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationIrBuilder
    <R> -> Unit

'irBlock' @ [52:33] ==> private final fun IrBuilderWithScope.irBlock(type: KotlinType): IrBlock defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering[SimpleFunctionDescriptorImpl]

'type' @ [52:41] ==> val type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[LocalVariableDescriptor]

'scope' @ [53:37] ==> public open val scope: Scope defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[DeserializedPropertyDescriptor]

'createTemporaryVariable' @ [53:43] ==> public final fun createTemporaryVariable(irExpression: IrExpression, nameHint: String? = ..., isMutable: Boolean = ..., origin: IrDeclarationOrigin = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedSimpleFunctionDescriptor]

'irGetField' @ [54:29] ==> public fun IrBuilderWithScope.irGetField(receiver: IrExpression, symbol: IrFieldSymbol): IrGetFieldImpl defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'irGet' @ [54:40] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'getter' @ [54:46] ==> value-parameter getter: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [54:53] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'symbol' @ [54:81] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'backingFieldSymbol' @ [54:90] ==> value-parameter backingFieldSymbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[ValueParameterDescriptorImpl]

'block' @ [55:21] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter.<anonymous>[LocalVariableDescriptor]

'statements' @ [55:27] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'add' @ [55:38] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'resultVar' @ [55:42] ==> val resultVar: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter.<anonymous>[LocalVariableDescriptor]

'irIfThenElse' @ [56:39] ==> public fun IrBuilderWithScope.irIfThenElse(type: KotlinType, condition: IrExpression, thenPart: IrExpression, elsePart: IrExpression): IrIfThenElseImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'context' @ [56:52] ==> public open val context: IrGeneratorContext defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[DeserializedPropertyDescriptor]

'builtIns' @ [56:60] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.ir.builders.IrGeneratorContext[DeserializedPropertyDescriptor]

'nothingType' @ [56:69] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'irNotEquals' @ [57:29] ==> public fun IrBuilderWithScope.irNotEquals(arg1: IrExpression, arg2: IrExpression): IrExpression defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irGet' @ [57:41] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'resultVar' @ [57:47] ==> val resultVar: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter.<anonymous>[LocalVariableDescriptor]

'symbol' @ [57:57] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'irNull' @ [57:66] ==> public fun IrBuilderWithScope.irNull(): IrConstImpl<Nothing?> defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irReturn' @ [58:29] ==> public fun IrBuilderWithScope.irReturn(value: IrExpression): IrReturnImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irGet' @ [58:38] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'resultVar' @ [58:44] ==> val resultVar: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter.<anonymous>[LocalVariableDescriptor]

'symbol' @ [58:54] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'irCall' @ [59:29] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'throwErrorFunction' @ [59:36] ==> private final val throwErrorFunction: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering[PropertyDescriptorImpl]

'block' @ [60:21] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter.<anonymous>[LocalVariableDescriptor]

'statements' @ [60:27] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'add' @ [60:38] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'throwIfNull' @ [60:42] ==> val throwIfNull: IrIfThenElseImpl defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter.<anonymous>[LocalVariableDescriptor]

'getter' @ [61:21] ==> value-parameter getter: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[ValueParameterDescriptorImpl]

'body' @ [61:28] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'IrExpressionBodyImpl' @ [61:35] ==> public constructor IrExpressionBodyImpl(startOffset: Int, endOffset: Int, expression: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [61:56] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[LocalVariableDescriptor]

'endOffset' @ [61:69] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter[LocalVariableDescriptor]

'block' @ [61:80] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.lower.<no name provided>.transformGetter.<anonymous>[LocalVariableDescriptor]

'context' @ [67:38] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering[PropertyDescriptorImpl]

'ir' @ [67:46] ==> public abstract val ir: Ir<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'symbols' @ [67:49] ==> public abstract val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.ir.Ir[PropertyDescriptorImpl]

'ThrowUninitializedPropertyAccessException' @ [67:57] ==> public abstract val ThrowUninitializedPropertyAccessException: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'IrBlockImpl' @ [70:15] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [70:27] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'endOffset' @ [70:40] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'type' @ [70:51] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.LateinitLowering.irBlock[ValueParameterDescriptorImpl]

