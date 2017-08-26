'AbstractKotlinInspection' @ [32:29] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [34:22] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [36:21] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitIfExpression' @ [36:27] ==> public open fun visitIfExpression(@NotNull p0: KtIfExpression): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'expression' @ [36:45] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'expression' @ [38:36] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'branches' @ [38:47] ==> public val KtIfExpression.branches: List<KtExpression?> defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'branches' @ [39:25] ==> val branches: List<KtExpression?> defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'size' @ [39:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'expression' @ [40:25] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'isOneLiner' @ [40:36] ==> internal fun KtExpression.isOneLiner(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'branches' @ [42:25] ==> val branches: List<KtExpression?> defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'any' @ [42:34] ==> public inline fun <T> Iterable<KtExpression?>.any(predicate: (KtExpression?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?

'it' @ [43:25] ==> value-parameter it: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [44:25] ==> value-parameter it: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression.<anonymous>[ValueParameterDescriptorImpl]

'lastBlockStatementOrThis' @ [44:28] ==> public fun KtExpression.lastBlockStatementOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [47:25] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'isElseIf' @ [47:36] ==> internal fun KtExpression.isElseIf(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [49:25] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'anyDescendantOfType' @ [49:36] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtExpressionWithLabel) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpressionWithLabel

'it' @ [50:25] ==> value-parameter it: KtExpressionWithLabel defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [50:52] ==> value-parameter it: KtExpressionWithLabel defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [53:52] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'current' @ [54:28] ==> var current: KtIfExpression? defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'current' @ [55:41] ==> var current: KtIfExpression? defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'condition' @ [55:49] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'when (condition) {
                            is KtBinaryExpression -> when (condition.operationToken) {
                                KtTokens.ANDAND, KtTokens.OROR -> return
                            }
                            is KtUnaryExpression -> when (condition.operationToken) {
                                KtTokens.EXCL -> return
                            }
                        }' @ [56:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'condition' @ [56:31] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'when (condition.operationToken) {
                                KtTokens.ANDAND, KtTokens.OROR -> return
                            }' @ [57:54] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'condition' @ [57:60] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'operationToken' @ [57:70] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ANDAND' @ [58:42] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OROR' @ [58:59] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when (condition.operationToken) {
                                KtTokens.EXCL -> return
                            }' @ [60:53] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'condition' @ [60:59] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'operationToken' @ [60:69] ==> public final val KtUnaryExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'EXCL' @ [61:42] ==> public final val EXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'current' @ [64:25] ==> var current: KtIfExpression? defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'current' @ [64:35] ==> var current: KtIfExpression? defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'`else`' @ [64:43] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'holder' @ [67:21] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [67:28] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'expression' @ [68:29] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'ifKeyword' @ [68:40] ==> public final val KtIfExpression.ifKeyword: PsiElement[MyPropertyDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [70:50] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'IntentionWrapper' @ [71:29] ==> public constructor IntentionWrapper(@NotNull p0: IntentionAction, @NotNull p1: PsiFile) defined in com.intellij.codeInspection.IntentionWrapper[JavaClassConstructorDescriptor]

'IfToWhenIntention' @ [71:46] ==> public constructor IfToWhenIntention() defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[ClassConstructorDescriptorImpl]

'expression' @ [71:67] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.CascadeIfInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'containingKtFile' @ [71:78] ==> public final val KtIfExpression.containingKtFile: KtFile[MyPropertyDescriptor]

