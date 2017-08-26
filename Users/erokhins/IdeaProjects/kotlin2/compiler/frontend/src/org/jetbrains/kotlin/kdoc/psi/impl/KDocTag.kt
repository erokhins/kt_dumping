'KDocElementImpl' @ [27:37] ==> public constructor KDocElementImpl(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocElementImpl[JavaClassConstructorDescriptor]

'node' @ [27:53] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.<init>[ValueParameterDescriptorImpl]

'findChildByType' @ [36:36] ==> @Nullable protected/*protected and package*/ open fun <T : (PsiElement..PsiElement?)> findChildByType(p0: (IElementType..IElementType?)): PsiElement? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'TAG_NAME' @ [36:63] ==> public final val TAG_NAME: (KDocToken..KDocToken?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'tagName' @ [37:13] ==> val tagName: PsiElement? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getName[LocalVariableDescriptor]

'tagName' @ [38:20] ==> val tagName: PsiElement? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getName[LocalVariableDescriptor]

'text' @ [38:28] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'substring' @ [38:33] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getSubjectLink' @ [47:42] ==> public final fun getSubjectLink(): KDocLink? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[SimpleFunctionDescriptorImpl]

'getLinkText' @ [47:60] ==> public final fun getLinkText(): String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocLink[SimpleFunctionDescriptorImpl]

'childrenAfterTagName' @ [50:24] ==> private final fun childrenAfterTagName(): List<ASTNode> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[SimpleFunctionDescriptorImpl]

'hasSubject' @ [51:13] ==> private final fun hasSubject(contentChildren: List<ASTNode>): Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[SimpleFunctionDescriptorImpl]

'children' @ [51:24] ==> val children: List<ASTNode> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getSubjectLink[LocalVariableDescriptor]

'children' @ [52:20] ==> val children: List<ASTNode> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getSubjectLink[LocalVariableDescriptor]

'firstOrNull' @ [52:29] ==> public fun <T> List<ASTNode>.firstOrNull(): ASTNode? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ASTNode

'psi' @ [52:44] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'name' @ [59:20] ==> public final val KDocTag.name: String?[MyPropertyDescriptor]

'let' @ [59:26] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> KDocKnownTag?): KDocKnownTag? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> KDocKnownTag?

'KDocKnownTag' @ [59:32] ==> public companion object defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'findByTagName' @ [59:45] ==> public final fun findByTagName(tagName: CharSequence): KDocKnownTag? defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag.Companion[SimpleFunctionDescriptorImpl]

'it' @ [59:59] ==> value-parameter it: String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.<get-knownTag>.<anonymous>[ValueParameterDescriptorImpl]

'knownTag' @ [63:13] ==> public final val knownTag: KDocKnownTag? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[PropertyDescriptorImpl]

'isReferenceRequired' @ [63:23] ==> public final val isReferenceRequired: Boolean defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[PropertyDescriptorImpl]

'contentChildren' @ [64:20] ==> value-parameter contentChildren: List<ASTNode> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.hasSubject[ValueParameterDescriptorImpl]

'firstOrNull' @ [64:36] ==> public fun <T> List<ASTNode>.firstOrNull(): ASTNode? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ASTNode

'elementType' @ [64:51] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'MARKDOWN_LINK' @ [64:77] ==> public final val MARKDOWN_LINK: (ILazyParseableElementType..ILazyParseableElementType?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'node' @ [70:13] ==> public final val KDocTag.node: ASTNode[MyPropertyDescriptor]

'getChildren' @ [70:18] ==> @NotNull public abstract fun getChildren(@Nullable p0: TokenSet?): (Array<(ASTNode..ASTNode?)>..Array<out (ASTNode..ASTNode?)>) defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'dropWhile' @ [71:22] ==> public inline fun <T> Array<out (ASTNode..ASTNode?)>.dropWhile(predicate: ((ASTNode..ASTNode?)) -> Boolean): List<(ASTNode..ASTNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.lang.ASTNode..com.intellij.lang.ASTNode?)

'it' @ [71:34] ==> value-parameter it: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.childrenAfterTagName.<anonymous>[ValueParameterDescriptorImpl]

'elementType' @ [71:37] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'TAG_NAME' @ [71:63] ==> public final val TAG_NAME: (KDocToken..KDocToken?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'dropWhile' @ [72:22] ==> public inline fun <T> Iterable<(ASTNode..ASTNode?)>.dropWhile(predicate: ((ASTNode..ASTNode?)) -> Boolean): List<(ASTNode..ASTNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.lang.ASTNode..com.intellij.lang.ASTNode?)

'it' @ [72:34] ==> value-parameter it: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.childrenAfterTagName.<anonymous>[ValueParameterDescriptorImpl]

'elementType' @ [72:37] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'WHITE_SPACE' @ [72:62] ==> public final val WHITE_SPACE: (IElementType..IElementType?) defined in com.intellij.psi.TokenType[JavaPropertyDescriptor]

'StringBuilder' @ [79:23] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'StringBuilder' @ [80:32] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'builder' @ [81:29] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'targetBuilder' @ [87:29] ==> var targetBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'codeBlockBuilder' @ [87:46] ==> val codeBlockBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'targetBuilder' @ [90:13] ==> var targetBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'codeBlockBuilder' @ [90:29] ==> val codeBlockBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'isCodeBlock' @ [94:17] ==> local final fun isCodeBlock(): Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[SimpleFunctionDescriptorImpl]

'builder' @ [95:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'append' @ [95:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'trimCommonIndent' @ [95:32] ==> private final fun trimCommonIndent(builder: StringBuilder /* = StringBuilder */, prepend4WhiteSpaces: Boolean = ...): String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[SimpleFunctionDescriptorImpl]

'codeBlockBuilder' @ [95:49] ==> val codeBlockBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'indentedCodeBlock' @ [95:67] ==> var indentedCodeBlock: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'codeBlockBuilder' @ [96:17] ==> val codeBlockBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'setLength' @ [96:34] ==> public open fun setLength(p0: Int): Unit defined in java.lang.StringBuilder[JavaMethodDescriptor]

'targetBuilder' @ [97:17] ==> var targetBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'builder' @ [97:33] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'childrenAfterTagName' @ [101:24] ==> private final fun childrenAfterTagName(): List<ASTNode> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[SimpleFunctionDescriptorImpl]

'hasSubject' @ [102:13] ==> private final fun hasSubject(contentChildren: List<ASTNode>): Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[SimpleFunctionDescriptorImpl]

'children' @ [102:24] ==> var children: List<ASTNode> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'children' @ [103:13] ==> var children: List<ASTNode> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'children' @ [103:24] ==> var children: List<ASTNode> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'drop' @ [103:33] ==> public fun <T> Iterable<ASTNode>.drop(n: Int): List<ASTNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ASTNode

'children' @ [105:22] ==> var children: List<ASTNode> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'node' @ [106:24] ==> val node: ASTNode defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'elementType' @ [106:29] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'if (type == KDocTokens.CODE_BLOCK_TEXT) {
                //If first line of code block
                if (!isCodeBlock())
                    indentedCodeBlock = indentedCodeBlock || node.text.startsWith(indentationWhiteSpaces) || node.text.startsWith("\t")
                startCodeBlock()
            }
            else if (KDocTokens.CONTENT_TOKENS.contains(type)) {
                flushCodeBlock()
                indentedCodeBlock = false
            }' @ [107:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'type' @ [107:17] ==> val type: IElementType defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'CODE_BLOCK_TEXT' @ [107:36] ==> public final val CODE_BLOCK_TEXT: (KDocToken..KDocToken?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'!' @ [109:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCodeBlock' @ [109:22] ==> local final fun isCodeBlock(): Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[SimpleFunctionDescriptorImpl]

'indentedCodeBlock' @ [110:21] ==> var indentedCodeBlock: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'indentedCodeBlock' @ [110:41] ==> var indentedCodeBlock: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'node' @ [110:62] ==> val node: ASTNode defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'text' @ [110:67] ==> public final val ASTNode.text: String[MyPropertyDescriptor]

'startsWith' @ [110:72] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indentationWhiteSpaces' @ [110:83] ==> public final val indentationWhiteSpaces: String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.Companion[PropertyDescriptorImpl]

'node' @ [110:110] ==> val node: ASTNode defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'text' @ [110:115] ==> public final val ASTNode.text: String[MyPropertyDescriptor]

'startsWith' @ [110:120] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'startCodeBlock' @ [111:17] ==> local final fun startCodeBlock(): Unit defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[SimpleFunctionDescriptorImpl]

'CONTENT_TOKENS' @ [113:33] ==> public final val CONTENT_TOKENS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'contains' @ [113:48] ==> public open operator fun contains(@Nullable p0: IElementType?): Boolean defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'type' @ [113:57] ==> val type: IElementType defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'flushCodeBlock' @ [114:17] ==> local final fun flushCodeBlock(): Unit defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[SimpleFunctionDescriptorImpl]

'indentedCodeBlock' @ [115:17] ==> var indentedCodeBlock: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'CONTENT_TOKENS' @ [118:28] ==> public final val CONTENT_TOKENS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'contains' @ [118:43] ==> public open operator fun contains(@Nullable p0: IElementType?): Boolean defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'type' @ [118:52] ==> val type: IElementType defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'afterAsterisk' @ [119:38] ==> var afterAsterisk: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'!' @ [119:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCodeBlock' @ [119:56] ==> local final fun isCodeBlock(): Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[SimpleFunctionDescriptorImpl]

'!' @ [122:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'contentStarted' @ [122:43] ==> var contentStarted: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'indentedCodeBlock' @ [122:61] ==> var indentedCodeBlock: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'isPlainContent' @ [122:83] ==> val isPlainContent: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'targetBuilder' @ [124:17] ==> var targetBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'append' @ [124:31] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (trimLeadingSpaces) node.text.trimStart() else node.text' @ [124:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'trimLeadingSpaces' @ [124:42] ==> val trimLeadingSpaces: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'node' @ [124:61] ==> val node: ASTNode defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'text' @ [124:66] ==> public final val ASTNode.text: String[MyPropertyDescriptor]

'trimStart' @ [124:71] ==> @InlineOnly public inline fun String.trimStart(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'node' @ [124:88] ==> val node: ASTNode defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'text' @ [124:93] ==> public final val ASTNode.text: String[MyPropertyDescriptor]

'contentStarted' @ [125:17] ==> var contentStarted: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'afterAsterisk' @ [126:17] ==> var afterAsterisk: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'type' @ [128:17] ==> val type: IElementType defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'LEADING_ASTERISK' @ [128:36] ==> public final val LEADING_ASTERISK: (KDocToken..KDocToken?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'afterAsterisk' @ [129:17] ==> var afterAsterisk: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'type' @ [131:17] ==> val type: IElementType defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'WHITE_SPACE' @ [131:35] ==> public final val WHITE_SPACE: (IElementType..IElementType?) defined in com.intellij.psi.TokenType[JavaPropertyDescriptor]

'contentStarted' @ [131:50] ==> var contentStarted: Boolean defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'targetBuilder' @ [132:17] ==> var targetBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'append' @ [132:31] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'repeat' @ [132:43] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'countNewLines' @ [132:61] ==> @Contract public open fun countNewLines(@NotNull p0: CharSequence): Int defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'node' @ [132:75] ==> val node: ASTNode defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'text' @ [132:80] ==> public final val ASTNode.text: String[MyPropertyDescriptor]

'type' @ [134:17] ==> val type: IElementType defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'KDOC_TAG' @ [134:42] ==> public final val KDOC_TAG: (KDocElementType..KDocElementType?) defined in org.jetbrains.kotlin.kdoc.parser.KDocElementTypes[JavaPropertyDescriptor]

'flushCodeBlock' @ [139:9] ==> local final fun flushCodeBlock(): Unit defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[SimpleFunctionDescriptorImpl]

'builder' @ [141:16] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.getContent[LocalVariableDescriptor]

'toString' @ [141:24] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'trimEnd' @ [141:35] ==> public fun String.trimEnd(vararg chars: Char): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'builder' @ [145:21] ==> value-parameter builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent[ValueParameterDescriptorImpl]

'toString' @ [145:29] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'split' @ [145:40] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lines' @ [146:25] ==> val lines: List<String> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent[LocalVariableDescriptor]

'filter' @ [146:31] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [146:40] ==> value-parameter it: String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent.<anonymous>[ValueParameterDescriptorImpl]

'trim' @ [146:43] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isNotEmpty' @ [146:50] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [146:65] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Int

'it' @ [146:71] ==> value-parameter it: String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent.<anonymous>[ValueParameterDescriptorImpl]

'calcIndent' @ [146:74] ==> private final fun String.calcIndent(): Int defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[SimpleFunctionDescriptorImpl]

'min' @ [146:89] ==> public fun <T : Comparable<Int>> Iterable<Int>.min(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'lines' @ [147:30] ==> val lines: List<String> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent[LocalVariableDescriptor]

'map' @ [147:36] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [147:42] ==> value-parameter it: String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent.<anonymous>[ValueParameterDescriptorImpl]

'drop' @ [147:45] ==> public fun String.drop(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'minIndent' @ [147:50] ==> val minIndent: Int defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent[LocalVariableDescriptor]

'prepend4WhiteSpaces' @ [148:13] ==> value-parameter prepend4WhiteSpaces: Boolean = ... defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent[ValueParameterDescriptorImpl]

'processedLines' @ [149:13] ==> var processedLines: List<String> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent[LocalVariableDescriptor]

'processedLines' @ [149:30] ==> var processedLines: List<String> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent[LocalVariableDescriptor]

'map' @ [149:45] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (it.isNotBlank()) it.prependIndent(indentationWhiteSpaces) else it' @ [149:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [149:55] ==> value-parameter it: String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent.<anonymous>[ValueParameterDescriptorImpl]

'isNotBlank' @ [149:58] ==> @InlineOnly public inline fun CharSequence.isNotBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [149:72] ==> value-parameter it: String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent.<anonymous>[ValueParameterDescriptorImpl]

'prependIndent' @ [149:75] ==> public fun String.prependIndent(indent: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indentationWhiteSpaces' @ [149:89] ==> public final val indentationWhiteSpaces: String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.Companion[PropertyDescriptorImpl]

'it' @ [149:118] ==> value-parameter it: String defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent.<anonymous>[ValueParameterDescriptorImpl]

'processedLines' @ [150:16] ==> var processedLines: List<String> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.trimCommonIndent[LocalVariableDescriptor]

'joinToString' @ [150:31] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'indexOfFirst' @ [153:39] ==> public inline fun CharSequence.indexOfFirst(predicate: (Char) -> Boolean): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [153:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [153:55] ==> value-parameter it: Char defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag.calcIndent.<anonymous>[ValueParameterDescriptorImpl]

'isWhitespace' @ [153:58] ==> public fun Char.isWhitespace(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'repeat' @ [156:42] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

