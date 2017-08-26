'KotlinQuickFixAction<KtCallExpression>' @ [30:46] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtCallExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtCallExpression

'element' @ [30:85] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToPropertyAccessFix.<init>[ValueParameterDescriptorImpl]

'if (isObjectCall) "Remove invocation" else "Change to property access"' @ [32:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isObjectCall' @ [32:40] ==> private final val isObjectCall: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeToPropertyAccessFix[PropertyDescriptorImpl]

'familyName' @ [34:30] ==> public final val ChangeToPropertyAccessFix.familyName: String[MyPropertyDescriptor]

'element' @ [37:23] ==> protected final val element: KtCallExpression? defined in org.jetbrains.kotlin.idea.quickfix.ChangeToPropertyAccessFix[PropertyDescriptorImpl]

'element' @ [38:9] ==> val element: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToPropertyAccessFix.invoke[LocalVariableDescriptor]

'replace' @ [38:17] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtCallExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [38:25] ==> val element: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToPropertyAccessFix.invoke[LocalVariableDescriptor]

'calleeExpression' @ [38:33] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [41:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [43:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeToPropertyAccessFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [43:41] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'parent' @ [43:52] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expression' @ [44:17] ==> val expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToPropertyAccessFix.Companion.createAction[LocalVariableDescriptor]

'valueArguments' @ [44:28] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [44:43] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'expression' @ [45:36] ==> val expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToPropertyAccessFix.Companion.createAction[LocalVariableDescriptor]

'calleeExpression' @ [45:47] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'getCallableDescriptor' @ [45:65] ==> internal fun KtExpression.getCallableDescriptor(): CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'ChangeToPropertyAccessFix' @ [46:24] ==> public constructor ChangeToPropertyAccessFix(element: KtCallExpression, isObjectCall: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ChangeToPropertyAccessFix[ClassConstructorDescriptorImpl]

'expression' @ [46:50] ==> val expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeToPropertyAccessFix.Companion.createAction[LocalVariableDescriptor]

'isObjectCall' @ [46:62] ==> val isObjectCall: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeToPropertyAccessFix.Companion.createAction[LocalVariableDescriptor]

