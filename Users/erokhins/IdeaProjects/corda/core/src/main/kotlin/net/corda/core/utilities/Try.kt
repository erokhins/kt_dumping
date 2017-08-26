'CordaSerializable' @ [11:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'JvmStatic' @ [18:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'Success' @ [21:17] ==> public constructor Success<out A>(value: T) defined in net.corda.core.utilities.Try.Success[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> T

'invoke' @ [21:25] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'Failure' @ [23:17] ==> public constructor Failure(exception: Throwable) defined in net.corda.core.utilities.Try.Failure[ClassConstructorDescriptorImpl]

't' @ [23:25] ==> val t: Throwable defined in net.corda.core.utilities.Try.Companion.on[LocalVariableDescriptor]

'when (this) {
        is Success -> Success(function(value))
        is Failure -> this
    }' @ [38:54] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Try<B>, entry1: Try<B>): Try<B>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Try<B>

'this' @ [38:60] ==> <this> defined in net.corda.core.utilities.Try[LazyClassReceiverParameterDescriptor]

'Success' @ [39:23] ==> public constructor Success<out A>(value: B) defined in net.corda.core.utilities.Try.Success[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> B

'invoke' @ [39:31] ==> public abstract operator fun invoke(p1: A): B defined in kotlin.Function1[FunctionInvokeDescriptor]

'value' @ [39:40] ==> public final val value: A defined in net.corda.core.utilities.Try.Success[PropertyDescriptorImpl]

'this' @ [40:23] ==> <this> defined in net.corda.core.utilities.Try[LazyClassReceiverParameterDescriptor]

'when (this) {
        is Success -> function(value)
        is Failure -> this
    }' @ [44:63] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Try<B>, entry1: Try<B>): Try<B>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Try<B>

'this' @ [44:69] ==> <this> defined in net.corda.core.utilities.Try[LazyClassReceiverParameterDescriptor]

'invoke' @ [45:23] ==> public abstract operator fun invoke(p1: A): Try<B> defined in kotlin.Function1[FunctionInvokeDescriptor]

'value' @ [45:32] ==> public final val value: A defined in net.corda.core.utilities.Try.Success[PropertyDescriptorImpl]

'this' @ [46:23] ==> <this> defined in net.corda.core.utilities.Try[LazyClassReceiverParameterDescriptor]

'when (this) {
        is Success -> when (other) {
            is Success -> Success(function(value, other.value))
            is Failure -> other
        }
        is Failure -> this
    }' @ [53:79] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Try<C>, entry1: Try<C>): Try<C>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Try<C>

'this' @ [53:85] ==> <this> defined in net.corda.core.utilities.Try[LazyClassReceiverParameterDescriptor]

'when (other) {
            is Success -> Success(function(value, other.value))
            is Failure -> other
        }' @ [54:23] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Try<C>, entry1: Try<C>): Try<C>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Try<C>

'other' @ [54:29] ==> value-parameter other: Try<B> defined in net.corda.core.utilities.Try.combine[ValueParameterDescriptorImpl]

'Success' @ [55:27] ==> public constructor Success<out A>(value: C) defined in net.corda.core.utilities.Try.Success[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> C

'invoke' @ [55:35] ==> public abstract operator fun invoke(p1: A, p2: B): C defined in kotlin.Function2[FunctionInvokeDescriptor]

'value' @ [55:44] ==> public final val value: A defined in net.corda.core.utilities.Try.Success[PropertyDescriptorImpl]

'other' @ [55:51] ==> value-parameter other: Try<B> defined in net.corda.core.utilities.Try.combine[ValueParameterDescriptorImpl]

'value' @ [55:57] ==> public final val value: B defined in net.corda.core.utilities.Try.Success[PropertyDescriptorImpl]

'other' @ [56:27] ==> value-parameter other: Try<B> defined in net.corda.core.utilities.Try.combine[ValueParameterDescriptorImpl]

'this' @ [58:23] ==> <this> defined in net.corda.core.utilities.Try[LazyClassReceiverParameterDescriptor]

'Try<A>' @ [61:47] ==> private constructor Try<out A>() defined in net.corda.core.utilities.Try[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> A

'value' @ [64:40] ==> public final val value: A defined in net.corda.core.utilities.Try.Success[PropertyDescriptorImpl]

'value' @ [65:53] ==> public final val value: A defined in net.corda.core.utilities.Try.Success[PropertyDescriptorImpl]

'Try<Nothing>' @ [68:52] ==> private constructor Try<out A>() defined in net.corda.core.utilities.Try[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> Nothing

'exception' @ [71:52] ==> public final val exception: Throwable defined in net.corda.core.utilities.Try.Failure[PropertyDescriptorImpl]

'exception' @ [72:53] ==> public final val exception: Throwable defined in net.corda.core.utilities.Try.Failure[PropertyDescriptorImpl]

