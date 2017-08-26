'DoubleColonLHS' @ [78:86] ==> private constructor DoubleColonLHS(type: KotlinType) defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS[ClassConstructorDescriptorImpl]

'typeInfo' @ [78:101] ==> value-parameter typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression.<init>[ValueParameterDescriptorImpl]

'type' @ [78:110] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'typeInfo' @ [79:42] ==> public final val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[PropertyDescriptorImpl]

'dataFlowInfo' @ [79:51] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'DoubleColonLHS' @ [82:76] ==> private constructor DoubleColonLHS(type: KotlinType) defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS[ClassConstructorDescriptorImpl]

'type' @ [82:91] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Type.<init>[ValueParameterDescriptorImpl]

'valueArgumentList' @ [87:13] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'lambdaArguments' @ [87:42] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [87:58] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'Inject' @ [101:5] ==> public constructor Inject() defined in javax.inject.Inject[JavaClassConstructorDescriptor]

'this' @ [103:9] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[LazyClassReceiverParameterDescriptor]

'expressionTypingServices' @ [103:14] ==> private final lateinit var expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'expressionTypingServices' @ [103:41] ==> value-parameter expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.setExpressionTypingServices[ValueParameterDescriptorImpl]

'if (expression.isEmptyLHS) {
            // "::class" will maybe mean "this::class", a class of "this" instance
            c.trace.report(UNSUPPORTED.on(expression, "Class literals with empty left hand side are not yet supported"))
        }
        else {
            val result = resolveDoubleColonLHS(expression, c)
            if (result != null && !result.type.isError) {
                val inherentType = result.type
                val dataFlowInfo = (result as? DoubleColonLHS.Expression)?.dataFlowInfo ?: c.dataFlowInfo
                val dataFlowValue = DataFlowValueFactory.createDataFlowValue(expression.receiverExpression!!, inherentType, c)
                val type =
                        if (!dataFlowInfo.getStableNullability(dataFlowValue).canBeNull()) inherentType.makeNotNullable()
                        else inherentType
                checkClassLiteral(c, expression, type, result)
                val variance =
                        if (result is DoubleColonLHS.Expression && !result.isObjectQualifier) Variance.OUT_VARIANCE else Variance.INVARIANT
                val kClassType = reflectionTypes.getKClassType(Annotations.EMPTY, type, variance)
                return dataFlowAnalyzer.checkType(createTypeInfo(kClassType, dataFlowInfo), expression, c)
            }
        }' @ [107:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expression' @ [107:13] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'isEmptyLHS' @ [107:24] ==> public final val isEmptyLHS: Boolean defined in org.jetbrains.kotlin.psi.KtClassLiteralExpression[PropertyDescriptorImpl]

'c' @ [109:13] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'trace' @ [109:15] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [109:21] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [109:28] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [109:40] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [109:43] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'resolveDoubleColonLHS' @ [112:26] ==> internal final fun resolveDoubleColonLHS(doubleColonExpression: KtDoubleColonExpression, c: ExpressionTypingContext): DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [112:48] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'c' @ [112:60] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'result' @ [113:17] ==> val result: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'!' @ [113:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [113:36] ==> val result: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'type' @ [113:43] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS[PropertyDescriptorImpl]

'isError' @ [113:48] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'result' @ [114:36] ==> val result: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'type' @ [114:43] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS[PropertyDescriptorImpl]

'?:' @ [115:36] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DataFlowInfo?, right: DataFlowInfo): DataFlowInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DataFlowInfo

'result' @ [115:37] ==> val result: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'dataFlowInfo' @ [115:76] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[PropertyDescriptorImpl]

'c' @ [115:92] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [115:94] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'DataFlowValueFactory' @ [116:37] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [116:58] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expression' @ [116:78] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'receiverExpression' @ [116:89] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtClassLiteralExpression[PropertyDescriptorImpl]

'inherentType' @ [116:111] ==> val inherentType: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'c' @ [116:125] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'if (!dataFlowInfo.getStableNullability(dataFlowValue).canBeNull()) inherentType.makeNotNullable()
                        else inherentType' @ [118:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'!' @ [118:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dataFlowInfo' @ [118:30] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'getStableNullability' @ [118:43] ==> public abstract fun getStableNullability(key: DataFlowValue): Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'dataFlowValue' @ [118:64] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'canBeNull' @ [118:79] ==> public open fun canBeNull(): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[JavaMethodDescriptor]

'inherentType' @ [118:92] ==> val inherentType: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'makeNotNullable' @ [118:105] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'inherentType' @ [119:30] ==> val inherentType: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'checkClassLiteral' @ [120:17] ==> private final fun checkClassLiteral(c: ExpressionTypingContext, expression: KtClassLiteralExpression, type: KotlinType, result: DoubleColonLHS): Unit defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'c' @ [120:35] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'expression' @ [120:38] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'type' @ [120:50] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'result' @ [120:56] ==> val result: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'if (result is DoubleColonLHS.Expression && !result.isObjectQualifier) Variance.OUT_VARIANCE else Variance.INVARIANT' @ [122:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Variance, elseBranch: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Variance

'result' @ [122:29] ==> val result: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'!' @ [122:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [122:69] ==> val result: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'isObjectQualifier' @ [122:76] ==> public final val isObjectQualifier: Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[PropertyDescriptorImpl]

'OUT_VARIANCE' @ [122:104] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'INVARIANT' @ [122:131] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'reflectionTypes' @ [123:34] ==> public final val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'getKClassType' @ [123:50] ==> public final fun getKClassType(annotations: Annotations, type: KotlinType, variance: Variance): KotlinType defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedSimpleFunctionDescriptor]

'Annotations' @ [123:64] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [123:76] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'type' @ [123:83] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'variance' @ [123:89] ==> val variance: Variance defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'dataFlowAnalyzer' @ [124:24] ==> public final val dataFlowAnalyzer: DataFlowAnalyzer defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'checkType' @ [124:41] ==> @NotNull public open fun checkType(@NotNull typeInfo: KotlinTypeInfo, @NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'createTypeInfo' @ [124:51] ==> public fun createTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'kClassType' @ [124:66] ==> val kClassType: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'dataFlowInfo' @ [124:78] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[LocalVariableDescriptor]

'expression' @ [124:93] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'c' @ [124:105] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'createTypeInfo' @ [128:16] ==> public fun createTypeInfo(type: KotlinType?, context: ResolutionContext<*>): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'createErrorType' @ [128:42] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'c' @ [128:79] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'result' @ [137:13] ==> value-parameter result: DoubleColonLHS defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'!' @ [138:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [138:18] ==> value-parameter result: DoubleColonLHS defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'isObjectQualifier' @ [138:25] ==> public final val isObjectQualifier: Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[PropertyDescriptorImpl]

'!' @ [139:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [139:22] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'isSubtypeOf' @ [139:27] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'type' @ [139:39] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'builtIns' @ [139:44] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'anyType' @ [139:53] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'c' @ [140:21] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'trace' @ [140:23] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [140:29] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'EXPRESSION_OF_NULLABLE_TYPE_IN_CLASS_LITERAL_LHS' @ [140:36] ==> public final val EXPRESSION_OF_NULLABLE_TYPE_IN_CLASS_LITERAL_LHS: (DiagnosticFactory1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [140:85] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: KotlinType): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [140:88] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'receiverExpression' @ [140:99] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtClassLiteralExpression[PropertyDescriptorImpl]

'type' @ [140:121] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'reportUnsupportedIfNeeded' @ [142:17] ==> private final fun reportUnsupportedIfNeeded(expression: KtDoubleColonExpression, c: ExpressionTypingContext): Unit defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [142:43] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'c' @ [142:55] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'result' @ [147:9] ==> value-parameter result: DoubleColonLHS defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'type' @ [148:26] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'constructor' @ [148:31] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [148:43] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'result' @ [149:13] ==> value-parameter result: DoubleColonLHS defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'possiblyBareType' @ [149:20] ==> public final val possiblyBareType: PossiblyBareType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Type[PropertyDescriptorImpl]

'isBare' @ [149:37] ==> public final val PossiblyBareType.isBare: Boolean[MyPropertyDescriptor]

'descriptor' @ [150:17] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[LocalVariableDescriptor]

'isNonPrimitiveArray' @ [150:65] ==> public open fun isNonPrimitiveArray(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'descriptor' @ [150:85] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[LocalVariableDescriptor]

'c' @ [151:17] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'trace' @ [151:19] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [151:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ARRAY_CLASS_LITERAL_REQUIRES_ARGUMENT' @ [151:32] ==> public final val ARRAY_CLASS_LITERAL_REQUIRES_ARGUMENT: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [151:70] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'expression' @ [151:73] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'if (type is SimpleType && !type.isMarkedNullable && descriptor is TypeParameterDescriptor && !descriptor.isReified) {
            c.trace.report(TYPE_PARAMETER_AS_REIFIED.on(expression, descriptor))
        }
        // Note that "T::class" is allowed for type parameter T without a non-null upper bound
        else if ((TypeUtils.isNullableType(type) && descriptor !is TypeParameterDescriptor) || expression.hasQuestionMarks) {
            c.trace.report(NULLABLE_TYPE_IN_CLASS_LITERAL_LHS.on(expression))
        }
        else if (!result.possiblyBareType.isBare && !isAllowedInClassLiteral(type)) {
            c.trace.report(CLASS_LITERAL_LHS_NOT_A_CLASS.on(expression))
        }' @ [155:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'type' @ [155:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'!' @ [155:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [155:36] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [155:41] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'descriptor' @ [155:61] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[LocalVariableDescriptor]

'!' @ [155:102] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [155:103] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[LocalVariableDescriptor]

'isReified' @ [155:114] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

'c' @ [156:13] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'trace' @ [156:15] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [156:21] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPE_PARAMETER_AS_REIFIED' @ [156:28] ==> public final val TYPE_PARAMETER_AS_REIFIED: (DiagnosticFactory1<(PsiElement..PsiElement?), (TypeParameterDescriptor..TypeParameterDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (TypeParameterDescriptor..TypeParameterDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [156:54] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: TypeParameterDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [156:57] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'descriptor' @ [156:69] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[LocalVariableDescriptor]

'if ((TypeUtils.isNullableType(type) && descriptor !is TypeParameterDescriptor) || expression.hasQuestionMarks) {
            c.trace.report(NULLABLE_TYPE_IN_CLASS_LITERAL_LHS.on(expression))
        }
        else if (!result.possiblyBareType.isBare && !isAllowedInClassLiteral(type)) {
            c.trace.report(CLASS_LITERAL_LHS_NOT_A_CLASS.on(expression))
        }' @ [159:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isNullableType' @ [159:29] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [159:44] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'descriptor' @ [159:53] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[LocalVariableDescriptor]

'expression' @ [159:96] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'hasQuestionMarks' @ [159:107] ==> public final val hasQuestionMarks: Boolean defined in org.jetbrains.kotlin.psi.KtClassLiteralExpression[PropertyDescriptorImpl]

'c' @ [160:13] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'trace' @ [160:15] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [160:21] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NULLABLE_TYPE_IN_CLASS_LITERAL_LHS' @ [160:28] ==> public final val NULLABLE_TYPE_IN_CLASS_LITERAL_LHS: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [160:63] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'expression' @ [160:66] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'!' @ [162:18] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [162:19] ==> value-parameter result: DoubleColonLHS defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'possiblyBareType' @ [162:26] ==> public final val possiblyBareType: PossiblyBareType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Type[PropertyDescriptorImpl]

'isBare' @ [162:43] ==> public final val PossiblyBareType.isBare: Boolean[MyPropertyDescriptor]

'!' @ [162:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAllowedInClassLiteral' @ [162:54] ==> private final fun isAllowedInClassLiteral(type: KotlinType): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'type' @ [162:78] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'c' @ [163:13] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'trace' @ [163:15] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [163:21] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CLASS_LITERAL_LHS_NOT_A_CLASS' @ [163:28] ==> public final val CLASS_LITERAL_LHS_NOT_A_CLASS: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [163:58] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'expression' @ [163:61] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'additionalCheckers' @ [165:35] ==> public final val additionalCheckers: Iterable<ClassLiteralChecker> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'additionalChecker' @ [166:13] ==> val additionalChecker: ClassLiteralChecker defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[LocalVariableDescriptor]

'check' @ [166:31] ==> public abstract fun check(expression: KtClassLiteralExpression, type: KotlinType, context: ResolutionContext<*>): Unit defined in org.jetbrains.kotlin.types.expressions.ClassLiteralChecker[SimpleFunctionDescriptorImpl]

'expression' @ [166:37] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'type' @ [166:49] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'c' @ [166:55] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkClassLiteral[ValueParameterDescriptorImpl]

'when (this) {
            is KtCallExpression ->
                !isWithoutValueArguments
            is KtDotQualifiedExpression ->
                receiverExpression.canBeConsideredProperExpression() &&
                selectorExpression?.canBeConsideredProperExpression() ?: false
            else -> true
        }' @ [174:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [174:22] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.canBeConsideredProperExpression[ReceiverParameterDescriptorImpl]

'!' @ [176:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isWithoutValueArguments' @ [176:18] ==> internal val KtCallExpression.isWithoutValueArguments: Boolean defined in org.jetbrains.kotlin.types.expressions in file DoubleColonExpressionResolver.kt[PropertyDescriptorImpl]

'receiverExpression' @ [178:17] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[PropertyDescriptorImpl]

'canBeConsideredProperExpression' @ [178:36] ==> private final fun KtExpression.canBeConsideredProperExpression(): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'selectorExpression' @ [179:17] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[PropertyDescriptorImpl]

'canBeConsideredProperExpression' @ [179:37] ==> private final fun KtExpression.canBeConsideredProperExpression(): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'when (this) {
            is KtSimpleNameExpression ->
                true
            is KtCallExpression ->
                isWithoutValueArguments
            is KtDotQualifiedExpression ->
                receiverExpression.canBeConsideredProperType() && selectorExpression.let { it != null && it.canBeConsideredProperType() }
            else -> false
        }' @ [185:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [185:22] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.canBeConsideredProperType[ReceiverParameterDescriptorImpl]

'isWithoutValueArguments' @ [189:17] ==> internal val KtCallExpression.isWithoutValueArguments: Boolean defined in org.jetbrains.kotlin.types.expressions in file DoubleColonExpressionResolver.kt[PropertyDescriptorImpl]

'receiverExpression' @ [191:17] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[PropertyDescriptorImpl]

'canBeConsideredProperType' @ [191:36] ==> private final fun KtExpression.canBeConsideredProperType(): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'selectorExpression' @ [191:67] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[PropertyDescriptorImpl]

'let' @ [191:86] ==> @InlineOnly public inline fun <T, R> KtExpression?.let(block: (KtExpression?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?
    <R> -> Boolean

'it' @ [191:92] ==> value-parameter it: KtExpression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.canBeConsideredProperType.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [191:106] ==> value-parameter it: KtExpression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.canBeConsideredProperType.<anonymous>[ValueParameterDescriptorImpl]

'canBeConsideredProperType' @ [191:109] ==> private final fun KtExpression.canBeConsideredProperType(): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [197:19] ==> value-parameter expression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsExpression[ValueParameterDescriptorImpl]

'receiverExpression' @ [197:30] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'lhs' @ [198:16] ==> val lhs: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsExpression[LocalVariableDescriptor]

'canBeConsideredProperExpression' @ [198:20] ==> private final fun KtExpression.canBeConsideredProperExpression(): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'!' @ [198:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [198:58] ==> value-parameter expression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsExpression[ValueParameterDescriptorImpl]

'hasQuestionMarks' @ [198:69] ==> public final val hasQuestionMarks: Boolean defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'expression' @ [202:19] ==> value-parameter expression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsType[ValueParameterDescriptorImpl]

'receiverExpression' @ [202:30] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'lhs' @ [203:16] ==> val lhs: KtExpression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsType[LocalVariableDescriptor]

'lhs' @ [203:31] ==> val lhs: KtExpression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsType[LocalVariableDescriptor]

'canBeConsideredProperType' @ [203:35] ==> private final fun KtExpression.canBeConsideredProperType(): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'!' @ [207:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [207:14] ==> public final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'supportsFeature' @ [207:38] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [207:54] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'BoundCallableReferences' @ [207:70] ==> enum entry BoundCallableReferences defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'c' @ [208:13] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedIfNeeded[ValueParameterDescriptorImpl]

'trace' @ [208:15] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [208:21] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED_FEATURE' @ [208:28] ==> public final val UNSUPPORTED_FEATURE: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [208:48] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [208:51] ==> value-parameter expression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedIfNeeded[ValueParameterDescriptorImpl]

'receiverExpression' @ [208:62] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'LanguageFeature' @ [208:84] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'BoundCallableReferences' @ [208:100] ==> enum entry BoundCallableReferences defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'languageVersionSettings' @ [208:127] ==> public final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'expression' @ [213:19] ==> value-parameter expression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedExpression[ValueParameterDescriptorImpl]

'receiverExpression' @ [213:30] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'expression' @ [214:17] ==> value-parameter expression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedExpression[ValueParameterDescriptorImpl]

'hasQuestionMarks' @ [214:28] ==> public final val hasQuestionMarks: Boolean defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'lhs' @ [214:48] ==> val lhs: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedExpression[LocalVariableDescriptor]

'canBeConsideredProperExpression' @ [214:52] ==> private final fun KtExpression.canBeConsideredProperExpression(): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'lhs' @ [215:17] ==> val lhs: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedExpression[LocalVariableDescriptor]

'lhs' @ [215:44] ==> val lhs: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedExpression[LocalVariableDescriptor]

'canBeReservedGenericPropertyCall' @ [215:48] ==> private final fun KtExpression?.canBeReservedGenericPropertyCall(): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'this' @ [219:13] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[ReceiverParameterDescriptorImpl]

'listOf' @ [219:52] ==> public fun <T> listOf(element: KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'this' @ [219:59] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[ReceiverParameterDescriptorImpl]

'ArrayDeque' @ [221:22] ==> public constructor ArrayDeque<E : (Any..Any?)>() defined in java.util.ArrayDeque[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'this' @ [222:45] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[ReceiverParameterDescriptorImpl]

'finger' @ [224:17] ==> var finger: KtQualifiedExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[LocalVariableDescriptor]

'operationSign' @ [224:24] ==> public open val operationSign: KtSingleValueToken defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'DOT' @ [224:50] ==> public final val DOT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'finger' @ [226:13] ==> var finger: KtQualifiedExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[LocalVariableDescriptor]

'selectorExpression' @ [226:20] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'let' @ [226:40] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'result' @ [226:46] ==> val result: ArrayDeque<KtExpression> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[LocalVariableDescriptor]

'push' @ [226:53] ==> public open fun push(p0: (KtExpression..KtExpression?)): Unit defined in java.util.ArrayDeque[JavaMethodDescriptor]

'it' @ [226:58] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts.<anonymous>[ValueParameterDescriptorImpl]

'finger' @ [228:28] ==> var finger: KtQualifiedExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[LocalVariableDescriptor]

'receiverExpression' @ [228:35] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'if (receiver is KtQualifiedExpression) {
                finger = receiver
            }
            else {
                result.push(receiver)
                return result.toList()
            }' @ [229:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'receiver' @ [229:17] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[LocalVariableDescriptor]

'finger' @ [230:17] ==> var finger: KtQualifiedExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[LocalVariableDescriptor]

'receiver' @ [230:26] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[LocalVariableDescriptor]

'result' @ [233:17] ==> val result: ArrayDeque<KtExpression> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[LocalVariableDescriptor]

'push' @ [233:24] ==> public open fun push(p0: (KtExpression..KtExpression?)): Unit defined in java.util.ArrayDeque[JavaMethodDescriptor]

'receiver' @ [233:29] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[LocalVariableDescriptor]

'result' @ [234:24] ==> val result: ArrayDeque<KtExpression> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifierChainParts[LocalVariableDescriptor]

'toList' @ [234:31] ==> public fun <T> Iterable<(KtExpression..KtExpression?)>.toList(): List<(KtExpression..KtExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'?:' @ [240:19] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtQualifiedExpression?, right: KtQualifiedExpression): KtQualifiedExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtQualifiedExpression

'expression' @ [240:20] ==> value-parameter expression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedCallChain[ValueParameterDescriptorImpl]

'receiverExpression' @ [240:31] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'lhs' @ [241:21] ==> val lhs: KtQualifiedExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedCallChain[LocalVariableDescriptor]

'getQualifierChainParts' @ [241:25] ==> private final fun KtExpression.getQualifierChainParts(): List<KtExpression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'parts' @ [242:16] ==> val parts: List<KtExpression> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedCallChain[LocalVariableDescriptor]

'all' @ [242:22] ==> public inline fun <T> Iterable<KtExpression>.all(predicate: (KtExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [242:28] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedCallChain.<anonymous>[ValueParameterDescriptorImpl]

'canBeReservedGenericPropertyCall' @ [242:31] ==> private final fun KtExpression?.canBeReservedGenericPropertyCall(): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'parts' @ [243:16] ==> val parts: List<KtExpression> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedCallChain[LocalVariableDescriptor]

'any' @ [243:22] ==> public inline fun <T> Iterable<KtExpression>.any(predicate: (KtExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [243:28] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedCallChain.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [243:54] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.shouldTryResolveLHSAsReservedCallChain.<anonymous>[ValueParameterDescriptorImpl]

'typeArguments' @ [243:57] ==> public final val KtCallExpression.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [243:71] ==> @InlineOnly public inline fun <T> Collection<(KtTypeProjection..KtTypeProjection?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)

'getQualifiedNameStringPart' @ [247:13] ==> private final fun KtExpression?.getQualifiedNameStringPart(): String? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'when (this) {
                is KtNameReferenceExpression ->
                    text
                is KtCallExpression ->
                    if (valueArguments.isEmpty() && typeArguments.isNotEmpty())
                        (calleeExpression as? KtNameReferenceExpression)?.text
                    else
                        null
                else ->
                    null
            }' @ [250:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'this' @ [250:19] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getQualifiedNameStringPart[ReceiverParameterDescriptorImpl]

'text' @ [252:21] ==> public final val KtNameReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'if (valueArguments.isEmpty() && typeArguments.isNotEmpty())
                        (calleeExpression as? KtNameReferenceExpression)?.text
                    else
                        null' @ [254:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'valueArguments' @ [254:25] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [254:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'typeArguments' @ [254:53] ==> public final val KtCallExpression.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [254:67] ==> @InlineOnly public inline fun <T> Collection<(KtTypeProjection..KtTypeProjection?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)

'calleeExpression' @ [255:26] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'text' @ [255:75] ==> public final val KtNameReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'this' @ [263:21] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.buildNewExpressionForReservedGenericPropertyCallChainResolution[ReceiverParameterDescriptorImpl]

'getQualifierChainParts' @ [263:26] ==> private final fun KtExpression.getQualifierChainParts(): List<KtExpression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'map' @ [263:52] ==> public inline fun <T, R> Iterable<KtExpression>.map(transform: (KtExpression) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> String

'it' @ [263:58] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.buildNewExpressionForReservedGenericPropertyCallChainResolution.<anonymous>[ValueParameterDescriptorImpl]

'getQualifiedNameStringPart' @ [263:61] ==> private final fun KtExpression?.getQualifiedNameStringPart(): String? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'parts' @ [264:39] ==> val parts: List<String> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.buildNewExpressionForReservedGenericPropertyCallChainResolution[LocalVariableDescriptor]

'joinToString' @ [264:45] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'KtPsiFactory' @ [265:16] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'this' @ [265:29] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.buildNewExpressionForReservedGenericPropertyCallChainResolution[ReceiverParameterDescriptorImpl]

'createExpression' @ [265:58] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'qualifiedExpressionText' @ [265:75] ==> val qualifiedExpressionText: String defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.buildNewExpressionForReservedGenericPropertyCallChainResolution[LocalVariableDescriptor]

'expression' @ [269:37] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[ValueParameterDescriptorImpl]

'parent' @ [269:48] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (expression is KtCallExpression && expression.typeArguments.isNotEmpty()) {
            val callee = expression.calleeExpression ?: return null
            val calleeAsDoubleColonLHS = resolveExpressionOnLHS(callee, c) ?: return null

            for (typeArgument in expression.typeArguments) {
                val typeReference = typeArgument.typeReference ?: continue
                typeResolver.resolveType(c.scope, typeReference, c.trace, true)
            }

            return calleeAsDoubleColonLHS
        }
        else if (doubleColonExpression.hasQuestionMarks) {
            return resolveExpressionOnLHS(expression, c)
        }
        else {
            return null
        }' @ [272:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'expression' @ [272:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[ValueParameterDescriptorImpl]

'expression' @ [272:47] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[ValueParameterDescriptorImpl]

'typeArguments' @ [272:58] ==> public final val KtCallExpression.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [272:72] ==> @InlineOnly public inline fun <T> Collection<(KtTypeProjection..KtTypeProjection?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)

'expression' @ [273:26] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[ValueParameterDescriptorImpl]

'calleeExpression' @ [273:37] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'resolveExpressionOnLHS' @ [274:42] ==> private final fun resolveExpressionOnLHS(expression: KtExpression, c: ExpressionTypingContext): DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'callee' @ [274:65] ==> val callee: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[LocalVariableDescriptor]

'c' @ [274:73] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[ValueParameterDescriptorImpl]

'expression' @ [276:34] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[ValueParameterDescriptorImpl]

'typeArguments' @ [276:45] ==> public final val KtCallExpression.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'typeArgument' @ [277:37] ==> val typeArgument: (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[LocalVariableDescriptor]

'typeReference' @ [277:50] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeResolver' @ [278:17] ==> public final val typeResolver: TypeResolver defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'resolveType' @ [278:30] ==> public final fun resolveType(scope: LexicalScope, typeReference: KtTypeReference, trace: BindingTrace, checkBounds: Boolean): KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'c' @ [278:42] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[ValueParameterDescriptorImpl]

'scope' @ [278:44] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'typeReference' @ [278:51] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[LocalVariableDescriptor]

'c' @ [278:66] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[ValueParameterDescriptorImpl]

'trace' @ [278:68] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'calleeAsDoubleColonLHS' @ [281:20] ==> val calleeAsDoubleColonLHS: DoubleColonLHS.Expression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[LocalVariableDescriptor]

'if (doubleColonExpression.hasQuestionMarks) {
            return resolveExpressionOnLHS(expression, c)
        }
        else {
            return null
        }' @ [283:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'doubleColonExpression' @ [283:18] ==> val doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[LocalVariableDescriptor]

'hasQuestionMarks' @ [283:40] ==> public final val hasQuestionMarks: Boolean defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'resolveExpressionOnLHS' @ [284:20] ==> private final fun resolveExpressionOnLHS(expression: KtExpression, c: ExpressionTypingContext): DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [284:43] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[ValueParameterDescriptorImpl]

'c' @ [284:55] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionOnLHS[ValueParameterDescriptorImpl]

'expression' @ [292:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedCallChainOnLHS[ValueParameterDescriptorImpl]

'expression' @ [294:29] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedCallChainOnLHS[ValueParameterDescriptorImpl]

'buildNewExpressionForReservedGenericPropertyCallChainResolution' @ [294:40] ==> private final fun KtQualifiedExpression.buildNewExpressionForReservedGenericPropertyCallChainResolution(): KtExpression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'create' @ [296:61] ==> public open fun create(context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?), debugName: (String..String?), expression: (KtExpression..KtExpression?)): (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'c' @ [296:68] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedCallChainOnLHS[ValueParameterDescriptorImpl]

'newExpression' @ [296:131] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedCallChainOnLHS[LocalVariableDescriptor]

'c' @ [298:17] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedCallChainOnLHS[ValueParameterDescriptorImpl]

'replaceTraceAndCache' @ [298:19] ==> @NotNull public open fun replaceTraceAndCache(@NotNull traceAndCache: TemporaryTraceAndCache): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'temporaryTraceAndCache' @ [298:40] ==> val temporaryTraceAndCache: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedCallChainOnLHS[LocalVariableDescriptor]

'replaceExpectedType' @ [299:26] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'NO_EXPECTED_TYPE' @ [299:46] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'replaceContextDependency' @ [300:26] ==> @NotNull public open fun replaceContextDependency(@NotNull newContextDependency: ContextDependency): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'INDEPENDENT' @ [300:69] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'resolveExpressionOnLHS' @ [302:16] ==> private final fun resolveExpressionOnLHS(expression: KtExpression, c: ExpressionTypingContext): DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [302:39] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedCallChainOnLHS[ValueParameterDescriptorImpl]

'contextForCallChainResolution' @ [302:51] ==> val contextForCallChainResolution: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedCallChainOnLHS[LocalVariableDescriptor]

'tryResolveLHS' @ [307:37] ==> private final fun <T : DoubleColonLHS> tryResolveLHS(doubleColonExpression: KtDoubleColonExpression, context: ExpressionTypingContext, criterion: (KtDoubleColonExpression) -> Boolean, resolve: (KtExpression, ExpressionTypingContext) -> DoubleColonLHS.Expression?): DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : DoubleColonLHS> -> Expression

'doubleColonExpression' @ [307:51] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[ValueParameterDescriptorImpl]

'c' @ [307:74] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[ValueParameterDescriptorImpl]

'this' @ [308:51] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[LazyClassReceiverParameterDescriptor]

'this' @ [309:51] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[LazyClassReceiverParameterDescriptor]

'resultForReservedExpr' @ [310:13] ==> val resultForReservedExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[LocalVariableDescriptor]

'resultForReservedExpr' @ [311:23] ==> val resultForReservedExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[LocalVariableDescriptor]

'lhs' @ [311:45] ==> public final val lhs: DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'lhs' @ [312:17] ==> val lhs: DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[LocalVariableDescriptor]

'c' @ [313:17] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[ValueParameterDescriptorImpl]

'trace' @ [313:19] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [313:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'RESERVED_SYNTAX_IN_CALLABLE_REFERENCE_LHS' @ [313:32] ==> public final val RESERVED_SYNTAX_IN_CALLABLE_REFERENCE_LHS: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [313:74] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'resultForReservedExpr' @ [313:77] ==> val resultForReservedExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[LocalVariableDescriptor]

'expression' @ [313:99] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'Pair' @ [314:24] ==> public constructor Pair<out A, out B>(first: Boolean, second: DoubleColonLHS.Expression?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Boolean
    <out B> -> Expression?

'resultForReservedExpr' @ [314:35] ==> val resultForReservedExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[LocalVariableDescriptor]

'commit' @ [314:57] ==> public final fun commit(): DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[SimpleFunctionDescriptorImpl]

'tryResolveLHS' @ [318:42] ==> private final fun <T : DoubleColonLHS> tryResolveLHS(doubleColonExpression: KtDoubleColonExpression, context: ExpressionTypingContext, criterion: (KtDoubleColonExpression) -> Boolean, resolve: (KtExpression, ExpressionTypingContext) -> DoubleColonLHS.Expression?): DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : DoubleColonLHS> -> Expression

'doubleColonExpression' @ [318:56] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[ValueParameterDescriptorImpl]

'c' @ [318:79] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[ValueParameterDescriptorImpl]

'this' @ [319:56] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[LazyClassReceiverParameterDescriptor]

'this' @ [320:56] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[LazyClassReceiverParameterDescriptor]

'resultForReservedCallChain' @ [321:13] ==> val resultForReservedCallChain: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[LocalVariableDescriptor]

'resultForReservedCallChain' @ [322:23] ==> val resultForReservedCallChain: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[LocalVariableDescriptor]

'lhs' @ [322:50] ==> public final val lhs: DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'lhs' @ [323:17] ==> val lhs: DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[LocalVariableDescriptor]

'c' @ [324:17] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[ValueParameterDescriptorImpl]

'trace' @ [324:19] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [324:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'RESERVED_SYNTAX_IN_CALLABLE_REFERENCE_LHS' @ [324:32] ==> public final val RESERVED_SYNTAX_IN_CALLABLE_REFERENCE_LHS: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [324:74] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'resultForReservedCallChain' @ [324:77] ==> val resultForReservedCallChain: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveReservedExpressionSyntaxOnDoubleColonLHS[LocalVariableDescriptor]

'expression' @ [324:104] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'Pair' @ [326:24] ==> public constructor Pair<out A, out B>(first: Boolean, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Boolean
    <out B> -> Nothing?

'Pair' @ [330:16] ==> public constructor Pair<out A, out B>(first: Boolean, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Boolean
    <out B> -> Nothing?

'doubleColonExpression' @ [334:26] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getOrResolveDoubleColonLHS[ValueParameterDescriptorImpl]

'receiverExpression' @ [334:48] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'expression' @ [335:13] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getOrResolveDoubleColonLHS[LocalVariableDescriptor]

'c' @ [336:13] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getOrResolveDoubleColonLHS[ValueParameterDescriptorImpl]

'trace' @ [336:15] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'DOUBLE_COLON_LHS' @ [336:36] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [336:54] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getOrResolveDoubleColonLHS[LocalVariableDescriptor]

'let' @ [336:67] ==> @InlineOnly public inline fun <T, R> DoubleColonLHS.let(block: (DoubleColonLHS) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DoubleColonLHS
    <R> -> Nothing

'it' @ [336:80] ==> value-parameter it: DoubleColonLHS defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getOrResolveDoubleColonLHS.<anonymous>[ValueParameterDescriptorImpl]

'resolveDoubleColonLHS' @ [338:16] ==> internal final fun resolveDoubleColonLHS(doubleColonExpression: KtDoubleColonExpression, c: ExpressionTypingContext): DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'doubleColonExpression' @ [338:38] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getOrResolveDoubleColonLHS[ValueParameterDescriptorImpl]

'c' @ [338:61] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getOrResolveDoubleColonLHS[ValueParameterDescriptorImpl]

'tryResolveLHS' @ [342:29] ==> private final fun <T : DoubleColonLHS> tryResolveLHS(doubleColonExpression: KtDoubleColonExpression, context: ExpressionTypingContext, criterion: (KtDoubleColonExpression) -> Boolean, resolve: (KtExpression, ExpressionTypingContext) -> DoubleColonLHS.Expression?): DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : DoubleColonLHS> -> Expression

'doubleColonExpression' @ [342:43] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[ValueParameterDescriptorImpl]

'c' @ [342:66] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[ValueParameterDescriptorImpl]

'this' @ [342:69] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[LazyClassReceiverParameterDescriptor]

'this' @ [342:108] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[LazyClassReceiverParameterDescriptor]

'resultForExpr' @ [343:13] ==> val resultForExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'resultForExpr' @ [344:23] ==> val resultForExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'lhs' @ [344:37] ==> public final val lhs: DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'lhs' @ [347:17] ==> val lhs: DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'!' @ [347:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lhs' @ [347:33] ==> val lhs: DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'isObjectQualifier' @ [347:37] ==> public final val isObjectQualifier: Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[PropertyDescriptorImpl]

'resultForExpr' @ [348:24] ==> val resultForExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'commit' @ [348:38] ==> public final fun commit(): DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[SimpleFunctionDescriptorImpl]

'component1' @ [352:14] ==> public final operator fun component1(): Boolean defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [352:42] ==> public final operator fun component2(): DoubleColonLHS? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'resolveReservedExpressionSyntaxOnDoubleColonLHS' @ [352:60] ==> private final fun resolveReservedExpressionSyntaxOnDoubleColonLHS(doubleColonExpression: KtDoubleColonExpression, c: ExpressionTypingContext): Pair<Boolean, DoubleColonLHS?> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'doubleColonExpression' @ [352:108] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[ValueParameterDescriptorImpl]

'c' @ [352:131] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[ValueParameterDescriptorImpl]

'isReservedExpressionSyntax' @ [353:13] ==> val isReservedExpressionSyntax: Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'doubleColonLHS' @ [353:48] ==> val doubleColonLHS: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'tryResolveLHS' @ [355:29] ==> private final fun <T : DoubleColonLHS> tryResolveLHS(doubleColonExpression: KtDoubleColonExpression, context: ExpressionTypingContext, criterion: (KtDoubleColonExpression) -> Boolean, resolve: (KtExpression, ExpressionTypingContext) -> DoubleColonLHS.Type?): DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Type>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : DoubleColonLHS> -> Type

'doubleColonExpression' @ [355:43] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[ValueParameterDescriptorImpl]

'c' @ [355:66] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[ValueParameterDescriptorImpl]

'this' @ [355:69] ==> <this> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[LazyClassReceiverParameterDescriptor]

'resolveTypeOnLHS' @ [356:13] ==> private final fun resolveTypeOnLHS(expression: KtExpression, doubleColonExpression: KtDoubleColonExpression, c: ExpressionTypingContext): DoubleColonLHS.Type? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [356:30] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS.<anonymous>[ValueParameterDescriptorImpl]

'doubleColonExpression' @ [356:42] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[ValueParameterDescriptorImpl]

'context' @ [356:65] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS.<anonymous>[ValueParameterDescriptorImpl]

'resultForType' @ [358:13] ==> val resultForType: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Type>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'resultForType' @ [359:23] ==> val resultForType: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Type>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'lhs' @ [359:37] ==> public final val lhs: DoubleColonLHS.Type? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'resultForExpr' @ [360:17] ==> val resultForExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'lhs' @ [360:42] ==> val lhs: DoubleColonLHS.Type? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'lhs' @ [360:57] ==> val lhs: DoubleColonLHS.Type? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'type' @ [360:61] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Type[PropertyDescriptorImpl]

'resultForExpr' @ [360:69] ==> val resultForExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'lhs' @ [360:83] ==> public final val lhs: DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'type' @ [360:88] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[PropertyDescriptorImpl]

'resultForExpr' @ [364:24] ==> val resultForExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'commit' @ [364:38] ==> public final fun commit(): DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[SimpleFunctionDescriptorImpl]

'lhs' @ [366:17] ==> val lhs: DoubleColonLHS.Type? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'resultForType' @ [367:24] ==> val resultForType: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Type>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'commit' @ [367:38] ==> public final fun commit(): DoubleColonLHS.Type? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[SimpleFunctionDescriptorImpl]

'resultForExpr' @ [373:13] ==> val resultForExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'resultForExpr' @ [373:43] ==> val resultForExpr: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Expression>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'commit' @ [373:57] ==> public final fun commit(): DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[SimpleFunctionDescriptorImpl]

'resultForType' @ [374:13] ==> val resultForType: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Type>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'resultForType' @ [374:43] ==> val resultForType: DoubleColonExpressionResolver.LHSResolutionResult<DoubleColonLHS.Type>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveDoubleColonLHS[LocalVariableDescriptor]

'commit' @ [374:57] ==> public final fun commit(): DoubleColonLHS.Type? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[SimpleFunctionDescriptorImpl]

'lhs' @ [385:17] ==> public final val lhs: T? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'traceAndCache' @ [386:17] ==> public final val traceAndCache: TemporaryTraceAndCache defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'trace' @ [386:31] ==> public final val trace: (TemporaryBindingTrace..TemporaryBindingTrace?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaPropertyDescriptor]

'record' @ [386:37] ==> public open fun <K, V> record(slice: WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>, key: (KtExpression..KtExpression?), value: (DoubleColonLHS..DoubleColonLHS?)): Unit defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V> -> (org.jetbrains.kotlin.types.expressions.DoubleColonLHS..org.jetbrains.kotlin.types.expressions.DoubleColonLHS?)

'DOUBLE_COLON_LHS' @ [386:59] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [386:77] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'lhs' @ [386:89] ==> public final val lhs: T? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'traceAndCache' @ [388:13] ==> public final val traceAndCache: TemporaryTraceAndCache defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'commit' @ [388:27] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'lhs' @ [389:20] ==> public final val lhs: T? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[PropertyDescriptorImpl]

'doubleColonExpression' @ [403:26] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveLHS[ValueParameterDescriptorImpl]

'receiverExpression' @ [403:48] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'!' @ [405:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [405:14] ==> public abstract operator fun invoke(p1: KtDoubleColonExpression): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'doubleColonExpression' @ [405:24] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveLHS[ValueParameterDescriptorImpl]

'create' @ [407:52] ==> public open fun create(context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?), debugName: (String..String?), expression: (KtExpression..KtExpression?)): (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'context' @ [407:59] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveLHS[ValueParameterDescriptorImpl]

'doubleColonExpression' @ [407:88] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveLHS[ValueParameterDescriptorImpl]

'context' @ [408:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveLHS[ValueParameterDescriptorImpl]

'replaceTraceAndCache' @ [409:18] ==> @NotNull public open fun replaceTraceAndCache(@NotNull traceAndCache: TemporaryTraceAndCache): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'traceAndCache' @ [409:39] ==> val traceAndCache: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveLHS[LocalVariableDescriptor]

'replaceExpectedType' @ [410:18] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'NO_EXPECTED_TYPE' @ [410:38] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'replaceContextDependency' @ [411:18] ==> @NotNull public open fun replaceContextDependency(@NotNull newContextDependency: ContextDependency): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'INDEPENDENT' @ [411:61] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'invoke' @ [413:19] ==> public abstract operator fun invoke(p1: KtExpression, p2: ExpressionTypingContext): T? defined in kotlin.Function2[FunctionInvokeDescriptor]

'expression' @ [413:27] ==> val expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveLHS[LocalVariableDescriptor]

'c' @ [413:39] ==> val c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveLHS[LocalVariableDescriptor]

'LHSResolutionResult' @ [414:16] ==> public constructor LHSResolutionResult<out T : DoubleColonLHS>(lhs: T?, expression: KtExpression, traceAndCache: TemporaryTraceAndCache) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.LHSResolutionResult[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : DoubleColonLHS> -> T

'lhs' @ [414:36] ==> val lhs: T? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveLHS[LocalVariableDescriptor]

'expression' @ [414:41] ==> val expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveLHS[LocalVariableDescriptor]

'traceAndCache' @ [414:53] ==> val traceAndCache: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveLHS[LocalVariableDescriptor]

'expressionTypingServices' @ [418:24] ==> private final lateinit var expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'getTypeInfo' @ [418:49] ==> @NotNull public open fun getTypeInfo(@NotNull expression: KtExpression, @NotNull resolutionContext: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingServices[JavaMethodDescriptor]

'expression' @ [418:61] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[ValueParameterDescriptorImpl]

'c' @ [418:73] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[ValueParameterDescriptorImpl]

'typeInfo' @ [421:13] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'type' @ [421:22] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'c' @ [425:20] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[ValueParameterDescriptorImpl]

'trace' @ [425:22] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'bindingContext' @ [425:28] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'CALL' @ [425:58] ==> public final val CALL: (WritableSlice<(KtElement..KtElement?), (Call..Call?)>..WritableSlice<(KtElement..KtElement?), (Call..Call?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [425:64] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[ValueParameterDescriptorImpl]

'getQualifiedElementSelector' @ [425:75] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'call' @ [426:28] ==> val call: Call? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'getResolvedCall' @ [426:33] ==> public fun Call?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[SimpleFunctionDescriptorImpl]

'c' @ [426:49] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[ValueParameterDescriptorImpl]

'trace' @ [426:51] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'bindingContext' @ [426:57] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'resolvedCall' @ [428:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'resolvedCall' @ [429:39] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'resultingDescriptor' @ [429:52] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resultingDescriptor' @ [430:17] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'resultingDescriptor' @ [431:39] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'classDescriptor' @ [431:59] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForObject[DeserializedPropertyDescriptor]

'classDescriptor' @ [432:21] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'companionObjectDescriptor' @ [432:37] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'isObject' @ [434:37] ==> public open fun isObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [434:46] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'!' @ [435:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [435:23] ==> public final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'supportsFeature' @ [435:47] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [435:63] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'BoundCallableReferences' @ [435:79] ==> enum entry BoundCallableReferences defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'isEnumEntry' @ [436:38] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [436:50] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'Expression' @ [437:43] ==> public constructor Expression(typeInfo: KotlinTypeInfo, isObjectQualifier: Boolean) defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[ClassConstructorDescriptorImpl]

'typeInfo' @ [437:54] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'expression' @ [442:17] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[ValueParameterDescriptorImpl]

'canBeConsideredProperType' @ [442:28] ==> private final fun KtExpression.canBeConsideredProperType(): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'resultingDescriptor' @ [442:59] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'Expression' @ [445:31] ==> public constructor Expression(typeInfo: KotlinTypeInfo, isObjectQualifier: Boolean) defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[ClassConstructorDescriptorImpl]

'typeInfo' @ [445:42] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveExpressionOnLHS[LocalVariableDescriptor]

'qualifiedExpressionResolver' @ [452:17] ==> public final val qualifiedExpressionResolver: QualifiedExpressionResolver defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'resolveDescriptorForDoubleColonLHS' @ [452:45] ==> public final fun resolveDescriptorForDoubleColonLHS(expression: KtExpression, scope: LexicalScope, trace: BindingTrace, isDebuggerContext: Boolean): QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [452:80] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'c' @ [452:92] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'scope' @ [452:94] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'c' @ [452:101] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'trace' @ [452:103] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'c' @ [452:110] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [452:112] ==> public final val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'TypeResolutionContext' @ [454:37] ==> public constructor TypeResolutionContext(@NotNull scope: LexicalScope, @NotNull trace: BindingTrace, checkBounds: Boolean, allowBareTypes: Boolean, isDebuggerContext: Boolean) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaClassConstructorDescriptor]

'c' @ [455:17] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'scope' @ [455:19] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'c' @ [455:26] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'trace' @ [455:28] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'expression' @ [456:43] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'suppressDiagnosticsInDebugMode' @ [456:54] ==> public fun KtElement.suppressDiagnosticsInDebugMode(): Boolean defined in org.jetbrains.kotlin.psi.codeFragmentUtil in file codeFragmentUtil.kt[SimpleFunctionDescriptorImpl]

'qualifierResolutionResult' @ [459:26] ==> val qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'classifierDescriptor' @ [459:52] ==> public final val classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'classifier' @ [460:13] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'typeResolver' @ [461:13] ==> public final val typeResolver: TypeResolver defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'resolveTypeProjections' @ [461:26] ==> public final fun resolveTypeProjections(c: TypeResolutionContext, constructor: TypeConstructor, argumentElements: List<KtTypeProjection>): List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'typeResolutionContext' @ [462:21] ==> val typeResolutionContext: TypeResolutionContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'createErrorType' @ [462:55] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'constructor' @ [462:82] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'qualifierResolutionResult' @ [462:95] ==> val qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'allProjections' @ [462:121] ==> public final val allProjections: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver.TypeQualifierResolutionResult[PropertyDescriptorImpl]

'typeResolver' @ [467:32] ==> public final val typeResolver: TypeResolver defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'resolveTypeForClassifier' @ [467:45] ==> public final fun resolveTypeForClassifier(c: TypeResolutionContext, descriptor: ClassifierDescriptor, qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult, element: KtElement, annotations: Annotations): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'typeResolutionContext' @ [468:17] ==> val typeResolutionContext: TypeResolutionContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'classifier' @ [468:40] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'qualifierResolutionResult' @ [468:52] ==> val qualifierResolutionResult: QualifiedExpressionResolver.TypeQualifierResolutionResult defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'expression' @ [468:79] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'Annotations' @ [468:91] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [468:103] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'if (possiblyBareType.isBare) {
            val descriptor = possiblyBareType.bareTypeConstructor.declarationDescriptor as? ClassDescriptor
                             ?: error("Only classes can produce bare types: $possiblyBareType")

            if (doubleColonExpression is KtCallableReferenceExpression) {
                c.trace.report(WRONG_NUMBER_OF_TYPE_ARGUMENTS.on(expression, descriptor.typeConstructor.parameters.size, descriptor))
            }

            val arguments = descriptor.typeConstructor.parameters.map(TypeUtils::makeStarProjection)
            KotlinTypeFactory.simpleType(
                    Annotations.EMPTY, descriptor.typeConstructor, arguments,
                    possiblyBareType.isNullable || doubleColonExpression.hasQuestionMarks
            )
        }
        else {
            val actualType = possiblyBareType.actualType
            if (doubleColonExpression.hasQuestionMarks) actualType.makeNullable() else actualType
        }' @ [471:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'possiblyBareType' @ [471:24] ==> val possiblyBareType: PossiblyBareType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'isBare' @ [471:41] ==> public final val PossiblyBareType.isBare: Boolean[MyPropertyDescriptor]

'possiblyBareType' @ [472:30] ==> val possiblyBareType: PossiblyBareType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'bareTypeConstructor' @ [472:47] ==> public final val PossiblyBareType.bareTypeConstructor: TypeConstructor[MyPropertyDescriptor]

'declarationDescriptor' @ [472:67] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'error' @ [473:33] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'possiblyBareType' @ [473:78] ==> val possiblyBareType: PossiblyBareType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'doubleColonExpression' @ [475:17] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'c' @ [476:17] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'trace' @ [476:19] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [476:25] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'WRONG_NUMBER_OF_TYPE_ARGUMENTS' @ [476:32] ==> public final val WRONG_NUMBER_OF_TYPE_ARGUMENTS: (DiagnosticFactory2<(KtElement..KtElement?), (Int..Int?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(KtElement..KtElement?), (Int..Int?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [476:63] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: Int, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'expression' @ [476:66] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'descriptor' @ [476:78] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'typeConstructor' @ [476:89] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [476:105] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [476:116] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'descriptor' @ [476:122] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'descriptor' @ [479:29] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'typeConstructor' @ [479:40] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [479:56] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [479:67] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> TypeProjection

'TypeUtils' @ [479:71] ==> public constructor TypeUtils() defined in org.jetbrains.kotlin.types.TypeUtils[JavaClassConstructorDescriptor]

'KotlinTypeFactory' @ [480:13] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [480:31] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'Annotations' @ [481:21] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [481:33] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'descriptor' @ [481:40] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'typeConstructor' @ [481:51] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'arguments' @ [481:68] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'possiblyBareType' @ [482:21] ==> val possiblyBareType: PossiblyBareType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'isNullable' @ [482:38] ==> public final val PossiblyBareType.isNullable: Boolean[MyPropertyDescriptor]

'doubleColonExpression' @ [482:52] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'hasQuestionMarks' @ [482:74] ==> public final val hasQuestionMarks: Boolean defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'possiblyBareType' @ [486:30] ==> val possiblyBareType: PossiblyBareType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'actualType' @ [486:47] ==> public final val PossiblyBareType.actualType: KotlinType[MyPropertyDescriptor]

'if (doubleColonExpression.hasQuestionMarks) actualType.makeNullable() else actualType' @ [487:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'doubleColonExpression' @ [487:17] ==> value-parameter doubleColonExpression: KtDoubleColonExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[ValueParameterDescriptorImpl]

'hasQuestionMarks' @ [487:39] ==> public final val hasQuestionMarks: Boolean defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'actualType' @ [487:57] ==> val actualType: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'makeNullable' @ [487:68] ==> public fun KotlinType.makeNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'actualType' @ [487:88] ==> val actualType: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'Type' @ [490:31] ==> public constructor Type(type: KotlinType, possiblyBareType: PossiblyBareType) defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Type[ClassConstructorDescriptorImpl]

'type' @ [490:36] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'possiblyBareType' @ [490:42] ==> val possiblyBareType: PossiblyBareType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveTypeOnLHS[LocalVariableDescriptor]

'type' @ [494:31] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isAllowedInClassLiteral[ValueParameterDescriptorImpl]

'constructor' @ [494:36] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'typeConstructor' @ [495:26] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isAllowedInClassLiteral[LocalVariableDescriptor]

'declarationDescriptor' @ [495:42] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'when (descriptor) {
            is ClassDescriptor -> {
                if (KotlinBuiltIns.isNonPrimitiveArray(descriptor)) {
                    return type.arguments.none { typeArgument ->
                        typeArgument.isStarProjection || !isAllowedInClassLiteral(typeArgument.type)
                    }
                }

                return type.arguments.isEmpty()
            }
            is TypeParameterDescriptor -> return descriptor.isReified
            else -> return false
        }' @ [497:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'descriptor' @ [497:15] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isAllowedInClassLiteral[LocalVariableDescriptor]

'isNonPrimitiveArray' @ [499:36] ==> public open fun isNonPrimitiveArray(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'descriptor' @ [499:56] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isAllowedInClassLiteral[LocalVariableDescriptor]

'type' @ [500:28] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isAllowedInClassLiteral[ValueParameterDescriptorImpl]

'arguments' @ [500:33] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'none' @ [500:43] ==> public inline fun <T> Iterable<TypeProjection>.none(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'typeArgument' @ [501:25] ==> value-parameter typeArgument: TypeProjection defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isAllowedInClassLiteral.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [501:38] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'!' @ [501:58] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAllowedInClassLiteral' @ [501:59] ==> private final fun isAllowedInClassLiteral(type: KotlinType): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'typeArgument' @ [501:83] ==> value-parameter typeArgument: TypeProjection defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isAllowedInClassLiteral.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [501:96] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'type' @ [505:24] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isAllowedInClassLiteral[ValueParameterDescriptorImpl]

'arguments' @ [505:29] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isEmpty' @ [505:39] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [507:50] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isAllowedInClassLiteral[LocalVariableDescriptor]

'isReified' @ [507:61] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

'expression' @ [513:33] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'callableReference' @ [513:44] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'callableReference' @ [514:13] ==> val callableReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[LocalVariableDescriptor]

'getReferencedName' @ [514:31] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'isEmpty' @ [514:51] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [515:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [515:18] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'isEmptyLHS' @ [515:29] ==> public final val isEmptyLHS: Boolean defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[PropertyDescriptorImpl]

'resolveDoubleColonLHS' @ [515:41] ==> internal final fun resolveDoubleColonLHS(doubleColonExpression: KtDoubleColonExpression, c: ExpressionTypingContext): DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [515:63] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'c' @ [515:75] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'c' @ [516:13] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'trace' @ [516:15] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [516:21] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNRESOLVED_REFERENCE' @ [516:28] ==> public final val UNRESOLVED_REFERENCE: (DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [516:49] ==> @NotNull public open fun on(@NotNull element: KtReferenceExpression, @NotNull argument: KtReferenceExpression): ParametrizedDiagnostic<(KtReferenceExpression..KtReferenceExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'callableReference' @ [516:52] ==> val callableReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[LocalVariableDescriptor]

'callableReference' @ [516:71] ==> val callableReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[LocalVariableDescriptor]

'createErrorType' @ [517:40] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'dataFlowAnalyzer' @ [518:20] ==> public final val dataFlowAnalyzer: DataFlowAnalyzer defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'createCheckedTypeInfo' @ [518:37] ==> @NotNull public open fun createCheckedTypeInfo(@Nullable type: KotlinType?, @NotNull context: ResolutionContext<*>, @NotNull expression: KtExpression): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'errorType' @ [518:59] ==> val errorType: SimpleType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[LocalVariableDescriptor]

'c' @ [518:70] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'expression' @ [518:73] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'component1' @ [521:14] ==> public final operator fun component1(): DoubleColonLHS? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [521:19] ==> public final operator fun component2(): OverloadResolutionResults<*>? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'resolveCallableReference' @ [521:40] ==> public final fun resolveCallableReference(expression: KtCallableReferenceExpression, context: ExpressionTypingContext, resolveArgumentsMode: ResolveArgumentsMode): Pair<DoubleColonLHS?, OverloadResolutionResults<*>?> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [521:65] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'c' @ [521:77] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'RESOLVE_FUNCTION_ARGUMENTS' @ [521:101] ==> enum entry RESOLVE_FUNCTION_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil.ResolveArgumentsMode[FakeCallableDescriptorForObject]

'getCallableReferenceType' @ [522:22] ==> private final fun getCallableReferenceType(expression: KtCallableReferenceExpression, lhs: DoubleColonLHS?, resolutionResults: OverloadResolutionResults<*>?, context: ExpressionTypingContext): KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [522:47] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'lhs' @ [522:59] ==> val lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[LocalVariableDescriptor]

'resolutionResults' @ [522:64] ==> val resolutionResults: OverloadResolutionResults<*>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[LocalVariableDescriptor]

'c' @ [522:83] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'?:' @ [523:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DataFlowInfo?, right: DataFlowInfo): DataFlowInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DataFlowInfo

'lhs' @ [523:29] ==> val lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[LocalVariableDescriptor]

'dataFlowInfo' @ [523:65] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[PropertyDescriptorImpl]

'c' @ [523:81] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [523:83] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'dataFlowAnalyzer' @ [524:16] ==> public final val dataFlowAnalyzer: DataFlowAnalyzer defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'checkType' @ [524:33] ==> @NotNull public open fun checkType(@NotNull typeInfo: KotlinTypeInfo, @NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'createTypeInfo' @ [524:43] ==> public fun createTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'result' @ [524:58] ==> val result: KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[LocalVariableDescriptor]

'dataFlowInfo' @ [524:66] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[LocalVariableDescriptor]

'expression' @ [524:81] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'c' @ [524:93] ==> value-parameter c: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'if (resolutionResults != null && !resolutionResults.isNothing) {
                    val resolvedCall = OverloadResolutionResultsUtil.getResultingCall(resolutionResults, context.contextDependency)
                    resolvedCall?.resultingDescriptor ?: return null
                }
                else {
                    if (lhs != null || expression.isEmptyLHS) {
                        context.trace.report(UNRESOLVED_REFERENCE.on(expression.callableReference, expression.callableReference))
                    }
                    return null
                }' @ [534:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (CallableDescriptor..CallableDescriptor?), elseBranch: (CallableDescriptor..CallableDescriptor?)): (CallableDescriptor..CallableDescriptor?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolutionResults' @ [534:21] ==> value-parameter resolutionResults: OverloadResolutionResults<*>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'!' @ [534:50] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolutionResults' @ [534:51] ==> value-parameter resolutionResults: OverloadResolutionResults<*>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'isNothing' @ [534:69] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<out (CallableDescriptor..CallableDescriptor?)>.isNothing: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'getResultingCall' @ [535:70] ==> @Nullable public open fun <D : (CallableDescriptor..CallableDescriptor?)> getResultingCall(@NotNull results: OverloadResolutionResults<out (CallableDescriptor..CallableDescriptor?)>, @NotNull contextDependency: ContextDependency): ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResultsUtil[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolutionResults' @ [535:87] ==> value-parameter resolutionResults: OverloadResolutionResults<*>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'context' @ [535:106] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'contextDependency' @ [535:114] ==> @NotNull public final val contextDependency: ContextDependency defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'resolvedCall' @ [536:21] ==> val resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[LocalVariableDescriptor]

'resultingDescriptor' @ [536:35] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'lhs' @ [539:25] ==> value-parameter lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'expression' @ [539:40] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'isEmptyLHS' @ [539:51] ==> public final val isEmptyLHS: Boolean defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[PropertyDescriptorImpl]

'context' @ [540:25] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'trace' @ [540:33] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [540:39] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNRESOLVED_REFERENCE' @ [540:46] ==> public final val UNRESOLVED_REFERENCE: (DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [540:67] ==> @NotNull public open fun on(@NotNull element: KtReferenceExpression, @NotNull argument: KtReferenceExpression): ParametrizedDiagnostic<(KtReferenceExpression..KtReferenceExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [540:70] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'callableReference' @ [540:81] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'expression' @ [540:100] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'callableReference' @ [540:111] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'checkReferenceIsToAllowedMember' @ [545:9] ==> internal final fun checkReferenceIsToAllowedMember(descriptor: CallableDescriptor, trace: BindingTrace, expression: KtCallableReferenceExpression): Unit defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'descriptor' @ [545:41] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[LocalVariableDescriptor]

'context' @ [545:53] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'trace' @ [545:61] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'expression' @ [545:68] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'createKCallableTypeForReference' @ [547:20] ==> public final fun createKCallableTypeForReference(descriptor: CallableDescriptor, lhs: DoubleColonLHS?, reflectionTypes: ReflectionTypes, scopeOwnerDescriptor: DeclarationDescriptor): KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [547:52] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[LocalVariableDescriptor]

'lhs' @ [547:64] ==> value-parameter lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'reflectionTypes' @ [547:69] ==> public final val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'context' @ [547:86] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'scope' @ [547:94] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [547:100] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'when (descriptor) {
            is FunctionDescriptor -> bindFunctionReference(expression, type, context)
            is PropertyDescriptor -> bindPropertyReference(expression, type, context)
        }' @ [549:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [549:15] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[LocalVariableDescriptor]

'bindFunctionReference' @ [550:38] ==> internal final fun bindFunctionReference(expression: KtCallableReferenceExpression, type: KotlinType, context: ResolutionContext<*>): Unit defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [550:60] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'type' @ [550:72] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[LocalVariableDescriptor]

'context' @ [550:78] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'bindPropertyReference' @ [551:38] ==> internal final fun bindPropertyReference(expression: KtCallableReferenceExpression, referenceType: KotlinType, context: ResolutionContext<*>): Unit defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [551:60] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'type' @ [551:72] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[LocalVariableDescriptor]

'context' @ [551:78] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[ValueParameterDescriptorImpl]

'type' @ [554:16] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.getCallableReferenceType[LocalVariableDescriptor]

'expression' @ [560:26] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'callableReference' @ [560:37] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'expression' @ [561:13] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'isEmptyLHS' @ [561:24] ==> public final val isEmptyLHS: Boolean defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[PropertyDescriptorImpl]

'descriptor' @ [562:14] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [562:25] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [562:62] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [562:73] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'trace' @ [563:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'report' @ [563:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CALLABLE_REFERENCE_TO_MEMBER_OR_EXTENSION_WITH_EMPTY_LHS' @ [563:26] ==> public final val CALLABLE_REFERENCE_TO_MEMBER_OR_EXTENSION_WITH_EMPTY_LHS: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [563:83] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'simpleName' @ [563:86] ==> val simpleName: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[LocalVariableDescriptor]

'descriptor' @ [565:13] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'isAnnotationClass' @ [565:68] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [565:86] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'containingDeclaration' @ [565:97] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'trace' @ [566:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'report' @ [566:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CALLABLE_REFERENCE_TO_ANNOTATION_CONSTRUCTOR' @ [566:26] ==> public final val CALLABLE_REFERENCE_TO_ANNOTATION_CONSTRUCTOR: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [566:71] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'simpleName' @ [566:74] ==> val simpleName: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[LocalVariableDescriptor]

'descriptor' @ [568:13] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'isMemberExtension' @ [568:55] ==> private final fun isMemberExtension(descriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'descriptor' @ [568:73] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'trace' @ [569:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'report' @ [569:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'EXTENSION_IN_CLASS_REFERENCE_NOT_ALLOWED' @ [569:26] ==> public final val EXTENSION_IN_CLASS_REFERENCE_NOT_ALLOWED: (DiagnosticFactory1<(KtExpression..KtExpression?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [569:67] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: CallableMemberDescriptor): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'simpleName' @ [569:70] ==> val simpleName: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[LocalVariableDescriptor]

'descriptor' @ [569:82] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'descriptor' @ [571:13] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'descriptor' @ [571:49] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'trace' @ [572:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[ValueParameterDescriptorImpl]

'report' @ [572:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [572:26] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [572:38] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'simpleName' @ [572:41] ==> val simpleName: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.checkReferenceIsToAllowedMember[LocalVariableDescriptor]

'?:' @ [577:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: CallableMemberDescriptor?, right: CallableMemberDescriptor): CallableMemberDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> CallableMemberDescriptor

'descriptor' @ [577:25] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isMemberExtension[ValueParameterDescriptorImpl]

'callableFromObject' @ [577:82] ==> public final val callableFromObject: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.ImportedFromObjectCallableDescriptor[PropertyDescriptorImpl]

'descriptor' @ [577:104] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isMemberExtension[ValueParameterDescriptorImpl]

'original' @ [578:16] ==> val original: CallableMemberDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isMemberExtension[LocalVariableDescriptor]

'extensionReceiverParameter' @ [578:25] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'original' @ [578:63] ==> val original: CallableMemberDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.isMemberExtension[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [578:72] ==> public final val CallableMemberDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'AnonymousFunctionDescriptor' @ [582:34] ==> public constructor AnonymousFunctionDescriptor(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull annotations: Annotations, @NotNull kind: CallableMemberDescriptor.Kind, @NotNull source: SourceElement, isSuspend: Boolean) defined in org.jetbrains.kotlin.descriptors.impl.AnonymousFunctionDescriptor[JavaClassConstructorDescriptor]

'context' @ [583:17] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindFunctionReference[ValueParameterDescriptorImpl]

'scope' @ [583:25] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [583:31] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'Annotations' @ [584:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [584:29] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'DECLARATION' @ [585:47] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'expression' @ [586:17] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindFunctionReference[ValueParameterDescriptorImpl]

'toSourceElement' @ [586:28] ==> public fun KtPureElement?.toSourceElement(): SourceElement defined in org.jetbrains.kotlin.resolve.source in file KotlinSourceElement.kt[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [590:9] ==> val functionDescriptor: AnonymousFunctionDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindFunctionReference[LocalVariableDescriptor]

'initialize' @ [590:28] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.AnonymousFunctionDescriptor[JavaMethodDescriptor]

'emptyList' @ [591:29] ==> public fun <T> emptyList(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'createValueParametersForInvokeInFunctionType' @ [592:17] ==> public fun createValueParametersForInvokeInFunctionType(functionDescriptor: FunctionDescriptor, parameterTypes: List<TypeProjection>): List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.util[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [592:62] ==> val functionDescriptor: AnonymousFunctionDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindFunctionReference[LocalVariableDescriptor]

'type' @ [592:82] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindFunctionReference[ValueParameterDescriptorImpl]

'arguments' @ [592:87] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'dropLast' @ [592:97] ==> public fun <T> List<TypeProjection>.dropLast(n: Int): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [593:17] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindFunctionReference[ValueParameterDescriptorImpl]

'arguments' @ [593:22] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'last' @ [593:32] ==> public fun <T> List<TypeProjection>.last(): TypeProjection defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [593:39] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'Modality' @ [594:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [594:26] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PUBLIC' @ [595:30] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'context' @ [598:9] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindFunctionReference[ValueParameterDescriptorImpl]

'trace' @ [598:17] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'record' @ [598:23] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?), key: (PsiElement..PsiElement?), value: (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> SimpleFunctionDescriptor

'FUNCTION' @ [598:45] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [598:55] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindFunctionReference[ValueParameterDescriptorImpl]

'functionDescriptor' @ [598:67] ==> val functionDescriptor: AnonymousFunctionDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindFunctionReference[LocalVariableDescriptor]

'LocalVariableDescriptor' @ [602:29] ==> public constructor LocalVariableDescriptor(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull annotations: Annotations, @NotNull name: Name, @Nullable type: KotlinType?, mutable: Boolean, isDelegated: Boolean, @NotNull source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaClassConstructorDescriptor]

'context' @ [603:17] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindPropertyReference[ValueParameterDescriptorImpl]

'scope' @ [603:25] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [603:31] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'Annotations' @ [603:48] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [603:60] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'special' @ [603:72] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'referenceType' @ [603:96] ==> value-parameter referenceType: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [604:44] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindPropertyReference[ValueParameterDescriptorImpl]

'toSourceElement' @ [604:55] ==> public fun KtPureElement?.toSourceElement(): SourceElement defined in org.jetbrains.kotlin.resolve.source in file KotlinSourceElement.kt[SimpleFunctionDescriptorImpl]

'context' @ [607:9] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindPropertyReference[ValueParameterDescriptorImpl]

'trace' @ [607:17] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'record' @ [607:23] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?), key: (PsiElement..PsiElement?), value: (VariableDescriptor..VariableDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> VariableDescriptor

'VARIABLE' @ [607:45] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [607:55] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindPropertyReference[ValueParameterDescriptorImpl]

'localVariable' @ [607:67] ==> val localVariable: LocalVariableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.bindPropertyReference[LocalVariableDescriptor]

'if (expression.isEmptyLHS) null
                else resolveDoubleColonLHS(expression, context)' @ [616:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DoubleColonLHS?, elseBranch: DoubleColonLHS?): DoubleColonLHS?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DoubleColonLHS?

'expression' @ [616:21] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[ValueParameterDescriptorImpl]

'isEmptyLHS' @ [616:32] ==> public final val isEmptyLHS: Boolean defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[PropertyDescriptorImpl]

'resolveDoubleColonLHS' @ [617:22] ==> internal final fun resolveDoubleColonLHS(doubleColonExpression: KtDoubleColonExpression, c: ExpressionTypingContext): DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [617:44] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[ValueParameterDescriptorImpl]

'context' @ [617:56] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[ValueParameterDescriptorImpl]

'resolveCallableReferenceRHS' @ [619:33] ==> private final fun resolveCallableReferenceRHS(expression: KtCallableReferenceExpression, lhs: DoubleColonLHS?, c: ResolutionContext<*>, mode: ResolveArgumentsMode): OverloadResolutionResults<CallableDescriptor>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [619:61] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[ValueParameterDescriptorImpl]

'lhsResult' @ [619:73] ==> val lhsResult: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[LocalVariableDescriptor]

'context' @ [619:84] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[ValueParameterDescriptorImpl]

'resolveArgumentsMode' @ [619:93] ==> value-parameter resolveArgumentsMode: ResolveArgumentsMode defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[ValueParameterDescriptorImpl]

'reportUnsupportedCallableReferenceIfNeeded' @ [621:9] ==> private final fun reportUnsupportedCallableReferenceIfNeeded(expression: KtCallableReferenceExpression, context: ExpressionTypingContext, lhsResult: DoubleColonLHS?, resolutionResults: OverloadResolutionResults<CallableDescriptor>?): Unit defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [621:52] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[ValueParameterDescriptorImpl]

'context' @ [621:64] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[ValueParameterDescriptorImpl]

'lhsResult' @ [621:73] ==> val lhsResult: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[LocalVariableDescriptor]

'resolutionResults' @ [621:84] ==> val resolutionResults: OverloadResolutionResults<CallableDescriptor>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[LocalVariableDescriptor]

'lhsResult' @ [623:16] ==> val lhsResult: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[LocalVariableDescriptor]

'resolutionResults' @ [623:29] ==> val resolutionResults: OverloadResolutionResults<CallableDescriptor>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReference[LocalVariableDescriptor]

'if (resolutionResults?.isSingleResult == true) resolutionResults.resultingDescriptor as? FunctionDescriptor else null' @ [633:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionDescriptor?, elseBranch: FunctionDescriptor?): FunctionDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionDescriptor?

'resolutionResults' @ [633:21] ==> value-parameter resolutionResults: OverloadResolutionResults<CallableDescriptor>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedCallableReferenceIfNeeded[ValueParameterDescriptorImpl]

'isSingleResult' @ [633:40] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<CallableDescriptor>.isSingleResult: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resolutionResults' @ [633:64] ==> value-parameter resolutionResults: OverloadResolutionResults<CallableDescriptor>? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedCallableReferenceIfNeeded[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [633:82] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'descriptor' @ [634:13] ==> val descriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedCallableReferenceIfNeeded[LocalVariableDescriptor]

'isSuspend' @ [634:25] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'context' @ [635:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedCallableReferenceIfNeeded[ValueParameterDescriptorImpl]

'trace' @ [635:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [635:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [635:34] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [635:46] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [635:49] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedCallableReferenceIfNeeded[ValueParameterDescriptorImpl]

'callableReference' @ [635:60] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'lhsResult' @ [638:32] ==> value-parameter lhsResult: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedCallableReferenceIfNeeded[ValueParameterDescriptorImpl]

'!' @ [640:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expressionResult' @ [640:14] ==> val expressionResult: DoubleColonLHS.Expression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedCallableReferenceIfNeeded[LocalVariableDescriptor]

'isObjectQualifier' @ [640:31] ==> public final val isObjectQualifier: Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[PropertyDescriptorImpl]

'descriptor' @ [640:52] ==> val descriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedCallableReferenceIfNeeded[LocalVariableDescriptor]

'reportUnsupportedIfNeeded' @ [641:13] ==> private final fun reportUnsupportedIfNeeded(expression: KtDoubleColonExpression, c: ExpressionTypingContext): Unit defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expression' @ [641:39] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedCallableReferenceIfNeeded[ValueParameterDescriptorImpl]

'context' @ [641:51] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.reportUnsupportedCallableReferenceIfNeeded[ValueParameterDescriptorImpl]

'outerContext' @ [659:20] ==> value-parameter outerContext: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'trace' @ [659:33] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'CALL' @ [659:54] ==> public final val CALL: (WritableSlice<(KtElement..KtElement?), (Call..Call?)>..WritableSlice<(KtElement..KtElement?), (Call..Call?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'reference' @ [659:60] ==> value-parameter reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'makeCall' @ [659:84] ==> @NotNull public open fun makeCall(callElement: (KtElement..KtElement?), @Nullable explicitReceiver: Receiver?, @Nullable callOperationNode: ASTNode?, calleeExpression: (KtExpression..KtExpression?), arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>?)): Call defined in org.jetbrains.kotlin.resolve.calls.util.CallMaker[JavaMethodDescriptor]

'reference' @ [659:93] ==> value-parameter reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'receiver' @ [659:104] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'reference' @ [659:120] ==> value-parameter reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'emptyList' @ [659:131] ==> public fun <T> emptyList(): List<(ValueArgument..ValueArgument?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'create' @ [660:53] ==> public open fun create(context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?), debugName: (String..String?), expression: (KtExpression..KtExpression?)): (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'outerContext' @ [660:60] ==> value-parameter outerContext: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'traceTitle' @ [660:74] ==> value-parameter traceTitle: String defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'reference' @ [660:86] ==> value-parameter reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'if (resolutionMode == ResolveArgumentsMode.SHAPE_FUNCTION_ARGUMENTS)
                    outerContext
                            .replaceTraceAndCache(temporaryTrace)
                            .replaceExpectedType(TypeUtils.NO_EXPECTED_TYPE)
                            .replaceContextDependency(ContextDependency.DEPENDENT)
                else
                    outerContext.replaceTraceAndCache(temporaryTrace)' @ [662:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolutionContext<out ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>?)>>, elseBranch: ResolutionContext<out ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>?)>>): ResolutionContext<out ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>?)>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolutionContext<out ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>?)>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>?)>?)>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>?)>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<out (org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>..org.jetbrains.kotlin.resolve.calls.context.ResolutionContext<*>?)>?)>?)>?)>?)>>

'resolutionMode' @ [662:21] ==> value-parameter resolutionMode: ResolveArgumentsMode defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'SHAPE_FUNCTION_ARGUMENTS' @ [662:60] ==> enum entry SHAPE_FUNCTION_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil.ResolveArgumentsMode[FakeCallableDescriptorForObject]

'outerContext' @ [663:21] ==> value-parameter outerContext: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'replaceTraceAndCache' @ [664:30] ==> @NotNull public open fun replaceTraceAndCache(@NotNull traceAndCache: TemporaryTraceAndCache): (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'temporaryTrace' @ [664:51] ==> val temporaryTrace: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[LocalVariableDescriptor]

'replaceExpectedType' @ [665:30] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'NO_EXPECTED_TYPE' @ [665:60] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'replaceContextDependency' @ [666:30] ==> @NotNull public open fun replaceContextDependency(@NotNull newContextDependency: ContextDependency): (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'DEPENDENT' @ [666:73] ==> enum entry DEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'outerContext' @ [668:21] ==> value-parameter outerContext: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'replaceTraceAndCache' @ [668:34] ==> @NotNull public open fun replaceTraceAndCache(@NotNull traceAndCache: TemporaryTraceAndCache): (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'temporaryTrace' @ [668:55] ==> val temporaryTrace: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[LocalVariableDescriptor]

'callResolver' @ [670:33] ==> public final val callResolver: CallResolver defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[PropertyDescriptorImpl]

'resolveCallForMember' @ [670:46] ==> @NotNull public open fun resolveCallForMember(@NotNull nameExpression: KtSimpleNameExpression, @NotNull context: BasicCallResolutionContext): OverloadResolutionResults<(CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallResolver[JavaMethodDescriptor]

'reference' @ [671:17] ==> value-parameter reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'create' @ [671:55] ==> @NotNull public open fun create(@NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>), @NotNull call: Call, @NotNull checkArguments: CheckArgumentTypesMode): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'newContext' @ [671:62] ==> val newContext: ResolutionContext<out ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>?)>> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[LocalVariableDescriptor]

'call' @ [671:74] ==> val call: Call defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[LocalVariableDescriptor]

'CHECK_CALLABLE_TYPE' @ [671:103] ==> enum entry CHECK_CALLABLE_TYPE defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'when {
            resolutionResults.isNothing -> null
            else -> ResolutionResultsAndTraceCommitCallback(resolutionResults) {
                checkReservedYield(reference, outerContext.trace)
                if (resolutionMode != ResolveArgumentsMode.SHAPE_FUNCTION_ARGUMENTS || resolutionResults.isSuccess) {
                    temporaryTrace.commit()
                }
            }
        }' @ [674:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback?, entry1: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback?): DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ResolutionResultsAndTraceCommitCallback?

'resolutionResults' @ [675:13] ==> val resolutionResults: OverloadResolutionResults<(CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[LocalVariableDescriptor]

'isNothing' @ [675:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(CallableDescriptor..CallableDescriptor?)>.isNothing: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'ResolutionResultsAndTraceCommitCallback' @ [676:21] ==> public constructor ResolutionResultsAndTraceCommitCallback(results: OverloadResolutionResults<CallableDescriptor>, commitTrace: () -> Unit) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback[ClassConstructorDescriptorImpl]

'resolutionResults' @ [676:61] ==> val resolutionResults: OverloadResolutionResults<(CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[LocalVariableDescriptor]

'checkReservedYield' @ [677:17] ==> public fun checkReservedYield(expression: KtSimpleNameExpression?, sink: DiagnosticSink): Unit defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'reference' @ [677:36] ==> value-parameter reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'outerContext' @ [677:47] ==> value-parameter outerContext: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'trace' @ [677:60] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'resolutionMode' @ [678:21] ==> value-parameter resolutionMode: ResolveArgumentsMode defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[ValueParameterDescriptorImpl]

'SHAPE_FUNCTION_ARGUMENTS' @ [678:60] ==> enum entry SHAPE_FUNCTION_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil.ResolveArgumentsMode[FakeCallableDescriptorForObject]

'resolutionResults' @ [678:88] ==> val resolutionResults: OverloadResolutionResults<(CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[LocalVariableDescriptor]

'isSuccess' @ [678:106] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(CallableDescriptor..CallableDescriptor?)>.isSuccess: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'temporaryTrace' @ [679:21] ==> val temporaryTrace: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.tryResolveRHSWithReceiver[LocalVariableDescriptor]

'commit' @ [679:36] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'expression' @ [691:25] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'callableReference' @ [691:36] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'lhs' @ [693:23] ==> value-parameter lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'type' @ [693:28] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS[PropertyDescriptorImpl]

'lhsType' @ [694:13] ==> val lhsType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'!' @ [695:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [695:18] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'isEmptyLHS' @ [695:29] ==> public final val isEmptyLHS: Boolean defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[PropertyDescriptorImpl]

'tryResolveRHSWithReceiver' @ [697:20] ==> private final fun tryResolveRHSWithReceiver(traceTitle: String, receiver: Receiver?, reference: KtSimpleNameExpression, outerContext: ResolutionContext<*>, resolutionMode: ResolveArgumentsMode): DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'reference' @ [697:97] ==> val reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'c' @ [697:108] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'mode' @ [697:111] ==> value-parameter mode: ResolveArgumentsMode defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'apply' @ [698:26] ==> @InlineOnly public inline fun <T> DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback.apply(block: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback.() -> Unit): DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolutionResultsAndTraceCommitCallback

'invoke' @ [698:34] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'results' @ [698:51] ==> public final val results: OverloadResolutionResults<CallableDescriptor> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback[PropertyDescriptorImpl]

'buildSequence' @ [701:30] ==> @SinceKotlin public fun <T> buildSequence(builderAction: suspend SequenceBuilder<DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback>.() -> Unit): Sequence<DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback> defined in kotlin.coroutines.experimental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolutionResultsAndTraceCommitCallback

'when (lhs) {
                is DoubleColonLHS.Type -> {
                    val classifier = lhsType.constructor.declarationDescriptor
                    if (classifier !is ClassDescriptor) {
                        c.trace.report(CALLABLE_REFERENCE_LHS_NOT_A_CLASS.on(expression))
                        return@buildSequence
                    }

                    val qualifier = c.trace.get(BindingContext.QUALIFIER, expression.receiverExpression!!)
                    if (qualifier is ClassQualifier) {
                        yieldIfNotNull(
                                tryResolveRHSWithReceiver(
                                        "resolve unbound callable reference in static scope", qualifier, reference, c, mode
                                )
                        )
                    }

                    yieldIfNotNull(
                            tryResolveRHSWithReceiver(
                                    "resolve unbound callable reference with receiver", TransientReceiver(lhsType), reference, c, mode
                            )
                    )
                }
                is DoubleColonLHS.Expression -> {
                    val expressionReceiver = ExpressionReceiver.create(expression.receiverExpression!!, lhsType, c.trace.bindingContext)
                    yieldIfNotNull(
                            tryResolveRHSWithReceiver(
                                    "resolve bound callable reference", expressionReceiver, reference, c, mode
                            )
                    )

                    if (lhs.isObjectQualifier) {
                        val classifier = lhsType.constructor.declarationDescriptor
                        val calleeExpression = expression.receiverExpression?.getCalleeExpressionIfAny()
                        if (calleeExpression is KtSimpleNameExpression && classifier is ClassDescriptor) {
                            val qualifier = ClassQualifier(calleeExpression, classifier)
                            yieldIfNotNull(
                                    tryResolveRHSWithReceiver(
                                            "resolve object callable reference in static scope", qualifier, reference, c, mode
                                    )
                            )
                        }
                    }
                }
            }' @ [702:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'lhs' @ [702:19] ==> value-parameter lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'lhsType' @ [704:38] ==> val lhsType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'constructor' @ [704:46] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [704:58] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'classifier' @ [705:25] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS.<anonymous>[LocalVariableDescriptor]

'c' @ [706:25] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'trace' @ [706:27] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [706:33] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CALLABLE_REFERENCE_LHS_NOT_A_CLASS' @ [706:40] ==> public final val CALLABLE_REFERENCE_LHS_NOT_A_CLASS: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [706:75] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'expression' @ [706:78] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'c' @ [710:37] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'trace' @ [710:39] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'get' @ [710:45] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?), key: (KtExpression..KtExpression?)): Qualifier? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> Qualifier

'QUALIFIER' @ [710:64] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [710:75] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'receiverExpression' @ [710:86] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[PropertyDescriptorImpl]

'qualifier' @ [711:25] ==> val qualifier: Qualifier? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS.<anonymous>[LocalVariableDescriptor]

'yieldIfNotNull' @ [712:25] ==> public suspend fun <T : Any> SequenceBuilder<DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback>.yieldIfNotNull(t: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ResolutionResultsAndTraceCommitCallback

'tryResolveRHSWithReceiver' @ [713:33] ==> private final fun tryResolveRHSWithReceiver(traceTitle: String, receiver: Receiver?, reference: KtSimpleNameExpression, outerContext: ResolutionContext<*>, resolutionMode: ResolveArgumentsMode): DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'qualifier' @ [714:95] ==> val qualifier: Qualifier? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS.<anonymous>[LocalVariableDescriptor]

'reference' @ [714:106] ==> val reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'c' @ [714:117] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'mode' @ [714:120] ==> value-parameter mode: ResolveArgumentsMode defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'yieldIfNotNull' @ [719:21] ==> public suspend fun <T : Any> SequenceBuilder<DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback>.yieldIfNotNull(t: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ResolutionResultsAndTraceCommitCallback

'tryResolveRHSWithReceiver' @ [720:29] ==> private final fun tryResolveRHSWithReceiver(traceTitle: String, receiver: Receiver?, reference: KtSimpleNameExpression, outerContext: ResolutionContext<*>, resolutionMode: ResolveArgumentsMode): DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'TransientReceiver' @ [721:89] ==> public constructor TransientReceiver(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.TransientReceiver[JavaClassConstructorDescriptor]

'lhsType' @ [721:107] ==> val lhsType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'reference' @ [721:117] ==> val reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'c' @ [721:128] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'mode' @ [721:131] ==> value-parameter mode: ResolveArgumentsMode defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'ExpressionReceiver' @ [726:46] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[FakeCallableDescriptorForObject]

'create' @ [726:65] ==> public final fun create(expression: KtExpression, type: KotlinType, bindingContext: BindingContext): ExpressionReceiver defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [726:72] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'receiverExpression' @ [726:83] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[PropertyDescriptorImpl]

'lhsType' @ [726:105] ==> val lhsType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'c' @ [726:114] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'trace' @ [726:116] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [726:122] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'yieldIfNotNull' @ [727:21] ==> public suspend fun <T : Any> SequenceBuilder<DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback>.yieldIfNotNull(t: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ResolutionResultsAndTraceCommitCallback

'tryResolveRHSWithReceiver' @ [728:29] ==> private final fun tryResolveRHSWithReceiver(traceTitle: String, receiver: Receiver?, reference: KtSimpleNameExpression, outerContext: ResolutionContext<*>, resolutionMode: ResolveArgumentsMode): DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'expressionReceiver' @ [729:73] ==> val expressionReceiver: ExpressionReceiver defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS.<anonymous>[LocalVariableDescriptor]

'reference' @ [729:93] ==> val reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'c' @ [729:104] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'mode' @ [729:107] ==> value-parameter mode: ResolveArgumentsMode defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'lhs' @ [733:25] ==> value-parameter lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'isObjectQualifier' @ [733:29] ==> public final val isObjectQualifier: Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[PropertyDescriptorImpl]

'lhsType' @ [734:42] ==> val lhsType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'constructor' @ [734:50] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [734:62] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'expression' @ [735:48] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'receiverExpression' @ [735:59] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[PropertyDescriptorImpl]

'getCalleeExpressionIfAny' @ [735:79] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'calleeExpression' @ [736:29] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS.<anonymous>[LocalVariableDescriptor]

'classifier' @ [736:75] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS.<anonymous>[LocalVariableDescriptor]

'ClassQualifier' @ [737:45] ==> public constructor ClassQualifier(referenceExpression: KtSimpleNameExpression, descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassQualifier[ClassConstructorDescriptorImpl]

'calleeExpression' @ [737:60] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS.<anonymous>[LocalVariableDescriptor]

'classifier' @ [737:78] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS.<anonymous>[LocalVariableDescriptor]

'yieldIfNotNull' @ [738:29] ==> public suspend fun <T : Any> SequenceBuilder<DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback>.yieldIfNotNull(t: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ResolutionResultsAndTraceCommitCallback

'tryResolveRHSWithReceiver' @ [739:37] ==> private final fun tryResolveRHSWithReceiver(traceTitle: String, receiver: Receiver?, reference: KtSimpleNameExpression, outerContext: ResolutionContext<*>, resolutionMode: ResolveArgumentsMode): DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'qualifier' @ [740:98] ==> val qualifier: ClassQualifier defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS.<anonymous>[LocalVariableDescriptor]

'reference' @ [740:109] ==> val reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'c' @ [740:120] ==> value-parameter c: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'mode' @ [740:123] ==> value-parameter mode: ResolveArgumentsMode defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[ValueParameterDescriptorImpl]

'resultSequence' @ [751:24] ==> val resultSequence: Sequence<DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'resultToCommit' @ [752:13] ==> var resultToCommit: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'result' @ [752:30] ==> val result: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'result' @ [753:17] ==> val result: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'results' @ [753:24] ==> public final val results: OverloadResolutionResults<CallableDescriptor> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback[PropertyDescriptorImpl]

'isSuccess' @ [753:32] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<CallableDescriptor>.isSuccess: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resultToCommit' @ [757:16] ==> var resultToCommit: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS[LocalVariableDescriptor]

'let' @ [757:32] ==> @InlineOnly public inline fun <T, R> DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback.let(block: (DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback) -> OverloadResolutionResults<CallableDescriptor>): OverloadResolutionResults<CallableDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolutionResultsAndTraceCommitCallback
    <R> -> OverloadResolutionResults<CallableDescriptor>

'it' @ [758:13] ==> value-parameter it: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [758:16] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'it' @ [759:13] ==> value-parameter it: DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.resolveCallableReferenceRHS.<anonymous>[ValueParameterDescriptorImpl]

'results' @ [759:16] ==> public final val results: OverloadResolutionResults<CallableDescriptor> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.ResolutionResultsAndTraceCommitCallback[PropertyDescriptorImpl]

'if (descriptor.extensionReceiverParameter != null || descriptor.dispatchReceiverParameter != null)
                        (lhs as? DoubleColonLHS.Type)?.type
                    else null' @ [771:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'descriptor' @ [771:25] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [771:36] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [771:74] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [771:85] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'lhs' @ [772:26] ==> value-parameter lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'type' @ [772:56] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Type[PropertyDescriptorImpl]

'when (descriptor) {
                is FunctionDescriptor -> {
                    val returnType = descriptor.returnType ?: return null
                    val parametersTypes = descriptor.valueParameters.map { it.type }
                    val parametersNames = descriptor.valueParameters.map { it.name }
                    return reflectionTypes.getKFunctionType(Annotations.EMPTY, receiverType,
                                                            parametersTypes, parametersNames, returnType, descriptor.builtIns)
                }
                is PropertyDescriptor -> {
                    val mutable = descriptor.isVar && run {
                        val setter = descriptor.setter
                        setter == null || Visibilities.isVisible(receiverType?.let(::TransientReceiver), setter, scopeOwnerDescriptor)
                    }
                    reflectionTypes.getKPropertyType(Annotations.EMPTY, listOfNotNull(receiverType), descriptor.type, mutable)
                }
                is VariableDescriptor -> null
                else -> throw UnsupportedOperationException("Callable reference resolved to an unsupported descriptor: $descriptor")
            }' @ [775:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType?, entry1: KotlinType?, entry2: KotlinType?, entry3: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType?

'descriptor' @ [775:26] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'descriptor' @ [777:38] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'returnType' @ [777:49] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'descriptor' @ [778:43] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'valueParameters' @ [778:54] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [778:70] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'it' @ [778:76] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [778:79] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [779:43] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'valueParameters' @ [779:54] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [779:70] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> Name

'it' @ [779:76] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [779:79] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'reflectionTypes' @ [780:28] ==> value-parameter reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'getKFunctionType' @ [780:44] ==> public final fun getKFunctionType(annotations: Annotations, receiverType: KotlinType?, parameterTypes: List<KotlinType>, parameterNames: List<Name>?, returnType: KotlinType, builtIns: KotlinBuiltIns): SimpleType defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedSimpleFunctionDescriptor]

'Annotations' @ [780:61] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [780:73] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'receiverType' @ [780:80] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[LocalVariableDescriptor]

'parametersTypes' @ [781:61] ==> val parametersTypes: List<KotlinType> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[LocalVariableDescriptor]

'parametersNames' @ [781:78] ==> val parametersNames: List<Name> defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[LocalVariableDescriptor]

'returnType' @ [781:95] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[LocalVariableDescriptor]

'descriptor' @ [781:107] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'builtIns' @ [781:118] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'descriptor' @ [784:35] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'isVar' @ [784:46] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'run' @ [784:55] ==> @InlineOnly public inline fun <T, R> DoubleColonExpressionResolver.Companion.run(block: DoubleColonExpressionResolver.Companion.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Companion
    <R> -> Boolean

'descriptor' @ [785:38] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'setter' @ [785:49] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'setter' @ [786:25] ==> val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference.<anonymous>[LocalVariableDescriptor]

'isVisible' @ [786:56] ==> public open fun isVisible(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'receiverType' @ [786:66] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[LocalVariableDescriptor]

'let' @ [786:80] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> TransientReceiver): TransientReceiver defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> TransientReceiver

'setter' @ [786:106] ==> val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference.<anonymous>[LocalVariableDescriptor]

'scopeOwnerDescriptor' @ [786:114] ==> value-parameter scopeOwnerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'reflectionTypes' @ [788:21] ==> value-parameter reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'getKPropertyType' @ [788:37] ==> public final fun getKPropertyType(annotations: Annotations, receiverTypes: List<KotlinType>, returnType: KotlinType, mutable: Boolean): SimpleType defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedSimpleFunctionDescriptor]

'Annotations' @ [788:54] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [788:66] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'listOfNotNull' @ [788:73] ==> public fun <T : Any> listOfNotNull(element: KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KotlinType

'receiverType' @ [788:87] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[LocalVariableDescriptor]

'descriptor' @ [788:102] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

'type' @ [788:113] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'mutable' @ [788:119] ==> val mutable: Boolean defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[LocalVariableDescriptor]

'UnsupportedOperationException' @ [791:31] ==> public constructor UnsupportedOperationException(p0: (String..String?)) defined in java.lang.UnsupportedOperationException[JavaClassConstructorDescriptor]

'descriptor' @ [791:121] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion.createKCallableTypeForReference[ValueParameterDescriptorImpl]

