'CreateGetSetFunctionActionFactory' @ [38:41] ==> public constructor CreateGetSetFunctionActionFactory(isGet: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateGetSetFunctionActionFactory[ClassConstructorDescriptorImpl]

'element' @ [40:25] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'arrayExpression' @ [40:33] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'TypeInfo' @ [41:25] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'arrayExpr' @ [41:34] ==> val arrayExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'IN_VARIANCE' @ [41:54] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'element' @ [43:24] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'builtIns' @ [43:32] ==> public val KtElement.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'element' @ [45:26] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'indexExpressions' @ [45:34] ==> public final val KtArrayAccessExpression.indexExpressions: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)[MyPropertyDescriptor]

'mapTo' @ [45:51] ==> public inline fun <T, R, C : MutableCollection<in ParameterInfo>> Iterable<(KtExpression..KtExpression?)>.mapTo(destination: ArrayList<ParameterInfo>, transform: ((KtExpression..KtExpression?)) -> ParameterInfo): ArrayList<ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <R> -> ParameterInfo
    <C : MutableCollection<in R>> -> ArrayList<ParameterInfo>

'ArrayList' @ [45:57] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ParameterInfo

'ParameterInfo' @ [46:13] ==> public constructor ParameterInfo(typeInfo: TypeInfo, preferredName: String? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[ClassConstructorDescriptorImpl]

'TypeInfo' @ [46:27] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'it' @ [46:36] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'IN_VARIANCE' @ [46:49] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'?:' @ [48:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtOperationExpression?, right: KtOperationExpression): KtOperationExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtOperationExpression

'getParentElementOfType' @ [48:43] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtOperationExpression..KtOperationExpression?)>..Class<(KtOperationExpression..KtOperationExpression?)>?)): KtOperationExpression? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtOperationExpression..org.jetbrains.kotlin.psi.KtOperationExpression?)

'diagnostic' @ [48:66] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'java' @ [48:107] ==> public val <T> KClass<KtOperationExpression>.java: Class<KtOperationExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtOperationExpression

'when (assignmentExpr) {
            is KtBinaryExpression -> {
                TypeInfo(assignmentExpr.right ?: return null, Variance.IN_VARIANCE)
            }
            is KtUnaryExpression -> {
                if (assignmentExpr.operationToken !in OperatorConventions.INCREMENT_OPERATIONS) return null

                val context = assignmentExpr.analyze()
                val rhsType = assignmentExpr.getResolvedCall(context)?.resultingDescriptor?.returnType
                TypeInfo(if (rhsType == null || ErrorUtils.containsErrorType(rhsType)) builtIns.anyType else rhsType, Variance.IN_VARIANCE)
            }
            else -> return null
        }' @ [49:23] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeInfo, entry1: TypeInfo, entry2: TypeInfo): TypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeInfo

'assignmentExpr' @ [49:29] ==> val assignmentExpr: KtOperationExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'TypeInfo' @ [51:17] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'assignmentExpr' @ [51:26] ==> val assignmentExpr: KtOperationExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'right' @ [51:41] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'IN_VARIANCE' @ [51:72] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'assignmentExpr' @ [54:21] ==> val assignmentExpr: KtOperationExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'operationToken' @ [54:36] ==> public final val KtUnaryExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'INCREMENT_OPERATIONS' @ [54:75] ==> public final val INCREMENT_OPERATIONS: (ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>..ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'assignmentExpr' @ [56:31] ==> val assignmentExpr: KtOperationExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'analyze' @ [56:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'assignmentExpr' @ [57:31] ==> val assignmentExpr: KtOperationExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'getResolvedCall' @ [57:46] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [57:62] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'resultingDescriptor' @ [57:72] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'returnType' @ [57:93] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'TypeInfo' @ [58:17] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'if (rhsType == null || ErrorUtils.containsErrorType(rhsType)) builtIns.anyType else rhsType' @ [58:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'rhsType' @ [58:30] ==> val rhsType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'containsErrorType' @ [58:60] ==> public open fun containsErrorType(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'rhsType' @ [58:78] ==> val rhsType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'builtIns' @ [58:88] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'anyType' @ [58:97] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'rhsType' @ [58:110] ==> val rhsType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'IN_VARIANCE' @ [58:128] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'parameters' @ [62:9] ==> val parameters: ArrayList<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'add' @ [62:20] ==> public open fun add(element: ParameterInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ParameterInfo' @ [62:24] ==> public constructor ParameterInfo(typeInfo: TypeInfo, preferredName: String? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[ClassConstructorDescriptorImpl]

'valType' @ [62:38] ==> val valType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'TypeInfo' @ [64:26] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'builtIns' @ [64:35] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'unitType' @ [64:44] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'OUT_VARIANCE' @ [64:63] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'FunctionInfo' @ [65:16] ==> public constructor FunctionInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, possibleContainers: List<KtElement> = ..., parameterInfos: List<ParameterInfo> = ..., typeParameterInfos: List<TypeInfo> = ..., isOperator: Boolean = ..., isInfix: Boolean = ..., isAbstract: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[ClassConstructorDescriptorImpl]

'SET' @ [66:41] ==> @field:JvmField public final val SET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'asString' @ [66:45] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'arrayType' @ [66:57] ==> val arrayType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'returnType' @ [66:68] ==> val returnType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'emptyList' @ [66:92] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KtElement..KtElement?)>..List<(KtElement..KtElement?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'parameters' @ [66:105] ==> val parameters: ArrayList<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateSetFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

