'KtElementImpl' @ [30:32] ==> public constructor KtElementImpl(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtElementImpl[JavaClassConstructorDescriptor]

'node' @ [30:46] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.<init>[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [32:20] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KDoc? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KDoc

'kdoc' @ [33:16] ==> val kdoc: KDoc? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.getContainingDoc[LocalVariableDescriptor]

'IllegalStateException' @ [33:30] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'getStrictParentOfType' @ [37:20] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KDocSection? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KDocSection

'kdoc' @ [38:16] ==> val kdoc: KDocSection? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.getContainingSection[LocalVariableDescriptor]

'IllegalStateException' @ [38:30] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'getChildOfType' @ [41:37] ==> public inline fun <reified T : PsiElement> PsiElement.getChildOfType(): KDocName? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KDocName

'node' @ [48:19] ==> public final val KDocName.node: ASTNode[MyPropertyDescriptor]

'findChildByType' @ [48:24] ==> @Nullable public abstract fun findChildByType(p0: (IElementType..IElementType?)): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'DOT' @ [48:49] ==> public final val DOT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'textRange' @ [49:25] ==> public final val KDocName.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'if (dot != null) dot.textRange.endOffset - textRange.startOffset else 0' @ [50:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'dot' @ [50:29] ==> val dot: ASTNode? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.getNameTextRange[LocalVariableDescriptor]

'dot' @ [50:42] ==> val dot: ASTNode? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.getNameTextRange[LocalVariableDescriptor]

'textRange' @ [50:46] ==> public final val ASTNode.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [50:56] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'textRange' @ [50:68] ==> val textRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.getNameTextRange[LocalVariableDescriptor]

'startOffset' @ [50:78] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'TextRange' @ [51:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'nameStart' @ [51:26] ==> val nameStart: Int defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.getNameTextRange[LocalVariableDescriptor]

'textRange' @ [51:37] ==> val textRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.getNameTextRange[LocalVariableDescriptor]

'length' @ [51:47] ==> public final val TextRange.length: Int[MyPropertyDescriptor]

'getNameTextRange' @ [54:33] ==> public final fun getNameTextRange(): TextRange defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName[SimpleFunctionDescriptorImpl]

'substring' @ [54:52] ==> @NotNull public open fun substring(@NotNull p0: String): String defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'text' @ [54:62] ==> public final val KDocName.text: (String..String?)[MyPropertyDescriptor]

'getQualifier' @ [57:25] ==> public final fun getQualifier(): KDocName? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName[SimpleFunctionDescriptorImpl]

'listOf' @ [58:26] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getNameText' @ [58:33] ==> public final fun getNameText(): String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName[SimpleFunctionDescriptorImpl]

'if (qualifier != null) qualifier.getQualifiedName() + nameAsList else nameAsList' @ [59:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'qualifier' @ [59:20] ==> val qualifier: KDocName? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.getQualifiedName[LocalVariableDescriptor]

'qualifier' @ [59:39] ==> val qualifier: KDocName? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.getQualifiedName[LocalVariableDescriptor]

'getQualifiedName' @ [59:49] ==> public final fun getQualifiedName(): List<String> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName[SimpleFunctionDescriptorImpl]

'nameAsList' @ [59:70] ==> val nameAsList: List<String> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.getQualifiedName[LocalVariableDescriptor]

'nameAsList' @ [59:86] ==> val nameAsList: List<String> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName.getQualifiedName[LocalVariableDescriptor]

