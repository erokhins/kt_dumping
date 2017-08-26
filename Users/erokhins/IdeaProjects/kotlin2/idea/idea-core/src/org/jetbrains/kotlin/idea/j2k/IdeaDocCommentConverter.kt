'buildString' @ [36:20] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendJavadocElements' @ [37:13] ==> private final fun StringBuilder /* = StringBuilder */.appendJavadocElements(elements: Array<PsiElement>): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter[SimpleFunctionDescriptorImpl]

'docComment' @ [37:35] ==> value-parameter docComment: PsiDocComment defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment[ValueParameterDescriptorImpl]

'descriptionElements' @ [37:46] ==> public final val PsiDocComment.descriptionElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'docComment' @ [40:25] ==> value-parameter docComment: PsiDocComment defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment[ValueParameterDescriptorImpl]

'tags' @ [40:36] ==> public final val PsiDocComment.tags: (Array<(PsiDocTag..PsiDocTag?)>..Array<out (PsiDocTag..PsiDocTag?)>)[MyPropertyDescriptor]

'when (tag.name) {
                    "deprecated" -> continue@tagsLoop
                    "see" -> append("@see ${convertJavadocLink(tag.content())}\n")
                    else -> {
                        appendJavadocElements(tag.children)
                        if (!endsWithNewline()) append("\n")
                    }
                }' @ [41:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Any..Any?), entry1: (Any..Any?), entry2: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'tag' @ [41:23] ==> val tag: (PsiDocTag..PsiDocTag?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment.<anonymous>[LocalVariableDescriptor]

'name' @ [41:27] ==> public final var PsiDocTag.name: String[MyPropertyDescriptor]

'append' @ [43:30] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'convertJavadocLink' @ [43:45] ==> private final fun convertJavadocLink(link: String?): String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter[SimpleFunctionDescriptorImpl]

'tag' @ [43:64] ==> val tag: (PsiDocTag..PsiDocTag?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment.<anonymous>[LocalVariableDescriptor]

'content' @ [43:68] ==> public fun PsiDocTag.content(): String defined in org.jetbrains.kotlin.j2k[DeserializedSimpleFunctionDescriptor]

'appendJavadocElements' @ [45:25] ==> private final fun StringBuilder /* = StringBuilder */.appendJavadocElements(elements: Array<PsiElement>): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter[SimpleFunctionDescriptorImpl]

'tag' @ [45:47] ==> val tag: (PsiDocTag..PsiDocTag?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment.<anonymous>[LocalVariableDescriptor]

'children' @ [45:51] ==> public final val PsiDocTag.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'!' @ [46:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'endsWithNewline' @ [46:30] ==> private final fun StringBuilder /* = StringBuilder */.endsWithNewline(): Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter[SimpleFunctionDescriptorImpl]

'append' @ [46:49] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'html' @ [52:13] ==> val html: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment[LocalVariableDescriptor]

'trim' @ [52:18] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isEmpty' @ [52:25] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'docComment' @ [52:38] ==> value-parameter docComment: PsiDocComment defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment[ValueParameterDescriptorImpl]

'findTagByName' @ [52:49] ==> @Nullable public abstract fun findTagByName(@NonNls p0: (String..String?)): PsiDocTag? defined in com.intellij.psi.javadoc.PsiDocComment[JavaMethodDescriptor]

'getInstance' @ [57:39] ==> public open fun getInstance(p0: (Project..Project?)): (PsiFileFactory..PsiFileFactory?) defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'docComment' @ [57:51] ==> value-parameter docComment: PsiDocComment defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment[ValueParameterDescriptorImpl]

'project' @ [57:62] ==> public final val PsiDocComment.project: Project[MyPropertyDescriptor]

'createFileFromText' @ [57:71] ==> @NotNull public abstract fun createFileFromText(@NonNls @NotNull p0: String, @NotNull p1: FileType, @NotNull p2: CharSequence): PsiFile defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'INSTANCE' @ [58:46] ==> public final val INSTANCE: (HtmlFileType..HtmlFileType?) defined in com.intellij.ide.highlighter.HtmlFileType[JavaPropertyDescriptor]

'html' @ [58:56] ==> val html: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment[LocalVariableDescriptor]

'HtmlToMarkdownConverter' @ [59:39] ==> public constructor HtmlToMarkdownConverter() defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[ClassConstructorDescriptorImpl]

'htmlFile' @ [60:9] ==> val htmlFile: PsiFile defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment[LocalVariableDescriptor]

'accept' @ [60:18] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'htmlToMarkdownConverter' @ [60:25] ==> val htmlToMarkdownConverter: IdeaDocCommentConverter.HtmlToMarkdownConverter defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment[LocalVariableDescriptor]

'htmlToMarkdownConverter' @ [61:16] ==> val htmlToMarkdownConverter: IdeaDocCommentConverter.HtmlToMarkdownConverter defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertDocComment[LocalVariableDescriptor]

'result' @ [61:40] ==> public final val result: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'elements' @ [65:9] ==> value-parameter elements: Array<PsiElement> defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.appendJavadocElements[ValueParameterDescriptorImpl]

'forEach' @ [65:18] ==> public inline fun <T> Array<out PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'if (it is PsiInlineDocTag) {
                append(convertInlineDocTag(it))
            }
            else {
                if (it.node?.elementType != JavaDocTokenType.DOC_COMMENT_LEADING_ASTERISKS) {
                    append(it.text)
                }
            }' @ [66:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'it' @ [66:17] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.appendJavadocElements.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [67:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'convertInlineDocTag' @ [67:24] ==> private final fun convertInlineDocTag(tag: PsiInlineDocTag): (String..String?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter[SimpleFunctionDescriptorImpl]

'it' @ [67:44] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.appendJavadocElements.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [70:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.appendJavadocElements.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [70:24] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [70:30] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'DOC_COMMENT_LEADING_ASTERISKS' @ [70:62] ==> public final val DOC_COMMENT_LEADING_ASTERISKS: (IElementType..IElementType?) defined in com.intellij.psi.JavaDocTokenType[JavaPropertyDescriptor]

'append' @ [71:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [71:28] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.appendJavadocElements.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [71:31] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'this' @ [75:16] ==> <this> defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.appendJavadocElements[ReceiverParameterDescriptorImpl]

'length' @ [82:19] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'get' @ [83:21] ==> public open fun get(p0: Int): Char defined in java.lang.StringBuilder[JavaMethodDescriptor]

'i' @ [83:25] ==> val i: Int defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.endsWithNewline[LocalVariableDescriptor]

'if (c.isWhitespace()) {
                if (c == '\n' || c == '\r') return true
            } else {
                return false
            }' @ [84:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'c' @ [84:17] ==> val c: Char defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.endsWithNewline[LocalVariableDescriptor]

'isWhitespace' @ [84:19] ==> public fun Char.isWhitespace(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'c' @ [85:21] ==> val c: Char defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.endsWithNewline[LocalVariableDescriptor]

'c' @ [85:34] ==> val c: Char defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.endsWithNewline[LocalVariableDescriptor]

'when (tag.name) {
        "code", "literal" -> {
            val text = tag.dataElements.joinToString("") { it.text }
            val escaped = StringUtil.escapeXml(text.trimStart())
            if (tag.name == "code") "<code>$escaped</code>" else escaped
        }

        "link", "linkplain" -> {
            val valueElement = tag.linkElement()
            val labelText = tag.dataElements.firstOrNull { it is PsiDocToken }?.text ?: ""
            val kdocLink = convertJavadocLink(valueElement?.text)
            val linkText = if (labelText.isEmpty()) kdocLink else StringUtil.escapeXml(labelText)
            "<a docref=\"$kdocLink\">$linkText</a>"
        }

        else -> tag.text
    }' @ [94:61] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (String..String?), entry1: (String..String?), entry2: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'tag' @ [94:67] ==> value-parameter tag: PsiInlineDocTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[ValueParameterDescriptorImpl]

'name' @ [94:71] ==> public final var PsiInlineDocTag.name: String[MyPropertyDescriptor]

'tag' @ [96:24] ==> value-parameter tag: PsiInlineDocTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[ValueParameterDescriptorImpl]

'dataElements' @ [96:28] ==> public final val PsiInlineDocTag.dataElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'joinToString' @ [96:41] ==> public fun <T> Array<out (PsiElement..PsiElement?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((PsiElement..PsiElement?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [96:60] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [96:63] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'escapeXml' @ [97:38] ==> @Contract public open fun escapeXml(@Nullable p0: String?): (String..String?) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [97:48] ==> val text: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[LocalVariableDescriptor]

'trimStart' @ [97:53] ==> @InlineOnly public inline fun String.trimStart(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (tag.name == "code") "<code>$escaped</code>" else escaped' @ [98:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'tag' @ [98:17] ==> value-parameter tag: PsiInlineDocTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[ValueParameterDescriptorImpl]

'name' @ [98:21] ==> public final var PsiInlineDocTag.name: String[MyPropertyDescriptor]

'escaped' @ [98:45] ==> val escaped: (String..String?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[LocalVariableDescriptor]

'escaped' @ [98:66] ==> val escaped: (String..String?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[LocalVariableDescriptor]

'tag' @ [102:32] ==> value-parameter tag: PsiInlineDocTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[ValueParameterDescriptorImpl]

'linkElement' @ [102:36] ==> private final fun PsiDocTag.linkElement(): PsiElement? defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter[SimpleFunctionDescriptorImpl]

'tag' @ [103:29] ==> value-parameter tag: PsiInlineDocTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[ValueParameterDescriptorImpl]

'dataElements' @ [103:33] ==> public final val PsiInlineDocTag.dataElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [103:46] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.firstOrNull(predicate: ((PsiElement..PsiElement?)) -> Boolean): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [103:60] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [103:81] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'convertJavadocLink' @ [104:28] ==> private final fun convertJavadocLink(link: String?): String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter[SimpleFunctionDescriptorImpl]

'valueElement' @ [104:47] ==> val valueElement: PsiElement? defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[LocalVariableDescriptor]

'text' @ [104:61] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'if (labelText.isEmpty()) kdocLink else StringUtil.escapeXml(labelText)' @ [105:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'labelText' @ [105:32] ==> val labelText: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[LocalVariableDescriptor]

'isEmpty' @ [105:42] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'kdocLink' @ [105:53] ==> val kdocLink: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[LocalVariableDescriptor]

'escapeXml' @ [105:78] ==> @Contract public open fun escapeXml(@Nullable p0: String?): (String..String?) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'labelText' @ [105:88] ==> val labelText: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[LocalVariableDescriptor]

'kdocLink' @ [106:27] ==> val kdocLink: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[LocalVariableDescriptor]

'linkText' @ [106:39] ==> val linkText: (String..String?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[LocalVariableDescriptor]

'tag' @ [109:17] ==> value-parameter tag: PsiInlineDocTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertInlineDocTag[ValueParameterDescriptorImpl]

'text' @ [109:21] ==> public final val PsiInlineDocTag.text: (String..String?)[MyPropertyDescriptor]

'if (link != null) link.substringBefore('(').replace('#', '.') else ""' @ [113:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'link' @ [113:17] ==> value-parameter link: String? defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertJavadocLink[ValueParameterDescriptorImpl]

'link' @ [113:31] ==> value-parameter link: String? defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.convertJavadocLink[ValueParameterDescriptorImpl]

'substringBefore' @ [113:36] ==> public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [113:57] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'valueElement' @ [116:13] ==> public final val PsiDocTag.valueElement: PsiDocTagValue?[MyPropertyDescriptor]

'dataElements' @ [116:29] ==> public final val PsiDocTag.dataElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [116:42] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.firstOrNull(predicate: ((PsiElement..PsiElement?)) -> Boolean): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [116:56] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.linkElement.<anonymous>[ValueParameterDescriptorImpl]

'if (attributes.isNotEmpty())
                attributes.joinToString(separator = " ", prefix = " ") { it.text }
            else
                ""' @ [119:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'attributes' @ [119:17] ==> public final val XmlTag.attributes: (Array<(XmlAttribute..XmlAttribute?)>..Array<out (XmlAttribute..XmlAttribute?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [119:28] ==> @InlineOnly public inline fun <T> Array<out (XmlAttribute..XmlAttribute?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.xml.XmlAttribute..com.intellij.psi.xml.XmlAttribute?)

'attributes' @ [120:17] ==> public final val XmlTag.attributes: (Array<(XmlAttribute..XmlAttribute?)>..Array<out (XmlAttribute..XmlAttribute?)>)[MyPropertyDescriptor]

'joinToString' @ [120:28] ==> public fun <T> Array<out (XmlAttribute..XmlAttribute?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((XmlAttribute..XmlAttribute?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.xml.XmlAttribute..com.intellij.psi.xml.XmlAttribute?)

'it' @ [120:74] ==> value-parameter it: (XmlAttribute..XmlAttribute?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.attributesAsString.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [120:77] ==> public final val XmlAttribute.text: (String..String?)[MyPropertyDescriptor]

'XmlRecursiveElementVisitor' @ [124:47] ==> public constructor XmlRecursiveElementVisitor() defined in com.intellij.psi.XmlRecursiveElementVisitor[JavaClassConstructorDescriptor]

'MarkdownSpan' @ [128:29] ==> public constructor MarkdownSpan(prefix: String, suffix: String) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[ClassConstructorDescriptorImpl]

'MarkdownSpan' @ [130:42] ==> public constructor MarkdownSpan(prefix: String, suffix: String) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[ClassConstructorDescriptorImpl]

'text' @ [130:55] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion.wrap[ValueParameterDescriptorImpl]

'text' @ [130:61] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion.wrap[ValueParameterDescriptorImpl]

'MarkdownSpan' @ [131:44] ==> public constructor MarkdownSpan(prefix: String, suffix: String) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[ClassConstructorDescriptorImpl]

'text' @ [131:57] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion.prefix[ValueParameterDescriptorImpl]

'MarkdownSpan' @ [134:25] ==> public constructor MarkdownSpan(prefix: String, suffix: String) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[ClassConstructorDescriptorImpl]

'tag' @ [134:42] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion.preserveTag[ValueParameterDescriptorImpl]

'name' @ [134:46] ==> public final var XmlTag.name: String[MyPropertyDescriptor]

'tag' @ [134:53] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion.preserveTag[ValueParameterDescriptorImpl]

'attributesAsString' @ [134:57] ==> private final fun XmlTag.attributesAsString(): String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter[SimpleFunctionDescriptorImpl]

'tag' @ [134:87] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion.preserveTag[ValueParameterDescriptorImpl]

'name' @ [134:91] ==> public final var XmlTag.name: String[MyPropertyDescriptor]

'markdownBuilder' @ [140:21] ==> private final val markdownBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'toString' @ [140:37] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'StringBuilder' @ [142:39] ==> public final fun <init>(p0: (String..String?)): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'Unordered' @ [145:48] ==> enum entry Unordered defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.ListType[FakeCallableDescriptorForObject]

'super' @ [148:13] ==> <this> defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[LazyClassReceiverParameterDescriptor]

'visitWhiteSpace' @ [148:19] ==> public open fun visitWhiteSpace(p0: (PsiWhiteSpace..PsiWhiteSpace?)): Unit defined in com.intellij.psi.XmlRecursiveElementVisitor[JavaMethodDescriptor]

'space' @ [148:35] ==> value-parameter space: PsiWhiteSpace defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitWhiteSpace[ValueParameterDescriptorImpl]

'whitespaceIsPartOfText' @ [150:17] ==> private final var whitespaceIsPartOfText: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'appendPendingText' @ [151:17] ==> private final fun appendPendingText(): Unit defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[SimpleFunctionDescriptorImpl]

'space' @ [152:29] ==> value-parameter space: PsiWhiteSpace defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitWhiteSpace[ValueParameterDescriptorImpl]

'text' @ [152:35] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'lines' @ [152:40] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (lines.size == 1) {
                    markdownBuilder.append(space.text)
                } else {
                    //several lines of spaces:
                    //drop first line - it contains trailing spaces before the first new-line;
                    //do not add star for the last line, it is handled by appendPendingText()
                    //and it is not needed in the end of the comment
                    lines.drop(1).dropLast(1).forEach {
                        markdownBuilder.append("\n * ")
                    }
                    markdownBuilder.append("\n")
                    afterLineBreak = true
                }' @ [153:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'lines' @ [153:21] ==> val lines: List<String> defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitWhiteSpace[LocalVariableDescriptor]

'size' @ [153:27] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'markdownBuilder' @ [154:21] ==> private final val markdownBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'append' @ [154:37] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'space' @ [154:44] ==> value-parameter space: PsiWhiteSpace defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitWhiteSpace[ValueParameterDescriptorImpl]

'text' @ [154:50] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'lines' @ [160:21] ==> val lines: List<String> defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitWhiteSpace[LocalVariableDescriptor]

'drop' @ [160:27] ==> public fun <T> Iterable<String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'dropLast' @ [160:35] ==> public fun <T> List<String>.dropLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'forEach' @ [160:47] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'markdownBuilder' @ [161:25] ==> private final val markdownBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'append' @ [161:41] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'markdownBuilder' @ [163:21] ==> private final val markdownBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'append' @ [163:37] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'afterLineBreak' @ [164:21] ==> private final var afterLineBreak: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'super' @ [170:13] ==> <this> defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[LazyClassReceiverParameterDescriptor]

'visitElement' @ [170:19] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.XmlRecursiveElementVisitor[JavaMethodDescriptor]

'element' @ [170:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitElement[ValueParameterDescriptorImpl]

'element' @ [172:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitElement[ValueParameterDescriptorImpl]

'node' @ [172:37] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [172:42] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'when (tokenType) {
                XmlTokenType.XML_DATA_CHARACTERS -> {
                    appendPendingText()
                    markdownBuilder.append(element.text)
                }
                XmlTokenType.XML_CHAR_ENTITY_REF -> {
                    appendPendingText()
                    val grandParent = element.parent.parent
                    if (grandParent is HtmlTag && (grandParent.name == "code" || grandParent.name == "literal"))
                        markdownBuilder.append(StringUtil.unescapeXml(element.text))
                    else
                        markdownBuilder.append(element.text)
                }
            }' @ [174:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (StringBuilder..StringBuilder?), entry1: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'tokenType' @ [174:19] ==> val tokenType: IElementType defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitElement[LocalVariableDescriptor]

'XML_DATA_CHARACTERS' @ [175:30] ==> public final val XML_DATA_CHARACTERS: (IElementType..IElementType?) defined in com.intellij.psi.xml.XmlTokenType[JavaPropertyDescriptor]

'appendPendingText' @ [176:21] ==> private final fun appendPendingText(): Unit defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[SimpleFunctionDescriptorImpl]

'markdownBuilder' @ [177:21] ==> private final val markdownBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'append' @ [177:37] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'element' @ [177:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitElement[ValueParameterDescriptorImpl]

'text' @ [177:52] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'XML_CHAR_ENTITY_REF' @ [179:30] ==> public final val XML_CHAR_ENTITY_REF: (IElementType..IElementType?) defined in com.intellij.psi.xml.XmlTokenType[JavaPropertyDescriptor]

'appendPendingText' @ [180:21] ==> private final fun appendPendingText(): Unit defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[SimpleFunctionDescriptorImpl]

'element' @ [181:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitElement[ValueParameterDescriptorImpl]

'parent' @ [181:47] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [181:54] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (grandParent is HtmlTag && (grandParent.name == "code" || grandParent.name == "literal"))
                        markdownBuilder.append(StringUtil.unescapeXml(element.text))
                    else
                        markdownBuilder.append(element.text)' @ [182:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'grandParent' @ [182:25] ==> val grandParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitElement[LocalVariableDescriptor]

'grandParent' @ [182:52] ==> val grandParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitElement[LocalVariableDescriptor]

'name' @ [182:64] ==> public final var HtmlTag.name: String[MyPropertyDescriptor]

'grandParent' @ [182:82] ==> val grandParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitElement[LocalVariableDescriptor]

'name' @ [182:94] ==> public final var HtmlTag.name: String[MyPropertyDescriptor]

'markdownBuilder' @ [183:25] ==> private final val markdownBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'append' @ [183:41] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'unescapeXml' @ [183:59] ==> @Contract public open fun unescapeXml(@Nullable p0: String?): (String..String?) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'element' @ [183:71] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitElement[ValueParameterDescriptorImpl]

'text' @ [183:79] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'markdownBuilder' @ [185:25] ==> private final val markdownBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'append' @ [185:41] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'element' @ [185:48] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitElement[ValueParameterDescriptorImpl]

'text' @ [185:56] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'withWhitespaceAsPartOfText' @ [192:13] ==> private final inline fun withWhitespaceAsPartOfText(newValue: Boolean, block: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[SimpleFunctionDescriptorImpl]

'currentListType' @ [193:35] ==> private final var currentListType: IdeaDocCommentConverter.HtmlToMarkdownConverter.ListType defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'afterLineBreak' @ [194:35] ==> private final var afterLineBreak: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'appendPendingText' @ [195:17] ==> private final fun appendPendingText(): Unit defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[SimpleFunctionDescriptorImpl]

'component1' @ [196:22] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[SimpleFunctionDescriptorImpl]

'component2' @ [196:39] ==> public final operator fun component2(): String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[SimpleFunctionDescriptorImpl]

'getMarkdownForTag' @ [196:58] ==> private final fun getMarkdownForTag(tag: XmlTag, atLineStart: Boolean): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[SimpleFunctionDescriptorImpl]

'tag' @ [196:76] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitXmlTag[ValueParameterDescriptorImpl]

'atLineStart' @ [196:81] ==> val atLineStart: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitXmlTag.<anonymous>[LocalVariableDescriptor]

'markdownBuilder' @ [197:17] ==> private final val markdownBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'append' @ [197:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'openingMarkdown' @ [197:40] ==> val openingMarkdown: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitXmlTag.<anonymous>[LocalVariableDescriptor]

'super' @ [199:17] ==> <this> defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[LazyClassReceiverParameterDescriptor]

'visitXmlTag' @ [199:23] ==> public open fun visitXmlTag(p0: (XmlTag..XmlTag?)): Unit defined in com.intellij.psi.XmlRecursiveElementVisitor[JavaMethodDescriptor]

'tag' @ [199:35] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitXmlTag[ValueParameterDescriptorImpl]

'markdownBuilder' @ [202:17] ==> private final val markdownBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'append' @ [202:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'closingMarkdown' @ [202:40] ==> val closingMarkdown: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitXmlTag.<anonymous>[LocalVariableDescriptor]

'currentListType' @ [203:17] ==> private final var currentListType: IdeaDocCommentConverter.HtmlToMarkdownConverter.ListType defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'oldListType' @ [203:35] ==> val oldListType: IdeaDocCommentConverter.HtmlToMarkdownConverter.ListType defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitXmlTag.<anonymous>[LocalVariableDescriptor]

'withWhitespaceAsPartOfText' @ [208:13] ==> private final inline fun withWhitespaceAsPartOfText(newValue: Boolean, block: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[SimpleFunctionDescriptorImpl]

'super' @ [209:17] ==> <this> defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[LazyClassReceiverParameterDescriptor]

'visitXmlText' @ [209:23] ==> public open fun visitXmlText(p0: (XmlText..XmlText?)): Unit defined in com.intellij.psi.XmlRecursiveElementVisitor[JavaMethodDescriptor]

'text' @ [209:36] ==> value-parameter text: XmlText defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitXmlText[ValueParameterDescriptorImpl]

'whitespaceIsPartOfText' @ [214:28] ==> private final var whitespaceIsPartOfText: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'whitespaceIsPartOfText' @ [215:13] ==> private final var whitespaceIsPartOfText: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'newValue' @ [215:38] ==> value-parameter newValue: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.withWhitespaceAsPartOfText[ValueParameterDescriptorImpl]

'invoke' @ [217:17] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'whitespaceIsPartOfText' @ [220:17] ==> private final var whitespaceIsPartOfText: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'oldValue' @ [220:42] ==> val oldValue: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.withWhitespaceAsPartOfText[LocalVariableDescriptor]

'when (tag.name) {
            "b", "strong" -> MarkdownSpan.wrap("**")

            "p" -> if (atLineStart) MarkdownSpan.prefix("\n * ") else MarkdownSpan.prefix("\n *\n *")

            "i", "em" -> MarkdownSpan.wrap("*")

            "s", "del" -> MarkdownSpan.wrap("~~")

            "code" -> {
                val innerText = tag.value.text.trim()
                if (innerText.startsWith('`') && innerText.endsWith('`'))
                    MarkdownSpan("`` ", " ``")
                else
                    MarkdownSpan.wrap("`")
            }

            "a" -> {
                if (tag.getAttributeValue("docref") != null) {
                    val docRef = tag.getAttributeValue("docref")
                    val innerText = tag.value.text
                    if (docRef == innerText) MarkdownSpan("[", "]") else MarkdownSpan("[", "][$docRef]")
                }
                else if (tag.getAttributeValue("href") != null) {
                    MarkdownSpan("[", "](${tag.getAttributeValue("href") ?: ""})")
                }
                else {
                    MarkdownSpan.preserveTag(tag)
                }
            }

            "ul" -> {
                currentListType = ListType.Unordered; MarkdownSpan.Empty
            }

            "ol" -> {
                currentListType = ListType.Ordered; MarkdownSpan.Empty
            }

            "li" -> if (currentListType == ListType.Unordered) MarkdownSpan.prefix(" * ") else MarkdownSpan.prefix(" 1. ")

            else -> MarkdownSpan.preserveTag(tag)
        }' @ [224:90] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, entry1: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, entry2: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, entry3: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, entry4: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, entry5: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, entry6: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, entry7: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, entry8: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, entry9: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MarkdownSpan

'tag' @ [224:96] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[ValueParameterDescriptorImpl]

'name' @ [224:100] ==> public final var XmlTag.name: String[MyPropertyDescriptor]

'wrap' @ [225:43] ==> public final fun wrap(text: String): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[SimpleFunctionDescriptorImpl]

'if (atLineStart) MarkdownSpan.prefix("\n * ") else MarkdownSpan.prefix("\n *\n *")' @ [227:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, elseBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MarkdownSpan

'atLineStart' @ [227:24] ==> value-parameter atLineStart: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[ValueParameterDescriptorImpl]

'prefix' @ [227:50] ==> public final fun prefix(text: String): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[SimpleFunctionDescriptorImpl]

'prefix' @ [227:84] ==> public final fun prefix(text: String): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[SimpleFunctionDescriptorImpl]

'wrap' @ [229:39] ==> public final fun wrap(text: String): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[SimpleFunctionDescriptorImpl]

'wrap' @ [231:40] ==> public final fun wrap(text: String): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[SimpleFunctionDescriptorImpl]

'tag' @ [234:33] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[ValueParameterDescriptorImpl]

'value' @ [234:37] ==> public final val XmlTag.value: XmlTagValue[MyPropertyDescriptor]

'text' @ [234:43] ==> public final var XmlTagValue.text: String[MyPropertyDescriptor]

'trim' @ [234:48] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (innerText.startsWith('`') && innerText.endsWith('`'))
                    MarkdownSpan("`` ", " ``")
                else
                    MarkdownSpan.wrap("`")' @ [235:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, elseBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MarkdownSpan

'innerText' @ [235:21] ==> val innerText: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[LocalVariableDescriptor]

'startsWith' @ [235:31] ==> public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'innerText' @ [235:50] ==> val innerText: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[LocalVariableDescriptor]

'endsWith' @ [235:60] ==> public fun CharSequence.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'MarkdownSpan' @ [236:21] ==> public constructor MarkdownSpan(prefix: String, suffix: String) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[ClassConstructorDescriptorImpl]

'wrap' @ [238:34] ==> public final fun wrap(text: String): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[SimpleFunctionDescriptorImpl]

'if (tag.getAttributeValue("docref") != null) {
                    val docRef = tag.getAttributeValue("docref")
                    val innerText = tag.value.text
                    if (docRef == innerText) MarkdownSpan("[", "]") else MarkdownSpan("[", "][$docRef]")
                }
                else if (tag.getAttributeValue("href") != null) {
                    MarkdownSpan("[", "](${tag.getAttributeValue("href") ?: ""})")
                }
                else {
                    MarkdownSpan.preserveTag(tag)
                }' @ [242:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, elseBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MarkdownSpan

'tag' @ [242:21] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[ValueParameterDescriptorImpl]

'getAttributeValue' @ [242:25] ==> @Nullable public abstract fun getAttributeValue(@NonNls p0: (String..String?)): String? defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'tag' @ [243:34] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[ValueParameterDescriptorImpl]

'getAttributeValue' @ [243:38] ==> @Nullable public abstract fun getAttributeValue(@NonNls p0: (String..String?)): String? defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'tag' @ [244:37] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[ValueParameterDescriptorImpl]

'value' @ [244:41] ==> public final val XmlTag.value: XmlTagValue[MyPropertyDescriptor]

'text' @ [244:47] ==> public final var XmlTagValue.text: String[MyPropertyDescriptor]

'if (docRef == innerText) MarkdownSpan("[", "]") else MarkdownSpan("[", "][$docRef]")' @ [245:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, elseBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MarkdownSpan

'docRef' @ [245:25] ==> val docRef: String? defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[LocalVariableDescriptor]

'innerText' @ [245:35] ==> val innerText: String defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[LocalVariableDescriptor]

'MarkdownSpan' @ [245:46] ==> public constructor MarkdownSpan(prefix: String, suffix: String) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[ClassConstructorDescriptorImpl]

'MarkdownSpan' @ [245:74] ==> public constructor MarkdownSpan(prefix: String, suffix: String) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[ClassConstructorDescriptorImpl]

'docRef' @ [245:96] ==> val docRef: String? defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[LocalVariableDescriptor]

'if (tag.getAttributeValue("href") != null) {
                    MarkdownSpan("[", "](${tag.getAttributeValue("href") ?: ""})")
                }
                else {
                    MarkdownSpan.preserveTag(tag)
                }' @ [247:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, elseBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MarkdownSpan

'tag' @ [247:26] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[ValueParameterDescriptorImpl]

'getAttributeValue' @ [247:30] ==> @Nullable public abstract fun getAttributeValue(@NonNls p0: (String..String?)): String? defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'MarkdownSpan' @ [248:21] ==> public constructor MarkdownSpan(prefix: String, suffix: String) defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[ClassConstructorDescriptorImpl]

'tag' @ [248:44] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[ValueParameterDescriptorImpl]

'getAttributeValue' @ [248:48] ==> @Nullable public abstract fun getAttributeValue(@NonNls p0: (String..String?)): String? defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'preserveTag' @ [251:34] ==> public final fun preserveTag(tag: XmlTag): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[SimpleFunctionDescriptorImpl]

'tag' @ [251:46] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[ValueParameterDescriptorImpl]

'currentListType' @ [256:17] ==> private final var currentListType: IdeaDocCommentConverter.HtmlToMarkdownConverter.ListType defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'Unordered' @ [256:44] ==> enum entry Unordered defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.ListType[FakeCallableDescriptorForObject]

'Empty' @ [256:68] ==> public final val Empty: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[PropertyDescriptorImpl]

'currentListType' @ [260:17] ==> private final var currentListType: IdeaDocCommentConverter.HtmlToMarkdownConverter.ListType defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'Ordered' @ [260:44] ==> enum entry Ordered defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.ListType[FakeCallableDescriptorForObject]

'Empty' @ [260:66] ==> public final val Empty: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[PropertyDescriptorImpl]

'if (currentListType == ListType.Unordered) MarkdownSpan.prefix(" * ") else MarkdownSpan.prefix(" 1. ")' @ [263:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan, elseBranch: IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MarkdownSpan

'currentListType' @ [263:25] ==> private final var currentListType: IdeaDocCommentConverter.HtmlToMarkdownConverter.ListType defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'Unordered' @ [263:53] ==> enum entry Unordered defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.ListType[FakeCallableDescriptorForObject]

'prefix' @ [263:77] ==> public final fun prefix(text: String): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[SimpleFunctionDescriptorImpl]

'prefix' @ [263:109] ==> public final fun prefix(text: String): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[SimpleFunctionDescriptorImpl]

'preserveTag' @ [265:34] ==> public final fun preserveTag(tag: XmlTag): IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.MarkdownSpan.Companion[SimpleFunctionDescriptorImpl]

'tag' @ [265:46] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.getMarkdownForTag[ValueParameterDescriptorImpl]

'afterLineBreak' @ [269:17] ==> private final var afterLineBreak: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'markdownBuilder' @ [270:17] ==> private final val markdownBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'append' @ [270:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'afterLineBreak' @ [271:17] ==> private final var afterLineBreak: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'super' @ [276:13] ==> <this> defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[LazyClassReceiverParameterDescriptor]

'visitXmlFile' @ [276:19] ==> public open fun visitXmlFile(p0: (XmlFile..XmlFile?)): Unit defined in com.intellij.psi.XmlRecursiveElementVisitor[JavaMethodDescriptor]

'file' @ [276:32] ==> value-parameter file: XmlFile defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter.visitXmlFile[ValueParameterDescriptorImpl]

'markdownBuilder' @ [278:13] ==> private final val markdownBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.j2k.IdeaDocCommentConverter.HtmlToMarkdownConverter[PropertyDescriptorImpl]

'append' @ [278:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

