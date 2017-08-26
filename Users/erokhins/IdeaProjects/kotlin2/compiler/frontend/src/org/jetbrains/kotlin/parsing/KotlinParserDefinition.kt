'KotlinLexer' @ [49:57] ==> public constructor KotlinLexer() defined in org.jetbrains.kotlin.lexer.KotlinLexer[JavaClassConstructorDescriptor]

'KotlinParser' @ [51:62] ==> public constructor KotlinParser(project: (Project..Project?)) defined in org.jetbrains.kotlin.parsing.KotlinParser[JavaClassConstructorDescriptor]

'project' @ [51:75] ==> value-parameter project: Project defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createParser[ValueParameterDescriptorImpl]

'FILE' @ [53:75] ==> public final val FILE: (KtFileElementType..KtFileElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'WHITESPACES' @ [55:61] ==> public final val WHITESPACES: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'COMMENTS' @ [57:58] ==> public final val COMMENTS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'STRINGS' @ [59:66] ==> public final val STRINGS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'astNode' @ [62:27] ==> value-parameter astNode: ASTNode defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createElement[ValueParameterDescriptorImpl]

'elementType' @ [62:35] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'when (elementType) {
            is KtStubElementType<*, *> -> elementType.createPsiFromAst(astNode)
            KtNodeTypes.TYPE_CODE_FRAGMENT, KtNodeTypes.EXPRESSION_CODE_FRAGMENT, KtNodeTypes.BLOCK_CODE_FRAGMENT -> ASTWrapperPsiElement(astNode)
            is KDocElementType -> elementType.createPsi(astNode)
            KDocTokens.MARKDOWN_LINK -> KDocLink(astNode)
            else -> (elementType as KtNodeType).createPsi(astNode)
        }' @ [64:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement, entry1: PsiElement, entry2: PsiElement, entry3: PsiElement, entry4: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement

'elementType' @ [64:22] ==> val elementType: IElementType defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createElement[LocalVariableDescriptor]

'elementType' @ [65:43] ==> val elementType: IElementType defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createElement[LocalVariableDescriptor]

'createPsiFromAst' @ [65:55] ==> @NotNull public open fun createPsiFromAst(@NotNull node: ASTNode): (KtElementImplStub<*>..KtElementImplStub<*>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementType[JavaMethodDescriptor]

'astNode' @ [65:72] ==> value-parameter astNode: ASTNode defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createElement[ValueParameterDescriptorImpl]

'TYPE_CODE_FRAGMENT' @ [66:25] ==> public final val TYPE_CODE_FRAGMENT: (IFileElementType..IFileElementType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'EXPRESSION_CODE_FRAGMENT' @ [66:57] ==> public final val EXPRESSION_CODE_FRAGMENT: (IFileElementType..IFileElementType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'BLOCK_CODE_FRAGMENT' @ [66:95] ==> public final val BLOCK_CODE_FRAGMENT: (IFileElementType..IFileElementType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'ASTWrapperPsiElement' @ [66:118] ==> public constructor ASTWrapperPsiElement(@NotNull p0: ASTNode) defined in com.intellij.extapi.psi.ASTWrapperPsiElement[JavaClassConstructorDescriptor]

'astNode' @ [66:139] ==> value-parameter astNode: ASTNode defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createElement[ValueParameterDescriptorImpl]

'elementType' @ [67:35] ==> val elementType: IElementType defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createElement[LocalVariableDescriptor]

'createPsi' @ [67:47] ==> public open fun createPsi(node: (ASTNode..ASTNode?)): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.kdoc.parser.KDocElementType[JavaMethodDescriptor]

'astNode' @ [67:57] ==> value-parameter astNode: ASTNode defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createElement[ValueParameterDescriptorImpl]

'MARKDOWN_LINK' @ [68:24] ==> public final val MARKDOWN_LINK: (ILazyParseableElementType..ILazyParseableElementType?) defined in org.jetbrains.kotlin.kdoc.lexer.KDocTokens[JavaPropertyDescriptor]

'KDocLink' @ [68:41] ==> public constructor KDocLink(node: ASTNode) defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocLink[ClassConstructorDescriptorImpl]

'astNode' @ [68:50] ==> value-parameter astNode: ASTNode defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createElement[ValueParameterDescriptorImpl]

'elementType' @ [69:22] ==> val elementType: IElementType defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createElement[LocalVariableDescriptor]

'createPsi' @ [69:49] ==> public open fun createPsi(node: (ASTNode..ASTNode?)): (KtElement..KtElement?) defined in org.jetbrains.kotlin.KtNodeType[JavaMethodDescriptor]

'astNode' @ [69:59] ==> value-parameter astNode: ASTNode defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createElement[ValueParameterDescriptorImpl]

'KtFile' @ [73:76] ==> public constructor KtFile(viewProvider: (FileViewProvider..FileViewProvider?), compiled: Boolean) defined in org.jetbrains.kotlin.psi.KtFile[JavaClassConstructorDescriptor]

'fileViewProvider' @ [73:83] ==> value-parameter fileViewProvider: FileViewProvider defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.createFile[ValueParameterDescriptorImpl]

'right' @ [76:30] ==> value-parameter right: ASTNode defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[ValueParameterDescriptorImpl]

'elementType' @ [76:36] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'rightTokenType' @ [79:13] ==> val rightTokenType: IElementType defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[LocalVariableDescriptor]

'GET_KEYWORD' @ [79:40] ==> public final val GET_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'rightTokenType' @ [79:55] ==> val rightTokenType: IElementType defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[LocalVariableDescriptor]

'SET_KEYWORD' @ [79:82] ==> public final val SET_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MUST_LINE_BREAK' @ [80:20] ==> enum entry MUST_LINE_BREAK defined in com.intellij.lang.ParserDefinition.SpaceRequirements[FakeCallableDescriptorForObject]

'left' @ [83:29] ==> value-parameter left: ASTNode defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[ValueParameterDescriptorImpl]

'elementType' @ [83:34] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'leftTokenType' @ [85:13] ==> val leftTokenType: IElementType defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[LocalVariableDescriptor]

'rightTokenType' @ [85:48] ==> val rightTokenType: IElementType defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[LocalVariableDescriptor]

'MUST' @ [85:89] ==> enum entry MUST defined in com.intellij.lang.ParserDefinition.SpaceRequirements[FakeCallableDescriptorForObject]

'right' @ [88:30] ==> value-parameter right: ASTNode defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[ValueParameterDescriptorImpl]

'psi' @ [88:36] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [88:40] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtWhenEntry? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtWhenEntry

'rightWhenEntry' @ [89:13] ==> val rightWhenEntry: KtWhenEntry? defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[LocalVariableDescriptor]

'left' @ [90:33] ==> value-parameter left: ASTNode defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[ValueParameterDescriptorImpl]

'psi' @ [90:38] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [90:42] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtWhenEntry? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtWhenEntry

'leftWhenEntry' @ [91:17] ==> val leftWhenEntry: KtWhenEntry? defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[LocalVariableDescriptor]

'leftWhenEntry' @ [91:42] ==> val leftWhenEntry: KtWhenEntry? defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[LocalVariableDescriptor]

'rightWhenEntry' @ [91:59] ==> val rightWhenEntry: KtWhenEntry? defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[LocalVariableDescriptor]

'leftTokenType' @ [91:77] ==> val leftTokenType: IElementType defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.spaceExistanceTypeBetweenTokens[LocalVariableDescriptor]

'SEMICOLON' @ [91:103] ==> public final val SEMICOLON: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MUST_LINE_BREAK' @ [92:24] ==> enum entry MUST_LINE_BREAK defined in com.intellij.lang.ParserDefinition.SpaceRequirements[FakeCallableDescriptorForObject]

'MAY' @ [97:16] ==> enum entry MAY defined in com.intellij.lang.ParserDefinition.SpaceRequirements[FakeCallableDescriptorForObject]

'JvmField' @ [102:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'JvmField' @ [105:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'+' @ [106:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'STD_SCRIPT_SUFFIX' @ [106:36] ==> @JvmField public final val STD_SCRIPT_SUFFIX: String defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.Companion[PropertyDescriptorImpl]

'INSTANCE' @ [109:47] ==> public final val INSTANCE: (LanguageParserDefinitions..LanguageParserDefinitions?) defined in com.intellij.lang.LanguageParserDefinitions[JavaPropertyDescriptor]

'forLanguage' @ [109:56] ==> public open fun forLanguage(@NotNull p0: Language): (ParserDefinition..ParserDefinition?) defined in com.intellij.lang.LanguageParserDefinitions[JavaMethodDescriptor]

'INSTANCE' @ [109:83] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

