'if (notNullNeeded) "?:" else ""' @ [31:52] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'notNullNeeded' @ [31:56] ==> value-parameter notNullNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.elvisOrEmpty[ValueParameterDescriptorImpl]

'parent' @ [34:18] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                   is KtBinaryExpression -> parent.left?.let { it.getType(it.analyze()) }
                   is KtProperty -> parent.typeReference?.let { it.analyze()[BindingContext.TYPE, it] }
                   else -> null
               }' @ [35:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType?, entry1: KotlinType?, entry2: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType?

'parent' @ [35:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.shouldHaveNotNullType[LocalVariableDescriptor]

'parent' @ [36:45] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.shouldHaveNotNullType[LocalVariableDescriptor]

'left' @ [36:52] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'let' @ [36:58] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'it' @ [36:64] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.shouldHaveNotNullType.<anonymous>[ValueParameterDescriptorImpl]

'getType' @ [36:67] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [36:75] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.shouldHaveNotNullType.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [36:78] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'parent' @ [37:37] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.shouldHaveNotNullType[LocalVariableDescriptor]

'typeReference' @ [37:44] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [37:59] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> KotlinType?

'it' @ [37:65] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.shouldHaveNotNullType.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [37:68] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'TYPE' @ [37:93] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [37:99] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.shouldHaveNotNullType.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [40:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [40:13] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.shouldHaveNotNullType[LocalVariableDescriptor]

'isMarkedNullable' @ [40:18] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'editor' @ [44:5] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.moveCaretToEnd[ValueParameterDescriptorImpl]

'run' @ [44:13] ==> @InlineOnly public inline fun <T, R> Editor.run(block: Editor.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Editor
    <R> -> Unit

'getInstance' @ [45:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [45:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.moveCaretToEnd[ValueParameterDescriptorImpl]

'doPostponedOperationsAndUnblockDocument' @ [45:49] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [45:89] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'if (text.endsWith(")")) endOffset - 1 else endOffset' @ [46:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'text' @ [46:29] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [46:34] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'endOffset' @ [46:49] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'endOffset' @ [46:68] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'document' @ [47:9] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'insertString' @ [47:18] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'endOffset' @ [47:31] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.moveCaretToEnd.<anonymous>[LocalVariableDescriptor]

'caretModel' @ [48:9] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [48:20] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'endOffset' @ [48:33] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.moveCaretToEnd.<anonymous>[LocalVariableDescriptor]

