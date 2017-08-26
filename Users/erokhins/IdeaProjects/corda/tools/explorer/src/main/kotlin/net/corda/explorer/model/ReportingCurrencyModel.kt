'observableValue' @ [18:64] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (ExchangeRateModel) -> ObservableValue<ExchangeRate>): TrackedDelegate.ObservableValueDelegate<ExchangeRateModel, ExchangeRate> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> ExchangeRateModel
    <T> -> ExchangeRate

'ExchangeRateModel' @ [18:80] ==> public constructor ExchangeRateModel() defined in net.corda.client.jfx.model.ExchangeRateModel[DeserializedClassConstructorDescriptor]

'observableValue' @ [19:30] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (SettingsModel) -> ObservableValue<(Currency..Currency?)>): TrackedDelegate.ObservableValueDelegate<SettingsModel, (Currency..Currency?)> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> SettingsModel
    <T> -> (java.util.Currency..java.util.Currency?)

'SettingsModel' @ [19:46] ==> public constructor SettingsModel(path: Path = ...) defined in net.corda.explorer.model.SettingsModel[ClassConstructorDescriptorImpl]

'setOf' @ [20:31] ==> public fun <T> setOf(vararg elements: Currency): Set<Currency> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Currency

'USD' @ [20:37] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'GBP' @ [20:42] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'CHF' @ [20:47] ==> @field:JvmField public val CHF: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'EUR' @ [20:52] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'toList' @ [20:57] ==> public fun <T> Iterable<Currency>.toList(): List<Currency> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Currency

'observable' @ [20:66] ==> public fun <T> List<Currency>.observable(): ObservableList<Currency> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Currency

'map' @ [27:22] ==> public final fun <T : (Any..Any?), U : (Any..Any?)> map(p0: (ObservableValue<(Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)>..ObservableValue<(Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)>?), p1: (((Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)) -> (Pair<Currency, (Amount<Currency>) -> Amount<Currency>>..Pair<Currency, (Amount<Currency>) -> Amount<Currency>>?)..(((Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?)) -> (Pair<Currency, (Amount<Currency>) -> Amount<Currency>>..Pair<Currency, (Amount<Currency>) -> Amount<Currency>>?))?)): (MonadicBinding<(Pair<Currency, (Amount<Currency>) -> Amount<Currency>>..Pair<Currency, (Amount<Currency>) -> Amount<Currency>>?)>..MonadicBinding<(Pair<Currency, (Amount<Currency>) -> Amount<Currency>>..Pair<Currency, (Amount<Currency>) -> Amount<Currency>>?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Pair<Currency, Function1<Amount<Currency>, Long>>
    <U : (Any..Any?)> -> Pair<Currency, Function1<Amount<Currency>, Amount<Currency>>>

'AmountBindings' @ [27:26] ==> public object AmountBindings defined in net.corda.client.jfx.utils[FakeCallableDescriptorForObject]

'exchange' @ [27:41] ==> public final fun exchange(observableCurrency: ObservableValue<Currency>, observableExchangeRate: ObservableValue<ExchangeRate>): ObservableValue<Pair<Currency, (Amount<Currency>) -> Long>> defined in net.corda.client.jfx.utils.AmountBindings[DeserializedSimpleFunctionDescriptor]

'reportingCurrency' @ [27:50] ==> public final val reportingCurrency: ObservableValue<(Currency..Currency?)> defined in net.corda.explorer.model.ReportingCurrencyModel[PropertyDescriptorImpl]

'exchangeRate' @ [27:69] ==> private final val exchangeRate: ObservableValue<ExchangeRate> defined in net.corda.explorer.model.ReportingCurrencyModel[PropertyDescriptorImpl]

'Pair' @ [28:17] ==> public constructor Pair<out A, out B>(first: Currency, second: (Amount<Currency>) -> Amount<Currency>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Currency
    <out B> -> Function1<Amount<Currency>, Amount<Currency>>

'it' @ [28:22] ==> value-parameter it: (Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?) defined in net.corda.explorer.model.ReportingCurrencyModel.reportingExchange.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [28:25] ==> public final val first: Currency defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Amount' @ [29:21] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'it' @ [29:28] ==> value-parameter it: (Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?) defined in net.corda.explorer.model.ReportingCurrencyModel.reportingExchange.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [29:31] ==> public abstract operator fun invoke(p1: Amount<Currency>): Long defined in kotlin.Function1[FunctionInvokeDescriptor]

'amount' @ [29:38] ==> value-parameter amount: Amount<Currency> defined in net.corda.explorer.model.ReportingCurrencyModel.reportingExchange.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [29:47] ==> value-parameter it: (Pair<Currency, (Amount<Currency>) -> Long>..Pair<Currency, (Amount<Currency>) -> Long>?) defined in net.corda.explorer.model.ReportingCurrencyModel.reportingExchange.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [29:50] ==> public final val first: Currency defined in kotlin.Pair[DeserializedPropertyDescriptor]

