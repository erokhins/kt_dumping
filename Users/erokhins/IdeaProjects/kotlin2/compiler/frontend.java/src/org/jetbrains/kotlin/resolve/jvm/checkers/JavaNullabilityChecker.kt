'doCheckType' @ [44:9] ==> private final fun doCheckType(expressionType: KotlinType, expectedType: KotlinType, dataFlowValue: DataFlowValue, dataFlowInfo: DataFlowInfo, reportWarning: (expectedMustNotBeNull: ErrorsJvm.NullabilityInformationSource, actualMayBeNull: ErrorsJvm.NullabilityInformationSource) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker[SimpleFunctionDescriptorImpl]

'expressionType' @ [45:17] ==> value-parameter expressionType: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'c' @ [46:17] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'expectedType' @ [46:19] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'DataFlowValueFactory' @ [47:17] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [47:38] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'expression' @ [47:58] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'expressionType' @ [47:70] ==> value-parameter expressionType: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'c' @ [47:86] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'c' @ [48:17] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [48:19] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'c' @ [50:13] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'trace' @ [50:15] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [50:21] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS' @ [50:38] ==> public final val NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS: (DiagnosticFactory2<(KtElement..KtElement?), (ErrorsJvm.NullabilityInformationSource..ErrorsJvm.NullabilityInformationSource?), (ErrorsJvm.NullabilityInformationSource..ErrorsJvm.NullabilityInformationSource?)>..DiagnosticFactory2<(KtElement..KtElement?), (ErrorsJvm.NullabilityInformationSource..ErrorsJvm.NullabilityInformationSource?), (ErrorsJvm.NullabilityInformationSource..ErrorsJvm.NullabilityInformationSource?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [50:85] ==> @NotNull public open fun on(@NotNull p0: KtElement, @NotNull p1: ErrorsJvm.NullabilityInformationSource, @NotNull p2: ErrorsJvm.NullabilityInformationSource): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'expression' @ [50:88] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'expectedMustNotBeNull' @ [50:100] ==> value-parameter expectedMustNotBeNull: ErrorsJvm.NullabilityInformationSource defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType.<anonymous>[ValueParameterDescriptorImpl]

'actualMayBeNull' @ [50:123] ==> value-parameter actualMayBeNull: ErrorsJvm.NullabilityInformationSource defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType.<anonymous>[ValueParameterDescriptorImpl]

'when (expression) {
            is KtWhenExpression ->
                if (expression.elseExpression == null) {
                    // Check for conditionally-exhaustive when on platform enums, see KT-6399
                    val subjectExpression = expression.subjectExpression ?: return
                    val type = c.trace.getType(subjectExpression) ?: return
                    if (type.isFlexible() && TypeUtils.isNullableType(type.asFlexibleType().upperBound)) {
                        val dataFlowValue = DataFlowValueFactory.createDataFlowValue(subjectExpression, type, c)
                        val dataFlowInfo = c.trace[BindingContext.EXPRESSION_TYPE_INFO, subjectExpression]?.dataFlowInfo
                        if (dataFlowInfo != null && !dataFlowInfo.getStableNullability(dataFlowValue).canBeNull()) {
                            return
                        }

                        val enumClassDescriptor = WhenChecker.getClassDescriptorOfTypeIfEnum(type) ?: return
                        val context = c.trace.bindingContext
                        if (WhenChecker.getEnumMissingCases(expression, context, enumClassDescriptor).isEmpty()
                            && !WhenChecker.containsNullCase(expression, context)) {

                            c.trace.report(ErrorsJvm.WHEN_ENUM_CAN_BE_NULL_IN_JAVA.on(expression.subjectExpression!!))
                        }
                    }
                }
            is KtPostfixExpression ->
                if (expression.operationToken == KtTokens.EXCLEXCL) {
                    val baseExpression = expression.baseExpression ?: return
                    val baseExpressionType = c.trace.getType(baseExpression) ?: return
                    doIfNotNull(
                            DataFlowValueFactory.createDataFlowValue(baseExpression, baseExpressionType, c), c
                    ) {
                        c.trace.report(Errors.UNNECESSARY_NOT_NULL_ASSERTION.on(expression.operationReference, baseExpressionType))
                    }
                }
            is KtBinaryExpression ->
                when (expression.operationToken) {
                    KtTokens.EQEQ,
                    KtTokens.EXCLEQ,
                    KtTokens.EQEQEQ,
                    KtTokens.EXCLEQEQEQ -> {
                        if (expression.left != null && expression.right != null) {
                            SenselessComparisonChecker.checkSenselessComparisonWithNull(
                                    expression, expression.left!!, expression.right!!, c,
                                    { c.trace.getType(it) },
                                    { value ->
                                        doIfNotNull(value, c) { Nullability.NOT_NULL } ?: Nullability.UNKNOWN
                                    }
                            )
                        }
                    }
                }
        }' @ [53:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'expression' @ [53:15] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'expression' @ [55:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'elseExpression' @ [55:32] ==> public final val KtWhenExpression.elseExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [57:45] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'subjectExpression' @ [57:56] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'c' @ [58:32] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'trace' @ [58:34] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'getType' @ [58:40] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'subjectExpression' @ [58:48] ==> val subjectExpression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'type' @ [59:25] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'isFlexible' @ [59:30] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [59:56] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [59:71] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'asFlexibleType' @ [59:76] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'upperBound' @ [59:93] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'DataFlowValueFactory' @ [60:45] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [60:66] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'subjectExpression' @ [60:86] ==> val subjectExpression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'type' @ [60:105] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'c' @ [60:111] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'c' @ [61:44] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'trace' @ [61:46] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'EXPRESSION_TYPE_INFO' @ [61:67] ==> public final val EXPRESSION_TYPE_INFO: (WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'subjectExpression' @ [61:89] ==> val subjectExpression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'dataFlowInfo' @ [61:109] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[DeserializedPropertyDescriptor]

'dataFlowInfo' @ [62:29] ==> val dataFlowInfo: DataFlowInfo? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'!' @ [62:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dataFlowInfo' @ [62:54] ==> val dataFlowInfo: DataFlowInfo? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'getStableNullability' @ [62:67] ==> public abstract fun getStableNullability(key: DataFlowValue): Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedSimpleFunctionDescriptor]

'dataFlowValue' @ [62:88] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'canBeNull' @ [62:103] ==> public open fun canBeNull(): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[JavaMethodDescriptor]

'WhenChecker' @ [66:51] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg[FakeCallableDescriptorForObject]

'getClassDescriptorOfTypeIfEnum' @ [66:63] ==> @JvmStatic public final fun getClassDescriptorOfTypeIfEnum(type: KotlinType?): ClassDescriptor? defined in org.jetbrains.kotlin.cfg.WhenChecker[DeserializedSimpleFunctionDescriptor]

'type' @ [66:94] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'c' @ [67:39] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'trace' @ [67:41] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [67:47] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'WhenChecker' @ [68:29] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg[FakeCallableDescriptorForObject]

'getEnumMissingCases' @ [68:41] ==> @JvmStatic public final fun getEnumMissingCases(expression: KtWhenExpression, context: BindingContext, enumClassDescriptor: ClassDescriptor): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenChecker[DeserializedSimpleFunctionDescriptor]

'expression' @ [68:61] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'context' @ [68:73] ==> val context: BindingContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'enumClassDescriptor' @ [68:82] ==> val enumClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'isEmpty' @ [68:103] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'!' @ [69:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'WhenChecker' @ [69:33] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg[FakeCallableDescriptorForObject]

'containsNullCase' @ [69:45] ==> public final fun containsNullCase(expression: KtWhenExpression, context: BindingContext): Boolean defined in org.jetbrains.kotlin.cfg.WhenChecker[DeserializedSimpleFunctionDescriptor]

'expression' @ [69:62] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'context' @ [69:74] ==> val context: BindingContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'c' @ [71:29] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'trace' @ [71:31] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [71:37] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'WHEN_ENUM_CAN_BE_NULL_IN_JAVA' @ [71:54] ==> public final val WHEN_ENUM_CAN_BE_NULL_IN_JAVA: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [71:84] ==> @NotNull public open fun on(@NotNull p0: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'expression' @ [71:87] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'subjectExpression' @ [71:98] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [76:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'operationToken' @ [76:32] ==> public final val KtPostfixExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'EXCLEXCL' @ [76:59] ==> public final val EXCLEXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expression' @ [77:42] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'baseExpression' @ [77:53] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'c' @ [78:46] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'trace' @ [78:48] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'getType' @ [78:54] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'baseExpression' @ [78:62] ==> val baseExpression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'doIfNotNull' @ [79:21] ==> private final fun <T : Any> doIfNotNull(dataFlowValue: DataFlowValue, c: ResolutionContext<*>, body: () -> Unit): Unit? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'DataFlowValueFactory' @ [80:29] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [80:50] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'baseExpression' @ [80:70] ==> val baseExpression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'baseExpressionType' @ [80:86] ==> val baseExpressionType: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'c' @ [80:106] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'c' @ [80:110] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'c' @ [82:25] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'trace' @ [82:27] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [82:33] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNNECESSARY_NOT_NULL_ASSERTION' @ [82:47] ==> public final val UNNECESSARY_NOT_NULL_ASSERTION: (DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [82:78] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: KotlinType): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [82:81] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'operationReference' @ [82:92] ==> public final val KtPostfixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'baseExpressionType' @ [82:112] ==> val baseExpressionType: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[LocalVariableDescriptor]

'when (expression.operationToken) {
                    KtTokens.EQEQ,
                    KtTokens.EXCLEQ,
                    KtTokens.EQEQEQ,
                    KtTokens.EXCLEQEQEQ -> {
                        if (expression.left != null && expression.right != null) {
                            SenselessComparisonChecker.checkSenselessComparisonWithNull(
                                    expression, expression.left!!, expression.right!!, c,
                                    { c.trace.getType(it) },
                                    { value ->
                                        doIfNotNull(value, c) { Nullability.NOT_NULL } ?: Nullability.UNKNOWN
                                    }
                            )
                        }
                    }
                }' @ [86:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'expression' @ [86:23] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'operationToken' @ [86:34] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQEQ' @ [87:30] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQ' @ [88:30] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQEQEQ' @ [89:30] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQEQEQ' @ [90:30] ==> public final val EXCLEQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expression' @ [91:29] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'left' @ [91:40] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [91:56] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'right' @ [91:67] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'SenselessComparisonChecker' @ [92:29] ==> public object SenselessComparisonChecker defined in org.jetbrains.kotlin.types.expressions[FakeCallableDescriptorForObject]

'checkSenselessComparisonWithNull' @ [92:56] ==> @JvmStatic public final fun checkSenselessComparisonWithNull(expression: KtBinaryExpression, left: KtExpression, right: KtExpression, context: ResolutionContext<*>, getType: (KtExpression) -> KotlinType?, getNullability: (DataFlowValue) -> Nullability): Unit defined in org.jetbrains.kotlin.types.expressions.SenselessComparisonChecker[DeserializedSimpleFunctionDescriptor]

'expression' @ [93:37] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'expression' @ [93:49] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'left' @ [93:60] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [93:68] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'right' @ [93:79] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'c' @ [93:88] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'c' @ [94:39] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'trace' @ [94:41] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'getType' @ [94:47] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'it' @ [94:55] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType.<anonymous>[ValueParameterDescriptorImpl]

'doIfNotNull' @ [96:41] ==> private final fun <T : Any> doIfNotNull(dataFlowValue: DataFlowValue, c: ResolutionContext<*>, body: () -> Nullability): Nullability? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Nullability

'value' @ [96:53] ==> value-parameter value: DataFlowValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [96:60] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkType[ValueParameterDescriptorImpl]

'NOT_NULL' @ [96:77] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[FakeCallableDescriptorForObject]

'UNKNOWN' @ [96:103] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[FakeCallableDescriptorForObject]

'DataFlowValueFactory' @ [106:29] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [106:50] ==> @JvmStatic public final fun createDataFlowValue(receiverValue: ReceiverValue, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'receiverArgument' @ [106:70] ==> value-parameter receiverArgument: ReceiverValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'c' @ [106:88] ==> value-parameter c: CallResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'safeAccess' @ [107:13] ==> value-parameter safeAccess: Boolean defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'doIfNotNull' @ [108:13] ==> private final fun <T : Any> doIfNotNull(dataFlowValue: DataFlowValue, c: ResolutionContext<*>, body: () -> Unit): Unit? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'dataFlowValue' @ [108:25] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[LocalVariableDescriptor]

'c' @ [108:40] ==> value-parameter c: CallResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'c' @ [109:17] ==> value-parameter c: CallResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'trace' @ [109:19] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallResolutionContext[JavaPropertyDescriptor]

'report' @ [109:25] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNNECESSARY_SAFE_CALL' @ [109:39] ==> public final val UNNECESSARY_SAFE_CALL: (DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [109:61] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: KotlinType): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'c' @ [109:64] ==> value-parameter c: CallResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'call' @ [109:66] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallResolutionContext[JavaPropertyDescriptor]

'callOperationNode' @ [109:71] ==> public final val Call.callOperationNode: ASTNode?[MyPropertyDescriptor]

'psi' @ [109:91] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'receiverArgument' @ [109:96] ==> value-parameter receiverArgument: ReceiverValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'type' @ [109:113] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'doCheckType' @ [115:9] ==> private final fun doCheckType(expressionType: KotlinType, expectedType: KotlinType, dataFlowValue: DataFlowValue, dataFlowInfo: DataFlowInfo, reportWarning: (expectedMustNotBeNull: ErrorsJvm.NullabilityInformationSource, actualMayBeNull: ErrorsJvm.NullabilityInformationSource) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker[SimpleFunctionDescriptorImpl]

'receiverArgument' @ [116:17] ==> value-parameter receiverArgument: ReceiverValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'type' @ [116:34] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'receiverParameter' @ [117:17] ==> value-parameter receiverParameter: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'type' @ [117:35] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'dataFlowValue' @ [118:17] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[LocalVariableDescriptor]

'c' @ [119:17] ==> value-parameter c: CallResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [119:19] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.context.CallResolutionContext[JavaPropertyDescriptor]

'?:' @ [122:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtElement?, right: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtElement

'receiverArgument' @ [122:29] ==> value-parameter receiverArgument: ReceiverValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'expression' @ [122:71] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'c' @ [122:86] ==> value-parameter c: CallResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'call' @ [122:88] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallResolutionContext[JavaPropertyDescriptor]

'calleeExpression' @ [122:93] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'c' @ [122:113] ==> value-parameter c: CallResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'call' @ [122:115] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallResolutionContext[JavaPropertyDescriptor]

'callElement' @ [122:120] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'c' @ [123:13] ==> value-parameter c: CallResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver[ValueParameterDescriptorImpl]

'trace' @ [123:15] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallResolutionContext[JavaPropertyDescriptor]

'report' @ [123:21] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS' @ [123:38] ==> public final val NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS: (DiagnosticFactory2<(KtElement..KtElement?), (ErrorsJvm.NullabilityInformationSource..ErrorsJvm.NullabilityInformationSource?), (ErrorsJvm.NullabilityInformationSource..ErrorsJvm.NullabilityInformationSource?)>..DiagnosticFactory2<(KtElement..KtElement?), (ErrorsJvm.NullabilityInformationSource..ErrorsJvm.NullabilityInformationSource?), (ErrorsJvm.NullabilityInformationSource..ErrorsJvm.NullabilityInformationSource?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [123:85] ==> @NotNull public open fun on(@NotNull p0: KtElement, @NotNull p1: ErrorsJvm.NullabilityInformationSource, @NotNull p2: ErrorsJvm.NullabilityInformationSource): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'reportOn' @ [124:21] ==> val reportOn: KtElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver.<anonymous>[LocalVariableDescriptor]

'expectedMustNotBeNull' @ [124:31] ==> value-parameter expectedMustNotBeNull: ErrorsJvm.NullabilityInformationSource defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver.<anonymous>[ValueParameterDescriptorImpl]

'actualMayBeNull' @ [124:54] ==> value-parameter actualMayBeNull: ErrorsJvm.NullabilityInformationSource defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.checkReceiver.<anonymous>[ValueParameterDescriptorImpl]

'noExpectedType' @ [136:23] ==> public open fun noExpectedType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedType' @ [136:38] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doCheckType[ValueParameterDescriptorImpl]

'expectedType' @ [140:37] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doCheckType[ValueParameterDescriptorImpl]

'mustNotBeNull' @ [140:50] ==> private final fun KotlinType.mustNotBeNull(): ErrorsJvm.NullabilityInformationSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker[SimpleFunctionDescriptorImpl]

'dataFlowInfo' @ [141:13] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doCheckType[ValueParameterDescriptorImpl]

'getStableNullability' @ [141:26] ==> public abstract fun getStableNullability(key: DataFlowValue): Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedSimpleFunctionDescriptor]

'dataFlowValue' @ [141:47] ==> value-parameter dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doCheckType[ValueParameterDescriptorImpl]

'NOT_NULL' @ [141:77] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[FakeCallableDescriptorForObject]

'expressionType' @ [145:31] ==> value-parameter expressionType: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doCheckType[ValueParameterDescriptorImpl]

'mayBeNull' @ [145:46] ==> private final fun KotlinType.mayBeNull(): ErrorsJvm.NullabilityInformationSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker[SimpleFunctionDescriptorImpl]

'expectedMustNotBeNull' @ [146:13] ==> val expectedMustNotBeNull: ErrorsJvm.NullabilityInformationSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doCheckType[LocalVariableDescriptor]

'KOTLIN' @ [146:77] ==> enum entry KOTLIN defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm.NullabilityInformationSource[FakeCallableDescriptorForObject]

'actualMayBeNull' @ [146:87] ==> val actualMayBeNull: ErrorsJvm.NullabilityInformationSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doCheckType[LocalVariableDescriptor]

'KOTLIN' @ [146:145] ==> enum entry KOTLIN defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm.NullabilityInformationSource[FakeCallableDescriptorForObject]

'expectedMustNotBeNull' @ [151:13] ==> val expectedMustNotBeNull: ErrorsJvm.NullabilityInformationSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doCheckType[LocalVariableDescriptor]

'actualMayBeNull' @ [151:46] ==> val actualMayBeNull: ErrorsJvm.NullabilityInformationSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doCheckType[LocalVariableDescriptor]

'invoke' @ [152:13] ==> public abstract operator fun invoke(expectedMustNotBeNull: @ParameterName ErrorsJvm.NullabilityInformationSource, actualMayBeNull: @ParameterName ErrorsJvm.NullabilityInformationSource): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'expectedMustNotBeNull' @ [152:27] ==> val expectedMustNotBeNull: ErrorsJvm.NullabilityInformationSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doCheckType[LocalVariableDescriptor]

'actualMayBeNull' @ [152:50] ==> val actualMayBeNull: ErrorsJvm.NullabilityInformationSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doCheckType[LocalVariableDescriptor]

'if (c.dataFlowInfo.getStableNullability(dataFlowValue).canBeNull() &&
                dataFlowValue.type.mustNotBeNull() == ErrorsJvm.NullabilityInformationSource.JAVA)
                body()
            else null' @ [157:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'c' @ [157:17] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doIfNotNull[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [157:19] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'getStableNullability' @ [157:32] ==> public abstract fun getStableNullability(key: DataFlowValue): Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedSimpleFunctionDescriptor]

'dataFlowValue' @ [157:53] ==> value-parameter dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doIfNotNull[ValueParameterDescriptorImpl]

'canBeNull' @ [157:68] ==> public open fun canBeNull(): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[JavaMethodDescriptor]

'dataFlowValue' @ [158:17] ==> value-parameter dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.doIfNotNull[ValueParameterDescriptorImpl]

'type' @ [158:31] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[DeserializedPropertyDescriptor]

'mustNotBeNull' @ [158:36] ==> private final fun KotlinType.mustNotBeNull(): ErrorsJvm.NullabilityInformationSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker[SimpleFunctionDescriptorImpl]

'JAVA' @ [158:94] ==> enum entry JAVA defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm.NullabilityInformationSource[FakeCallableDescriptorForObject]

'invoke' @ [159:17] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'when {
        !isError && !isFlexible() && !TypeUtils.acceptsNullable(this) -> ErrorsJvm.NullabilityInformationSource.KOTLIN
        isFlexible() && !TypeUtils.acceptsNullable(asFlexibleType().upperBound) -> ErrorsJvm.NullabilityInformationSource.KOTLIN
        this is TypeWithEnhancement && enhancement.mustNotBeNull() != null -> ErrorsJvm.NullabilityInformationSource.JAVA
        else -> null
    }' @ [162:87] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ErrorsJvm.NullabilityInformationSource?, entry1: ErrorsJvm.NullabilityInformationSource?, entry2: ErrorsJvm.NullabilityInformationSource?, entry3: ErrorsJvm.NullabilityInformationSource?): ErrorsJvm.NullabilityInformationSource?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NullabilityInformationSource?

'!' @ [163:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isError' @ [163:10] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'!' @ [163:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFlexible' @ [163:22] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'!' @ [163:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'acceptsNullable' @ [163:49] ==> public open fun acceptsNullable(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [163:65] ==> <this> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.mustNotBeNull[ReceiverParameterDescriptorImpl]

'KOTLIN' @ [163:113] ==> enum entry KOTLIN defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm.NullabilityInformationSource[FakeCallableDescriptorForObject]

'isFlexible' @ [164:9] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'!' @ [164:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'acceptsNullable' @ [164:36] ==> public open fun acceptsNullable(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'asFlexibleType' @ [164:52] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'upperBound' @ [164:69] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'KOTLIN' @ [164:123] ==> enum entry KOTLIN defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm.NullabilityInformationSource[FakeCallableDescriptorForObject]

'this' @ [165:9] ==> <this> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.mustNotBeNull[ReceiverParameterDescriptorImpl]

'enhancement' @ [165:40] ==> public abstract val enhancement: KotlinType defined in org.jetbrains.kotlin.types.TypeWithEnhancement[DeserializedPropertyDescriptor]

'mustNotBeNull' @ [165:52] ==> private final fun KotlinType.mustNotBeNull(): ErrorsJvm.NullabilityInformationSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker[SimpleFunctionDescriptorImpl]

'JAVA' @ [165:118] ==> enum entry JAVA defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm.NullabilityInformationSource[FakeCallableDescriptorForObject]

'when {
        !isError && !isFlexible() && TypeUtils.acceptsNullable(this) -> ErrorsJvm.NullabilityInformationSource.KOTLIN
        isFlexible() && TypeUtils.acceptsNullable(asFlexibleType().lowerBound) -> ErrorsJvm.NullabilityInformationSource.KOTLIN
        this is TypeWithEnhancement && enhancement.mayBeNull() != null -> ErrorsJvm.NullabilityInformationSource.JAVA
        else -> null
    }' @ [169:83] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ErrorsJvm.NullabilityInformationSource?, entry1: ErrorsJvm.NullabilityInformationSource?, entry2: ErrorsJvm.NullabilityInformationSource?, entry3: ErrorsJvm.NullabilityInformationSource?): ErrorsJvm.NullabilityInformationSource?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NullabilityInformationSource?

'!' @ [170:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isError' @ [170:10] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'!' @ [170:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFlexible' @ [170:22] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'acceptsNullable' @ [170:48] ==> public open fun acceptsNullable(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [170:64] ==> <this> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.mayBeNull[ReceiverParameterDescriptorImpl]

'KOTLIN' @ [170:112] ==> enum entry KOTLIN defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm.NullabilityInformationSource[FakeCallableDescriptorForObject]

'isFlexible' @ [171:9] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'acceptsNullable' @ [171:35] ==> public open fun acceptsNullable(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'asFlexibleType' @ [171:51] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'lowerBound' @ [171:68] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'KOTLIN' @ [171:122] ==> enum entry KOTLIN defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm.NullabilityInformationSource[FakeCallableDescriptorForObject]

'this' @ [172:9] ==> <this> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker.mayBeNull[ReceiverParameterDescriptorImpl]

'enhancement' @ [172:40] ==> public abstract val enhancement: KotlinType defined in org.jetbrains.kotlin.types.TypeWithEnhancement[DeserializedPropertyDescriptor]

'mayBeNull' @ [172:52] ==> private final fun KotlinType.mayBeNull(): ErrorsJvm.NullabilityInformationSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaNullabilityChecker[SimpleFunctionDescriptorImpl]

'JAVA' @ [172:114] ==> enum entry JAVA defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm.NullabilityInformationSource[FakeCallableDescriptorForObject]

