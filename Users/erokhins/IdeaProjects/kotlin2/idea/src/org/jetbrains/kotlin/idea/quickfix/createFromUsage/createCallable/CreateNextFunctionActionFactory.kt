'CreateCallableMemberFromUsageFactory<KtForExpression>' @ [31:42] ==> public constructor CreateCallableMemberFromUsageFactory<E : KtElement>(extensionsSupported: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtForExpression

'getParentElementOfType' @ [33:29] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtForExpression..KtForExpression?)>..Class<(KtForExpression..KtForExpression?)>?)): KtForExpression? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtForExpression..org.jetbrains.kotlin.psi.KtForExpression?)

'diagnostic' @ [33:52] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateNextFunctionActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'KtForExpression' @ [33:64] ==> public constructor KtForExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtForExpression[JavaClassConstructorDescriptor]

'java' @ [33:87] ==> public val <T> KClass<KtForExpression>.java: Class<KtForExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtForExpression

'cast' @ [37:58] ==> @NotNull public open fun <D : (Diagnostic..Diagnostic?)> cast(@NotNull p0: Diagnostic, @NotNull vararg p1: (DiagnosticFactory<out (DiagnosticWithParameters1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..DiagnosticWithParameters1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..DiagnosticWithParameters1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?)>?)): DiagnosticWithParameters1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory[JavaMethodDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters1<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?), (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)>..org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters1<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?), (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)>?)

'diagnostic' @ [37:63] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateNextFunctionActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'NEXT_MISSING' @ [37:82] ==> public final val NEXT_MISSING: (DiagnosticFactory1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'NEXT_NONE_APPLICABLE' @ [37:103] ==> public final val NEXT_NONE_APPLICABLE: (DiagnosticFactory1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'TypeInfo' @ [38:25] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'diagnosticWithParameters' @ [38:34] ==> val diagnosticWithParameters: DiagnosticWithParameters1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateNextFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'a' @ [38:59] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>.a: KotlinType[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'IN_VARIANCE' @ [38:71] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'element' @ [40:28] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateNextFunctionActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'loopParameter' @ [40:36] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'element' @ [40:53] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateNextFunctionActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'destructuringDeclaration' @ [40:61] ==> public final val KtForExpression.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'TypeInfo' @ [41:26] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'variableExpr' @ [41:35] ==> val variableExpr: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateNextFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'OUT_VARIANCE' @ [41:74] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'FunctionInfo' @ [42:16] ==> public constructor FunctionInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, possibleContainers: List<KtElement> = ..., parameterInfos: List<ParameterInfo> = ..., typeParameterInfos: List<TypeInfo> = ..., isOperator: Boolean = ..., isInfix: Boolean = ..., isAbstract: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[ClassConstructorDescriptorImpl]

'NEXT' @ [42:53] ==> @field:JvmField public final val NEXT: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'asString' @ [42:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ownerType' @ [42:70] ==> val ownerType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateNextFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

'returnType' @ [42:81] ==> val returnType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateNextFunctionActionFactory.createCallableInfo[LocalVariableDescriptor]

