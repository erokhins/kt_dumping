'KotlinQuickFixAction<KtAnnotationEntry>' @ [27:67] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtAnnotationEntry) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtAnnotationEntry

'element' @ [27:107] ==> value-parameter element: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.<init>[ValueParameterDescriptorImpl]

'element' @ [29:38] ==> protected final val element: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix[PropertyDescriptorImpl]

'let' @ [29:47] ==> @InlineOnly public inline fun <T, R> KtAnnotationEntry.let(block: (KtAnnotationEntry) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry
    <R> -> String

'it' @ [29:75] ==> value-parameter it: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.getText.<anonymous>[ValueParameterDescriptorImpl]

'calleeExpression' @ [29:78] ==> public final val KtAnnotationEntry.calleeExpression: KtConstructorCalleeExpression?[MyPropertyDescriptor]

'text' @ [29:96] ==> public final val KtConstructorCalleeExpression.text: (String..String?)[MyPropertyDescriptor]

'replaceWithLabel' @ [32:9] ==> private final fun replaceWithLabel(annotation: KtAnnotationEntry): Unit defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion[SimpleFunctionDescriptorImpl]

'element' @ [32:26] ==> protected final val element: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix[PropertyDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [35:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [37:35] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [37:46] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [37:57] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'!' @ [39:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'looksLikeObsoleteLabel' @ [39:18] ==> public final fun looksLikeObsoleteLabel(entry: KtAnnotationEntry): Boolean defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion[SimpleFunctionDescriptorImpl]

'annotationEntry' @ [39:41] ==> val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.createAction[LocalVariableDescriptor]

'ReplaceObsoleteLabelSyntaxFix' @ [41:20] ==> public constructor ReplaceObsoleteLabelSyntaxFix(element: KtAnnotationEntry) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix[ClassConstructorDescriptorImpl]

'annotationEntry' @ [41:50] ==> val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.createAction[LocalVariableDescriptor]

'entry' @ [45:17] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.looksLikeObsoleteLabel[ValueParameterDescriptorImpl]

'atSymbol' @ [45:23] ==> public final val KtAnnotationEntry.atSymbol: PsiElement?[MyPropertyDescriptor]

'entry' @ [46:17] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.looksLikeObsoleteLabel[ValueParameterDescriptorImpl]

'parent' @ [46:23] ==> public final val KtAnnotationEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'==' @ [47:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'entry' @ [47:18] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.looksLikeObsoleteLabel[ValueParameterDescriptorImpl]

'parent' @ [47:24] ==> public final val KtAnnotationEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'annotationEntries' @ [47:57] ==> public final val KtAnnotatedExpression.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'size' @ [47:75] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'entry' @ [48:17] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.looksLikeObsoleteLabel[ValueParameterDescriptorImpl]

'valueArgumentList' @ [48:23] ==> public final val KtAnnotationEntry.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'entry' @ [49:17] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.looksLikeObsoleteLabel[ValueParameterDescriptorImpl]

'calleeExpression' @ [49:23] ==> public final val KtAnnotationEntry.calleeExpression: KtConstructorCalleeExpression?[MyPropertyDescriptor]

'constructorReferenceExpression' @ [49:41] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'getIdentifier' @ [49:73] ==> public abstract fun getIdentifier(): PsiElement? defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'annotation' @ [52:29] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[ValueParameterDescriptorImpl]

'calleeExpression' @ [52:40] ==> public final val KtAnnotationEntry.calleeExpression: KtConstructorCalleeExpression?[MyPropertyDescriptor]

'constructorReferenceExpression' @ [52:58] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'getReferencedName' @ [52:90] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'annotation' @ [53:39] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[ValueParameterDescriptorImpl]

'parent' @ [53:50] ==> public final val KtAnnotationEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'annotatedExpression' @ [54:30] ==> val annotatedExpression: KtAnnotatedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[LocalVariableDescriptor]

'baseExpression' @ [54:50] ==> public final val KtAnnotatedExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'annotatedExpression' @ [56:17] ==> val annotatedExpression: KtAnnotatedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[LocalVariableDescriptor]

'annotationEntries' @ [56:37] ==> public final val KtAnnotatedExpression.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'size' @ [56:55] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'expression' @ [58:39] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[LocalVariableDescriptor]

'textRange' @ [58:50] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [58:60] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'TextRange' @ [60:37] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'annotation' @ [60:47] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[ValueParameterDescriptorImpl]

'textRange' @ [60:58] ==> public final val KtAnnotationEntry.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [60:68] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'baseExpressionStart' @ [60:79] ==> val baseExpressionStart: Int defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[LocalVariableDescriptor]

'textRangeToRetain' @ [61:32] ==> val textRangeToRetain: TextRange defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[LocalVariableDescriptor]

'substring' @ [61:50] ==> @NotNull public open fun substring(@NotNull p0: String): String defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'annotation' @ [61:60] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[ValueParameterDescriptorImpl]

'containingFile' @ [61:71] ==> public final val KtAnnotationEntry.containingFile: PsiFile[MyPropertyDescriptor]

'text' @ [61:86] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'KtPsiFactory' @ [63:37] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'annotation' @ [63:50] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [63:62] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'labelName' @ [63:99] ==> val labelName: String defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[LocalVariableDescriptor]

'textToRetain' @ [63:110] ==> val textToRetain: String defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[LocalVariableDescriptor]

'expression' @ [63:124] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[LocalVariableDescriptor]

'annotatedExpression' @ [65:13] ==> val annotatedExpression: KtAnnotatedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[LocalVariableDescriptor]

'replace' @ [65:33] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtAnnotatedExpression[DeserializedSimpleFunctionDescriptor]

'labeledExpression' @ [65:41] ==> val labeledExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion.replaceWithLabel[LocalVariableDescriptor]

