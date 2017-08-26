'IrGeneratorContext' @ [48:59] ==> public constructor IrGeneratorContext(irBuiltIns: IrBuiltIns) defined in org.jetbrains.kotlin.ir.builders.IrGeneratorContext[DeserializedClassConstructorDescriptor]

'backendContext' @ [48:78] ==> value-parameter backendContext: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.IrLoweringContext.<init>[ValueParameterDescriptorImpl]

'irBuiltIns' @ [48:93] ==> public abstract val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.backend.common.BackendContext[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [53:28] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [53:63] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'IrBuilderWithScope' @ [54:5] ==> public constructor IrBuilderWithScope(context: IrGeneratorContext, scope: Scope, startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedClassConstructorDescriptor]

'IrLoweringContext' @ [55:9] ==> public constructor IrLoweringContext(backendContext: BackendContext) defined in org.jetbrains.kotlin.backend.common.lower.IrLoweringContext[ClassConstructorDescriptorImpl]

'backendContext' @ [55:27] ==> value-parameter backendContext: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder.<init>[ValueParameterDescriptorImpl]

'Scope' @ [56:9] ==> public constructor Scope(scopeOwnerSymbol: IrSymbol) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'symbol' @ [56:15] ==> value-parameter symbol: IrSymbol defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder.<init>[ValueParameterDescriptorImpl]

'startOffset' @ [57:9] ==> value-parameter startOffset: Int = ... defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [58:9] ==> value-parameter endOffset: Int = ... defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder.<init>[ValueParameterDescriptorImpl]

'UNDEFINED_OFFSET' @ [62:55] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [63:53] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'DeclarationIrBuilder' @ [64:9] ==> public constructor DeclarationIrBuilder(backendContext: BackendContext, symbol: IrSymbol, startOffset: Int = ..., endOffset: Int = ...) defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[ClassConstructorDescriptorImpl]

'this' @ [64:30] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.createIrBuilder[ReceiverParameterDescriptorImpl]

'symbol' @ [64:36] ==> value-parameter symbol: IrSymbol defined in org.jetbrains.kotlin.backend.common.lower.createIrBuilder[ValueParameterDescriptorImpl]

'startOffset' @ [64:44] ==> value-parameter startOffset: Int = ... defined in org.jetbrains.kotlin.backend.common.lower.createIrBuilder[ValueParameterDescriptorImpl]

'endOffset' @ [64:57] ==> value-parameter endOffset: Int = ... defined in org.jetbrains.kotlin.backend.common.lower.createIrBuilder[ValueParameterDescriptorImpl]

'this' @ [67:48] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.at[ReceiverParameterDescriptorImpl]

'at' @ [67:53] ==> public fun <T : IrBuilder> T.at(startOffset: Int, endOffset: Int): T defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrBuilder> -> T

'element' @ [67:56] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.lower.at[ValueParameterDescriptorImpl]

'startOffset' @ [67:64] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'element' @ [67:77] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.lower.at[ValueParameterDescriptorImpl]

'endOffset' @ [67:85] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'expression' @ [73:67] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irBlock[ValueParameterDescriptorImpl]

'type' @ [73:78] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'this' @ [75:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.irBlock[ReceiverParameterDescriptorImpl]

'irBlock' @ [75:14] ==> public inline fun IrGeneratorWithScope.irBlock(startOffset: Int = ..., endOffset: Int = ..., origin: IrStatementOrigin? = ..., resultType: KotlinType? = ..., body: IrBlockBuilder.() -> Unit): IrExpression defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'expression' @ [75:22] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irBlock[ValueParameterDescriptorImpl]

'startOffset' @ [75:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'expression' @ [75:46] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irBlock[ValueParameterDescriptorImpl]

'endOffset' @ [75:57] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'origin' @ [75:68] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.backend.common.lower.irBlock[ValueParameterDescriptorImpl]

'resultType' @ [75:76] ==> value-parameter resultType: KotlinType? = ... defined in org.jetbrains.kotlin.backend.common.lower.irBlock[ValueParameterDescriptorImpl]

'body' @ [75:88] ==> value-parameter body: IrBlockBuilder.() -> Unit defined in org.jetbrains.kotlin.backend.common.lower.irBlock[ValueParameterDescriptorImpl]

'this' @ [78:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.irBlockBody[ReceiverParameterDescriptorImpl]

'irBlockBody' @ [78:14] ==> public inline fun IrGeneratorWithScope.irBlockBody(startOffset: Int = ..., endOffset: Int = ..., body: IrBlockBodyBuilder.() -> Unit): IrBlockBody defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irElement' @ [78:26] ==> value-parameter irElement: IrElement defined in org.jetbrains.kotlin.backend.common.lower.irBlockBody[ValueParameterDescriptorImpl]

'startOffset' @ [78:36] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'irElement' @ [78:49] ==> value-parameter irElement: IrElement defined in org.jetbrains.kotlin.backend.common.lower.irBlockBody[ValueParameterDescriptorImpl]

'endOffset' @ [78:59] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.IrElement[DeserializedPropertyDescriptor]

'body' @ [78:70] ==> value-parameter body: IrBlockBodyBuilder.() -> Unit defined in org.jetbrains.kotlin.backend.common.lower.irBlockBody[ValueParameterDescriptorImpl]

'IrIfThenElseImpl' @ [81:9] ==> public constructor IrIfThenElseImpl(startOffset: Int, endOffset: Int, type: KotlinType, condition: IrExpression, thenBranch: IrExpression, elseBranch: IrExpression? = ..., origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrIfThenElseImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [81:26] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'endOffset' @ [81:39] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'context' @ [81:50] ==> public open val context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'builtIns' @ [81:58] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.ir.builders.IrGeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [81:67] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'condition' @ [81:77] ==> value-parameter condition: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irIfThen[ValueParameterDescriptorImpl]

'thenPart' @ [81:88] ==> value-parameter thenPart: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irIfThen[ValueParameterDescriptorImpl]

'primitiveOp1' @ [84:9] ==> public fun primitiveOp1(startOffset: Int, endOffset: Int, primitiveOpSymbol: IrSimpleFunctionSymbol, origin: IrStatementOrigin, argument: IrExpression): IrExpression defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [84:22] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'endOffset' @ [84:35] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'context' @ [84:46] ==> public open val context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'irBuiltIns' @ [84:54] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.ir.builders.IrGeneratorContext[DeserializedPropertyDescriptor]

'booleanNotSymbol' @ [84:65] ==> public final val booleanNotSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'EXCL' @ [84:101] ==> public object EXCL : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'arg' @ [84:107] ==> value-parameter arg: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irNot[ValueParameterDescriptorImpl]

'IrThrowImpl' @ [87:9] ==> public constructor IrThrowImpl(startOffset: Int, endOffset: Int, type: KotlinType, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrThrowImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [87:21] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'endOffset' @ [87:34] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'context' @ [87:45] ==> public open val context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'builtIns' @ [87:53] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.ir.builders.IrGeneratorContext[DeserializedPropertyDescriptor]

'nothingType' @ [87:62] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'arg' @ [87:75] ==> value-parameter arg: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irThrow[ValueParameterDescriptorImpl]

'IrCatchImpl' @ [90:9] ==> public constructor IrCatchImpl(startOffset: Int, endOffset: Int, catchParameter: IrVariable) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [91:17] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'endOffset' @ [91:30] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'catchParameter' @ [92:17] ==> value-parameter catchParameter: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.irCatch[ValueParameterDescriptorImpl]

'IrTypeOperatorCallImpl' @ [96:9] ==> public constructor IrTypeOperatorCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, operator: IrTypeOperator, typeOperand: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTypeOperatorCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [96:32] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'endOffset' @ [96:45] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'type' @ [96:56] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.irCast[ValueParameterDescriptorImpl]

'CAST' @ [96:77] ==> enum entry CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'typeOperand' @ [96:83] ==> value-parameter typeOperand: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.irCast[ValueParameterDescriptorImpl]

'arg' @ [96:96] ==> value-parameter arg: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irCast[ValueParameterDescriptorImpl]

'IrTypeOperatorCallImpl' @ [99:9] ==> public constructor IrTypeOperatorCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, operator: IrTypeOperator, typeOperand: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTypeOperatorCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [99:32] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'endOffset' @ [99:45] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'context' @ [99:56] ==> public open val context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'builtIns' @ [99:64] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.ir.builders.IrGeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [99:73] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'IMPLICIT_COERCION_TO_UNIT' @ [100:32] ==> enum entry IMPLICIT_COERCION_TO_UNIT defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'context' @ [100:59] ==> public open val context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'builtIns' @ [100:67] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.ir.builders.IrGeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [100:76] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'arg' @ [100:86] ==> value-parameter arg: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irImplicitCoercionToUnit[ValueParameterDescriptorImpl]

'IrGetFieldImpl' @ [103:9] ==> public constructor IrGetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [103:24] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'endOffset' @ [103:37] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'symbol' @ [103:48] ==> value-parameter symbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.irGetField[ValueParameterDescriptorImpl]

'receiver' @ [103:56] ==> value-parameter receiver: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irGetField[ValueParameterDescriptorImpl]

'IrSetFieldImpl' @ [106:9] ==> public constructor IrSetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, value: IrExpression, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSetFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [106:24] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'endOffset' @ [106:37] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'symbol' @ [106:48] ==> value-parameter symbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.irSetField[ValueParameterDescriptorImpl]

'receiver' @ [106:56] ==> value-parameter receiver: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irSetField[ValueParameterDescriptorImpl]

'value' @ [106:66] ==> value-parameter value: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.irSetField[ValueParameterDescriptorImpl]

'IrElementTransformerVoid' @ [108:73] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'currentBuilder' @ [112:17] ==> private final var currentBuilder: IrBuilderWithScope? defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer[PropertyDescriptorImpl]

'currentBuilder' @ [115:26] ==> private final var currentBuilder: IrBuilderWithScope? defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer[PropertyDescriptorImpl]

'currentBuilder' @ [116:9] ==> private final var currentBuilder: IrBuilderWithScope? defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer[PropertyDescriptorImpl]

'context' @ [116:26] ==> private final val context: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer[PropertyDescriptorImpl]

'createIrBuilder' @ [116:34] ==> public fun BackendContext.createIrBuilder(symbol: IrSymbol, startOffset: Int = ..., endOffset: Int = ...): DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'symbol' @ [116:50] ==> value-parameter symbol: IrSymbol defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer.withBuilder[ValueParameterDescriptorImpl]

'invoke' @ [118:13] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'currentBuilder' @ [120:13] ==> private final var currentBuilder: IrBuilderWithScope? defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer[PropertyDescriptorImpl]

'oldBuilder' @ [120:30] ==> val oldBuilder: IrBuilderWithScope? defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer.withBuilder[LocalVariableDescriptor]

'withBuilder' @ [125:9] ==> private final inline fun <T> withBuilder(symbol: IrSymbol, block: () -> Nothing): Nothing defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Nothing

'declaration' @ [125:21] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer.visitFunction[ValueParameterDescriptorImpl]

'symbol' @ [125:33] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'super' @ [126:20] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [126:26] ==> public open fun visitFunction(declaration: IrFunction): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [126:40] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer.visitFunction[ValueParameterDescriptorImpl]

'withBuilder' @ [131:9] ==> private final inline fun <T> withBuilder(symbol: IrSymbol, block: () -> Nothing): Nothing defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Nothing

'declaration' @ [131:21] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer.visitField[ValueParameterDescriptorImpl]

'symbol' @ [131:33] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'super' @ [133:20] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer[LazyClassReceiverParameterDescriptor]

'visitField' @ [133:26] ==> public open fun visitField(declaration: IrField): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [133:37] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer.visitField[ValueParameterDescriptorImpl]

'withBuilder' @ [138:9] ==> private final inline fun <T> withBuilder(symbol: IrSymbol, block: () -> Nothing): Nothing defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Nothing

'declaration' @ [138:21] ==> value-parameter declaration: IrAnonymousInitializer defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'symbol' @ [138:33] ==> public abstract val symbol: IrAnonymousInitializerSymbol defined in org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer[DeserializedPropertyDescriptor]

'super' @ [139:20] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer[LazyClassReceiverParameterDescriptor]

'visitAnonymousInitializer' @ [139:26] ==> public open fun visitAnonymousInitializer(declaration: IrAnonymousInitializer): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [139:52] ==> value-parameter declaration: IrAnonymousInitializer defined in org.jetbrains.kotlin.backend.common.lower.IrBuildingTransformer.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'mutableListOf' @ [146:18] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'current' @ [148:31] ==> value-parameter current: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides[ValueParameterDescriptorImpl]

'typeConstructor' @ [148:39] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [148:55] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'flatMap' @ [149:14] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.flatMap(transform: ((KotlinType..KotlinType?)) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> DeclarationDescriptor

'it' @ [149:24] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides.<anonymous>[ValueParameterDescriptorImpl]

'memberScope' @ [149:27] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [149:39] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'filterIsInstance' @ [150:14] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CallableMemberDescriptor

'component1' @ [152:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Name, List<CallableMemberDescriptor>>.component1(): Name defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> List<CallableMemberDescriptor>

'component2' @ [152:17] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Name, List<CallableMemberDescriptor>>.component2(): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> List<CallableMemberDescriptor>

'allSuperDescriptors' @ [152:27] ==> val allSuperDescriptors: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides[LocalVariableDescriptor]

'groupBy' @ [152:47] ==> public inline fun <T, K> Iterable<CallableMemberDescriptor>.groupBy(keySelector: (CallableMemberDescriptor) -> Name): Map<Name, List<CallableMemberDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <K> -> Name

'it' @ [152:57] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [152:60] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'generateOverridesInFunctionGroup' @ [153:24] ==> public open fun generateOverridesInFunctionGroup(@NotNull p0: Name, @NotNull p1: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>), @NotNull p2: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>), @NotNull p3: ClassDescriptor, @NotNull p4: OverridingStrategy): Unit defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'name' @ [154:17] ==> val name: Name defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides[LocalVariableDescriptor]

'group' @ [155:47] ==> val group: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides[LocalVariableDescriptor]

'functionsFromCurrent' @ [156:44] ==> value-parameter functionsFromCurrent: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides[ValueParameterDescriptorImpl]

'filter' @ [156:65] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.filter(predicate: (CallableMemberDescriptor) -> Boolean): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'it' @ [156:74] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [156:77] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [156:85] ==> val name: Name defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides[LocalVariableDescriptor]

'current' @ [157:17] ==> value-parameter current: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides[ValueParameterDescriptorImpl]

'NonReportingOverrideStrategy' @ [158:26] ==> public constructor NonReportingOverrideStrategy() defined in org.jetbrains.kotlin.resolve.NonReportingOverrideStrategy[DeserializedClassConstructorDescriptor]

'result' @ [160:25] ==> val result: MutableList<DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides[LocalVariableDescriptor]

'add' @ [160:32] ==> public abstract fun add(element: DeclarationDescriptor): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'fakeOverride' @ [160:36] ==> value-parameter fakeOverride: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides.<no name provided>.addFakeOverride[ValueParameterDescriptorImpl]

'error' @ [164:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'current' @ [164:54] ==> value-parameter current: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides[ValueParameterDescriptorImpl]

'fromSuper' @ [164:64] ==> value-parameter fromSuper: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides.<no name provided>.conflict[ValueParameterDescriptorImpl]

'fromCurrent' @ [164:78] ==> value-parameter fromCurrent: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides.<no name provided>.conflict[ValueParameterDescriptorImpl]

'result' @ [170:12] ==> val result: MutableList<DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.computeOverrides[LocalVariableDescriptor]

'MemberScopeImpl' @ [173:69] ==> public constructor MemberScopeImpl() defined in org.jetbrains.kotlin.resolve.scopes.MemberScopeImpl[DeserializedClassConstructorDescriptor]

'members' @ [176:13] ==> public final val members: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope[PropertyDescriptorImpl]

'filterIsInstance' @ [176:21] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassifierDescriptor

'atMostOne' @ [177:22] ==> public inline fun <T> Iterable<ClassifierDescriptor>.atMostOne(predicate: (ClassifierDescriptor) -> Boolean): ClassifierDescriptor? defined in org.jetbrains.kotlin.backend.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassifierDescriptor

'it' @ [177:34] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope.getContributedClassifier.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [177:37] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [177:45] ==> value-parameter name: Name defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'members' @ [180:13] ==> public final val members: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope[PropertyDescriptorImpl]

'filterIsInstance' @ [180:21] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PropertyDescriptor

'filter' @ [181:22] ==> public inline fun <T> Iterable<PropertyDescriptor>.filter(predicate: (PropertyDescriptor) -> Boolean): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'it' @ [181:31] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope.getContributedVariables.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [181:34] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [181:42] ==> value-parameter name: Name defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'members' @ [184:13] ==> public final val members: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope[PropertyDescriptorImpl]

'filterIsInstance' @ [184:21] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> SimpleFunctionDescriptor

'filter' @ [185:22] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.filter(predicate: (SimpleFunctionDescriptor) -> Boolean): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'it' @ [185:31] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope.getContributedFunctions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [185:34] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [185:42] ==> value-parameter name: Name defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'members' @ [189:13] ==> public final val members: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope[PropertyDescriptorImpl]

'filter' @ [189:21] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'kindFilter' @ [189:30] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'accepts' @ [189:41] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'it' @ [189:49] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [189:56] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [189:67] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.SimpleMemberScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [189:70] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'TODO' @ [191:52] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [196:28] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'constructedClass' @ [196:39] ==> public final val ClassConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'constructedClass' @ [197:22] ==> val constructedClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.callsSuper[LocalVariableDescriptor]

'getSuperClassOrAny' @ [197:39] ==> public fun ClassDescriptor.getSuperClassOrAny(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'acceptChildrenVoid' @ [200:5] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'element' @ [202:13] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.lower.callsSuper.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [202:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [202:40] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.callsSuper.<no name provided>[LazyClassReceiverParameterDescriptor]

'assert' @ [210:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'++' @ [210:20] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'numberOfCalls' @ [210:22] ==> var numberOfCalls: Int defined in org.jetbrains.kotlin.backend.common.lower.callsSuper[LocalVariableDescriptor]

'descriptor' @ [210:89] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'if (expression.descriptor.constructedClass == superClass)
                callsSuper = true
            else if (expression.descriptor.constructedClass != constructedClass)
                throw AssertionError("Expected either call to another constructor of the class being constructed or" +
                        " call to super class constructor. But was: ${expression.descriptor.constructedClass}")' @ [211:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expression' @ [211:17] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.callsSuper.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'descriptor' @ [211:28] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'constructedClass' @ [211:39] ==> public final val ClassConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'superClass' @ [211:59] ==> val superClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.callsSuper[LocalVariableDescriptor]

'callsSuper' @ [212:17] ==> var callsSuper: Boolean defined in org.jetbrains.kotlin.backend.common.lower.callsSuper[LocalVariableDescriptor]

'expression' @ [213:22] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.callsSuper.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'descriptor' @ [213:33] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'constructedClass' @ [213:44] ==> public final val ClassConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'constructedClass' @ [213:64] ==> val constructedClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.callsSuper[LocalVariableDescriptor]

'AssertionError' @ [214:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [214:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expression' @ [215:71] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.callsSuper.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'descriptor' @ [215:82] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'constructedClass' @ [215:93] ==> public final val ClassConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'assert' @ [218:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'numberOfCalls' @ [218:12] ==> var numberOfCalls: Int defined in org.jetbrains.kotlin.backend.common.lower.callsSuper[LocalVariableDescriptor]

'descriptor' @ [218:107] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'callsSuper' @ [219:12] ==> var callsSuper: Boolean defined in org.jetbrains.kotlin.backend.common.lower.callsSuper[LocalVariableDescriptor]

'when (this) {
    is ValueParameterDescriptor -> this.copy(newOwner, name, index)
    is ReceiverParameterDescriptor -> ValueParameterDescriptorImpl(
            containingDeclaration = newOwner,
            original              = null,
            index                 = index,
            annotations           = annotations,
            name                  = name,
            outType               = type,
            declaresDefaultValue  = false,
            isCrossinline         = false,
            isNoinline            = false,
            varargElementType     = null,
            source                = source
    )
    else -> throw Error("Unexpected parameter descriptor: $this")
}' @ [223:11] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ValueParameterDescriptor, entry1: ValueParameterDescriptor, entry2: ValueParameterDescriptor): ValueParameterDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ValueParameterDescriptor

'this' @ [223:17] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.copyAsValueParameter[ReceiverParameterDescriptorImpl]

'this' @ [224:36] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.copyAsValueParameter[ReceiverParameterDescriptorImpl]

'copy' @ [224:41] ==> public abstract fun copy(newOwner: CallableDescriptor, newName: Name, newIndex: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'newOwner' @ [224:46] ==> value-parameter newOwner: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.copyAsValueParameter[ValueParameterDescriptorImpl]

'name' @ [224:56] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'index' @ [224:62] ==> value-parameter index: Int defined in org.jetbrains.kotlin.backend.common.lower.copyAsValueParameter[ValueParameterDescriptorImpl]

'ValueParameterDescriptorImpl' @ [225:39] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[DeserializedClassConstructorDescriptor]

'newOwner' @ [226:37] ==> value-parameter newOwner: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.copyAsValueParameter[ValueParameterDescriptorImpl]

'index' @ [228:37] ==> value-parameter index: Int defined in org.jetbrains.kotlin.backend.common.lower.copyAsValueParameter[ValueParameterDescriptorImpl]

'annotations' @ [229:37] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ParameterDescriptor[DeserializedPropertyDescriptor]

'name' @ [230:37] ==> public final val ReceiverParameterDescriptor.name: Name[MyPropertyDescriptor]

'type' @ [231:37] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'source' @ [236:37] ==> public final val ReceiverParameterDescriptor.source: SourceElement[MyPropertyDescriptor]

'Error' @ [238:19] ==> public final fun <init>(p0: (String..String?)): Error /* = Error */ defined in kotlin.Error[TypeAliasConstructorDescriptorImpl]

'this' @ [238:60] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.copyAsValueParameter[ReceiverParameterDescriptorImpl]

