'this' @ [26:16] ==> <this> defined in org.jetbrains.kotlin.js.resolve.diagnostics.findPsi[ReceiverParameterDescriptorImpl]

'source' @ [26:59] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [26:67] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'if (psi == null && this is CallableMemberDescriptor && kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
        overriddenDescriptors.mapNotNull { it.findPsi() }.firstOrNull()
    }
    else {
        psi
    }' @ [27:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'psi' @ [27:16] ==> val psi: PsiElement? defined in org.jetbrains.kotlin.js.resolve.diagnostics.findPsi[LocalVariableDescriptor]

'this' @ [27:31] ==> <this> defined in org.jetbrains.kotlin.js.resolve.diagnostics.findPsi[ReceiverParameterDescriptorImpl]

'kind' @ [27:67] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [27:105] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'overriddenDescriptors' @ [28:9] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'mapNotNull' @ [28:31] ==> public inline fun <T, R : Any> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.mapNotNull(transform: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <R : Any> -> PsiElement

'it' @ [28:44] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.findPsi.<anonymous>[ValueParameterDescriptorImpl]

'findPsi' @ [28:47] ==> public fun DeclarationDescriptor.findPsi(): PsiElement? defined in org.jetbrains.kotlin.js.resolve.diagnostics in file sourceLocationUtils.kt[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [28:59] ==> public fun <T> List<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'psi' @ [31:9] ==> val psi: PsiElement? defined in org.jetbrains.kotlin.js.resolve.diagnostics.findPsi[LocalVariableDescriptor]

