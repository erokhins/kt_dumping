'IrBuilder' @ [42:5] ==> public constructor IrBuilder(context: IrGeneratorContext, startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.builders.IrBuilder[ClassConstructorDescriptorImpl]

'context' @ [42:15] ==> value-parameter context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope.<init>[ValueParameterDescriptorImpl]

'startOffset' @ [42:24] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [42:37] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope.<init>[ValueParameterDescriptorImpl]

'IrBuilderWithScope' @ [49:5] ==> public constructor IrBuilderWithScope(context: IrGeneratorContext, scope: Scope, startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[ClassConstructorDescriptorImpl]

'context' @ [49:24] ==> value-parameter context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrStatementsBuilder.<init>[ValueParameterDescriptorImpl]

'scope' @ [49:33] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.ir.builders.IrStatementsBuilder.<init>[ValueParameterDescriptorImpl]

'startOffset' @ [49:40] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrStatementsBuilder.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [49:53] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrStatementsBuilder.<init>[ValueParameterDescriptorImpl]

'addStatement' @ [51:9] ==> protected abstract fun addStatement(irStatement: IrStatement): Unit defined in org.jetbrains.kotlin.ir.builders.IrStatementsBuilder[SimpleFunctionDescriptorImpl]

'this' @ [51:22] ==> <this> defined in org.jetbrains.kotlin.ir.builders.IrStatementsBuilder.unaryPlus[ReceiverParameterDescriptorImpl]

'IrStatementsBuilder<IrBlockBody>' @ [63:5] ==> public constructor IrStatementsBuilder<out T : IrElement>(context: IrGeneratorContext, scope: Scope, startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.builders.IrStatementsBuilder[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : IrElement> -> IrBlockBody

'context' @ [63:38] ==> value-parameter context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder.<init>[ValueParameterDescriptorImpl]

'scope' @ [63:47] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder.<init>[ValueParameterDescriptorImpl]

'startOffset' @ [63:54] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [63:67] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder.<init>[ValueParameterDescriptorImpl]

'IrBlockBodyImpl' @ [64:31] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [64:47] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [64:60] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder.<init>[ValueParameterDescriptorImpl]

'invoke' @ [67:9] ==> public abstract operator fun IrBlockBodyBuilder.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'doBuild' @ [68:16] ==> public open fun doBuild(): IrBlockBody defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[SimpleFunctionDescriptorImpl]

'irBlockBody' @ [72:9] ==> private final val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[PropertyDescriptorImpl]

'statements' @ [72:21] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[PropertyDescriptorImpl]

'add' @ [72:32] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irStatement' @ [72:36] ==> value-parameter irStatement: IrStatement defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder.addStatement[ValueParameterDescriptorImpl]

'irBlockBody' @ [76:16] ==> private final val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[PropertyDescriptorImpl]

'IrStatementsBuilder<IrBlock>' @ [85:5] ==> public constructor IrStatementsBuilder<out T : IrElement>(context: IrGeneratorContext, scope: Scope, startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.builders.IrStatementsBuilder[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : IrElement> -> IrBlock

'context' @ [85:34] ==> value-parameter context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder.<init>[ValueParameterDescriptorImpl]

'scope' @ [85:43] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder.<init>[ValueParameterDescriptorImpl]

'startOffset' @ [85:50] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [85:63] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder.<init>[ValueParameterDescriptorImpl]

'ArrayList' @ [86:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrStatement

'invoke' @ [89:9] ==> public abstract operator fun IrBlockBuilder.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'doBuild' @ [90:16] ==> public open fun doBuild(): IrBlock defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[SimpleFunctionDescriptorImpl]

'statements' @ [94:9] ==> private final val statements: ArrayList<IrStatement> defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[PropertyDescriptorImpl]

'add' @ [94:20] ==> public open fun add(element: IrStatement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'irStatement' @ [94:24] ==> value-parameter irStatement: IrStatement defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder.addStatement[ValueParameterDescriptorImpl]

'this' @ [98:26] ==> <this> defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[LazyClassReceiverParameterDescriptor]

'resultType' @ [98:31] ==> public final var resultType: KotlinType? defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[PropertyDescriptorImpl]

'statements' @ [99:27] ==> private final val statements: ArrayList<IrStatement> defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[PropertyDescriptorImpl]

'lastOrNull' @ [99:38] ==> public fun <T> List<IrStatement>.lastOrNull(): IrStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'type' @ [99:70] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'context' @ [100:26] ==> public open val context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[PropertyDescriptorImpl]

'builtIns' @ [100:34] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.ir.builders.IrGeneratorContext[PropertyDescriptorImpl]

'unitType' @ [100:43] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'IrBlockImpl' @ [101:23] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [101:35] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[PropertyDescriptorImpl]

'endOffset' @ [101:48] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[PropertyDescriptorImpl]

'resultType' @ [101:59] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder.doBuild[LocalVariableDescriptor]

'origin' @ [101:71] ==> public final val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[PropertyDescriptorImpl]

'irBlock' @ [102:9] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder.doBuild[LocalVariableDescriptor]

'statements' @ [102:17] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[PropertyDescriptorImpl]

'addAll' @ [102:28] ==> public abstract fun addAll(elements: Collection<IrStatement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statements' @ [102:35] ==> private final val statements: ArrayList<IrStatement> defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[PropertyDescriptorImpl]

'irBlock' @ [103:16] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder.doBuild[LocalVariableDescriptor]

'this' @ [108:5] ==> <this> defined in org.jetbrains.kotlin.ir.builders.at[ReceiverParameterDescriptorImpl]

'startOffset' @ [108:10] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilder[PropertyDescriptorImpl]

'startOffset' @ [108:24] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.builders.at[ValueParameterDescriptorImpl]

'this' @ [109:5] ==> <this> defined in org.jetbrains.kotlin.ir.builders.at[ReceiverParameterDescriptorImpl]

'endOffset' @ [109:10] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilder[PropertyDescriptorImpl]

'endOffset' @ [109:22] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.builders.at[ValueParameterDescriptorImpl]

'this' @ [110:12] ==> <this> defined in org.jetbrains.kotlin.ir.builders.at[ReceiverParameterDescriptorImpl]

'UNDEFINED_OFFSET' @ [113:60] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [113:95] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'IrBlockBuilder' @ [117:9] ==> public constructor IrBlockBuilder(context: IrGeneratorContext, scope: Scope, startOffset: Int, endOffset: Int, origin: IrStatementOrigin? = ..., resultType: KotlinType? = ...) defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[ClassConstructorDescriptorImpl]

'context' @ [117:24] ==> public abstract val context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrGeneratorWithScope[PropertyDescriptorImpl]

'scope' @ [117:33] ==> public abstract val scope: Scope defined in org.jetbrains.kotlin.ir.builders.IrGeneratorWithScope[PropertyDescriptorImpl]

'startOffset' @ [118:24] ==> value-parameter startOffset: Int = ... defined in org.jetbrains.kotlin.ir.builders.irBlock[ValueParameterDescriptorImpl]

'endOffset' @ [119:24] ==> value-parameter endOffset: Int = ... defined in org.jetbrains.kotlin.ir.builders.irBlock[ValueParameterDescriptorImpl]

'origin' @ [120:24] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.ir.builders.irBlock[ValueParameterDescriptorImpl]

'resultType' @ [120:32] ==> value-parameter resultType: KotlinType? = ... defined in org.jetbrains.kotlin.ir.builders.irBlock[ValueParameterDescriptorImpl]

'block' @ [121:11] ==> public final inline fun block(body: IrBlockBuilder.() -> Unit): IrBlock defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[SimpleFunctionDescriptorImpl]

'body' @ [121:17] ==> value-parameter body: IrBlockBuilder.() -> Unit defined in org.jetbrains.kotlin.ir.builders.irBlock[ValueParameterDescriptorImpl]

'UNDEFINED_OFFSET' @ [123:64] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [123:99] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'IrBlockBodyBuilder' @ [126:9] ==> public constructor IrBlockBodyBuilder(context: IrGeneratorContext, scope: Scope, startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[ClassConstructorDescriptorImpl]

'context' @ [126:28] ==> public abstract val context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrGeneratorWithScope[PropertyDescriptorImpl]

'scope' @ [126:37] ==> public abstract val scope: Scope defined in org.jetbrains.kotlin.ir.builders.IrGeneratorWithScope[PropertyDescriptorImpl]

'startOffset' @ [127:28] ==> value-parameter startOffset: Int = ... defined in org.jetbrains.kotlin.ir.builders.irBlockBody[ValueParameterDescriptorImpl]

'endOffset' @ [128:28] ==> value-parameter endOffset: Int = ... defined in org.jetbrains.kotlin.ir.builders.irBlockBody[ValueParameterDescriptorImpl]

'blockBody' @ [129:11] ==> public final inline fun blockBody(body: IrBlockBodyBuilder.() -> Unit): IrBlockBody defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[SimpleFunctionDescriptorImpl]

'body' @ [129:21] ==> value-parameter body: IrBlockBodyBuilder.() -> Unit defined in org.jetbrains.kotlin.ir.builders.irBlockBody[ValueParameterDescriptorImpl]

