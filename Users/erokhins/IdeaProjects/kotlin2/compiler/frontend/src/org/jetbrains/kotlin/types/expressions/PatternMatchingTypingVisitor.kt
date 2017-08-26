'ExpressionTypingVisitor' @ [45:94] ==> protected/*protected and package*/ constructor ExpressionTypingVisitor(@NotNull facade: ExpressionTypingInternals) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitor[JavaClassConstructorDescriptor]

'facade' @ [45:118] ==> value-parameter facade: ExpressionTypingInternals defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.<init>[ValueParameterDescriptorImpl]

'contextWithExpectedType' @ [48:23] ==> value-parameter contextWithExpectedType: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'replaceExpectedType' @ [48:47] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'NO_EXPECTED_TYPE' @ [48:67] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'replaceContextDependency' @ [48:85] ==> @NotNull public open fun replaceContextDependency(@NotNull newContextDependency: ContextDependency): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'INDEPENDENT' @ [48:110] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'expression' @ [49:28] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'leftHandSide' @ [49:39] ==> public final val KtIsExpression.leftHandSide: KtExpression[MyPropertyDescriptor]

'facade' @ [50:24] ==> protected/*protected and package*/ final val facade: (ExpressionTypingInternals..ExpressionTypingInternals?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'safeGetTypeInfo' @ [50:31] ==> @NotNull public abstract fun safeGetTypeInfo(@NotNull expression: KtExpression, context: (ExpressionTypingContext..ExpressionTypingContext?)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingInternals[JavaMethodDescriptor]

'leftHandSide' @ [50:47] ==> val leftHandSide: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'context' @ [50:61] ==> val context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'typeInfo' @ [51:25] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'type' @ [51:34] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'expression' @ [52:29] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'typeReference' @ [52:40] ==> public final val KtIsExpression.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [53:13] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'knownType' @ [53:38] ==> val knownType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'DataFlowValueFactory' @ [54:33] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [54:54] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'leftHandSide' @ [54:74] ==> val leftHandSide: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'knownType' @ [54:88] ==> val knownType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'context' @ [54:99] ==> val context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'checkTypeForIs' @ [55:33] ==> private final fun checkTypeForIs(context: ExpressionTypingContext, isCheck: KtElement, negated: Boolean, subjectType: KotlinType, typeReferenceAfterIs: KtTypeReference, subjectDataFlowValue: DataFlowValue): PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'context' @ [55:48] ==> val context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'expression' @ [55:57] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'expression' @ [55:69] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'isNegated' @ [55:80] ==> public final val KtIsExpression.isNegated: Boolean[MyPropertyDescriptor]

'knownType' @ [55:91] ==> val knownType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'typeReference' @ [55:102] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'dataFlowValue' @ [55:117] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'thenInfo' @ [55:132] ==> public final val thenInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'conditionInfo' @ [56:35] ==> val conditionInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'and' @ [56:49] ==> public abstract fun and(other: DataFlowInfo): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'typeInfo' @ [56:53] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'dataFlowInfo' @ [56:62] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'context' @ [57:13] ==> val context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'trace' @ [57:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'record' @ [57:27] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtExpression..KtExpression?), (DataFlowInfo..DataFlowInfo?)>..WritableSlice<(KtExpression..KtExpression?), (DataFlowInfo..DataFlowInfo?)>?), key: (KtExpression..KtExpression?), value: (DataFlowInfo..DataFlowInfo?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo..org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo?)

'DATAFLOW_INFO_AFTER_CONDITION' @ [57:49] ==> public final val DATAFLOW_INFO_AFTER_CONDITION: (WritableSlice<(KtExpression..KtExpression?), (DataFlowInfo..DataFlowInfo?)>..WritableSlice<(KtExpression..KtExpression?), (DataFlowInfo..DataFlowInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [57:80] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'newDataFlowInfo' @ [57:92] ==> val newDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'components' @ [60:30] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'dataFlowAnalyzer' @ [60:41] ==> public/*package*/ final var dataFlowAnalyzer: (DataFlowAnalyzer..DataFlowAnalyzer?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'checkType' @ [60:58] ==> @NotNull public open fun checkType(@NotNull typeInfo: KotlinTypeInfo, @NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'typeInfo' @ [60:68] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'replaceType' @ [60:77] ==> public final fun replaceType(type: KotlinType?): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[SimpleFunctionDescriptorImpl]

'components' @ [60:89] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'builtIns' @ [60:100] ==> public/*package*/ final var builtIns: (KotlinBuiltIns..KotlinBuiltIns?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'booleanType' @ [60:109] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'expression' @ [60:123] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'contextWithExpectedType' @ [60:135] ==> value-parameter contextWithExpectedType: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'typeReference' @ [62:13] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'context' @ [63:27] ==> val context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'trace' @ [63:35] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'TYPE' @ [63:56] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [63:62] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'RttiExpressionInformation' @ [64:35] ==> public constructor RttiExpressionInformation(subject: KtExpression, sourceType: KotlinType?, targetType: KotlinType?, operation: RttiOperation) defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiExpressionInformation[ClassConstructorDescriptorImpl]

'leftHandSide' @ [65:31] ==> val leftHandSide: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'knownType' @ [66:34] ==> val knownType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'rhsType' @ [67:34] ==> val rhsType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'if (expression.isNegated) RttiOperation.NOT_IS else RttiOperation.IS' @ [68:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: RttiOperation, elseBranch: RttiOperation): RttiOperation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> RttiOperation

'expression' @ [68:37] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'isNegated' @ [68:48] ==> public final val KtIsExpression.isNegated: Boolean[MyPropertyDescriptor]

'NOT_IS' @ [68:73] ==> enum entry NOT_IS defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiOperation[FakeCallableDescriptorForObject]

'IS' @ [68:99] ==> enum entry IS defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiOperation[FakeCallableDescriptorForObject]

'components' @ [70:13] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'rttiExpressionCheckers' @ [70:24] ==> public/*package*/ final var rttiExpressionCheckers: (MutableIterable<(RttiExpressionChecker..RttiExpressionChecker?)>..Iterable<(RttiExpressionChecker..RttiExpressionChecker?)>?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'forEach' @ [70:47] ==> @HidesMembers public inline fun <T> Iterable<(RttiExpressionChecker..RttiExpressionChecker?)>.forEach(action: ((RttiExpressionChecker..RttiExpressionChecker?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.checkers.RttiExpressionChecker..org.jetbrains.kotlin.resolve.calls.checkers.RttiExpressionChecker?)

'it' @ [71:17] ==> value-parameter it: (RttiExpressionChecker..RttiExpressionChecker?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression.<anonymous>[ValueParameterDescriptorImpl]

'check' @ [71:20] ==> public abstract fun check(rttiInformation: RttiExpressionInformation, reportOn: PsiElement, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiExpressionChecker[SimpleFunctionDescriptorImpl]

'rttiInformation' @ [71:26] ==> val rttiInformation: RttiExpressionInformation defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'expression' @ [71:43] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'context' @ [71:55] ==> val context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'trace' @ [71:63] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'resultTypeInfo' @ [75:16] ==> val resultTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitIsExpression[LocalVariableDescriptor]

'visitWhenExpression' @ [79:13] ==> public final fun visitWhenExpression(expression: KtWhenExpression, contextWithExpectedType: ExpressionTypingContext, @Suppress isStatement: Boolean): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [79:33] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'context' @ [79:45] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'Suppress' @ [84:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'contextWithExpectedType' @ [86:21] ==> value-parameter contextWithExpectedType: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'trace' @ [86:45] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'WhenChecker' @ [87:9] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'checkDeprecatedWhenSyntax' @ [87:21] ==> public final fun checkDeprecatedWhenSyntax(trace: BindingTrace, expression: KtWhenExpression): Unit defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'trace' @ [87:47] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'expression' @ [87:54] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'WhenChecker' @ [88:9] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'checkReservedPrefix' @ [88:21] ==> public final fun checkReservedPrefix(trace: BindingTrace, expression: KtWhenExpression): Unit defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'trace' @ [88:41] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'expression' @ [88:48] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'components' @ [90:9] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'dataFlowAnalyzer' @ [90:20] ==> public/*package*/ final var dataFlowAnalyzer: (DataFlowAnalyzer..DataFlowAnalyzer?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'recordExpectedType' @ [90:37] ==> public open fun recordExpectedType(@NotNull trace: BindingTrace, @NotNull expression: KtExpression, @NotNull expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'trace' @ [90:56] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'expression' @ [90:63] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'contextWithExpectedType' @ [90:75] ==> value-parameter contextWithExpectedType: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'expectedType' @ [90:99] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'contextWithExpectedType' @ [92:36] ==> value-parameter contextWithExpectedType: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'replaceExpectedType' @ [92:60] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'NO_EXPECTED_TYPE' @ [92:80] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'replaceContextDependency' @ [92:98] ==> @NotNull public open fun replaceContextDependency(@NotNull newContextDependency: ContextDependency): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'INDEPENDENT' @ [92:123] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'expression' @ [94:33] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'subjectExpression' @ [94:44] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'subjectExpression' @ [96:31] ==> val subjectExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'let' @ [96:50] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinTypeInfo): KotlinTypeInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinTypeInfo

'facade' @ [96:56] ==> protected/*protected and package*/ final val facade: (ExpressionTypingInternals..ExpressionTypingInternals?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'getTypeInfo' @ [96:63] ==> @NotNull public abstract fun getTypeInfo(@NotNull expression: KtExpression, context: (ExpressionTypingContext..ExpressionTypingContext?)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingInternals[JavaMethodDescriptor]

'it' @ [96:75] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression.<anonymous>[ValueParameterDescriptorImpl]

'contextBeforeSubject' @ [96:79] ==> val contextBeforeSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'subjectTypeInfo' @ [97:35] ==> val subjectTypeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'let' @ [97:52] ==> @InlineOnly public inline fun <T, R> KotlinTypeInfo.let(block: (KotlinTypeInfo) -> ExpressionTypingContext): ExpressionTypingContext defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinTypeInfo
    <R> -> ExpressionTypingContext

'contextBeforeSubject' @ [97:58] ==> val contextBeforeSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'replaceDataFlowInfo' @ [97:79] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'it' @ [97:99] ==> value-parameter it: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression.<anonymous>[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [97:102] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'contextBeforeSubject' @ [97:121] ==> val contextBeforeSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'subjectTypeInfo' @ [98:27] ==> val subjectTypeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'type' @ [98:44] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'createErrorType' @ [98:63] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'subjectTypeInfo' @ [99:49] ==> val subjectTypeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'jumpOutPossible' @ [99:66] ==> public final val jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'subjectExpression' @ [100:36] ==> val subjectExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'let' @ [100:55] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> DataFlowValue): DataFlowValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> DataFlowValue

'DataFlowValueFactory' @ [101:13] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [101:34] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'it' @ [101:54] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression.<anonymous>[ValueParameterDescriptorImpl]

'subjectType' @ [101:58] ==> val subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'contextAfterSubject' @ [101:71] ==> val contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'nullValue' @ [102:28] ==> @JvmStatic public final fun nullValue(builtIns: KotlinBuiltIns): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Companion[SimpleFunctionDescriptorImpl]

'components' @ [102:38] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'builtIns' @ [102:49] ==> public/*package*/ final var builtIns: (KotlinBuiltIns..KotlinBuiltIns?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'subjectTypeInfo' @ [104:39] ==> val subjectTypeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'dataFlowInfo' @ [104:56] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'getStableTypes' @ [104:70] ==> public abstract fun getStableTypes(key: DataFlowValue): Set<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'subjectDataFlowValue' @ [104:85] ==> val subjectDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'emptySet' @ [104:110] ==> public fun <T> emptySet(): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'checkSmartCastsInSubjectIfRequired' @ [105:9] ==> private final fun checkSmartCastsInSubjectIfRequired(expression: KtWhenExpression, contextBeforeSubject: ExpressionTypingContext, subjectType: KotlinType, possibleTypesForSubject: Set<KotlinType>): Unit defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [105:44] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'contextBeforeSubject' @ [105:56] ==> val contextBeforeSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'subjectType' @ [105:78] ==> val subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'possibleTypesForSubject' @ [105:91] ==> val possibleTypesForSubject: Set<KotlinType> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'analyzeConditionsInWhenEntries' @ [107:38] ==> private final fun analyzeConditionsInWhenEntries(expression: KtWhenExpression, contextAfterSubject: ExpressionTypingContext, subjectDataFlowValue: DataFlowValue, subjectType: KotlinType): ArrayList<DataFlowInfo> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [107:69] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'contextAfterSubject' @ [107:81] ==> val contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'subjectDataFlowValue' @ [107:102] ==> val subjectDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'subjectType' @ [107:124] ==> val subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'inferTypeForWhenExpression' @ [108:30] ==> private final fun inferTypeForWhenExpression(expression: KtWhenExpression, contextWithExpectedType: ExpressionTypingContext, contextAfterSubject: ExpressionTypingContext, dataFlowInfoForEntries: List<DataFlowInfo>): KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [108:57] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'contextWithExpectedType' @ [108:69] ==> value-parameter contextWithExpectedType: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'contextAfterSubject' @ [108:94] ==> val contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'dataFlowInfoForEntries' @ [108:115] ==> val dataFlowInfoForEntries: ArrayList<DataFlowInfo> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'whenReturnType' @ [109:31] ==> val whenReturnType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'let' @ [109:47] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> DataFlowValue): DataFlowValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> DataFlowValue

'DataFlowValueFactory' @ [109:53] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [109:74] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expression' @ [109:94] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'it' @ [109:106] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression.<anonymous>[ValueParameterDescriptorImpl]

'contextAfterSubject' @ [109:110] ==> val contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'joinWhenExpressionBranches' @ [112:17] ==> private final fun joinWhenExpressionBranches(expression: KtWhenExpression, contextAfterSubject: ExpressionTypingContext, resultType: KotlinType?, jumpOutPossibleInSubject: Boolean, whenResultValue: DataFlowValue?): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [112:44] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'contextAfterSubject' @ [112:56] ==> val contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'whenReturnType' @ [112:77] ==> val whenReturnType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'jumpOutPossibleInSubject' @ [112:93] ==> val jumpOutPossibleInSubject: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'whenResultValue' @ [112:119] ==> val whenResultValue: DataFlowValue? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'WhenChecker' @ [114:28] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'isWhenExhaustive' @ [114:40] ==> @JvmStatic public final fun isWhenExhaustive(expression: KtWhenExpression, trace: BindingTrace): Boolean defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'expression' @ [114:57] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'trace' @ [114:69] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'branchesTypeInfo' @ [116:36] ==> val branchesTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'dataFlowInfo' @ [116:53] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'if (expression.elseExpression == null && !isExhaustive) {
            // Without else expression in non-exhaustive when, we *must* take initial data flow info into account,
            // because data flow can bypass all when branches in this case
            branchesDataFlowInfo.or(contextAfterSubject.dataFlowInfo)
        }
        else {
            branchesDataFlowInfo
        }' @ [117:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DataFlowInfo, elseBranch: DataFlowInfo): DataFlowInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DataFlowInfo

'expression' @ [117:38] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'elseExpression' @ [117:49] ==> public final val KtWhenExpression.elseExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [117:75] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExhaustive' @ [117:76] ==> val isExhaustive: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'branchesDataFlowInfo' @ [120:13] ==> val branchesDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'or' @ [120:34] ==> public abstract fun or(other: DataFlowInfo): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'contextAfterSubject' @ [120:37] ==> val contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'dataFlowInfo' @ [120:57] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'branchesDataFlowInfo' @ [123:13] ==> val branchesDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'whenReturnType' @ [126:13] ==> val whenReturnType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'isExhaustive' @ [126:39] ==> val isExhaustive: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'expression' @ [126:55] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'elseExpression' @ [126:66] ==> public final val KtWhenExpression.elseExpression: KtExpression?[MyPropertyDescriptor]

'isNothing' @ [126:107] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'whenReturnType' @ [126:117] ==> val whenReturnType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'trace' @ [127:13] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'record' @ [127:19] ==> public abstract fun <K : (Any..Any?)> record(slice: (WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?), key: (KtWhenExpression..KtWhenExpression?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtWhenExpression..org.jetbrains.kotlin.psi.KtWhenExpression?)

'IMPLICIT_EXHAUSTIVE_WHEN' @ [127:41] ==> public final val IMPLICIT_EXHAUSTIVE_WHEN: (WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [127:67] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'branchesTypeInfo' @ [130:28] ==> val branchesTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'type' @ [130:45] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'noTypeInfo' @ [130:60] ==> public fun noTypeInfo(dataFlowInfo: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'resultDataFlowInfo' @ [130:71] ==> val resultDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'components' @ [131:26] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'dataFlowAnalyzer' @ [131:37] ==> public/*package*/ final var dataFlowAnalyzer: (DataFlowAnalyzer..DataFlowAnalyzer?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'checkType' @ [131:54] ==> @Nullable public open fun checkType(@Nullable expressionType: KotlinType?, @NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinType? defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'branchesType' @ [131:64] ==> val branchesType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'expression' @ [131:78] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'contextWithExpectedType' @ [131:90] ==> value-parameter contextWithExpectedType: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'createTypeInfo' @ [133:16] ==> public fun createTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo, jumpPossible: Boolean, jumpFlowInfo: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'resultType' @ [133:31] ==> val resultType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'resultDataFlowInfo' @ [133:43] ==> val resultDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'branchesTypeInfo' @ [133:63] ==> val branchesTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[LocalVariableDescriptor]

'jumpOutPossible' @ [133:80] ==> public final val jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'contextWithExpectedType' @ [133:97] ==> value-parameter contextWithExpectedType: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [133:121] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'expression' @ [142:13] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[ValueParameterDescriptorImpl]

'entries' @ [142:24] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'all' @ [142:32] ==> public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.all(predicate: ((KtWhenEntry..KtWhenEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'it' @ [142:38] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [142:41] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'components' @ [143:20] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'builtIns' @ [143:31] ==> public/*package*/ final var builtIns: (KotlinBuiltIns..KotlinBuiltIns?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'unitType' @ [143:40] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'wrapWhenEntryExpressionsAsSpecialCallArguments' @ [146:42] ==> private final fun wrapWhenEntryExpressionsAsSpecialCallArguments(expression: KtWhenExpression): List<KtExpression> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [146:89] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[ValueParameterDescriptorImpl]

'createCallForSpecialConstruction' @ [147:27] ==> public/*package*/ open fun createCallForSpecialConstruction(@NotNull expression: KtExpression, @NotNull calleeExpression: KtExpression, @NotNull arguments: (MutableList<out (KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)): (Call..Call?) defined in org.jetbrains.kotlin.types.expressions.ControlStructureTypingUtils[JavaMethodDescriptor]

'expression' @ [147:60] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[ValueParameterDescriptorImpl]

'expression' @ [147:72] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[ValueParameterDescriptorImpl]

'wrappedArgumentExpressions' @ [147:84] ==> val wrappedArgumentExpressions: List<KtExpression> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[LocalVariableDescriptor]

'createDataFlowInfoForArgumentsOfWhenCall' @ [148:40] ==> public open fun createDataFlowInfoForArgumentsOfWhenCall(@NotNull callForWhen: Call, @NotNull subjectDataFlowInfo: DataFlowInfo, @NotNull entryDataFlowInfos: (MutableList<(DataFlowInfo..DataFlowInfo?)>..List<(DataFlowInfo..DataFlowInfo?)>)): (MutableDataFlowInfoForArguments..MutableDataFlowInfoForArguments?) defined in org.jetbrains.kotlin.types.expressions.ControlStructureTypingUtils[JavaMethodDescriptor]

'callForWhen' @ [148:81] ==> val callForWhen: (Call..Call?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[LocalVariableDescriptor]

'contextAfterSubject' @ [148:94] ==> value-parameter contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [148:114] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'dataFlowInfoForEntries' @ [148:128] ==> value-parameter dataFlowInfoForEntries: List<DataFlowInfo> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[ValueParameterDescriptorImpl]

'components' @ [150:28] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'controlStructureTypingUtils' @ [150:39] ==> public/*package*/ final var controlStructureTypingUtils: (ControlStructureTypingUtils..ControlStructureTypingUtils?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'resolveSpecialConstructionAsCall' @ [150:67] ==> public/*package*/ open fun resolveSpecialConstructionAsCall(@NotNull call: Call, @NotNull construct: ControlStructureTypingUtils.ResolveConstruct, @NotNull argumentNames: (MutableList<(String..String?)>..List<(String..String?)>), @NotNull isArgumentNullable: (MutableList<(Boolean..Boolean?)>..List<(Boolean..Boolean?)>), @NotNull context: ExpressionTypingContext, @Nullable dataFlowInfoForArguments: MutableDataFlowInfoForArguments?): (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.types.expressions.ControlStructureTypingUtils[JavaMethodDescriptor]

'callForWhen' @ [151:17] ==> val callForWhen: (Call..Call?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[LocalVariableDescriptor]

'WHEN' @ [151:47] ==> enum entry WHEN defined in org.jetbrains.kotlin.types.expressions.ControlStructureTypingUtils.ResolveConstruct[FakeCallableDescriptorForObject]

'AbstractList<String>' @ [152:26] ==> protected/*protected and package*/ constructor AbstractList<E : (Any..Any?)>() defined in java.util.AbstractList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'index' @ [153:67] ==> value-parameter index: Int defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression.<no name provided>.get[ValueParameterDescriptorImpl]

'wrappedArgumentExpressions' @ [154:52] ==> val wrappedArgumentExpressions: List<KtExpression> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[LocalVariableDescriptor]

'size' @ [154:79] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'nCopies' @ [156:29] ==> public open fun <T : (Any..Any?)> nCopies(p0: Int, p1: (Boolean..Boolean?)): (MutableList<(Boolean..Boolean?)>..List<(Boolean..Boolean?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'wrappedArgumentExpressions' @ [156:37] ==> val wrappedArgumentExpressions: List<KtExpression> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[LocalVariableDescriptor]

'size' @ [156:64] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'contextWithExpectedType' @ [157:17] ==> value-parameter contextWithExpectedType: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[ValueParameterDescriptorImpl]

'dataFlowInfoForArguments' @ [157:42] ==> val dataFlowInfoForArguments: (MutableDataFlowInfoForArguments..MutableDataFlowInfoForArguments?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[LocalVariableDescriptor]

'resolvedCall' @ [159:16] ==> val resolvedCall: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.inferTypeForWhenExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [159:29] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'returnType' @ [159:49] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'KtPsiFactory' @ [163:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'expression' @ [163:39] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.wrapWhenEntryExpressionsAsSpecialCallArguments[ValueParameterDescriptorImpl]

'expression' @ [164:16] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.wrapWhenEntryExpressionsAsSpecialCallArguments[ValueParameterDescriptorImpl]

'entries' @ [164:27] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'mapNotNull' @ [164:35] ==> public inline fun <T, R : Any> Iterable<(KtWhenEntry..KtWhenEntry?)>.mapNotNull(transform: ((KtWhenEntry..KtWhenEntry?)) -> KtBlockExpression?): List<KtBlockExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)
    <R : Any> -> KtBlockExpression

'whenEntry' @ [165:13] ==> value-parameter whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.wrapWhenEntryExpressionsAsSpecialCallArguments.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [165:23] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'let' @ [165:35] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtBlockExpression): KtBlockExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtBlockExpression

'psiFactory' @ [165:41] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.wrapWhenEntryExpressionsAsSpecialCallArguments[LocalVariableDescriptor]

'wrapInABlockWrapper' @ [165:52] ==> public final fun wrapInABlockWrapper(expression: KtExpression): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'it' @ [165:72] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.wrapWhenEntryExpressionsAsSpecialCallArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [175:33] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[ValueParameterDescriptorImpl]

'subjectExpression' @ [175:44] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'ArrayList' @ [177:37] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DataFlowInfo

'contextAfterSubject' @ [178:33] ==> value-parameter contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [178:53] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'expression' @ [179:27] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[ValueParameterDescriptorImpl]

'entries' @ [179:38] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'analyzeWhenEntryConditions' @ [180:34] ==> private final fun analyzeWhenEntryConditions(whenEntry: KtWhenEntry, context: ExpressionTypingContext, subjectExpression: KtExpression?, subjectType: KotlinType, subjectDataFlowValue: DataFlowValue): PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'whenEntry' @ [180:61] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[LocalVariableDescriptor]

'contextAfterSubject' @ [181:61] ==> value-parameter contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[ValueParameterDescriptorImpl]

'replaceDataFlowInfo' @ [181:81] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'inputDataFlowInfo' @ [181:101] ==> var inputDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[LocalVariableDescriptor]

'subjectExpression' @ [182:61] ==> val subjectExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[LocalVariableDescriptor]

'subjectType' @ [182:80] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[ValueParameterDescriptorImpl]

'subjectDataFlowValue' @ [182:93] ==> value-parameter subjectDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[ValueParameterDescriptorImpl]

'inputDataFlowInfo' @ [183:13] ==> var inputDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[LocalVariableDescriptor]

'inputDataFlowInfo' @ [183:33] ==> var inputDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[LocalVariableDescriptor]

'and' @ [183:51] ==> public abstract fun and(other: DataFlowInfo): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'conditionsInfo' @ [183:55] ==> val conditionsInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[LocalVariableDescriptor]

'elseInfo' @ [183:70] ==> public final val elseInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'whenEntry' @ [185:17] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[LocalVariableDescriptor]

'expression' @ [185:27] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'argumentDataFlowInfos' @ [186:17] ==> val argumentDataFlowInfos: ArrayList<DataFlowInfo> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[LocalVariableDescriptor]

'add' @ [186:39] ==> public open fun add(element: DataFlowInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'conditionsInfo' @ [186:43] ==> val conditionsInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[LocalVariableDescriptor]

'thenInfo' @ [186:58] ==> public final val thenInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'argumentDataFlowInfos' @ [189:16] ==> val argumentDataFlowInfos: ArrayList<DataFlowInfo> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeConditionsInWhenEntries[LocalVariableDescriptor]

'contextAfterSubject' @ [199:30] ==> value-parameter contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[ValueParameterDescriptorImpl]

'trace' @ [199:50] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'bindingContext' @ [199:56] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'jumpOutPossibleInSubject' @ [202:31] ==> value-parameter jumpOutPossibleInSubject: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[ValueParameterDescriptorImpl]

'expression' @ [204:27] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[ValueParameterDescriptorImpl]

'entries' @ [204:38] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'whenEntry' @ [205:35] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'expression' @ [205:45] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'?:' @ [207:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinTypeInfo?, right: KotlinTypeInfo): KotlinTypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinTypeInfo

'getRecordedTypeInfo' @ [207:53] ==> @Nullable public open fun getRecordedTypeInfo(@NotNull expression: KtExpression, @NotNull context: BindingContext): KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'entryExpression' @ [207:73] ==> val entryExpression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'bindingContext' @ [207:90] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'entryTypeInfo' @ [209:29] ==> val entryTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'type' @ [209:43] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'entryType' @ [210:17] ==> val entryType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'errorTypeExistInBranch' @ [211:17] ==> var errorTypeExistInBranch: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'if (whenResultValue != null && entryType != null) {
                        val entryValue = DataFlowValueFactory.createDataFlowValue(entryExpression, entryType, contextAfterSubject)
                        entryTypeInfo.dataFlowInfo.assign(whenResultValue, entryValue, components.languageVersionSettings)
                    }
                    else {
                        entryTypeInfo.dataFlowInfo
                    }' @ [215:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DataFlowInfo, elseBranch: DataFlowInfo): DataFlowInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DataFlowInfo

'whenResultValue' @ [215:25] ==> value-parameter whenResultValue: DataFlowValue? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[ValueParameterDescriptorImpl]

'entryType' @ [215:52] ==> val entryType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'DataFlowValueFactory' @ [216:42] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [216:63] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'entryExpression' @ [216:83] ==> val entryExpression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'entryType' @ [216:100] ==> val entryType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'contextAfterSubject' @ [216:111] ==> value-parameter contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[ValueParameterDescriptorImpl]

'entryTypeInfo' @ [217:25] ==> val entryTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'dataFlowInfo' @ [217:39] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'assign' @ [217:52] ==> public abstract fun assign(a: DataFlowValue, b: DataFlowValue, languageVersionSettings: LanguageVersionSettings): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'whenResultValue' @ [217:59] ==> value-parameter whenResultValue: DataFlowValue? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[ValueParameterDescriptorImpl]

'entryValue' @ [217:76] ==> val entryValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'components' @ [217:88] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'languageVersionSettings' @ [217:99] ==> public/*package*/ final var languageVersionSettings: (LanguageVersionSettings..LanguageVersionSettings?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'entryTypeInfo' @ [220:25] ==> val entryTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'dataFlowInfo' @ [220:39] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'currentDataFlowInfo' @ [223:13] ==> var currentDataFlowInfo: DataFlowInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'if (entryType != null && KotlinBuiltIns.isNothing(entryType))
                        currentDataFlowInfo
                    else if (currentDataFlowInfo != null)
                        currentDataFlowInfo.or(entryDataFlowInfo)
                    else
                        entryDataFlowInfo' @ [224:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DataFlowInfo?, elseBranch: DataFlowInfo?): DataFlowInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DataFlowInfo?

'entryType' @ [224:25] ==> val entryType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'isNothing' @ [224:61] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'entryType' @ [224:71] ==> val entryType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'currentDataFlowInfo' @ [225:25] ==> var currentDataFlowInfo: DataFlowInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'if (currentDataFlowInfo != null)
                        currentDataFlowInfo.or(entryDataFlowInfo)
                    else
                        entryDataFlowInfo' @ [226:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DataFlowInfo, elseBranch: DataFlowInfo): DataFlowInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DataFlowInfo

'currentDataFlowInfo' @ [226:30] ==> var currentDataFlowInfo: DataFlowInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'currentDataFlowInfo' @ [227:25] ==> var currentDataFlowInfo: DataFlowInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'or' @ [227:45] ==> public abstract fun or(other: DataFlowInfo): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'entryDataFlowInfo' @ [227:48] ==> val entryDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'entryDataFlowInfo' @ [229:25] ==> val entryDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'jumpOutPossible' @ [231:13] ==> var jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'jumpOutPossible' @ [231:31] ==> var jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'entryTypeInfo' @ [231:50] ==> val entryTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'jumpOutPossible' @ [231:64] ==> public final val jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'currentDataFlowInfo' @ [234:34] ==> var currentDataFlowInfo: DataFlowInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'contextAfterSubject' @ [234:57] ==> value-parameter contextAfterSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [234:77] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'if (resultType == null || errorTypeExistInBranch && KotlinBuiltIns.isNothing(resultType))
            noTypeInfo(resultDataFlowInfo)
        else
            createTypeInfo(resultType, resultDataFlowInfo, jumpOutPossible, resultDataFlowInfo)' @ [235:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinTypeInfo, elseBranch: KotlinTypeInfo): KotlinTypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinTypeInfo

'resultType' @ [235:20] ==> value-parameter resultType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[ValueParameterDescriptorImpl]

'errorTypeExistInBranch' @ [235:42] ==> var errorTypeExistInBranch: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'isNothing' @ [235:83] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'resultType' @ [235:93] ==> value-parameter resultType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[ValueParameterDescriptorImpl]

'noTypeInfo' @ [236:13] ==> public fun noTypeInfo(dataFlowInfo: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'resultDataFlowInfo' @ [236:24] ==> val resultDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'createTypeInfo' @ [238:13] ==> public fun createTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo, jumpPossible: Boolean, jumpFlowInfo: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'resultType' @ [238:28] ==> value-parameter resultType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[ValueParameterDescriptorImpl]

'resultDataFlowInfo' @ [238:40] ==> val resultDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'jumpOutPossible' @ [238:60] ==> var jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'resultDataFlowInfo' @ [238:77] ==> val resultDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.joinWhenExpressionBranches[LocalVariableDescriptor]

'expression' @ [247:33] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[ValueParameterDescriptorImpl]

'subjectExpression' @ [247:44] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'possibleTypesForSubject' @ [248:34] ==> value-parameter possibleTypesForSubject: Set<KotlinType> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[ValueParameterDescriptorImpl]

'possibleCastType' @ [249:37] ==> val possibleCastType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[LocalVariableDescriptor]

'constructor' @ [249:54] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [249:66] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'possibleCastClass' @ [250:17] ==> val possibleCastClass: ClassDescriptor defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[LocalVariableDescriptor]

'kind' @ [250:35] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [250:53] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'possibleCastClass' @ [250:67] ==> val possibleCastClass: ClassDescriptor defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[LocalVariableDescriptor]

'modality' @ [250:85] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'SEALED' @ [250:106] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'checkSmartCastToExpectedTypeInSubject' @ [251:21] ==> private final fun checkSmartCastToExpectedTypeInSubject(contextBeforeSubject: ExpressionTypingContext, subjectExpression: KtExpression, subjectType: KotlinType, expectedType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'contextBeforeSubject' @ [251:59] ==> value-parameter contextBeforeSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[ValueParameterDescriptorImpl]

'subjectExpression' @ [251:81] ==> val subjectExpression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[LocalVariableDescriptor]

'subjectType' @ [251:100] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[ValueParameterDescriptorImpl]

'possibleCastType' @ [252:59] ==> val possibleCastType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[LocalVariableDescriptor]

'isNullableType' @ [257:40] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'subjectType' @ [257:55] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[ValueParameterDescriptorImpl]

'contextBeforeSubject' @ [258:30] ==> value-parameter contextBeforeSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[ValueParameterDescriptorImpl]

'trace' @ [258:51] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'bindingContext' @ [258:57] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'isNullableType' @ [259:13] ==> val isNullableType: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[LocalVariableDescriptor]

'!' @ [259:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'WhenChecker' @ [259:32] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'containsNullCase' @ [259:44] ==> public final fun containsNullCase(expression: KtWhenExpression, context: BindingContext): Boolean defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'expression' @ [259:61] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[ValueParameterDescriptorImpl]

'bindingContext' @ [259:73] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[LocalVariableDescriptor]

'makeNotNullable' @ [260:45] ==> @NotNull public open fun makeNotNullable(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'subjectType' @ [260:61] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[ValueParameterDescriptorImpl]

'checkSmartCastToExpectedTypeInSubject' @ [261:17] ==> private final fun checkSmartCastToExpectedTypeInSubject(contextBeforeSubject: ExpressionTypingContext, subjectExpression: KtExpression, subjectType: KotlinType, expectedType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'contextBeforeSubject' @ [261:55] ==> value-parameter contextBeforeSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[ValueParameterDescriptorImpl]

'subjectExpression' @ [261:77] ==> val subjectExpression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[LocalVariableDescriptor]

'subjectType' @ [261:96] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[ValueParameterDescriptorImpl]

'notNullableType' @ [262:55] ==> val notNullableType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastsInSubjectIfRequired[LocalVariableDescriptor]

'create' @ [274:43] ==> @NotNull public open fun create(@NotNull trace: BindingTrace, debugName: (String..String?)): TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[JavaMethodDescriptor]

'contextBeforeSubject' @ [274:50] ==> value-parameter contextBeforeSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastToExpectedTypeInSubject[ValueParameterDescriptorImpl]

'trace' @ [274:71] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'contextBeforeSubject' @ [275:30] ==> value-parameter contextBeforeSubject: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastToExpectedTypeInSubject[ValueParameterDescriptorImpl]

'replaceExpectedType' @ [275:51] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'expectedType' @ [275:71] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastToExpectedTypeInSubject[ValueParameterDescriptorImpl]

'replaceBindingTrace' @ [275:85] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'trace' @ [275:105] ==> val trace: TemporaryBindingTrace defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastToExpectedTypeInSubject[LocalVariableDescriptor]

'checkPossibleCast' @ [276:43] ==> @Nullable public open fun checkPossibleCast(@NotNull expressionType: KotlinType, @NotNull expression: KtExpression, @NotNull c: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): SmartCastResult? defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'subjectType' @ [277:17] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastToExpectedTypeInSubject[ValueParameterDescriptorImpl]

'safeDeparenthesize' @ [277:40] ==> @NotNull public open fun safeDeparenthesize(@NotNull expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'subjectExpression' @ [277:59] ==> value-parameter subjectExpression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastToExpectedTypeInSubject[ValueParameterDescriptorImpl]

'subjectContext' @ [277:79] ==> val subjectContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastToExpectedTypeInSubject[LocalVariableDescriptor]

'castResult' @ [278:13] ==> val castResult: SmartCastResult? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastToExpectedTypeInSubject[LocalVariableDescriptor]

'castResult' @ [278:35] ==> val castResult: SmartCastResult? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastToExpectedTypeInSubject[LocalVariableDescriptor]

'isCorrect' @ [278:46] ==> public final val isCorrect: Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastResult[PropertyDescriptorImpl]

'trace' @ [279:13] ==> val trace: TemporaryBindingTrace defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkSmartCastToExpectedTypeInSubject[LocalVariableDescriptor]

'commit' @ [279:19] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[JavaMethodDescriptor]

'whenEntry' @ [292:13] ==> value-parameter whenEntry: KtWhenEntry defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[ValueParameterDescriptorImpl]

'isElse' @ [292:23] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'ConditionalDataFlowInfo' @ [293:20] ==> public constructor ConditionalDataFlowInfo(thenInfo: DataFlowInfo, elseInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[ClassConstructorDescriptorImpl]

'context' @ [293:44] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [293:52] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'context' @ [297:35] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[ValueParameterDescriptorImpl]

'whenEntry' @ [298:27] ==> value-parameter whenEntry: KtWhenEntry defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[ValueParameterDescriptorImpl]

'conditions' @ [298:37] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'checkWhenCondition' @ [299:33] ==> private final fun checkWhenCondition(subjectExpression: KtExpression?, subjectType: KotlinType, condition: KtWhenCondition, context: ExpressionTypingContext, subjectDataFlowValue: DataFlowValue): PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'subjectExpression' @ [299:52] ==> value-parameter subjectExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[ValueParameterDescriptorImpl]

'subjectType' @ [299:71] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[ValueParameterDescriptorImpl]

'condition' @ [299:84] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[LocalVariableDescriptor]

'contextForCondition' @ [300:52] ==> var contextForCondition: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[LocalVariableDescriptor]

'subjectDataFlowValue' @ [300:73] ==> value-parameter subjectDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[ValueParameterDescriptorImpl]

'entryInfo' @ [301:13] ==> var entryInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[LocalVariableDescriptor]

'entryInfo' @ [301:25] ==> var entryInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[LocalVariableDescriptor]

'let' @ [301:36] ==> @InlineOnly public inline fun <T, R> PatternMatchingTypingVisitor.ConditionalDataFlowInfo.let(block: (PatternMatchingTypingVisitor.ConditionalDataFlowInfo) -> PatternMatchingTypingVisitor.ConditionalDataFlowInfo): PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConditionalDataFlowInfo
    <R> -> ConditionalDataFlowInfo

'ConditionalDataFlowInfo' @ [302:17] ==> public constructor ConditionalDataFlowInfo(thenInfo: DataFlowInfo, elseInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[ClassConstructorDescriptorImpl]

'it' @ [302:41] ==> value-parameter it: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions.<anonymous>[ValueParameterDescriptorImpl]

'thenInfo' @ [302:44] ==> public final val thenInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'or' @ [302:53] ==> public abstract fun or(other: DataFlowInfo): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'conditionInfo' @ [302:56] ==> val conditionInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[LocalVariableDescriptor]

'thenInfo' @ [302:70] ==> public final val thenInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'it' @ [302:81] ==> value-parameter it: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions.<anonymous>[ValueParameterDescriptorImpl]

'elseInfo' @ [302:84] ==> public final val elseInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'and' @ [302:93] ==> public abstract fun and(other: DataFlowInfo): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'conditionInfo' @ [302:97] ==> val conditionInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[LocalVariableDescriptor]

'elseInfo' @ [302:111] ==> public final val elseInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'conditionInfo' @ [303:18] ==> val conditionInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[LocalVariableDescriptor]

'contextForCondition' @ [305:13] ==> var contextForCondition: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[LocalVariableDescriptor]

'contextForCondition' @ [305:35] ==> var contextForCondition: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[LocalVariableDescriptor]

'replaceDataFlowInfo' @ [305:55] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'conditionInfo' @ [305:75] ==> val conditionInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[LocalVariableDescriptor]

'elseInfo' @ [305:89] ==> public final val elseInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'entryInfo' @ [308:16] ==> var entryInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[LocalVariableDescriptor]

'ConditionalDataFlowInfo' @ [308:29] ==> public constructor ConditionalDataFlowInfo(thenInfo: DataFlowInfo, elseInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[ClassConstructorDescriptorImpl]

'context' @ [308:53] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.analyzeWhenEntryConditions[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [308:61] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'noChange' @ [318:31] ==> private final fun noChange(context: ExpressionTypingContext): PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'context' @ [318:40] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'condition' @ [319:9] ==> value-parameter condition: KtWhenCondition defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'accept' @ [319:19] ==> @Override public final fun accept(@NotNull visitor: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtWhenCondition[JavaMethodDescriptor]

'KtVisitorVoid' @ [319:35] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'condition' @ [321:39] ==> value-parameter condition: KtWhenConditionInRange defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[ValueParameterDescriptorImpl]

'rangeExpression' @ [321:49] ==> public final val KtWhenConditionInRange.rangeExpression: KtExpression?[MyPropertyDescriptor]

'subjectExpression' @ [322:21] ==> value-parameter subjectExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'context' @ [323:21] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'trace' @ [323:29] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [323:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'EXPECTED_CONDITION' @ [323:42] ==> public final val EXPECTED_CONDITION: (DiagnosticFactory0<(KtWhenCondition..KtWhenCondition?)>..DiagnosticFactory0<(KtWhenCondition..KtWhenCondition?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [323:61] ==> @NotNull public open fun on(@NotNull element: KtWhenCondition): SimpleDiagnostic<(KtWhenCondition..KtWhenCondition?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'condition' @ [323:64] ==> value-parameter condition: KtWhenConditionInRange defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[ValueParameterDescriptorImpl]

'facade' @ [324:40] ==> protected/*protected and package*/ final val facade: (ExpressionTypingInternals..ExpressionTypingInternals?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'getTypeInfo' @ [324:47] ==> @NotNull public abstract fun getTypeInfo(@NotNull expression: KtExpression, context: (ExpressionTypingContext..ExpressionTypingContext?)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingInternals[JavaMethodDescriptor]

'rangeExpression' @ [324:59] ==> val rangeExpression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[LocalVariableDescriptor]

'context' @ [324:76] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [324:85] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'newDataFlowInfo' @ [325:21] ==> var newDataFlowInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[LocalVariableDescriptor]

'ConditionalDataFlowInfo' @ [325:39] ==> public constructor ConditionalDataFlowInfo(thenInfo: DataFlowInfo, elseInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[ClassConstructorDescriptorImpl]

'dataFlowInfo' @ [325:63] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[LocalVariableDescriptor]

'makeExternalValueArgument' @ [328:52] ==> @NotNull public open fun makeExternalValueArgument(@NotNull expression: KtExpression): ValueArgument defined in org.jetbrains.kotlin.resolve.calls.util.CallMaker[JavaMethodDescriptor]

'subjectExpression' @ [328:78] ==> value-parameter subjectExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'facade' @ [329:32] ==> protected/*protected and package*/ final val facade: (ExpressionTypingInternals..ExpressionTypingInternals?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'checkInExpression' @ [329:39] ==> @NotNull public abstract fun checkInExpression(@NotNull callElement: KtElement, @NotNull operationSign: KtSimpleNameExpression, @NotNull leftArgument: ValueArgument, @Nullable right: KtExpression?, @NotNull context: ExpressionTypingContext): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingInternals[JavaMethodDescriptor]

'condition' @ [329:57] ==> value-parameter condition: KtWhenConditionInRange defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[ValueParameterDescriptorImpl]

'condition' @ [329:68] ==> value-parameter condition: KtWhenConditionInRange defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[ValueParameterDescriptorImpl]

'operationReference' @ [329:78] ==> public final val KtWhenConditionInRange.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'argumentForSubject' @ [330:57] ==> val argumentForSubject: ValueArgument defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[LocalVariableDescriptor]

'rangeExpression' @ [330:77] ==> val rangeExpression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[LocalVariableDescriptor]

'context' @ [330:94] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'typeInfo' @ [331:36] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[LocalVariableDescriptor]

'dataFlowInfo' @ [331:45] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'newDataFlowInfo' @ [332:17] ==> var newDataFlowInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[LocalVariableDescriptor]

'ConditionalDataFlowInfo' @ [332:35] ==> public constructor ConditionalDataFlowInfo(thenInfo: DataFlowInfo, elseInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[ClassConstructorDescriptorImpl]

'dataFlowInfo' @ [332:59] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[LocalVariableDescriptor]

'typeInfo' @ [333:28] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[LocalVariableDescriptor]

'type' @ [333:37] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'type' @ [334:21] ==> val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[LocalVariableDescriptor]

'!' @ [334:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBoolean' @ [334:38] ==> public open fun isBoolean(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [334:48] ==> val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[LocalVariableDescriptor]

'context' @ [335:21] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'trace' @ [335:29] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [335:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPE_MISMATCH_IN_RANGE' @ [335:42] ==> public final val TYPE_MISMATCH_IN_RANGE: (DiagnosticFactory0<(KtWhenConditionInRange..KtWhenConditionInRange?)>..DiagnosticFactory0<(KtWhenConditionInRange..KtWhenConditionInRange?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [335:65] ==> @NotNull public open fun on(@NotNull element: KtWhenConditionInRange): SimpleDiagnostic<(KtWhenConditionInRange..KtWhenConditionInRange?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'condition' @ [335:68] ==> value-parameter condition: KtWhenConditionInRange defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionInRange[ValueParameterDescriptorImpl]

'subjectExpression' @ [340:21] ==> value-parameter subjectExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'context' @ [341:21] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'trace' @ [341:29] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [341:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'EXPECTED_CONDITION' @ [341:42] ==> public final val EXPECTED_CONDITION: (DiagnosticFactory0<(KtWhenCondition..KtWhenCondition?)>..DiagnosticFactory0<(KtWhenCondition..KtWhenCondition?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [341:61] ==> @NotNull public open fun on(@NotNull element: KtWhenCondition): SimpleDiagnostic<(KtWhenCondition..KtWhenCondition?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'condition' @ [341:64] ==> value-parameter condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[ValueParameterDescriptorImpl]

'condition' @ [343:37] ==> value-parameter condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[ValueParameterDescriptorImpl]

'typeReference' @ [343:47] ==> public final val KtWhenConditionIsPattern.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [344:21] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[LocalVariableDescriptor]

'checkTypeForIs' @ [345:34] ==> private final fun checkTypeForIs(context: ExpressionTypingContext, isCheck: KtElement, negated: Boolean, subjectType: KotlinType, typeReferenceAfterIs: KtTypeReference, subjectDataFlowValue: DataFlowValue): PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'context' @ [345:49] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'condition' @ [345:58] ==> value-parameter condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[ValueParameterDescriptorImpl]

'condition' @ [345:69] ==> value-parameter condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[ValueParameterDescriptorImpl]

'isNegated' @ [345:79] ==> public final val KtWhenConditionIsPattern.isNegated: Boolean[MyPropertyDescriptor]

'subjectType' @ [345:90] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'typeReference' @ [345:103] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[LocalVariableDescriptor]

'subjectDataFlowValue' @ [345:118] ==> value-parameter subjectDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'newDataFlowInfo' @ [346:21] ==> var newDataFlowInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[LocalVariableDescriptor]

'if (condition.isNegated) {
                        ConditionalDataFlowInfo(result.elseInfo, result.thenInfo)
                    }
                    else {
                        result
                    }' @ [346:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PatternMatchingTypingVisitor.ConditionalDataFlowInfo, elseBranch: PatternMatchingTypingVisitor.ConditionalDataFlowInfo): PatternMatchingTypingVisitor.ConditionalDataFlowInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ConditionalDataFlowInfo

'condition' @ [346:43] ==> value-parameter condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[ValueParameterDescriptorImpl]

'isNegated' @ [346:53] ==> public final val KtWhenConditionIsPattern.isNegated: Boolean[MyPropertyDescriptor]

'ConditionalDataFlowInfo' @ [347:25] ==> public constructor ConditionalDataFlowInfo(thenInfo: DataFlowInfo, elseInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[ClassConstructorDescriptorImpl]

'result' @ [347:49] ==> val result: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[LocalVariableDescriptor]

'elseInfo' @ [347:56] ==> public final val elseInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'result' @ [347:66] ==> val result: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[LocalVariableDescriptor]

'thenInfo' @ [347:73] ==> public final val thenInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'result' @ [350:25] ==> val result: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[LocalVariableDescriptor]

'context' @ [352:35] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'trace' @ [352:43] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'TYPE' @ [352:64] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [352:70] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[LocalVariableDescriptor]

'subjectExpression' @ [353:25] ==> value-parameter subjectExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'RttiExpressionInformation' @ [354:47] ==> public constructor RttiExpressionInformation(subject: KtExpression, sourceType: KotlinType?, targetType: KotlinType?, operation: RttiOperation) defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiExpressionInformation[ClassConstructorDescriptorImpl]

'subjectExpression' @ [355:43] ==> value-parameter subjectExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'subjectType' @ [356:46] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'rhsType' @ [357:46] ==> val rhsType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[LocalVariableDescriptor]

'if (condition.isNegated) RttiOperation.NOT_IS else RttiOperation.IS' @ [358:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: RttiOperation, elseBranch: RttiOperation): RttiOperation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> RttiOperation

'condition' @ [358:49] ==> value-parameter condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[ValueParameterDescriptorImpl]

'isNegated' @ [358:59] ==> public final val KtWhenConditionIsPattern.isNegated: Boolean[MyPropertyDescriptor]

'NOT_IS' @ [358:84] ==> enum entry NOT_IS defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiOperation[FakeCallableDescriptorForObject]

'IS' @ [358:110] ==> enum entry IS defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiOperation[FakeCallableDescriptorForObject]

'components' @ [360:25] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'rttiExpressionCheckers' @ [360:36] ==> public/*package*/ final var rttiExpressionCheckers: (MutableIterable<(RttiExpressionChecker..RttiExpressionChecker?)>..Iterable<(RttiExpressionChecker..RttiExpressionChecker?)>?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'forEach' @ [360:59] ==> @HidesMembers public inline fun <T> Iterable<(RttiExpressionChecker..RttiExpressionChecker?)>.forEach(action: ((RttiExpressionChecker..RttiExpressionChecker?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.checkers.RttiExpressionChecker..org.jetbrains.kotlin.resolve.calls.checkers.RttiExpressionChecker?)

'it' @ [361:29] ==> value-parameter it: (RttiExpressionChecker..RttiExpressionChecker?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern.<anonymous>[ValueParameterDescriptorImpl]

'check' @ [361:32] ==> public abstract fun check(rttiInformation: RttiExpressionInformation, reportOn: PsiElement, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiExpressionChecker[SimpleFunctionDescriptorImpl]

'rttiInformation' @ [361:38] ==> val rttiInformation: RttiExpressionInformation defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[LocalVariableDescriptor]

'condition' @ [361:55] ==> value-parameter condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionIsPattern[ValueParameterDescriptorImpl]

'context' @ [361:66] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'trace' @ [361:74] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'condition' @ [368:34] ==> value-parameter condition: KtWhenConditionWithExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionWithExpression[ValueParameterDescriptorImpl]

'expression' @ [368:44] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'expression' @ [369:21] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionWithExpression[LocalVariableDescriptor]

'newDataFlowInfo' @ [370:21] ==> var newDataFlowInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[LocalVariableDescriptor]

'checkTypeForExpressionCondition' @ [370:39] ==> private final fun checkTypeForExpressionCondition(context: ExpressionTypingContext, expression: KtExpression, subjectType: KotlinType, conditionExpected: Boolean, subjectDataFlowValue: DataFlowValue): PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'context' @ [371:29] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'expression' @ [371:38] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitWhenConditionWithExpression[LocalVariableDescriptor]

'subjectType' @ [371:50] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'subjectExpression' @ [371:63] ==> value-parameter subjectExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'subjectDataFlowValue' @ [371:90] ==> value-parameter subjectDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'context' @ [376:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[ValueParameterDescriptorImpl]

'trace' @ [376:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [376:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [376:38] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [376:50] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [376:53] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'this' @ [376:62] ==> <this> defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition.<no name provided>[LazyClassReceiverParameterDescriptor]

'java' @ [376:74] ==> public val <T> KClass<out <no name provided>>.java: Class<out <no name provided>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out <no name provided>)

'canonicalName' @ [376:79] ==> public final val <T : (Any..Any?)> Class<out <no name provided>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out <no name provided>)

'newDataFlowInfo' @ [379:16] ==> var newDataFlowInfo: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkWhenCondition[LocalVariableDescriptor]

'thenInfo' @ [382:100] ==> value-parameter thenInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo.<init>[ValueParameterDescriptorImpl]

'context' @ [391:26] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'facade' @ [392:24] ==> protected/*protected and package*/ final val facade: (ExpressionTypingInternals..ExpressionTypingInternals?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'getTypeInfo' @ [392:31] ==> @NotNull public abstract fun getTypeInfo(@NotNull expression: KtExpression, context: (ExpressionTypingContext..ExpressionTypingContext?)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingInternals[JavaMethodDescriptor]

'expression' @ [392:43] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'newContext' @ [392:55] ==> var newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'typeInfo' @ [393:20] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'type' @ [393:29] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'noChange' @ [393:44] ==> private final fun noChange(context: ExpressionTypingContext): PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'newContext' @ [393:53] ==> var newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'newContext' @ [394:9] ==> var newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'newContext' @ [394:22] ==> var newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'replaceDataFlowInfo' @ [394:33] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'typeInfo' @ [394:53] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'dataFlowInfo' @ [394:62] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'conditionExpected' @ [395:13] ==> value-parameter conditionExpected: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'components' @ [396:31] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'builtIns' @ [396:42] ==> public/*package*/ final var builtIns: (KotlinBuiltIns..KotlinBuiltIns?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'booleanType' @ [396:51] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'components' @ [397:35] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'dataFlowAnalyzer' @ [397:46] ==> public/*package*/ final var dataFlowAnalyzer: (DataFlowAnalyzer..DataFlowAnalyzer?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'checkType' @ [397:63] ==> @NotNull public open fun checkType(@NotNull typeInfo: KotlinTypeInfo, @NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'typeInfo' @ [397:73] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'expression' @ [397:83] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'newContext' @ [397:95] ==> var newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'replaceExpectedType' @ [397:106] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'booleanType' @ [397:126] ==> val booleanType: SimpleType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'DEFAULT' @ [398:35] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [398:43] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'booleanType' @ [398:54] ==> val booleanType: SimpleType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'checkedTypeInfo' @ [398:67] ==> val checkedTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'type' @ [398:83] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'type' @ [398:91] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'components' @ [399:30] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'dataFlowAnalyzer' @ [399:41] ==> public/*package*/ final var dataFlowAnalyzer: (DataFlowAnalyzer..DataFlowAnalyzer?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'extractDataFlowInfoFromCondition' @ [399:58] ==> @NotNull public open fun extractDataFlowInfoFromCondition(@Nullable condition: KtExpression?, conditionValue: Boolean, context: (ExpressionTypingContext..ExpressionTypingContext?)): DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'expression' @ [399:91] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'newContext' @ [399:109] ==> var newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'components' @ [400:32] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'dataFlowAnalyzer' @ [400:43] ==> public/*package*/ final var dataFlowAnalyzer: (DataFlowAnalyzer..DataFlowAnalyzer?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'extractDataFlowInfoFromCondition' @ [400:60] ==> @NotNull public open fun extractDataFlowInfoFromCondition(@Nullable condition: KtExpression?, conditionValue: Boolean, context: (ExpressionTypingContext..ExpressionTypingContext?)): DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'expression' @ [400:93] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'newContext' @ [400:112] ==> var newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'ConditionalDataFlowInfo' @ [401:24] ==> public constructor ConditionalDataFlowInfo(thenInfo: DataFlowInfo, elseInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[ClassConstructorDescriptorImpl]

'ifInfo' @ [401:48] ==> val ifInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'elseInfo' @ [401:56] ==> val elseInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'noChange' @ [403:20] ==> private final fun noChange(context: ExpressionTypingContext): PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'newContext' @ [403:29] ==> var newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'checkTypeCompatibility' @ [405:9] ==> private final fun checkTypeCompatibility(context: ExpressionTypingContext, type: KotlinType, subjectType: KotlinType, reportErrorOn: KtElement): Unit defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'newContext' @ [405:32] ==> var newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'type' @ [405:44] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'subjectType' @ [405:50] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'expression' @ [405:63] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'DataFlowValueFactory' @ [406:39] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [406:60] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expression' @ [406:80] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'type' @ [406:92] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'newContext' @ [406:98] ==> var newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'noChange' @ [407:22] ==> private final fun noChange(context: ExpressionTypingContext): PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'newContext' @ [407:31] ==> var newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'ConditionalDataFlowInfo' @ [408:16] ==> public constructor ConditionalDataFlowInfo(thenInfo: DataFlowInfo, elseInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[ClassConstructorDescriptorImpl]

'result' @ [409:17] ==> val result: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'thenInfo' @ [409:24] ==> public final val thenInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'equate' @ [409:33] ==> public abstract fun equate(a: DataFlowValue, b: DataFlowValue, identityEquals: Boolean, languageVersionSettings: LanguageVersionSettings): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'subjectDataFlowValue' @ [409:40] ==> value-parameter subjectDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'expressionDataFlowValue' @ [409:62] ==> val expressionDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'typeHasEqualsFromAny' @ [410:74] ==> public open fun typeHasEqualsFromAny(@NotNull type: KotlinType, @NotNull lookupElement: KtElement): Boolean defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'subjectType' @ [410:95] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'expression' @ [410:108] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'components' @ [411:66] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'languageVersionSettings' @ [411:77] ==> public/*package*/ final var languageVersionSettings: (LanguageVersionSettings..LanguageVersionSettings?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'result' @ [412:17] ==> val result: PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'elseInfo' @ [412:24] ==> public final val elseInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[PropertyDescriptorImpl]

'disequate' @ [412:33] ==> public abstract fun disequate(a: DataFlowValue, b: DataFlowValue, languageVersionSettings: LanguageVersionSettings): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'subjectDataFlowValue' @ [412:43] ==> value-parameter subjectDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[ValueParameterDescriptorImpl]

'expressionDataFlowValue' @ [413:43] ==> val expressionDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForExpressionCondition[LocalVariableDescriptor]

'components' @ [414:43] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'languageVersionSettings' @ [414:54] ==> public/*package*/ final var languageVersionSettings: (LanguageVersionSettings..LanguageVersionSettings?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'TypeResolutionContext' @ [426:37] ==> public constructor TypeResolutionContext(@NotNull scope: LexicalScope, @NotNull trace: BindingTrace, checkBounds: Boolean, allowBareTypes: Boolean, isDebuggerContext: Boolean) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaClassConstructorDescriptor]

'context' @ [426:59] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'scope' @ [426:67] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'context' @ [426:74] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'trace' @ [426:82] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'context' @ [426:121] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [426:129] ==> public final val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'components' @ [427:34] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'typeResolver' @ [427:45] ==> public/*package*/ final var typeResolver: (TypeResolver..TypeResolver?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'resolvePossiblyBareType' @ [427:58] ==> public final fun resolvePossiblyBareType(c: TypeResolutionContext, typeReference: KtTypeReference): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'typeResolutionContext' @ [427:82] ==> val typeResolutionContext: TypeResolutionContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'typeReferenceAfterIs' @ [427:105] ==> value-parameter typeReferenceAfterIs: KtTypeReference defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'reconstructBareType' @ [428:49] ==> @NotNull public open fun reconstructBareType(@NotNull right: KtTypeReference, @NotNull possiblyBareTarget: PossiblyBareType, @Nullable subjectType: KotlinType?, @NotNull trace: BindingTrace, @NotNull builtIns: KotlinBuiltIns): KotlinType defined in org.jetbrains.kotlin.types.expressions.TypeReconstructionUtil[JavaMethodDescriptor]

'typeReferenceAfterIs' @ [428:69] ==> value-parameter typeReferenceAfterIs: KtTypeReference defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'possiblyBareTarget' @ [428:91] ==> val possiblyBareTarget: PossiblyBareType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'subjectType' @ [428:111] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'context' @ [428:124] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'trace' @ [428:132] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'components' @ [428:139] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'builtIns' @ [428:150] ==> public/*package*/ final var builtIns: (KotlinBuiltIns..KotlinBuiltIns?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'targetType' @ [430:13] ==> val targetType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'isDynamic' @ [430:24] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'context' @ [431:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'trace' @ [431:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [431:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DYNAMIC_NOT_ALLOWED' @ [431:34] ==> public final val DYNAMIC_NOT_ALLOWED: (DiagnosticFactory0<(KtTypeReference..KtTypeReference?)>..DiagnosticFactory0<(KtTypeReference..KtTypeReference?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [431:54] ==> @NotNull public open fun on(@NotNull element: KtTypeReference): SimpleDiagnostic<(KtTypeReference..KtTypeReference?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'typeReferenceAfterIs' @ [431:57] ==> value-parameter typeReferenceAfterIs: KtTypeReference defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'getClassDescriptor' @ [433:42] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'targetType' @ [433:61] ==> val targetType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'targetDescriptor' @ [434:13] ==> val targetDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'isEnumEntry' @ [434:57] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'targetDescriptor' @ [434:69] ==> val targetDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'context' @ [435:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'trace' @ [435:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [435:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'IS_ENUM_ENTRY' @ [435:34] ==> public final val IS_ENUM_ENTRY: (DiagnosticFactory0<(KtTypeReference..KtTypeReference?)>..DiagnosticFactory0<(KtTypeReference..KtTypeReference?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [435:48] ==> @NotNull public open fun on(@NotNull element: KtTypeReference): SimpleDiagnostic<(KtTypeReference..KtTypeReference?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'typeReferenceAfterIs' @ [435:51] ==> value-parameter typeReferenceAfterIs: KtTypeReference defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'!' @ [437:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'subjectType' @ [437:14] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'containsError' @ [437:26] ==> public fun KotlinType.containsError(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [437:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [437:56] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'subjectType' @ [437:71] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'targetType' @ [437:87] ==> val targetType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'isMarkedNullable' @ [437:98] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'typeReferenceAfterIs' @ [438:27] ==> value-parameter typeReferenceAfterIs: KtTypeReference defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'typeElement' @ [438:48] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[PropertyDescriptorImpl]

'assert' @ [439:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'element' @ [439:20] ==> val element: KtTypeElement? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'+' @ [439:49] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'java' @ [439:104] ==> public val <T> KClass<KtNullableType>.java: Class<KtNullableType> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNullableType

'name' @ [439:109] ==> public final val <T : (Any..Any?)> Class<KtNullableType>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtNullableType

'context' @ [440:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'trace' @ [440:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [440:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'USELESS_NULLABLE_CHECK' @ [440:41] ==> public final val USELESS_NULLABLE_CHECK: (DiagnosticFactory0<(KtNullableType..KtNullableType?)>..DiagnosticFactory0<(KtNullableType..KtNullableType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [440:64] ==> @NotNull public open fun on(@NotNull element: KtNullableType): SimpleDiagnostic<(KtNullableType..KtNullableType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'element' @ [440:67] ==> val element: KtTypeElement? defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'checkTypeCompatibility' @ [442:9] ==> private final fun checkTypeCompatibility(context: ExpressionTypingContext, type: KotlinType, subjectType: KotlinType, reportErrorOn: KtElement): Unit defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'context' @ [442:32] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'targetType' @ [442:41] ==> val targetType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'subjectType' @ [442:53] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'typeReferenceAfterIs' @ [442:66] ==> value-parameter typeReferenceAfterIs: KtTypeReference defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'detectRedundantIs' @ [444:9] ==> private final fun detectRedundantIs(context: ExpressionTypingContext, subjectType: KotlinType, targetType: KotlinType, isCheck: KtElement, negated: Boolean, subjectDataFlowValue: DataFlowValue): Unit defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[SimpleFunctionDescriptorImpl]

'context' @ [444:27] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'subjectType' @ [444:36] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'targetType' @ [444:49] ==> val targetType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'isCheck' @ [444:61] ==> value-parameter isCheck: KtElement defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'negated' @ [444:70] ==> value-parameter negated: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'subjectDataFlowValue' @ [444:79] ==> value-parameter subjectDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'CastDiagnosticsUtil' @ [446:13] ==> public object CastDiagnosticsUtil defined in org.jetbrains.kotlin.types in file CastDiagnosticsUtil.kt[FakeCallableDescriptorForObject]

'isCastErased' @ [446:33] ==> @JvmStatic public final fun isCastErased(supertype: KotlinType, subtype: KotlinType, typeChecker: KotlinTypeChecker): Boolean defined in org.jetbrains.kotlin.types.CastDiagnosticsUtil[SimpleFunctionDescriptorImpl]

'subjectType' @ [446:46] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'targetType' @ [446:59] ==> val targetType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'DEFAULT' @ [446:89] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'context' @ [447:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'trace' @ [447:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [447:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CANNOT_CHECK_FOR_ERASED' @ [447:41] ==> public final val CANNOT_CHECK_FOR_ERASED: (DiagnosticFactory1<(KtElement..KtElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtElement..KtElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [447:65] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: KotlinType): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'typeReferenceAfterIs' @ [447:68] ==> value-parameter typeReferenceAfterIs: KtTypeReference defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'targetType' @ [447:90] ==> val targetType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'context' @ [449:16] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [449:24] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'let' @ [449:37] ==> @InlineOnly public inline fun <T, R> DataFlowInfo.let(block: (DataFlowInfo) -> PatternMatchingTypingVisitor.ConditionalDataFlowInfo): PatternMatchingTypingVisitor.ConditionalDataFlowInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataFlowInfo
    <R> -> ConditionalDataFlowInfo

'ConditionalDataFlowInfo' @ [450:13] ==> public constructor ConditionalDataFlowInfo(thenInfo: DataFlowInfo, elseInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[ClassConstructorDescriptorImpl]

'it' @ [450:37] ==> value-parameter it: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs.<anonymous>[ValueParameterDescriptorImpl]

'establishSubtyping' @ [450:40] ==> public abstract fun establishSubtyping(value: DataFlowValue, type: KotlinType, languageVersionSettings: LanguageVersionSettings): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'subjectDataFlowValue' @ [450:59] ==> value-parameter subjectDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[ValueParameterDescriptorImpl]

'targetType' @ [450:81] ==> val targetType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs[LocalVariableDescriptor]

'components' @ [450:93] ==> protected/*protected and package*/ final val components: (ExpressionTypingComponents..ExpressionTypingComponents?) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor[JavaPropertyDescriptor]

'languageVersionSettings' @ [450:104] ==> public/*package*/ final var languageVersionSettings: (LanguageVersionSettings..LanguageVersionSettings?) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingComponents[JavaPropertyDescriptor]

'it' @ [450:130] ==> value-parameter it: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeForIs.<anonymous>[ValueParameterDescriptorImpl]

'subjectType' @ [462:13] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.detectRedundantIs[ValueParameterDescriptorImpl]

'containsError' @ [462:25] ==> public fun KotlinType.containsError(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'targetType' @ [462:44] ==> value-parameter targetType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.detectRedundantIs[ValueParameterDescriptorImpl]

'containsError' @ [462:55] ==> public fun KotlinType.containsError(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'getAllPossibleTypes' @ [464:46] ==> @NotNull public open fun getAllPossibleTypes(@NotNull type: KotlinType, @NotNull c: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>), @NotNull dataFlowValue: DataFlowValue): (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'subjectType' @ [464:66] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.detectRedundantIs[ValueParameterDescriptorImpl]

'context' @ [464:79] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.detectRedundantIs[ValueParameterDescriptorImpl]

'subjectDataFlowValue' @ [464:88] ==> value-parameter subjectDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.detectRedundantIs[ValueParameterDescriptorImpl]

'CastDiagnosticsUtil' @ [465:13] ==> public object CastDiagnosticsUtil defined in org.jetbrains.kotlin.types in file CastDiagnosticsUtil.kt[FakeCallableDescriptorForObject]

'isRefinementUseless' @ [465:33] ==> public final fun isRefinementUseless(possibleTypes: Collection<KotlinType>, targetType: KotlinType, typeChecker: KotlinTypeChecker, shouldCheckForExactType: Boolean): Boolean defined in org.jetbrains.kotlin.types.CastDiagnosticsUtil[SimpleFunctionDescriptorImpl]

'possibleTypes' @ [465:53] ==> val possibleTypes: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.detectRedundantIs[LocalVariableDescriptor]

'targetType' @ [465:68] ==> value-parameter targetType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.detectRedundantIs[ValueParameterDescriptorImpl]

'DEFAULT' @ [465:98] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'context' @ [466:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.detectRedundantIs[ValueParameterDescriptorImpl]

'trace' @ [466:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [466:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'USELESS_IS_CHECK' @ [466:41] ==> public final val USELESS_IS_CHECK: (DiagnosticFactory1<(KtElement..KtElement?), (Boolean..Boolean?)>..DiagnosticFactory1<(KtElement..KtElement?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [466:58] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: Boolean): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'isCheck' @ [466:61] ==> value-parameter isCheck: KtElement defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.detectRedundantIs[ValueParameterDescriptorImpl]

'!' @ [466:70] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'negated' @ [466:71] ==> value-parameter negated: Boolean defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.detectRedundantIs[ValueParameterDescriptorImpl]

'ConditionalDataFlowInfo' @ [470:62] ==> public constructor ConditionalDataFlowInfo(thenInfo: DataFlowInfo, elseInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.ConditionalDataFlowInfo[ClassConstructorDescriptorImpl]

'context' @ [470:86] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.noChange[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [470:94] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'isIntersectionEmpty' @ [482:29] ==> public open fun isIntersectionEmpty(@NotNull typeA: KotlinType, @NotNull typeB: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeIntersector[JavaMethodDescriptor]

'type' @ [482:49] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeCompatibility[ValueParameterDescriptorImpl]

'subjectType' @ [482:55] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeCompatibility[ValueParameterDescriptorImpl]

'context' @ [483:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeCompatibility[ValueParameterDescriptorImpl]

'trace' @ [483:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [483:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INCOMPATIBLE_TYPES' @ [483:34] ==> public final val INCOMPATIBLE_TYPES: (DiagnosticFactory2<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [483:53] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: KotlinType, @NotNull b: KotlinType): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'reportErrorOn' @ [483:56] ==> value-parameter reportErrorOn: KtElement defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeCompatibility[ValueParameterDescriptorImpl]

'type' @ [483:71] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeCompatibility[ValueParameterDescriptorImpl]

'subjectType' @ [483:77] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeCompatibility[ValueParameterDescriptorImpl]

'isNullableNothing' @ [488:28] ==> public open fun isNullableNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [488:46] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeCompatibility[ValueParameterDescriptorImpl]

'!' @ [488:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [488:66] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'subjectType' @ [488:81] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeCompatibility[ValueParameterDescriptorImpl]

'context' @ [489:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeCompatibility[ValueParameterDescriptorImpl]

'trace' @ [489:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [489:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'SENSELESS_NULL_IN_WHEN' @ [489:34] ==> public final val SENSELESS_NULL_IN_WHEN: (DiagnosticFactory0<(KtElement..KtElement?)>..DiagnosticFactory0<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [489:57] ==> @NotNull public open fun on(@NotNull element: KtElement): SimpleDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportErrorOn' @ [489:60] ==> value-parameter reportErrorOn: KtElement defined in org.jetbrains.kotlin.types.expressions.PatternMatchingTypingVisitor.checkTypeCompatibility[ValueParameterDescriptorImpl]

