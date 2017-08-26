'IntentionBasedInspection<KtIfExpression>' @ [34:33] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtIfExpression>>, additionalChecker: (KtIfExpression) -> Boolean, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtIfExpression

'IfThenToElvisIntention' @ [35:9] ==> public constructor IfThenToElvisIntention() defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention[ClassConstructorDescriptorImpl]

'it' @ [36:17] ==> value-parameter it: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisInspection.<init>.<anonymous>[ValueParameterDescriptorImpl]

'isUsedAsExpression' @ [36:20] ==> public fun KtExpression.isUsedAsExpression(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [36:39] ==> value-parameter it: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisInspection.<init>.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [36:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [36:66] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [38:62] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisInspection.inspectionTarget[ValueParameterDescriptorImpl]

'ifKeyword' @ [38:70] ==> public final val KtIfExpression.ifKeyword: PsiElement[MyPropertyDescriptor]

'if (element.shouldBeTransformed()) super.problemHighlightType(element) else ProblemHighlightType.INFORMATION' @ [41:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ProblemHighlightType, elseBranch: ProblemHighlightType): ProblemHighlightType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ProblemHighlightType

'element' @ [41:17] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisInspection.problemHighlightType[ValueParameterDescriptorImpl]

'shouldBeTransformed' @ [41:25] ==> internal fun KtIfExpression.shouldBeTransformed(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'super' @ [41:48] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisInspection[LazyClassReceiverParameterDescriptor]

'problemHighlightType' @ [41:54] ==> protected open fun problemHighlightType(element: KtIfExpression): ProblemHighlightType defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedSimpleFunctionDescriptor]

'element' @ [41:75] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisInspection.problemHighlightType[ValueParameterDescriptorImpl]

'INFORMATION' @ [41:110] ==> enum entry INFORMATION defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'SelfTargetingOffsetIndependentIntention<KtIfExpression>' @ [44:32] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtIfExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtIfExpression

'KtIfExpression' @ [45:9] ==> public constructor KtIfExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtIfExpression[JavaClassConstructorDescriptor]

'java' @ [45:31] ==> public val <T> KClass<KtIfExpression>.java: Class<KtIfExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtIfExpression

'baseClause' @ [50:13] ==> public final val baseClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'negatedClause' @ [50:35] ==> public final val negatedClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'negatedClause' @ [50:60] ==> public final val negatedClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'isNullOrBlockExpression' @ [50:74] ==> private final fun KtExpression.isNullOrBlockExpression(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention[SimpleFunctionDescriptorImpl]

'negatedClause' @ [51:13] ==> public final val negatedClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'negatedClause' @ [51:51] ==> public final val negatedClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'throwsNullPointerExceptionWithNoArguments' @ [51:65] ==> public fun KtThrowExpression.throwsNullPointerExceptionWithNoArguments(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [53:16] ==> public final val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'hasImplicitReceiver' @ [53:58] ==> internal final fun hasImplicitReceiver(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[SimpleFunctionDescriptorImpl]

'baseClause' @ [54:16] ==> public final val baseClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'evaluatesTo' @ [54:27] ==> public fun KtExpression.evaluatesTo(other: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [54:39] ==> public final val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'baseClause' @ [55:16] ==> public final val baseClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'hasFirstReceiverOf' @ [55:27] ==> internal fun KtExpression.hasFirstReceiverOf(receiver: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [55:46] ==> public final val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'!' @ [55:69] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'baseClause' @ [55:70] ==> public final val baseClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'hasNullableType' @ [55:81] ==> internal fun KtExpression.hasNullableType(context: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [55:97] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'element' @ [59:34] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.isApplicableTo[ValueParameterDescriptorImpl]

'buildSelectTransformationData' @ [59:42] ==> internal fun KtIfExpression.buildSelectTransformationData(): IfThenToSelectData? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'!' @ [60:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ifThenToSelectData' @ [60:14] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.isApplicableTo[LocalVariableDescriptor]

'receiverExpression' @ [60:33] ==> public final val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'isStable' @ [60:52] ==> public fun KtExpression.isStable(context: BindingContext = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'ifThenToSelectData' @ [60:61] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.isApplicableTo[LocalVariableDescriptor]

'context' @ [60:80] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'element' @ [62:20] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getType' @ [62:28] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'ifThenToSelectData' @ [62:36] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.isApplicableTo[LocalVariableDescriptor]

'context' @ [62:55] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'isUnit' @ [63:28] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [63:35] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.isApplicableTo[LocalVariableDescriptor]

'ifThenToSelectData' @ [65:16] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.isApplicableTo[LocalVariableDescriptor]

'clausesReplaceableByElvis' @ [65:35] ==> private final fun IfThenToSelectData.clausesReplaceableByElvis(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention[SimpleFunctionDescriptorImpl]

'this' @ [69:31] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.isNullOrBlockExpression[ReceiverParameterDescriptorImpl]

'unwrapBlockOrParenthesis' @ [69:36] ==> public fun KtExpression.unwrapBlockOrParenthesis(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'innerExpression' @ [70:16] ==> val innerExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.isNullOrBlockExpression[LocalVariableDescriptor]

'innerExpression' @ [70:56] ==> val innerExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.isNullOrBlockExpression[LocalVariableDescriptor]

'node' @ [70:72] ==> public final val KtExpression.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [70:77] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'NULL' @ [70:104] ==> public final val NULL: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'element' @ [76:34] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo[ValueParameterDescriptorImpl]

'buildSelectTransformationData' @ [76:42] ==> internal fun KtIfExpression.buildSelectTransformationData(): IfThenToSelectData? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [78:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [78:36] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo[ValueParameterDescriptorImpl]

'runWriteAction' @ [79:21] ==> public fun <T> runWriteAction(action: () -> KtBinaryExpression): KtBinaryExpression defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'ifThenToSelectData' @ [80:38] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo[LocalVariableDescriptor]

'replacedBaseClause' @ [80:57] ==> internal final fun replacedBaseClause(factory: KtPsiFactory): KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[SimpleFunctionDescriptorImpl]

'factory' @ [80:76] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo[LocalVariableDescriptor]

'element' @ [81:27] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo[ValueParameterDescriptorImpl]

'replaced' @ [81:35] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'factory' @ [81:44] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [81:52] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'replacedBaseClause' @ [82:78] ==> val replacedBaseClause: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'ifThenToSelectData' @ [83:78] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo[LocalVariableDescriptor]

'negatedClause' @ [83:97] ==> public final val negatedClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'deparenthesize' @ [84:23] ==> @Nullable public open fun deparenthesize(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'newExpr' @ [84:38] ==> val newExpr: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'editor' @ [87:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo[ValueParameterDescriptorImpl]

'elvis' @ [88:13] ==> val elvis: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo[LocalVariableDescriptor]

'inlineLeftSideIfApplicableWithPrompt' @ [88:19] ==> public fun KtBinaryExpression.inlineLeftSideIfApplicableWithPrompt(editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'editor' @ [88:56] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToElvisIntention.applyTo[ValueParameterDescriptorImpl]

