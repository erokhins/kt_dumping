'LocalInspectionTool' @ [44:33] ==> public constructor LocalInspectionTool() defined in com.intellij.codeInspection.LocalInspectionTool[JavaClassConstructorDescriptor]

'isOnTheFly' @ [49:13] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[ValueParameterDescriptorImpl]

'file' @ [49:27] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[ValueParameterDescriptorImpl]

'!' @ [49:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ProjectRootsUtil' @ [49:47] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isInProjectSource' @ [49:64] ==> @JvmStatic public final fun isInProjectSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'file' @ [49:82] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[ValueParameterDescriptorImpl]

'file' @ [53:30] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[ValueParameterDescriptorImpl]

'analyzeFullyAndGetResult' @ [53:35] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'analysisResult' @ [54:13] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'isError' @ [54:28] ==> public final fun isError(): Boolean defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'ProcessCanceledException' @ [55:19] ==> public constructor ProcessCanceledException(@NotNull p0: Throwable) defined in com.intellij.openapi.progress.ProcessCanceledException[JavaClassConstructorDescriptor]

'analysisResult' @ [55:44] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'error' @ [55:59] ==> public final val error: Throwable defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'analysisResult' @ [58:27] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'bindingContext' @ [58:42] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'diagnostics' @ [58:57] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'arrayListOf' @ [60:34] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<ProblemDescriptor> /* = ArrayList<ProblemDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ProblemDescriptor

'file' @ [62:31] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[ValueParameterDescriptorImpl]

'importDirectives' @ [62:36] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'filter' @ [62:53] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.filter(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): List<(KtImportDirective..KtImportDirective?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'DeprecatedSymbolUsageFix' @ [62:62] ==> public companion object : KotlinSingleIntentionActionFactory defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix[FakeCallableDescriptorForObject]

'isImportToBeRemoved' @ [62:87] ==> public final fun isImportToBeRemoved(import: KtImportDirective): Boolean defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.Companion[SimpleFunctionDescriptorImpl]

'it' @ [62:107] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile.<anonymous>[ValueParameterDescriptorImpl]

'importsToRemove' @ [63:24] ==> val importsToRemove: List<(KtImportDirective..KtImportDirective?)> defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'RemoveImportFix' @ [64:35] ==> public constructor RemoveImportFix(import: KtImportDirective) defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.RemoveImportFix[ClassConstructorDescriptorImpl]

'import' @ [64:51] ==> val import: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'createProblemDescriptor' @ [65:37] ==> private final fun createProblemDescriptor(element: PsiElement, message: String, fixes: Collection<CleanupFix>, file: KtFile, manager: InspectionManager): ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection[SimpleFunctionDescriptorImpl]

'import' @ [65:61] ==> val import: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'removeImportFix' @ [65:69] ==> val removeImportFix: KotlinCleanupInspection.RemoveImportFix defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'text' @ [65:85] ==> public final val KotlinCleanupInspection.RemoveImportFix.text: String[MyPropertyDescriptor]

'listOf' @ [65:91] ==> public fun <T> listOf(element: KotlinCleanupInspection.RemoveImportFix): List<KotlinCleanupInspection.RemoveImportFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RemoveImportFix

'removeImportFix' @ [65:98] ==> val removeImportFix: KotlinCleanupInspection.RemoveImportFix defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'file' @ [65:116] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[ValueParameterDescriptorImpl]

'manager' @ [65:122] ==> value-parameter manager: InspectionManager defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[ValueParameterDescriptorImpl]

'problemDescriptors' @ [66:13] ==> val problemDescriptors: ArrayList<ProblemDescriptor> /* = ArrayList<ProblemDescriptor> */ defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'add' @ [66:32] ==> public open fun add(element: ProblemDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'problemDescriptor' @ [66:36] ==> val problemDescriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'file' @ [69:9] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [69:14] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiElement

'diagnostics' @ [70:32] ==> val diagnostics: Diagnostics defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'forElement' @ [70:44] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'element' @ [70:55] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile.<anonymous>[ValueParameterDescriptorImpl]

'diagnostic' @ [71:21] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile.<anonymous>[LocalVariableDescriptor]

'isCleanup' @ [71:32] ==> private final fun Diagnostic.isCleanup(): Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection[SimpleFunctionDescriptorImpl]

'diagnostic' @ [72:33] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile.<anonymous>[LocalVariableDescriptor]

'toCleanupFixes' @ [72:44] ==> private final fun Diagnostic.toCleanupFixes(): Collection<CleanupFix> defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection[SimpleFunctionDescriptorImpl]

'fixes' @ [73:25] ==> val fixes: Collection<CleanupFix> defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [73:31] ==> @InlineOnly public inline fun <T> Collection<CleanupFix>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CleanupFix

'problemDescriptors' @ [74:25] ==> val problemDescriptors: ArrayList<ProblemDescriptor> /* = ArrayList<ProblemDescriptor> */ defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'add' @ [74:44] ==> public open fun add(element: ProblemDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'diagnostic' @ [74:48] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile.<anonymous>[LocalVariableDescriptor]

'toProblemDescriptor' @ [74:59] ==> private final fun Diagnostic.toProblemDescriptor(fixes: Collection<CleanupFix>, file: KtFile, manager: InspectionManager): ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection[SimpleFunctionDescriptorImpl]

'fixes' @ [74:79] ==> val fixes: Collection<CleanupFix> defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile.<anonymous>[LocalVariableDescriptor]

'file' @ [74:86] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[ValueParameterDescriptorImpl]

'manager' @ [74:92] ==> value-parameter manager: InspectionManager defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[ValueParameterDescriptorImpl]

'problemDescriptors' @ [80:16] ==> val problemDescriptors: ArrayList<ProblemDescriptor> /* = ArrayList<ProblemDescriptor> */ defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.checkFile[LocalVariableDescriptor]

'toTypedArray' @ [80:35] ==> public inline fun <reified T> Collection<ProblemDescriptor>.toTypedArray(): Array<ProblemDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> ProblemDescriptor

'factory' @ [83:42] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'cleanupDiagnosticsFactories' @ [83:53] ==> private final val cleanupDiagnosticsFactories: Set<(DiagnosticFactoryWithPsiElement<out (PsiElement..PsiElement?), out (AbstractDiagnostic<out (PsiElement..PsiElement?)>..AbstractDiagnostic<out (PsiElement..PsiElement?)>?)>..DiagnosticFactoryWithPsiElement<out (PsiElement..PsiElement?), out (AbstractDiagnostic<out (PsiElement..PsiElement?)>..AbstractDiagnostic<out (PsiElement..PsiElement?)>?)>?)> defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection[PropertyDescriptorImpl]

'isObsoleteLabel' @ [83:84] ==> private final fun Diagnostic.isObsoleteLabel(): Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection[SimpleFunctionDescriptorImpl]

'setOf' @ [85:47] ==> public fun <T> setOf(vararg elements: (DiagnosticFactoryWithPsiElement<out (PsiElement..PsiElement?), out (AbstractDiagnostic<out (PsiElement..PsiElement?)>..AbstractDiagnostic<out (PsiElement..PsiElement?)>?)>..DiagnosticFactoryWithPsiElement<out (PsiElement..PsiElement?), out (AbstractDiagnostic<out (PsiElement..PsiElement?)>..AbstractDiagnostic<out (PsiElement..PsiElement?)>?)>?)): Set<(DiagnosticFactoryWithPsiElement<out (PsiElement..PsiElement?), out (AbstractDiagnostic<out (PsiElement..PsiElement?)>..AbstractDiagnostic<out (PsiElement..PsiElement?)>?)>..DiagnosticFactoryWithPsiElement<out (PsiElement..PsiElement?), out (AbstractDiagnostic<out (PsiElement..PsiElement?)>..AbstractDiagnostic<out (PsiElement..PsiElement?)>?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactoryWithPsiElement<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), out (org.jetbrains.kotlin.diagnostics.AbstractDiagnostic<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>..org.jetbrains.kotlin.diagnostics.AbstractDiagnostic<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactoryWithPsiElement<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), out (org.jetbrains.kotlin.diagnostics.AbstractDiagnostic<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>..org.jetbrains.kotlin.diagnostics.AbstractDiagnostic<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>?)>?)

'MISSING_CONSTRUCTOR_KEYWORD' @ [86:20] ==> public final val MISSING_CONSTRUCTOR_KEYWORD: (DiagnosticFactory0<(KtElement..KtElement?)>..DiagnosticFactory0<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'UNNECESSARY_NOT_NULL_ASSERTION' @ [87:20] ==> public final val UNNECESSARY_NOT_NULL_ASSERTION: (DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'UNNECESSARY_SAFE_CALL' @ [88:20] ==> public final val UNNECESSARY_SAFE_CALL: (DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'USELESS_CAST' @ [89:20] ==> public final val USELESS_CAST: (DiagnosticFactory0<(KtBinaryExpressionWithTypeRHS..KtBinaryExpressionWithTypeRHS?)>..DiagnosticFactory0<(KtBinaryExpressionWithTypeRHS..KtBinaryExpressionWithTypeRHS?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'USELESS_ELVIS' @ [90:20] ==> public final val USELESS_ELVIS: (DiagnosticFactory1<(KtBinaryExpression..KtBinaryExpression?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtBinaryExpression..KtBinaryExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'POSITIONED_VALUE_ARGUMENT_FOR_JAVA_ANNOTATION' @ [91:23] ==> public final val POSITIONED_VALUE_ARGUMENT_FOR_JAVA_ANNOTATION: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'DEPRECATION' @ [92:20] ==> public final val DEPRECATION: (DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'DEPRECATION_ERROR' @ [93:20] ==> public final val DEPRECATION_ERROR: (DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'NON_CONST_VAL_USED_IN_CONSTANT_EXPRESSION' @ [94:20] ==> public final val NON_CONST_VAL_USED_IN_CONSTANT_EXPRESSION: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'OPERATOR_MODIFIER_REQUIRED' @ [95:20] ==> public final val OPERATOR_MODIFIER_REQUIRED: (DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'INFIX_MODIFIER_REQUIRED' @ [96:20] ==> public final val INFIX_MODIFIER_REQUIRED: (DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'CALLABLE_REFERENCE_TO_MEMBER_OR_EXTENSION_WITH_EMPTY_LHS' @ [97:20] ==> public final val CALLABLE_REFERENCE_TO_MEMBER_OR_EXTENSION_WITH_EMPTY_LHS: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'DEPRECATED_TYPE_PARAMETER_SYNTAX' @ [98:20] ==> public final val DEPRECATED_TYPE_PARAMETER_SYNTAX: (DiagnosticFactory0<(KtTypeParameterList..KtTypeParameterList?)>..DiagnosticFactory0<(KtTypeParameterList..KtTypeParameterList?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'MISPLACED_TYPE_PARAMETER_CONSTRAINTS' @ [99:20] ==> public final val MISPLACED_TYPE_PARAMETER_CONSTRAINTS: (DiagnosticFactory0<(KtTypeParameter..KtTypeParameter?)>..DiagnosticFactory0<(KtTypeParameter..KtTypeParameter?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'COMMA_IN_WHEN_CONDITION_WITHOUT_ARGUMENT' @ [100:20] ==> public final val COMMA_IN_WHEN_CONDITION_WITHOUT_ARGUMENT: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'WRONG_EXTERNAL_DECLARATION' @ [101:22] ==> public final val WRONG_EXTERNAL_DECLARATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'YIELD_IS_RESERVED' @ [102:20] ==> public final val YIELD_IS_RESERVED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'psiElement' @ [106:31] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [106:42] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'ReplaceObsoleteLabelSyntaxFix' @ [107:16] ==> public companion object : KotlinSingleIntentionActionFactory defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix[FakeCallableDescriptorForObject]

'looksLikeObsoleteLabel' @ [107:46] ==> public final fun looksLikeObsoleteLabel(entry: KtAnnotationEntry): Boolean defined in org.jetbrains.kotlin.idea.quickfix.ReplaceObsoleteLabelSyntaxFix.Companion[SimpleFunctionDescriptorImpl]

'annotationEntry' @ [107:69] ==> val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.isObsoleteLabel[LocalVariableDescriptor]

'KotlinPsiChecker' @ [111:16] ==> public companion object defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker[FakeCallableDescriptorForObject]

'createQuickFixes' @ [111:33] ==> public final fun createQuickFixes(diagnostic: Diagnostic): Collection<IntentionAction> defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion[DeserializedSimpleFunctionDescriptor]

'this' @ [111:50] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.toCleanupFixes[ReceiverParameterDescriptorImpl]

'filterIsInstance' @ [111:56] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CleanupFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CleanupFix

'IntentionWrapper' @ [114:75] ==> public constructor IntentionWrapper(@NotNull p0: IntentionAction, @NotNull p1: PsiFile) defined in com.intellij.codeInspection.IntentionWrapper[JavaClassConstructorDescriptor]

'intention' @ [114:92] ==> value-parameter intention: IntentionAction defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.Wrapper.<init>[ValueParameterDescriptorImpl]

'file' @ [114:103] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.Wrapper.<init>[ValueParameterDescriptorImpl]

'intention' @ [116:17] ==> public final val intention: IntentionAction defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.Wrapper[PropertyDescriptorImpl]

'isAvailable' @ [116:27] ==> public abstract fun isAvailable(@NotNull p0: Project, p1: (Editor..Editor?), p2: (PsiFile..PsiFile?)): Boolean defined in com.intellij.codeInsight.intention.IntentionAction[JavaMethodDescriptor]

'project' @ [116:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.Wrapper.invoke[ValueParameterDescriptorImpl]

'editor' @ [116:48] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.Wrapper.invoke[ValueParameterDescriptorImpl]

'file' @ [116:56] ==> value-parameter file: PsiFile? defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.Wrapper.invoke[ValueParameterDescriptorImpl]

'super' @ [117:17] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.Wrapper[LazyClassReceiverParameterDescriptor]

'invoke' @ [117:23] ==> public open fun invoke(@NotNull p0: Project, p1: (Editor..Editor?), p2: (PsiFile..PsiFile?)): Unit defined in com.intellij.codeInspection.IntentionWrapper[JavaMethodDescriptor]

'project' @ [117:30] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.Wrapper.invoke[ValueParameterDescriptorImpl]

'editor' @ [117:39] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.Wrapper.invoke[ValueParameterDescriptorImpl]

'file' @ [117:47] ==> value-parameter file: PsiFile? defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.Wrapper.invoke[ValueParameterDescriptorImpl]

'createProblemDescriptor' @ [123:16] ==> private final fun createProblemDescriptor(element: PsiElement, message: String, fixes: Collection<CleanupFix>, file: KtFile, manager: InspectionManager): ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection[SimpleFunctionDescriptorImpl]

'psiElement' @ [123:40] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'render' @ [123:73] ==> @NotNull public open fun render(@NotNull p0: Diagnostic): String defined in org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages[JavaMethodDescriptor]

'this' @ [123:80] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.toProblemDescriptor[ReceiverParameterDescriptorImpl]

'fixes' @ [123:87] ==> value-parameter fixes: Collection<CleanupFix> defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.toProblemDescriptor[ValueParameterDescriptorImpl]

'file' @ [123:94] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.toProblemDescriptor[ValueParameterDescriptorImpl]

'manager' @ [123:100] ==> value-parameter manager: InspectionManager defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.toProblemDescriptor[ValueParameterDescriptorImpl]

'manager' @ [127:16] ==> value-parameter manager: InspectionManager defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.createProblemDescriptor[ValueParameterDescriptorImpl]

'createProblemDescriptor' @ [127:24] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @NotNull @Nls p1: String, p2: Boolean, p3: (Array<(LocalQuickFix..LocalQuickFix?)>..Array<out (LocalQuickFix..LocalQuickFix?)>?), @NotNull p4: ProblemHighlightType): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'element' @ [127:48] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.createProblemDescriptor[ValueParameterDescriptorImpl]

'message' @ [128:48] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.createProblemDescriptor[ValueParameterDescriptorImpl]

'fixes' @ [130:48] ==> value-parameter fixes: Collection<CleanupFix> defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.createProblemDescriptor[ValueParameterDescriptorImpl]

'map' @ [130:54] ==> public inline fun <T, R> Iterable<CleanupFix>.map(transform: (CleanupFix) -> KotlinCleanupInspection.Wrapper): List<KotlinCleanupInspection.Wrapper> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CleanupFix
    <R> -> Wrapper

'Wrapper' @ [130:60] ==> public constructor Wrapper(intention: IntentionAction, file: KtFile) defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.Wrapper[ClassConstructorDescriptorImpl]

'it' @ [130:68] ==> value-parameter it: CleanupFix defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.createProblemDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [130:72] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.createProblemDescriptor[ValueParameterDescriptorImpl]

'toTypedArray' @ [130:80] ==> public inline fun <reified T> Collection<KotlinCleanupInspection.Wrapper>.toTypedArray(): Array<KotlinCleanupInspection.Wrapper> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Wrapper

'GENERIC_ERROR_OR_WARNING' @ [131:69] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'KotlinQuickFixAction<KtImportDirective>' @ [134:64] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtImportDirective) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtImportDirective

'import' @ [134:104] ==> value-parameter import: KtImportDirective defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.RemoveImportFix.<init>[ValueParameterDescriptorImpl]

'familyName' @ [136:34] ==> public final val KotlinCleanupInspection.RemoveImportFix.familyName: String[MyPropertyDescriptor]

'element' @ [139:13] ==> protected final val element: KtImportDirective? defined in org.jetbrains.kotlin.idea.inspections.KotlinCleanupInspection.RemoveImportFix[PropertyDescriptorImpl]

'delete' @ [139:22] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtImportDirective[JavaMethodDescriptor]

