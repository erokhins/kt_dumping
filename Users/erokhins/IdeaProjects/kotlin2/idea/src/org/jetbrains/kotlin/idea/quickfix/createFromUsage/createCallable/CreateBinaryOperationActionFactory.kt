'CreateCallableMemberFromUsageFactory<KtBinaryExpression>' @ [29:45] ==> public constructor CreateCallableMemberFromUsageFactory<E : KtElement>(extensionsSupported: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtBinaryExpression

'diagnostic' @ [31:16] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [31:27] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'parent' @ [31:38] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [35:21] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'operationToken' @ [35:29] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'when (token) {
                                KtTokens.IDENTIFIER -> element.operationReference.getReferencedName()
                                else -> OperatorConventions.getNameForOperationSymbol(token, false, true)?.asString()
                            }' @ [36:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'token' @ [36:35] ==> val token: KtToken defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'IDENTIFIER' @ [37:42] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [37:56] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'operationReference' @ [37:64] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getReferencedName' @ [37:83] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'getNameForOperationSymbol' @ [38:61] ==> @Nullable public open fun getNameForOperationSymbol(@NotNull p0: KtToken, p1: Boolean, p2: Boolean): Name? defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaMethodDescriptor]

'token' @ [38:87] ==> val token: KtToken defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'asString' @ [38:108] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'token' @ [40:27] ==> val token: KtToken defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'IN_OPERATIONS' @ [40:56] ==> public final val IN_OPERATIONS: (ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>..ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'token' @ [41:35] ==> val token: KtToken defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'COMPARISON_OPERATIONS' @ [41:64] ==> public final val COMPARISON_OPERATIONS: (ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>..ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'element' @ [43:24] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'left' @ [43:32] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [44:25] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'right' @ [44:33] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'if (inOperation) rightExpr else leftExpr' @ [46:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'inOperation' @ [46:32] ==> val inOperation: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'rightExpr' @ [46:45] ==> val rightExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'leftExpr' @ [46:60] ==> val leftExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'if (inOperation) leftExpr else rightExpr' @ [47:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'inOperation' @ [47:32] ==> val inOperation: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'leftExpr' @ [47:45] ==> val leftExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'rightExpr' @ [47:59] ==> val rightExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'element' @ [49:24] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'builtIns' @ [49:32] ==> public val KtElement.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'TypeInfo' @ [50:28] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'receiverExpr' @ [50:37] ==> val receiverExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'IN_VARIANCE' @ [50:60] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'when {
            inOperation -> TypeInfo.ByType(builtIns.booleanType, Variance.INVARIANT).noSubstitutions()
            comparisonOperation -> TypeInfo.ByType(builtIns.intType, Variance.INVARIANT).noSubstitutions()
            else -> TypeInfo(element, Variance.OUT_VARIANCE)
        }' @ [51:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeInfo, entry1: TypeInfo, entry2: TypeInfo): TypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeInfo

'inOperation' @ [52:13] ==> val inOperation: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'ByType' @ [52:37] ==> public constructor ByType(theType: KotlinType, variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByType[ClassConstructorDescriptorImpl]

'builtIns' @ [52:44] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'booleanType' @ [52:53] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'INVARIANT' @ [52:75] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'noSubstitutions' @ [52:86] ==> public fun TypeInfo.noSubstitutions(): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'comparisonOperation' @ [53:13] ==> val comparisonOperation: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'ByType' @ [53:45] ==> public constructor ByType(theType: KotlinType, variance: Variance) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByType[ClassConstructorDescriptorImpl]

'builtIns' @ [53:52] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'intType' @ [53:61] ==> public final val KotlinBuiltIns.intType: SimpleType[MyPropertyDescriptor]

'INVARIANT' @ [53:79] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'noSubstitutions' @ [53:90] ==> public fun TypeInfo.noSubstitutions(): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'TypeInfo' @ [54:21] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'element' @ [54:30] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'OUT_VARIANCE' @ [54:48] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'singletonList' @ [56:38] ==> public open fun <T : (Any..Any?)> singletonList(p0: (ParameterInfo..ParameterInfo?)): (MutableList<(ParameterInfo..ParameterInfo?)>..List<(ParameterInfo..ParameterInfo?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ParameterInfo

'ParameterInfo' @ [56:52] ==> public constructor ParameterInfo(typeInfo: TypeInfo, preferredName: String? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[ClassConstructorDescriptorImpl]

'TypeInfo' @ [56:66] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'argumentExpr' @ [56:75] ==> val argumentExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'IN_VARIANCE' @ [56:98] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'token' @ [57:26] ==> val token: KtToken defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'IDENTIFIER' @ [57:44] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FunctionInfo' @ [58:16] ==> public constructor FunctionInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, possibleContainers: List<KtElement> = ..., parameterInfos: List<ParameterInfo> = ..., typeParameterInfos: List<TypeInfo> = ..., isOperator: Boolean = ..., isInfix: Boolean = ..., isAbstract: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[ClassConstructorDescriptorImpl]

'operationName' @ [58:29] ==> val operationName: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'receiverType' @ [58:44] ==> val receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'returnType' @ [58:58] ==> val returnType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'parameters' @ [58:87] ==> val parameters: (MutableList<(ParameterInfo..ParameterInfo?)>..List<(ParameterInfo..ParameterInfo?)>?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'isOperator' @ [59:42] ==> val isOperator: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

'!' @ [60:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOperator' @ [60:40] ==> val isOperator: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateBinaryOperationActionFactory.createCallableInfo[LocalVariableDescriptor]

