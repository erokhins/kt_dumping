'CustomSerializer.ToString<Currency>' @ [9:29] ==> public constructor ToString<T>(clazz: Class<Currency>, withInheritance: Boolean = ..., maker: (String) -> Currency = ..., unmaker: (Currency) -> String = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Currency

'Currency' @ [9:65] ==> private constructor Currency(p0: (String..String?), p1: Int, p2: Int) defined in java.util.Currency[JavaClassConstructorDescriptor]

'java' @ [9:81] ==> public val <T> KClass<Currency>.java: Class<Currency> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Currency

'getInstance' @ [11:28] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'it' @ [11:40] ==> value-parameter it: String defined in net.corda.nodeapi.internal.serialization.amqp.custom.CurrencySerializer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [12:21] ==> value-parameter it: Currency defined in net.corda.nodeapi.internal.serialization.amqp.custom.CurrencySerializer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'currencyCode' @ [12:24] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

