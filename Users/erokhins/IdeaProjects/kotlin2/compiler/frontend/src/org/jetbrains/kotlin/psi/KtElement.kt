'Deprecated' @ [27:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'when (this) {
        is KtFile -> this.modificationStamp
        is KtDeclarationStub<*> -> this.modificationStamp
        is KtSuperTypeList -> this.modificationStamp
        else -> (parent as KtElement).getModificationStamp()
    }' @ [32:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Long, entry1: Long, entry2: Long, entry3: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Long

'this' @ [32:18] ==> <this> defined in org.jetbrains.kotlin.psi.getModificationStamp[ReceiverParameterDescriptorImpl]

'this' @ [33:22] ==> <this> defined in org.jetbrains.kotlin.psi.getModificationStamp[ReceiverParameterDescriptorImpl]

'modificationStamp' @ [33:27] ==> public final val KtFile.modificationStamp: Long[MyPropertyDescriptor]

'this' @ [34:36] ==> <this> defined in org.jetbrains.kotlin.psi.getModificationStamp[ReceiverParameterDescriptorImpl]

'modificationStamp' @ [34:41] ==> public final val <T : (StubElement<*>..StubElement<*>?)> KtDeclarationStub<out (StubElement<*>..StubElement<*>?)>.modificationStamp: Long[MyPropertyDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> Captured(*)

'this' @ [35:31] ==> <this> defined in org.jetbrains.kotlin.psi.getModificationStamp[ReceiverParameterDescriptorImpl]

'modificationStamp' @ [35:36] ==> public final val KtSuperTypeList.modificationStamp: Long[MyPropertyDescriptor]

'parent' @ [36:18] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getModificationStamp' @ [36:39] ==> public fun KtElement.getModificationStamp(): Long defined in org.jetbrains.kotlin.psi in file KtElement.kt[SimpleFunctionDescriptorImpl]

