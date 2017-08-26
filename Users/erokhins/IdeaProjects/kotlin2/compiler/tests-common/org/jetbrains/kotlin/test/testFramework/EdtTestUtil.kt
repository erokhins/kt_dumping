'TestOnly' @ [25:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'JvmStatic' @ [25:19] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'runInEdtAndWait' @ [26:13] ==> @TestOnly public fun runInEdtAndWait(runnable: () -> Unit): Unit defined in org.jetbrains.kotlin.test.testFramework in file EdtTestUtil.kt[SimpleFunctionDescriptorImpl]

'runnable' @ [26:31] ==> value-parameter runnable: Runnable defined in org.jetbrains.kotlin.test.testFramework.EdtTestUtil.Companion.runInEdtAndWait[ValueParameterDescriptorImpl]

'run' @ [26:40] ==> public abstract fun run(): Unit defined in java.lang.Runnable[JavaMethodDescriptor]

'TestOnly' @ [35:1] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'if (SwingUtilities.isEventDispatchThread()) {
        runnable()
    }
    else {
        try {
            SwingUtilities.invokeAndWait(runnable)
        }
        catch (e: InvocationTargetException) {
            throw e.cause ?: e
        }
    }' @ [37:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isEventDispatchThread' @ [37:24] ==> public open fun isEventDispatchThread(): Boolean defined in javax.swing.SwingUtilities[JavaMethodDescriptor]

'invoke' @ [38:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'invokeAndWait' @ [42:28] ==> public final fun invokeAndWait(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javax.swing.SwingUtilities[SamAdapterFunctionDescriptor]

'runnable' @ [42:42] ==> value-parameter runnable: () -> Unit defined in org.jetbrains.kotlin.test.testFramework.runInEdtAndWait[ValueParameterDescriptorImpl]

'e' @ [45:19] ==> val e: InvocationTargetException defined in org.jetbrains.kotlin.test.testFramework.runInEdtAndWait[LocalVariableDescriptor]

'cause' @ [45:21] ==> public open val cause: Throwable? defined in java.lang.reflect.InvocationTargetException[JavaPropertyDescriptor]

'e' @ [45:30] ==> val e: InvocationTargetException defined in org.jetbrains.kotlin.test.testFramework.runInEdtAndWait[LocalVariableDescriptor]

