'indexedGetCall' @ [38:36] ==> public final val indexedGetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'run' @ [38:52] ==> @InlineOnly public inline fun <T, R> CallBuilder.run(block: CallBuilder.() -> KotlinType): KotlinType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallBuilder
    <R> -> KotlinType

'descriptor' @ [38:58] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'returnType' @ [38:69] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'indexedSetCall' @ [39:36] ==> public final val indexedSetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'run' @ [39:52] ==> @InlineOnly public inline fun <T, R> CallBuilder.run(block: CallBuilder.() -> KotlinType): KotlinType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallBuilder
    <R> -> KotlinType

'descriptor' @ [39:58] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'valueParameters' @ [39:69] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'last' @ [39:85] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.last(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'type' @ [39:92] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'AssertionError' @ [40:42] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'origin' @ [43:25] ==> public final val origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'isAssignmentOperatorWithResult' @ [43:32] ==> public fun IrStatementOrigin.isAssignmentOperatorWithResult(): Boolean defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]

'if (hasResult) type else callGenerator.context.builtIns.unitType' @ [44:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'hasResult' @ [44:30] ==> val hasResult: Boolean defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[LocalVariableDescriptor]

'type' @ [44:41] ==> private final val type: KotlinType defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'callGenerator' @ [44:51] ==> public final val callGenerator: CallGenerator defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'context' @ [44:65] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'builtIns' @ [44:73] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [44:82] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'IrBlockImpl' @ [45:23] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [45:35] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'endOffset' @ [45:48] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'resultType' @ [45:59] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[LocalVariableDescriptor]

'origin' @ [45:71] ==> public final val origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'callGenerator' @ [47:28] ==> public final val callGenerator: CallGenerator defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'scope' @ [47:42] ==> public open val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'createTemporaryVariableInBlock' @ [47:48] ==> public fun Scope.createTemporaryVariableInBlock(irExpression: IrExpression, block: IrContainerExpressionBase, nameHint: String? = ...): IntermediateValue defined in org.jetbrains.kotlin.psi2ir.intermediate in file RematerializableValue.kt[SimpleFunctionDescriptorImpl]

'irArray' @ [47:79] ==> public final val irArray: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'irBlock' @ [47:88] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[LocalVariableDescriptor]

'irIndices' @ [49:29] ==> public final val irIndices: List<IrExpression> defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'mapIndexed' @ [49:39] ==> public inline fun <T, R> Iterable<IrExpression>.mapIndexed(transform: (index: Int, IrExpression) -> IntermediateValue): List<IntermediateValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression
    <R> -> IntermediateValue

'callGenerator' @ [50:13] ==> public final val callGenerator: CallGenerator defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'scope' @ [50:27] ==> public open val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'createTemporaryVariableInBlock' @ [50:33] ==> public fun Scope.createTemporaryVariableInBlock(irExpression: IrExpression, block: IrContainerExpressionBase, nameHint: String? = ...): IntermediateValue defined in org.jetbrains.kotlin.psi2ir.intermediate in file RematerializableValue.kt[SimpleFunctionDescriptorImpl]

'irIndex' @ [50:64] ==> value-parameter irIndex: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign.<anonymous>[ValueParameterDescriptorImpl]

'irBlock' @ [50:73] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[LocalVariableDescriptor]

'i' @ [50:89] ==> value-parameter i: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign.<anonymous>[ValueParameterDescriptorImpl]

'indexedGetCall' @ [53:9] ==> public final val indexedGetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'fillArrayAndIndexArguments' @ [53:25] ==> private final fun CallBuilder.fillArrayAndIndexArguments(arrayValue: IntermediateValue, indexValues: List<IntermediateValue>): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[SimpleFunctionDescriptorImpl]

'irArrayValue' @ [53:52] ==> val irArrayValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[LocalVariableDescriptor]

'irIndexValues' @ [53:66] ==> val irIndexValues: List<IntermediateValue> defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[LocalVariableDescriptor]

'indexedSetCall' @ [54:9] ==> public final val indexedSetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'fillArrayAndIndexArguments' @ [54:25] ==> private final fun CallBuilder.fillArrayAndIndexArguments(arrayValue: IntermediateValue, indexValues: List<IntermediateValue>): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[SimpleFunctionDescriptorImpl]

'irArrayValue' @ [54:52] ==> val irArrayValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[LocalVariableDescriptor]

'irIndexValues' @ [54:66] ==> val irIndexValues: List<IntermediateValue> defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[LocalVariableDescriptor]

'LValueWithGetterAndSetterCalls' @ [55:24] ==> public constructor LValueWithGetterAndSetterCalls(callGenerator: CallGenerator, getterCall: CallBuilder?, setterCall: CallBuilder?, type: KotlinType, startOffset: Int, endOffset: Int, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.LValueWithGetterAndSetterCalls[ClassConstructorDescriptorImpl]

'callGenerator' @ [55:55] ==> public final val callGenerator: CallGenerator defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'indexedGetCall' @ [55:70] ==> public final val indexedGetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'indexedSetCall' @ [55:86] ==> public final val indexedSetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'type' @ [55:102] ==> private final val type: KotlinType defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'startOffset' @ [55:108] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'endOffset' @ [55:121] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'origin' @ [55:132] ==> public final val origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'irBlock' @ [56:9] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[LocalVariableDescriptor]

'inlineStatement' @ [56:17] ==> public fun IrBlockImpl.inlineStatement(statement: IrStatement): Unit defined in org.jetbrains.kotlin.ir.expressions.impl[DeserializedSimpleFunctionDescriptor]

'invoke' @ [56:33] ==> public abstract operator fun invoke(p1: LValue): IrExpression defined in kotlin.Function1[FunctionInvokeDescriptor]

'irLValue' @ [56:44] ==> val irLValue: LValueWithGetterAndSetterCalls defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[LocalVariableDescriptor]

'irBlock' @ [58:16] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[LocalVariableDescriptor]

'indexedSetCall' @ [62:13] ==> public final val indexedSetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'AssertionError' @ [62:43] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'indexedSetCall' @ [63:9] ==> public final val indexedSetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'setExplicitReceiverValue' @ [63:24] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'OnceExpressionValue' @ [63:49] ==> public constructor OnceExpressionValue(irExpression: IrExpression) defined in org.jetbrains.kotlin.psi2ir.intermediate.OnceExpressionValue[ClassConstructorDescriptorImpl]

'irArray' @ [63:69] ==> public final val irArray: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'irIndices' @ [64:9] ==> public final val irIndices: List<IrExpression> defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'forEachIndexed' @ [64:19] ==> public inline fun <T> Iterable<IrExpression>.forEachIndexed(action: (index: Int, IrExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'indexedSetCall' @ [65:13] ==> public final val indexedSetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'irValueArgumentsByIndex' @ [65:28] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'i' @ [65:52] ==> value-parameter i: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign.<anonymous>[ValueParameterDescriptorImpl]

'irIndex' @ [65:57] ==> value-parameter irIndex: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign.<anonymous>[ValueParameterDescriptorImpl]

'indexedSetCall' @ [67:9] ==> public final val indexedSetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'lastArgument' @ [67:24] ==> public var CallBuilder.lastArgument: IrExpression? defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[PropertyDescriptorImpl]

'value' @ [67:39] ==> value-parameter value: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.assign[ValueParameterDescriptorImpl]

'callGenerator' @ [68:16] ==> public final val callGenerator: CallGenerator defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'generateCall' @ [68:30] ==> public final fun generateCall(startOffset: Int, endOffset: Int, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [68:43] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'endOffset' @ [68:56] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'indexedSetCall' @ [68:67] ==> public final val indexedSetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[PropertyDescriptorImpl]

'EQ' @ [68:101] ==> public object EQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'setExplicitReceiverValue' @ [72:9] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'arrayValue' @ [72:34] ==> value-parameter arrayValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.fillArrayAndIndexArguments[ValueParameterDescriptorImpl]

'indexValues' @ [73:9] ==> value-parameter indexValues: List<IntermediateValue> defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.fillArrayAndIndexArguments[ValueParameterDescriptorImpl]

'forEachIndexed' @ [73:21] ==> public inline fun <T> Iterable<IntermediateValue>.forEachIndexed(action: (index: Int, IntermediateValue) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntermediateValue

'irValueArgumentsByIndex' @ [74:13] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'i' @ [74:37] ==> value-parameter i: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.fillArrayAndIndexArguments.<anonymous>[ValueParameterDescriptorImpl]

'irIndexValue' @ [74:42] ==> value-parameter irIndexValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver.fillArrayAndIndexArguments.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [74:55] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

