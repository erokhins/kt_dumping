'when (this) {
    Positivity.Positive -> ""
    Positivity.Negative -> "-"
}' @ [10:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [10:43] ==> <this> defined in net.corda.explorer.sign[ReceiverParameterDescriptorImpl]

'Positive' @ [11:16] ==> enum entry Positive defined in net.corda.explorer.Positivity[FakeCallableDescriptorForObject]

'Negative' @ [12:16] ==> enum entry Negative defined in net.corda.explorer.Positivity[FakeCallableDescriptorForObject]

'AmountDiff' @ [21:17] ==> public constructor AmountDiff<T : Any>(positivity: Positivity, amount: Amount<T>) defined in net.corda.explorer.AmountDiff[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'if (quantity < 0) Positivity.Negative else Positivity.Positive' @ [22:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Positivity, elseBranch: Positivity): Positivity[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Positivity

'quantity' @ [22:42] ==> value-parameter quantity: Long defined in net.corda.explorer.AmountDiff.Companion.fromLong[ValueParameterDescriptorImpl]

'Negative' @ [22:67] ==> enum entry Negative defined in net.corda.explorer.Positivity[FakeCallableDescriptorForObject]

'Positive' @ [22:92] ==> enum entry Positive defined in net.corda.explorer.Positivity[FakeCallableDescriptorForObject]

'Amount' @ [23:34] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: T) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> T

'abs' @ [23:46] ==> public open fun abs(p0: Long): Long defined in java.lang.Math[JavaMethodDescriptor]

'quantity' @ [23:50] ==> value-parameter quantity: Long defined in net.corda.explorer.AmountDiff.Companion.fromLong[ValueParameterDescriptorImpl]

'token' @ [23:61] ==> value-parameter token: T defined in net.corda.explorer.AmountDiff.Companion.fromLong[ValueParameterDescriptorImpl]

