'create' @ [26:60] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'if (this is KtFile) {
        this.suppressDiagnosticsInDebugMode
    }
    else {
        val file = this.containingFile
        file is KtFile && file.suppressDiagnosticsInDebugMode
    }' @ [29:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'this' @ [29:16] ==> <this> defined in org.jetbrains.kotlin.psi.codeFragmentUtil.suppressDiagnosticsInDebugMode[ReceiverParameterDescriptorImpl]

'this' @ [30:9] ==> <this> defined in org.jetbrains.kotlin.psi.codeFragmentUtil.suppressDiagnosticsInDebugMode[ReceiverParameterDescriptorImpl]

'suppressDiagnosticsInDebugMode' @ [30:14] ==> public var KtFile.suppressDiagnosticsInDebugMode: Boolean defined in org.jetbrains.kotlin.psi.codeFragmentUtil in file codeFragmentUtil.kt[PropertyDescriptorImpl]

'this' @ [33:20] ==> <this> defined in org.jetbrains.kotlin.psi.codeFragmentUtil.suppressDiagnosticsInDebugMode[ReceiverParameterDescriptorImpl]

'containingFile' @ [33:25] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [34:9] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.psi.codeFragmentUtil.suppressDiagnosticsInDebugMode[LocalVariableDescriptor]

'file' @ [34:27] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.psi.codeFragmentUtil.suppressDiagnosticsInDebugMode[LocalVariableDescriptor]

'suppressDiagnosticsInDebugMode' @ [34:32] ==> public var KtFile.suppressDiagnosticsInDebugMode: Boolean defined in org.jetbrains.kotlin.psi.codeFragmentUtil in file codeFragmentUtil.kt[PropertyDescriptorImpl]

'when (this) {
        is KtCodeFragment -> true
        else -> getUserData(SUPPRESS_DIAGNOSTICS_IN_DEBUG_MODE) ?: false
    }' @ [39:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [39:19] ==> <this> defined in org.jetbrains.kotlin.psi.codeFragmentUtil.suppressDiagnosticsInDebugMode[ReceiverParameterDescriptorImpl]

'getUserData' @ [41:17] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Boolean..Boolean?)>): Boolean? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'SUPPRESS_DIAGNOSTICS_IN_DEBUG_MODE' @ [41:29] ==> public val SUPPRESS_DIAGNOSTICS_IN_DEBUG_MODE: Key<Boolean> defined in org.jetbrains.kotlin.psi.codeFragmentUtil in file codeFragmentUtil.kt[PropertyDescriptorImpl]

'putUserData' @ [44:9] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Boolean..Boolean?)>, @Nullable p1: Boolean?): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'SUPPRESS_DIAGNOSTICS_IN_DEBUG_MODE' @ [44:21] ==> public val SUPPRESS_DIAGNOSTICS_IN_DEBUG_MODE: Key<Boolean> defined in org.jetbrains.kotlin.psi.codeFragmentUtil in file codeFragmentUtil.kt[PropertyDescriptorImpl]

'skip' @ [44:57] ==> value-parameter skip: Boolean defined in org.jetbrains.kotlin.psi.codeFragmentUtil.<set-suppressDiagnosticsInDebugMode>[ValueParameterDescriptorImpl]

'create' @ [49:44] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(KotlinType..KotlinType?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinType

'getUserData' @ [51:13] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(KotlinType..KotlinType?)>): KotlinType? defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinType

'DEBUG_TYPE_INFO' @ [51:25] ==> public val DEBUG_TYPE_INFO: Key<KotlinType> defined in org.jetbrains.kotlin.psi.codeFragmentUtil in file codeFragmentUtil.kt[PropertyDescriptorImpl]

'type' @ [53:13] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.psi.codeFragmentUtil.<set-debugTypeInfo>[ValueParameterDescriptorImpl]

'this' @ [53:29] ==> <this> defined in org.jetbrains.kotlin.psi.codeFragmentUtil.debugTypeInfo[ReceiverParameterDescriptorImpl]

'text' @ [53:34] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'DEBUG_TYPE_REFERENCE_STRING' @ [53:42] ==> public val DEBUG_TYPE_REFERENCE_STRING: String defined in org.jetbrains.kotlin.psi.codeFragmentUtil in file codeFragmentUtil.kt[PropertyDescriptorImpl]

'putUserData' @ [54:13] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(KotlinType..KotlinType?)>, @Nullable p1: KotlinType?): Unit defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinType

'DEBUG_TYPE_INFO' @ [54:25] ==> public val DEBUG_TYPE_INFO: Key<KotlinType> defined in org.jetbrains.kotlin.psi.codeFragmentUtil in file codeFragmentUtil.kt[PropertyDescriptorImpl]

'type' @ [54:42] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.psi.codeFragmentUtil.<set-debugTypeInfo>[ValueParameterDescriptorImpl]

