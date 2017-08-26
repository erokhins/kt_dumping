'isDeprecated' @ [33:23] ==> public open fun isDeprecated(@NotNull p0: KtModifierListOwner): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'declaration' @ [33:36] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'DEPRECATED_ATTRIBUTES' @ [34:38] ==> public final val DEPRECATED_ATTRIBUTES: (TextAttributesKey..TextAttributesKey?) defined in com.intellij.openapi.editor.colors.CodeInsightColors[JavaPropertyDescriptor]

'declaration' @ [39:41] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'name' @ [39:53] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'declaration' @ [42:14] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'declaration' @ [42:43] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'isLocal' @ [42:55] ==> public final val KtFunction.isLocal: Boolean[MyPropertyDescriptor]

'declaration' @ [42:68] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'declaration' @ [42:102] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'isLocal' @ [42:114] ==> public final val KtClassOrObject.isLocal: Boolean[MyPropertyDescriptor]

'declaration' @ [43:41] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'getStrictParentOfType' @ [43:53] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'containingDeclaration' @ [44:33] ==> val containingDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'fqName' @ [44:55] ==> public final val KtNamedDeclaration.fqName: FqName?[MyPropertyDescriptor]

'containingDeclaration' @ [44:65] ==> val containingDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'name' @ [44:87] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'containerName' @ [45:26] ==> val containerName: Any? defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'declaration' @ [47:20] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'fqName' @ [47:32] ==> public final val KtNamedDeclaration.fqName: FqName?[MyPropertyDescriptor]

'name' @ [48:34] ==> val name: FqName defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'parent' @ [48:39] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'toString' @ [48:48] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'declaration' @ [49:22] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'parent' @ [49:34] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent is KtFile && declaration.hasModifier(KtTokens.PRIVATE_KEYWORD)) {
            "${parent.name} in $qualifiedContainer"
        }
        else {
            qualifiedContainer
        }' @ [50:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'parent' @ [50:33] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'declaration' @ [50:53] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'hasModifier' @ [50:65] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [50:86] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'parent' @ [51:16] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'name' @ [51:23] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'qualifiedContainer' @ [51:33] ==> val qualifiedContainer: String defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'qualifiedContainer' @ [54:13] ==> val qualifiedContainer: String defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'declaration' @ [56:32] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'receiverTypeReference' @ [56:72] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'when {
            receiverTypeRef != null -> "(for " + receiverTypeRef.text + " in " + containerText + ")"
            parent is KtFile -> "($containerText)"
            else -> "(in $containerText)"
        }' @ [57:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'receiverTypeRef' @ [58:13] ==> val receiverTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'+' @ [58:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'receiverTypeRef' @ [58:50] ==> val receiverTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'text' @ [58:66] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'containerText' @ [58:82] ==> val containerText: String defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'parent' @ [59:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'containerText' @ [59:36] ==> val containerText: String defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'containerText' @ [60:27] ==> val containerText: String defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation.getLocationString[LocalVariableDescriptor]

'KotlinIconProvider' @ [65:15] ==> public companion object defined in org.jetbrains.kotlin.idea.KotlinIconProvider[FakeCallableDescriptorForObject]

'INSTANCE' @ [65:34] ==> public final var INSTANCE: KotlinIconProvider defined in org.jetbrains.kotlin.idea.KotlinIconProvider.Companion[DeserializedPropertyDescriptor]

'getIcon' @ [65:43] ==> public open fun getIcon(psiElement: PsiElement, flags: Int): Icon? defined in org.jetbrains.kotlin.idea.KotlinIconProvider[DeserializedSimpleFunctionDescriptor]

'declaration' @ [65:51] ==> private final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[PropertyDescriptorImpl]

'or' @ [65:64] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ICON_FLAG_VISIBILITY' @ [65:73] ==> public const final val ICON_FLAG_VISIBILITY: Int defined in com.intellij.openapi.util.Iconable[JavaPropertyDescriptor]

'ICON_FLAG_READ_STATUS' @ [65:106] ==> public const final val ICON_FLAG_READ_STATUS: Int defined in com.intellij.openapi.util.Iconable[JavaPropertyDescriptor]

'KotlinDefaultNamedDeclarationPresentation' @ [69:62] ==> public constructor KotlinDefaultNamedDeclarationPresentation(declaration: KtNamedDeclaration) defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[ClassConstructorDescriptorImpl]

'item' @ [69:104] ==> value-parameter item: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.presentation.KtDefaultDeclarationPresenter.getPresentation[ValueParameterDescriptorImpl]

'function' @ [74:13] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.idea.presentation.KtFunctionPresenter.getPresentation[ValueParameterDescriptorImpl]

'KotlinDefaultNamedDeclarationPresentation' @ [76:25] ==> public constructor KotlinDefaultNamedDeclarationPresentation(declaration: KtNamedDeclaration) defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[ClassConstructorDescriptorImpl]

'function' @ [76:67] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.idea.presentation.KtFunctionPresenter.getPresentation[ValueParameterDescriptorImpl]

'buildString' @ [78:24] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'function' @ [79:21] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.idea.presentation.KtFunctionPresenter.getPresentation[ValueParameterDescriptorImpl]

'name' @ [79:30] ==> public final val KtFunction.name: String?[MyPropertyDescriptor]

'let' @ [79:36] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'append' @ [79:42] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [79:49] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.presentation.KtFunctionPresenter.getPresentation.<no name provided>.getPresentableText.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [81:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [82:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'function' @ [82:28] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.idea.presentation.KtFunctionPresenter.getPresentation[ValueParameterDescriptorImpl]

'valueParameters' @ [82:37] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'joinToString' @ [82:53] ==> public fun <T> Iterable<(KtParameter..KtParameter?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtParameter..KtParameter?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'+' @ [83:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (it.isVarArg) "vararg " else ""' @ [83:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [83:30] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.presentation.KtFunctionPresenter.getPresentation.<no name provided>.getPresentableText.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isVarArg' @ [83:33] ==> public final val KtParameter.isVarArg: Boolean[MyPropertyDescriptor]

'it' @ [83:65] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.presentation.KtFunctionPresenter.getPresentation.<no name provided>.getPresentableText.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [83:68] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [83:83] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'append' @ [85:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'function' @ [90:21] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.idea.presentation.KtFunctionPresenter.getPresentation[ValueParameterDescriptorImpl]

'function' @ [91:32] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.idea.presentation.KtFunctionPresenter.getPresentation[ValueParameterDescriptorImpl]

'getContainingClassOrObject' @ [91:41] ==> public abstract fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtConstructor[DeserializedSimpleFunctionDescriptor]

'fqName' @ [91:70] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'name' @ [92:34] ==> val name: FqName defined in org.jetbrains.kotlin.idea.presentation.KtFunctionPresenter.getPresentation.<no name provided>.getLocationString[LocalVariableDescriptor]

'super' @ [95:24] ==> <this> defined in org.jetbrains.kotlin.idea.presentation.KtFunctionPresenter.getPresentation.<no name provided>[LazyClassReceiverParameterDescriptor]

'getLocationString' @ [95:30] ==> public open fun getLocationString(): String? defined in org.jetbrains.kotlin.idea.presentation.KotlinDefaultNamedDeclarationPresentation[SimpleFunctionDescriptorImpl]

