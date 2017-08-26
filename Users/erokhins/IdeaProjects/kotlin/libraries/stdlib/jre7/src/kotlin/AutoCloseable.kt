'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'SinceKotlin' @ [30:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Suppress' @ [31:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'kotlin.internal.InlineOnly' @ [32:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[DeserializedClassConstructorDescriptor]

'invoke' @ [36:16] ==> public abstract operator fun invoke(p1: T): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [36:22] ==> <this> defined in kotlin.use[ReceiverParameterDescriptorImpl]

'exception' @ [38:9] ==> var exception: Throwable? defined in kotlin.use[LocalVariableDescriptor]

'e' @ [38:21] ==> val e: Throwable defined in kotlin.use[LocalVariableDescriptor]

'e' @ [39:15] ==> val e: Throwable defined in kotlin.use[LocalVariableDescriptor]

'this' @ [41:9] ==> <this> defined in kotlin.use[ReceiverParameterDescriptorImpl]

'closeFinally' @ [41:14] ==> @SinceKotlin @PublishedApi internal fun AutoCloseable?.closeFinally(cause: Throwable?): Unit defined in kotlin in file AutoCloseable.kt[SimpleFunctionDescriptorImpl]

'exception' @ [41:27] ==> var exception: Throwable? defined in kotlin.use[LocalVariableDescriptor]

'SinceKotlin' @ [51:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'PublishedApi' @ [52:1] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'when {
    this == null -> {}
    cause == null -> close()
    else ->
        try {
            close()
        } catch (closeException: Throwable) {
            cause.addSuppressed(closeException)
        }
}' @ [53:63] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'this' @ [54:5] ==> <this> defined in kotlin.closeFinally[ReceiverParameterDescriptorImpl]

'cause' @ [55:5] ==> value-parameter cause: Throwable? defined in kotlin.closeFinally[ValueParameterDescriptorImpl]

'close' @ [55:22] ==> public abstract fun close(): Unit defined in java.lang.AutoCloseable[JavaMethodDescriptor]

'close' @ [58:13] ==> public abstract fun close(): Unit defined in java.lang.AutoCloseable[JavaMethodDescriptor]

'cause' @ [60:13] ==> value-parameter cause: Throwable? defined in kotlin.closeFinally[ValueParameterDescriptorImpl]

'addSuppressed' @ [60:19] ==> public final fun addSuppressed(p0: (Throwable..Throwable?)): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'closeException' @ [60:33] ==> val closeException: Throwable defined in kotlin.closeFinally[LocalVariableDescriptor]

