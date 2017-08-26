'HighlightingVisitor' @ [36:77] ==> protected constructor HighlightingVisitor(holder: AnnotationHolder) defined in org.jetbrains.kotlin.idea.highlighter.HighlightingVisitor[ClassConstructorDescriptorImpl]

'holder' @ [36:97] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.<init>[ValueParameterDescriptorImpl]

'element' @ [39:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitElement[ValueParameterDescriptorImpl]

'node' @ [39:35] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [39:40] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'when {
            element is KDocLink && !willApplyRainbowHighlight(element) -> KotlinHighlightingColors.KDOC_LINK

            elementType in KtTokens.SOFT_KEYWORDS -> {
                when (elementType) {
                    in KtTokens.MODIFIER_KEYWORDS -> KotlinHighlightingColors.BUILTIN_ANNOTATION
                    else -> KotlinHighlightingColors.KEYWORD
                }
            }
            elementType == KtTokens.SAFE_ACCESS -> KotlinHighlightingColors.SAFE_ACCESS
            else -> return
        }' @ [40:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (TextAttributesKey..TextAttributesKey?), entry1: (TextAttributesKey..TextAttributesKey?), entry2: (TextAttributesKey..TextAttributesKey?), entry3: (TextAttributesKey..TextAttributesKey?)): (TextAttributesKey..TextAttributesKey?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.openapi.editor.colors.TextAttributesKey..com.intellij.openapi.editor.colors.TextAttributesKey?)

'element' @ [41:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitElement[ValueParameterDescriptorImpl]

'!' @ [41:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'willApplyRainbowHighlight' @ [41:37] ==> private final fun willApplyRainbowHighlight(element: KDocLink): Boolean defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor[SimpleFunctionDescriptorImpl]

'element' @ [41:63] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitElement[ValueParameterDescriptorImpl]

'KDOC_LINK' @ [41:100] ==> public final val KDOC_LINK: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'elementType' @ [43:13] ==> val elementType: IElementType defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitElement[LocalVariableDescriptor]

'SOFT_KEYWORDS' @ [43:37] ==> public final val SOFT_KEYWORDS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when (elementType) {
                    in KtTokens.MODIFIER_KEYWORDS -> KotlinHighlightingColors.BUILTIN_ANNOTATION
                    else -> KotlinHighlightingColors.KEYWORD
                }' @ [44:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (TextAttributesKey..TextAttributesKey?), entry1: (TextAttributesKey..TextAttributesKey?)): (TextAttributesKey..TextAttributesKey?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.openapi.editor.colors.TextAttributesKey..com.intellij.openapi.editor.colors.TextAttributesKey?)

'elementType' @ [44:23] ==> val elementType: IElementType defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitElement[LocalVariableDescriptor]

'in' @ [45:21] ==> public open operator fun contains(@Nullable p0: IElementType?): Boolean defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'MODIFIER_KEYWORDS' @ [45:33] ==> public final val MODIFIER_KEYWORDS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'BUILTIN_ANNOTATION' @ [45:79] ==> public final val BUILTIN_ANNOTATION: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'KEYWORD' @ [46:54] ==> public final val KEYWORD: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'elementType' @ [49:13] ==> val elementType: IElementType defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitElement[LocalVariableDescriptor]

'SAFE_ACCESS' @ [49:37] ==> public final val SAFE_ACCESS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SAFE_ACCESS' @ [49:77] ==> public final val SAFE_ACCESS: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'createInfoAnnotation' @ [53:9] ==> protected final fun createInfoAnnotation(element: PsiElement, message: String?): Annotation defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor[SimpleFunctionDescriptorImpl]

'element' @ [53:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitElement[ValueParameterDescriptorImpl]

'textAttributes' @ [53:45] ==> public final var Annotation.textAttributes: TextAttributesKey[MyPropertyDescriptor]

'attributes' @ [53:62] ==> val attributes: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitElement[LocalVariableDescriptor]

'!' @ [57:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isRainbowEnabledWithInheritance' @ [57:33] ==> public open fun isRainbowEnabledWithInheritance(@Nullable p0: TextAttributesScheme?, @Nullable p1: Language?): Boolean defined in com.intellij.codeHighlighting.RainbowHighlighter[JavaMethodDescriptor]

'getInstance' @ [57:85] ==> public open fun getInstance(): (EditorColorsManager..EditorColorsManager?) defined in com.intellij.openapi.editor.colors.EditorColorsManager[JavaMethodDescriptor]

'globalScheme' @ [57:99] ==> public final var EditorColorsManager.globalScheme: EditorColorsScheme[MyPropertyDescriptor]

'INSTANCE' @ [57:128] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'==' @ [61:16] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[DeserializedSimpleFunctionDescriptor]

'element' @ [61:17] ==> value-parameter element: KDocLink defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.willApplyRainbowHighlight[ValueParameterDescriptorImpl]

'parent' @ [61:25] ==> public final val KDocLink.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'knownTag' @ [61:46] ==> public final val knownTag: KDocKnownTag? defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocTag[DeserializedPropertyDescriptor]

'PARAM' @ [61:71] ==> enum entry PARAM defined in org.jetbrains.kotlin.kdoc.parser.KDocKnownTag[FakeCallableDescriptorForObject]

'getApplication' @ [65:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [65:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'lambdaExpression' @ [67:31] ==> value-parameter lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitLambdaExpression[ValueParameterDescriptorImpl]

'functionLiteral' @ [67:48] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'createInfoAnnotation' @ [68:9] ==> protected final fun createInfoAnnotation(element: PsiElement, message: String?): Annotation defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor[SimpleFunctionDescriptorImpl]

'functionLiteral' @ [68:30] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitLambdaExpression[LocalVariableDescriptor]

'lBrace' @ [68:46] ==> public final val KtFunctionLiteral.lBrace: PsiElement[MyPropertyDescriptor]

'textAttributes' @ [68:60] ==> public final var Annotation.textAttributes: TextAttributesKey[MyPropertyDescriptor]

'FUNCTION_LITERAL_BRACES_AND_ARROW' @ [68:102] ==> public final val FUNCTION_LITERAL_BRACES_AND_ARROW: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'functionLiteral' @ [70:28] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitLambdaExpression[LocalVariableDescriptor]

'rBrace' @ [70:44] ==> public final val KtFunctionLiteral.rBrace: PsiElement?[MyPropertyDescriptor]

'closingBrace' @ [71:13] ==> val closingBrace: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitLambdaExpression[LocalVariableDescriptor]

'createInfoAnnotation' @ [72:13] ==> protected final fun createInfoAnnotation(element: PsiElement, message: String?): Annotation defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor[SimpleFunctionDescriptorImpl]

'closingBrace' @ [72:34] ==> val closingBrace: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitLambdaExpression[LocalVariableDescriptor]

'textAttributes' @ [72:54] ==> public final var Annotation.textAttributes: TextAttributesKey[MyPropertyDescriptor]

'FUNCTION_LITERAL_BRACES_AND_ARROW' @ [72:96] ==> public final val FUNCTION_LITERAL_BRACES_AND_ARROW: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'functionLiteral' @ [75:21] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitLambdaExpression[LocalVariableDescriptor]

'arrow' @ [75:37] ==> public final val KtFunctionLiteral.arrow: PsiElement?[MyPropertyDescriptor]

'arrow' @ [76:13] ==> val arrow: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitLambdaExpression[LocalVariableDescriptor]

'createInfoAnnotation' @ [77:13] ==> protected final fun createInfoAnnotation(element: PsiElement, message: String?): Annotation defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor[SimpleFunctionDescriptorImpl]

'arrow' @ [77:34] ==> val arrow: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitLambdaExpression[LocalVariableDescriptor]

'textAttributes' @ [77:47] ==> public final var Annotation.textAttributes: TextAttributesKey[MyPropertyDescriptor]

'FUNCTION_LITERAL_BRACES_AND_ARROW' @ [77:89] ==> public final val FUNCTION_LITERAL_BRACES_AND_ARROW: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'argument' @ [82:28] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitArgument[ValueParameterDescriptorImpl]

'getArgumentName' @ [82:37] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argument' @ [83:18] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitArgument[ValueParameterDescriptorImpl]

'equalsToken' @ [83:27] ==> public final val KtValueArgument.equalsToken: PsiElement?[MyPropertyDescriptor]

'createInfoAnnotation' @ [84:9] ==> protected final fun createInfoAnnotation(textRange: TextRange, message: String?): Annotation defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor[SimpleFunctionDescriptorImpl]

'TextRange' @ [84:30] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'argumentName' @ [84:40] ==> val argumentName: KtValueArgumentName defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitArgument[LocalVariableDescriptor]

'startOffset' @ [84:53] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'eq' @ [84:66] ==> val eq: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitArgument[LocalVariableDescriptor]

'endOffset' @ [84:69] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'textAttributes' @ [84:87] ==> public final var Annotation.textAttributes: TextAttributesKey[MyPropertyDescriptor]

'NAMED_ARGUMENT' @ [84:129] ==> public final val NAMED_ARGUMENT: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'expression' @ [88:27] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitExpressionWithLabel[ValueParameterDescriptorImpl]

'getTargetLabel' @ [88:38] ==> public final fun getTargetLabel(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.KtExpressionWithLabel[DeserializedSimpleFunctionDescriptor]

'targetLabel' @ [89:13] ==> val targetLabel: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitExpressionWithLabel[LocalVariableDescriptor]

'highlightName' @ [90:13] ==> protected final fun highlightName(element: PsiElement, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor[SimpleFunctionDescriptorImpl]

'targetLabel' @ [90:27] ==> val targetLabel: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor.visitExpressionWithLabel[LocalVariableDescriptor]

'LABEL' @ [90:65] ==> public final val LABEL: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

