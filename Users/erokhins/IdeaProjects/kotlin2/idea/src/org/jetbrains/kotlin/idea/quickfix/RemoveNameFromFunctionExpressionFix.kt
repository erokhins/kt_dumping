'KotlinQuickFixAction<KtNamedFunction>' @ [28:71] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtNamedFunction) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtNamedFunction

'element' @ [28:109] ==> value-parameter element: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.<init>[ValueParameterDescriptorImpl]

'text' @ [30:44] ==> public final val RemoveNameFromFunctionExpressionFix.text: String[MyPropertyDescriptor]

'removeNameFromFunction' @ [33:9] ==> private final fun removeNameFromFunction(function: KtNamedFunction): Unit defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion[SimpleFunctionDescriptorImpl]

'element' @ [33:32] ==> protected final val element: KtNamedFunction? defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix[PropertyDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [36:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [39:17] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.createAction[ValueParameterDescriptorImpl]

'createIntentionForFirstParentOfType' @ [39:28] ==> public inline fun <reified T : PsiElement> Diagnostic.createIntentionForFirstParentOfType(factory: (KtNamedFunction) -> KotlinQuickFixAction<KtNamedFunction>?): KotlinQuickFixAction<KtNamedFunction>? defined in org.jetbrains.kotlin.idea.quickfix.quickfixUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtNamedFunction

'function' @ [43:24] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[ValueParameterDescriptorImpl]

'nameAsName' @ [43:33] ==> public final val KtNamedFunction.nameAsName: Name?[MyPropertyDescriptor]

'function' @ [45:13] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [45:22] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtReturnExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReturnExpression

'!' @ [46:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'wereAutoLabelUsages' @ [46:22] ==> var wereAutoLabelUsages: Boolean defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[LocalVariableDescriptor]

'it' @ [46:45] ==> value-parameter it: KtReturnExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction.<anonymous>[ValueParameterDescriptorImpl]

'getLabelNameAsName' @ [46:48] ==> public final fun getLabelNameAsName(): Name? defined in org.jetbrains.kotlin.psi.KtReturnExpression[DeserializedSimpleFunctionDescriptor]

'name' @ [46:72] ==> val name: Name defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[LocalVariableDescriptor]

'wereAutoLabelUsages' @ [47:21] ==> var wereAutoLabelUsages: Boolean defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[LocalVariableDescriptor]

'it' @ [47:43] ==> value-parameter it: KtReturnExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [47:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'get' @ [47:56] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?), p1: (KtReferenceExpression..KtReferenceExpression?)): PsiElement? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> PsiElement

'LABEL_TARGET' @ [47:75] ==> public final val LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [47:89] ==> value-parameter it: KtReturnExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction.<anonymous>[ValueParameterDescriptorImpl]

'getTargetLabel' @ [47:92] ==> public final fun getTargetLabel(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.KtReturnExpression[DeserializedSimpleFunctionDescriptor]

'function' @ [47:113] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[ValueParameterDescriptorImpl]

'function' @ [51:13] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[ValueParameterDescriptorImpl]

'nameIdentifier' @ [51:22] ==> public final val KtNamedFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'delete' @ [51:38] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'wereAutoLabelUsages' @ [53:17] ==> var wereAutoLabelUsages: Boolean defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[LocalVariableDescriptor]

'KtPsiFactory' @ [54:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'function' @ [54:47] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[ValueParameterDescriptorImpl]

'psiFactory' @ [55:35] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[LocalVariableDescriptor]

'createExpressionByPattern' @ [55:46] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'name' @ [55:82] ==> val name: Name defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[LocalVariableDescriptor]

'function' @ [55:88] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[ValueParameterDescriptorImpl]

'function' @ [56:17] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[ValueParameterDescriptorImpl]

'replace' @ [56:26] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'newFunction' @ [56:34] ==> val newFunction: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveNameFromFunctionExpressionFix.Companion.removeNameFromFunction[LocalVariableDescriptor]

