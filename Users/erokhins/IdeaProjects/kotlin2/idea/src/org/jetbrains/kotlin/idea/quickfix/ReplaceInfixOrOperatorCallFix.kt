'KotlinQuickFixAction<KtExpression>' @ [37:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtExpression

'element' @ [37:40] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.<init>[ValueParameterDescriptorImpl]

'text' @ [41:36] ==> public final val ReplaceInfixOrOperatorCallFix.text: String[MyPropertyDescriptor]

'element' @ [44:23] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [45:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [45:39] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[ValueParameterDescriptorImpl]

'elvisOrEmpty' @ [46:21] ==> public fun elvisOrEmpty(notNullNeeded: Boolean): String defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

'notNullNeeded' @ [46:34] ==> private final val notNullNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix[PropertyDescriptorImpl]

'when (element) {
            is KtArrayAccessExpression -> {
                val assignment = element.getAssignmentByLHS()
                val right = assignment?.right
                val arrayExpression = element.arrayExpression ?: return
                if (assignment != null) {
                    if (right == null) return
                    val newExpression = psiFactory.createExpressionByPattern(
                            "$0?.set($1, $2)", arrayExpression, element.indexExpressions.joinToString(", ") { it.text }, right)
                    assignment.replace(newExpression)
                }
                else {
                    val newExpression = psiFactory.createExpressionByPattern(
                            "$0?.get($1)$elvis", arrayExpression, element.indexExpressions.joinToString(", ") { it.text })
                    replacement = element.replace(newExpression)
                }
            }
            is KtCallExpression -> {
                val newExpression = psiFactory.createExpressionByPattern(
                        "$0?.invoke($1)$elvis", element.calleeExpression ?: return, element.valueArguments.joinToString(", ") { it.text })
                replacement = element.replace(newExpression)
            }
            is KtBinaryExpression -> {
                replacement = if (element.operationToken == KtTokens.IDENTIFIER) {
                    val newExpression = psiFactory.createExpressionByPattern(
                            "$0?.$1($2)$elvis", element.left ?: return, element.operationReference, element.right ?: return)
                    element.replace(newExpression)
                }
                else {
                    val nameExpression = OperatorToFunctionIntention.convert(element).second
                    val callExpression = nameExpression.parent as KtCallExpression
                    val qualifiedExpression = callExpression.parent as KtDotQualifiedExpression
                    val safeExpression = psiFactory.createExpressionByPattern(
                            "$0?.$1$elvis", qualifiedExpression.receiverExpression, callExpression)
                    qualifiedExpression.replace(safeExpression)
                }
            }
        }' @ [48:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'element' @ [48:15] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'element' @ [50:34] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'getAssignmentByLHS' @ [50:42] ==> public fun KtExpression.getAssignmentByLHS(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'assignment' @ [51:29] ==> val assignment: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'right' @ [51:41] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'element' @ [52:39] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'arrayExpression' @ [52:47] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'if (assignment != null) {
                    if (right == null) return
                    val newExpression = psiFactory.createExpressionByPattern(
                            "$0?.set($1, $2)", arrayExpression, element.indexExpressions.joinToString(", ") { it.text }, right)
                    assignment.replace(newExpression)
                }
                else {
                    val newExpression = psiFactory.createExpressionByPattern(
                            "$0?.get($1)$elvis", arrayExpression, element.indexExpressions.joinToString(", ") { it.text })
                    replacement = element.replace(newExpression)
                }' @ [53:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'assignment' @ [53:21] ==> val assignment: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'right' @ [54:25] ==> val right: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'psiFactory' @ [55:41] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [55:52] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'arrayExpression' @ [56:48] ==> val arrayExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'element' @ [56:65] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'indexExpressions' @ [56:73] ==> public final val KtArrayAccessExpression.indexExpressions: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)[MyPropertyDescriptor]

'joinToString' @ [56:90] ==> public fun <T> Iterable<(KtExpression..KtExpression?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtExpression..KtExpression?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'it' @ [56:111] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [56:114] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'right' @ [56:122] ==> val right: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'assignment' @ [57:21] ==> val assignment: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'replace' @ [57:32] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBinaryExpression[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [57:40] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'psiFactory' @ [60:41] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [60:52] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'elvis' @ [61:42] ==> val elvis: String defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'arrayExpression' @ [61:50] ==> val arrayExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'element' @ [61:67] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'indexExpressions' @ [61:75] ==> public final val KtArrayAccessExpression.indexExpressions: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)[MyPropertyDescriptor]

'joinToString' @ [61:92] ==> public fun <T> Iterable<(KtExpression..KtExpression?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtExpression..KtExpression?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'it' @ [61:113] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [61:116] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'replacement' @ [62:21] ==> var replacement: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'element' @ [62:35] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'replace' @ [62:43] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtArrayAccessExpression[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [62:51] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'psiFactory' @ [66:37] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [66:48] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'elvis' @ [67:41] ==> val elvis: String defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'element' @ [67:49] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'calleeExpression' @ [67:57] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [67:85] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'valueArguments' @ [67:93] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'joinToString' @ [67:108] ==> public fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtValueArgument..KtValueArgument?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'it' @ [67:129] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [67:132] ==> public final val KtValueArgument.text: (String..String?)[MyPropertyDescriptor]

'replacement' @ [68:17] ==> var replacement: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'element' @ [68:31] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'replace' @ [68:39] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtCallExpression[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [68:47] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'replacement' @ [71:17] ==> var replacement: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'if (element.operationToken == KtTokens.IDENTIFIER) {
                    val newExpression = psiFactory.createExpressionByPattern(
                            "$0?.$1($2)$elvis", element.left ?: return, element.operationReference, element.right ?: return)
                    element.replace(newExpression)
                }
                else {
                    val nameExpression = OperatorToFunctionIntention.convert(element).second
                    val callExpression = nameExpression.parent as KtCallExpression
                    val qualifiedExpression = callExpression.parent as KtDotQualifiedExpression
                    val safeExpression = psiFactory.createExpressionByPattern(
                            "$0?.$1$elvis", qualifiedExpression.receiverExpression, callExpression)
                    qualifiedExpression.replace(safeExpression)
                }' @ [71:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'element' @ [71:35] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'operationToken' @ [71:43] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'IDENTIFIER' @ [71:70] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'psiFactory' @ [72:41] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [72:52] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'elvis' @ [73:41] ==> val elvis: String defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'element' @ [73:49] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'left' @ [73:57] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [73:73] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'operationReference' @ [73:81] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'element' @ [73:101] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'right' @ [73:109] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'element' @ [74:21] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'replace' @ [74:29] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBinaryExpression[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [74:37] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'OperatorToFunctionIntention' @ [77:42] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention[FakeCallableDescriptorForObject]

'convert' @ [77:70] ==> public final fun convert(element: KtExpression): Pair<KtExpression, KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[DeserializedSimpleFunctionDescriptor]

'element' @ [77:78] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'second' @ [77:87] ==> public final val second: KtSimpleNameExpression defined in kotlin.Pair[DeserializedPropertyDescriptor]

'nameExpression' @ [78:42] ==> val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'parent' @ [78:57] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpression' @ [79:47] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'parent' @ [79:62] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'psiFactory' @ [80:42] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [80:53] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'elvis' @ [81:37] ==> val elvis: String defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'qualifiedExpression' @ [81:45] ==> val qualifiedExpression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'receiverExpression' @ [81:65] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'callExpression' @ [81:85] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'qualifiedExpression' @ [82:21] ==> val qualifiedExpression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'replace' @ [82:41] ==> @NotNull public open fun replace(@NotNull p0: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[JavaMethodDescriptor]

'safeExpression' @ [82:49] ==> val safeExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'notNullNeeded' @ [86:13] ==> private final val notNullNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix[PropertyDescriptorImpl]

'replacement' @ [87:13] ==> var replacement: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[LocalVariableDescriptor]

'moveCaretToEnd' @ [87:26] ==> public fun PsiElement.moveCaretToEnd(editor: Editor?, project: Project): Unit defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

'editor' @ [87:41] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[ValueParameterDescriptorImpl]

'project' @ [87:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.invoke[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [93:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [95:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [95:41] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'expression' @ [96:17] ==> val expression: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'diagnostic' @ [96:58] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[ValueParameterDescriptorImpl]

'factory' @ [96:69] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'UNSAFE_IMPLICIT_INVOKE_CALL' @ [96:87] ==> public final val UNSAFE_IMPLICIT_INVOKE_CALL: (DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'expression' @ [97:21] ==> val expression: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'arrayExpression' @ [97:32] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'ReplaceInfixOrOperatorCallFix' @ [98:24] ==> public constructor ReplaceInfixOrOperatorCallFix(element: KtExpression, notNullNeeded: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix[ClassConstructorDescriptorImpl]

'expression' @ [98:54] ==> val expression: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'expression' @ [98:66] ==> val expression: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'shouldHaveNotNullType' @ [98:77] ==> public fun KtExpression.shouldHaveNotNullType(): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [100:26] ==> val expression: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'parent' @ [100:37] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                is KtBinaryExpression -> {
                    when {
                        parent.left == null || parent.right == null -> null
                        parent.operationToken == KtTokens.EQ -> null
                        parent.operationToken in OperatorConventions.COMPARISON_OPERATIONS -> null
                        else -> ReplaceInfixOrOperatorCallFix(parent, parent.shouldHaveNotNullType())
                    }
                }
                is KtCallExpression -> {
                    when {
                        parent.calleeExpression == null -> null
                        parent.parent is KtQualifiedExpression -> null
                        parent.getResolvedCall(parent.analyze())?.getImplicitReceiverValue() != null -> null
                        else -> ReplaceInfixOrOperatorCallFix(parent, parent.shouldHaveNotNullType())
                    }
                }
                else -> null
            }' @ [101:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IntentionAction?, entry1: IntentionAction?, entry2: IntentionAction?): IntentionAction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IntentionAction?

'parent' @ [101:26] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'when {
                        parent.left == null || parent.right == null -> null
                        parent.operationToken == KtTokens.EQ -> null
                        parent.operationToken in OperatorConventions.COMPARISON_OPERATIONS -> null
                        else -> ReplaceInfixOrOperatorCallFix(parent, parent.shouldHaveNotNullType())
                    }' @ [103:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReplaceInfixOrOperatorCallFix?, entry1: ReplaceInfixOrOperatorCallFix?, entry2: ReplaceInfixOrOperatorCallFix?, entry3: ReplaceInfixOrOperatorCallFix?): ReplaceInfixOrOperatorCallFix?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReplaceInfixOrOperatorCallFix?

'parent' @ [104:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'left' @ [104:32] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'parent' @ [104:48] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'right' @ [104:55] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'parent' @ [105:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'operationToken' @ [105:32] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [105:59] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'parent' @ [106:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'operationToken' @ [106:32] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'COMPARISON_OPERATIONS' @ [106:70] ==> public final val COMPARISON_OPERATIONS: (ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>..ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'ReplaceInfixOrOperatorCallFix' @ [107:33] ==> public constructor ReplaceInfixOrOperatorCallFix(element: KtExpression, notNullNeeded: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix[ClassConstructorDescriptorImpl]

'parent' @ [107:63] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'parent' @ [107:71] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'shouldHaveNotNullType' @ [107:78] ==> public fun KtExpression.shouldHaveNotNullType(): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

'when {
                        parent.calleeExpression == null -> null
                        parent.parent is KtQualifiedExpression -> null
                        parent.getResolvedCall(parent.analyze())?.getImplicitReceiverValue() != null -> null
                        else -> ReplaceInfixOrOperatorCallFix(parent, parent.shouldHaveNotNullType())
                    }' @ [111:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReplaceInfixOrOperatorCallFix?, entry1: ReplaceInfixOrOperatorCallFix?, entry2: ReplaceInfixOrOperatorCallFix?, entry3: ReplaceInfixOrOperatorCallFix?): ReplaceInfixOrOperatorCallFix?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReplaceInfixOrOperatorCallFix?

'parent' @ [112:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'calleeExpression' @ [112:32] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'parent' @ [113:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'parent' @ [113:32] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [114:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'getResolvedCall' @ [114:32] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'parent' @ [114:48] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'analyze' @ [114:55] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getImplicitReceiverValue' @ [114:67] ==> public fun ResolvedCall<*>.getImplicitReceiverValue(): ImplicitReceiver? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'ReplaceInfixOrOperatorCallFix' @ [115:33] ==> public constructor ReplaceInfixOrOperatorCallFix(element: KtExpression, notNullNeeded: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix[ClassConstructorDescriptorImpl]

'parent' @ [115:63] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'parent' @ [115:71] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceInfixOrOperatorCallFix.Companion.createAction[LocalVariableDescriptor]

'shouldHaveNotNullType' @ [115:78] ==> public fun KtExpression.shouldHaveNotNullType(): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

