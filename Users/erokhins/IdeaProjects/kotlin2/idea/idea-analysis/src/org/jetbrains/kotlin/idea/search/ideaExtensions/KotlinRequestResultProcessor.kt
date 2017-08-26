'unwrappedElement' @ [35:51] ==> value-parameter unwrappedElement: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.<init>[ValueParameterDescriptorImpl]

'KotlinReferencesSearchOptions' @ [37:62] ==> public companion object defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[FakeCallableDescriptorForObject]

'Empty' @ [37:92] ==> public final val Empty: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions.Companion[PropertyDescriptorImpl]

'RequestResultProcessor' @ [38:5] ==> protected/*protected and package*/ constructor RequestResultProcessor(@NotNull vararg p0: (Any..Any?)) defined in com.intellij.psi.search.RequestResultProcessor[JavaClassConstructorDescriptor]

'unwrappedElement' @ [38:28] ==> value-parameter unwrappedElement: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.<init>[ValueParameterDescriptorImpl]

'originalElement' @ [38:46] ==> value-parameter originalElement: PsiElement = ... defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.<init>[ValueParameterDescriptorImpl]

'filter' @ [38:63] ==> value-parameter filter: (PsiReference) -> Boolean = ... defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.<init>[ValueParameterDescriptorImpl]

'options' @ [38:71] ==> value-parameter options: KotlinReferencesSearchOptions = ... defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.<init>[ValueParameterDescriptorImpl]

'getService' @ [39:56] ==> public open fun getService(): (PsiReferenceService..PsiReferenceService?) defined in com.intellij.psi.PsiReferenceService[JavaMethodDescriptor]

'if (element is KtDestructuringDeclaration)
            element.entries.flatMap { referenceService.getReferences(it, PsiReferenceService.Hints.NO_HINTS) }
        else
            referenceService.getReferences(element, PsiReferenceService.Hints.NO_HINTS)' @ [42:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<(PsiReference..PsiReference?)>, elseBranch: List<(PsiReference..PsiReference?)>): List<(PsiReference..PsiReference?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<(com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)>

'element' @ [42:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'element' @ [43:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'entries' @ [43:21] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'flatMap' @ [43:29] ==> public inline fun <T, R> Iterable<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>.flatMap(transform: ((KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)) -> Iterable<(PsiReference..PsiReference?)>): List<(PsiReference..PsiReference?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)
    <R> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'referenceService' @ [43:39] ==> private final val referenceService: (PsiReferenceService..PsiReferenceService?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[PropertyDescriptorImpl]

'getReferences' @ [43:56] ==> @NotNull public abstract fun getReferences(@NotNull p0: PsiElement, @NotNull p1: PsiReferenceService.Hints): (MutableList<(PsiReference..PsiReference?)>..List<(PsiReference..PsiReference?)>) defined in com.intellij.psi.PsiReferenceService[JavaMethodDescriptor]

'it' @ [43:70] ==> value-parameter it: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.processTextOccurrence.<anonymous>[ValueParameterDescriptorImpl]

'NO_HINTS' @ [43:100] ==> public final val NO_HINTS: (PsiReferenceService.Hints..PsiReferenceService.Hints?) defined in com.intellij.psi.PsiReferenceService.Hints[JavaPropertyDescriptor]

'referenceService' @ [45:13] ==> private final val referenceService: (PsiReferenceService..PsiReferenceService?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[PropertyDescriptorImpl]

'getReferences' @ [45:30] ==> @NotNull public abstract fun getReferences(@NotNull p0: PsiElement, @NotNull p1: PsiReferenceService.Hints): (MutableList<(PsiReference..PsiReference?)>..List<(PsiReference..PsiReference?)>) defined in com.intellij.psi.PsiReferenceService[JavaMethodDescriptor]

'element' @ [45:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'NO_HINTS' @ [45:79] ==> public final val NO_HINTS: (PsiReferenceService.Hints..PsiReferenceService.Hints?) defined in com.intellij.psi.PsiReferenceService.Hints[JavaPropertyDescriptor]

'references' @ [46:16] ==> val references: List<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.processTextOccurrence[LocalVariableDescriptor]

'all' @ [46:27] ==> public inline fun <T> Iterable<(PsiReference..PsiReference?)>.all(predicate: ((PsiReference..PsiReference?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'checkCanceled' @ [47:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'if (filter(ref) && ref.containsOffsetInElement(offsetInElement) && ref.isReferenceToTarget(unwrappedElement)) {
                consumer.process(ref)
            }
            else {
                true
            }' @ [49:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'invoke' @ [49:17] ==> public abstract operator fun invoke(p1: PsiReference): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'ref' @ [49:24] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.processTextOccurrence.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [49:32] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.processTextOccurrence.<anonymous>[ValueParameterDescriptorImpl]

'containsOffsetInElement' @ [49:36] ==> private final fun PsiReference.containsOffsetInElement(offsetInElement: Int): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[SimpleFunctionDescriptorImpl]

'offsetInElement' @ [49:60] ==> value-parameter offsetInElement: Int defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'ref' @ [49:80] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.processTextOccurrence.<anonymous>[ValueParameterDescriptorImpl]

'isReferenceToTarget' @ [49:84] ==> private final fun PsiReference.isReferenceToTarget(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[SimpleFunctionDescriptorImpl]

'unwrappedElement' @ [49:104] ==> private final val unwrappedElement: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[PropertyDescriptorImpl]

'consumer' @ [50:17] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.processTextOccurrence[ValueParameterDescriptorImpl]

'process' @ [50:26] ==> public abstract fun process(p0: (PsiReference..PsiReference?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'ref' @ [50:34] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.processTextOccurrence.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [59:13] ==> <this> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.containsOffsetInElement[ReceiverParameterDescriptorImpl]

'containsOffsetInElement' @ [60:31] ==> public open fun containsOffsetInElement(@NotNull p0: PsiReference, p1: Int): Boolean defined in com.intellij.psi.ReferenceRange[JavaMethodDescriptor]

'this' @ [60:55] ==> <this> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.containsOffsetInElement[ReceiverParameterDescriptorImpl]

'offsetInElement' @ [60:61] ==> value-parameter offsetInElement: Int defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.containsOffsetInElement[ValueParameterDescriptorImpl]

'isReferenceTo' @ [64:13] ==> public abstract fun isReferenceTo(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'element' @ [64:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor.isReferenceToTarget[ValueParameterDescriptorImpl]

'originalElement' @ [67:13] ==> private final val originalElement: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[PropertyDescriptorImpl]

'options' @ [68:17] ==> private final val options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[PropertyDescriptorImpl]

'acceptCallableOverrides' @ [68:25] ==> public final val acceptCallableOverrides: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[PropertyDescriptorImpl]

'isCallableOverrideUsage' @ [68:52] ==> public fun PsiReference.isCallableOverrideUsage(declaration: KtNamedDeclaration): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'originalElement' @ [68:76] ==> private final val originalElement: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[PropertyDescriptorImpl]

'options' @ [71:17] ==> private final val options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[PropertyDescriptorImpl]

'acceptOverloads' @ [71:25] ==> public final val acceptOverloads: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[PropertyDescriptorImpl]

'isUsageInContainingDeclaration' @ [71:44] ==> public fun PsiReference.isUsageInContainingDeclaration(declaration: KtNamedDeclaration): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'originalElement' @ [71:75] ==> private final val originalElement: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[PropertyDescriptorImpl]

'options' @ [74:17] ==> private final val options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[PropertyDescriptorImpl]

'acceptExtensionsOfDeclarationClass' @ [74:25] ==> public final val acceptExtensionsOfDeclarationClass: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[PropertyDescriptorImpl]

'isExtensionOfDeclarationClassUsage' @ [74:63] ==> public fun PsiReference.isExtensionOfDeclarationClassUsage(declaration: KtNamedDeclaration): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch in file utils.kt[SimpleFunctionDescriptorImpl]

'originalElement' @ [74:98] ==> private final val originalElement: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[PropertyDescriptorImpl]

