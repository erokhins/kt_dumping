'NORMAL' @ [30:87] ==> enum entry NORMAL defined in org.jetbrains.kotlin.idea.quickfix.IntentionActionPriority[FakeCallableDescriptorForObject]

'KotlinIntentionActionFactoryWithDelegate<E, D>' @ [31:5] ==> public constructor KotlinIntentionActionFactoryWithDelegate<E : KtElement, D : Any>() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> E
    <D : Any> -> D

'QuickFixWithDelegateFactory' @ [40:16] ==> public fun QuickFixWithDelegateFactory(priority: IntentionActionPriority, createAction: () -> IntentionAction?): QuickFixWithDelegateFactory defined in org.jetbrains.kotlin.idea.quickfix in file QuickFixWithDelegateFactory.kt[SimpleFunctionDescriptorImpl]

'actionPriority' @ [40:44] ==> private final val actionPriority: IntentionActionPriority defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactoryWithDelegate[PropertyDescriptorImpl]

'originalElementPointer' @ [41:35] ==> value-parameter originalElementPointer: SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactoryWithDelegate.createFixes[ValueParameterDescriptorImpl]

'element' @ [41:58] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<E>.element: E?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> E

'invoke' @ [42:24] ==> public abstract operator fun invoke(): D? defined in kotlin.Function0[FunctionInvokeDescriptor]

'createFix' @ [43:13] ==> protected abstract fun createFix(originalElement: E, data: D): IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactoryWithDelegate[SimpleFunctionDescriptorImpl]

'originalElement' @ [43:23] ==> val originalElement: E defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactoryWithDelegate.createFixes.<anonymous>[LocalVariableDescriptor]

'data' @ [43:40] ==> val data: D defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactoryWithDelegate.createFixes.<anonymous>[LocalVariableDescriptor]

'let' @ [44:11] ==> @InlineOnly public inline fun <T, R> QuickFixWithDelegateFactory.let(block: (QuickFixWithDelegateFactory) -> List<QuickFixWithDelegateFactory>): List<QuickFixWithDelegateFactory> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QuickFixWithDelegateFactory
    <R> -> List<QuickFixWithDelegateFactory>

'listOf' @ [44:17] ==> public fun <T> listOf(element: QuickFixWithDelegateFactory): List<QuickFixWithDelegateFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QuickFixWithDelegateFactory

'KotlinIntentionActionsFactory' @ [48:83] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'render' @ [60:54] ==> @NotNull public open fun render(@NotNull p0: Diagnostic): String defined in org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages[JavaMethodDescriptor]

'diagnostic' @ [60:61] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[ValueParameterDescriptorImpl]

'diagnostic' @ [61:40] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[ValueParameterDescriptorImpl]

'psiElement' @ [61:51] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'createSmartPointer' @ [61:62] ==> public fun <E : PsiElement> PsiElement.createSmartPointer(): SmartPsiElementPointer<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> PsiElement

'getElementOfInterest' @ [62:31] ==> public abstract fun getElementOfInterest(diagnostic: Diagnostic): E? defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate[SimpleFunctionDescriptorImpl]

'diagnostic' @ [62:52] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[ValueParameterDescriptorImpl]

'emptyList' @ [62:74] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'originalElement' @ [63:38] ==> val originalElement: E defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'createSmartPointer' @ [63:54] ==> public fun <E : PsiElement> E.createSmartPointer(): SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> E

'originalElement' @ [65:20] ==> val originalElement: E defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'containingFile' @ [65:36] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [66:23] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'project' @ [66:28] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'create' @ [70:38] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: D?): (Ref<(D..D?)>..Ref<(D..D?)>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (D..D?)

'extractFixData' @ [70:45] ==> public abstract fun extractFixData(element: E, diagnostic: Diagnostic): D? defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate[SimpleFunctionDescriptorImpl]

'originalElement' @ [70:60] ==> val originalElement: E defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'diagnostic' @ [70:77] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[ValueParameterDescriptorImpl]

'createFixes' @ [73:13] ==> protected abstract fun createFixes(originalElementPointer: SmartPsiElementPointer<E>, diagnostic: Diagnostic, quickFixDataFactory: () -> D?): List<QuickFixWithDelegateFactory> defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate[SimpleFunctionDescriptorImpl]

'originalElementPointer' @ [73:25] ==> val originalElementPointer: SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'diagnostic' @ [73:49] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[ValueParameterDescriptorImpl]

'originalElementPointer' @ [74:31] ==> val originalElementPointer: SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'element' @ [74:54] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<E>.element: E?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> E

'diagnosticElementPointer' @ [75:41] ==> val diagnosticElementPointer: SmartPsiElementPointer<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'element' @ [75:66] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<PsiElement>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> PsiElement

'!' @ [76:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'diagnosticElement' @ [76:22] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions.<anonymous>[LocalVariableDescriptor]

'isValid' @ [76:40] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'!' @ [76:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [76:52] ==> val element: E defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions.<anonymous>[LocalVariableDescriptor]

'isValid' @ [76:60] ==> public final val KtElement.isValid: Boolean[MyPropertyDescriptor]

'element' @ [79:25] ==> val element: E defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions.<anonymous>[LocalVariableDescriptor]

'analyze' @ [79:33] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_WITH_DIAGNOSTICS' @ [79:57] ==> enum entry PARTIAL_WITH_DIAGNOSTICS defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'diagnostics' @ [80:34] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [81:34] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'diagnosticElement' @ [81:45] ==> val diagnosticElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions.<anonymous>[LocalVariableDescriptor]

'firstOrNull' @ [82:34] ==> public inline fun <T> Iterable<Diagnostic>.firstOrNull(predicate: (Diagnostic) -> Boolean): Diagnostic? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'==' @ [82:48] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'render' @ [82:69] ==> @NotNull public open fun render(@NotNull p0: Diagnostic): String defined in org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages[JavaMethodDescriptor]

'it' @ [82:76] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'diagnosticMessage' @ [82:83] ==> val diagnosticMessage: String defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'cachedData' @ [84:17] ==> val cachedData: Ref<D> defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'get' @ [84:28] ==> public final fun get(): (D..D?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'extractFixData' @ [84:37] ==> public abstract fun extractFixData(element: E, diagnostic: Diagnostic): D? defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate[SimpleFunctionDescriptorImpl]

'element' @ [84:52] ==> val element: E defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions.<anonymous>[LocalVariableDescriptor]

'currentDiagnostic' @ [84:61] ==> val currentDiagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions.<anonymous>[LocalVariableDescriptor]

'filter' @ [85:15] ==> public inline fun <T> Iterable<QuickFixWithDelegateFactory>.filter(predicate: (QuickFixWithDelegateFactory) -> Boolean): List<QuickFixWithDelegateFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QuickFixWithDelegateFactory

'it' @ [85:24] ==> value-parameter it: QuickFixWithDelegateFactory defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

'isAvailable' @ [85:27] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.QuickFixWithDelegateFactory[SimpleFunctionDescriptorImpl]

'project' @ [85:39] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'file' @ [85:54] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'cachedData' @ [88:13] ==> val cachedData: Ref<D> defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate.doCreateActions[LocalVariableDescriptor]

'set' @ [88:24] ==> public final fun set(@Nullable p0: D?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

