'AbstractKotlinInspection' @ [30:36] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [32:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [34:35] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.buildVisitor.<no name provided>.visitWhenExpression[ValueParameterDescriptorImpl]

'entries' @ [34:46] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'singleOrNull' @ [34:54] ==> public fun <T> List<(KtWhenEntry..KtWhenEntry?)>.singleOrNull(): KtWhenEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'singleEntry' @ [35:21] ==> val singleEntry: KtWhenEntry? defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.buildVisitor.<no name provided>.visitWhenExpression[LocalVariableDescriptor]

'isElse' @ [35:34] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'expression' @ [37:40] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.buildVisitor.<no name provided>.visitWhenExpression[ValueParameterDescriptorImpl]

'isUsedAsExpression' @ [37:51] ==> public fun KtExpression.isUsedAsExpression(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [37:70] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.buildVisitor.<no name provided>.visitWhenExpression[ValueParameterDescriptorImpl]

'analyze' @ [37:81] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'holder' @ [39:17] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [39:24] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @Nullable vararg p2: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'expression' @ [39:40] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.buildVisitor.<no name provided>.visitWhenExpression[ValueParameterDescriptorImpl]

'SimplifyFix' @ [41:40] ==> public constructor SimplifyFix(isUsedAsExpression: Boolean) defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.SimplifyFix[ClassConstructorDescriptorImpl]

'usedAsExpression' @ [41:52] ==> val usedAsExpression: Boolean defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.buildVisitor.<no name provided>.visitWhenExpression[LocalVariableDescriptor]

'name' @ [50:40] ==> public final val WhenWithOnlyElseInspection.SimplifyFix.name: String[MyPropertyDescriptor]

'descriptor' @ [55:34] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.SimplifyFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [55:45] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getInstance' @ [56:37] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'preparePsiElementForWrite' @ [56:51] ==> public open fun preparePsiElementForWrite(@Nullable p0: PsiElement?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'whenExpression' @ [56:77] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.SimplifyFix.applyFix[LocalVariableDescriptor]

'whenExpression' @ [58:13] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.SimplifyFix.applyFix[LocalVariableDescriptor]

'replaceWithBranch' @ [58:28] ==> public fun KtExpression.replaceWithBranch(branch: KtExpression, isUsedAsExpression: Boolean): Unit defined in org.jetbrains.kotlin.idea.inspections in file ConstantConditionIfInspection.kt[SimpleFunctionDescriptorImpl]

'whenExpression' @ [58:46] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.SimplifyFix.applyFix[LocalVariableDescriptor]

'elseExpression' @ [58:61] ==> public final val KtWhenExpression.elseExpression: KtExpression?[MyPropertyDescriptor]

'isUsedAsExpression' @ [58:87] ==> private final val isUsedAsExpression: Boolean defined in org.jetbrains.kotlin.idea.inspections.WhenWithOnlyElseInspection.SimplifyFix[PropertyDescriptorImpl]

