'KotlinQuickFixAction<PsiElement>' @ [30:69] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> PsiElement

'element' @ [30:102] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.<init>[ValueParameterDescriptorImpl]

'text' @ [31:44] ==> public final val CommaInWhenConditionWithoutArgumentFix.text: String[MyPropertyDescriptor]

'element' @ [35:30] ==> protected final val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix[PropertyDescriptorImpl]

'replaceCommasWithOrsInWhenExpression' @ [36:9] ==> private final fun replaceCommasWithOrsInWhenExpression(whenExpression: KtWhenExpression): Unit defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion[SimpleFunctionDescriptorImpl]

'whenExpression' @ [36:46] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [39:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [41:17] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [41:28] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'parent' @ [41:39] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [41:47] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [41:55] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> CommaInWhenConditionWithoutArgumentFix): CommaInWhenConditionWithoutArgumentFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> CommaInWhenConditionWithoutArgumentFix

'whenExpression' @ [51:31] ==> value-parameter whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.replaceCommasWithOrsInWhenExpression[ValueParameterDescriptorImpl]

'entries' @ [51:46] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'whenEntry' @ [52:21] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.replaceCommasWithOrsInWhenExpression[LocalVariableDescriptor]

'conditions' @ [52:31] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'size' @ [52:42] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'getConditionsDataOrNull' @ [53:42] ==> private final fun getConditionsDataOrNull(whenEntry: KtWhenEntry): CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData? defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion[SimpleFunctionDescriptorImpl]

'whenEntry' @ [53:66] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.replaceCommasWithOrsInWhenExpression[LocalVariableDescriptor]

'KtPsiFactory' @ [54:39] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'whenEntry' @ [54:52] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.replaceCommasWithOrsInWhenExpression[LocalVariableDescriptor]

'combineWhenConditions' @ [54:63] ==> public fun KtPsiFactory.combineWhenConditions(conditions: Array<KtWhenCondition>, subject: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations[SimpleFunctionDescriptorImpl]

'conditionsData' @ [54:85] ==> val conditionsData: CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.replaceCommasWithOrsInWhenExpression[LocalVariableDescriptor]

'conditions' @ [54:100] ==> public final val conditions: Array<KtWhenCondition> defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData[PropertyDescriptorImpl]

'whenEntry' @ [55:21] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.replaceCommasWithOrsInWhenExpression[LocalVariableDescriptor]

'deleteChildRange' @ [55:31] ==> public open fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtWhenEntry[JavaMethodDescriptor]

'conditionsData' @ [55:48] ==> val conditionsData: CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.replaceCommasWithOrsInWhenExpression[LocalVariableDescriptor]

'first' @ [55:63] ==> public final val first: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData[PropertyDescriptorImpl]

'conditionsData' @ [55:70] ==> val conditionsData: CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.replaceCommasWithOrsInWhenExpression[LocalVariableDescriptor]

'last' @ [55:85] ==> public final val last: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData[PropertyDescriptorImpl]

'whenEntry' @ [56:21] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.replaceCommasWithOrsInWhenExpression[LocalVariableDescriptor]

'addBefore' @ [56:31] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtWhenEntry[JavaMethodDescriptor]

'replacement' @ [56:41] ==> val replacement: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.replaceCommasWithOrsInWhenExpression[LocalVariableDescriptor]

'conditionsData' @ [56:54] ==> val conditionsData: CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.replaceCommasWithOrsInWhenExpression[LocalVariableDescriptor]

'arrow' @ [56:69] ==> public final val arrow: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData[PropertyDescriptorImpl]

'ArrayList' @ [62:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtWhenCondition

'whenEntry' @ [66:25] ==> value-parameter whenEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[ValueParameterDescriptorImpl]

'firstChild' @ [66:35] ==> public final val KtWhenEntry.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [67:39] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'when {
                    child is KtWhenConditionWithExpression -> {
                        conditions.add(child)
                    }
                    child.node.elementType == KtTokens.ARROW -> {
                        arrow = child
                        break@whenEntryChildren
                    }
                }' @ [68:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'child' @ [69:21] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'conditions' @ [70:25] ==> val conditions: ArrayList<KtWhenCondition> defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'add' @ [70:36] ==> public open fun add(element: KtWhenCondition): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'child' @ [70:40] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'child' @ [72:21] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'node' @ [72:27] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [72:32] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'ARROW' @ [72:56] ==> public final val ARROW: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'arrow' @ [73:25] ==> var arrow: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'child' @ [73:33] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'child' @ [77:17] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'child' @ [77:25] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'nextSibling' @ [77:31] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [80:24] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'prevSibling' @ [80:31] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (arrow != null && last != null)
                WhenEntryConditionsData(conditions.toTypedArray(), whenEntry.firstChild, last, arrow)
            else
                null' @ [82:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData?, elseBranch: CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData?): CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> WhenEntryConditionsData?

'arrow' @ [82:24] ==> var arrow: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'last' @ [82:41] ==> val last: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'WhenEntryConditionsData' @ [83:17] ==> public constructor WhenEntryConditionsData(conditions: Array<KtWhenCondition>, first: PsiElement, last: PsiElement, arrow: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.WhenEntryConditionsData[ClassConstructorDescriptorImpl]

'conditions' @ [83:41] ==> val conditions: ArrayList<KtWhenCondition> defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'toTypedArray' @ [83:52] ==> public inline fun <reified T> Collection<KtWhenCondition>.toTypedArray(): Array<KtWhenCondition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtWhenCondition

'whenEntry' @ [83:68] ==> value-parameter whenEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[ValueParameterDescriptorImpl]

'firstChild' @ [83:78] ==> public final val KtWhenEntry.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'last' @ [83:90] ==> val last: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

'arrow' @ [83:96] ==> var arrow: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.CommaInWhenConditionWithoutArgumentFix.Companion.getConditionsDataOrNull[LocalVariableDescriptor]

