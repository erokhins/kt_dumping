'KotlinQuickFixAction<KtPrimaryConstructor>' @ [29:70] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtPrimaryConstructor) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtPrimaryConstructor

'element' @ [29:113] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorBracketsFix.<init>[ValueParameterDescriptorImpl]

'text' @ [30:44] ==> public final val MissingConstructorBracketsFix.text: String[MyPropertyDescriptor]

'element' @ [34:27] ==> protected final val element: KtPrimaryConstructor? defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorBracketsFix[PropertyDescriptorImpl]

'constructor' @ [35:34] ==> val constructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorBracketsFix.invoke[LocalVariableDescriptor]

'getConstructorKeyword' @ [35:46] ==> public open fun getConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'constructor' @ [36:13] ==> val constructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorBracketsFix.invoke[LocalVariableDescriptor]

'valueParameterList' @ [36:25] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'editor' @ [38:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorBracketsFix.invoke[ValueParameterDescriptorImpl]

'run' @ [38:17] ==> @InlineOnly public inline fun <T, R> Editor.run(block: Editor.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Editor
    <R> -> Unit

'constructorKeyword' @ [39:29] ==> val constructorKeyword: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorBracketsFix.invoke[LocalVariableDescriptor]

'endOffset' @ [39:48] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'document' @ [40:13] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'insertString' @ [40:22] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'endOffset' @ [40:35] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorBracketsFix.invoke.<anonymous>[LocalVariableDescriptor]

'caretModel' @ [41:13] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [41:24] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'endOffset' @ [41:37] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorBracketsFix.invoke.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [42:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [42:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorBracketsFix.invoke[ValueParameterDescriptorImpl]

'commitDocument' @ [42:53] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [42:68] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [46:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [48:17] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorBracketsFix.Companion.createAction[ValueParameterDescriptorImpl]

'createIntentionForFirstParentOfType' @ [48:28] ==> public inline fun <reified T : PsiElement> Diagnostic.createIntentionForFirstParentOfType(factory: (KtPrimaryConstructor) -> KotlinQuickFixAction<KtPrimaryConstructor>?): KotlinQuickFixAction<KtPrimaryConstructor>? defined in org.jetbrains.kotlin.idea.quickfix.quickfixUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtPrimaryConstructor

