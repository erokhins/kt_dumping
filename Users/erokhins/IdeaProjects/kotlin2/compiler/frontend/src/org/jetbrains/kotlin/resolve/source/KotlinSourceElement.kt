'if (this == null) SourceElement.NO_SOURCE else KotlinSourceElement(psiOrParent)' @ [26:55] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SourceElement, elseBranch: SourceElement): SourceElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SourceElement

'this' @ [26:59] ==> <this> defined in org.jetbrains.kotlin.resolve.source.toSourceElement[ReceiverParameterDescriptorImpl]

'NO_SOURCE' @ [26:87] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'KotlinSourceElement' @ [26:102] ==> public constructor KotlinSourceElement(psi: KtElement) defined in org.jetbrains.kotlin.resolve.source.KotlinSourceElement[ClassConstructorDescriptorImpl]

'psiOrParent' @ [26:122] ==> public final val KtPureElement.psiOrParent: KtElement[MyPropertyDescriptor]

'this' @ [28:44] ==> <this> defined in org.jetbrains.kotlin.resolve.source.getPsi[ReceiverParameterDescriptorImpl]

'psi' @ [28:72] ==> public abstract val psi: PsiElement? defined in org.jetbrains.kotlin.resolve.source.PsiSourceElement[PropertyDescriptorImpl]

