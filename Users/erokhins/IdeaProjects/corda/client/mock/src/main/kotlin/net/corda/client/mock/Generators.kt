'Generator' @ [8:12] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pickOne' @ [8:22] ==> public fun <A> Generator.Companion.pickOne(list: List<(Currency..Currency?)>): Generator<(Currency..Currency?)> defined in net.corda.client.mock[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> (java.util.Currency..java.util.Currency?)

'getAvailableCurrencies' @ [8:39] ==> public open fun getAvailableCurrencies(): (MutableSet<(Currency..Currency?)>..Set<(Currency..Currency?)>?) defined in java.util.Currency[JavaMethodDescriptor]

'toList' @ [8:64] ==> public fun <T> Iterable<(Currency..Currency?)>.toList(): List<(Currency..Currency?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.Currency..java.util.Currency?)

'Generator' @ [12:12] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'longRange' @ [12:22] ==> public fun Generator.Companion.longRange(from: Long, to: Long): Generator<Long> defined in net.corda.client.mock[SimpleFunctionDescriptorImpl]

'min' @ [12:32] ==> value-parameter min: Long defined in net.corda.client.mock.generateAmount[ValueParameterDescriptorImpl]

'max' @ [12:37] ==> value-parameter max: Long defined in net.corda.client.mock.generateAmount[ValueParameterDescriptorImpl]

'combine' @ [12:42] ==> public final fun <B, R> combine(other1: Generator<T>, function: (Long, T) -> Amount<T>): Generator<Amount<T>> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> T
    <R> -> Amount<T>

'tokenGenerator' @ [12:50] ==> value-parameter tokenGenerator: Generator<T> defined in net.corda.client.mock.generateAmount[ValueParameterDescriptorImpl]

'Amount' @ [12:87] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: T) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> T

'quantity' @ [12:94] ==> value-parameter quantity: Long defined in net.corda.client.mock.generateAmount.<anonymous>[ValueParameterDescriptorImpl]

'token' @ [12:104] ==> value-parameter token: T defined in net.corda.client.mock.generateAmount.<anonymous>[ValueParameterDescriptorImpl]

'generateAmount' @ [16:12] ==> public fun <T : Any> generateAmount(min: Long, max: Long, tokenGenerator: Generator<Currency>): Generator<Amount<Currency>> defined in net.corda.client.mock[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Currency

'min' @ [16:27] ==> value-parameter min: Long defined in net.corda.client.mock.generateCurrencyAmount[ValueParameterDescriptorImpl]

'max' @ [16:32] ==> value-parameter max: Long defined in net.corda.client.mock.generateCurrencyAmount[ValueParameterDescriptorImpl]

'generateCurrency' @ [16:37] ==> public fun generateCurrency(): Generator<Currency> defined in net.corda.client.mock[SimpleFunctionDescriptorImpl]

'Generator' @ [20:12] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'bytes' @ [20:22] ==> public fun Generator.Companion.bytes(size: Int): Generator<ByteArray> defined in net.corda.client.mock[SimpleFunctionDescriptorImpl]

'size' @ [20:28] ==> value-parameter size: Int defined in net.corda.client.mock.generateIssueRef[ValueParameterDescriptorImpl]

'map' @ [20:34] ==> public final fun <B> map(function: (ByteArray) -> OpaqueBytes): Generator<OpaqueBytes> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> OpaqueBytes

'OpaqueBytes' @ [20:40] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[DeserializedClassConstructorDescriptor]

'it' @ [20:52] ==> value-parameter it: ByteArray defined in net.corda.client.mock.generateIssueRef.<anonymous>[ValueParameterDescriptorImpl]

