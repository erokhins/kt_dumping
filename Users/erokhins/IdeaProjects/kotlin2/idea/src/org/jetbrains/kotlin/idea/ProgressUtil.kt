'if (!with(ApplicationManager.getApplication()) { isDispatchThread && isUnitTestMode }) {
        val complete = ProgressIndicatorUtils.runInReadActionWithWriteActionPriority {
            r = f()
        }

        // There is a write action in progress or pending, so no point in counting the result
        if (!complete) throw ProcessCanceledException()
    }
    else {
        r = f()
    }' @ [27:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [27:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'with' @ [27:10] ==> @InlineOnly public inline fun <T, R> with(receiver: (Application..Application?), block: (Application..Application?).() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.application.Application..com.intellij.openapi.application.Application?)
    <R> -> Boolean

'getApplication' @ [27:34] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isDispatchThread' @ [27:54] ==> public final val Application.isDispatchThread: Boolean[MyPropertyDescriptor]

'isUnitTestMode' @ [27:74] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'runInReadActionWithWriteActionPriority' @ [28:47] ==> public final fun runInReadActionWithWriteActionPriority(@NotNull p0: () -> Unit): Boolean defined in com.intellij.openapi.progress.util.ProgressIndicatorUtils[SamAdapterFunctionDescriptor]

'r' @ [29:13] ==> var r: T? defined in org.jetbrains.kotlin.idea.runInReadActionWithWriteActionPriorityWithPCE[LocalVariableDescriptor]

'invoke' @ [29:17] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'!' @ [33:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'complete' @ [33:14] ==> val complete: Boolean defined in org.jetbrains.kotlin.idea.runInReadActionWithWriteActionPriorityWithPCE[LocalVariableDescriptor]

'ProcessCanceledException' @ [33:30] ==> public constructor ProcessCanceledException() defined in com.intellij.openapi.progress.ProcessCanceledException[JavaClassConstructorDescriptor]

'r' @ [36:9] ==> var r: T? defined in org.jetbrains.kotlin.idea.runInReadActionWithWriteActionPriorityWithPCE[LocalVariableDescriptor]

'invoke' @ [36:13] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'r' @ [39:12] ==> var r: T? defined in org.jetbrains.kotlin.idea.runInReadActionWithWriteActionPriorityWithPCE[LocalVariableDescriptor]

'getInstance' @ [44:21] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'runProcessWithProgressSynchronously' @ [44:35] ==> public final fun runProcessWithProgressSynchronously(@NotNull p0: () -> Unit, @NotNull @Nls p1: String, p2: Boolean, @Nullable p3: Project?): Boolean defined in com.intellij.openapi.progress.ProgressManager[MyFunctionDescriptor]

'result' @ [44:73] ==> var result: T? defined in org.jetbrains.kotlin.idea.runSynchronouslyWithProgress[LocalVariableDescriptor]

'invoke' @ [44:82] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'progressTitle' @ [44:94] ==> value-parameter progressTitle: String defined in org.jetbrains.kotlin.idea.runSynchronouslyWithProgress[ValueParameterDescriptorImpl]

'canBeCanceled' @ [44:109] ==> value-parameter canBeCanceled: Boolean defined in org.jetbrains.kotlin.idea.runSynchronouslyWithProgress[ValueParameterDescriptorImpl]

'this' @ [44:124] ==> <this> defined in org.jetbrains.kotlin.idea.runSynchronouslyWithProgress[ReceiverParameterDescriptorImpl]

'result' @ [45:12] ==> var result: T? defined in org.jetbrains.kotlin.idea.runSynchronouslyWithProgress[LocalVariableDescriptor]

