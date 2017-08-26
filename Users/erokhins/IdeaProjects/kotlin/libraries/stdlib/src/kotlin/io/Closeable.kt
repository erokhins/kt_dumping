'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'JvmVersion' @ [18:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'InlineOnly' @ [31:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'invoke' @ [35:16] ==> public abstract operator fun invoke(p1: T): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [35:22] ==> <this> defined in kotlin.io.use[ReceiverParameterDescriptorImpl]

'closed' @ [37:9] ==> var closed: Boolean defined in kotlin.io.use[LocalVariableDescriptor]

'this' @ [39:13] ==> <this> defined in kotlin.io.use[ReceiverParameterDescriptorImpl]

'close' @ [39:19] ==> public abstract fun close(): Unit defined in java.io.Closeable[JavaMethodDescriptor]

'e' @ [42:15] ==> val e: Exception /* = Exception */ defined in kotlin.io.use[LocalVariableDescriptor]

'!' @ [44:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'closed' @ [44:14] ==> var closed: Boolean defined in kotlin.io.use[LocalVariableDescriptor]

'this' @ [45:13] ==> <this> defined in kotlin.io.use[ReceiverParameterDescriptorImpl]

'close' @ [45:19] ==> public abstract fun close(): Unit defined in java.io.Closeable[JavaMethodDescriptor]

'SinceKotlin' @ [56:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'PublishedApi' @ [57:1] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'when {
    this == null -> {}
    cause == null -> close()
    else ->
        try {
            close()
        } catch (closeException: Throwable) {
            cause.addSuppressed(closeException)
        }
}' @ [58:59] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'this' @ [59:5] ==> <this> defined in kotlin.io.closeFinally[ReceiverParameterDescriptorImpl]

'cause' @ [60:5] ==> value-parameter cause: Throwable? defined in kotlin.io.closeFinally[ValueParameterDescriptorImpl]

'close' @ [60:22] ==> public abstract fun close(): Unit defined in java.io.Closeable[JavaMethodDescriptor]

'close' @ [63:13] ==> public abstract fun close(): Unit defined in java.io.Closeable[JavaMethodDescriptor]

'cause' @ [65:13] ==> value-parameter cause: Throwable? defined in kotlin.io.closeFinally[ValueParameterDescriptorImpl]

'addSuppressed' @ [65:19] ==> public fun Throwable.addSuppressed(exception: Throwable): Unit defined in kotlin[SimpleFunctionDescriptorImpl]

'closeException' @ [65:33] ==> val closeException: Throwable defined in kotlin.io.closeFinally[LocalVariableDescriptor]

