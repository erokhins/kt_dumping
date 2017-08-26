'getApplication' @ [28:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runReadAction' @ [28:49] ==> public final fun <T : (Any..Any?)> runReadAction(@NotNull p0: () -> (String..String?)): (String..String?) defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'StringBuilder' @ [29:22] ==> public final fun <init>(p0: (String..String?)): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'subsystemName' @ [29:36] ==> value-parameter subsystemName: String defined in org.jetbrains.kotlin.util.getExceptionMessage[ValueParameterDescriptorImpl]

'append' @ [29:73] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'message' @ [29:80] ==> value-parameter message: String defined in org.jetbrains.kotlin.util.getExceptionMessage[ValueParameterDescriptorImpl]

'append' @ [29:89] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'cause' @ [30:13] ==> value-parameter cause: Throwable? defined in org.jetbrains.kotlin.util.getExceptionMessage[ValueParameterDescriptorImpl]

'cause' @ [31:32] ==> value-parameter cause: Throwable? defined in org.jetbrains.kotlin.util.getExceptionMessage[ValueParameterDescriptorImpl]

'message' @ [31:38] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'result' @ [32:13] ==> val result: (StringBuilder..StringBuilder?) defined in org.jetbrains.kotlin.util.getExceptionMessage.<anonymous>[LocalVariableDescriptor]

'append' @ [32:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [32:38] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'causeMessage' @ [32:45] ==> val causeMessage: String? defined in org.jetbrains.kotlin.util.getExceptionMessage.<anonymous>[LocalVariableDescriptor]

'cause' @ [32:61] ==> value-parameter cause: Throwable? defined in org.jetbrains.kotlin.util.getExceptionMessage[ValueParameterDescriptorImpl]

'toString' @ [32:67] ==> public open fun toString(): String defined in kotlin.Throwable[DeserializedSimpleFunctionDescriptor]

'append' @ [32:79] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (element != null) {
            result.append("File being compiled and position: ").append(DiagnosticUtils.atLocation(element)).append("\n")
            result.append("PsiElement: ").append(element.text).append("\n")
        }
        else {
            result.append("Element is unknown")
        }' @ [35:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'element' @ [35:13] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.util.getExceptionMessage[ValueParameterDescriptorImpl]

'result' @ [36:13] ==> val result: (StringBuilder..StringBuilder?) defined in org.jetbrains.kotlin.util.getExceptionMessage.<anonymous>[LocalVariableDescriptor]

'append' @ [36:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [36:65] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'atLocation' @ [36:88] ==> public open fun atLocation(@NotNull element: PsiElement): (String..String?) defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'element' @ [36:99] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.util.getExceptionMessage[ValueParameterDescriptorImpl]

'append' @ [36:109] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'result' @ [37:13] ==> val result: (StringBuilder..StringBuilder?) defined in org.jetbrains.kotlin.util.getExceptionMessage.<anonymous>[LocalVariableDescriptor]

'append' @ [37:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [37:43] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'element' @ [37:50] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.util.getExceptionMessage[ValueParameterDescriptorImpl]

'text' @ [37:58] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'append' @ [37:64] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'result' @ [40:13] ==> val result: (StringBuilder..StringBuilder?) defined in org.jetbrains.kotlin.util.getExceptionMessage.<anonymous>[LocalVariableDescriptor]

'append' @ [40:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'cause' @ [43:13] ==> value-parameter cause: Throwable? defined in org.jetbrains.kotlin.util.getExceptionMessage[ValueParameterDescriptorImpl]

'result' @ [44:13] ==> val result: (StringBuilder..StringBuilder?) defined in org.jetbrains.kotlin.util.getExceptionMessage.<anonymous>[LocalVariableDescriptor]

'append' @ [44:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [44:61] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'where' @ [44:68] ==> private fun where(cause: Throwable): String defined in org.jetbrains.kotlin.util in file exceptionUtil.kt[SimpleFunctionDescriptorImpl]

'cause' @ [44:74] ==> value-parameter cause: Throwable? defined in org.jetbrains.kotlin.util.getExceptionMessage[ValueParameterDescriptorImpl]

'result' @ [47:9] ==> val result: (StringBuilder..StringBuilder?) defined in org.jetbrains.kotlin.util.getExceptionMessage.<anonymous>[LocalVariableDescriptor]

'toString' @ [47:16] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'cause' @ [51:22] ==> value-parameter cause: Throwable defined in org.jetbrains.kotlin.util.where[ValueParameterDescriptorImpl]

'stackTrace' @ [51:28] ==> public final var Throwable.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'stackTrace' @ [52:9] ==> val stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in org.jetbrains.kotlin.util.where[LocalVariableDescriptor]

'stackTrace' @ [52:31] ==> val stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in org.jetbrains.kotlin.util.where[LocalVariableDescriptor]

'size' @ [52:42] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'stackTrace' @ [53:16] ==> val stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in org.jetbrains.kotlin.util.where[LocalVariableDescriptor]

'fileName' @ [53:30] ==> public final val StackTraceElement.fileName: (String..String?)[MyPropertyDescriptor]

'stackTrace' @ [53:47] ==> val stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in org.jetbrains.kotlin.util.where[LocalVariableDescriptor]

'lineNumber' @ [53:61] ==> public final val StackTraceElement.lineNumber: Int[MyPropertyDescriptor]

