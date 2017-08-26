'SwapData' @ [29:16] ==> public constructor SwapData(id: Pair<String, String>, buyer: Pair<String, PublicKey>, seller: Pair<String, PublicKey>, description: String, tradeDate: LocalDate, convention: String, startDate: LocalDate, endDate: LocalDate, notional: BigDecimal, fixedRate: BigDecimal) defined in net.corda.vega.contracts.SwapData[ClassConstructorDescriptorImpl]

'Pair' @ [30:17] ==> public constructor Pair<out A, out B>(first: String, second: String) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> String

'id' @ [30:30] ==> public final val id: String defined in net.corda.vega.api.SwapDataModel[PropertyDescriptorImpl]

'Pair' @ [30:35] ==> public constructor Pair<out A, out B>(first: String, second: PublicKey) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> PublicKey

'buyer' @ [30:49] ==> value-parameter buyer: Party defined in net.corda.vega.api.SwapDataModel.toData[ValueParameterDescriptorImpl]

'owningKey' @ [30:55] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Pair' @ [30:67] ==> public constructor Pair<out A, out B>(first: String, second: PublicKey) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> PublicKey

'seller' @ [30:81] ==> value-parameter seller: Party defined in net.corda.vega.api.SwapDataModel.toData[ValueParameterDescriptorImpl]

'owningKey' @ [30:88] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'description' @ [30:100] ==> public final val description: String defined in net.corda.vega.api.SwapDataModel[PropertyDescriptorImpl]

'tradeDate' @ [30:113] ==> public final val tradeDate: LocalDate defined in net.corda.vega.api.SwapDataModel[PropertyDescriptorImpl]

'convention' @ [30:124] ==> public final val convention: String defined in net.corda.vega.api.SwapDataModel[PropertyDescriptorImpl]

'startDate' @ [30:136] ==> public final val startDate: LocalDate defined in net.corda.vega.api.SwapDataModel[PropertyDescriptorImpl]

'endDate' @ [30:147] ==> public final val endDate: LocalDate defined in net.corda.vega.api.SwapDataModel[PropertyDescriptorImpl]

'notional' @ [30:156] ==> public final val notional: BigDecimal defined in net.corda.vega.api.SwapDataModel[PropertyDescriptorImpl]

'fixedRate' @ [30:166] ==> public final val fixedRate: BigDecimal defined in net.corda.vega.api.SwapDataModel[PropertyDescriptorImpl]

