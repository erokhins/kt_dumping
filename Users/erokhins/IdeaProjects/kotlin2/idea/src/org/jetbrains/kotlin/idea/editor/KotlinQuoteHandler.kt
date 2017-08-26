'iterator' @ [26:25] ==> value-parameter iterator: HighlighterIterator defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isClosingQuote[ValueParameterDescriptorImpl]

'tokenType' @ [26:34] ==> public final val HighlighterIterator.tokenType: (IElementType..IElementType?)[MyPropertyDescriptor]

'if (tokenType == KtTokens.CHARACTER_LITERAL) {
            val start = iterator.start
            val end = iterator.end
            return end - start >= 1 && offset == end - 1
        }
        else if (tokenType == KtTokens.CLOSING_QUOTE) {
            return true
        }' @ [28:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'tokenType' @ [28:13] ==> val tokenType: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isClosingQuote[LocalVariableDescriptor]

'CHARACTER_LITERAL' @ [28:35] ==> public final val CHARACTER_LITERAL: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'iterator' @ [29:25] ==> value-parameter iterator: HighlighterIterator defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isClosingQuote[ValueParameterDescriptorImpl]

'start' @ [29:34] ==> public final val HighlighterIterator.start: Int[MyPropertyDescriptor]

'iterator' @ [30:23] ==> value-parameter iterator: HighlighterIterator defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isClosingQuote[ValueParameterDescriptorImpl]

'end' @ [30:32] ==> public final val HighlighterIterator.end: Int[MyPropertyDescriptor]

'end' @ [31:20] ==> val end: Int defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isClosingQuote[LocalVariableDescriptor]

'start' @ [31:26] ==> val start: Int defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isClosingQuote[LocalVariableDescriptor]

'offset' @ [31:40] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isClosingQuote[ValueParameterDescriptorImpl]

'end' @ [31:50] ==> val end: Int defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isClosingQuote[LocalVariableDescriptor]

'tokenType' @ [33:18] ==> val tokenType: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isClosingQuote[LocalVariableDescriptor]

'CLOSING_QUOTE' @ [33:40] ==> public final val CLOSING_QUOTE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'iterator' @ [40:25] ==> value-parameter iterator: HighlighterIterator defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isOpeningQuote[ValueParameterDescriptorImpl]

'tokenType' @ [40:34] ==> public final val HighlighterIterator.tokenType: (IElementType..IElementType?)[MyPropertyDescriptor]

'tokenType' @ [42:13] ==> val tokenType: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isOpeningQuote[LocalVariableDescriptor]

'OPEN_QUOTE' @ [42:35] ==> public final val OPEN_QUOTE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'tokenType' @ [42:49] ==> val tokenType: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isOpeningQuote[LocalVariableDescriptor]

'CHARACTER_LITERAL' @ [42:71] ==> public final val CHARACTER_LITERAL: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'iterator' @ [43:25] ==> value-parameter iterator: HighlighterIterator defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isOpeningQuote[ValueParameterDescriptorImpl]

'start' @ [43:34] ==> public final val HighlighterIterator.start: Int[MyPropertyDescriptor]

'offset' @ [44:20] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isOpeningQuote[ValueParameterDescriptorImpl]

'start' @ [44:30] ==> val start: Int defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isOpeningQuote[LocalVariableDescriptor]

'iterator' @ [54:25] ==> value-parameter iterator: HighlighterIterator defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isInsideLiteral[ValueParameterDescriptorImpl]

'tokenType' @ [54:34] ==> public final val HighlighterIterator.tokenType: (IElementType..IElementType?)[MyPropertyDescriptor]

'tokenType' @ [55:16] ==> val tokenType: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isInsideLiteral[LocalVariableDescriptor]

'REGULAR_STRING_PART' @ [55:38] ==> public final val REGULAR_STRING_PART: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'tokenType' @ [56:16] ==> val tokenType: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isInsideLiteral[LocalVariableDescriptor]

'OPEN_QUOTE' @ [56:38] ==> public final val OPEN_QUOTE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'tokenType' @ [57:16] ==> val tokenType: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isInsideLiteral[LocalVariableDescriptor]

'CLOSING_QUOTE' @ [57:38] ==> public final val CLOSING_QUOTE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'tokenType' @ [58:16] ==> val tokenType: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isInsideLiteral[LocalVariableDescriptor]

'SHORT_TEMPLATE_ENTRY_START' @ [58:38] ==> public final val SHORT_TEMPLATE_ENTRY_START: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'tokenType' @ [59:16] ==> val tokenType: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isInsideLiteral[LocalVariableDescriptor]

'LONG_TEMPLATE_ENTRY_END' @ [59:38] ==> public final val LONG_TEMPLATE_ENTRY_END: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'tokenType' @ [60:16] ==> val tokenType: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.editor.KotlinQuoteHandler.isInsideLiteral[LocalVariableDescriptor]

'LONG_TEMPLATE_ENTRY_START' @ [60:38] ==> public final val LONG_TEMPLATE_ENTRY_START: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

