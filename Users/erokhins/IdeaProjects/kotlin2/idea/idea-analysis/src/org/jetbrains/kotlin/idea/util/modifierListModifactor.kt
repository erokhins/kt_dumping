'when (annotationInnerText) {
        null -> "@${annotationFqName.asString()}"
        else -> "@${annotationFqName.asString()}($annotationInnerText)"
    }' @ [31:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'annotationInnerText' @ [31:32] ==> value-parameter annotationInnerText: String? = ... defined in org.jetbrains.kotlin.idea.util.addAnnotation[ValueParameterDescriptorImpl]

'annotationFqName' @ [32:21] ==> value-parameter annotationFqName: FqName defined in org.jetbrains.kotlin.idea.util.addAnnotation[ValueParameterDescriptorImpl]

'asString' @ [32:38] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'annotationFqName' @ [33:21] ==> value-parameter annotationFqName: FqName defined in org.jetbrains.kotlin.idea.util.addAnnotation[ValueParameterDescriptorImpl]

'asString' @ [33:38] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'annotationInnerText' @ [33:51] ==> value-parameter annotationInnerText: String? = ... defined in org.jetbrains.kotlin.idea.util.addAnnotation[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [36:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [36:35] ==> <this> defined in org.jetbrains.kotlin.idea.util.addAnnotation[ReceiverParameterDescriptorImpl]

'modifierList' @ [37:24] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'modifierList' @ [39:9] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'psiFactory' @ [41:31] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'createModifierList' @ [41:42] ==> public final fun createModifierList(text: String): KtModifierList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'annotationText' @ [41:61] ==> val annotationText: String defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'!!' @ [42:24] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtModifierList?): KtModifierList[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtModifierList

'replaceModifierList' @ [42:34] ==> @Nullable @Contract public open fun replaceModifierList(@NotNull p0: KtModifierListOwner, @Nullable p1: KtModifierList?): KtModifierList? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [42:54] ==> <this> defined in org.jetbrains.kotlin.idea.util.addAnnotation[ReceiverParameterDescriptorImpl]

'newModifierList' @ [42:60] ==> val newModifierList: KtModifierList defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'psiFactory' @ [43:26] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'createWhiteSpace' @ [43:37] ==> public final fun createWhiteSpace(text: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'whiteSpaceText' @ [43:54] ==> value-parameter whiteSpaceText: String = ... defined in org.jetbrains.kotlin.idea.util.addAnnotation[ValueParameterDescriptorImpl]

'addAfter' @ [44:9] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'whiteSpace' @ [44:18] ==> val whiteSpace: PsiElement defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'replaced' @ [44:30] ==> val replaced: KtModifierList defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'ShortenReferences' @ [46:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [46:27] ==> @JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[PropertyDescriptorImpl]

'process' @ [46:35] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[SimpleFunctionDescriptorImpl]

'replaced' @ [46:43] ==> val replaced: KtModifierList defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'findAnnotation' @ [51:17] ==> public fun KtAnnotated.findAnnotation(annotationFqName: FqName): KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.util in file modifierListModifactor.kt[SimpleFunctionDescriptorImpl]

'annotationFqName' @ [51:32] ==> value-parameter annotationFqName: FqName defined in org.jetbrains.kotlin.idea.util.addAnnotation[ValueParameterDescriptorImpl]

'entry' @ [52:9] ==> val entry: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'psiFactory' @ [54:29] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'createAnnotationEntry' @ [54:40] ==> public final fun createAnnotationEntry(text: String): KtAnnotationEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'annotationText' @ [54:62] ==> val annotationText: String defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'modifierList' @ [55:31] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'addBefore' @ [55:44] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'newAnnotation' @ [55:54] ==> val newAnnotation: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'modifierList' @ [55:69] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'firstChild' @ [55:82] ==> public final val KtModifierList.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'psiFactory' @ [56:26] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'createWhiteSpace' @ [56:37] ==> public final fun createWhiteSpace(text: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'whiteSpaceText' @ [56:54] ==> value-parameter whiteSpaceText: String = ... defined in org.jetbrains.kotlin.idea.util.addAnnotation[ValueParameterDescriptorImpl]

'modifierList' @ [57:9] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'addAfter' @ [57:22] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'whiteSpace' @ [57:31] ==> val whiteSpace: PsiElement defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'addedAnnotation' @ [57:43] ==> val addedAnnotation: KtElement defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'ShortenReferences' @ [59:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [59:27] ==> @JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[PropertyDescriptorImpl]

'process' @ [59:35] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[SimpleFunctionDescriptorImpl]

'addedAnnotation' @ [59:43] ==> val addedAnnotation: KtElement defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'addToExistingAnnotation' @ [64:9] ==> value-parameter addToExistingAnnotation: ((KtAnnotationEntry) -> Boolean)? = ... defined in org.jetbrains.kotlin.idea.util.addAnnotation[ValueParameterDescriptorImpl]

'invoke' @ [65:16] ==> public abstract operator fun invoke(p1: KtAnnotationEntry): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'entry' @ [65:40] ==> val entry: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.util.addAnnotation[LocalVariableDescriptor]

'annotationEntries' @ [72:9] ==> public final val KtAnnotated.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'isEmpty' @ [72:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'analyze' @ [74:19] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [74:61] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'annotationEntries' @ [76:12] ==> public final val KtAnnotated.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'firstOrNull' @ [76:30] ==> public inline fun <T> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.firstOrNull(predicate: ((KtAnnotationEntry..KtAnnotationEntry?)) -> Boolean): KtAnnotationEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'context' @ [76:53] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.util.findAnnotation[LocalVariableDescriptor]

'get' @ [76:61] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..ReadOnlySlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?), p1: (KtAnnotationEntry..KtAnnotationEntry?)): AnnotationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor..org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor?)

'ANNOTATION' @ [76:80] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'entry' @ [76:92] ==> value-parameter entry: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.util.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [76:100] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'annotationFqName' @ [76:110] ==> value-parameter annotationFqName: FqName defined in org.jetbrains.kotlin.idea.util.findAnnotation[ValueParameterDescriptorImpl]

