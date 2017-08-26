'PrimitiveNumberRangeIntrinsicRangeValue' @ [29:95] ==> public constructor PrimitiveNumberRangeIntrinsicRangeValue(rangeCall: ResolvedCall<out CallableDescriptor>) defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue[ClassConstructorDescriptorImpl]

'rangeCall' @ [29:135] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.<init>[ValueParameterDescriptorImpl]

'SimpleBoundedValue' @ [31:13] ==> public constructor SimpleBoundedValue(codegen: ExpressionCodegen, rangeCall: ResolvedCall<out CallableDescriptor>, isLowInclusive: Boolean = ..., isHighInclusive: Boolean = ...) defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue[ClassConstructorDescriptorImpl]

'codegen' @ [31:32] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.getBoundedValue[ValueParameterDescriptorImpl]

'rangeCall' @ [31:41] ==> protected final val rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue[PropertyDescriptorImpl]

'getConstRangeForInRangeLiteralGenerator' @ [34:13] ==> private final fun getConstRangeForInRangeLiteralGenerator(codegen: ExpressionCodegen, forExpression: KtForExpression): ForLoopGenerator? defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue[SimpleFunctionDescriptorImpl]

'codegen' @ [34:53] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.createForLoopGenerator[ValueParameterDescriptorImpl]

'forExpression' @ [34:62] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.createForLoopGenerator[ValueParameterDescriptorImpl]

'ForInRangeLiteralLoopGenerator' @ [35:13] ==> public constructor ForInRangeLiteralLoopGenerator(codegen: ExpressionCodegen, forExpression: KtForExpression, loopRangeCall: ResolvedCall<*>) defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInRangeLiteralLoopGenerator[ClassConstructorDescriptorImpl]

'codegen' @ [35:44] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.createForLoopGenerator[ValueParameterDescriptorImpl]

'forExpression' @ [35:53] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.createForLoopGenerator[ValueParameterDescriptorImpl]

'rangeCall' @ [35:68] ==> protected final val rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue[PropertyDescriptorImpl]

'rangeCall' @ [38:29] ==> protected final val rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue[PropertyDescriptorImpl]

'valueArgumentsByIndex' @ [38:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArgumentsByIndex: (MutableList<(ResolvedValueArgument..ResolvedValueArgument?)>?..List<(ResolvedValueArgument..ResolvedValueArgument?)>?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'run' @ [38:62] ==> @InlineOnly public inline fun <T, R> (MutableList<(ResolvedValueArgument..ResolvedValueArgument?)>..List<(ResolvedValueArgument..ResolvedValueArgument?)>).run(block: ((MutableList<(ResolvedValueArgument..ResolvedValueArgument?)>..List<(ResolvedValueArgument..ResolvedValueArgument?)>)).() -> KtExpression?): KtExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)>..kotlin.collections.List<(org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)>)
    <R> -> KtExpression?

'get' @ [38:68] ==> public abstract fun get(index: Int): (ResolvedValueArgument..ResolvedValueArgument?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'arguments' @ [38:75] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'getArgumentExpression' @ [38:88] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'codegen' @ [39:26] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.getConstRangeForInRangeLiteralGenerator[ValueParameterDescriptorImpl]

'getCompileTimeConstant' @ [39:34] ==> @Nullable public open fun getCompileTimeConstant(@NotNull expression: KtExpression): ConstantValue<*>? defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'rhsExpression' @ [39:57] ==> val rhsExpression: KtExpression defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.getConstRangeForInRangeLiteralGenerator[LocalVariableDescriptor]

'safeAs' @ [39:72] ==> public inline fun <reified T : Any> Any?.safeAs(): IntegerValueConstant<*>? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> IntegerValueConstant<*>

'when (constValue) {
            is ByteValue -> constValue.value + 1
            is ShortValue -> constValue.value + 1
            is IntValue -> constValue.value + 1
            else -> return null
        }' @ [40:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'constValue' @ [40:32] ==> val constValue: IntegerValueConstant<*> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.getConstRangeForInRangeLiteralGenerator[LocalVariableDescriptor]

'constValue' @ [41:29] ==> val constValue: IntegerValueConstant<*> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.getConstRangeForInRangeLiteralGenerator[LocalVariableDescriptor]

'value' @ [41:40] ==> public open val value: Byte defined in org.jetbrains.kotlin.resolve.constants.ByteValue[DeserializedPropertyDescriptor]

'constValue' @ [42:30] ==> val constValue: IntegerValueConstant<*> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.getConstRangeForInRangeLiteralGenerator[LocalVariableDescriptor]

'value' @ [42:41] ==> public open val value: Short defined in org.jetbrains.kotlin.resolve.constants.ShortValue[DeserializedPropertyDescriptor]

'constValue' @ [43:28] ==> val constValue: IntegerValueConstant<*> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.getConstRangeForInRangeLiteralGenerator[LocalVariableDescriptor]

'value' @ [43:39] ==> public open val value: Int defined in org.jetbrains.kotlin.resolve.constants.IntValue[DeserializedPropertyDescriptor]

'untilValue' @ [47:13] ==> val untilValue: Int defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.getConstRangeForInRangeLiteralGenerator[LocalVariableDescriptor]

'MIN_VALUE' @ [47:31] ==> public const final val MIN_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'ForInUntilConstantRangeLoopGenerator' @ [48:16] ==> public constructor ForInUntilConstantRangeLoopGenerator(codegen: ExpressionCodegen, forExpression: KtForExpression, loopRangeCall: ResolvedCall<*>, untilValue: Int) defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInUntilConstantRangeLoopGenerator[ClassConstructorDescriptorImpl]

'codegen' @ [48:53] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.getConstRangeForInRangeLiteralGenerator[ValueParameterDescriptorImpl]

'forExpression' @ [48:62] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.getConstRangeForInRangeLiteralGenerator[ValueParameterDescriptorImpl]

'rangeCall' @ [48:77] ==> protected final val rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue[PropertyDescriptorImpl]

'untilValue' @ [48:88] ==> val untilValue: Int defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue.getConstRangeForInRangeLiteralGenerator[LocalVariableDescriptor]

