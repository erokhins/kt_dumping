'KotlinQuickFixAction<KtWhenConditionIsPattern>' @ [26:75] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtWhenConditionIsPattern) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtWhenConditionIsPattern

'element' @ [26:122] ==> value-parameter element: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.<init>[ValueParameterDescriptorImpl]

'familyName' @ [29:38] ==> public final val RemoveUselessIsCheckFixForWhen.familyName: String[MyPropertyDescriptor]

'element' @ [32:25] ==> protected final val element: KtWhenConditionIsPattern? defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen[PropertyDescriptorImpl]

'condition' @ [33:25] ==> val condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke[LocalVariableDescriptor]

'parent' @ [33:35] ==> public final val KtWhenConditionIsPattern.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'whenEntry' @ [34:30] ==> val whenEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke[LocalVariableDescriptor]

'parent' @ [34:40] ==> public final val KtWhenEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (condition.isNegated) {
            condition.parent.delete()
        } else {
            whenExpression.entries.dropWhile { it != whenEntry }.forEach { it.delete() }
            val newEntry = KtPsiFactory(project).createWhenEntry("else -> ${whenEntry.expression!!.text}")
            whenExpression.addBefore(newEntry, whenExpression.closeBrace)
        }' @ [36:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'condition' @ [36:13] ==> val condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke[LocalVariableDescriptor]

'isNegated' @ [36:23] ==> public final val KtWhenConditionIsPattern.isNegated: Boolean[MyPropertyDescriptor]

'condition' @ [37:13] ==> val condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke[LocalVariableDescriptor]

'parent' @ [37:23] ==> public final val KtWhenConditionIsPattern.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'delete' @ [37:30] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'whenExpression' @ [39:13] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke[LocalVariableDescriptor]

'entries' @ [39:28] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'dropWhile' @ [39:36] ==> public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.dropWhile(predicate: ((KtWhenEntry..KtWhenEntry?)) -> Boolean): List<(KtWhenEntry..KtWhenEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'it' @ [39:48] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke.<anonymous>[ValueParameterDescriptorImpl]

'whenEntry' @ [39:54] ==> val whenEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke[LocalVariableDescriptor]

'forEach' @ [39:66] ==> @HidesMembers public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.forEach(action: ((KtWhenEntry..KtWhenEntry?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'it' @ [39:76] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [39:79] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtWhenEntry[JavaMethodDescriptor]

'KtPsiFactory' @ [40:28] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [40:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke[ValueParameterDescriptorImpl]

'createWhenEntry' @ [40:50] ==> public final fun createWhenEntry(entryText: String): KtWhenEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'whenEntry' @ [40:77] ==> val whenEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke[LocalVariableDescriptor]

'expression' @ [40:87] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'text' @ [40:100] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'whenExpression' @ [41:13] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke[LocalVariableDescriptor]

'addBefore' @ [41:28] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtWhenExpression[JavaMethodDescriptor]

'newEntry' @ [41:38] ==> val newEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke[LocalVariableDescriptor]

'whenExpression' @ [41:48] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.invoke[LocalVariableDescriptor]

'closeBrace' @ [41:63] ==> public final val KtWhenExpression.closeBrace: PsiElement?[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [45:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [47:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [47:41] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [47:52] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtWhenConditionIsPattern? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtWhenConditionIsPattern

'RemoveUselessIsCheckFixForWhen' @ [48:20] ==> public constructor RemoveUselessIsCheckFixForWhen(element: KtWhenConditionIsPattern) defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen[ClassConstructorDescriptorImpl]

'expression' @ [48:51] ==> val expression: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.idea.quickfix.RemoveUselessIsCheckFixForWhen.Companion.createAction[LocalVariableDescriptor]

