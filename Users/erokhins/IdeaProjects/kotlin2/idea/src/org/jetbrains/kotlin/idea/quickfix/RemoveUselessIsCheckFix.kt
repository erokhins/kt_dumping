'KotlinQuickFixAction<KtIsExpression>' @ [27:58] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtIsExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtIsExpression

'element' @ [27:95] ==> value-parameter element: KtIsExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFix.<init>[ValueParameterDescriptorImpl]

'familyName' @ [30:38] ==> public final val RemoveUselessIsCheckFix.familyName: String[MyPropertyDescriptor]

'element' @ [33:9] ==> protected final val element: KtIsExpression? defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFix[PropertyDescriptorImpl]

'run' @ [33:18] ==> @InlineOnly public inline fun <T, R> KtIsExpression.run(block: KtIsExpression.() -> PsiElement): PsiElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtIsExpression
    <R> -> PsiElement

'this' @ [34:35] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFix.invoke.<anonymous>[ReceiverParameterDescriptorImpl]

'isNegated' @ [34:40] ==> public final val KtIsExpression.isNegated: Boolean[MyPropertyDescriptor]

'not' @ [34:50] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'toString' @ [34:56] ==> public open fun toString(): String defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [35:33] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [35:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFix.invoke[ValueParameterDescriptorImpl]

'createExpression' @ [35:55] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expressionsText' @ [35:72] ==> val expressionsText: String defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFix.invoke.<anonymous>[LocalVariableDescriptor]

'replace' @ [36:13] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtIsExpression[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [36:21] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFix.invoke.<anonymous>[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [40:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [42:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [42:41] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [42:52] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtIsExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtIsExpression

'RemoveUselessIsCheckFix' @ [43:20] ==> public constructor RemoveUselessIsCheckFix(element: KtIsExpression) defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFix[ClassConstructorDescriptorImpl]

'expression' @ [43:44] ==> val expression: KtIsExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFix.Companion.createAction[LocalVariableDescriptor]

