'IntentionBasedInspection<KtPrimaryConstructor>' @ [26:49] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtPrimaryConstructor>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtPrimaryConstructor

'RemoveEmptyPrimaryConstructorIntention' @ [27:9] ==> public constructor RemoveEmptyPrimaryConstructorIntention() defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyPrimaryConstructorIntention[ClassConstructorDescriptorImpl]

'LIKE_UNUSED_SYMBOL' @ [30:34] ==> enum entry LIKE_UNUSED_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'SelfTargetingOffsetIndependentIntention<KtPrimaryConstructor>' @ [33:48] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtPrimaryConstructor>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtPrimaryConstructor

'java' @ [33:138] ==> public val <T> KClass<KtPrimaryConstructor>.java: Class<KtPrimaryConstructor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPrimaryConstructor

'element' @ [35:76] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyPrimaryConstructorIntention.applyTo[ValueParameterDescriptorImpl]

'delete' @ [35:84] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[JavaMethodDescriptor]

'when {
        element.valueParameters.isNotEmpty() -> false
        element.annotations.isNotEmpty() -> false
        element.modifierList?.text?.isBlank() == false -> false
        element.containingClass()?.secondaryConstructors?.isNotEmpty() == true -> false
        else -> true
    }' @ [37:66] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [38:9] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyPrimaryConstructorIntention.isApplicableTo[ValueParameterDescriptorImpl]

'valueParameters' @ [38:17] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [38:33] ==> @InlineOnly public inline fun <T> Collection<(KtParameter..KtParameter?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'element' @ [39:9] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyPrimaryConstructorIntention.isApplicableTo[ValueParameterDescriptorImpl]

'annotations' @ [39:17] ==> public final val KtPrimaryConstructor.annotations: (MutableList<(KtAnnotation..KtAnnotation?)>..List<(KtAnnotation..KtAnnotation?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [39:29] ==> @InlineOnly public inline fun <T> Collection<(KtAnnotation..KtAnnotation?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotation..org.jetbrains.kotlin.psi.KtAnnotation?)

'element' @ [40:9] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyPrimaryConstructorIntention.isApplicableTo[ValueParameterDescriptorImpl]

'modifierList' @ [40:17] ==> public final val KtPrimaryConstructor.modifierList: KtModifierList?[MyPropertyDescriptor]

'text' @ [40:31] ==> public final val KtModifierList.text: (String..String?)[MyPropertyDescriptor]

'isBlank' @ [40:37] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'element' @ [41:9] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyPrimaryConstructorIntention.isApplicableTo[ValueParameterDescriptorImpl]

'containingClass' @ [41:17] ==> public fun KtElement.containingClass(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'secondaryConstructors' @ [41:36] ==> public final val KtClass.secondaryConstructors: List<KtSecondaryConstructor>[MyPropertyDescriptor]

'isNotEmpty' @ [41:59] ==> @InlineOnly public inline fun <T> Collection<KtSecondaryConstructor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSecondaryConstructor

