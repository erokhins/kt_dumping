'this' @ [41:13] ==> <this> defined in org.jetbrains.kotlin.idea.editor.templateContentRange[ReceiverParameterDescriptorImpl]

'getParentOfType' @ [41:18] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtStringTemplateExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtStringTemplateExpression

'let' @ [41:70] ==> @InlineOnly public inline fun <T, R> KtStringTemplateExpression.let(block: (KtStringTemplateExpression) -> TextRange): TextRange defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtStringTemplateExpression
    <R> -> TextRange

'it' @ [42:9] ==> value-parameter it: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.editor.<get-templateContentRange>.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [42:12] ==> public final val KtStringTemplateExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'cutOut' @ [42:22] ==> @NotNull public open fun cutOut(@NotNull p0: TextRange): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'it' @ [42:29] ==> value-parameter it: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.editor.<get-templateContentRange>.<anonymous>[ValueParameterDescriptorImpl]

'getContentRange' @ [42:32] ==> public fun KtStringTemplateExpression.getContentRange(): TextRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'this' @ [47:14] ==> <this> defined in org.jetbrains.kotlin.idea.editor.getTemplateIfAtLiteral[ReceiverParameterDescriptorImpl]

'findElementAt' @ [47:19] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [47:33] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.editor.getTemplateIfAtLiteral[ValueParameterDescriptorImpl]

'when (at.node?.elementType) {
        KtTokens.REGULAR_STRING_PART, KtTokens.ESCAPE_SEQUENCE, KtTokens.LONG_TEMPLATE_ENTRY_START, KtTokens.SHORT_TEMPLATE_ENTRY_START -> at.parent.parent as? KtStringTemplateExpression
        KtTokens.CLOSING_QUOTE -> if (offset == at.startOffset) at.parent as? KtStringTemplateExpression else null
        else -> null
    }' @ [48:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtStringTemplateExpression?, entry1: KtStringTemplateExpression?, entry2: KtStringTemplateExpression?): KtStringTemplateExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtStringTemplateExpression?

'at' @ [48:18] ==> val at: PsiElement defined in org.jetbrains.kotlin.idea.editor.getTemplateIfAtLiteral[LocalVariableDescriptor]

'node' @ [48:21] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [48:27] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'REGULAR_STRING_PART' @ [49:18] ==> public final val REGULAR_STRING_PART: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ESCAPE_SEQUENCE' @ [49:48] ==> public final val ESCAPE_SEQUENCE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LONG_TEMPLATE_ENTRY_START' @ [49:74] ==> public final val LONG_TEMPLATE_ENTRY_START: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SHORT_TEMPLATE_ENTRY_START' @ [49:110] ==> public final val SHORT_TEMPLATE_ENTRY_START: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'at' @ [49:140] ==> val at: PsiElement defined in org.jetbrains.kotlin.idea.editor.getTemplateIfAtLiteral[LocalVariableDescriptor]

'parent' @ [49:143] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [49:150] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'CLOSING_QUOTE' @ [50:18] ==> public final val CLOSING_QUOTE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (offset == at.startOffset) at.parent as? KtStringTemplateExpression else null' @ [50:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtStringTemplateExpression?, elseBranch: KtStringTemplateExpression?): KtStringTemplateExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtStringTemplateExpression?

'offset' @ [50:39] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.editor.getTemplateIfAtLiteral[ValueParameterDescriptorImpl]

'at' @ [50:49] ==> val at: PsiElement defined in org.jetbrains.kotlin.idea.editor.getTemplateIfAtLiteral[LocalVariableDescriptor]

'startOffset' @ [50:52] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'at' @ [50:65] ==> val at: PsiElement defined in org.jetbrains.kotlin.idea.editor.getTemplateIfAtLiteral[LocalVariableDescriptor]

'parent' @ [50:68] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'startOffsets' @ [58:25] ==> value-parameter startOffsets: IntArray defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[ValueParameterDescriptorImpl]

'size' @ [58:38] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'assert' @ [59:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'fragmentCount' @ [59:12] ==> val fragmentCount: Int defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[LocalVariableDescriptor]

'fragmentCount' @ [60:23] ==> val fragmentCount: Int defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[LocalVariableDescriptor]

'until' @ [61:15] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'fragmentCount' @ [61:23] ==> val fragmentCount: Int defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[LocalVariableDescriptor]

'totalLength' @ [62:9] ==> var totalLength: Int defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[LocalVariableDescriptor]

'endOffsets' @ [62:24] ==> value-parameter endOffsets: IntArray defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[ValueParameterDescriptorImpl]

'i' @ [62:35] ==> val i: Int defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[LocalVariableDescriptor]

'startOffsets' @ [62:40] ==> value-parameter startOffsets: IntArray defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[ValueParameterDescriptorImpl]

'i' @ [62:53] ==> val i: Int defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[LocalVariableDescriptor]

'if (totalLength < text.length && (text.length + 1) % fragmentCount == 0) {
        (text.length + 1) / fragmentCount - 1
    }
    else {
        -1
    }' @ [64:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'totalLength' @ [64:16] ==> var totalLength: Int defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[LocalVariableDescriptor]

'text' @ [64:30] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[ValueParameterDescriptorImpl]

'length' @ [64:35] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'%' @ [64:45] ==> @SinceKotlin public final operator fun rem(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'text' @ [64:46] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[ValueParameterDescriptorImpl]

'length' @ [64:51] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'fragmentCount' @ [64:65] ==> val fragmentCount: Int defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[LocalVariableDescriptor]

'/' @ [65:9] ==> public final operator fun div(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'text' @ [65:10] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[ValueParameterDescriptorImpl]

'length' @ [65:15] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'fragmentCount' @ [65:29] ==> val fragmentCount: Int defined in org.jetbrains.kotlin.idea.editor.deduceBlockSelectionWidth[LocalVariableDescriptor]

'-' @ [68:9] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'file' @ [74:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[ValueParameterDescriptorImpl]

'StringBuilder' @ [77:22] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'file' @ [79:24] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[ValueParameterDescriptorImpl]

'text' @ [79:29] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'deduceBlockSelectionWidth' @ [80:42] ==> private fun deduceBlockSelectionWidth(startOffsets: IntArray, endOffsets: IntArray, text: String): Int defined in org.jetbrains.kotlin.idea.editor in file KotlinLiteralCopyPasteProcessor.kt[SimpleFunctionDescriptorImpl]

'startOffsets' @ [80:68] ==> value-parameter startOffsets: IntArray defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[ValueParameterDescriptorImpl]

'endOffsets' @ [80:82] ==> value-parameter endOffsets: IntArray defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[ValueParameterDescriptorImpl]

'text' @ [80:94] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[ValueParameterDescriptorImpl]

'startOffsets' @ [82:19] ==> value-parameter startOffsets: IntArray defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[ValueParameterDescriptorImpl]

'indices' @ [82:32] ==> public val IntArray.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'i' @ [83:17] ==> val i: Int defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'buffer' @ [84:17] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'append' @ [84:24] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'TextRange' @ [86:29] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'startOffsets' @ [86:39] ==> value-parameter startOffsets: IntArray defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[ValueParameterDescriptorImpl]

'i' @ [86:52] ==> val i: Int defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'endOffsets' @ [86:56] ==> value-parameter endOffsets: IntArray defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[ValueParameterDescriptorImpl]

'i' @ [86:67] ==> val i: Int defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'fileRange' @ [87:35] ==> val fileRange: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'startOffset' @ [87:45] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'givenTextOffset' @ [88:20] ==> var givenTextOffset: Int defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'fileRange' @ [88:38] ==> val fileRange: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'endOffset' @ [88:48] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'file' @ [89:44] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[ValueParameterDescriptorImpl]

'findElementAt' @ [89:49] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'givenTextOffset' @ [89:63] ==> var givenTextOffset: Int defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'element' @ [90:21] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'buffer' @ [91:21] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'append' @ [91:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'fileText' @ [91:35] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'substring' @ [91:44] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'givenTextOffset' @ [91:54] ==> var givenTextOffset: Int defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'fileRange' @ [91:71] ==> val fileRange: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'endOffset' @ [91:81] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'element' @ [94:28] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'node' @ [94:36] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [94:41] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'if (elTp == KtTokens.ESCAPE_SEQUENCE && fileRange.contains(element.range) &&
                    element.templateContentRange?.contains(fileRange) == true) {
                    val tpEntry = element.parent as KtEscapeStringTemplateEntry
                    changed = true
                    buffer.append(tpEntry.unescapedValue)
                    givenTextOffset = element.endOffset
                }
                else if (elTp == KtTokens.SHORT_TEMPLATE_ENTRY_START || elTp == KtTokens.LONG_TEMPLATE_ENTRY_START) {
                    //Process inner templates without escaping
                    val tpEntry = element.parent
                    val inter = fileRange.intersection(tpEntry.range)!!
                    buffer.append(fileText.substring(inter.startOffset, inter.endOffset))
                    givenTextOffset = inter.endOffset
                }
                else {
                    val inter = fileRange.intersection(element.range)!!
                    buffer.append(fileText.substring(inter.startOffset, inter.endOffset))
                    givenTextOffset = inter.endOffset
                }' @ [95:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'elTp' @ [95:21] ==> val elTp: IElementType defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'ESCAPE_SEQUENCE' @ [95:38] ==> public final val ESCAPE_SEQUENCE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'fileRange' @ [95:57] ==> val fileRange: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'contains' @ [95:67] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'element' @ [95:76] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'range' @ [95:84] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'element' @ [96:21] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'templateContentRange' @ [96:29] ==> private val PsiElement.templateContentRange: TextRange? defined in org.jetbrains.kotlin.idea.editor in file KotlinLiteralCopyPasteProcessor.kt[PropertyDescriptorImpl]

'contains' @ [96:51] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'fileRange' @ [96:60] ==> val fileRange: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'element' @ [97:35] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'parent' @ [97:43] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'changed' @ [98:21] ==> var changed: Boolean defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'buffer' @ [99:21] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'append' @ [99:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'tpEntry' @ [99:35] ==> val tpEntry: KtEscapeStringTemplateEntry defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'unescapedValue' @ [99:43] ==> public final val KtEscapeStringTemplateEntry.unescapedValue: (String..String?)[MyPropertyDescriptor]

'givenTextOffset' @ [100:21] ==> var givenTextOffset: Int defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'element' @ [100:39] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'endOffset' @ [100:47] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'if (elTp == KtTokens.SHORT_TEMPLATE_ENTRY_START || elTp == KtTokens.LONG_TEMPLATE_ENTRY_START) {
                    //Process inner templates without escaping
                    val tpEntry = element.parent
                    val inter = fileRange.intersection(tpEntry.range)!!
                    buffer.append(fileText.substring(inter.startOffset, inter.endOffset))
                    givenTextOffset = inter.endOffset
                }
                else {
                    val inter = fileRange.intersection(element.range)!!
                    buffer.append(fileText.substring(inter.startOffset, inter.endOffset))
                    givenTextOffset = inter.endOffset
                }' @ [102:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'elTp' @ [102:26] ==> val elTp: IElementType defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'SHORT_TEMPLATE_ENTRY_START' @ [102:43] ==> public final val SHORT_TEMPLATE_ENTRY_START: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'elTp' @ [102:73] ==> val elTp: IElementType defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'LONG_TEMPLATE_ENTRY_START' @ [102:90] ==> public final val LONG_TEMPLATE_ENTRY_START: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [104:35] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'parent' @ [104:43] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'fileRange' @ [105:33] ==> val fileRange: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'intersection' @ [105:43] ==> @Nullable public open fun intersection(@NotNull p0: TextRange): TextRange? defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'tpEntry' @ [105:56] ==> val tpEntry: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'range' @ [105:64] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'buffer' @ [106:21] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'append' @ [106:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'fileText' @ [106:35] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'substring' @ [106:44] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'inter' @ [106:54] ==> val inter: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'startOffset' @ [106:60] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'inter' @ [106:73] ==> val inter: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'endOffset' @ [106:79] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'givenTextOffset' @ [107:21] ==> var givenTextOffset: Int defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'inter' @ [107:39] ==> val inter: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'endOffset' @ [107:45] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'fileRange' @ [110:33] ==> val fileRange: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'intersection' @ [110:43] ==> @Nullable public open fun intersection(@NotNull p0: TextRange): TextRange? defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'element' @ [110:56] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'range' @ [110:64] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.editor.fixers in file fixersUtil.kt[PropertyDescriptorImpl]

'buffer' @ [111:21] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'append' @ [111:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'fileText' @ [111:35] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'substring' @ [111:44] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'inter' @ [111:54] ==> val inter: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'startOffset' @ [111:60] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'inter' @ [111:73] ==> val inter: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'endOffset' @ [111:79] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'givenTextOffset' @ [112:21] ==> var givenTextOffset: Int defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'inter' @ [112:39] ==> val inter: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'endOffset' @ [112:45] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'deducedBlockSelectionWidth' @ [115:41] ==> val deducedBlockSelectionWidth: Int defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'fileRange' @ [115:70] ==> val fileRange: TextRange defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'length' @ [115:80] ==> public final val TextRange.length: Int[MyPropertyDescriptor]

'..' @ [116:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'blockSelectionPadding' @ [116:26] ==> val blockSelectionPadding: Int defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'buffer' @ [117:17] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'append' @ [117:24] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (changed) buffer.toString() else null' @ [121:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'changed' @ [121:20] ==> var changed: Boolean defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'buffer' @ [121:29] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnCopy[LocalVariableDescriptor]

'toString' @ [121:36] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'file' @ [125:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'text' @ [126:20] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'getInstance' @ [128:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [128:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'commitDocument' @ [128:49] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [128:64] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'document' @ [128:71] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'editor' @ [129:30] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'selectionModel' @ [129:37] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'file' @ [130:23] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'getTemplateIfAtLiteral' @ [130:28] ==> private fun PsiFile.getTemplateIfAtLiteral(offset: Int): KtStringTemplateExpression? defined in org.jetbrains.kotlin.idea.editor in file KotlinLiteralCopyPasteProcessor.kt[SimpleFunctionDescriptorImpl]

'selectionModel' @ [130:51] ==> val selectionModel: SelectionModel defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'selectionStart' @ [130:66] ==> public final val SelectionModel.selectionStart: Int[MyPropertyDescriptor]

'text' @ [130:92] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'file' @ [131:21] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'getTemplateIfAtLiteral' @ [131:26] ==> private fun PsiFile.getTemplateIfAtLiteral(offset: Int): KtStringTemplateExpression? defined in org.jetbrains.kotlin.idea.editor in file KotlinLiteralCopyPasteProcessor.kt[SimpleFunctionDescriptorImpl]

'selectionModel' @ [131:49] ==> val selectionModel: SelectionModel defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'selectionEnd' @ [131:64] ==> public final val SelectionModel.selectionEnd: Int[MyPropertyDescriptor]

'text' @ [131:88] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'beginTp' @ [132:13] ==> val beginTp: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'isSingleQuoted' @ [132:21] ==> public fun KtStringTemplateExpression.isSingleQuoted(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'endTp' @ [132:41] ==> val endTp: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'isSingleQuoted' @ [132:47] ==> public fun KtStringTemplateExpression.isSingleQuoted(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'text' @ [133:20] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'if (beginTp.isSingleQuoted()) {
            val res = StringBuilder()
            val lineBreak = "\\n\"+\n \""
            var endsInLineBreak = false
            TemplateTokenSequence(text).forEach {
                when (it) {
                    is LiteralChunk -> StringUtil.escapeStringCharacters(it.text.length, it.text, "\$\"", res)
                    is EntryChunk -> res.append(it.text)
                    is NewLineChunk -> res.append(lineBreak)
                }
                endsInLineBreak = it is NewLineChunk
            }
            return if (endsInLineBreak){
                res.removeSuffix(lineBreak).toString() + "\\n"
            } else{
                res.toString()
            }
        }
        else {
            val tripleQuoteRe = Regex("[\"]{3,}")
            TemplateTokenSequence(text).map { chunk ->
                when (chunk) {
                    is LiteralChunk -> chunk.text.replace("\$", "\${'$'}").let { escapedDollar ->
                        tripleQuoteRe.replace(escapedDollar) { "\"\"" + "\${'\"'}".repeat(it.value.count() - 2) }
                    }
                    is EntryChunk -> chunk.text
                    is NewLineChunk -> "\n"
                }
            }.joinToString(separator = "")
        }' @ [136:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'beginTp' @ [136:20] ==> val beginTp: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'isSingleQuoted' @ [136:28] ==> public fun KtStringTemplateExpression.isSingleQuoted(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'StringBuilder' @ [137:23] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'TemplateTokenSequence' @ [140:13] ==> public constructor TemplateTokenSequence(inputString: String) defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[ClassConstructorDescriptorImpl]

'text' @ [140:35] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'forEach' @ [140:41] ==> public inline fun <T> Sequence<TemplateChunk>.forEach(action: (TemplateChunk) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TemplateChunk

'when (it) {
                    is LiteralChunk -> StringUtil.escapeStringCharacters(it.text.length, it.text, "\$\"", res)
                    is EntryChunk -> res.append(it.text)
                    is NewLineChunk -> res.append(lineBreak)
                }' @ [141:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (StringBuilder..StringBuilder?), entry1: (StringBuilder..StringBuilder?), entry2: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'it' @ [141:23] ==> value-parameter it: TemplateChunk defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste.<anonymous>[ValueParameterDescriptorImpl]

'escapeStringCharacters' @ [142:51] ==> @NotNull public open fun escapeStringCharacters(p0: Int, @NotNull p1: String, @Nullable p2: String?, @NotNull @NonNls p3: StringBuilder): StringBuilder defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'it' @ [142:74] ==> value-parameter it: TemplateChunk defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [142:77] ==> public final val text: String defined in org.jetbrains.kotlin.idea.editor.LiteralChunk[PropertyDescriptorImpl]

'length' @ [142:82] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'it' @ [142:90] ==> value-parameter it: TemplateChunk defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [142:93] ==> public final val text: String defined in org.jetbrains.kotlin.idea.editor.LiteralChunk[PropertyDescriptorImpl]

'res' @ [142:107] ==> val res: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'res' @ [143:38] ==> val res: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'append' @ [143:42] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [143:49] ==> value-parameter it: TemplateChunk defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [143:52] ==> public final val text: String defined in org.jetbrains.kotlin.idea.editor.EntryChunk[PropertyDescriptorImpl]

'res' @ [144:40] ==> val res: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'append' @ [144:44] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'lineBreak' @ [144:51] ==> val lineBreak: String defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'endsInLineBreak' @ [146:17] ==> var endsInLineBreak: Boolean defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'it' @ [146:35] ==> value-parameter it: TemplateChunk defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste.<anonymous>[ValueParameterDescriptorImpl]

'if (endsInLineBreak){
                res.removeSuffix(lineBreak).toString() + "\\n"
            } else{
                res.toString()
            }' @ [148:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'endsInLineBreak' @ [148:24] ==> var endsInLineBreak: Boolean defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'res' @ [149:17] ==> val res: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'removeSuffix' @ [149:21] ==> public fun CharSequence.removeSuffix(suffix: CharSequence): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lineBreak' @ [149:34] ==> val lineBreak: String defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'toString' @ [149:45] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'res' @ [151:17] ==> val res: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'toString' @ [151:21] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'Regex' @ [155:33] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'TemplateTokenSequence' @ [156:13] ==> public constructor TemplateTokenSequence(inputString: String) defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[ClassConstructorDescriptorImpl]

'text' @ [156:35] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[ValueParameterDescriptorImpl]

'map' @ [156:41] ==> public fun <T, R> Sequence<TemplateChunk>.map(transform: (TemplateChunk) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TemplateChunk
    <R> -> String

'when (chunk) {
                    is LiteralChunk -> chunk.text.replace("\$", "\${'$'}").let { escapedDollar ->
                        tripleQuoteRe.replace(escapedDollar) { "\"\"" + "\${'\"'}".repeat(it.value.count() - 2) }
                    }
                    is EntryChunk -> chunk.text
                    is NewLineChunk -> "\n"
                }' @ [157:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'chunk' @ [157:23] ==> value-parameter chunk: TemplateChunk defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste.<anonymous>[ValueParameterDescriptorImpl]

'chunk' @ [158:40] ==> value-parameter chunk: TemplateChunk defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [158:46] ==> public final val text: String defined in org.jetbrains.kotlin.idea.editor.LiteralChunk[PropertyDescriptorImpl]

'replace' @ [158:51] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [158:76] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'tripleQuoteRe' @ [159:25] ==> val tripleQuoteRe: Regex defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste[LocalVariableDescriptor]

'replace' @ [159:39] ==> public final fun replace(input: CharSequence, transform: (MatchResult) -> CharSequence): String defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'escapedDollar' @ [159:47] ==> value-parameter escapedDollar: String defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'+' @ [159:64] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'repeat' @ [159:84] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [159:91] ==> value-parameter it: MatchResult defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [159:94] ==> public abstract val value: String defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'count' @ [159:100] ==> @InlineOnly public inline fun CharSequence.count(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chunk' @ [161:38] ==> value-parameter chunk: TemplateChunk defined in org.jetbrains.kotlin.idea.editor.KotlinLiteralCopyPasteProcessor.preprocessOnPaste.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [161:44] ==> public final val text: String defined in org.jetbrains.kotlin.idea.editor.EntryChunk[PropertyDescriptorImpl]

'joinToString' @ [164:15] ==> public fun <T> Sequence<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'TemplateChunk' @ [170:53] ==> private constructor TemplateChunk() defined in org.jetbrains.kotlin.idea.editor.TemplateChunk[ClassConstructorDescriptorImpl]

'TemplateChunk' @ [171:51] ==> private constructor TemplateChunk() defined in org.jetbrains.kotlin.idea.editor.TemplateChunk[ClassConstructorDescriptorImpl]

'TemplateChunk' @ [172:31] ==> private constructor TemplateChunk() defined in org.jetbrains.kotlin.idea.editor.TemplateChunk[ClassConstructorDescriptorImpl]

'if (this.startsWith("\${")) {
        true
    }
    else if (this.length > 1 && this[0] == '$') {
        val guessedIdentifier = substring(1)
        KotlinLexer().apply { start(guessedIdentifier) }.tokenType == KtTokens.IDENTIFIER
    }
    else {
        false
    }' @ [175:63] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'this' @ [175:67] ==> <this> defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.guessIsTemplateEntryStart[ReceiverParameterDescriptorImpl]

'startsWith' @ [175:72] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (this.length > 1 && this[0] == '$') {
        val guessedIdentifier = substring(1)
        KotlinLexer().apply { start(guessedIdentifier) }.tokenType == KtTokens.IDENTIFIER
    }
    else {
        false
    }' @ [178:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'this' @ [178:14] ==> <this> defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.guessIsTemplateEntryStart[ReceiverParameterDescriptorImpl]

'length' @ [178:19] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'this' @ [178:33] ==> <this> defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.guessIsTemplateEntryStart[ReceiverParameterDescriptorImpl]

'substring' @ [179:33] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'KotlinLexer' @ [180:9] ==> public constructor KotlinLexer() defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaClassConstructorDescriptor]

'apply' @ [180:23] ==> @InlineOnly public inline fun <T> KotlinLexer.apply(block: KotlinLexer.() -> Unit): KotlinLexer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinLexer

'start' @ [180:31] ==> public final fun start(@NotNull p0: CharSequence): Unit defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaMethodDescriptor]

'guessedIdentifier' @ [180:37] ==> val guessedIdentifier: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.guessIsTemplateEntryStart[LocalVariableDescriptor]

'tokenType' @ [180:58] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'IDENTIFIER' @ [180:80] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'+' @ [187:23] ==> @InlineOnly public operator inline fun Char.plus(other: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'input' @ [187:29] ==> value-parameter input: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[ValueParameterDescriptorImpl]

'substring' @ [187:35] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'from' @ [187:45] ==> value-parameter from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[ValueParameterDescriptorImpl]

'KotlinLexer' @ [188:21] ==> public constructor KotlinLexer() defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaClassConstructorDescriptor]

'apply' @ [188:35] ==> @InlineOnly public inline fun <T> KotlinLexer.apply(block: KotlinLexer.() -> Unit): KotlinLexer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinLexer

'start' @ [188:43] ==> public final fun start(@NotNull p0: CharSequence): Unit defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaMethodDescriptor]

'wrapped' @ [188:49] ==> val wrapped: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'apply' @ [188:60] ==> @InlineOnly public inline fun <T> KotlinLexer.apply(block: KotlinLexer.() -> Unit): KotlinLexer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinLexer

'advance' @ [188:68] ==> public open fun advance(): Unit defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaMethodDescriptor]

'when (lexer.tokenType) {
            KtTokens.SHORT_TEMPLATE_ENTRY_START -> {
                lexer.advance()
                return if (lexer.tokenType == KtTokens.IDENTIFIER) {
                    from + lexer.tokenEnd - 1
                }
                else {
                    -1
                }
            }
            KtTokens.LONG_TEMPLATE_ENTRY_START -> {
                var depth = 0
                while (lexer.tokenType != null) {
                    if (lexer.tokenType == KtTokens.LONG_TEMPLATE_ENTRY_START) {
                        depth++
                    }
                    else if (lexer.tokenType == KtTokens.LONG_TEMPLATE_ENTRY_END) {
                        depth--
                        if (depth == 0) {
                            return from + lexer.currentPosition.offset
                        }
                    }
                    lexer.advance()
                }
                return -1
            }
            else -> return -1
        }' @ [190:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'lexer' @ [190:15] ==> val lexer: KotlinLexer defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'tokenType' @ [190:21] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'SHORT_TEMPLATE_ENTRY_START' @ [191:22] ==> public final val SHORT_TEMPLATE_ENTRY_START: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'lexer' @ [192:17] ==> val lexer: KotlinLexer defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'advance' @ [192:23] ==> public open fun advance(): Unit defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaMethodDescriptor]

'if (lexer.tokenType == KtTokens.IDENTIFIER) {
                    from + lexer.tokenEnd - 1
                }
                else {
                    -1
                }' @ [193:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'lexer' @ [193:28] ==> val lexer: KotlinLexer defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'tokenType' @ [193:34] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'IDENTIFIER' @ [193:56] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'from' @ [194:21] ==> value-parameter from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[ValueParameterDescriptorImpl]

'lexer' @ [194:28] ==> val lexer: KotlinLexer defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'tokenEnd' @ [194:34] ==> public final val KotlinLexer.tokenEnd: Int[MyPropertyDescriptor]

'-' @ [197:21] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'LONG_TEMPLATE_ENTRY_START' @ [200:22] ==> public final val LONG_TEMPLATE_ENTRY_START: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'lexer' @ [202:24] ==> val lexer: KotlinLexer defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'tokenType' @ [202:30] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'if (lexer.tokenType == KtTokens.LONG_TEMPLATE_ENTRY_START) {
                        depth++
                    }
                    else if (lexer.tokenType == KtTokens.LONG_TEMPLATE_ENTRY_END) {
                        depth--
                        if (depth == 0) {
                            return from + lexer.currentPosition.offset
                        }
                    }' @ [203:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'lexer' @ [203:25] ==> val lexer: KotlinLexer defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'tokenType' @ [203:31] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'LONG_TEMPLATE_ENTRY_START' @ [203:53] ==> public final val LONG_TEMPLATE_ENTRY_START: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'depth' @ [204:25] ==> var depth: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'lexer' @ [206:30] ==> val lexer: KotlinLexer defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'tokenType' @ [206:36] ==> public final val KotlinLexer.tokenType: IElementType?[MyPropertyDescriptor]

'LONG_TEMPLATE_ENTRY_END' @ [206:58] ==> public final val LONG_TEMPLATE_ENTRY_END: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'depth' @ [207:25] ==> var depth: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'depth' @ [208:29] ==> var depth: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'from' @ [209:36] ==> value-parameter from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[ValueParameterDescriptorImpl]

'lexer' @ [209:43] ==> val lexer: KotlinLexer defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'currentPosition' @ [209:49] ==> public final val KotlinLexer.currentPosition: LexerPosition[MyPropertyDescriptor]

'offset' @ [209:65] ==> public final val LexerPosition.offset: Int[MyPropertyDescriptor]

'lexer' @ [212:21] ==> val lexer: KotlinLexer defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.findTemplateEntryEnd[LocalVariableDescriptor]

'advance' @ [212:27] ==> public open fun advance(): Unit defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaMethodDescriptor]

'-' @ [214:24] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [216:28] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'tokenize' @ [221:40] ==> @NotNull public open fun tokenize(p0: (CharSequence..CharSequence?), p1: Boolean, p2: Boolean): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.openapi.util.text.LineTokenizer[JavaMethodDescriptor]

'chunk' @ [221:49] ==> value-parameter chunk: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.yieldLiteral[ValueParameterDescriptorImpl]

'..' @ [222:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'splitLines' @ [222:22] ==> val splitLines: (Array<(String..String?)>..Array<out (String..String?)>) defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.yieldLiteral[LocalVariableDescriptor]

'size' @ [222:33] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'i' @ [223:17] ==> val i: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.yieldLiteral[LocalVariableDescriptor]

'yield' @ [224:17] ==> public abstract suspend fun yield(value: TemplateChunk): Unit defined in kotlin.coroutines.experimental.SequenceBuilder[DeserializedSimpleFunctionDescriptor]

'NewLineChunk' @ [224:23] ==> private object NewLineChunk : TemplateChunk defined in org.jetbrains.kotlin.idea.editor in file KotlinLiteralCopyPasteProcessor.kt[FakeCallableDescriptorForObject]

'splitLines' @ [226:13] ==> val splitLines: (Array<(String..String?)>..Array<out (String..String?)>) defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.yieldLiteral[LocalVariableDescriptor]

'i' @ [226:24] ==> val i: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.yieldLiteral[LocalVariableDescriptor]

'takeIf' @ [226:27] ==> @InlineOnly @SinceKotlin public inline fun <T> (String..String?).takeIf(predicate: ((String..String?)) -> Boolean): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'!' @ [226:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [226:37] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.yieldLiteral.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [226:40] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [226:53] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'yield' @ [226:59] ==> public abstract suspend fun yield(value: TemplateChunk): Unit defined in kotlin.coroutines.experimental.SequenceBuilder[DeserializedSimpleFunctionDescriptor]

'LiteralChunk' @ [226:65] ==> public constructor LiteralChunk(text: String) defined in org.jetbrains.kotlin.idea.editor.LiteralChunk[ClassConstructorDescriptorImpl]

'it' @ [226:78] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.yieldLiteral.<anonymous>[ValueParameterDescriptorImpl]

'inputString' @ [231:13] ==> private final val inputString: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[PropertyDescriptorImpl]

'isEmpty' @ [231:25] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'emptySequence' @ [232:20] ==> public fun <T> emptySequence(): Sequence<TemplateChunk> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TemplateChunk

'iterator' @ [232:51] ==> public abstract operator fun iterator(): Iterator<TemplateChunk> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'buildIterator' @ [234:16] ==> @SinceKotlin public fun <T> buildIterator(builderAction: suspend SequenceBuilder<TemplateChunk>.() -> Unit): Iterator<TemplateChunk> defined in kotlin.coroutines.experimental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TemplateChunk

'to' @ [237:20] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'inputString' @ [237:25] ==> private final val inputString: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[PropertyDescriptorImpl]

'length' @ [237:37] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'inputString' @ [238:25] ==> private final val inputString: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[PropertyDescriptorImpl]

'to' @ [238:37] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'if (c == '\\') {
                    to += 1
                    if (to < inputString.length) to += 1
                    continue
                }
                else if (c == '$') {
                    if (inputString.substring(to).guessIsTemplateEntryStart()) {
                        if (from < to) yieldLiteral(inputString.substring(from until to))
                        from = to
                        to = findTemplateEntryEnd(inputString, from)
                        if (to != -1) {
                            yield(EntryChunk(inputString.substring(from until to)))
                        }
                        else {
                            to = inputString.length
                            yieldLiteral(inputString.substring(from until to))
                        }
                        from = to
                        continue
                    }
                }' @ [239:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'c' @ [239:21] ==> val c: Char defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [240:21] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [241:25] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'inputString' @ [241:30] ==> private final val inputString: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[PropertyDescriptorImpl]

'length' @ [241:42] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'to' @ [241:50] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'c' @ [244:26] ==> val c: Char defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'inputString' @ [245:25] ==> private final val inputString: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[PropertyDescriptorImpl]

'substring' @ [245:37] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'to' @ [245:47] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'guessIsTemplateEntryStart' @ [245:51] ==> private final fun String.guessIsTemplateEntryStart(): Boolean defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[SimpleFunctionDescriptorImpl]

'from' @ [246:29] ==> var from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [246:36] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'yieldLiteral' @ [246:40] ==> private final suspend fun SequenceBuilder<TemplateChunk>.yieldLiteral(chunk: String): Unit defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[SimpleFunctionDescriptorImpl]

'inputString' @ [246:53] ==> private final val inputString: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[PropertyDescriptorImpl]

'substring' @ [246:65] ==> public fun String.substring(range: IntRange): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'from' @ [246:75] ==> var from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [246:86] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'from' @ [247:25] ==> var from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [247:32] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [248:25] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'findTemplateEntryEnd' @ [248:30] ==> private final fun findTemplateEntryEnd(input: String, from: Int): Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[SimpleFunctionDescriptorImpl]

'inputString' @ [248:51] ==> private final val inputString: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[PropertyDescriptorImpl]

'from' @ [248:64] ==> var from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'if (to != -1) {
                            yield(EntryChunk(inputString.substring(from until to)))
                        }
                        else {
                            to = inputString.length
                            yieldLiteral(inputString.substring(from until to))
                        }' @ [249:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'to' @ [249:29] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'-' @ [249:35] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'yield' @ [250:29] ==> public abstract suspend fun yield(value: TemplateChunk): Unit defined in kotlin.coroutines.experimental.SequenceBuilder[DeserializedSimpleFunctionDescriptor]

'EntryChunk' @ [250:35] ==> public constructor EntryChunk(text: String) defined in org.jetbrains.kotlin.idea.editor.EntryChunk[ClassConstructorDescriptorImpl]

'inputString' @ [250:46] ==> private final val inputString: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[PropertyDescriptorImpl]

'substring' @ [250:58] ==> public fun String.substring(range: IntRange): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'from' @ [250:68] ==> var from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [250:79] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [253:29] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'inputString' @ [253:34] ==> private final val inputString: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[PropertyDescriptorImpl]

'length' @ [253:46] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'yieldLiteral' @ [254:29] ==> private final suspend fun SequenceBuilder<TemplateChunk>.yieldLiteral(chunk: String): Unit defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[SimpleFunctionDescriptorImpl]

'inputString' @ [254:42] ==> private final val inputString: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[PropertyDescriptorImpl]

'substring' @ [254:54] ==> public fun String.substring(range: IntRange): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'from' @ [254:64] ==> var from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [254:75] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'from' @ [256:25] ==> var from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [256:32] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [260:17] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'from' @ [262:17] ==> var from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [262:24] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'yieldLiteral' @ [263:17] ==> private final suspend fun SequenceBuilder<TemplateChunk>.yieldLiteral(chunk: String): Unit defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[SimpleFunctionDescriptorImpl]

'inputString' @ [263:30] ==> private final val inputString: String defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[PropertyDescriptorImpl]

'substring' @ [263:42] ==> public fun String.substring(range: IntRange): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'from' @ [263:52] ==> var from: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'to' @ [263:63] ==> var to: Int defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence.iterTemplateChunks.<anonymous>[LocalVariableDescriptor]

'iterTemplateChunks' @ [268:56] ==> private final fun iterTemplateChunks(): Iterator<TemplateChunk> defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[SimpleFunctionDescriptorImpl]

'TestOnly' @ [271:1] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'TemplateTokenSequence' @ [273:12] ==> public constructor TemplateTokenSequence(inputString: String) defined in org.jetbrains.kotlin.idea.editor.TemplateTokenSequence[ClassConstructorDescriptorImpl]

'input' @ [273:34] ==> value-parameter input: String defined in org.jetbrains.kotlin.idea.editor.createTemplateSequenceTokenString[ValueParameterDescriptorImpl]

'map' @ [273:41] ==> public fun <T, R> Sequence<TemplateChunk>.map(transform: (TemplateChunk) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TemplateChunk
    <R> -> String

'when (it) {
            is LiteralChunk -> "LITERAL_CHUNK(${it.text})"
            is EntryChunk -> "ENTRY_CHUNK(${it.text})"
            is NewLineChunk -> "NEW_LINE()"
        }' @ [274:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'it' @ [274:15] ==> value-parameter it: TemplateChunk defined in org.jetbrains.kotlin.idea.editor.createTemplateSequenceTokenString.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [275:49] ==> value-parameter it: TemplateChunk defined in org.jetbrains.kotlin.idea.editor.createTemplateSequenceTokenString.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [275:52] ==> public final val text: String defined in org.jetbrains.kotlin.idea.editor.LiteralChunk[PropertyDescriptorImpl]

'it' @ [276:45] ==> value-parameter it: TemplateChunk defined in org.jetbrains.kotlin.idea.editor.createTemplateSequenceTokenString.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [276:48] ==> public final val text: String defined in org.jetbrains.kotlin.idea.editor.EntryChunk[PropertyDescriptorImpl]

'joinToString' @ [279:7] ==> public fun <T> Sequence<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

