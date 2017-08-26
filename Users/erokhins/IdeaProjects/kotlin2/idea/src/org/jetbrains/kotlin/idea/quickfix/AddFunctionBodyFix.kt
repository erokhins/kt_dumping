'KotlinQuickFixAction<KtFunction>' @ [28:49] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtFunction) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtFunction

'element' @ [28:82] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix.<init>[ValueParameterDescriptorImpl]

'familyName' @ [30:30] ==> public final val AddFunctionBodyFix.familyName: String[MyPropertyDescriptor]

'element' @ [33:23] ==> protected final val element: KtFunction? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix[PropertyDescriptorImpl]

'super' @ [34:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [34:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [34:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [34:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [34:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix.isAvailable[ValueParameterDescriptorImpl]

'!' @ [34:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [34:61] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix.isAvailable[LocalVariableDescriptor]

'hasBody' @ [34:69] ==> public abstract fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'element' @ [38:23] ==> protected final val element: KtFunction? defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix[PropertyDescriptorImpl]

'!' @ [39:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [39:14] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix.invoke[LocalVariableDescriptor]

'hasBody' @ [39:22] ==> public abstract fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'element' @ [40:13] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix.invoke[LocalVariableDescriptor]

'add' @ [40:21] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'KtPsiFactory' @ [40:25] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [40:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix.invoke[ValueParameterDescriptorImpl]

'createEmptyBody' @ [40:47] ==> public final fun createEmptyBody(): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'KotlinSingleIntentionActionFactory' @ [44:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [46:20] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [46:31] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [46:42] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFunction

'let' @ [46:82] ==> @InlineOnly public inline fun <T, R> KtFunction.let(block: (KtFunction) -> AddFunctionBodyFix): AddFunctionBodyFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFunction
    <R> -> AddFunctionBodyFix

'AddFunctionBodyFix' @ [46:88] ==> public constructor AddFunctionBodyFix(element: KtFunction) defined in org.jetbrains.kotlin.idea.quickfix.AddFunctionBodyFix[ClassConstructorDescriptorImpl]

