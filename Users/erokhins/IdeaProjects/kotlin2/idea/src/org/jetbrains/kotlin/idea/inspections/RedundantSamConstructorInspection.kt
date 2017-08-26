'AbstractKotlinInspection' @ [53:43] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [55:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'name' @ [59:52] ==> public final val <no name provided>.name: String[MyPropertyDescriptor]

'replaceSamConstructorCall' @ [61:25] ==> public final fun replaceSamConstructorCall(callExpression: KtCallExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [61:51] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.createQuickFix[ValueParameterDescriptorImpl]

'name' @ [69:52] ==> public final val <no name provided>.name: String[MyPropertyDescriptor]

'expressions' @ [71:48] ==> value-parameter expressions: Collection<KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.createQuickFix[ValueParameterDescriptorImpl]

'replaceSamConstructorCall' @ [72:29] ==> public final fun replaceSamConstructorCall(callExpression: KtCallExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'callExpression' @ [72:55] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.createQuickFix.<no name provided>.applyFix[LocalVariableDescriptor]

'expression' @ [79:21] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'valueArguments' @ [79:32] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [79:47] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'samConstructorCallsToBeConverted' @ [81:43] ==> public final fun samConstructorCallsToBeConverted(functionCall: KtCallExpression): Collection<KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [81:76] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'samConstructorCalls' @ [82:21] ==> val samConstructorCalls: Collection<KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'isEmpty' @ [82:41] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'samConstructorCalls' @ [83:30] ==> val samConstructorCalls: Collection<KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'singleOrNull' @ [83:50] ==> public fun <T> Iterable<KtCallExpression>.singleOrNull(): KtCallExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'if (single != null) {
                    val calleeExpression = single.calleeExpression ?: return
                    val problemDescriptor = holder.manager.
                            createProblemDescriptor(calleeExpression,
                                                    single.typeArgumentList ?: calleeExpression,
                                                    "Redundant SAM-constructor",
                                                    ProblemHighlightType.LIKE_UNUSED_SYMBOL,
                                                    isOnTheFly,
                                                    createQuickFix(single))

                    holder.registerProblem(problemDescriptor)
                }
                else {
                    val problemDescriptor = holder.manager.
                            createProblemDescriptor(expression.valueArgumentList!!,
                                                    "Redundant SAM-constructors",
                                                    createQuickFix(samConstructorCalls),
                                                    ProblemHighlightType.GENERIC_ERROR_OR_WARNING,
                                                    isOnTheFly)

                    holder.registerProblem(problemDescriptor)
                }' @ [84:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'single' @ [84:21] ==> val single: KtCallExpression? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'single' @ [85:44] ==> val single: KtCallExpression? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'calleeExpression' @ [85:51] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'holder' @ [86:45] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor[ValueParameterDescriptorImpl]

'manager' @ [86:52] ==> public final val ProblemsHolder.manager: InspectionManager[MyPropertyDescriptor]

'createProblemDescriptor' @ [87:29] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @NotNull p1: PsiElement, @NotNull @Nls p2: String, @NotNull p3: ProblemHighlightType, p4: Boolean, vararg p5: (LocalQuickFix..LocalQuickFix?)): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'calleeExpression' @ [87:53] ==> val calleeExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'single' @ [88:53] ==> val single: KtCallExpression? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'typeArgumentList' @ [88:60] ==> public final val KtCallExpression.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'calleeExpression' @ [88:80] ==> val calleeExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'LIKE_UNUSED_SYMBOL' @ [90:74] ==> enum entry LIKE_UNUSED_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'isOnTheFly' @ [91:53] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor[ValueParameterDescriptorImpl]

'createQuickFix' @ [92:53] ==> private final fun createQuickFix(expression: KtCallExpression): LocalQuickFix defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'single' @ [92:68] ==> val single: KtCallExpression? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'holder' @ [94:21] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [94:28] ==> public open fun registerProblem(@NotNull p0: ProblemDescriptor): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'problemDescriptor' @ [94:44] ==> val problemDescriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'holder' @ [97:45] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor[ValueParameterDescriptorImpl]

'manager' @ [97:52] ==> public final val ProblemsHolder.manager: InspectionManager[MyPropertyDescriptor]

'createProblemDescriptor' @ [98:29] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @NotNull @Nls p1: String, p2: (LocalQuickFix..LocalQuickFix?), @NotNull p3: ProblemHighlightType, p4: Boolean): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'expression' @ [98:53] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'valueArgumentList' @ [98:64] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'createQuickFix' @ [100:53] ==> private final fun createQuickFix(expressions: Collection<KtCallExpression>): LocalQuickFix defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'samConstructorCalls' @ [100:68] ==> val samConstructorCalls: Collection<KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [101:74] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'isOnTheFly' @ [102:53] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor[ValueParameterDescriptorImpl]

'holder' @ [104:21] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [104:28] ==> public open fun registerProblem(@NotNull p0: ProblemDescriptor): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'problemDescriptor' @ [104:44] ==> val problemDescriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'callExpression' @ [112:38] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.replaceSamConstructorCall[ValueParameterDescriptorImpl]

'samConstructorValueArgument' @ [112:53] ==> private final fun KtCallExpression.samConstructorValueArgument(): KtValueArgument? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'getArgumentExpression' @ [112:84] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'AssertionError' @ [113:47] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'callExpression' @ [113:141] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.replaceSamConstructorCall[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [113:156] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'callExpression' @ [114:20] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.replaceSamConstructorCall[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [114:35] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'replace' @ [114:77] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'functionalArgument' @ [114:85] ==> val functionalArgument: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.replaceSamConstructorCall[LocalVariableDescriptor]

'parentCall' @ [119:27] ==> value-parameter parentCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[ValueParameterDescriptorImpl]

'analyze' @ [119:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [119:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'parentCall' @ [121:36] ==> value-parameter parentCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[ValueParameterDescriptorImpl]

'calleeExpression' @ [121:47] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'calleeExpression' @ [122:25] ==> val calleeExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'getResolutionScope' @ [122:42] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'context' @ [122:61] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'calleeExpression' @ [122:70] ==> val calleeExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'getResolutionFacade' @ [122:87] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'parentCall' @ [124:32] ==> value-parameter parentCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[ValueParameterDescriptorImpl]

'getResolvedCall' @ [124:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [124:59] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'context' @ [126:28] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'getDataFlowInfoBefore' @ [126:36] ==> public fun BindingContext.getDataFlowInfoBefore(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'parentCall' @ [126:58] ==> value-parameter parentCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[ValueParameterDescriptorImpl]

'parentCall' @ [127:32] ==> value-parameter parentCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [127:43] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'frontendService' @ [127:65] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): CallResolver defined in org.jetbrains.kotlin.idea.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> CallResolver

'CallWithConvertedArguments' @ [128:27] ==> public constructor CallWithConvertedArguments(original: Call, callArgumentMapToConvert: Map<KtValueArgument, KtCallExpression>) defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments[ClassConstructorDescriptorImpl]

'originalCall' @ [128:54] ==> val originalCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'call' @ [128:67] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'samConstructorCallArgumentMap' @ [128:73] ==> value-parameter samConstructorCallArgumentMap: Map<KtValueArgument, KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[ValueParameterDescriptorImpl]

'parentCall' @ [130:39] ==> value-parameter parentCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [130:50] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [131:32] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'EXPECTED_EXPRESSION_TYPE' @ [131:55] ==> public final val EXPECTED_EXPRESSION_TYPE: (WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'qualifiedExpression' @ [131:81] ==> val qualifiedExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'NO_EXPECTED_TYPE' @ [131:115] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'callResolver' @ [133:37] ==> val callResolver: CallResolver defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'resolveFunctionCall' @ [133:50] ==> @NotNull public open fun resolveFunctionCall(@NotNull p0: BindingTrace, @NotNull p1: LexicalScope, @NotNull p2: Call, @NotNull p3: KotlinType, @NotNull p4: DataFlowInfo, p5: Boolean): OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallResolver[JavaMethodDescriptor]

'BindingTraceContext' @ [133:70] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'scope' @ [133:93] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'newCall' @ [133:100] ==> val newCall: RedundantSamConstructorInspection.Companion.CallWithConvertedArguments defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'expectedType' @ [133:109] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'dataFlow' @ [133:123] ==> val dataFlow: DataFlowInfo defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'!' @ [135:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolutionResults' @ [135:18] ==> val resolutionResults: OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'isSuccess' @ [135:36] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)>.isSuccess: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'?:' @ [137:48] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: FunctionDescriptor?, right: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> FunctionDescriptor

'getOriginalIfSamAdapter' @ [137:63] ==> @Nullable public open fun getOriginalIfSamAdapter(@NotNull p0: FunctionDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.codegen.SamCodegenUtil[JavaMethodDescriptor]

'resolutionResults' @ [137:87] ==> val resolutionResults: OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'resultingDescriptor' @ [137:105] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'samAdapterOriginalDescriptor' @ [138:20] ==> val samAdapterOriginalDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'original' @ [138:49] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'originalCall' @ [138:61] ==> val originalCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeReplaced[LocalVariableDescriptor]

'resultingDescriptor' @ [138:74] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'original' @ [138:94] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'DelegatingCall' @ [144:13] ==> public constructor DelegatingCall(@NotNull p0: Call) defined in org.jetbrains.kotlin.resolve.calls.util.DelegatingCall[JavaClassConstructorDescriptor]

'original' @ [144:28] ==> value-parameter original: Call defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments.<init>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [148:31] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'callElement' @ [148:44] ==> public final val RedundantSamConstructorInspection.Companion.CallWithConvertedArguments.callElement: KtElement[MyPropertyDescriptor]

'newArguments' @ [149:17] ==> private final val newArguments: List<ValueArgument> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments[PropertyDescriptorImpl]

'original' @ [149:32] ==> value-parameter original: Call defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments.<init>[ValueParameterDescriptorImpl]

'valueArguments' @ [149:41] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'map' @ [149:56] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.map(transform: ((ValueArgument..ValueArgument?)) -> (ValueArgument..ValueArgument?)): List<(ValueArgument..ValueArgument?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'callArgumentMapToConvert' @ [150:32] ==> public final val callArgumentMapToConvert: Map<KtValueArgument, KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments[PropertyDescriptorImpl]

'argument' @ [150:57] ==> value-parameter argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments.<init>.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [151:41] ==> val call: KtCallExpression? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments.<init>.<anonymous>[LocalVariableDescriptor]

'samConstructorValueArgument' @ [151:47] ==> private final fun KtCallExpression.samConstructorValueArgument(): KtValueArgument? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'getArgumentExpression' @ [151:78] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argument' @ [151:116] ==> value-parameter argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments.<init>.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [152:21] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments.<init>[LocalVariableDescriptor]

'createArgument' @ [152:29] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [152:44] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments.<init>.<anonymous>[LocalVariableDescriptor]

'argument' @ [152:59] ==> value-parameter argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments.<init>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [152:68] ==> public abstract fun getArgumentName(): ValueArgumentName? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'asName' @ [152:87] ==> public abstract val asName: Name defined in org.jetbrains.kotlin.psi.ValueArgumentName[DeserializedPropertyDescriptor]

'newArguments' @ [156:48] ==> private final val newArguments: List<ValueArgument> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.CallWithConvertedArguments[PropertyDescriptorImpl]

'functionCall' @ [160:34] ==> value-parameter functionCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[ValueParameterDescriptorImpl]

'valueArguments' @ [160:47] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'valueArguments' @ [161:17] ==> val valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'all' @ [161:32] ==> public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.all(predicate: ((KtValueArgument..KtValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'!' @ [161:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canBeSamConstructorCall' @ [161:39] ==> private final fun canBeSamConstructorCall(argument: KtValueArgument): Boolean defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'it' @ [161:63] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [162:24] ==> public fun <T> emptyList(): List<KtCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'functionCall' @ [165:34] ==> value-parameter functionCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[ValueParameterDescriptorImpl]

'analyze' @ [165:47] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [165:71] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'functionCall' @ [166:40] ==> value-parameter functionCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[ValueParameterDescriptorImpl]

'getResolvedCall' @ [166:53] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [166:69] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'emptyList' @ [166:95] ==> public fun <T> emptyList(): List<KtCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'!' @ [167:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionResolvedCall' @ [167:18] ==> val functionResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'isReallySuccess' @ [167:39] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [167:65] ==> public fun <T> emptyList(): List<KtCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'valueArguments' @ [169:49] ==> val valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'keysToMapExceptNulls' @ [169:64] ==> public fun <K, V : Any> Iterable<(KtValueArgument..KtValueArgument?)>.keysToMapExceptNulls(value: ((KtValueArgument..KtValueArgument?)) -> KtCallExpression?): Map<(KtValueArgument..KtValueArgument?), KtCallExpression> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <V : Any> -> KtCallExpression

'it' @ [169:87] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted.<anonymous>[ValueParameterDescriptorImpl]

'toCallExpression' @ [169:90] ==> private final fun ValueArgument.toCallExpression(): KtCallExpression? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'filter' @ [169:111] ==> public inline fun <K, V> Map<out (KtValueArgument..KtValueArgument?), KtCallExpression>.filter(predicate: (Map.Entry<(KtValueArgument..KtValueArgument?), KtCallExpression>) -> Boolean): Map<(KtValueArgument..KtValueArgument?), KtCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <V> -> KtCallExpression

'component1' @ [170:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtValueArgument..KtValueArgument?), KtCallExpression>.component1(): (KtValueArgument..KtValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <V> -> KtCallExpression

'component2' @ [170:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtValueArgument..KtValueArgument?), KtCallExpression>.component2(): KtCallExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <V> -> KtCallExpression

'call' @ [170:30] ==> val call: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted.<anonymous>[LocalVariableDescriptor]

'getResolvedCall' @ [170:35] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [170:51] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'resultingDescriptor' @ [170:68] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'original' @ [170:89] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'samConstructorCallArgumentMap' @ [173:17] ==> val samConstructorCallArgumentMap: Map<(KtValueArgument..KtValueArgument?), KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'isEmpty' @ [173:47] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [173:65] ==> public fun <T> emptyList(): List<KtCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'samConstructorCallArgumentMap' @ [175:17] ==> val samConstructorCallArgumentMap: Map<(KtValueArgument..KtValueArgument?), KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'values' @ [175:47] ==> public abstract val values: Collection<KtCallExpression> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'any' @ [175:54] ==> public inline fun <T> Iterable<KtCallExpression>.any(predicate: (KtCallExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'it' @ [176:40] ==> value-parameter it: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted.<anonymous>[ValueParameterDescriptorImpl]

'samConstructorValueArgument' @ [176:43] ==> private final fun KtCallExpression.samConstructorValueArgument(): KtValueArgument? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'it' @ [177:43] ==> value-parameter it: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted.<anonymous>[ValueParameterDescriptorImpl]

'calleeExpression' @ [177:46] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'getReferencedNameAsName' @ [177:92] ==> public abstract fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'samValueArgument' @ [178:17] ==> val samValueArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted.<anonymous>[LocalVariableDescriptor]

'samConstructorName' @ [178:45] ==> val samConstructorName: Name? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted.<anonymous>[LocalVariableDescriptor]

'samValueArgument' @ [179:17] ==> val samValueArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted.<anonymous>[LocalVariableDescriptor]

'hasLabeledReturnPreventingConversion' @ [179:34] ==> private final fun KtValueArgument.hasLabeledReturnPreventingConversion(samConstructorName: Name): Boolean defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'samConstructorName' @ [179:71] ==> val samConstructorName: Name? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted.<anonymous>[LocalVariableDescriptor]

'emptyList' @ [180:23] ==> public fun <T> emptyList(): List<KtCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'functionResolvedCall' @ [182:46] ==> val functionResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'resultingDescriptor' @ [182:67] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'original' @ [182:87] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'emptyList' @ [182:129] ==> public fun <T> emptyList(): List<KtCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'originalFunctionDescriptor' @ [183:35] ==> val originalFunctionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'containingDeclaration' @ [183:62] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'emptyList' @ [183:114] ==> public fun <T> emptyList(): List<KtCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'functionCall' @ [185:35] ==> value-parameter functionCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [185:48] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getFrontendService' @ [185:70] ==> public abstract fun <T : Any> getFrontendService(serviceClass: Class<SyntheticScopes>): SyntheticScopes defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SyntheticScopes

'java' @ [185:112] ==> public val <T> KClass<SyntheticScopes>.java: Class<SyntheticScopes> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SyntheticScopes

'syntheticScopes' @ [188:40] ==> val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'collectSyntheticStaticFunctions' @ [188:56] ==> public fun SyntheticScopes.collectSyntheticStaticFunctions(scope: ResolutionScope): List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [188:88] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'staticScope' @ [188:104] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'contributedFunctions' @ [189:43] ==> val contributedFunctions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'staticFunWithSameName' @ [190:21] ==> val staticFunWithSameName: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'isSamAdapterSuitableForCall' @ [191:25] ==> private final fun isSamAdapterSuitableForCall(samAdapter: FunctionDescriptor, originalFunction: FunctionDescriptor, samConstructorsCount: Int): Boolean defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'staticFunWithSameName' @ [191:53] ==> val staticFunWithSameName: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'originalFunctionDescriptor' @ [191:76] ==> val originalFunctionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'samConstructorCallArgumentMap' @ [191:104] ==> val samConstructorCallArgumentMap: Map<(KtValueArgument..KtValueArgument?), KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'size' @ [191:134] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'samConstructorCallArgumentMap' @ [192:32] ==> val samConstructorCallArgumentMap: Map<(KtValueArgument..KtValueArgument?), KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'takeIf' @ [192:62] ==> @InlineOnly @SinceKotlin public inline fun <T> Map<(KtValueArgument..KtValueArgument?), KtCallExpression>.takeIf(predicate: (Map<(KtValueArgument..KtValueArgument?), KtCallExpression>) -> Boolean): Map<(KtValueArgument..KtValueArgument?), KtCallExpression>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<(org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?), KtCallExpression>

'canBeReplaced' @ [192:71] ==> private final fun canBeReplaced(parentCall: KtCallExpression, samConstructorCallArgumentMap: Map<KtValueArgument, KtCallExpression>): Boolean defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'functionCall' @ [192:85] ==> value-parameter functionCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[ValueParameterDescriptorImpl]

'it' @ [192:99] ==> value-parameter it: Map<(KtValueArgument..KtValueArgument?), KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted.<anonymous>[ValueParameterDescriptorImpl]

'values' @ [192:106] ==> public abstract val values: Collection<KtCallExpression> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'emptyList' @ [192:116] ==> public fun <T> emptyList(): List<KtCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'syntheticScopes' @ [198:39] ==> val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'collectSyntheticMemberFunctions' @ [198:55] ==> public fun SyntheticScopes.collectSyntheticMemberFunctions(receiverTypes: Collection<KotlinType>, name: Name, location: LookupLocation): List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'listOf' @ [199:21] ==> public fun <T> listOf(element: SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'containingClass' @ [199:28] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'defaultType' @ [199:44] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'functionResolvedCall' @ [200:21] ==> val functionResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'resultingDescriptor' @ [200:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'name' @ [200:62] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'FROM_IDE' @ [201:38] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'syntheticExtensions' @ [202:40] ==> val syntheticExtensions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'syntheticExtension' @ [203:34] ==> val syntheticExtension: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'isSamAdapterSuitableForCall' @ [204:21] ==> private final fun isSamAdapterSuitableForCall(samAdapter: FunctionDescriptor, originalFunction: FunctionDescriptor, samConstructorsCount: Int): Boolean defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'samAdapter' @ [204:49] ==> val samAdapter: SamAdapterExtensionFunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'originalFunctionDescriptor' @ [204:61] ==> val originalFunctionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'samConstructorCallArgumentMap' @ [204:89] ==> val samConstructorCallArgumentMap: Map<(KtValueArgument..KtValueArgument?), KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'size' @ [204:119] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'samConstructorCallArgumentMap' @ [205:28] ==> val samConstructorCallArgumentMap: Map<(KtValueArgument..KtValueArgument?), KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[LocalVariableDescriptor]

'takeIf' @ [205:58] ==> @InlineOnly @SinceKotlin public inline fun <T> Map<(KtValueArgument..KtValueArgument?), KtCallExpression>.takeIf(predicate: (Map<(KtValueArgument..KtValueArgument?), KtCallExpression>) -> Boolean): Map<(KtValueArgument..KtValueArgument?), KtCallExpression>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<(org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?), KtCallExpression>

'canBeReplaced' @ [205:67] ==> private final fun canBeReplaced(parentCall: KtCallExpression, samConstructorCallArgumentMap: Map<KtValueArgument, KtCallExpression>): Boolean defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'functionCall' @ [205:81] ==> value-parameter functionCall: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted[ValueParameterDescriptorImpl]

'it' @ [205:95] ==> value-parameter it: Map<(KtValueArgument..KtValueArgument?), KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorCallsToBeConverted.<anonymous>[ValueParameterDescriptorImpl]

'values' @ [205:102] ==> public abstract val values: Collection<KtCallExpression> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'emptyList' @ [205:112] ==> public fun <T> emptyList(): List<KtCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'emptyList' @ [209:20] ==> public fun <T> emptyList(): List<KtCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'argument' @ [213:19] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.canBeSamConstructorCall[ValueParameterDescriptorImpl]

'toCallExpression' @ [213:28] ==> private final fun ValueArgument.toCallExpression(): KtCallExpression? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'samConstructorValueArgument' @ [213:48] ==> private final fun KtCallExpression.samConstructorValueArgument(): KtValueArgument? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'valueArguments' @ [216:20] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [216:35] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.singleOrNull(): KtValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'takeIf' @ [216:51] ==> @InlineOnly @SinceKotlin public inline fun <T> KtValueArgument.takeIf(predicate: (KtValueArgument) -> Boolean): KtValueArgument? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtValueArgument

'it' @ [216:60] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.samConstructorValueArgument.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [216:63] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'getArgumentExpression' @ [220:38] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'if (argumentExpression is KtDotQualifiedExpression)
                argumentExpression.selectorExpression
            else
                argumentExpression' @ [221:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'argumentExpression' @ [221:25] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.toCallExpression[LocalVariableDescriptor]

'argumentExpression' @ [222:17] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.toCallExpression[LocalVariableDescriptor]

'selectorExpression' @ [222:36] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'argumentExpression' @ [224:17] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.toCallExpression[LocalVariableDescriptor]

'getOriginalIfSamAdapter' @ [232:61] ==> @Nullable public open fun getOriginalIfSamAdapter(@NotNull p0: FunctionDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.codegen.SamCodegenUtil[JavaMethodDescriptor]

'samAdapter' @ [232:85] ==> value-parameter samAdapter: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.isSamAdapterSuitableForCall[ValueParameterDescriptorImpl]

'original' @ [232:98] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'samAdapterOriginalFunction' @ [233:17] ==> val samAdapterOriginalFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.isSamAdapterSuitableForCall[LocalVariableDescriptor]

'originalFunction' @ [233:47] ==> value-parameter originalFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.isSamAdapterSuitableForCall[ValueParameterDescriptorImpl]

'originalFunction' @ [235:46] ==> value-parameter originalFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.isSamAdapterSuitableForCall[ValueParameterDescriptorImpl]

'valueParameters' @ [235:63] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'count' @ [235:79] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.count(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'isSamType' @ [235:113] ==> public open fun isSamType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'it' @ [235:123] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.isSamAdapterSuitableForCall.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [235:126] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'parametersWithSamTypeCount' @ [236:20] ==> val parametersWithSamTypeCount: Int defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.isSamAdapterSuitableForCall[LocalVariableDescriptor]

'samConstructorsCount' @ [236:50] ==> value-parameter samConstructorsCount: Int defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.isSamAdapterSuitableForCall[ValueParameterDescriptorImpl]

'anyDescendantOfType' @ [240:17] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtReturnExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReturnExpression

'it' @ [240:59] ==> value-parameter it: KtReturnExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.hasLabeledReturnPreventingConversion.<anonymous>[ValueParameterDescriptorImpl]

'getLabelNameAsName' @ [240:62] ==> public final fun getLabelNameAsName(): Name? defined in org.jetbrains.kotlin.psi.KtReturnExpression[DeserializedSimpleFunctionDescriptor]

'samConstructorName' @ [240:86] ==> value-parameter samConstructorName: Name defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion.hasLabeledReturnPreventingConversion[ValueParameterDescriptorImpl]

