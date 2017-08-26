'children' @ [30:9] ==> public final val KtStringTemplateExpression.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'singleOrNull' @ [30:18] ==> public fun <T> Array<out (PsiElement..PsiElement?)>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'children' @ [30:34] ==> public final val PsiElement.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [30:44] ==> public fun <T> Array<out (PsiElement..PsiElement?)>.firstOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'IntentionBasedInspection<KtStringTemplateExpression>' @ [32:56] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtStringTemplateExpression>>, additionalChecker: (KtStringTemplateExpression) -> Boolean, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtStringTemplateExpression

'RemoveSingleExpressionStringTemplateIntention' @ [33:9] ==> public constructor RemoveSingleExpressionStringTemplateIntention() defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateIntention[ClassConstructorDescriptorImpl]

'templateExpression' @ [36:13] ==> value-parameter templateExpression: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateInspection.<init>.<anonymous>[ValueParameterDescriptorImpl]

'singleExpressionOrNull' @ [36:32] ==> private fun KtStringTemplateExpression.singleExpressionOrNull(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions in file RemoveSingleExpressionStringTemplateIntention.kt[SimpleFunctionDescriptorImpl]

'let' @ [36:58] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Boolean

'isString' @ [37:32] ==> public open fun isString(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [37:41] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateInspection.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getType' @ [37:44] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [37:52] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateInspection.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [37:55] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'SelfTargetingOffsetIndependentIntention<KtStringTemplateExpression>' @ [44:55] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtStringTemplateExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtStringTemplateExpression

'KtStringTemplateExpression' @ [45:9] ==> public constructor KtStringTemplateExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[JavaClassConstructorDescriptor]

'java' @ [45:43] ==> public val <T> KClass<KtStringTemplateExpression>.java: Class<KtStringTemplateExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtStringTemplateExpression

'element' @ [49:13] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateIntention.isApplicableTo[ValueParameterDescriptorImpl]

'singleExpressionOrNull' @ [49:21] ==> private fun KtStringTemplateExpression.singleExpressionOrNull(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions in file RemoveSingleExpressionStringTemplateIntention.kt[SimpleFunctionDescriptorImpl]

'element' @ [52:26] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateIntention.applyTo[ValueParameterDescriptorImpl]

'singleExpressionOrNull' @ [52:34] ==> private fun KtStringTemplateExpression.singleExpressionOrNull(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions in file RemoveSingleExpressionStringTemplateIntention.kt[SimpleFunctionDescriptorImpl]

'expression' @ [53:20] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateIntention.applyTo[LocalVariableDescriptor]

'getType' @ [53:31] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [53:39] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateIntention.applyTo[LocalVariableDescriptor]

'analyze' @ [53:50] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'if (KotlinBuiltIns.isString(type)) expression
                else KtPsiFactory(element).createExpressionByPattern("$0.$1()", expression, "toString")' @ [55:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'isString' @ [55:36] ==> public open fun isString(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [55:45] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateIntention.applyTo[LocalVariableDescriptor]

'expression' @ [55:52] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateIntention.applyTo[LocalVariableDescriptor]

'KtPsiFactory' @ [56:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [56:35] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateIntention.applyTo[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [56:44] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expression' @ [56:81] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateIntention.applyTo[LocalVariableDescriptor]

'element' @ [57:9] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [57:17] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[DeserializedSimpleFunctionDescriptor]

'newElement' @ [57:25] ==> val newElement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveSingleExpressionStringTemplateIntention.applyTo[LocalVariableDescriptor]

