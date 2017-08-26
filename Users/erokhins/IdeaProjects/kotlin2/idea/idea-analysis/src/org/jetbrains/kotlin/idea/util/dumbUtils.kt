'getApplication' @ [24:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isReadAccessAllowed' @ [24:45] ==> public final val Application.isReadAccessAllowed: Boolean[MyPropertyDescriptor]

'invoke' @ [24:73] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'getInstance' @ [25:24] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'this' @ [25:36] ==> <this> defined in org.jetbrains.kotlin.idea.util.runReadActionInSmartMode[ReceiverParameterDescriptorImpl]

'runReadActionInSmartMode' @ [25:42] ==> public final fun <T : (Any..Any?)> runReadActionInSmartMode(@NotNull p0: () -> (T..T?)): (T..T?) defined in com.intellij.openapi.project.DumbService[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'action' @ [25:70] ==> value-parameter action: () -> T defined in org.jetbrains.kotlin.idea.util.runReadActionInSmartMode[ValueParameterDescriptorImpl]

'getInstance' @ [30:17] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'this' @ [30:29] ==> <this> defined in org.jetbrains.kotlin.idea.util.runWithAlternativeResolveEnabled[ReceiverParameterDescriptorImpl]

'withAlternativeResolveEnabled' @ [30:35] ==> public final fun withAlternativeResolveEnabled(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.project.DumbService[MyFunctionDescriptor]

'result' @ [30:67] ==> var result: T defined in org.jetbrains.kotlin.idea.util.runWithAlternativeResolveEnabled[LocalVariableDescriptor]

'invoke' @ [30:76] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'Suppress' @ [31:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'result' @ [32:12] ==> var result: T defined in org.jetbrains.kotlin.idea.util.runWithAlternativeResolveEnabled[LocalVariableDescriptor]

'getInstance' @ [36:17] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'this' @ [36:29] ==> <this> defined in org.jetbrains.kotlin.idea.util.runWhenSmart[ReceiverParameterDescriptorImpl]

'runWhenSmart' @ [36:35] ==> public final fun runWhenSmart(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.project.DumbService[MyFunctionDescriptor]

'action' @ [36:48] ==> value-parameter action: () -> Unit defined in org.jetbrains.kotlin.idea.util.runWhenSmart[ValueParameterDescriptorImpl]

