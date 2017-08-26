'orSet' @ [30:48] ==> @NotNull public open fun orSet(@NotNull vararg p0: (TokenSet..TokenSet?)): TokenSet defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'COMMENTS' @ [30:63] ==> public final val COMMENTS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'create' @ [30:82] ==> @NotNull public open fun create(@NotNull vararg p0: (IElementType..IElementType?)): TokenSet defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'KDOC' @ [30:100] ==> public final val KDOC: (ILazyParseableElementType..ILazyParseableElementType?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'if (file is KtFile) TODO_COMMENT_TOKENS else null' @ [33:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TokenSet?, elseBranch: TokenSet?): TokenSet?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TokenSet?

'file' @ [33:20] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.search.KotlinIndexPatternBuilder.getCommentTokenSet[ValueParameterDescriptorImpl]

'TODO_COMMENT_TOKENS' @ [33:36] ==> private final val TODO_COMMENT_TOKENS: TokenSet defined in org.jetbrains.kotlin.idea.search.KotlinIndexPatternBuilder[PropertyDescriptorImpl]

'if (file is KtFile) KotlinLexer() else null' @ [37:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Lexer?, elseBranch: Lexer?): Lexer?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Lexer?

'file' @ [37:20] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.search.KotlinIndexPatternBuilder.getIndexingLexer[ValueParameterDescriptorImpl]

'KotlinLexer' @ [37:36] ==> public constructor KotlinLexer() defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaClassConstructorDescriptor]

'when(tokenType) {
        KtTokens.BLOCK_COMMENT -> "*/".length
        else -> 0
    }' @ [42:70] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'tokenType' @ [42:75] ==> value-parameter tokenType: IElementType? defined in org.jetbrains.kotlin.idea.search.KotlinIndexPatternBuilder.getCommentEndDelta[ValueParameterDescriptorImpl]

'BLOCK_COMMENT' @ [43:18] ==> public final val BLOCK_COMMENT: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'length' @ [43:40] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

