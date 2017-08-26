'KotlinQuickFixAction<KtValueArgumentList>' @ [29:66] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtValueArgumentList) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtValueArgumentList

'constructor' @ [29:108] ==> value-parameter constructor: KtValueArgumentList defined in org.jetbrains.kotlin.idea.quickfix.RemoveNoConstructorFix.<init>[ValueParameterDescriptorImpl]

'text' @ [33:36] ==> public final val RemoveNoConstructorFix.text: String[MyPropertyDescriptor]

'element' @ [36:34] ==> protected final val element: KtValueArgumentList? defined in org.jetbrains.kotlin.idea.quickfix.RemoveNoConstructorFix[PropertyDescriptorImpl]

'getStrictParentOfType' @ [36:43] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtSuperTypeCallEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperTypeCallEntry

'KtPsiFactory' @ [37:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [37:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RemoveNoConstructorFix.invoke[ValueParameterDescriptorImpl]

'createSuperTypeEntry' @ [37:52] ==> public final fun createSuperTypeEntry(text: String): KtSuperTypeEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'superTypeCallEntry' @ [37:73] ==> val superTypeCallEntry: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveNoConstructorFix.invoke[LocalVariableDescriptor]

'firstChild' @ [37:92] ==> public final val KtSuperTypeCallEntry.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'text' @ [37:103] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'superTypeCallEntry' @ [38:9] ==> val superTypeCallEntry: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveNoConstructorFix.invoke[LocalVariableDescriptor]

'replaced' @ [38:28] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtSuperTypeEntry): KtSuperTypeEntry defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperTypeEntry

'superTypeEntry' @ [38:37] ==> val superTypeEntry: KtSuperTypeEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveNoConstructorFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [41:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [43:18] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveNoConstructorFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [43:29] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'let' @ [43:66] ==> @InlineOnly public inline fun <T, R> KtValueArgumentList.let(block: (KtValueArgumentList) -> RemoveNoConstructorFix): RemoveNoConstructorFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtValueArgumentList
    <R> -> RemoveNoConstructorFix

'RemoveNoConstructorFix' @ [43:72] ==> public constructor RemoveNoConstructorFix(constructor: KtValueArgumentList) defined in org.jetbrains.kotlin.idea.quickfix.RemoveNoConstructorFix[ClassConstructorDescriptorImpl]

'it' @ [43:95] ==> value-parameter it: KtValueArgumentList defined in org.jetbrains.kotlin.idea.quickfix.RemoveNoConstructorFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

