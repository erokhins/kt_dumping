'KotlinQuickFixAction<KtExpression>' @ [29:79] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtExpression

'element' @ [29:114] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionPropertyInitializerToGetterFix.<init>[ValueParameterDescriptorImpl]

'text' @ [32:44] ==> public final val ConvertExtensionPropertyInitializerToGetterFix.text: String[MyPropertyDescriptor]

'element' @ [35:23] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionPropertyInitializerToGetterFix[PropertyDescriptorImpl]

'element' @ [36:24] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionPropertyInitializerToGetterFix.invoke[LocalVariableDescriptor]

'getParentOfType' @ [36:32] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'ConvertPropertyInitializerToGetterIntention' @ [37:9] ==> public companion object : KotlinSingleIntentionActionFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention[FakeCallableDescriptorForObject]

'convertPropertyInitializerToGetter' @ [37:53] ==> public final fun convertPropertyInitializerToGetter(property: KtProperty, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion[SimpleFunctionDescriptorImpl]

'property' @ [37:88] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionPropertyInitializerToGetterFix.invoke[LocalVariableDescriptor]

'editor' @ [37:98] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionPropertyInitializerToGetterFix.invoke[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [40:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [42:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionPropertyInitializerToGetterFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [42:41] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'expression' @ [43:28] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionPropertyInitializerToGetterFix.Companion.createAction[LocalVariableDescriptor]

'getParentOfType' @ [43:39] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'property' @ [45:17] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionPropertyInitializerToGetterFix.Companion.createAction[LocalVariableDescriptor]

'getter' @ [45:26] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'ConvertExtensionPropertyInitializerToGetterFix' @ [49:20] ==> public constructor ConvertExtensionPropertyInitializerToGetterFix(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionPropertyInitializerToGetterFix[ClassConstructorDescriptorImpl]

'expression' @ [49:67] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ConvertExtensionPropertyInitializerToGetterFix.Companion.createAction[LocalVariableDescriptor]

