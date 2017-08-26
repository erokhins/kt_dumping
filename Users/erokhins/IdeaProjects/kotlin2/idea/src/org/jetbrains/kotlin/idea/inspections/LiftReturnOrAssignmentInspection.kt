'AbstractKotlinInspection' @ [29:42] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [32:22] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [34:25] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[ValueParameterDescriptorImpl]

'lineCount' @ [34:36] ==> internal fun KtExpression.lineCount(): Int defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'LINES_LIMIT' @ [34:50] ==> private final val LINES_LIMIT: Int defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.Companion[PropertyDescriptorImpl]

'expression' @ [35:25] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[ValueParameterDescriptorImpl]

'isElseIf' @ [35:36] ==> internal fun KtExpression.isElseIf(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'BranchedFoldingUtils' @ [37:43] ==> public object BranchedFoldingUtils defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file BranchedFoldingUtils.kt[FakeCallableDescriptorForObject]

'getFoldableReturns' @ [37:64] ==> internal final fun getFoldableReturns(expression: KtExpression?): List<KtReturnExpression>? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.BranchedFoldingUtils[SimpleFunctionDescriptorImpl]

'expression' @ [37:83] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[ValueParameterDescriptorImpl]

'foldableReturns' @ [38:25] ==> val foldableReturns: List<KtReturnExpression>? defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[LocalVariableDescriptor]

'isNotEmpty' @ [38:42] ==> @InlineOnly public inline fun <T> Collection<KtReturnExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReturnExpression

'expression' @ [39:47] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[ValueParameterDescriptorImpl]

'anyDescendantOfType' @ [39:58] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtReturnExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReturnExpression

'it' @ [39:100] ==> value-parameter it: KtReturnExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry.<anonymous>[ValueParameterDescriptorImpl]

'foldableReturns' @ [39:107] ==> val foldableReturns: List<KtReturnExpression>? defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[LocalVariableDescriptor]

'holder' @ [40:25] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [40:32] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'keyword' @ [41:33] ==> value-parameter keyword: PsiElement defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[ValueParameterDescriptorImpl]

'keyword' @ [42:65] ==> value-parameter keyword: PsiElement defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[ValueParameterDescriptorImpl]

'text' @ [42:73] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'if (!hasOtherReturns && foldableReturns.size > 1) ProblemHighlightType.GENERIC_ERROR_OR_WARNING
                                else ProblemHighlightType.INFORMATION' @ [43:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ProblemHighlightType, elseBranch: ProblemHighlightType): ProblemHighlightType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ProblemHighlightType

'!' @ [43:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasOtherReturns' @ [43:38] ==> val hasOtherReturns: Boolean defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[LocalVariableDescriptor]

'foldableReturns' @ [43:57] ==> val foldableReturns: List<KtReturnExpression>? defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[LocalVariableDescriptor]

'size' @ [43:73] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [43:104] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'INFORMATION' @ [44:59] ==> enum entry INFORMATION defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'LiftReturnOutFix' @ [45:33] ==> public constructor LiftReturnOutFix(keyword: String) defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.LiftReturnOutFix[ClassConstructorDescriptorImpl]

'keyword' @ [45:50] ==> value-parameter keyword: PsiElement defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[ValueParameterDescriptorImpl]

'text' @ [45:58] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'BranchedFoldingUtils' @ [49:44] ==> public object BranchedFoldingUtils defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file BranchedFoldingUtils.kt[FakeCallableDescriptorForObject]

'getFoldableAssignmentNumber' @ [49:65] ==> internal final fun getFoldableAssignmentNumber(expression: KtExpression?): Int defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.BranchedFoldingUtils[SimpleFunctionDescriptorImpl]

'expression' @ [49:93] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[ValueParameterDescriptorImpl]

'assignmentNumber' @ [50:25] ==> val assignmentNumber: Int defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[LocalVariableDescriptor]

'holder' @ [51:25] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [51:32] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'keyword' @ [52:33] ==> value-parameter keyword: PsiElement defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[ValueParameterDescriptorImpl]

'keyword' @ [53:69] ==> value-parameter keyword: PsiElement defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[ValueParameterDescriptorImpl]

'text' @ [53:77] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'if (assignmentNumber > 1) ProblemHighlightType.GENERIC_ERROR_OR_WARNING
                                else ProblemHighlightType.INFORMATION' @ [54:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ProblemHighlightType, elseBranch: ProblemHighlightType): ProblemHighlightType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ProblemHighlightType

'assignmentNumber' @ [54:37] ==> val assignmentNumber: Int defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[LocalVariableDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [54:80] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'INFORMATION' @ [55:59] ==> enum entry INFORMATION defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'LiftAssignmentOutFix' @ [56:33] ==> public constructor LiftAssignmentOutFix(keyword: String) defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.LiftAssignmentOutFix[ClassConstructorDescriptorImpl]

'keyword' @ [56:54] ==> value-parameter keyword: PsiElement defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfOrWhenOrTry[ValueParameterDescriptorImpl]

'text' @ [56:62] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'super' @ [62:21] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitIfExpression' @ [62:27] ==> public open fun visitIfExpression(@NotNull p0: KtIfExpression): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'expression' @ [62:45] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'visitIfOrWhenOrTry' @ [63:21] ==> private final fun visitIfOrWhenOrTry(expression: KtExpression, keyword: PsiElement): Unit defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [63:40] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'expression' @ [63:52] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'ifKeyword' @ [63:63] ==> public final val KtIfExpression.ifKeyword: PsiElement[MyPropertyDescriptor]

'super' @ [67:21] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitWhenExpression' @ [67:27] ==> public open fun visitWhenExpression(@NotNull p0: KtWhenExpression): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'expression' @ [67:47] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitWhenExpression[ValueParameterDescriptorImpl]

'visitIfOrWhenOrTry' @ [68:21] ==> private final fun visitIfOrWhenOrTry(expression: KtExpression, keyword: PsiElement): Unit defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [68:40] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitWhenExpression[ValueParameterDescriptorImpl]

'expression' @ [68:52] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitWhenExpression[ValueParameterDescriptorImpl]

'whenKeyword' @ [68:63] ==> public final val KtWhenExpression.whenKeyword: PsiElement[MyPropertyDescriptor]

'super' @ [72:21] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitTryExpression' @ [72:27] ==> public open fun visitTryExpression(@NotNull p0: KtTryExpression): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'expression' @ [72:46] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitTryExpression[ValueParameterDescriptorImpl]

'expression' @ [73:21] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitTryExpression[ValueParameterDescriptorImpl]

'tryKeyword' @ [73:32] ==> public final val KtTryExpression.tryKeyword: PsiElement?[MyPropertyDescriptor]

'let' @ [73:44] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'visitIfOrWhenOrTry' @ [74:25] ==> private final fun visitIfOrWhenOrTry(expression: KtExpression, keyword: PsiElement): Unit defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [74:44] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitTryExpression[ValueParameterDescriptorImpl]

'it' @ [74:56] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.buildVisitor.<no name provided>.visitTryExpression.<anonymous>[ValueParameterDescriptorImpl]

'keyword' @ [80:56] ==> private final val keyword: String defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.LiftReturnOutFix[PropertyDescriptorImpl]

'name' @ [82:40] ==> public final val LiftReturnOrAssignmentInspection.LiftReturnOutFix.name: String[MyPropertyDescriptor]

'BranchedFoldingUtils' @ [85:13] ==> public object BranchedFoldingUtils defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file BranchedFoldingUtils.kt[FakeCallableDescriptorForObject]

'foldToReturn' @ [85:34] ==> public final fun foldToReturn(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.BranchedFoldingUtils[SimpleFunctionDescriptorImpl]

'descriptor' @ [85:47] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.LiftReturnOutFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [85:58] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfType' @ [85:69] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'keyword' @ [90:60] ==> private final val keyword: String defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.LiftAssignmentOutFix[PropertyDescriptorImpl]

'name' @ [92:40] ==> public final val LiftReturnOrAssignmentInspection.LiftAssignmentOutFix.name: String[MyPropertyDescriptor]

'BranchedFoldingUtils' @ [95:13] ==> public object BranchedFoldingUtils defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file BranchedFoldingUtils.kt[FakeCallableDescriptorForObject]

'foldToAssignment' @ [95:34] ==> public final fun foldToAssignment(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.BranchedFoldingUtils[SimpleFunctionDescriptorImpl]

'descriptor' @ [95:51] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.LiftReturnOrAssignmentInspection.LiftAssignmentOutFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [95:62] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfType' @ [95:73] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

