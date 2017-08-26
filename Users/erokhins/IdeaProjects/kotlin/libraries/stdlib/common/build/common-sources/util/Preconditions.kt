'kotlin.jvm.JvmMultifileClass' @ [1:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmName' @ [2:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'kotlin.internal.InlineOnly' @ [10:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'require' @ [11:51] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[SimpleFunctionDescriptorImpl]

'value' @ [11:59] ==> value-parameter value: Boolean defined in kotlin.require[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [18:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'!' @ [20:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'value' @ [20:10] ==> value-parameter value: Boolean defined in kotlin.require[ValueParameterDescriptorImpl]

'invoke' @ [21:23] ==> public abstract operator fun invoke(): Any defined in kotlin.Function0[FunctionInvokeDescriptor]

'IllegalArgumentException' @ [22:15] ==> public constructor IllegalArgumentException(message: String) defined in kotlin.IllegalArgumentException[ClassConstructorDescriptorImpl]

'message' @ [22:40] ==> val message: Any defined in kotlin.require[LocalVariableDescriptor]

'toString' @ [22:48] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'kotlin.internal.InlineOnly' @ [29:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'requireNotNull' @ [30:58] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: T?, lazyMessage: () -> Any): T defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'value' @ [30:73] ==> value-parameter value: T? defined in kotlin.requireNotNull[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [38:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'if (value == null) {
        val message = lazyMessage()
        throw IllegalArgumentException(message.toString())
    } else {
        return value
    }' @ [40:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'value' @ [40:9] ==> value-parameter value: T? defined in kotlin.requireNotNull[ValueParameterDescriptorImpl]

'invoke' @ [41:23] ==> public abstract operator fun invoke(): Any defined in kotlin.Function0[FunctionInvokeDescriptor]

'IllegalArgumentException' @ [42:15] ==> public constructor IllegalArgumentException(message: String) defined in kotlin.IllegalArgumentException[ClassConstructorDescriptorImpl]

'message' @ [42:40] ==> val message: Any defined in kotlin.requireNotNull[LocalVariableDescriptor]

'toString' @ [42:48] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'value' @ [44:16] ==> value-parameter value: T? defined in kotlin.requireNotNull[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [53:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'check' @ [54:49] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[SimpleFunctionDescriptorImpl]

'value' @ [54:55] ==> value-parameter value: Boolean defined in kotlin.check[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [61:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'!' @ [63:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'value' @ [63:10] ==> value-parameter value: Boolean defined in kotlin.check[ValueParameterDescriptorImpl]

'invoke' @ [64:23] ==> public abstract operator fun invoke(): Any defined in kotlin.Function0[FunctionInvokeDescriptor]

'IllegalStateException' @ [65:15] ==> public constructor IllegalStateException(message: String) defined in kotlin.IllegalStateException[ClassConstructorDescriptorImpl]

'message' @ [65:37] ==> val message: Any defined in kotlin.check[LocalVariableDescriptor]

'toString' @ [65:45] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'kotlin.internal.InlineOnly' @ [75:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'checkNotNull' @ [76:56] ==> @InlineOnly public inline fun <T : Any> checkNotNull(value: T?, lazyMessage: () -> Any): T defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'value' @ [76:69] ==> value-parameter value: T? defined in kotlin.checkNotNull[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [84:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'if (value == null) {
        val message = lazyMessage()
        throw IllegalStateException(message.toString())
    } else {
        return value
    }' @ [86:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'value' @ [86:9] ==> value-parameter value: T? defined in kotlin.checkNotNull[ValueParameterDescriptorImpl]

'invoke' @ [87:23] ==> public abstract operator fun invoke(): Any defined in kotlin.Function0[FunctionInvokeDescriptor]

'IllegalStateException' @ [88:15] ==> public constructor IllegalStateException(message: String) defined in kotlin.IllegalStateException[ClassConstructorDescriptorImpl]

'message' @ [88:37] ==> val message: Any defined in kotlin.checkNotNull[LocalVariableDescriptor]

'toString' @ [88:45] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'value' @ [90:16] ==> value-parameter value: T? defined in kotlin.checkNotNull[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [100:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'IllegalStateException' @ [101:56] ==> public constructor IllegalStateException(message: String) defined in kotlin.IllegalStateException[ClassConstructorDescriptorImpl]

'message' @ [101:78] ==> value-parameter message: Any defined in kotlin.error[ValueParameterDescriptorImpl]

'toString' @ [101:86] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

