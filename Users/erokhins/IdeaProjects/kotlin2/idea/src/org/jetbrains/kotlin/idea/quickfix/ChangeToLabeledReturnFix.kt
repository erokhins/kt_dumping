'KotlinQuickFixAction<KtReturnExpression>' @ [34:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtReturnExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtReturnExpression

'element' @ [34:46] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.<init>[ValueParameterDescriptorImpl]

'labeledReturn' @ [37:43] ==> public final val labeledReturn: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix[PropertyDescriptorImpl]

'element' @ [40:32] ==> protected final val element: KtReturnExpression? defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [41:23] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [41:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.invoke[ValueParameterDescriptorImpl]

'returnExpression' @ [42:34] ==> val returnExpression: KtReturnExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.invoke[LocalVariableDescriptor]

'returnedExpression' @ [42:51] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'if (returnedExpression == null)
            factory.createExpression(labeledReturn)
        else
            factory.createExpressionByPattern("$0 $1", labeledReturn, returnedExpression)' @ [43:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'returnedExpression' @ [43:33] ==> val returnedExpression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.invoke[LocalVariableDescriptor]

'factory' @ [44:13] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.invoke[LocalVariableDescriptor]

'createExpression' @ [44:21] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'labeledReturn' @ [44:38] ==> public final val labeledReturn: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix[PropertyDescriptorImpl]

'factory' @ [46:13] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [46:21] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'labeledReturn' @ [46:56] ==> public final val labeledReturn: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix[PropertyDescriptorImpl]

'returnedExpression' @ [46:71] ==> val returnedExpression: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.invoke[LocalVariableDescriptor]

'returnExpression' @ [47:9] ==> val returnExpression: KtReturnExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.invoke[LocalVariableDescriptor]

'replace' @ [47:26] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtReturnExpression[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [47:34] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.invoke[LocalVariableDescriptor]

'KotlinIntentionActionsFactory' @ [50:24] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'mutableListOf' @ [52:26] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'position' @ [53:28] ==> value-parameter position: KtReturnExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.findAccessibleLabels[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [53:37] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'parent' @ [54:21] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.findAccessibleLabels[LocalVariableDescriptor]

'component1' @ [55:26] ==> public final operator fun component1(): Name? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [55:33] ==> public final operator fun component2(): KtCallExpression? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'parent' @ [55:41] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.findAccessibleLabels[LocalVariableDescriptor]

'findLabelAndCall' @ [55:48] ==> public fun KtFunctionLiteral.findLabelAndCall(): Pair<Name?, KtCallExpression?> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'label' @ [56:25] ==> val label: Name? defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.findAccessibleLabels[LocalVariableDescriptor]

'result' @ [57:25] ==> val result: MutableList<Name> defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.findAccessibleLabels[LocalVariableDescriptor]

'add' @ [57:32] ==> public abstract fun add(element: Name): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'label' @ [57:36] ==> val label: Name? defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.findAccessibleLabels[LocalVariableDescriptor]

'call' @ [61:34] ==> val call: KtCallExpression? defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.findAccessibleLabels[LocalVariableDescriptor]

'calleeExpression' @ [61:40] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [62:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInline' @ [62:37] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'bindingContext' @ [62:46] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.findAccessibleLabels[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [62:76] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callee' @ [62:94] ==> val callee: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.findAccessibleLabels[LocalVariableDescriptor]

'result' @ [65:20] ==> val result: MutableList<Name> defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.findAccessibleLabels[LocalVariableDescriptor]

'diagnostic' @ [69:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.doCreateActions[ValueParameterDescriptorImpl]

'psiElement' @ [69:41] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'emptyList' @ [69:85] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'findAccessibleLabels' @ [70:20] ==> private final fun findAccessibleLabels(bindingContext: BindingContext, position: KtReturnExpression): List<Name> defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [70:41] ==> val expression: KtReturnExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.doCreateActions[LocalVariableDescriptor]

'analyze' @ [70:52] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'expression' @ [70:63] ==> val expression: KtReturnExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.doCreateActions[LocalVariableDescriptor]

'map' @ [70:75] ==> public inline fun <T, R> Iterable<Name>.map(transform: (Name) -> ChangeToLabeledReturnFix): List<ChangeToLabeledReturnFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> ChangeToLabeledReturnFix

'ChangeToLabeledReturnFix' @ [71:17] ==> public constructor ChangeToLabeledReturnFix(element: KtReturnExpression, labeledReturn: String) defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix[ClassConstructorDescriptorImpl]

'expression' @ [71:42] ==> val expression: KtReturnExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.doCreateActions[LocalVariableDescriptor]

'it' @ [71:80] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.quickfix.ChangeToLabeledReturnFix.Companion.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

'render' @ [71:83] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

