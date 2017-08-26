'CustomFoldingBuilder' @ [39:30] ==> public constructor CustomFoldingBuilder() defined in com.intellij.lang.folding.CustomFoldingBuilder[JavaClassConstructorDescriptor]

'root' @ [42:13] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[ValueParameterDescriptorImpl]

'root' @ [45:23] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[ValueParameterDescriptorImpl]

'importDirectives' @ [45:28] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'imports' @ [46:13] ==> val imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[LocalVariableDescriptor]

'size' @ [46:21] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'imports' @ [47:33] ==> val imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[LocalVariableDescriptor]

'firstChild' @ [47:44] ==> public final val KtImportDirective.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'importKeyword' @ [48:31] ==> val importKeyword: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[LocalVariableDescriptor]

'endOffset' @ [48:45] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'root' @ [50:30] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[ValueParameterDescriptorImpl]

'importList' @ [50:35] ==> public final val KtFile.importList: KtImportList?[MyPropertyDescriptor]

'importList' @ [51:17] ==> val importList: KtImportList? defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[LocalVariableDescriptor]

'importList' @ [52:33] ==> val importList: KtImportList? defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[LocalVariableDescriptor]

'endOffset' @ [52:44] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'TextRange' @ [54:29] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'startOffset' @ [54:39] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[LocalVariableDescriptor]

'endOffset' @ [54:52] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[LocalVariableDescriptor]

'descriptors' @ [55:17] ==> value-parameter descriptors: MutableList<FoldingDescriptor> defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[ValueParameterDescriptorImpl]

'add' @ [55:29] ==> public abstract fun add(element: FoldingDescriptor): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'FoldingDescriptor' @ [55:33] ==> public constructor FoldingDescriptor(@NotNull p0: PsiElement, @NotNull p1: TextRange) defined in com.intellij.lang.folding.FoldingDescriptor[JavaClassConstructorDescriptor]

'importList' @ [55:51] ==> val importList: KtImportList? defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[LocalVariableDescriptor]

'range' @ [55:63] ==> val range: TextRange defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[LocalVariableDescriptor]

'apply' @ [55:70] ==> @InlineOnly public inline fun <T> FoldingDescriptor.apply(block: FoldingDescriptor.() -> Unit): FoldingDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FoldingDescriptor

'setCanBeRemovedWhenCollapsed' @ [55:78] ==> public open fun setCanBeRemovedWhenCollapsed(p0: Boolean): Unit defined in com.intellij.lang.folding.FoldingDescriptor[JavaMethodDescriptor]

'appendDescriptors' @ [59:9] ==> private final fun appendDescriptors(node: ASTNode, document: Document, descriptors: MutableList<FoldingDescriptor>): Unit defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder[SimpleFunctionDescriptorImpl]

'root' @ [59:27] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[ValueParameterDescriptorImpl]

'node' @ [59:32] ==> public final val KtFile.node: FileASTNode[MyPropertyDescriptor]

'document' @ [59:38] ==> value-parameter document: Document defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[ValueParameterDescriptorImpl]

'descriptors' @ [59:48] ==> value-parameter descriptors: MutableList<FoldingDescriptor> defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.buildLanguageFoldRegions[ValueParameterDescriptorImpl]

'needFolding' @ [63:13] ==> private final fun needFolding(node: ASTNode): Boolean defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder[SimpleFunctionDescriptorImpl]

'node' @ [63:25] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[ValueParameterDescriptorImpl]

'getRangeToFold' @ [64:29] ==> private final fun getRangeToFold(node: ASTNode): TextRange defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder[SimpleFunctionDescriptorImpl]

'node' @ [64:44] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[ValueParameterDescriptorImpl]

'textRange' @ [65:33] ==> val textRange: TextRange defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[LocalVariableDescriptor]

'shiftRight' @ [65:43] ==> @NotNull public open fun shiftRight(p0: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'-' @ [65:54] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'node' @ [65:55] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[ValueParameterDescriptorImpl]

'textRange' @ [65:60] ==> public final val ASTNode.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [65:70] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'node' @ [66:34] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[ValueParameterDescriptorImpl]

'chars' @ [66:39] ==> public final val ASTNode.chars: CharSequence[MyPropertyDescriptor]

'subSequence' @ [66:45] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'relativeRange' @ [66:57] ==> val relativeRange: TextRange defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[LocalVariableDescriptor]

'startOffset' @ [66:71] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'relativeRange' @ [66:84] ==> val relativeRange: TextRange defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[LocalVariableDescriptor]

'endOffset' @ [66:98] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'>' @ [67:17] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'countNewLines' @ [67:28] ==> @Contract public open fun countNewLines(@NotNull p0: CharSequence): Int defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'foldRegionText' @ [67:42] ==> val foldRegionText: CharSequence defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[LocalVariableDescriptor]

'descriptors' @ [68:17] ==> value-parameter descriptors: MutableList<FoldingDescriptor> defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[ValueParameterDescriptorImpl]

'add' @ [68:29] ==> public abstract fun add(element: FoldingDescriptor): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'FoldingDescriptor' @ [68:33] ==> public constructor FoldingDescriptor(@NotNull p0: ASTNode, @NotNull p1: TextRange) defined in com.intellij.lang.folding.FoldingDescriptor[JavaClassConstructorDescriptor]

'node' @ [68:51] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[ValueParameterDescriptorImpl]

'textRange' @ [68:57] ==> val textRange: TextRange defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[LocalVariableDescriptor]

'node' @ [72:21] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[ValueParameterDescriptorImpl]

'firstChildNode' @ [72:26] ==> public final val ASTNode.firstChildNode: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'child' @ [73:16] ==> var child: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[LocalVariableDescriptor]

'appendDescriptors' @ [74:13] ==> private final fun appendDescriptors(node: ASTNode, document: Document, descriptors: MutableList<FoldingDescriptor>): Unit defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder[SimpleFunctionDescriptorImpl]

'child' @ [74:31] ==> var child: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[LocalVariableDescriptor]

'document' @ [74:38] ==> value-parameter document: Document defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[ValueParameterDescriptorImpl]

'descriptors' @ [74:48] ==> value-parameter descriptors: MutableList<FoldingDescriptor> defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[ValueParameterDescriptorImpl]

'child' @ [75:13] ==> var child: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[LocalVariableDescriptor]

'child' @ [75:21] ==> var child: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.appendDescriptors[LocalVariableDescriptor]

'treeNext' @ [75:27] ==> public final val ASTNode.treeNext: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'node' @ [80:20] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.needFolding[ValueParameterDescriptorImpl]

'elementType' @ [80:25] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'node' @ [81:26] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.needFolding[ValueParameterDescriptorImpl]

'treeParent' @ [81:31] ==> public final val ASTNode.treeParent: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [81:43] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'type' @ [82:16] ==> val type: IElementType defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.needFolding[LocalVariableDescriptor]

'FUNCTION_LITERAL' @ [82:36] ==> public final val FUNCTION_LITERAL: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'type' @ [83:17] ==> val type: IElementType defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.needFolding[LocalVariableDescriptor]

'BLOCK' @ [83:37] ==> public final val BLOCK: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'parentType' @ [83:46] ==> val parentType: IElementType? defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.needFolding[LocalVariableDescriptor]

'FUNCTION_LITERAL' @ [83:72] ==> public final val FUNCTION_LITERAL: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'type' @ [84:16] ==> val type: IElementType defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.needFolding[LocalVariableDescriptor]

'CLASS_BODY' @ [84:36] ==> public final val CLASS_BODY: (IElementType..IElementType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'type' @ [84:50] ==> val type: IElementType defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.needFolding[LocalVariableDescriptor]

'BLOCK_COMMENT' @ [84:67] ==> public final val BLOCK_COMMENT: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'type' @ [84:84] ==> val type: IElementType defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.needFolding[LocalVariableDescriptor]

'KDOC' @ [84:103] ==> public final val KDOC: (ILazyParseableElementType..ILazyParseableElementType?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'type' @ [85:16] ==> val type: IElementType defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.needFolding[LocalVariableDescriptor]

'STRING_TEMPLATE' @ [85:36] ==> public final val STRING_TEMPLATE: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'node' @ [89:13] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getRangeToFold[ValueParameterDescriptorImpl]

'elementType' @ [89:18] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'FUNCTION_LITERAL' @ [89:45] ==> public final val FUNCTION_LITERAL: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'node' @ [90:23] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getRangeToFold[ValueParameterDescriptorImpl]

'psi' @ [90:28] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'psi' @ [91:26] ==> val psi: KtFunctionLiteral? defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getRangeToFold[LocalVariableDescriptor]

'lBrace' @ [91:31] ==> public final val KtFunctionLiteral.lBrace: PsiElement[MyPropertyDescriptor]

'psi' @ [92:26] ==> val psi: KtFunctionLiteral? defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getRangeToFold[LocalVariableDescriptor]

'rBrace' @ [92:31] ==> public final val KtFunctionLiteral.rBrace: PsiElement?[MyPropertyDescriptor]

'lbrace' @ [93:17] ==> val lbrace: PsiElement? defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getRangeToFold[LocalVariableDescriptor]

'rbrace' @ [93:35] ==> val rbrace: PsiElement? defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getRangeToFold[LocalVariableDescriptor]

'TextRange' @ [94:24] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'lbrace' @ [94:34] ==> val lbrace: PsiElement? defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getRangeToFold[LocalVariableDescriptor]

'startOffset' @ [94:41] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'rbrace' @ [94:54] ==> val rbrace: PsiElement? defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getRangeToFold[LocalVariableDescriptor]

'endOffset' @ [94:61] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'node' @ [97:16] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getRangeToFold[ValueParameterDescriptorImpl]

'textRange' @ [97:21] ==> public final val ASTNode.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'when {
        node.elementType == KtTokens.BLOCK_COMMENT -> "/${getFirstLineOfComment(node)}.../"
        node.elementType == KDocTokens.KDOC -> "/**${getFirstLineOfComment(node)}...*/"
        node.elementType == KtNodeTypes.STRING_TEMPLATE -> "\"\"\"${getFirstLineOfString(node)}...\"\"\""
        node.psi is KtImportList -> "..."
        else ->  "{...}"
    }' @ [100:88] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'node' @ [101:9] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getLanguagePlaceholderText[ValueParameterDescriptorImpl]

'elementType' @ [101:14] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'BLOCK_COMMENT' @ [101:38] ==> public final val BLOCK_COMMENT: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'getFirstLineOfComment' @ [101:59] ==> private final fun getFirstLineOfComment(node: ASTNode): String defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder[SimpleFunctionDescriptorImpl]

'node' @ [101:81] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getLanguagePlaceholderText[ValueParameterDescriptorImpl]

'node' @ [102:9] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getLanguagePlaceholderText[ValueParameterDescriptorImpl]

'elementType' @ [102:14] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'KDOC' @ [102:40] ==> public final val KDOC: (ILazyParseableElementType..ILazyParseableElementType?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'getFirstLineOfComment' @ [102:54] ==> private final fun getFirstLineOfComment(node: ASTNode): String defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder[SimpleFunctionDescriptorImpl]

'node' @ [102:76] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getLanguagePlaceholderText[ValueParameterDescriptorImpl]

'node' @ [103:9] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getLanguagePlaceholderText[ValueParameterDescriptorImpl]

'elementType' @ [103:14] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'STRING_TEMPLATE' @ [103:41] ==> public final val STRING_TEMPLATE: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'getFirstLineOfString' @ [103:69] ==> private final fun getFirstLineOfString(node: ASTNode): String defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder[SimpleFunctionDescriptorImpl]

'node' @ [103:90] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getLanguagePlaceholderText[ValueParameterDescriptorImpl]

'node' @ [104:9] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getLanguagePlaceholderText[ValueParameterDescriptorImpl]

'psi' @ [104:14] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'node' @ [109:32] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getFirstLineOfString[ValueParameterDescriptorImpl]

'text' @ [109:37] ==> public final val ASTNode.text: String[MyPropertyDescriptor]

'split' @ [109:42] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [109:54] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [109:67] ==> public fun <T, R> Sequence<String>.map(transform: (String) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [110:13] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getFirstLineOfString.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [110:16] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [111:11] ==> public inline fun <T> Sequence<String>.firstOrNull(predicate: (String) -> Boolean): String? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [111:23] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'isNotBlank' @ [111:31] ==> @InlineOnly public inline fun CharSequence.isNotBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'targetStringLine' @ [112:20] ==> val targetStringLine: String defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getFirstLineOfString[LocalVariableDescriptor]

'replace' @ [112:37] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [112:59] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'node' @ [116:33] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getFirstLineOfComment[ValueParameterDescriptorImpl]

'text' @ [116:38] ==> public final val ASTNode.text: String[MyPropertyDescriptor]

'split' @ [116:43] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [116:55] ==> public inline fun <T> Iterable<String>.firstOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getCommentContents' @ [117:13] ==> private final fun getCommentContents(line: String): String defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder[SimpleFunctionDescriptorImpl]

'it' @ [117:32] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getFirstLineOfComment.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [117:36] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getCommentContents' @ [119:20] ==> private final fun getCommentContents(line: String): String defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder[SimpleFunctionDescriptorImpl]

'targetCommentLine' @ [119:39] ==> val targetCommentLine: String defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getFirstLineOfComment[LocalVariableDescriptor]

'line' @ [123:16] ==> value-parameter line: String defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.getCommentContents[ValueParameterDescriptorImpl]

'trim' @ [123:21] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [124:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [125:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [126:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [127:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [128:18] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [132:48] ==> public open fun getInstance(): (JavaCodeFoldingSettings..JavaCodeFoldingSettings?) defined in com.intellij.codeInsight.folding.JavaCodeFoldingSettings[JavaMethodDescriptor]

'node' @ [134:13] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isRegionCollapsedByDefault[ValueParameterDescriptorImpl]

'psi' @ [134:18] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'settings' @ [135:20] ==> val settings: (JavaCodeFoldingSettings..JavaCodeFoldingSettings?) defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isRegionCollapsedByDefault[LocalVariableDescriptor]

'isCollapseImports' @ [135:29] ==> public final var JavaCodeFoldingSettings.isCollapseImports: Boolean[MyPropertyDescriptor]

'node' @ [138:20] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isRegionCollapsedByDefault[ValueParameterDescriptorImpl]

'elementType' @ [138:25] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'type' @ [139:13] ==> val type: IElementType defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isRegionCollapsedByDefault[LocalVariableDescriptor]

'BLOCK_COMMENT' @ [139:30] ==> public final val BLOCK_COMMENT: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'type' @ [139:47] ==> val type: IElementType defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isRegionCollapsedByDefault[LocalVariableDescriptor]

'KDOC' @ [139:66] ==> public final val KDOC: (ILazyParseableElementType..ILazyParseableElementType?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'isFirstElementInFile' @ [140:17] ==> private final fun isFirstElementInFile(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder[SimpleFunctionDescriptorImpl]

'node' @ [140:38] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isRegionCollapsedByDefault[ValueParameterDescriptorImpl]

'psi' @ [140:43] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'settings' @ [141:24] ==> val settings: (JavaCodeFoldingSettings..JavaCodeFoldingSettings?) defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isRegionCollapsedByDefault[LocalVariableDescriptor]

'isCollapseFileHeader' @ [141:33] ==> public final var JavaCodeFoldingSettings.isCollapseFileHeader: Boolean[MyPropertyDescriptor]

'node' @ [149:11] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isCustomFoldingRoot[ValueParameterDescriptorImpl]

'elementType' @ [149:16] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'BLOCK' @ [149:43] ==> public final val BLOCK: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'node' @ [149:52] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isCustomFoldingRoot[ValueParameterDescriptorImpl]

'elementType' @ [149:57] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'CLASS_BODY' @ [149:84] ==> public final val CLASS_BODY: (IElementType..IElementType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'element' @ [152:22] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isFirstElementInFile[ValueParameterDescriptorImpl]

'parent' @ [152:30] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [153:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isFirstElementInFile[LocalVariableDescriptor]

'parent' @ [154:38] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isFirstElementInFile[LocalVariableDescriptor]

'allChildren' @ [154:45] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [154:57] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [155:17] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isFirstElementInFile.<anonymous>[ValueParameterDescriptorImpl]

'textLength' @ [155:20] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'it' @ [155:39] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isFirstElementInFile.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [158:20] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isFirstElementInFile[ValueParameterDescriptorImpl]

'firstNonWhiteSpace' @ [158:31] ==> val firstNonWhiteSpace: PsiElement? defined in org.jetbrains.kotlin.idea.KotlinFoldingBuilder.isFirstElementInFile[LocalVariableDescriptor]

