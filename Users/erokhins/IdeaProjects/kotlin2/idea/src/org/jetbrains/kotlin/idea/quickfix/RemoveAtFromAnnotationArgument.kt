'KotlinQuickFixAction<KtAnnotationEntry>' @ [26:72] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtAnnotationEntry) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtAnnotationEntry

'constructor' @ [26:112] ==> value-parameter constructor: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveAtFromAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'text' @ [30:36] ==> public final val RemoveAtFromAnnotationArgument.text: String[MyPropertyDescriptor]

'element' @ [33:23] ==> protected final val element: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.RemoveAtFromAnnotationArgument[PropertyDescriptorImpl]

'KtPsiFactory' @ [35:20] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'element' @ [35:33] ==> val element: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveAtFromAnnotationArgument.invoke[LocalVariableDescriptor]

'project' @ [35:41] ==> public final val KtAnnotationEntry.project: Project[MyPropertyDescriptor]

'createExpression' @ [35:50] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [35:67] ==> val element: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveAtFromAnnotationArgument.invoke[LocalVariableDescriptor]

'text' @ [35:75] ==> public final val KtAnnotationEntry.text: (String..String?)[MyPropertyDescriptor]

'replaceFirst' @ [35:80] ==> public fun String.replaceFirst(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'element' @ [36:9] ==> val element: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveAtFromAnnotationArgument.invoke[LocalVariableDescriptor]

'replace' @ [36:17] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtAnnotationEntry[JavaMethodDescriptor]

'noAt' @ [36:25] ==> val noAt: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveAtFromAnnotationArgument.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [39:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [41:18] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveAtFromAnnotationArgument.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [41:29] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'let' @ [41:64] ==> @InlineOnly public inline fun <T, R> KtAnnotationEntry.let(block: (KtAnnotationEntry) -> RemoveAtFromAnnotationArgument): RemoveAtFromAnnotationArgument defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry
    <R> -> RemoveAtFromAnnotationArgument

'RemoveAtFromAnnotationArgument' @ [41:70] ==> public constructor RemoveAtFromAnnotationArgument(constructor: KtAnnotationEntry) defined in org.jetbrains.kotlin.idea.quickfix.RemoveAtFromAnnotationArgument[ClassConstructorDescriptorImpl]

'it' @ [41:101] ==> value-parameter it: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveAtFromAnnotationArgument.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

