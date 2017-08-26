'map' @ [16:80] ==> public final fun <T : (Any..Any?), U : (Any..Any?)> map(p0: (ObservableValue<(Number..Number?)>..ObservableValue<(Number..Number?)>?), p1: (((Number..Number?)) -> (Amount<T>..Amount<T>?)..(((Number..Number?)) -> (Amount<T>..Amount<T>?))?)): (MonadicBinding<(Amount<T>..Amount<T>?)>..MonadicBinding<(Amount<T>..Amount<T>?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)
    <U : (Any..Any?)> -> (net.corda.core.contracts.Amount<T>..net.corda.core.contracts.Amount<T>?)

'createLongBinding' @ [17:22] ==> public final fun createLongBinding(p0: (() -> (Long..Long?)..(() -> (Long..Long?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (LongBinding..LongBinding?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]

'amounts' @ [18:17] ==> value-parameter amounts: ObservableList<Amount<T>> defined in net.corda.client.jfx.utils.AmountBindings.sum[ValueParameterDescriptorImpl]

'stream' @ [18:25] ==> public open fun stream(): Stream<(Amount<T>..Amount<T>?)> defined in javafx.collections.ObservableList[JavaMethodDescriptor]

'collect' @ [18:34] ==> public abstract fun <R : (Any..Any?), A : (Any..Any?)> collect(p0: (Collector<in (Amount<T>..Amount<T>?), out (Any..Any?), (Long..Long?)>..Collector<in (Amount<T>..Amount<T>?), out (Any..Any?), (Long..Long?)>?)): (Long..Long?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)
    <A : (Any..Any?)> -> Captured(*)

'summingLong' @ [18:53] ==> public final fun <T : (Any..Any?)> summingLong(p0: (((Amount<T>..Amount<T>?)) -> Long..(((Amount<T>..Amount<T>?)) -> Long)?)): (Collector<(Amount<T>..Amount<T>?), *, (Long..Long?)>..Collector<(Amount<T>..Amount<T>?), *, (Long..Long?)>?) defined in java.util.stream.Collectors[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.contracts.Amount<T>..net.corda.core.contracts.Amount<T>?)

'require' @ [19:21] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'it' @ [19:29] ==> value-parameter it: (Amount<T>..Amount<T>?) defined in net.corda.client.jfx.utils.AmountBindings.sum.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'token' @ [19:32] ==> public final val token: T defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'token' @ [19:41] ==> value-parameter token: T defined in net.corda.client.jfx.utils.AmountBindings.sum[ValueParameterDescriptorImpl]

'it' @ [20:21] ==> value-parameter it: (Amount<T>..Amount<T>?) defined in net.corda.client.jfx.utils.AmountBindings.sum.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'quantity' @ [20:24] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'arrayOf' @ [22:16] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ObservableList<Amount<T>>): Array<ObservableList<Amount<T>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ObservableList<Amount<T>>

'amounts' @ [22:24] ==> value-parameter amounts: ObservableList<Amount<T>> defined in net.corda.client.jfx.utils.AmountBindings.sum[ValueParameterDescriptorImpl]

'Amount' @ [23:16] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: T) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> T

'sum' @ [23:23] ==> value-parameter sum: (Number..Number?) defined in net.corda.client.jfx.utils.AmountBindings.sum.<anonymous>[ValueParameterDescriptorImpl]

'toLong' @ [23:27] ==> public abstract fun toLong(): Long defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'token' @ [23:37] ==> value-parameter token: T defined in net.corda.client.jfx.utils.AmountBindings.sum[ValueParameterDescriptorImpl]

'combine' @ [29:25] ==> public final fun <A : (Any..Any?), B : (Any..Any?), R : (Any..Any?)> combine(p0: (ObservableValue<(Currency..Currency?)>..ObservableValue<(Currency..Currency?)>?), p1: (ObservableValue<(ExchangeRate..ExchangeRate?)>..ObservableValue<(ExchangeRate..ExchangeRate?)>?), p2: (((Currency..Currency?), (ExchangeRate..ExchangeRate?)) -> (Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)..(((Currency..Currency?), (ExchangeRate..ExchangeRate?)) -> (Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?))?)): (MonadicBinding<(Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)>..MonadicBinding<(Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <A : (Any..Any?)> -> (java.util.Currency..java.util.Currency?)
    <B : (Any..Any?)> -> (net.corda.client.jfx.model.ExchangeRate..net.corda.client.jfx.model.ExchangeRate?)
    <R : (Any..Any?)> -> (kotlin.Pair<java.util.Currency, (net.corda.core.contracts.Amount<java.util.Currency>) -> kotlin.Long>..kotlin.Pair<java.util.Currency, (net.corda.core.contracts.Amount<java.util.Currency>) -> kotlin.Long>?)

'observableCurrency' @ [29:33] ==> value-parameter observableCurrency: ObservableValue<Currency> defined in net.corda.client.jfx.utils.AmountBindings.exchange[ValueParameterDescriptorImpl]

'observableExchangeRate' @ [29:53] ==> value-parameter observableExchangeRate: ObservableValue<ExchangeRate> defined in net.corda.client.jfx.utils.AmountBindings.exchange[ValueParameterDescriptorImpl]

'Pair' @ [30:13] ==> public constructor Pair<out A, out B>(first: Currency, second: (Amount<Currency>) -> Long) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Currency
    <out B> -> Function1<Amount<Currency>, Long>

'currency' @ [31:21] ==> value-parameter currency: (Currency..Currency?) defined in net.corda.client.jfx.utils.AmountBindings.exchange.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [32:24] ==> public final operator fun component1(): Long defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'component2' @ [32:34] ==> public final operator fun component2(): BigDecimal defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'component3' @ [32:37] ==> public final operator fun component3(): Currency defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'exchangeRate' @ [32:48] ==> value-parameter exchangeRate: (ExchangeRate..ExchangeRate?) defined in net.corda.client.jfx.utils.AmountBindings.exchange.<anonymous>[ValueParameterDescriptorImpl]

'rate' @ [32:61] ==> public abstract fun rate(from: Currency, to: Currency): Double defined in net.corda.client.jfx.model.ExchangeRate[SimpleFunctionDescriptorImpl]

'token' @ [32:66] ==> val token: Currency defined in net.corda.client.jfx.utils.AmountBindings.exchange.<anonymous>.<anonymous>[LocalVariableDescriptor]

'currency' @ [32:73] ==> value-parameter currency: (Currency..Currency?) defined in net.corda.client.jfx.utils.AmountBindings.exchange.<anonymous>[ValueParameterDescriptorImpl]

'quantity' @ [32:85] ==> val quantity: Long defined in net.corda.client.jfx.utils.AmountBindings.exchange.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toLong' @ [32:95] ==> public open fun toLong(): Long defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'monadic' @ [42:25] ==> public open fun <T : (Any..Any?)> monadic(p0: (ObservableValue<(Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)>..ObservableValue<(Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)>?)): (MonadicObservableValue<(Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)>..MonadicObservableValue<(Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)>?) defined in org.fxmisc.easybind.EasyBind[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Pair<java.util.Currency, (net.corda.core.contracts.Amount<java.util.Currency>) -> kotlin.Long>..kotlin.Pair<java.util.Currency, (net.corda.core.contracts.Amount<java.util.Currency>) -> kotlin.Long>?)

'exchange' @ [42:33] ==> public final fun exchange(observableCurrency: ObservableValue<Currency>, observableExchangeRate: ObservableValue<ExchangeRate>): ObservableValue<Pair<Currency, (Amount<Currency>) -> Long>> defined in net.corda.client.jfx.utils.AmountBindings[SimpleFunctionDescriptorImpl]

'currency' @ [42:42] ==> value-parameter currency: ObservableValue<Currency> defined in net.corda.client.jfx.utils.AmountBindings.sumAmountExchange[ValueParameterDescriptorImpl]

'exchangeRate' @ [42:52] ==> value-parameter exchangeRate: ObservableValue<ExchangeRate> defined in net.corda.client.jfx.utils.AmountBindings.sumAmountExchange[ValueParameterDescriptorImpl]

'flatMap' @ [42:67] ==> public final fun <U : (Any..Any?)> flatMap(p0: (((Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)) -> (ObservableValue<(Amount<Currency>..Amount<Currency>?)>..ObservableValue<(Amount<Currency>..Amount<Currency>?)>?)..(((Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)) -> (ObservableValue<(Amount<Currency>..Amount<Currency>?)>..ObservableValue<(Amount<Currency>..Amount<Currency>?)>?))?)): (MonadicBinding<(Amount<Currency>..Amount<Currency>?)>..MonadicBinding<(Amount<Currency>..Amount<Currency>?)>?) defined in org.fxmisc.easybind.monadic.MonadicObservableValue[MyFunctionDescriptor]
Inferred types:
    <U : (Any..Any?)> -> (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)

'component1' @ [43:18] ==> public final operator fun component1(): Currency defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [43:33] ==> public final operator fun component2(): (Amount<Currency>) -> Long defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [43:73] ==> value-parameter it: (Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?) defined in net.corda.client.jfx.utils.AmountBindings.sumAmountExchange.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [44:22] ==> public final fun <T : (Any..Any?), U : (Any..Any?)> map(p0: (ObservableValue<(Number..Number?)>..ObservableValue<(Number..Number?)>?), p1: (((Number..Number?)) -> (Amount<Currency>..Amount<Currency>?)..(((Number..Number?)) -> (Amount<Currency>..Amount<Currency>?))?)): (MonadicBinding<(Amount<Currency>..Amount<Currency>?)>..MonadicBinding<(Amount<Currency>..Amount<Currency>?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)
    <U : (Any..Any?)> -> (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)

'createLongBinding' @ [45:30] ==> public final fun createLongBinding(p0: (() -> (Long..Long?)..(() -> (Long..Long?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (LongBinding..LongBinding?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]

'amounts' @ [46:25] ==> value-parameter amounts: ObservableList<Amount<Currency>> defined in net.corda.client.jfx.utils.AmountBindings.sumAmountExchange[ValueParameterDescriptorImpl]

'stream' @ [46:33] ==> public open fun stream(): Stream<(Amount<Currency>..Amount<Currency>?)> defined in javafx.collections.ObservableList[JavaMethodDescriptor]

'collect' @ [46:42] ==> public abstract fun <R : (Any..Any?), A : (Any..Any?)> collect(p0: (Collector<in (Amount<Currency>..Amount<Currency>?), out (Any..Any?), (Long..Long?)>..Collector<in (Amount<Currency>..Amount<Currency>?), out (Any..Any?), (Long..Long?)>?)): (Long..Long?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)
    <A : (Any..Any?)> -> Captured(*)

'summingLong' @ [46:61] ==> public final fun <T : (Any..Any?)> summingLong(p0: (((Amount<Currency>..Amount<Currency>?)) -> Long..(((Amount<Currency>..Amount<Currency>?)) -> Long)?)): (Collector<(Amount<Currency>..Amount<Currency>?), *, (Long..Long?)>..Collector<(Amount<Currency>..Amount<Currency>?), *, (Long..Long?)>?) defined in java.util.stream.Collectors[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)

'invoke' @ [46:75] ==> public abstract operator fun invoke(p1: Amount<Currency>): Long defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [46:84] ==> value-parameter it: (Amount<Currency>..Amount<Currency>?) defined in net.corda.client.jfx.utils.AmountBindings.sumAmountExchange.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [47:24] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ObservableList<Amount<Currency>>): Array<ObservableList<Amount<Currency>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ObservableList<Amount<Currency>>

'amounts' @ [47:32] ==> value-parameter amounts: ObservableList<Amount<Currency>> defined in net.corda.client.jfx.utils.AmountBindings.sumAmountExchange[ValueParameterDescriptorImpl]

'Amount' @ [48:17] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'it' @ [48:24] ==> value-parameter it: (Number..Number?) defined in net.corda.client.jfx.utils.AmountBindings.sumAmountExchange.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toLong' @ [48:27] ==> public abstract fun toLong(): Long defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'currencyValue' @ [48:37] ==> val currencyValue: Currency defined in net.corda.client.jfx.utils.AmountBindings.sumAmountExchange.<anonymous>[LocalVariableDescriptor]

