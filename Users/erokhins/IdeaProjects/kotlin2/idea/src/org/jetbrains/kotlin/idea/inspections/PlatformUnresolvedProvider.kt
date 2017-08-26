'KotlinIntentionActionFactoryWithDelegate<KtNameReferenceExpression, String>' @ [35:37] ==> public constructor KotlinIntentionActionFactoryWithDelegate<E : KtElement, D : Any>() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtNameReferenceExpression
    <D : Any> -> String

'getParentElementOfType' @ [36:78] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtNameReferenceExpression..KtNameReferenceExpression?)>..Class<(KtNameReferenceExpression..KtNameReferenceExpression?)>?)): KtNameReferenceExpression? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNameReferenceExpression

'diagnostic' @ [36:101] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.inspections.PlatformUnresolvedProvider.getElementOfInterest[ValueParameterDescriptorImpl]

'KtNameReferenceExpression' @ [36:113] ==> public companion object defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[FakeCallableDescriptorForObject]

'java' @ [36:146] ==> public val <T> KClass<KtNameReferenceExpression>.java: Class<KtNameReferenceExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNameReferenceExpression

'element' @ [37:95] ==> value-parameter element: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.inspections.PlatformUnresolvedProvider.extractFixData[ValueParameterDescriptorImpl]

'getReferencedName' @ [37:103] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [40:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> QuickFixWithDelegateFactory

'originalElementPointer' @ [42:9] ==> value-parameter originalElementPointer: SmartPsiElementPointer<KtNameReferenceExpression> defined in org.jetbrains.kotlin.idea.inspections.PlatformUnresolvedProvider.createFixes[ValueParameterDescriptorImpl]

'element' @ [42:32] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtNameReferenceExpression>.element: KtNameReferenceExpression?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtNameReferenceExpression

'references' @ [42:41] ==> public final val KtNameReferenceExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [42:53] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<KtSimpleNameReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtSimpleNameReference

'firstOrNull' @ [42:96] ==> public fun <T> List<KtSimpleNameReference>.firstOrNull(): KtSimpleNameReference? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameReference

'let' @ [42:111] ==> @InlineOnly public inline fun <T, R> KtSimpleNameReference.let(block: (KtSimpleNameReference) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameReference
    <R> -> Unit

'registerReferenceFixes' @ [43:49] ==> public open fun <T : (PsiReference..PsiReference?)> registerReferenceFixes(@NotNull p0: KtSimpleNameReference, @NotNull p1: QuickFixActionRegistrar): Unit defined in com.intellij.codeInsight.quickfix.UnresolvedReferenceQuickFixProvider[JavaMethodDescriptor]
Inferred types:
    <T : (PsiReference..PsiReference?)> -> KtSimpleNameReference

'reference' @ [43:72] ==> value-parameter reference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.inspections.PlatformUnresolvedProvider.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [45:21] ==> val result: ArrayList<QuickFixWithDelegateFactory> defined in org.jetbrains.kotlin.idea.inspections.PlatformUnresolvedProvider.createFixes[LocalVariableDescriptor]

'add' @ [45:28] ==> public open fun add(element: QuickFixWithDelegateFactory): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'QuickFixWithDelegateFactory' @ [45:32] ==> public fun QuickFixWithDelegateFactory(priority: IntentionActionPriority, createAction: () -> IntentionAction?): QuickFixWithDelegateFactory defined in org.jetbrains.kotlin.idea.quickfix[SimpleFunctionDescriptorImpl]

'action' @ [45:60] ==> value-parameter action: IntentionAction defined in org.jetbrains.kotlin.idea.inspections.PlatformUnresolvedProvider.createFixes.<anonymous>.<no name provided>.register[ValueParameterDescriptorImpl]

'detectPriority' @ [45:67] ==> public fun IntentionAction.detectPriority(): IntentionActionPriority defined in org.jetbrains.kotlin.idea.quickfix in file QuickFixWithDelegateFactory.kt[SimpleFunctionDescriptorImpl]

'action' @ [45:87] ==> value-parameter action: IntentionAction defined in org.jetbrains.kotlin.idea.inspections.PlatformUnresolvedProvider.createFixes.<anonymous>.<no name provided>.register[ValueParameterDescriptorImpl]

'register' @ [49:21] ==> public open fun register(action: IntentionAction): Unit defined in org.jetbrains.kotlin.idea.inspections.PlatformUnresolvedProvider.createFixes.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'action' @ [49:30] ==> value-parameter action: IntentionAction defined in org.jetbrains.kotlin.idea.inspections.PlatformUnresolvedProvider.createFixes.<anonymous>.<no name provided>.register[ValueParameterDescriptorImpl]

'result' @ [57:16] ==> val result: ArrayList<QuickFixWithDelegateFactory> defined in org.jetbrains.kotlin.idea.inspections.PlatformUnresolvedProvider.createFixes[LocalVariableDescriptor]

