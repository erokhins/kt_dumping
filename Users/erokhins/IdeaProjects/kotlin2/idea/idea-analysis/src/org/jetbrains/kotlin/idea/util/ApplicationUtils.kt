'getApplication' @ [24:31] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runReadAction' @ [24:48] ==> public final fun <T : (Any..Any?)> runReadAction(@NotNull p0: () -> (T..T?)): (T..T?) defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'action' @ [24:65] ==> value-parameter action: () -> T defined in org.jetbrains.kotlin.idea.util.application.runReadAction[ValueParameterDescriptorImpl]

'getApplication' @ [28:31] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runWriteAction' @ [28:48] ==> public final fun <T : (Any..Any?)> runWriteAction(@NotNull p0: () -> (T..T?)): (T..T?) defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'action' @ [28:66] ==> value-parameter action: () -> T defined in org.jetbrains.kotlin.idea.util.application.runWriteAction[ValueParameterDescriptorImpl]

'getInstance' @ [32:22] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'executeCommand' @ [32:36] ==> public final fun executeCommand(@Nullable p0: Project?, @NotNull p1: () -> Unit, @Nullable p2: String?, @Nullable p3: Any?): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'this' @ [32:51] ==> <this> defined in org.jetbrains.kotlin.idea.util.application.executeWriteCommand[ReceiverParameterDescriptorImpl]

'runWriteAction' @ [32:59] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'command' @ [32:74] ==> value-parameter command: () -> Unit defined in org.jetbrains.kotlin.idea.util.application.executeWriteCommand[ValueParameterDescriptorImpl]

'name' @ [32:86] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.util.application.executeWriteCommand[ValueParameterDescriptorImpl]

'executeCommand' @ [36:12] ==> public fun <T> Project.executeCommand(name: String, groupId: Any? = ..., command: () -> T): T defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'name' @ [36:30] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.util.application.executeWriteCommand[ValueParameterDescriptorImpl]

'groupId' @ [36:36] ==> value-parameter groupId: Any? = ... defined in org.jetbrains.kotlin.idea.util.application.executeWriteCommand[ValueParameterDescriptorImpl]

'runWriteAction' @ [36:47] ==> public fun <T> runWriteAction(action: () -> T): T defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'command' @ [36:62] ==> value-parameter command: () -> T defined in org.jetbrains.kotlin.idea.util.application.executeWriteCommand[ValueParameterDescriptorImpl]

'getInstance' @ [41:22] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'executeCommand' @ [41:36] ==> public final fun executeCommand(@Nullable p0: Project?, @NotNull p1: () -> Unit, @Nullable p2: String?, @Nullable p3: Any?): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'this' @ [41:51] ==> <this> defined in org.jetbrains.kotlin.idea.util.application.executeCommand[ReceiverParameterDescriptorImpl]

'result' @ [41:59] ==> var result: T defined in org.jetbrains.kotlin.idea.util.application.executeCommand[LocalVariableDescriptor]

'invoke' @ [41:68] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'name' @ [41:81] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.util.application.executeCommand[ValueParameterDescriptorImpl]

'groupId' @ [41:87] ==> value-parameter groupId: Any? = ... defined in org.jetbrains.kotlin.idea.util.application.executeCommand[ValueParameterDescriptorImpl]

'Suppress' @ [42:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'result' @ [43:12] ==> var result: T defined in org.jetbrains.kotlin.idea.util.application.executeCommand[LocalVariableDescriptor]

