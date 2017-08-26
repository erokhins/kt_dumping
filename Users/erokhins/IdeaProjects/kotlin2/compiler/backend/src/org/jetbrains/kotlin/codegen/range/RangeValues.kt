'getResolvedCallForRangeExpression' @ [36:5] ==> private fun getResolvedCallForRangeExpression(bindingContext: BindingContext, rangeExpression: KtExpression): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.codegen.range in file RangeValues.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [36:39] ==> public final val ExpressionCodegen.bindingContext: BindingContext[MyPropertyDescriptor]

'rangeExpression' @ [36:55] ==> value-parameter rangeExpression: KtExpression defined in org.jetbrains.kotlin.codegen.range.createRangeValueForExpression[ValueParameterDescriptorImpl]

'let' @ [36:73] ==> @InlineOnly public inline fun <T, R> ResolvedCall<out CallableDescriptor>.let(block: (ResolvedCall<out CallableDescriptor>) -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<out CallableDescriptor>
    <R> -> Nothing?

'createIntrinsifiedRangeValueOrNull' @ [37:9] ==> private fun ExpressionCodegen.createIntrinsifiedRangeValueOrNull(rangeCall: ResolvedCall<out CallableDescriptor>): RangeValue? defined in org.jetbrains.kotlin.codegen.range in file RangeValues.kt[SimpleFunctionDescriptorImpl]

'it' @ [37:44] ==> value-parameter it: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.createRangeValueForExpression.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [37:49] ==> @InlineOnly public inline fun <T, R> RangeValue.let(block: (RangeValue) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeValue
    <R> -> Nothing

'it' @ [38:20] ==> value-parameter it: RangeValue defined in org.jetbrains.kotlin.codegen.range.createRangeValueForExpression.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [42:21] ==> public final val ExpressionCodegen.bindingContext: BindingContext[MyPropertyDescriptor]

'getType' @ [42:36] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'rangeExpression' @ [42:44] ==> value-parameter rangeExpression: KtExpression defined in org.jetbrains.kotlin.codegen.range.createRangeValueForExpression[ValueParameterDescriptorImpl]

'asmType' @ [43:24] ==> @NotNull public open fun asmType(@NotNull type: KotlinType): Type defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'rangeType' @ [43:32] ==> val rangeType: KotlinType defined in org.jetbrains.kotlin.codegen.range.createRangeValueForExpression[LocalVariableDescriptor]

'when {
        asmRangeType.sort == Type.ARRAY ->
            ArrayRangeValue()
        isPrimitiveRange(rangeType) ->
            PrimitiveRangeRangeValue()
        isPrimitiveProgression(rangeType) ->
            PrimitiveProgressionRangeValue()
        isSubtypeOfCharSequence(rangeType, state.module.builtIns) ->
            CharSequenceRangeValue()
        else ->
            IterableRangeValue()
    }' @ [45:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: RangeValue, entry1: RangeValue, entry2: RangeValue, entry3: RangeValue, entry4: RangeValue): RangeValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> RangeValue

'asmRangeType' @ [46:9] ==> val asmRangeType: Type defined in org.jetbrains.kotlin.codegen.range.createRangeValueForExpression[LocalVariableDescriptor]

'sort' @ [46:22] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'ARRAY' @ [46:35] ==> public const final val ARRAY: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'ArrayRangeValue' @ [47:13] ==> public constructor ArrayRangeValue() defined in org.jetbrains.kotlin.codegen.range.ArrayRangeValue[ClassConstructorDescriptorImpl]

'isPrimitiveRange' @ [48:9] ==> public fun isPrimitiveRange(rangeType: KotlinType): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'rangeType' @ [48:26] ==> val rangeType: KotlinType defined in org.jetbrains.kotlin.codegen.range.createRangeValueForExpression[LocalVariableDescriptor]

'PrimitiveRangeRangeValue' @ [49:13] ==> public constructor PrimitiveRangeRangeValue() defined in org.jetbrains.kotlin.codegen.range.PrimitiveRangeRangeValue[ClassConstructorDescriptorImpl]

'isPrimitiveProgression' @ [50:9] ==> public fun isPrimitiveProgression(rangeType: KotlinType): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'rangeType' @ [50:32] ==> val rangeType: KotlinType defined in org.jetbrains.kotlin.codegen.range.createRangeValueForExpression[LocalVariableDescriptor]

'PrimitiveProgressionRangeValue' @ [51:13] ==> public constructor PrimitiveProgressionRangeValue() defined in org.jetbrains.kotlin.codegen.range.PrimitiveProgressionRangeValue[ClassConstructorDescriptorImpl]

'isSubtypeOfCharSequence' @ [52:9] ==> private fun isSubtypeOfCharSequence(type: KotlinType, builtIns: KotlinBuiltIns): Boolean defined in org.jetbrains.kotlin.codegen.range in file RangeValues.kt[SimpleFunctionDescriptorImpl]

'rangeType' @ [52:33] ==> val rangeType: KotlinType defined in org.jetbrains.kotlin.codegen.range.createRangeValueForExpression[LocalVariableDescriptor]

'state' @ [52:44] ==> public final val ExpressionCodegen.state: GenerationState[MyPropertyDescriptor]

'module' @ [52:50] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'builtIns' @ [52:57] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'CharSequenceRangeValue' @ [53:13] ==> public constructor CharSequenceRangeValue() defined in org.jetbrains.kotlin.codegen.range.CharSequenceRangeValue[ClassConstructorDescriptorImpl]

'IterableRangeValue' @ [55:13] ==> public constructor IterableRangeValue() defined in org.jetbrains.kotlin.codegen.range.IterableRangeValue[ClassConstructorDescriptorImpl]

'DEFAULT' @ [60:27] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [60:35] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'type' @ [60:47] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.codegen.range.isSubtypeOfCharSequence[ValueParameterDescriptorImpl]

'builtIns' @ [60:53] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.codegen.range.isSubtypeOfCharSequence[ValueParameterDescriptorImpl]

'getBuiltInClassByName' @ [60:62] ==> @NotNull public open fun getBuiltInClassByName(@NotNull p0: Name): ClassDescriptor defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'identifier' @ [60:89] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'defaultType' @ [60:117] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'?:' @ [66:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'deparenthesize' @ [66:32] ==> @Nullable public open fun deparenthesize(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'rangeExpression' @ [66:47] ==> value-parameter rangeExpression: KtExpression defined in org.jetbrains.kotlin.codegen.range.getResolvedCallForRangeExpression[ValueParameterDescriptorImpl]

'when (expression) {
        is KtQualifiedExpression ->
            expression.selectorExpression.let { selector ->
                if (selector is KtCallExpression || selector is KtSimpleNameExpression)
                    selector.getResolvedCall(bindingContext)
                else
                    null
            }

        is KtSimpleNameExpression, is KtCallExpression ->
            expression.getResolvedCall(bindingContext)
        is KtBinaryExpression ->
            expression.operationReference.getResolvedCall(bindingContext)
        else ->
            null
    }' @ [68:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ResolvedCall<out CallableDescriptor>?, entry1: ResolvedCall<out CallableDescriptor>?, entry2: ResolvedCall<out CallableDescriptor>?, entry3: ResolvedCall<out CallableDescriptor>?): ResolvedCall<out CallableDescriptor>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ResolvedCall<out CallableDescriptor>?

'expression' @ [68:18] ==> val expression: KtExpression defined in org.jetbrains.kotlin.codegen.range.getResolvedCallForRangeExpression[LocalVariableDescriptor]

'expression' @ [70:13] ==> val expression: KtExpression defined in org.jetbrains.kotlin.codegen.range.getResolvedCallForRangeExpression[LocalVariableDescriptor]

'selectorExpression' @ [70:24] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'let' @ [70:43] ==> @InlineOnly public inline fun <T, R> KtExpression?.let(block: (KtExpression?) -> ResolvedCall<out CallableDescriptor>?): ResolvedCall<out CallableDescriptor>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?
    <R> -> ResolvedCall<out CallableDescriptor>?

'if (selector is KtCallExpression || selector is KtSimpleNameExpression)
                    selector.getResolvedCall(bindingContext)
                else
                    null' @ [71:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolvedCall<out CallableDescriptor>?, elseBranch: ResolvedCall<out CallableDescriptor>?): ResolvedCall<out CallableDescriptor>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolvedCall<out CallableDescriptor>?

'selector' @ [71:21] ==> value-parameter selector: KtExpression? defined in org.jetbrains.kotlin.codegen.range.getResolvedCallForRangeExpression.<anonymous>[ValueParameterDescriptorImpl]

'selector' @ [71:53] ==> value-parameter selector: KtExpression? defined in org.jetbrains.kotlin.codegen.range.getResolvedCallForRangeExpression.<anonymous>[ValueParameterDescriptorImpl]

'selector' @ [72:21] ==> value-parameter selector: KtExpression? defined in org.jetbrains.kotlin.codegen.range.getResolvedCallForRangeExpression.<anonymous>[ValueParameterDescriptorImpl]

'getResolvedCall' @ [72:30] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [72:46] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.range.getResolvedCallForRangeExpression[ValueParameterDescriptorImpl]

'expression' @ [78:13] ==> val expression: KtExpression defined in org.jetbrains.kotlin.codegen.range.getResolvedCallForRangeExpression[LocalVariableDescriptor]

'getResolvedCall' @ [78:24] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [78:40] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.range.getResolvedCallForRangeExpression[ValueParameterDescriptorImpl]

'expression' @ [80:13] ==> val expression: KtExpression defined in org.jetbrains.kotlin.codegen.range.getResolvedCallForRangeExpression[LocalVariableDescriptor]

'operationReference' @ [80:24] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getResolvedCall' @ [80:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [80:59] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.range.getResolvedCallForRangeExpression[ValueParameterDescriptorImpl]

'rangeCall' @ [87:23] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [87:33] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'when {
        isPrimitiveNumberRangeTo(rangeCallee) ->
            PrimitiveNumberRangeLiteralRangeValue(rangeCall)
        isPrimitiveNumberDownTo(rangeCallee) ->
            DownToProgressionRangeValue(rangeCall)
        isPrimitiveNumberUntil(rangeCallee) ->
            PrimitiveNumberUntilRangeValue(rangeCall)
        isArrayOrPrimitiveArrayIndices(rangeCallee) ->
            ArrayIndicesRangeValue(rangeCall)
        isCollectionIndices(rangeCallee) ->
            CollectionIndicesRangeValue(rangeCall)
        isCharSequenceIndices(rangeCallee) ->
            CharSequenceIndicesRangeValue(rangeCall)
        isComparableRangeTo(rangeCallee) ->
            ComparableRangeLiteralRangeValue(this, rangeCall)
        else ->
            null
    }' @ [89:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: RangeValue?, entry1: RangeValue?, entry2: RangeValue?, entry3: RangeValue?, entry4: RangeValue?, entry5: RangeValue?, entry6: RangeValue?, entry7: RangeValue?): RangeValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> RangeValue?

'isPrimitiveNumberRangeTo' @ [90:9] ==> public fun isPrimitiveNumberRangeTo(rangeTo: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'rangeCallee' @ [90:34] ==> val rangeCallee: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[LocalVariableDescriptor]

'PrimitiveNumberRangeLiteralRangeValue' @ [91:13] ==> public constructor PrimitiveNumberRangeLiteralRangeValue(rangeCall: ResolvedCall<out CallableDescriptor>) defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeLiteralRangeValue[ClassConstructorDescriptorImpl]

'rangeCall' @ [91:51] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[ValueParameterDescriptorImpl]

'isPrimitiveNumberDownTo' @ [92:9] ==> public fun isPrimitiveNumberDownTo(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'rangeCallee' @ [92:33] ==> val rangeCallee: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[LocalVariableDescriptor]

'DownToProgressionRangeValue' @ [93:13] ==> public constructor DownToProgressionRangeValue(rangeCall: ResolvedCall<out CallableDescriptor>) defined in org.jetbrains.kotlin.codegen.range.DownToProgressionRangeValue[ClassConstructorDescriptorImpl]

'rangeCall' @ [93:41] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[ValueParameterDescriptorImpl]

'isPrimitiveNumberUntil' @ [94:9] ==> public fun isPrimitiveNumberUntil(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'rangeCallee' @ [94:32] ==> val rangeCallee: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[LocalVariableDescriptor]

'PrimitiveNumberUntilRangeValue' @ [95:13] ==> public constructor PrimitiveNumberUntilRangeValue(rangeCall: ResolvedCall<out CallableDescriptor>) defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberUntilRangeValue[ClassConstructorDescriptorImpl]

'rangeCall' @ [95:44] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[ValueParameterDescriptorImpl]

'isArrayOrPrimitiveArrayIndices' @ [96:9] ==> public fun isArrayOrPrimitiveArrayIndices(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'rangeCallee' @ [96:40] ==> val rangeCallee: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[LocalVariableDescriptor]

'ArrayIndicesRangeValue' @ [97:13] ==> public constructor ArrayIndicesRangeValue(rangeCall: ResolvedCall<out CallableDescriptor>) defined in org.jetbrains.kotlin.codegen.range.ArrayIndicesRangeValue[ClassConstructorDescriptorImpl]

'rangeCall' @ [97:36] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[ValueParameterDescriptorImpl]

'isCollectionIndices' @ [98:9] ==> public fun isCollectionIndices(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'rangeCallee' @ [98:29] ==> val rangeCallee: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[LocalVariableDescriptor]

'CollectionIndicesRangeValue' @ [99:13] ==> public constructor CollectionIndicesRangeValue(rangeCall: ResolvedCall<out CallableDescriptor>) defined in org.jetbrains.kotlin.codegen.range.CollectionIndicesRangeValue[ClassConstructorDescriptorImpl]

'rangeCall' @ [99:41] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[ValueParameterDescriptorImpl]

'isCharSequenceIndices' @ [100:9] ==> public fun isCharSequenceIndices(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'rangeCallee' @ [100:31] ==> val rangeCallee: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[LocalVariableDescriptor]

'CharSequenceIndicesRangeValue' @ [101:13] ==> public constructor CharSequenceIndicesRangeValue(rangeCall: ResolvedCall<out CallableDescriptor>) defined in org.jetbrains.kotlin.codegen.range.CharSequenceIndicesRangeValue[ClassConstructorDescriptorImpl]

'rangeCall' @ [101:43] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[ValueParameterDescriptorImpl]

'isComparableRangeTo' @ [102:9] ==> public fun isComparableRangeTo(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'rangeCallee' @ [102:29] ==> val rangeCallee: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[LocalVariableDescriptor]

'ComparableRangeLiteralRangeValue' @ [103:13] ==> public constructor ComparableRangeLiteralRangeValue(codegen: ExpressionCodegen, rangeCall: ResolvedCall<out CallableDescriptor>) defined in org.jetbrains.kotlin.codegen.range.ComparableRangeLiteralRangeValue[ClassConstructorDescriptorImpl]

'this' @ [103:46] ==> <this> defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[ReceiverParameterDescriptorImpl]

'rangeCall' @ [103:52] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.createIntrinsifiedRangeValueOrNull[ValueParameterDescriptorImpl]

