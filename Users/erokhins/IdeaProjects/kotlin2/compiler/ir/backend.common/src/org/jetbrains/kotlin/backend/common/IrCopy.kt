'DeepCopyIrTreeWithSymbols' @ [31:5] ==> public constructor DeepCopyIrTreeWithSymbols(symbolRemapper: SymbolRemapper) defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[DeserializedClassConstructorDescriptor]

'symbolRemapper' @ [31:31] ==> value-parameter symbolRemapper: SymbolRemapper defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.<init>[ValueParameterDescriptorImpl]

'transform' @ [34:13] ==> public open fun <D> transform(transformer: IrElementTransformer<Nothing?>, data: Nothing?): IrElement defined in org.jetbrains.kotlin.ir.IrElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> Nothing?

'this@DeepCopyIrTreeWithReturnableBlockSymbols' @ [34:23] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols[LazyClassReceiverParameterDescriptor]

'mutableMapOf' @ [36:47] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<IrReturnableBlock, IrReturnableBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrReturnableBlock
    <V> -> IrReturnableBlock

'if (expression is IrReturnableBlock) {
        IrReturnableBlockImpl(
                expression.startOffset, expression.endOffset,
                expression.type,
                expression.descriptor,
                expression.origin,
                expression.sourceFileName
        ).also {
            transformedReturnableBlocks.put(expression, it)
            it.statements.addAll(expression.statements.map { it.transform() })
        }
    } else {
        super.visitBlock(expression)
    }' @ [38:61] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrBlock, elseBranch: IrBlock): IrBlock[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrBlock

'expression' @ [38:65] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock[ValueParameterDescriptorImpl]

'IrReturnableBlockImpl' @ [39:9] ==> public constructor IrReturnableBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, descriptor: FunctionDescriptor, origin: IrStatementOrigin? = ..., sourceFileName: String = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[DeserializedClassConstructorDescriptor]

'expression' @ [40:17] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock[ValueParameterDescriptorImpl]

'startOffset' @ [40:28] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'expression' @ [40:41] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock[ValueParameterDescriptorImpl]

'endOffset' @ [40:52] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'expression' @ [41:17] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock[ValueParameterDescriptorImpl]

'type' @ [41:28] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'expression' @ [42:17] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock[ValueParameterDescriptorImpl]

'descriptor' @ [42:28] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrReturnableBlock[DeserializedPropertyDescriptor]

'expression' @ [43:17] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock[ValueParameterDescriptorImpl]

'origin' @ [43:28] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'expression' @ [44:17] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock[ValueParameterDescriptorImpl]

'sourceFileName' @ [44:28] ==> public abstract val sourceFileName: String defined in org.jetbrains.kotlin.ir.expressions.IrReturnableBlock[DeserializedPropertyDescriptor]

'also' @ [45:11] ==> @InlineOnly @SinceKotlin public inline fun <T> IrReturnableBlockImpl.also(block: (IrReturnableBlockImpl) -> Unit): IrReturnableBlockImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrReturnableBlockImpl

'transformedReturnableBlocks' @ [46:13] ==> private final val transformedReturnableBlocks: MutableMap<IrReturnableBlock, IrReturnableBlock> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols[PropertyDescriptorImpl]

'put' @ [46:41] ==> public abstract fun put(key: IrReturnableBlock, value: IrReturnableBlock): IrReturnableBlock? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'expression' @ [46:45] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock[ValueParameterDescriptorImpl]

'it' @ [46:57] ==> value-parameter it: IrReturnableBlockImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [47:13] ==> value-parameter it: IrReturnableBlockImpl defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock.<anonymous>[ValueParameterDescriptorImpl]

'statements' @ [47:16] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[DeserializedPropertyDescriptor]

'addAll' @ [47:27] ==> public abstract fun addAll(elements: Collection<IrStatement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'expression' @ [47:34] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock[ValueParameterDescriptorImpl]

'statements' @ [47:45] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'map' @ [47:56] ==> public inline fun <T, R> Iterable<IrStatement>.map(transform: (IrStatement) -> IrStatement): List<IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement
    <R> -> IrStatement

'it' @ [47:62] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [47:65] ==> private final inline fun <reified T : IrElement> IrStatement.transform(): IrStatement defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrStatement

'super' @ [50:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols[LazyClassReceiverParameterDescriptor]

'visitBlock' @ [50:15] ==> public open fun visitBlock(expression: IrBlock): IrBlock defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[DeserializedSimpleFunctionDescriptor]

'expression' @ [50:26] ==> value-parameter expression: IrBlock defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitBlock[ValueParameterDescriptorImpl]

'expression' @ [54:34] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitReturn[ValueParameterDescriptorImpl]

'returnTargetSymbol' @ [54:45] ==> public abstract val returnTargetSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'if (returnTargetSymbol is IrReturnableBlockSymbol) {
            IrReturnImpl(
                    expression.startOffset, expression.endOffset,
                    expression.type,
                    transformedReturnableBlocks.getOrElse(returnTargetSymbol.owner) { returnTargetSymbol.owner }.symbol,
                    expression.value.transform()
            )
        } else {
            super.visitReturn(expression)
        }' @ [55:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrReturn, elseBranch: IrReturn): IrReturn[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrReturn

'returnTargetSymbol' @ [55:20] ==> val returnTargetSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitReturn[LocalVariableDescriptor]

'IrReturnImpl' @ [56:13] ==> public constructor IrReturnImpl(startOffset: Int, endOffset: Int, type: KotlinType, returnTargetSymbol: IrFunctionSymbol, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl[DeserializedClassConstructorDescriptor]

'expression' @ [57:21] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitReturn[ValueParameterDescriptorImpl]

'startOffset' @ [57:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'expression' @ [57:45] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitReturn[ValueParameterDescriptorImpl]

'endOffset' @ [57:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'expression' @ [58:21] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitReturn[ValueParameterDescriptorImpl]

'type' @ [58:32] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'transformedReturnableBlocks' @ [59:21] ==> private final val transformedReturnableBlocks: MutableMap<IrReturnableBlock, IrReturnableBlock> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols[PropertyDescriptorImpl]

'getOrElse' @ [59:49] ==> @InlineOnly public inline fun <K, V> Map<IrReturnableBlock, IrReturnableBlock>.getOrElse(key: IrReturnableBlock, defaultValue: () -> IrReturnableBlock): IrReturnableBlock defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrReturnableBlock
    <V> -> IrReturnableBlock

'returnTargetSymbol' @ [59:59] ==> val returnTargetSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitReturn[LocalVariableDescriptor]

'owner' @ [59:78] ==> public abstract val owner: IrReturnableBlock defined in org.jetbrains.kotlin.ir.symbols.IrReturnableBlockSymbol[DeserializedPropertyDescriptor]

'returnTargetSymbol' @ [59:87] ==> val returnTargetSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitReturn[LocalVariableDescriptor]

'owner' @ [59:106] ==> public abstract val owner: IrReturnableBlock defined in org.jetbrains.kotlin.ir.symbols.IrReturnableBlockSymbol[DeserializedPropertyDescriptor]

'symbol' @ [59:114] ==> public abstract val symbol: IrReturnableBlockSymbol defined in org.jetbrains.kotlin.ir.expressions.IrReturnableBlock[DeserializedPropertyDescriptor]

'expression' @ [60:21] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitReturn[ValueParameterDescriptorImpl]

'value' @ [60:32] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'transform' @ [60:38] ==> private final inline fun <reified T : IrElement> IrExpression.transform(): IrExpression defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrExpression

'super' @ [63:13] ==> <this> defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols[LazyClassReceiverParameterDescriptor]

'visitReturn' @ [63:19] ==> public open fun visitReturn(expression: IrReturn): IrReturn defined in org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols[DeserializedSimpleFunctionDescriptor]

'expression' @ [63:31] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.DeepCopyIrTreeWithReturnableBlockSymbols.visitReturn[ValueParameterDescriptorImpl]

