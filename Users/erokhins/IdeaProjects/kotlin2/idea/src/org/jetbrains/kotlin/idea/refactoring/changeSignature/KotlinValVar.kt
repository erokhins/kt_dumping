'' @ [25:9] ==> private constructor KotlinValVar(keywordName: String) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[ClassConstructorDescriptorImpl]

'' @ [28:8] ==> private constructor KotlinValVar(keywordName: String) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[ClassConstructorDescriptorImpl]

'factory' @ [29:61] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar.Val.createKeyword[ValueParameterDescriptorImpl]

'createValKeyword' @ [29:69] ==> public final fun createValKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'' @ [31:8] ==> private constructor KotlinValVar(keywordName: String) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[ClassConstructorDescriptorImpl]

'factory' @ [32:61] ==> value-parameter factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar.Var.createKeyword[ValueParameterDescriptorImpl]

'createVarKeyword' @ [32:69] ==> public final fun createVarKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'keywordName' @ [35:39] ==> public final val keywordName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[PropertyDescriptorImpl]

'when {
        this == null -> KotlinValVar.None
        node.elementType == KtTokens.VAL_KEYWORD -> KotlinValVar.Val
        node.elementType == KtTokens.VAR_KEYWORD -> KotlinValVar.Var
        else -> throw IllegalArgumentException("Unknown val/var token: " + text)
    }' @ [41:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinValVar, entry1: KotlinValVar, entry2: KotlinValVar, entry3: KotlinValVar): KotlinValVar[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinValVar

'this' @ [42:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.toValVar[ReceiverParameterDescriptorImpl]

'None' @ [42:38] ==> enum entry None defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'node' @ [43:9] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [43:14] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'VAL_KEYWORD' @ [43:38] ==> public final val VAL_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'Val' @ [43:66] ==> enum entry Val defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'node' @ [44:9] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [44:14] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'VAR_KEYWORD' @ [44:38] ==> public final val VAR_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'Var' @ [44:66] ==> enum entry Var defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'IllegalArgumentException' @ [45:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [45:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'text' @ [45:76] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'valOrVar' @ [50:22] ==> value-parameter valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar[ValueParameterDescriptorImpl]

'createKeyword' @ [50:31] ==> public abstract fun createKeyword(factory: KtPsiFactory): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [50:45] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [50:58] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar[ReceiverParameterDescriptorImpl]

'valOrVarKeyword' @ [51:26] ==> public final val KtParameter.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'currentKeyword' @ [53:9] ==> val currentKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar[LocalVariableDescriptor]

'if (newKeyword == null) {
            currentKeyword.delete()
            null
        }
        else {
            currentKeyword.replace(newKeyword)
        }' @ [54:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'newKeyword' @ [54:20] ==> val newKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar[LocalVariableDescriptor]

'currentKeyword' @ [55:13] ==> val currentKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar[LocalVariableDescriptor]

'delete' @ [55:28] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'currentKeyword' @ [59:13] ==> val currentKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar[LocalVariableDescriptor]

'replace' @ [59:28] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'newKeyword' @ [59:36] ==> val newKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar[LocalVariableDescriptor]

'newKeyword' @ [63:9] ==> val newKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar[LocalVariableDescriptor]

'nameIdentifier' @ [65:5] ==> public final val KtParameter.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'let' @ [65:21] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Nothing

'addBefore' @ [65:34] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'newKeyword' @ [65:44] ==> val newKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar[LocalVariableDescriptor]

'it' @ [65:56] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar.<anonymous>[ValueParameterDescriptorImpl]

'modifierList' @ [66:5] ==> public final val KtParameter.modifierList: KtModifierList?[MyPropertyDescriptor]

'let' @ [66:19] ==> @InlineOnly public inline fun <T, R> KtModifierList.let(block: (KtModifierList) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierList
    <R> -> Nothing

'addAfter' @ [66:32] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'newKeyword' @ [66:41] ==> val newKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar[LocalVariableDescriptor]

'it' @ [66:53] ==> value-parameter it: KtModifierList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar.<anonymous>[ValueParameterDescriptorImpl]

'addAfter' @ [67:12] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'newKeyword' @ [67:21] ==> val newKeyword: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.setValOrVar[LocalVariableDescriptor]

