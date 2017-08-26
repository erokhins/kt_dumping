'HighlightUsagesHandlerFactoryBase' @ [38:48] ==> public constructor HighlightUsagesHandlerFactoryBase() defined in com.intellij.codeInsight.highlighting.HighlightUsagesHandlerFactoryBase[JavaClassConstructorDescriptor]

'create' @ [40:49] ==> @NotNull public open fun create(@NotNull vararg p0: (IElementType..IElementType?)): TokenSet defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'RETURN_KEYWORD' @ [40:65] ==> public final val RETURN_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'THROW_KEYWORD' @ [40:90] ==> public final val THROW_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'target' @ [44:13] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.createHighlightUsagesHandler[ValueParameterDescriptorImpl]

'target' @ [44:42] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.createHighlightUsagesHandler[ValueParameterDescriptorImpl]

'elementType' @ [44:49] ==> public final val LeafPsiElement.elementType: IElementType[MyPropertyDescriptor]

'RETURN_AND_THROW' @ [44:64] ==> private final val RETURN_AND_THROW: TokenSet defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.Companion[PropertyDescriptorImpl]

'?:' @ [45:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'getParentOfType' @ [45:45] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtExpression..KtExpression?)>..Class<out (KtExpression..KtExpression?)>?)): KtExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtExpression

'target' @ [46:21] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.createHighlightUsagesHandler[ValueParameterDescriptorImpl]

'KtReturnExpression' @ [47:21] ==> public constructor KtReturnExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtReturnExpression[JavaClassConstructorDescriptor]

'java' @ [47:47] ==> public val <T> KClass<KtReturnExpression>.java: Class<KtReturnExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtReturnExpression

'KtThrowExpression' @ [48:21] ==> public constructor KtThrowExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtThrowExpression[JavaClassConstructorDescriptor]

'java' @ [48:46] ==> public val <T> KClass<KtThrowExpression>.java: Class<KtThrowExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtThrowExpression

'MyHandler' @ [51:20] ==> public constructor MyHandler(editor: Editor, file: PsiFile, target: KtExpression) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler[ClassConstructorDescriptorImpl]

'editor' @ [51:30] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.createHighlightUsagesHandler[ValueParameterDescriptorImpl]

'file' @ [51:38] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.createHighlightUsagesHandler[ValueParameterDescriptorImpl]

'returnOrThrow' @ [51:44] ==> val returnOrThrow: KtExpression defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.createHighlightUsagesHandler[LocalVariableDescriptor]

'HighlightUsagesHandlerBase<PsiElement>' @ [56:88] ==> protected/*protected and package*/ constructor HighlightUsagesHandlerBase<T : (PsiElement..PsiElement?)>(@NotNull p0: Editor, @NotNull p1: PsiFile) defined in com.intellij.codeInsight.highlighting.HighlightUsagesHandlerBase[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'editor' @ [56:127] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.<init>[ValueParameterDescriptorImpl]

'file' @ [56:135] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.<init>[ValueParameterDescriptorImpl]

'listOf' @ [57:37] ==> public fun <T> listOf(element: KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'target' @ [57:44] ==> public final val target: KtExpression defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler[PropertyDescriptorImpl]

'selectionConsumer' @ [60:13] ==> value-parameter selectionConsumer: Consumer<MutableList<PsiElement>> defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.selectTargets[ValueParameterDescriptorImpl]

'consume' @ [60:31] ==> public abstract fun consume(p0: (MutableList<PsiElement>..MutableList<PsiElement>?)): Unit defined in com.intellij.util.Consumer[JavaMethodDescriptor]

'targets' @ [60:39] ==> value-parameter targets: MutableList<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.selectTargets[ValueParameterDescriptorImpl]

'target' @ [64:36] ==> public final val target: KtExpression defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler[PropertyDescriptorImpl]

'getRelevantFunction' @ [64:43] ==> private fun KtExpression.getRelevantFunction(): KtFunction? defined in org.jetbrains.kotlin.idea.highlighter in file KotlinHighlightExitPointsHandlerFactory.kt[SimpleFunctionDescriptorImpl]

'relevantFunction' @ [65:13] ==> val relevantFunction: KtFunction? defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.computeUsages[LocalVariableDescriptor]

'accept' @ [65:31] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'KtVisitorVoid' @ [65:47] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'element' @ [67:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.computeUsages.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [67:29] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'this' @ [67:44] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.computeUsages.<no name provided>[LazyClassReceiverParameterDescriptor]

'expression' @ [71:25] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.computeUsages.<no name provided>.visitReturnOrThrow[ValueParameterDescriptorImpl]

'getRelevantFunction' @ [71:36] ==> private fun KtExpression.getRelevantFunction(): KtFunction? defined in org.jetbrains.kotlin.idea.highlighter in file KotlinHighlightExitPointsHandlerFactory.kt[SimpleFunctionDescriptorImpl]

'relevantFunction' @ [71:61] ==> val relevantFunction: KtFunction? defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.computeUsages[LocalVariableDescriptor]

'addOccurrence' @ [72:25] ==> protected/*protected and package*/ open fun addOccurrence(@NotNull p0: PsiElement): Unit defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler[JavaMethodDescriptor]

'expression' @ [72:39] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.computeUsages.<no name provided>.visitReturnOrThrow[ValueParameterDescriptorImpl]

'visitReturnOrThrow' @ [77:21] ==> private final fun visitReturnOrThrow(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.computeUsages.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [77:40] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.computeUsages.<no name provided>.visitReturnExpression[ValueParameterDescriptorImpl]

'visitReturnOrThrow' @ [81:21] ==> private final fun visitReturnOrThrow(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.computeUsages.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [81:40] ==> value-parameter expression: KtThrowExpression defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightExitPointsHandlerFactory.MyHandler.computeUsages.<no name provided>.visitThrowExpression[ValueParameterDescriptorImpl]

'this' @ [89:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.getRelevantFunction[ReceiverParameterDescriptorImpl]

'this' @ [90:10] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.getRelevantFunction[ReceiverParameterDescriptorImpl]

'getTargetLabel' @ [90:15] ==> public final fun getTargetLabel(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.KtReturnExpression[DeserializedSimpleFunctionDescriptor]

'mainReference' @ [90:33] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [90:48] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'let' @ [90:75] ==> @InlineOnly public inline fun <T, R> KtFunction.let(block: (KtFunction) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFunction
    <R> -> Nothing

'it' @ [90:88] ==> value-parameter it: KtFunction defined in org.jetbrains.kotlin.idea.highlighter.getRelevantFunction.<anonymous>[ValueParameterDescriptorImpl]

'parents' @ [92:20] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'canBeInlineArgument' @ [93:24] ==> public open fun canBeInlineArgument(@Nullable p0: PsiElement?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'parent' @ [93:44] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.getRelevantFunction[LocalVariableDescriptor]

'!' @ [93:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInlinedArgument' @ [93:67] ==> public open fun isInlinedArgument(@NotNull p0: KtFunction, @NotNull p1: BindingContext, p2: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'parent' @ [93:85] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.getRelevantFunction[LocalVariableDescriptor]

'parent' @ [93:107] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.getRelevantFunction[LocalVariableDescriptor]

'analyze' @ [93:114] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'parent' @ [94:20] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.getRelevantFunction[LocalVariableDescriptor]

