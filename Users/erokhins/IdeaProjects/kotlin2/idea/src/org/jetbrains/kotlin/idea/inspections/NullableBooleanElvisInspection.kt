'AbstractKotlinInspection' @ [36:40] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [38:22] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [40:25] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'operationToken' @ [40:36] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ELVIS' @ [40:63] ==> public final val ELVIS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expression' @ [41:31] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'left' @ [41:42] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [42:31] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'right' @ [42:42] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'!' @ [43:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBooleanConstant' @ [43:36] ==> public open fun isBooleanConstant(@Nullable p0: KtExpression?): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'rhs' @ [43:54] ==> val rhs: KtExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'lhs' @ [44:35] ==> val lhs: KtExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'analyze' @ [44:39] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [44:63] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'getType' @ [44:72] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'lhs' @ [44:80] ==> val lhs: KtExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'isNullableType' @ [45:35] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'lhsType' @ [45:50] ==> val lhsType: KotlinType defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'lhsType' @ [45:62] ==> val lhsType: KotlinType defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'isBooleanOrNullableBoolean' @ [45:70] ==> public fun KotlinType.isBooleanOrNullableBoolean(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'getParentOfType' @ [46:59] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtExpressionImpl..KtExpressionImpl?)>..Class<out (KtExpressionImpl..KtExpressionImpl?)>?)): KtExpressionImpl? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtExpressionImpl

'expression' @ [47:33] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'KtIfExpression' @ [47:45] ==> public constructor KtIfExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtIfExpression[JavaClassConstructorDescriptor]

'java' @ [47:67] ==> public val <T> KClass<KtIfExpression>.java: Class<KtIfExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtIfExpression

'KtWhileExpressionBase' @ [47:73] ==> public constructor KtWhileExpressionBase(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtWhileExpressionBase[JavaClassConstructorDescriptor]

'java' @ [47:102] ==> public val <T> KClass<KtWhileExpressionBase>.java: Class<KtWhileExpressionBase> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtWhileExpressionBase

'when (parentIfOrWhile) {
                            is KtIfExpression -> parentIfOrWhile.condition
                            is KtWhileExpressionBase -> parentIfOrWhile.condition
                            else -> null
                        }' @ [48:41] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'parentIfOrWhile' @ [48:47] ==> val parentIfOrWhile: KtExpressionImpl? defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'parentIfOrWhile' @ [49:50] ==> val parentIfOrWhile: KtExpressionImpl? defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'condition' @ [49:66] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'parentIfOrWhile' @ [50:57] ==> val parentIfOrWhile: KtExpressionImpl? defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'condition' @ [50:73] ==> public final val KtWhileExpressionBase.condition: KtExpression?[MyPropertyDescriptor]

'component1' @ [53:30] ==> public final operator fun component1(): ProblemHighlightType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [53:45] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (condition != null && condition in expression.parentsWithSelf)
                            GENERIC_ERROR_OR_WARNING to "should"
                        else
                            INFORMATION to "can"' @ [53:53] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<ProblemHighlightType, String>, elseBranch: Pair<ProblemHighlightType, String>): Pair<ProblemHighlightType, String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<ProblemHighlightType, String>

'condition' @ [53:57] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'condition' @ [53:78] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'expression' @ [53:91] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [53:102] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [54:29] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'INFORMATION' @ [56:29] ==> enum entry INFORMATION defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'holder' @ [58:25] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [58:32] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'expression' @ [58:48] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'verb' @ [59:65] ==> val verb: String defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'highlightType' @ [60:48] ==> val highlightType: ProblemHighlightType defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'ReplaceWithEqualityCheckFix' @ [61:48] ==> public constructor ReplaceWithEqualityCheckFix() defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix[ClassConstructorDescriptorImpl]

'name' @ [68:40] ==> public final val NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.name: String[MyPropertyDescriptor]

'descriptor' @ [71:27] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [71:38] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [72:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [72:42] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'preparePsiElementForWrite' @ [72:56] ==> public open fun preparePsiElementForWrite(@Nullable p0: PsiElement?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'element' @ [72:82] ==> val element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'element' @ [73:17] ==> val element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'operationToken' @ [73:25] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ELVIS' @ [73:52] ==> public final val ELVIS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [74:29] ==> val element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'right' @ [74:37] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'element' @ [75:28] ==> val element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'left' @ [75:36] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'when {
                KtPsiUtil.isTrueConstant(constPart) -> true
                KtPsiUtil.isFalseConstant(constPart) -> false
                else -> return
            }' @ [77:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'isTrueConstant' @ [78:27] ==> public open fun isTrueConstant(@Nullable p0: KtExpression?): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'constPart' @ [78:42] ==> val constPart: KtConstantExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'isFalseConstant' @ [79:27] ==> public open fun isFalseConstant(@Nullable p0: KtExpression?): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'constPart' @ [79:43] ==> val constPart: KtConstantExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'element' @ [82:43] ==> val element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'replaced' @ [82:51] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'KtPsiFactory' @ [82:60] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'constPart' @ [82:73] ==> val constPart: KtConstantExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'buildExpression' @ [82:84] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [83:17] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'exprPart' @ [83:34] ==> val exprPart: KtExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'appendFixedText' @ [84:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'if (constValue) " != false" else " == true"' @ [84:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'constValue' @ [84:37] ==> val constValue: Boolean defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'equalityCheckExpression' @ [86:36] ==> val equalityCheckExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'getParentOfType' @ [86:60] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtPrefixExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtPrefixExpression

'SimplifyNegatedBinaryExpressionIntention' @ [87:30] ==> public constructor SimplifyNegatedBinaryExpressionIntention() defined in org.jetbrains.kotlin.idea.intentions.SimplifyNegatedBinaryExpressionIntention[ClassConstructorDescriptorImpl]

'simplifier' @ [88:17] ==> val simplifier: SimplifyNegatedBinaryExpressionIntention defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'isApplicableTo' @ [88:28] ==> public final fun isApplicableTo(element: KtPrefixExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyNegatedBinaryExpressionIntention[SimpleFunctionDescriptorImpl]

'prefixExpression' @ [88:43] ==> val prefixExpression: KtPrefixExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'simplifier' @ [89:17] ==> val simplifier: SimplifyNegatedBinaryExpressionIntention defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

'applyTo' @ [89:28] ==> public open fun applyTo(element: KtPrefixExpression, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.SimplifyNegatedBinaryExpressionIntention[SimpleFunctionDescriptorImpl]

'prefixExpression' @ [89:36] ==> val prefixExpression: KtPrefixExpression defined in org.jetbrains.kotlin.idea.inspections.NullableBooleanElvisInspection.ReplaceWithEqualityCheckFix.applyFix[LocalVariableDescriptor]

