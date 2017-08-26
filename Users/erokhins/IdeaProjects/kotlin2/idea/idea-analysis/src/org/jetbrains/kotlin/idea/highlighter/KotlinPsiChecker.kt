'element' @ [58:20] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[ValueParameterDescriptorImpl]

'containingFile' @ [58:28] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'!' @ [60:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinHighlightingUtil' @ [60:14] ==> public object KotlinHighlightingUtil defined in org.jetbrains.kotlin.idea.highlighter in file KotlinHighlightingUtil.kt[FakeCallableDescriptorForObject]

'shouldHighlight' @ [60:37] ==> public final fun shouldHighlight(psiElement: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingUtil[SimpleFunctionDescriptorImpl]

'file' @ [60:53] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[LocalVariableDescriptor]

'file' @ [62:30] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[LocalVariableDescriptor]

'analyzeFullyAndGetResult' @ [62:35] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'analysisResult' @ [63:13] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[LocalVariableDescriptor]

'isError' @ [63:28] ==> public final fun isError(): Boolean defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'ProcessCanceledException' @ [64:19] ==> public constructor ProcessCanceledException(@NotNull p0: Throwable) defined in com.intellij.openapi.progress.ProcessCanceledException[JavaClassConstructorDescriptor]

'analysisResult' @ [64:44] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[LocalVariableDescriptor]

'error' @ [64:59] ==> public final val error: Throwable defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'analysisResult' @ [67:30] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[LocalVariableDescriptor]

'bindingContext' @ [67:45] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'getAfterAnalysisVisitor' @ [69:9] ==> private final fun getAfterAnalysisVisitor(holder: AnnotationHolder, bindingContext: BindingContext): Array<AfterAnalysisHighlightingVisitor> defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion[SimpleFunctionDescriptorImpl]

'holder' @ [69:33] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[ValueParameterDescriptorImpl]

'bindingContext' @ [69:41] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[LocalVariableDescriptor]

'forEach' @ [69:57] ==> public inline fun <T> Array<out AfterAnalysisHighlightingVisitor>.forEach(action: (AfterAnalysisHighlightingVisitor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AfterAnalysisHighlightingVisitor

'element' @ [69:78] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[ValueParameterDescriptorImpl]

'accept' @ [69:86] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'visitor' @ [69:93] ==> value-parameter visitor: AfterAnalysisHighlightingVisitor defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate.<anonymous>[ValueParameterDescriptorImpl]

'annotateElement' @ [71:9] ==> public final fun annotateElement(element: PsiElement, holder: AnnotationHolder, diagnostics: Diagnostics): Unit defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker[SimpleFunctionDescriptorImpl]

'element' @ [71:25] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[ValueParameterDescriptorImpl]

'holder' @ [71:34] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[ValueParameterDescriptorImpl]

'bindingContext' @ [71:42] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotate[LocalVariableDescriptor]

'diagnostics' @ [71:57] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'file' @ [75:16] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.isForceHighlightParents[ValueParameterDescriptorImpl]

'diagnostics' @ [81:37] ==> value-parameter diagnostics: Diagnostics defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement[ValueParameterDescriptorImpl]

'forElement' @ [81:49] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'element' @ [81:60] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement[ValueParameterDescriptorImpl]

'element' @ [83:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement[ValueParameterDescriptorImpl]

'diagnostics' @ [84:30] ==> value-parameter diagnostics: Diagnostics defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement[ValueParameterDescriptorImpl]

'any' @ [84:42] ==> public inline fun <T> Iterable<Diagnostic>.any(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [84:48] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [84:51] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'UNRESOLVED_REFERENCE' @ [84:69] ==> public final val UNRESOLVED_REFERENCE: (DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'element' @ [85:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement[ValueParameterDescriptorImpl]

'putUserData' @ [85:21] ==> public abstract fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'UNRESOLVED_KEY' @ [85:33] ==> private final val UNRESOLVED_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion[PropertyDescriptorImpl]

'if (unresolved) Unit else null' @ [85:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'unresolved' @ [85:53] ==> val unresolved: Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement[LocalVariableDescriptor]

'Unit' @ [85:65] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'diagnosticsForElement' @ [88:13] ==> val diagnosticsForElement: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement[LocalVariableDescriptor]

'isEmpty' @ [88:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'KotlinHighlightingUtil' @ [90:13] ==> public object KotlinHighlightingUtil defined in org.jetbrains.kotlin.idea.highlighter in file KotlinHighlightingUtil.kt[FakeCallableDescriptorForObject]

'shouldHighlightErrors' @ [90:36] ==> public final fun shouldHighlightErrors(psiElement: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingUtil[SimpleFunctionDescriptorImpl]

'element' @ [90:58] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement[ValueParameterDescriptorImpl]

'ElementAnnotator' @ [91:13] ==> public constructor ElementAnnotator(element: PsiElement, holder: AnnotationHolder, shouldSuppressUnusedParameter: (KtParameter) -> Boolean) defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator[ClassConstructorDescriptorImpl]

'element' @ [91:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement[ValueParameterDescriptorImpl]

'holder' @ [91:39] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement[ValueParameterDescriptorImpl]

'shouldSuppressUnusedParameter' @ [91:58] ==> protected open fun shouldSuppressUnusedParameter(parameter: KtParameter): Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker[SimpleFunctionDescriptorImpl]

'param' @ [91:88] ==> value-parameter param: KtParameter defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement.<anonymous>[ValueParameterDescriptorImpl]

'registerDiagnosticsAnnotations' @ [91:98] ==> public final fun registerDiagnosticsAnnotations(diagnostics: Collection<Diagnostic>): Unit defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator[SimpleFunctionDescriptorImpl]

'diagnosticsForElement' @ [91:129] ==> val diagnosticsForElement: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.annotateElement[LocalVariableDescriptor]

'arrayOf' @ [96:105] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: AfterAnalysisHighlightingVisitor): Array<AfterAnalysisHighlightingVisitor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> AfterAnalysisHighlightingVisitor

'PropertiesHighlightingVisitor' @ [97:17] ==> public constructor PropertiesHighlightingVisitor(holder: AnnotationHolder, bindingContext: BindingContext) defined in org.jetbrains.kotlin.idea.highlighter.PropertiesHighlightingVisitor[ClassConstructorDescriptorImpl]

'holder' @ [97:47] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion.getAfterAnalysisVisitor[ValueParameterDescriptorImpl]

'bindingContext' @ [97:55] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion.getAfterAnalysisVisitor[ValueParameterDescriptorImpl]

'FunctionsHighlightingVisitor' @ [98:17] ==> public constructor FunctionsHighlightingVisitor(holder: AnnotationHolder, bindingContext: BindingContext) defined in org.jetbrains.kotlin.idea.highlighter.FunctionsHighlightingVisitor[ClassConstructorDescriptorImpl]

'holder' @ [98:46] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion.getAfterAnalysisVisitor[ValueParameterDescriptorImpl]

'bindingContext' @ [98:54] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion.getAfterAnalysisVisitor[ValueParameterDescriptorImpl]

'VariablesHighlightingVisitor' @ [99:17] ==> public constructor VariablesHighlightingVisitor(holder: AnnotationHolder, bindingContext: BindingContext) defined in org.jetbrains.kotlin.idea.highlighter.VariablesHighlightingVisitor[ClassConstructorDescriptorImpl]

'holder' @ [99:46] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion.getAfterAnalysisVisitor[ValueParameterDescriptorImpl]

'bindingContext' @ [99:54] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion.getAfterAnalysisVisitor[ValueParameterDescriptorImpl]

'TypeKindHighlightingVisitor' @ [100:17] ==> public constructor TypeKindHighlightingVisitor(holder: AnnotationHolder, bindingContext: BindingContext) defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[ClassConstructorDescriptorImpl]

'holder' @ [100:45] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion.getAfterAnalysisVisitor[ValueParameterDescriptorImpl]

'bindingContext' @ [100:53] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion.getAfterAnalysisVisitor[ValueParameterDescriptorImpl]

'createQuickFixes' @ [104:17] ==> private fun createQuickFixes(similarDiagnostics: Collection<Diagnostic>): MultiMap<Diagnostic, IntentionAction> defined in org.jetbrains.kotlin.idea.highlighter in file KotlinPsiChecker.kt[SimpleFunctionDescriptorImpl]

'listOfNotNull' @ [104:34] ==> public fun <T : Any> listOfNotNull(element: Diagnostic?): List<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Diagnostic

'diagnostic' @ [104:48] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion.createQuickFixes[ValueParameterDescriptorImpl]

'diagnostic' @ [104:61] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion.createQuickFixes[ValueParameterDescriptorImpl]

'Key' @ [106:38] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'element' @ [108:65] ==> value-parameter element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion.wasUnresolved[ValueParameterDescriptorImpl]

'getUserData' @ [108:73] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Unit..Unit?)>): Unit? defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'UNRESOLVED_KEY' @ [108:85] ==> private final val UNRESOLVED_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.highlighter.KotlinPsiChecker.Companion[PropertyDescriptorImpl]

'similarDiagnostics' @ [113:17] ==> value-parameter similarDiagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[ValueParameterDescriptorImpl]

'minBy' @ [113:36] ==> public inline fun <T, R : Comparable<String>> Iterable<Diagnostic>.minBy(selector: (Diagnostic) -> String): Diagnostic? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R : Comparable<R>> -> String

'it' @ [113:44] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [113:47] ==> public open fun toString(): String defined in org.jetbrains.kotlin.diagnostics.Diagnostic[DeserializedSimpleFunctionDescriptor]

'similarDiagnostics' @ [114:19] ==> value-parameter similarDiagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[ValueParameterDescriptorImpl]

'first' @ [114:38] ==> public fun <T> Iterable<Diagnostic>.first(): Diagnostic defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'factory' @ [114:46] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'MultiMap' @ [116:19] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Diagnostic
    <V : (Any..Any?)> -> IntentionAction

'QuickFixes' @ [118:37] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[FakeCallableDescriptorForObject]

'getInstance' @ [118:48] ==> public final fun getInstance(): QuickFixes defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.Companion[SimpleFunctionDescriptorImpl]

'getActionFactories' @ [118:62] ==> public final fun getActionFactories(diagnosticFactory: DiagnosticFactory<*>): Collection<KotlinIntentionActionsFactory> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[SimpleFunctionDescriptorImpl]

'factory' @ [118:81] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'intentionActionsFactories' @ [119:37] ==> val intentionActionsFactories: Collection<KotlinIntentionActionsFactory> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'intentionActionsFactory' @ [120:34] ==> val intentionActionsFactory: KotlinIntentionActionsFactory defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'createActionsForAllProblems' @ [120:58] ==> public final fun createActionsForAllProblems(sameTypeDiagnostics: Collection<Diagnostic>): List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[SimpleFunctionDescriptorImpl]

'similarDiagnostics' @ [120:86] ==> value-parameter similarDiagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[ValueParameterDescriptorImpl]

'if (!allProblemsActions.isEmpty()) {
            actions.putValues(first, allProblemsActions)
        }
        else {
            for (diagnostic in similarDiagnostics) {
                actions.putValues(diagnostic, intentionActionsFactory.createActions(diagnostic))
            }
        }' @ [121:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [121:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allProblemsActions' @ [121:14] ==> val allProblemsActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'isEmpty' @ [121:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'actions' @ [122:13] ==> val actions: MultiMap<Diagnostic, IntentionAction> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'putValues' @ [122:21] ==> public open fun putValues(p0: (Diagnostic..Diagnostic?), @NotNull p1: (MutableCollection<out (IntentionAction..IntentionAction?)>..Collection<(IntentionAction..IntentionAction?)>)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'first' @ [122:31] ==> val first: Diagnostic? defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'allProblemsActions' @ [122:38] ==> val allProblemsActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'similarDiagnostics' @ [125:32] ==> value-parameter similarDiagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[ValueParameterDescriptorImpl]

'actions' @ [126:17] ==> val actions: MultiMap<Diagnostic, IntentionAction> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'putValues' @ [126:25] ==> public open fun putValues(p0: (Diagnostic..Diagnostic?), @NotNull p1: (MutableCollection<out (IntentionAction..IntentionAction?)>..Collection<(IntentionAction..IntentionAction?)>)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'diagnostic' @ [126:35] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'intentionActionsFactory' @ [126:47] ==> val intentionActionsFactory: KotlinIntentionActionsFactory defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'createActions' @ [126:71] ==> public final fun createActions(diagnostic: Diagnostic): List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[SimpleFunctionDescriptorImpl]

'diagnostic' @ [126:85] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'similarDiagnostics' @ [131:24] ==> value-parameter similarDiagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[ValueParameterDescriptorImpl]

'actions' @ [132:9] ==> val actions: MultiMap<Diagnostic, IntentionAction> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'putValues' @ [132:17] ==> public open fun putValues(p0: (Diagnostic..Diagnostic?), @NotNull p1: (MutableCollection<out (IntentionAction..IntentionAction?)>..Collection<(IntentionAction..IntentionAction?)>)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'diagnostic' @ [132:27] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'getInstance' @ [132:50] ==> public final fun getInstance(): QuickFixes defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.Companion[SimpleFunctionDescriptorImpl]

'getActions' @ [132:64] ==> public final fun getActions(diagnosticFactory: DiagnosticFactory<*>): Collection<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[SimpleFunctionDescriptorImpl]

'diagnostic' @ [132:75] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'factory' @ [132:86] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'actions' @ [135:5] ==> val actions: MultiMap<Diagnostic, IntentionAction> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'values' @ [135:13] ==> @NotNull public open fun values(): (MutableCollection<out (IntentionAction..IntentionAction?)>..Collection<(IntentionAction..IntentionAction?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'forEach' @ [135:22] ==> @HidesMembers public inline fun <T> Iterable<(IntentionAction..IntentionAction?)>.forEach(action: ((IntentionAction..IntentionAction?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInsight.intention.IntentionAction..com.intellij.codeInsight.intention.IntentionAction?)

'NoDeclarationDescriptorsChecker' @ [135:32] ==> private object NoDeclarationDescriptorsChecker defined in org.jetbrains.kotlin.idea.highlighter in file KotlinPsiChecker.kt[FakeCallableDescriptorForObject]

'check' @ [135:64] ==> public final fun check(quickFixClass: Class<*>): Unit defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker[SimpleFunctionDescriptorImpl]

'it' @ [135:70] ==> value-parameter it: (IntentionAction..IntentionAction?) defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [135:80] ==> public val <T> KClass<out (IntentionAction..IntentionAction?)>.java: Class<out (IntentionAction..IntentionAction?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out (com.intellij.codeInsight.intention.IntentionAction..com.intellij.codeInsight.intention.IntentionAction?))

'actions' @ [137:12] ==> val actions: MultiMap<Diagnostic, IntentionAction> defined in org.jetbrains.kotlin.idea.highlighter.createQuickFixes[LocalVariableDescriptor]

'getInstance' @ [141:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'NoDeclarationDescriptorsChecker' @ [141:42] ==> private object NoDeclarationDescriptorsChecker defined in org.jetbrains.kotlin.idea.highlighter in file KotlinPsiChecker.kt[FakeCallableDescriptorForObject]

'java' @ [141:81] ==> public val <T> KClass<NoDeclarationDescriptorsChecker>.java: Class<NoDeclarationDescriptorsChecker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NoDeclarationDescriptorsChecker

'synchronizedSet' @ [143:54] ==> public open fun <T : (Any..Any?)> synchronizedSet(p0: (MutableSet<(Class<*>..Class<*>?)>..Set<(Class<*>..Class<*>?)>?)): (MutableSet<(Class<*>..Class<*>?)>..Set<(Class<*>..Class<*>?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.lang.Class<*>..java.lang.Class<*>?)

'HashSet' @ [143:70] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Class<*>

'!' @ [146:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkedQuickFixClasses' @ [146:14] ==> private final val checkedQuickFixClasses: (MutableSet<(Class<*>..Class<*>?)>..Set<(Class<*>..Class<*>?)>?) defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker[PropertyDescriptorImpl]

'add' @ [146:37] ==> public abstract fun add(element: (Class<*>..Class<*>?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'quickFixClass' @ [146:41] ==> value-parameter quickFixClass: Class<*> defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.check[ValueParameterDescriptorImpl]

'quickFixClass' @ [148:23] ==> value-parameter quickFixClass: Class<*> defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.check[ValueParameterDescriptorImpl]

'declaredFields' @ [148:37] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.declaredFields: (Array<(Field..Field?)>..Array<out (Field..Field?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'checkType' @ [149:13] ==> private final fun checkType(type: Type, field: Field): Unit defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker[SimpleFunctionDescriptorImpl]

'field' @ [149:23] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.check[LocalVariableDescriptor]

'genericType' @ [149:29] ==> public final val Field.genericType: (Type..Type?)[MyPropertyDescriptor]

'field' @ [149:42] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.check[LocalVariableDescriptor]

'quickFixClass' @ [152:9] ==> value-parameter quickFixClass: Class<*> defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.check[ValueParameterDescriptorImpl]

'superclass' @ [152:23] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.superclass: (Class<out Any?>..Class<out Any?>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'let' @ [152:35] ==> @InlineOnly public inline fun <T, R> Class<out Any?>.let(block: (Class<out Any?>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out Any?>
    <R> -> Unit

'check' @ [152:41] ==> public final fun check(quickFixClass: Class<*>): Unit defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker[SimpleFunctionDescriptorImpl]

'it' @ [152:47] ==> value-parameter it: Class<out Any?> defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'when (type) {
            is Class<*> -> {
                if (DeclarationDescriptor::class.java.isAssignableFrom(type) || KotlinType::class.java.isAssignableFrom(type)) {
                    LOG.error("QuickFix class ${field.declaringClass.name} contains field ${field.name} that holds ${type.simpleName}. "
                              + "This leads to holding too much memory through this quick-fix instance. "
                              + "Possible solution can be wrapping it using KotlinIntentionActionFactoryWithDelegate.")
                }

                if (IntentionAction::class.java.isAssignableFrom(type)) {
                    check(type)
                }

            }

            is GenericArrayType -> checkType(type.genericComponentType, field)

            is ParameterizedType -> {
                if (Collection::class.java.isAssignableFrom(type.rawType as Class<*>)) {
                    type.actualTypeArguments.forEach { checkType(it, field) }
                }
            }

            is WildcardType -> type.upperBounds.forEach { checkType(it, field) }
        }' @ [156:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'type' @ [156:15] ==> value-parameter type: Type defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'java' @ [158:50] ==> public val <T> KClass<DeclarationDescriptor>.java: Class<DeclarationDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'isAssignableFrom' @ [158:55] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'type' @ [158:72] ==> value-parameter type: Type defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'KotlinType' @ [158:81] ==> private constructor KotlinType() defined in org.jetbrains.kotlin.types.KotlinType[DeserializedClassConstructorDescriptor]

'java' @ [158:99] ==> public val <T> KClass<KotlinType>.java: Class<KotlinType> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinType

'isAssignableFrom' @ [158:104] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'type' @ [158:121] ==> value-parameter type: Type defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'LOG' @ [159:21] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker[PropertyDescriptorImpl]

'error' @ [159:25] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [159:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'field' @ [159:49] ==> value-parameter field: Field defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'declaringClass' @ [159:55] ==> public final val Field.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'name' @ [159:70] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'field' @ [159:93] ==> value-parameter field: Field defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'name' @ [159:99] ==> public final val Field.name: (String..String?)[MyPropertyDescriptor]

'type' @ [159:118] ==> value-parameter type: Type defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'simpleName' @ [159:123] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'java' @ [164:44] ==> public val <T> KClass<IntentionAction>.java: Class<IntentionAction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntentionAction

'isAssignableFrom' @ [164:49] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'type' @ [164:66] ==> value-parameter type: Type defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'check' @ [165:21] ==> public final fun check(quickFixClass: Class<*>): Unit defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker[SimpleFunctionDescriptorImpl]

'type' @ [165:27] ==> value-parameter type: Type defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'checkType' @ [170:36] ==> private final fun checkType(type: Type, field: Field): Unit defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker[SimpleFunctionDescriptorImpl]

'type' @ [170:46] ==> value-parameter type: Type defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'genericComponentType' @ [170:51] ==> public final val GenericArrayType.genericComponentType: (Type..Type?)[MyPropertyDescriptor]

'field' @ [170:73] ==> value-parameter field: Field defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'java' @ [173:39] ==> public val <T> KClass<Collection<*>>.java: Class<Collection<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Collection<*>

'isAssignableFrom' @ [173:44] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'type' @ [173:61] ==> value-parameter type: Type defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'rawType' @ [173:66] ==> public final val ParameterizedType.rawType: (Type..Type?)[MyPropertyDescriptor]

'type' @ [174:21] ==> value-parameter type: Type defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'actualTypeArguments' @ [174:26] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'forEach' @ [174:46] ==> public inline fun <T> Array<out (Type..Type?)>.forEach(action: ((Type..Type?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'checkType' @ [174:56] ==> private final fun checkType(type: Type, field: Field): Unit defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker[SimpleFunctionDescriptorImpl]

'it' @ [174:66] ==> value-parameter it: (Type..Type?) defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType.<anonymous>[ValueParameterDescriptorImpl]

'field' @ [174:70] ==> value-parameter field: Field defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'type' @ [178:32] ==> value-parameter type: Type defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'upperBounds' @ [178:37] ==> public final val WildcardType.upperBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'forEach' @ [178:49] ==> public inline fun <T> Array<out (Type..Type?)>.forEach(action: ((Type..Type?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'checkType' @ [178:59] ==> private final fun checkType(type: Type, field: Field): Unit defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker[SimpleFunctionDescriptorImpl]

'it' @ [178:69] ==> value-parameter it: (Type..Type?) defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType.<anonymous>[ValueParameterDescriptorImpl]

'field' @ [178:73] ==> value-parameter field: Field defined in org.jetbrains.kotlin.idea.highlighter.NoDeclarationDescriptorsChecker.checkType[ValueParameterDescriptorImpl]

'diagnostics' @ [187:9] ==> value-parameter diagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticsAnnotations[ValueParameterDescriptorImpl]

'groupBy' @ [187:21] ==> public inline fun <T, K> Iterable<Diagnostic>.groupBy(keySelector: (Diagnostic) -> DiagnosticFactory<*>): Map<DiagnosticFactory<*>, List<Diagnostic>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <K> -> DiagnosticFactory<*>

'it' @ [187:31] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticsAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [187:34] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'forEach' @ [187:44] ==> @HidesMembers public inline fun <K, V> Map<out DiagnosticFactory<*>, List<Diagnostic>>.forEach(action: (Map.Entry<DiagnosticFactory<*>, List<Diagnostic>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DiagnosticFactory<*>
    <V> -> List<Diagnostic>

'registerDiagnosticAnnotations' @ [187:63] ==> private final fun registerDiagnosticAnnotations(diagnostics: List<Diagnostic>): Unit defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator[SimpleFunctionDescriptorImpl]

'group' @ [187:93] ==> value-parameter group: Map.Entry<DiagnosticFactory<*>, List<Diagnostic>> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticsAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [187:99] ==> public abstract val value: List<Diagnostic> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assert' @ [191:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'diagnostics' @ [191:16] ==> value-parameter diagnostics: List<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[ValueParameterDescriptorImpl]

'isNotEmpty' @ [191:28] ==> @InlineOnly public inline fun <T> Collection<Diagnostic>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'diagnostics' @ [193:32] ==> value-parameter diagnostics: List<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[ValueParameterDescriptorImpl]

'filter' @ [193:44] ==> public inline fun <T> Iterable<Diagnostic>.filter(predicate: (Diagnostic) -> Boolean): List<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [193:53] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [193:56] ==> public final val Diagnostic.isValid: Boolean[MyPropertyDescriptor]

'validDiagnostics' @ [194:13] ==> val validDiagnostics: List<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'isEmpty' @ [194:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'diagnostics' @ [196:26] ==> value-parameter diagnostics: List<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[ValueParameterDescriptorImpl]

'first' @ [196:38] ==> public fun <T> List<Diagnostic>.first(): Diagnostic defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'diagnostic' @ [197:23] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'factory' @ [197:34] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'assert' @ [199:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'diagnostics' @ [199:16] ==> value-parameter diagnostics: List<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[ValueParameterDescriptorImpl]

'all' @ [199:28] ==> public inline fun <T> Iterable<Diagnostic>.all(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [199:34] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'psiElement' @ [199:37] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'element' @ [199:51] ==> private final val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator[PropertyDescriptorImpl]

'it' @ [199:62] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [199:65] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'factory' @ [199:76] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'diagnostic' @ [201:22] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'textRanges' @ [201:33] ==> public final val Diagnostic.textRanges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>)[MyPropertyDescriptor]

'when (factory.severity) {
            Severity.ERROR -> {
                when (factory) {
                    in Errors.UNRESOLVED_REFERENCE_DIAGNOSTICS -> {
                        val referenceExpression = element as KtReferenceExpression
                        val reference = referenceExpression.mainReference
                        if (reference is MultiRangeReference) {
                            AnnotationPresentationInfo(
                                    ranges = reference.ranges.map { it.shiftRight(referenceExpression.textOffset) },
                                    highlightType = ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                        }
                        else {
                            AnnotationPresentationInfo(ranges, highlightType = ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                        }
                    }

                    Errors.ILLEGAL_ESCAPE -> AnnotationPresentationInfo(ranges, textAttributes = KotlinHighlightingColors.INVALID_STRING_ESCAPE)

                    Errors.REDECLARATION -> AnnotationPresentationInfo(
                            ranges = listOf(diagnostic.textRanges.first()), nonDefaultMessage = "")

                    else -> {
                        AnnotationPresentationInfo(
                                ranges,
                                highlightType = if (factory == Errors.INVISIBLE_REFERENCE)
                                    ProblemHighlightType.LIKE_UNKNOWN_SYMBOL
                                else
                                    null)
                    }
                }
            }
            Severity.WARNING -> {
                if (factory == Errors.UNUSED_PARAMETER && shouldSuppressUnusedParameter(element as KtParameter)) {
                    return
                }

                AnnotationPresentationInfo(
                        ranges,
                        textAttributes = when (factory) {
                            Errors.DEPRECATION -> CodeInsightColors.DEPRECATED_ATTRIBUTES
                            Errors.UNUSED_ANONYMOUS_PARAMETER -> CodeInsightColors.WEAK_WARNING_ATTRIBUTES
                            else -> null
                        },
                        highlightType = when (factory) {
                            in Errors.UNUSED_ELEMENT_DIAGNOSTICS -> ProblemHighlightType.LIKE_UNUSED_SYMBOL
                            Errors.UNUSED_ANONYMOUS_PARAMETER -> ProblemHighlightType.WEAK_WARNING
                            else -> null
                        }
                )
            }
            Severity.INFO -> AnnotationPresentationInfo(ranges, highlightType = ProblemHighlightType.INFORMATION)
        }' @ [203:60] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AnnotationPresentationInfo, entry1: AnnotationPresentationInfo, entry2: AnnotationPresentationInfo): AnnotationPresentationInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AnnotationPresentationInfo

'factory' @ [203:66] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'severity' @ [203:74] ==> public final val <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.severity: Severity[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'ERROR' @ [204:22] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'when (factory) {
                    in Errors.UNRESOLVED_REFERENCE_DIAGNOSTICS -> {
                        val referenceExpression = element as KtReferenceExpression
                        val reference = referenceExpression.mainReference
                        if (reference is MultiRangeReference) {
                            AnnotationPresentationInfo(
                                    ranges = reference.ranges.map { it.shiftRight(referenceExpression.textOffset) },
                                    highlightType = ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                        }
                        else {
                            AnnotationPresentationInfo(ranges, highlightType = ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                        }
                    }

                    Errors.ILLEGAL_ESCAPE -> AnnotationPresentationInfo(ranges, textAttributes = KotlinHighlightingColors.INVALID_STRING_ESCAPE)

                    Errors.REDECLARATION -> AnnotationPresentationInfo(
                            ranges = listOf(diagnostic.textRanges.first()), nonDefaultMessage = "")

                    else -> {
                        AnnotationPresentationInfo(
                                ranges,
                                highlightType = if (factory == Errors.INVISIBLE_REFERENCE)
                                    ProblemHighlightType.LIKE_UNKNOWN_SYMBOL
                                else
                                    null)
                    }
                }' @ [205:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AnnotationPresentationInfo, entry1: AnnotationPresentationInfo, entry2: AnnotationPresentationInfo, entry3: AnnotationPresentationInfo): AnnotationPresentationInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AnnotationPresentationInfo

'factory' @ [205:23] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'in' @ [206:21] ==> public operator fun <@OnlyInputTypes T> Iterable<(DiagnosticFactory<*>..DiagnosticFactory<*>?)>.contains(element: (DiagnosticFactory<*>..DiagnosticFactory<*>?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory<*>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory<*>?)

'UNRESOLVED_REFERENCE_DIAGNOSTICS' @ [206:31] ==> public final val UNRESOLVED_REFERENCE_DIAGNOSTICS: (ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>..ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'element' @ [207:51] ==> private final val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator[PropertyDescriptorImpl]

'referenceExpression' @ [208:41] ==> val referenceExpression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'mainReference' @ [208:61] ==> public val KtReferenceExpression.mainReference: KtReference defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'if (reference is MultiRangeReference) {
                            AnnotationPresentationInfo(
                                    ranges = reference.ranges.map { it.shiftRight(referenceExpression.textOffset) },
                                    highlightType = ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                        }
                        else {
                            AnnotationPresentationInfo(ranges, highlightType = ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                        }' @ [209:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnnotationPresentationInfo, elseBranch: AnnotationPresentationInfo): AnnotationPresentationInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnnotationPresentationInfo

'reference' @ [209:29] ==> val reference: KtReference defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'AnnotationPresentationInfo' @ [210:29] ==> public constructor AnnotationPresentationInfo(ranges: List<TextRange>, nonDefaultMessage: String? = ..., highlightType: ProblemHighlightType? = ..., textAttributes: TextAttributesKey? = ...) defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[ClassConstructorDescriptorImpl]

'reference' @ [211:46] ==> val reference: KtReference defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'ranges' @ [211:56] ==> public final val MultiRangeReference.ranges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>)[MyPropertyDescriptor]

'map' @ [211:63] ==> public inline fun <T, R> Iterable<(TextRange..TextRange?)>.map(transform: ((TextRange..TextRange?)) -> TextRange): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)
    <R> -> TextRange

'it' @ [211:69] ==> value-parameter it: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'shiftRight' @ [211:72] ==> @NotNull public open fun shiftRight(p0: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'referenceExpression' @ [211:83] ==> val referenceExpression: KtReferenceExpression defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'textOffset' @ [211:103] ==> public final val KtReferenceExpression.textOffset: Int[MyPropertyDescriptor]

'LIKE_UNKNOWN_SYMBOL' @ [212:74] ==> enum entry LIKE_UNKNOWN_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'AnnotationPresentationInfo' @ [215:29] ==> public constructor AnnotationPresentationInfo(ranges: List<TextRange>, nonDefaultMessage: String? = ..., highlightType: ProblemHighlightType? = ..., textAttributes: TextAttributesKey? = ...) defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[ClassConstructorDescriptorImpl]

'ranges' @ [215:56] ==> val ranges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>) defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'LIKE_UNKNOWN_SYMBOL' @ [215:101] ==> enum entry LIKE_UNKNOWN_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'ILLEGAL_ESCAPE' @ [219:28] ==> public final val ILLEGAL_ESCAPE: (DiagnosticFactory1<(KtElement..KtElement?), (KtElement..KtElement?)>..DiagnosticFactory1<(KtElement..KtElement?), (KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'AnnotationPresentationInfo' @ [219:46] ==> public constructor AnnotationPresentationInfo(ranges: List<TextRange>, nonDefaultMessage: String? = ..., highlightType: ProblemHighlightType? = ..., textAttributes: TextAttributesKey? = ...) defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[ClassConstructorDescriptorImpl]

'ranges' @ [219:73] ==> val ranges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>) defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'INVALID_STRING_ESCAPE' @ [219:123] ==> public final val INVALID_STRING_ESCAPE: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'REDECLARATION' @ [221:28] ==> public final val REDECLARATION: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'AnnotationPresentationInfo' @ [221:45] ==> public constructor AnnotationPresentationInfo(ranges: List<TextRange>, nonDefaultMessage: String? = ..., highlightType: ProblemHighlightType? = ..., textAttributes: TextAttributesKey? = ...) defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[ClassConstructorDescriptorImpl]

'listOf' @ [222:38] ==> public fun <T> listOf(element: (TextRange..TextRange?)): List<(TextRange..TextRange?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)

'diagnostic' @ [222:45] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'textRanges' @ [222:56] ==> public final val Diagnostic.textRanges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>)[MyPropertyDescriptor]

'first' @ [222:67] ==> public fun <T> List<(TextRange..TextRange?)>.first(): (TextRange..TextRange?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)

'AnnotationPresentationInfo' @ [225:25] ==> public constructor AnnotationPresentationInfo(ranges: List<TextRange>, nonDefaultMessage: String? = ..., highlightType: ProblemHighlightType? = ..., textAttributes: TextAttributesKey? = ...) defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[ClassConstructorDescriptorImpl]

'ranges' @ [226:33] ==> val ranges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>) defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'if (factory == Errors.INVISIBLE_REFERENCE)
                                    ProblemHighlightType.LIKE_UNKNOWN_SYMBOL
                                else
                                    null' @ [227:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ProblemHighlightType?, elseBranch: ProblemHighlightType?): ProblemHighlightType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ProblemHighlightType?

'factory' @ [227:53] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'INVISIBLE_REFERENCE' @ [227:71] ==> public final val INVISIBLE_REFERENCE: (DiagnosticFactory3<(KtSimpleNameExpression..KtSimpleNameExpression?), (DeclarationDescriptor..DeclarationDescriptor?), (Visibility..Visibility?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory3<(KtSimpleNameExpression..KtSimpleNameExpression?), (DeclarationDescriptor..DeclarationDescriptor?), (Visibility..Visibility?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'LIKE_UNKNOWN_SYMBOL' @ [228:58] ==> enum entry LIKE_UNKNOWN_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'WARNING' @ [234:22] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'factory' @ [235:21] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'UNUSED_PARAMETER' @ [235:39] ==> public final val UNUSED_PARAMETER: (DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'invoke' @ [235:59] ==> public abstract operator fun invoke(p1: KtParameter): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [235:89] ==> private final val element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator[PropertyDescriptorImpl]

'AnnotationPresentationInfo' @ [239:17] ==> public constructor AnnotationPresentationInfo(ranges: List<TextRange>, nonDefaultMessage: String? = ..., highlightType: ProblemHighlightType? = ..., textAttributes: TextAttributesKey? = ...) defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[ClassConstructorDescriptorImpl]

'ranges' @ [240:25] ==> val ranges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>) defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'when (factory) {
                            Errors.DEPRECATION -> CodeInsightColors.DEPRECATED_ATTRIBUTES
                            Errors.UNUSED_ANONYMOUS_PARAMETER -> CodeInsightColors.WEAK_WARNING_ATTRIBUTES
                            else -> null
                        }' @ [241:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TextAttributesKey?, entry1: TextAttributesKey?, entry2: TextAttributesKey?): TextAttributesKey?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TextAttributesKey?

'factory' @ [241:48] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'DEPRECATION' @ [242:36] ==> public final val DEPRECATION: (DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'DEPRECATED_ATTRIBUTES' @ [242:69] ==> public final val DEPRECATED_ATTRIBUTES: (TextAttributesKey..TextAttributesKey?) defined in com.intellij.openapi.editor.colors.CodeInsightColors[JavaPropertyDescriptor]

'UNUSED_ANONYMOUS_PARAMETER' @ [243:36] ==> public final val UNUSED_ANONYMOUS_PARAMETER: (DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'WEAK_WARNING_ATTRIBUTES' @ [243:84] ==> public final val WEAK_WARNING_ATTRIBUTES: (TextAttributesKey..TextAttributesKey?) defined in com.intellij.openapi.editor.colors.CodeInsightColors[JavaPropertyDescriptor]

'when (factory) {
                            in Errors.UNUSED_ELEMENT_DIAGNOSTICS -> ProblemHighlightType.LIKE_UNUSED_SYMBOL
                            Errors.UNUSED_ANONYMOUS_PARAMETER -> ProblemHighlightType.WEAK_WARNING
                            else -> null
                        }' @ [246:41] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProblemHighlightType?, entry1: ProblemHighlightType?, entry2: ProblemHighlightType?): ProblemHighlightType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ProblemHighlightType?

'factory' @ [246:47] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'in' @ [247:29] ==> public operator fun <@OnlyInputTypes T> Iterable<(DiagnosticFactory<*>..DiagnosticFactory<*>?)>.contains(element: (DiagnosticFactory<*>..DiagnosticFactory<*>?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory<*>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory<*>?)

'UNUSED_ELEMENT_DIAGNOSTICS' @ [247:39] ==> public final val UNUSED_ELEMENT_DIAGNOSTICS: (ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>..ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'LIKE_UNUSED_SYMBOL' @ [247:90] ==> enum entry LIKE_UNUSED_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'UNUSED_ANONYMOUS_PARAMETER' @ [248:36] ==> public final val UNUSED_ANONYMOUS_PARAMETER: (DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'WEAK_WARNING' @ [248:87] ==> enum entry WEAK_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'INFO' @ [253:22] ==> enum entry INFO defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'AnnotationPresentationInfo' @ [253:30] ==> public constructor AnnotationPresentationInfo(ranges: List<TextRange>, nonDefaultMessage: String? = ..., highlightType: ProblemHighlightType? = ..., textAttributes: TextAttributesKey? = ...) defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[ClassConstructorDescriptorImpl]

'ranges' @ [253:57] ==> val ranges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>) defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'INFORMATION' @ [253:102] ==> enum entry INFORMATION defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'setUpAnnotations' @ [256:9] ==> private final fun setUpAnnotations(diagnostics: List<Diagnostic>, data: AnnotationPresentationInfo): Unit defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator[SimpleFunctionDescriptorImpl]

'diagnostics' @ [256:26] ==> value-parameter diagnostics: List<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[ValueParameterDescriptorImpl]

'presentationInfo' @ [256:39] ==> val presentationInfo: AnnotationPresentationInfo defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.registerDiagnosticAnnotations[LocalVariableDescriptor]

'createQuickFixes' @ [261:13] ==> private fun createQuickFixes(similarDiagnostics: Collection<Diagnostic>): MultiMap<Diagnostic, IntentionAction> defined in org.jetbrains.kotlin.idea.highlighter in file KotlinPsiChecker.kt[SimpleFunctionDescriptorImpl]

'diagnostics' @ [261:30] ==> value-parameter diagnostics: List<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[ValueParameterDescriptorImpl]

'e' @ [264:17] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'e' @ [265:23] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'LOG' @ [267:13] ==> public final val LOG: Logger defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.Companion[PropertyDescriptorImpl]

'error' @ [267:17] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [267:23] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'MultiMap' @ [268:13] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Diagnostic
    <V : (Any..Any?)> -> IntentionAction

'data' @ [271:23] ==> value-parameter data: AnnotationPresentationInfo defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[ValueParameterDescriptorImpl]

'ranges' @ [271:28] ==> public final val ranges: List<TextRange> defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[PropertyDescriptorImpl]

'diagnostics' @ [272:32] ==> value-parameter diagnostics: List<Diagnostic> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[ValueParameterDescriptorImpl]

'data' @ [273:34] ==> value-parameter data: AnnotationPresentationInfo defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[ValueParameterDescriptorImpl]

'create' @ [273:39] ==> public final fun create(diagnostic: Diagnostic, range: TextRange, holder: AnnotationHolder): Annotation defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[SimpleFunctionDescriptorImpl]

'diagnostic' @ [273:46] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'range' @ [273:58] ==> val range: TextRange defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'holder' @ [273:65] ==> private final val holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator[PropertyDescriptorImpl]

'fixesMap' @ [274:29] ==> val fixesMap: MultiMap<Diagnostic, IntentionAction> defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'diagnostic' @ [274:38] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'fixes' @ [276:17] ==> val fixes: (MutableCollection<(IntentionAction..IntentionAction?)>..Collection<(IntentionAction..IntentionAction?)>) defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'forEach' @ [276:23] ==> @HidesMembers public inline fun <T> Iterable<(IntentionAction..IntentionAction?)>.forEach(action: ((IntentionAction..IntentionAction?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInsight.intention.IntentionAction..com.intellij.codeInsight.intention.IntentionAction?)

'annotation' @ [276:33] ==> val annotation: Annotation defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'registerFix' @ [276:44] ==> public open fun registerFix(@NotNull p0: IntentionAction): Unit defined in com.intellij.lang.annotation.Annotation[JavaMethodDescriptor]

'it' @ [276:56] ==> value-parameter it: (IntentionAction..IntentionAction?) defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'diagnostic' @ [278:21] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'severity' @ [278:32] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'WARNING' @ [278:53] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'annotation' @ [279:21] ==> val annotation: Annotation defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'problemGroup' @ [279:32] ==> public final var Annotation.problemGroup: ProblemGroup?[MyPropertyDescriptor]

'KotlinSuppressableWarningProblemGroup' @ [279:47] ==> public constructor KotlinSuppressableWarningProblemGroup(diagnosticFactory: DiagnosticFactory<*>) defined in org.jetbrains.kotlin.idea.highlighter.KotlinSuppressableWarningProblemGroup[ClassConstructorDescriptorImpl]

'diagnostic' @ [279:85] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'factory' @ [279:96] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'fixes' @ [281:25] ==> val fixes: (MutableCollection<(IntentionAction..IntentionAction?)>..Collection<(IntentionAction..IntentionAction?)>) defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'isEmpty' @ [281:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'annotation' @ [283:25] ==> val annotation: Annotation defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'registerFix' @ [283:36] ==> public open fun registerFix(@NotNull p0: IntentionAction): Unit defined in com.intellij.lang.annotation.Annotation[JavaMethodDescriptor]

'EmptyIntentionAction' @ [283:48] ==> public constructor EmptyIntentionAction(@NotNull p0: String) defined in com.intellij.codeInsight.intention.EmptyIntentionAction[JavaClassConstructorDescriptor]

'diagnostic' @ [283:69] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator.setUpAnnotations[LocalVariableDescriptor]

'factory' @ [283:80] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [283:88] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'getInstance' @ [291:26] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'ElementAnnotator' @ [291:38] ==> public companion object defined in org.jetbrains.kotlin.idea.highlighter.ElementAnnotator[FakeCallableDescriptorForObject]

'java' @ [291:62] ==> public val <T> KClass<ElementAnnotator>.java: Class<ElementAnnotator> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ElementAnnotator

'nonDefaultMessage' @ [303:30] ==> public final val nonDefaultMessage: String? defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[PropertyDescriptorImpl]

'getDefaultMessage' @ [303:51] ==> private final fun getDefaultMessage(diagnostic: Diagnostic): String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[SimpleFunctionDescriptorImpl]

'diagnostic' @ [303:69] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[ValueParameterDescriptorImpl]

'when (diagnostic.severity) {
            Severity.ERROR -> holder.createErrorAnnotation(range, defaultMessage)
            Severity.WARNING -> {
                if (highlightType == ProblemHighlightType.WEAK_WARNING) {
                    holder.createWeakWarningAnnotation(range, defaultMessage)
                }
                else {
                    holder.createWarningAnnotation(range, defaultMessage)
                }
            }
            Severity.INFO -> holder.createInfoAnnotation(range, defaultMessage)
        }' @ [305:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Annotation..Annotation?), entry1: (Annotation..Annotation?), entry2: (Annotation..Annotation?)): (Annotation..Annotation?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.lang.annotation.Annotation..com.intellij.lang.annotation.Annotation?)

'diagnostic' @ [305:32] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[ValueParameterDescriptorImpl]

'severity' @ [305:43] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'ERROR' @ [306:22] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'holder' @ [306:31] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[ValueParameterDescriptorImpl]

'createErrorAnnotation' @ [306:38] ==> public abstract fun createErrorAnnotation(@NotNull p0: TextRange, @Nullable p1: String?): (Annotation..Annotation?) defined in com.intellij.lang.annotation.AnnotationHolder[JavaMethodDescriptor]

'range' @ [306:60] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[ValueParameterDescriptorImpl]

'defaultMessage' @ [306:67] ==> val defaultMessage: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[LocalVariableDescriptor]

'WARNING' @ [307:22] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'if (highlightType == ProblemHighlightType.WEAK_WARNING) {
                    holder.createWeakWarningAnnotation(range, defaultMessage)
                }
                else {
                    holder.createWarningAnnotation(range, defaultMessage)
                }' @ [308:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Annotation..Annotation?), elseBranch: (Annotation..Annotation?)): (Annotation..Annotation?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.lang.annotation.Annotation..com.intellij.lang.annotation.Annotation?)

'highlightType' @ [308:21] ==> public final val highlightType: ProblemHighlightType? defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[PropertyDescriptorImpl]

'WEAK_WARNING' @ [308:59] ==> enum entry WEAK_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'holder' @ [309:21] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[ValueParameterDescriptorImpl]

'createWeakWarningAnnotation' @ [309:28] ==> public abstract fun createWeakWarningAnnotation(@NotNull p0: TextRange, @Nullable p1: String?): (Annotation..Annotation?) defined in com.intellij.lang.annotation.AnnotationHolder[JavaMethodDescriptor]

'range' @ [309:56] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[ValueParameterDescriptorImpl]

'defaultMessage' @ [309:63] ==> val defaultMessage: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[LocalVariableDescriptor]

'holder' @ [312:21] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[ValueParameterDescriptorImpl]

'createWarningAnnotation' @ [312:28] ==> public abstract fun createWarningAnnotation(@NotNull p0: TextRange, @Nullable p1: String?): (Annotation..Annotation?) defined in com.intellij.lang.annotation.AnnotationHolder[JavaMethodDescriptor]

'range' @ [312:52] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[ValueParameterDescriptorImpl]

'defaultMessage' @ [312:59] ==> val defaultMessage: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[LocalVariableDescriptor]

'INFO' @ [315:22] ==> enum entry INFO defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'holder' @ [315:30] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[ValueParameterDescriptorImpl]

'createInfoAnnotation' @ [315:37] ==> public abstract fun createInfoAnnotation(@NotNull p0: TextRange, @Nullable p1: String?): (Annotation..Annotation?) defined in com.intellij.lang.annotation.AnnotationHolder[JavaMethodDescriptor]

'range' @ [315:58] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[ValueParameterDescriptorImpl]

'defaultMessage' @ [315:65] ==> val defaultMessage: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[LocalVariableDescriptor]

'annotation' @ [318:9] ==> val annotation: (Annotation..Annotation?) defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[LocalVariableDescriptor]

'tooltip' @ [318:20] ==> public final var Annotation.tooltip: (String..String?)[MyPropertyDescriptor]

'getMessage' @ [318:30] ==> private final fun getMessage(diagnostic: Diagnostic): String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[SimpleFunctionDescriptorImpl]

'diagnostic' @ [318:41] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[ValueParameterDescriptorImpl]

'highlightType' @ [320:13] ==> public final val highlightType: ProblemHighlightType? defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[PropertyDescriptorImpl]

'annotation' @ [321:13] ==> val annotation: (Annotation..Annotation?) defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[LocalVariableDescriptor]

'highlightType' @ [321:24] ==> public final var Annotation.highlightType: (ProblemHighlightType..ProblemHighlightType?)[MyPropertyDescriptor]

'highlightType' @ [321:40] ==> public final val highlightType: ProblemHighlightType? defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[PropertyDescriptorImpl]

'textAttributes' @ [324:13] ==> public final val textAttributes: TextAttributesKey? defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[PropertyDescriptorImpl]

'annotation' @ [325:13] ==> val annotation: (Annotation..Annotation?) defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[LocalVariableDescriptor]

'textAttributes' @ [325:24] ==> public final var Annotation.textAttributes: TextAttributesKey[MyPropertyDescriptor]

'textAttributes' @ [325:41] ==> public final val textAttributes: TextAttributesKey? defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo[PropertyDescriptorImpl]

'annotation' @ [328:16] ==> val annotation: (Annotation..Annotation?) defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.create[LocalVariableDescriptor]

'render' @ [332:40] ==> @NotNull public open fun render(@NotNull diagnostic: Diagnostic): String defined in org.jetbrains.kotlin.idea.highlighter.IdeErrorMessages[JavaMethodDescriptor]

'diagnostic' @ [332:47] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[ValueParameterDescriptorImpl]

'KotlinInternalMode' @ [333:13] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [333:32] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[PropertyDescriptorImpl]

'getApplication' @ [333:62] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [333:79] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'diagnostic' @ [334:31] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[ValueParameterDescriptorImpl]

'factory' @ [334:42] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [334:50] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'message' @ [335:13] ==> var message: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[LocalVariableDescriptor]

'if (message.startsWith("<html>")) {
                "<html>[$factoryName] ${message.substring("<html>".length)}"
            }
            else {
                "[$factoryName] $message"
            }' @ [335:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'message' @ [335:27] ==> var message: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[LocalVariableDescriptor]

'startsWith' @ [335:35] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'factoryName' @ [336:26] ==> val factoryName: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[LocalVariableDescriptor]

'message' @ [336:41] ==> var message: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[LocalVariableDescriptor]

'substring' @ [336:49] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'length' @ [336:68] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'factoryName' @ [339:20] ==> val factoryName: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[LocalVariableDescriptor]

'message' @ [339:34] ==> var message: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[LocalVariableDescriptor]

'!' @ [342:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'message' @ [342:14] ==> var message: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[LocalVariableDescriptor]

'startsWith' @ [342:22] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'message' @ [343:13] ==> var message: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[LocalVariableDescriptor]

'escapeString' @ [343:52] ==> public open fun escapeString(@Nullable p0: String?): (String..String?) defined in com.intellij.xml.util.XmlStringUtil[JavaMethodDescriptor]

'message' @ [343:65] ==> var message: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[LocalVariableDescriptor]

'message' @ [345:16] ==> var message: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getMessage[LocalVariableDescriptor]

'render' @ [349:44] ==> @NotNull public open fun render(@NotNull p0: Diagnostic): String defined in org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages[JavaMethodDescriptor]

'diagnostic' @ [349:51] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getDefaultMessage[ValueParameterDescriptorImpl]

'KotlinInternalMode' @ [350:13] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [350:32] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[PropertyDescriptorImpl]

'getApplication' @ [350:62] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [350:79] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'diagnostic' @ [351:24] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getDefaultMessage[ValueParameterDescriptorImpl]

'factory' @ [351:35] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [351:43] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'message' @ [351:51] ==> val message: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getDefaultMessage[LocalVariableDescriptor]

'message' @ [353:16] ==> val message: String defined in org.jetbrains.kotlin.idea.highlighter.AnnotationPresentationInfo.getDefaultMessage[LocalVariableDescriptor]

