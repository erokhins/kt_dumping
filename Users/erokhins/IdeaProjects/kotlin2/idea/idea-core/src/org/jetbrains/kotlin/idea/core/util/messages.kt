'if (!ApplicationManager.getApplication().isUnitTestMode) {
        Messages.showYesNoCancelDialog(project, message, title, icon)
    }
    else {
        callInTestMode(key, default)
    }' @ [27:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'!' @ [27:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [27:36] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [27:53] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'showYesNoCancelDialog' @ [28:18] ==> @Messages.YesNoCancelResult public open fun showYesNoCancelDialog(p0: (Project..Project?), p1: (String..String?), @Nls p2: (String..String?), p3: (Icon..Icon?)): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [28:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.util.showYesNoCancelDialog[ValueParameterDescriptorImpl]

'message' @ [28:49] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.core.util.showYesNoCancelDialog[ValueParameterDescriptorImpl]

'title' @ [28:58] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.core.util.showYesNoCancelDialog[ValueParameterDescriptorImpl]

'icon' @ [28:65] ==> value-parameter icon: Icon defined in org.jetbrains.kotlin.idea.core.util.showYesNoCancelDialog[ValueParameterDescriptorImpl]

'callInTestMode' @ [31:9] ==> private fun <T> callInTestMode(key: String, default: Int?): Int defined in org.jetbrains.kotlin.idea.core.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'key' @ [31:24] ==> value-parameter key: String defined in org.jetbrains.kotlin.idea.core.util.showYesNoCancelDialog[ValueParameterDescriptorImpl]

'default' @ [31:29] ==> value-parameter default: Int? defined in org.jetbrains.kotlin.idea.core.util.showYesNoCancelDialog[ValueParameterDescriptorImpl]

'ConcurrentHashMap' @ [35:29] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Any

'TestOnly' @ [37:1] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'dialogResults' @ [39:5] ==> private val dialogResults: ConcurrentHashMap<String, Any> defined in org.jetbrains.kotlin.idea.core.util in file messages.kt[PropertyDescriptorImpl]

'key' @ [39:19] ==> value-parameter key: String defined in org.jetbrains.kotlin.idea.core.util.setDialogsResult[ValueParameterDescriptorImpl]

'result' @ [39:26] ==> value-parameter result: Any defined in org.jetbrains.kotlin.idea.core.util.setDialogsResult[ValueParameterDescriptorImpl]

'TestOnly' @ [42:1] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'dialogResults' @ [44:5] ==> private val dialogResults: ConcurrentHashMap<String, Any> defined in org.jetbrains.kotlin.idea.core.util in file messages.kt[PropertyDescriptorImpl]

'clear' @ [44:19] ==> public open fun clear(): Unit defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'dialogResults' @ [48:18] ==> private val dialogResults: ConcurrentHashMap<String, Any> defined in org.jetbrains.kotlin.idea.core.util in file messages.kt[PropertyDescriptorImpl]

'key' @ [48:32] ==> value-parameter key: String defined in org.jetbrains.kotlin.idea.core.util.callInTestMode[ValueParameterDescriptorImpl]

'result' @ [49:9] ==> val result: Any? defined in org.jetbrains.kotlin.idea.core.util.callInTestMode[LocalVariableDescriptor]

'dialogResults' @ [50:9] ==> private val dialogResults: ConcurrentHashMap<String, Any> defined in org.jetbrains.kotlin.idea.core.util in file messages.kt[PropertyDescriptorImpl]

'remove' @ [50:23] ==> public open fun remove(key: String): Any? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'key' @ [50:30] ==> value-parameter key: String defined in org.jetbrains.kotlin.idea.core.util.callInTestMode[ValueParameterDescriptorImpl]

'Suppress' @ [51:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'result' @ [52:16] ==> val result: Any? defined in org.jetbrains.kotlin.idea.core.util.callInTestMode[LocalVariableDescriptor]

'default' @ [55:9] ==> value-parameter default: T? defined in org.jetbrains.kotlin.idea.core.util.callInTestMode[ValueParameterDescriptorImpl]

'default' @ [56:16] ==> value-parameter default: T? defined in org.jetbrains.kotlin.idea.core.util.callInTestMode[ValueParameterDescriptorImpl]

'IllegalStateException' @ [59:11] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'key' @ [59:47] ==> value-parameter key: String defined in org.jetbrains.kotlin.idea.core.util.callInTestMode[ValueParameterDescriptorImpl]

