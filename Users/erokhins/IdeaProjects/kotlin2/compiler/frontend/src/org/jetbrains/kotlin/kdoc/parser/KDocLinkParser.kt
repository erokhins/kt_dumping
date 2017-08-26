'JvmStatic' @ [32:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'chameleon' @ [33:33] ==> value-parameter chameleon: ASTNode defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.Companion.parseMarkdownLink[ValueParameterDescriptorImpl]

'treeParent' @ [33:43] ==> public final val ASTNode.treeParent: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'psi' @ [33:54] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parentElement' @ [34:27] ==> val parentElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.Companion.parseMarkdownLink[LocalVariableDescriptor]

'project' @ [34:41] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getInstance' @ [35:45] ==> public open fun getInstance(): (PsiBuilderFactory..PsiBuilderFactory?) defined in com.intellij.lang.PsiBuilderFactory[JavaMethodDescriptor]

'createBuilder' @ [35:59] ==> @NotNull public abstract fun createBuilder(@NotNull p0: Project, @NotNull p1: ASTNode, @Nullable p2: Lexer?, @NotNull p3: Language, @NotNull p4: CharSequence): PsiBuilder defined in com.intellij.lang.PsiBuilderFactory[JavaMethodDescriptor]

'project' @ [35:73] ==> val project: Project defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.Companion.parseMarkdownLink[LocalVariableDescriptor]

'chameleon' @ [36:73] ==> value-parameter chameleon: ASTNode defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.Companion.parseMarkdownLink[ValueParameterDescriptorImpl]

'KotlinLexer' @ [37:73] ==> public constructor KotlinLexer() defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaClassConstructorDescriptor]

'root' @ [38:73] ==> value-parameter root: IElementType defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.Companion.parseMarkdownLink[ValueParameterDescriptorImpl]

'language' @ [38:78] ==> public final val IElementType.language: Language[MyPropertyDescriptor]

'chameleon' @ [39:73] ==> value-parameter chameleon: ASTNode defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.Companion.parseMarkdownLink[ValueParameterDescriptorImpl]

'text' @ [39:83] ==> public final val ASTNode.text: String[MyPropertyDescriptor]

'KDocLinkParser' @ [40:26] ==> public constructor KDocLinkParser() defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser[ClassConstructorDescriptorImpl]

'parser' @ [42:20] ==> val parser: KDocLinkParser defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.Companion.parseMarkdownLink[LocalVariableDescriptor]

'parse' @ [42:27] ==> public open fun parse(root: IElementType, builder: PsiBuilder): ASTNode defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser[SimpleFunctionDescriptorImpl]

'root' @ [42:33] ==> value-parameter root: IElementType defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.Companion.parseMarkdownLink[ValueParameterDescriptorImpl]

'builder' @ [42:39] ==> val builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.Companion.parseMarkdownLink[LocalVariableDescriptor]

'firstChildNode' @ [42:48] ==> public final val ASTNode.firstChildNode: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'builder' @ [47:26] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'mark' @ [47:34] ==> @NotNull public abstract fun mark(): PsiBuilder.Marker defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'builder' @ [48:27] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'tokenType' @ [48:35] ==> public final val PsiBuilder.tokenType: IElementType?[MyPropertyDescriptor]

'LBRACKET' @ [48:57] ==> public final val LBRACKET: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'hasLBracket' @ [49:13] ==> val hasLBracket: Boolean defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[LocalVariableDescriptor]

'builder' @ [50:13] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'advanceLexer' @ [50:21] ==> public abstract fun advanceLexer(): Unit defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'parseQualifiedName' @ [52:9] ==> private final fun parseQualifiedName(builder: PsiBuilder): Unit defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser[SimpleFunctionDescriptorImpl]

'builder' @ [52:28] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'if (hasLBracket) {
            if (!builder.eof() && builder.tokenType != KtTokens.RBRACKET) {
                builder.error("Closing bracket expected")
                while (!builder.eof() && builder.tokenType != KtTokens.RBRACKET) {
                    builder.advanceLexer()
                }
            }
            if (builder.tokenType == KtTokens.RBRACKET) {
                builder.advanceLexer()
            }
        }
        else {
            if (!builder.eof()) {
                builder.error("Expression expected")
                while (!builder.eof()) {
                    builder.advanceLexer()
                }
            }
        }' @ [53:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'hasLBracket' @ [53:13] ==> val hasLBracket: Boolean defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[LocalVariableDescriptor]

'!' @ [54:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'builder' @ [54:18] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'eof' @ [54:26] ==> public abstract fun eof(): Boolean defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'builder' @ [54:35] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'tokenType' @ [54:43] ==> public final val PsiBuilder.tokenType: IElementType?[MyPropertyDescriptor]

'RBRACKET' @ [54:65] ==> public final val RBRACKET: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'builder' @ [55:17] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'error' @ [55:25] ==> public abstract fun error(p0: (String..String?)): Unit defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'!' @ [56:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'builder' @ [56:25] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'eof' @ [56:33] ==> public abstract fun eof(): Boolean defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'builder' @ [56:42] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'tokenType' @ [56:50] ==> public final val PsiBuilder.tokenType: IElementType?[MyPropertyDescriptor]

'RBRACKET' @ [56:72] ==> public final val RBRACKET: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'builder' @ [57:21] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'advanceLexer' @ [57:29] ==> public abstract fun advanceLexer(): Unit defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'builder' @ [60:17] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'tokenType' @ [60:25] ==> public final val PsiBuilder.tokenType: IElementType?[MyPropertyDescriptor]

'RBRACKET' @ [60:47] ==> public final val RBRACKET: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'builder' @ [61:17] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'advanceLexer' @ [61:25] ==> public abstract fun advanceLexer(): Unit defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'!' @ [65:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'builder' @ [65:18] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'eof' @ [65:26] ==> public abstract fun eof(): Boolean defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'builder' @ [66:17] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'error' @ [66:25] ==> public abstract fun error(p0: (String..String?)): Unit defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'!' @ [67:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'builder' @ [67:25] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'eof' @ [67:33] ==> public abstract fun eof(): Boolean defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'builder' @ [68:21] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'advanceLexer' @ [68:29] ==> public abstract fun advanceLexer(): Unit defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'rootMarker' @ [72:9] ==> val rootMarker: PsiBuilder.Marker defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[LocalVariableDescriptor]

'done' @ [72:20] ==> public abstract fun done(@NotNull p0: IElementType): Unit defined in com.intellij.lang.PsiBuilder.Marker[JavaMethodDescriptor]

'root' @ [72:25] ==> value-parameter root: IElementType defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'builder' @ [73:16] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parse[ValueParameterDescriptorImpl]

'treeBuilt' @ [73:24] ==> public final val PsiBuilder.treeBuilt: ASTNode[MyPropertyDescriptor]

'builder' @ [77:22] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parseQualifiedName[ValueParameterDescriptorImpl]

'mark' @ [77:30] ==> @NotNull public abstract fun mark(): PsiBuilder.Marker defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'!' @ [80:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isName' @ [80:18] ==> private final fun isName(tokenType: IElementType?): Boolean defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser[SimpleFunctionDescriptorImpl]

'builder' @ [80:25] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parseQualifiedName[ValueParameterDescriptorImpl]

'tokenType' @ [80:33] ==> public final val PsiBuilder.tokenType: IElementType?[MyPropertyDescriptor]

'marker' @ [81:17] ==> var marker: PsiBuilder.Marker defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parseQualifiedName[LocalVariableDescriptor]

'drop' @ [81:24] ==> public abstract fun drop(): Unit defined in com.intellij.lang.PsiBuilder.Marker[JavaMethodDescriptor]

'builder' @ [82:17] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parseQualifiedName[ValueParameterDescriptorImpl]

'error' @ [82:25] ==> public abstract fun error(p0: (String..String?)): Unit defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'builder' @ [85:13] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parseQualifiedName[ValueParameterDescriptorImpl]

'advanceLexer' @ [85:21] ==> public abstract fun advanceLexer(): Unit defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'marker' @ [86:13] ==> var marker: PsiBuilder.Marker defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parseQualifiedName[LocalVariableDescriptor]

'done' @ [86:20] ==> public abstract fun done(@NotNull p0: IElementType): Unit defined in com.intellij.lang.PsiBuilder.Marker[JavaMethodDescriptor]

'KDOC_NAME' @ [86:42] ==> public final val KDOC_NAME: (KDocElementType..KDocElementType?) defined in org.jetbrains.kotlin.kdoc.parser.KDocElementTypes[JavaPropertyDescriptor]

'builder' @ [87:17] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parseQualifiedName[ValueParameterDescriptorImpl]

'tokenType' @ [87:25] ==> public final val PsiBuilder.tokenType: IElementType?[MyPropertyDescriptor]

'DOT' @ [87:47] ==> public final val DOT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'marker' @ [90:13] ==> var marker: PsiBuilder.Marker defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parseQualifiedName[LocalVariableDescriptor]

'marker' @ [90:22] ==> var marker: PsiBuilder.Marker defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parseQualifiedName[LocalVariableDescriptor]

'precede' @ [90:29] ==> @NotNull public abstract fun precede(): PsiBuilder.Marker defined in com.intellij.lang.PsiBuilder.Marker[JavaMethodDescriptor]

'builder' @ [91:13] ==> value-parameter builder: PsiBuilder defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.parseQualifiedName[ValueParameterDescriptorImpl]

'advanceLexer' @ [91:21] ==> public abstract fun advanceLexer(): Unit defined in com.intellij.lang.PsiBuilder[JavaMethodDescriptor]

'tokenType' @ [95:52] ==> value-parameter tokenType: IElementType? defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.isName[ValueParameterDescriptorImpl]

'IDENTIFIER' @ [95:74] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'tokenType' @ [95:88] ==> value-parameter tokenType: IElementType? defined in org.jetbrains.kotlin.kdoc.parser.KDocLinkParser.isName[ValueParameterDescriptorImpl]

'KEYWORDS' @ [95:110] ==> public final val KEYWORDS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

