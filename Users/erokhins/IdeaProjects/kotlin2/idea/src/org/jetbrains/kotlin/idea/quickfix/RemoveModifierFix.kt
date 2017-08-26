'KotlinQuickFixAction<KtModifierListOwner>' @ [37:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtModifierListOwner) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtModifierListOwner

'element' @ [37:47] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.<init>[ValueParameterDescriptorImpl]

'run' @ [39:24] ==> @InlineOnly public inline fun <T, R> RemoveModifierFix.run(block: RemoveModifierFix.() -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RemoveModifierFix
    <R> -> String

'modifier' @ [40:28] ==> private final val modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[PropertyDescriptorImpl]

'value' @ [40:37] ==> public final val KtModifierKeywordToken.value: String[MyPropertyDescriptor]

'when {
            isRedundant ->
                "Remove redundant '$modifierText' modifier"
            modifier === KtTokens.ABSTRACT_KEYWORD || modifier === KtTokens.OPEN_KEYWORD ->
                "Make ${AddModifierFix.getElementName(element)} not $modifierText"
            else ->
                "Remove '$modifierText' modifier"
        }' @ [41:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'isRedundant' @ [42:13] ==> private final val isRedundant: Boolean defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[PropertyDescriptorImpl]

'modifierText' @ [43:37] ==> val modifierText: String defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.text.<anonymous>[LocalVariableDescriptor]

'modifier' @ [44:13] ==> private final val modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[PropertyDescriptorImpl]

'ABSTRACT_KEYWORD' @ [44:35] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'modifier' @ [44:55] ==> private final val modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[PropertyDescriptorImpl]

'OPEN_KEYWORD' @ [44:77] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'AddModifierFix' @ [45:25] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.AddModifierFix[FakeCallableDescriptorForObject]

'getElementName' @ [45:40] ==> public final fun getElementName(modifierListOwner: KtModifierListOwner): String defined in org.jetbrains.kotlin.idea.quickfix.AddModifierFix.Companion[SimpleFunctionDescriptorImpl]

'element' @ [45:55] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.<init>[ValueParameterDescriptorImpl]

'modifierText' @ [45:70] ==> val modifierText: String defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.text.<anonymous>[LocalVariableDescriptor]

'modifierText' @ [47:27] ==> val modifierText: String defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.text.<anonymous>[LocalVariableDescriptor]

'text' @ [53:30] ==> private final val text: String defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[PropertyDescriptorImpl]

'super' @ [56:15] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [56:21] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [56:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [56:42] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [56:50] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [56:60] ==> protected final val element: KtModifierListOwner? defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[PropertyDescriptorImpl]

'hasModifier' @ [56:69] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'modifier' @ [56:81] ==> private final val modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[PropertyDescriptorImpl]

'invoke' @ [59:9] ==> public final fun invoke(): Unit defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[SimpleFunctionDescriptorImpl]

'element' @ [63:23] ==> protected final val element: KtModifierListOwner? defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[PropertyDescriptorImpl]

'element' @ [65:26] ==> val element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.invoke[LocalVariableDescriptor]

'copy' @ [65:34] ==> public abstract fun copy(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'newElement' @ [66:9] ==> val newElement: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.invoke[LocalVariableDescriptor]

'removeModifier' @ [66:20] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'modifier' @ [66:35] ==> private final val modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[PropertyDescriptorImpl]

'element' @ [67:9] ==> val element: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.invoke[LocalVariableDescriptor]

'replace' @ [67:17] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'newElement' @ [67:25] ==> val newElement: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [72:29] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'?:' @ [74:45] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtModifierListOwner?, right: KtModifierListOwner): KtModifierListOwner[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtModifierListOwner

'getParentElementOfType' @ [74:58] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtModifierListOwner..KtModifierListOwner?)>..Class<(KtModifierListOwner..KtModifierListOwner?)>?)): KtModifierListOwner? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtModifierListOwner

'diagnostic' @ [74:81] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveModifierFromListOwnerFactory.<no name provided>.createAction[ValueParameterDescriptorImpl]

'java' @ [74:120] ==> public val <T> KClass<KtModifierListOwner>.java: Class<KtModifierListOwner> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtModifierListOwner

'RemoveModifierFix' @ [75:28] ==> public constructor RemoveModifierFix(element: KtModifierListOwner, modifier: KtModifierKeywordToken, isRedundant: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[ClassConstructorDescriptorImpl]

'modifierListOwner' @ [75:46] ==> val modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveModifierFromListOwnerFactory.<no name provided>.createAction[LocalVariableDescriptor]

'modifier' @ [75:65] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveModifierFromListOwnerFactory[ValueParameterDescriptorImpl]

'isRedundant' @ [75:75] ==> value-parameter isRedundant: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveModifierFromListOwnerFactory[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [81:29] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [83:38] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveModifierFactory.<no name provided>.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [83:49] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'psiElement' @ [84:39] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveModifierFactory.<no name provided>.createAction[LocalVariableDescriptor]

'node' @ [84:50] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [84:55] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'psiElement' @ [85:45] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveModifierFactory.<no name provided>.createAction[LocalVariableDescriptor]

'getStrictParentOfType' @ [85:56] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtModifierListOwner? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtModifierListOwner

'RemoveModifierFix' @ [86:28] ==> public constructor RemoveModifierFix(element: KtModifierListOwner, modifier: KtModifierKeywordToken, isRedundant: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[ClassConstructorDescriptorImpl]

'modifierListOwner' @ [86:46] ==> val modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveModifierFactory.<no name provided>.createAction[LocalVariableDescriptor]

'elementType' @ [86:65] ==> val elementType: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveModifierFactory.<no name provided>.createAction[LocalVariableDescriptor]

'isRedundant' @ [86:78] ==> value-parameter isRedundant: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveModifierFactory[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [92:29] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [94:38] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveProjectionFactory.<no name provided>.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [94:49] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'projection' @ [95:39] ==> val projection: KtTypeProjection defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveProjectionFactory.<no name provided>.createAction[LocalVariableDescriptor]

'projectionToken' @ [95:50] ==> public final val KtTypeProjection.projectionToken: PsiElement?[MyPropertyDescriptor]

'node' @ [95:67] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [95:73] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'RemoveModifierFix' @ [96:28] ==> public constructor RemoveModifierFix(element: KtModifierListOwner, modifier: KtModifierKeywordToken, isRedundant: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[ClassConstructorDescriptorImpl]

'projection' @ [96:46] ==> val projection: KtTypeProjection defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveProjectionFactory.<no name provided>.createAction[LocalVariableDescriptor]

'elementType' @ [96:58] ==> val elementType: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveProjectionFactory.<no name provided>.createAction[LocalVariableDescriptor]

'isRedundant' @ [96:71] ==> value-parameter isRedundant: Boolean defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveProjectionFactory[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [102:29] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [104:38] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveVarianceFactory.<no name provided>.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [104:49] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'when (psiElement.variance) {
                        Variance.IN_VARIANCE -> KtTokens.IN_KEYWORD
                        Variance.OUT_VARIANCE -> KtTokens.OUT_KEYWORD
                        else -> return null
                    }' @ [105:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (KtModifierKeywordToken..KtModifierKeywordToken?), entry1: (KtModifierKeywordToken..KtModifierKeywordToken?), entry2: (KtModifierKeywordToken..KtModifierKeywordToken?)): (KtModifierKeywordToken..KtModifierKeywordToken?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'psiElement' @ [105:42] ==> val psiElement: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveVarianceFactory.<no name provided>.createAction[LocalVariableDescriptor]

'variance' @ [105:53] ==> public final val KtTypeParameter.variance: Variance[MyPropertyDescriptor]

'IN_VARIANCE' @ [106:34] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IN_KEYWORD' @ [106:58] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OUT_VARIANCE' @ [107:34] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT_KEYWORD' @ [107:59] ==> public final val OUT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'RemoveModifierFix' @ [110:28] ==> public constructor RemoveModifierFix(element: KtModifierListOwner, modifier: KtModifierKeywordToken, isRedundant: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix[ClassConstructorDescriptorImpl]

'psiElement' @ [110:46] ==> val psiElement: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveVarianceFactory.<no name provided>.createAction[LocalVariableDescriptor]

'modifier' @ [110:58] ==> val modifier: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.idea.quickfix.RemoveModifierFix.Companion.createRemoveVarianceFactory.<no name provided>.createAction[LocalVariableDescriptor]

