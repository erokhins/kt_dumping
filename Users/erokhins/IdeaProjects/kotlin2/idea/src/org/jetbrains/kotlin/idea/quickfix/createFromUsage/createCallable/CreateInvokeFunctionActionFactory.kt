'CreateCallableMemberFromUsageFactory<KtCallExpression>' @ [31:44] ==> public constructor CreateCallableMemberFromUsageFactory<E : KtElement>(extensionsSupported: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtCallExpression

'diagnostic' @ [33:16] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [33:27] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'parent' @ [33:38] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'FUNCTION_EXPECTED' @ [37:35] ==> public final val FUNCTION_EXPECTED: (DiagnosticFactory2<(KtExpression..KtExpression?), (KtExpression..KtExpression?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [37:53] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtExpression..KtExpression?), (KtExpression..KtExpression?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [37:58] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'b' @ [37:70] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (KtExpression..KtExpression?), (KotlinType..KotlinType?)>.b: KotlinType[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'expectedType' @ [38:13] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'isError' @ [38:26] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'TypeInfo' @ [40:28] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'expectedType' @ [40:37] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'IN_VARIANCE' @ [40:60] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'element' @ [42:23] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'builtIns' @ [42:31] ==> public val KtElement.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'nullableAnyType' @ [42:40] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'element' @ [43:26] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'valueArguments' @ [43:34] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'map' @ [43:49] ==> public inline fun <T, R> Iterable<(KtValueArgument..KtValueArgument?)>.map(transform: ((KtValueArgument..KtValueArgument?)) -> ParameterInfo): List<ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <R> -> ParameterInfo

'ParameterInfo' @ [44:13] ==> public constructor ParameterInfo(typeInfo: TypeInfo, preferredName: String? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[ClassConstructorDescriptorImpl]

'it' @ [45:21] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [45:24] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'let' @ [45:49] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> TypeInfo): TypeInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> TypeInfo

'TypeInfo' @ [45:55] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'it' @ [45:64] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'IN_VARIANCE' @ [45:77] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeInfo' @ [45:95] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'anyType' @ [45:104] ==> val anyType: SimpleType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'IN_VARIANCE' @ [45:122] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'it' @ [46:21] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [46:24] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'referenceExpression' @ [46:43] ==> public open val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtValueArgumentName[JavaPropertyDescriptor]

'getReferencedName' @ [46:64] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'TypeInfo' @ [50:26] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'element' @ [50:35] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'OUT_VARIANCE' @ [50:53] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'FunctionInfo' @ [51:16] ==> public constructor FunctionInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, possibleContainers: List<KtElement> = ..., parameterInfos: List<ParameterInfo> = ..., typeParameterInfos: List<TypeInfo> = ..., isOperator: Boolean = ..., isInfix: Boolean = ..., isAbstract: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[ClassConstructorDescriptorImpl]

'INVOKE' @ [51:53] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'asString' @ [51:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'receiverType' @ [51:72] ==> val receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'returnType' @ [51:86] ==> val returnType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'parameters' @ [51:115] ==> val parameters: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateInvokeFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

