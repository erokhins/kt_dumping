'Amount' @ [14:9] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'exchangeDouble' @ [14:16] ==> public fun ExchangeRate.exchangeDouble(amount: Amount<Currency>, to: Currency): Double defined in net.corda.client.jfx.model in file ExchangeRateModel.kt[SimpleFunctionDescriptorImpl]

'amount' @ [14:31] ==> value-parameter amount: Amount<Currency> defined in net.corda.client.jfx.model.exchangeAmount[ValueParameterDescriptorImpl]

'to' @ [14:39] ==> value-parameter to: Currency defined in net.corda.client.jfx.model.exchangeAmount[ValueParameterDescriptorImpl]

'toLong' @ [14:43] ==> public open fun toLong(): Long defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'to' @ [14:53] ==> value-parameter to: Currency defined in net.corda.client.jfx.model.exchangeAmount[ValueParameterDescriptorImpl]

'rate' @ [17:9] ==> public abstract fun rate(from: Currency, to: Currency): Double defined in net.corda.client.jfx.model.ExchangeRate[SimpleFunctionDescriptorImpl]

'amount' @ [17:14] ==> value-parameter amount: Amount<Currency> defined in net.corda.client.jfx.model.exchangeDouble[ValueParameterDescriptorImpl]

'token' @ [17:21] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'to' @ [17:28] ==> value-parameter to: Currency defined in net.corda.client.jfx.model.exchangeDouble[ValueParameterDescriptorImpl]

'amount' @ [17:34] ==> value-parameter amount: Amount<Currency> defined in net.corda.client.jfx.model.exchangeDouble[ValueParameterDescriptorImpl]

'quantity' @ [17:41] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'SimpleObjectProperty' @ [24:55] ==> public constructor SimpleObjectProperty<T : (Any..Any?)>(p0: (ExchangeRate..ExchangeRate?)) defined in javafx.beans.property.SimpleObjectProperty[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ExchangeRate

