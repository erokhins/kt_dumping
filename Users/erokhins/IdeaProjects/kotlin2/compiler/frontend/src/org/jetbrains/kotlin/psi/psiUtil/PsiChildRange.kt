'if (first == null) {
            assert(last == null)
        }
        else {
            assert(first.parent == last!!.parent)
        }' @ [23:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'first' @ [23:13] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'assert' @ [24:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'last' @ [24:20] ==> public final val last: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'assert' @ [27:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'first' @ [27:20] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'parent' @ [27:26] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'last' @ [27:36] ==> public final val last: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'parent' @ [27:43] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'first' @ [32:17] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'if (first == null) {
            emptySequence<PsiElement>()
        }
        else {
            val afterLast = last!!.nextSibling
            first.siblings().takeWhile { it != afterLast }
        }' @ [35:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<PsiElement>, elseBranch: Sequence<PsiElement>): Sequence<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<PsiElement>

'first' @ [35:28] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'emptySequence' @ [36:13] ==> public fun <T> emptySequence(): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'last' @ [39:29] ==> public final val last: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'nextSibling' @ [39:36] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'first' @ [40:13] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'siblings' @ [40:19] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'takeWhile' @ [40:30] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [40:42] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.iterator.<anonymous>[ValueParameterDescriptorImpl]

'afterLast' @ [40:48] ==> val afterLast: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.iterator[LocalVariableDescriptor]

'sequence' @ [42:16] ==> val sequence: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.iterator[LocalVariableDescriptor]

'iterator' @ [42:25] ==> public abstract operator fun iterator(): Iterator<PsiElement> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'PsiChildRange' @ [46:36] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[ClassConstructorDescriptorImpl]

'PsiChildRange' @ [48:65] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[ClassConstructorDescriptorImpl]

'element' @ [48:79] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion.singleElement[ValueParameterDescriptorImpl]

'element' @ [48:88] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion.singleElement[ValueParameterDescriptorImpl]

