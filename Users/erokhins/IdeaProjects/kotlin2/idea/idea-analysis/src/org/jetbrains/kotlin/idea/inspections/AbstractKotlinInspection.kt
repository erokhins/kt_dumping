'LocalInspectionTool' @ [27:42] ==> public constructor LocalInspectionTool() defined in com.intellij.codeInspection.LocalInspectionTool[JavaClassConstructorDescriptor]

'element' @ [29:13] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection.getSuppressActions[ValueParameterDescriptorImpl]

'emptyArray' @ [29:37] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<SuppressIntentionAction> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> SuppressIntentionAction

'createSuppressWarningActions' @ [31:16] ==> public fun createSuppressWarningActions(element: PsiElement, severity: Severity, suppressionKey: String): List<SuppressIntentionAction> defined in org.jetbrains.kotlin.idea.highlighter[SimpleFunctionDescriptorImpl]

'element' @ [31:45] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection.getSuppressActions[ValueParameterDescriptorImpl]

'toSeverity' @ [31:54] ==> private fun toSeverity(highlightDisplayLevel: HighlightDisplayLevel): Severity defined in org.jetbrains.kotlin.idea.inspections in file AbstractKotlinInspection.kt[SimpleFunctionDescriptorImpl]

'defaultLevel' @ [31:65] ==> public final val AbstractKotlinInspection.defaultLevel: HighlightDisplayLevel[MyPropertyDescriptor]

'suppressionKey' @ [31:80] ==> protected open val suppressionKey: String defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[PropertyDescriptorImpl]

'toTypedArray' @ [31:96] ==> public inline fun <reified T> Collection<SuppressIntentionAction>.toTypedArray(): Array<SuppressIntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> SuppressIntentionAction

'!!' @ [35:13] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: SuppressManager?): SuppressManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> SuppressManager

'getInstance' @ [35:29] ==> public open fun getInstance(): (SuppressManager..SuppressManager?) defined in com.intellij.codeInspection.SuppressManager[JavaMethodDescriptor]

'isSuppressedFor' @ [35:45] ==> public abstract fun isSuppressedFor(@NotNull p0: PsiElement, @NotNull p1: String): Boolean defined in com.intellij.codeInspection.SuppressManager[JavaMethodDescriptor]

'element' @ [35:61] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection.isSuppressedFor[ValueParameterDescriptorImpl]

'id' @ [35:70] ==> public final val AbstractKotlinInspection.id: String[MyPropertyDescriptor]

'element' @ [39:23] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection.isSuppressedFor[ValueParameterDescriptorImpl]

'project' @ [39:31] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'KotlinCacheService' @ [40:13] ==> public companion object defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[FakeCallableDescriptorForObject]

'getInstance' @ [40:32] ==> public final fun getInstance(project: Project): KotlinCacheService defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [40:44] ==> val project: Project defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection.isSuppressedFor[LocalVariableDescriptor]

'getSuppressionCache' @ [40:53] ==> public abstract fun getSuppressionCache(): KotlinSuppressCache defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[DeserializedSimpleFunctionDescriptor]

'isSuppressed' @ [40:75] ==> public final fun isSuppressed(psiElement: PsiElement, suppressionKey: String, severity: Severity): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[DeserializedSimpleFunctionDescriptor]

'element' @ [40:88] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection.isSuppressedFor[ValueParameterDescriptorImpl]

'suppressionKey' @ [40:97] ==> protected open val suppressionKey: String defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[PropertyDescriptorImpl]

'toSeverity' @ [40:113] ==> private fun toSeverity(highlightDisplayLevel: HighlightDisplayLevel): Severity defined in org.jetbrains.kotlin.idea.inspections in file AbstractKotlinInspection.kt[SimpleFunctionDescriptorImpl]

'defaultLevel' @ [40:124] ==> public final val AbstractKotlinInspection.defaultLevel: HighlightDisplayLevel[MyPropertyDescriptor]

'this' @ [47:55] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[LazyClassReceiverParameterDescriptor]

'shortName' @ [47:60] ==> public final val AbstractKotlinInspection.shortName: String[MyPropertyDescriptor]

'removePrefix' @ [47:70] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (highlightDisplayLevel) {
        HighlightDisplayLevel.DO_NOT_SHOW -> Severity.INFO

        HighlightDisplayLevel.WARNING,
        HighlightDisplayLevel.WEAK_WARNING -> Severity.WARNING

        HighlightDisplayLevel.ERROR,
        HighlightDisplayLevel.GENERIC_SERVER_ERROR_OR_WARNING,
        HighlightDisplayLevel.NON_SWITCHABLE_ERROR -> Severity.ERROR

        else -> Severity.ERROR
    }' @ [51:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Severity, entry1: Severity, entry2: Severity, entry3: Severity): Severity[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Severity

'highlightDisplayLevel' @ [51:18] ==> value-parameter highlightDisplayLevel: HighlightDisplayLevel defined in org.jetbrains.kotlin.idea.inspections.toSeverity[ValueParameterDescriptorImpl]

'DO_NOT_SHOW' @ [52:31] ==> public final val DO_NOT_SHOW: (HighlightDisplayLevel..HighlightDisplayLevel?) defined in com.intellij.codeHighlighting.HighlightDisplayLevel[JavaPropertyDescriptor]

'INFO' @ [52:55] ==> enum entry INFO defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'WARNING' @ [54:31] ==> public final val WARNING: (HighlightDisplayLevel..HighlightDisplayLevel?) defined in com.intellij.codeHighlighting.HighlightDisplayLevel[JavaPropertyDescriptor]

'WEAK_WARNING' @ [55:31] ==> public final val WEAK_WARNING: (HighlightDisplayLevel..HighlightDisplayLevel?) defined in com.intellij.codeHighlighting.HighlightDisplayLevel[JavaPropertyDescriptor]

'WARNING' @ [55:56] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'ERROR' @ [57:31] ==> public final val ERROR: (HighlightDisplayLevel..HighlightDisplayLevel?) defined in com.intellij.codeHighlighting.HighlightDisplayLevel[JavaPropertyDescriptor]

'GENERIC_SERVER_ERROR_OR_WARNING' @ [58:31] ==> public final val GENERIC_SERVER_ERROR_OR_WARNING: (HighlightDisplayLevel..HighlightDisplayLevel?) defined in com.intellij.codeHighlighting.HighlightDisplayLevel[JavaPropertyDescriptor]

'NON_SWITCHABLE_ERROR' @ [59:31] ==> public final val NON_SWITCHABLE_ERROR: (HighlightDisplayLevel..HighlightDisplayLevel?) defined in com.intellij.codeHighlighting.HighlightDisplayLevel[JavaPropertyDescriptor]

'ERROR' @ [59:64] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'ERROR' @ [61:26] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'Suppress' @ [65:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'forEach' @ [70:5] ==> public inline fun <T> Array<out ProblemDescriptor>.forEach(action: (ProblemDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ProblemDescriptor

'Suppress' @ [71:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'problem' @ [72:29] ==> value-parameter problem: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped.<anonymous>[ValueParameterDescriptorImpl]

'fixes' @ [72:37] ==> public final val ProblemDescriptor.fixes: (Array<raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>?..Array<out raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>?)[MyPropertyDescriptor]

'EMPTY_ARRAY' @ [72:85] ==> public final val EMPTY_ARRAY: (Array<(LocalQuickFix..LocalQuickFix?)>..Array<out (LocalQuickFix..LocalQuickFix?)>?) defined in com.intellij.codeInspection.LocalQuickFix[JavaPropertyDescriptor]

'problem' @ [73:26] ==> value-parameter problem: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped.<anonymous>[ValueParameterDescriptorImpl]

'psiElement' @ [73:34] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'unwrapped' @ [73:45] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'quickFixSubstitutor' @ [74:24] ==> value-parameter quickFixSubstitutor: ((LocalQuickFix, PsiElement) -> LocalQuickFix?)? = ... defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped[ValueParameterDescriptorImpl]

'let' @ [74:45] ==> @InlineOnly public inline fun <T, R> ((LocalQuickFix, PsiElement) -> LocalQuickFix?).let(block: ((LocalQuickFix, PsiElement) -> LocalQuickFix?) -> Array<LocalQuickFix>): Array<LocalQuickFix> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function2<LocalQuickFix, PsiElement, LocalQuickFix?>
    <R> -> Array<LocalQuickFix>

'originalFixes' @ [75:13] ==> val originalFixes: (Array<LocalQuickFix>..Array<out (LocalQuickFix..LocalQuickFix?)>?) defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped.<anonymous>[LocalVariableDescriptor]

'mapNotNull' @ [75:27] ==> public inline fun <T, R : Any> Array<out LocalQuickFix>.mapNotNull(transform: (LocalQuickFix) -> LocalQuickFix?): List<LocalQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalQuickFix
    <R : Any> -> LocalQuickFix

'invoke' @ [75:40] ==> public abstract operator fun invoke(p1: LocalQuickFix, p2: PsiElement): LocalQuickFix? defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [75:46] ==> value-parameter it: LocalQuickFix defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'newElement' @ [75:50] ==> val newElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [75:64] ==> public inline fun <reified T> Collection<LocalQuickFix>.toTypedArray(): Array<LocalQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LocalQuickFix

'originalFixes' @ [76:14] ==> val originalFixes: (Array<LocalQuickFix>..Array<out (LocalQuickFix..LocalQuickFix?)>?) defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped.<anonymous>[LocalVariableDescriptor]

'holder' @ [77:26] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped[ValueParameterDescriptorImpl]

'manager' @ [77:33] ==> public final val ProblemsHolder.manager: InspectionManager[MyPropertyDescriptor]

'createProblemDescriptor' @ [77:41] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @NotNull @Nls p1: String, p2: Boolean, p3: (Array<(LocalQuickFix..LocalQuickFix?)>..Array<out (LocalQuickFix..LocalQuickFix?)>?), @NotNull p4: ProblemHighlightType): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'newElement' @ [77:65] ==> val newElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped.<anonymous>[LocalVariableDescriptor]

'problem' @ [77:77] ==> value-parameter problem: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped.<anonymous>[ValueParameterDescriptorImpl]

'descriptionTemplate' @ [77:85] ==> public final val ProblemDescriptor.descriptionTemplate: String[MyPropertyDescriptor]

'isOnTheFly' @ [77:106] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped[ValueParameterDescriptorImpl]

'newFixes' @ [77:118] ==> val newFixes: (Array<LocalQuickFix>..Array<out (LocalQuickFix..LocalQuickFix?)>?) defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped.<anonymous>[LocalVariableDescriptor]

'problem' @ [77:128] ==> value-parameter problem: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped.<anonymous>[ValueParameterDescriptorImpl]

'highlightType' @ [77:136] ==> public final val ProblemDescriptor.highlightType: ProblemHighlightType[MyPropertyDescriptor]

'holder' @ [78:9] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped[ValueParameterDescriptorImpl]

'registerProblem' @ [78:16] ==> public open fun registerProblem(@NotNull p0: ProblemDescriptor): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'descriptor' @ [78:32] ==> val descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.registerWithElementsUnwrapped.<anonymous>[LocalVariableDescriptor]

