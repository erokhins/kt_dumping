'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'filterIsInstance' @ [25:89] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State

'filter' @ [25:120] ==> public inline fun <T> Iterable<Cash.State>.filter(predicate: (Cash.State) -> Boolean): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'it' @ [25:129] ==> value-parameter it: Cash.State defined in net.corda.finance.utils.sumCashBy.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [25:132] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'owner' @ [25:141] ==> value-parameter owner: AbstractParty defined in net.corda.finance.utils.sumCashBy[ValueParameterDescriptorImpl]

'map' @ [25:149] ==> public inline fun <T, R> Iterable<Cash.State>.map(transform: (Cash.State) -> Amount<Issued<Currency>>): List<Amount<Issued<Currency>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> Amount<Issued<Currency>>

'it' @ [25:155] ==> value-parameter it: Cash.State defined in net.corda.finance.utils.sumCashBy.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [25:158] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'sumOrThrow' @ [25:167] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<Currency>>>.sumOrThrow(): Amount<Issued<Currency>> defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<Currency>

'filterIsInstance' @ [31:67] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State

'map' @ [31:98] ==> public inline fun <T, R> Iterable<Cash.State>.map(transform: (Cash.State) -> Amount<Issued<Currency>>): List<Amount<Issued<Currency>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> Amount<Issued<Currency>>

'it' @ [31:104] ==> value-parameter it: Cash.State defined in net.corda.finance.utils.sumCash.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [31:107] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'sumOrThrow' @ [31:116] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<Currency>>>.sumOrThrow(): Amount<Issued<Currency>> defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<Currency>

'filterIsInstance' @ [34:74] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State

'map' @ [34:105] ==> public inline fun <T, R> Iterable<Cash.State>.map(transform: (Cash.State) -> Amount<Issued<Currency>>): List<Amount<Issued<Currency>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> Amount<Issued<Currency>>

'it' @ [34:111] ==> value-parameter it: Cash.State defined in net.corda.finance.utils.sumCashOrNull.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [34:114] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'sumOrNull' @ [34:123] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<Currency>>>.sumOrNull(): Amount<Issued<Currency>>? defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<Currency>

'filterIsInstance' @ [38:12] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State

'map' @ [38:43] ==> public inline fun <T, R> Iterable<Cash.State>.map(transform: (Cash.State) -> Amount<Issued<Currency>>): List<Amount<Issued<Currency>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> Amount<Issued<Currency>>

'it' @ [38:49] ==> value-parameter it: Cash.State defined in net.corda.finance.utils.sumCashOrZero.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [38:52] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'sumOrZero' @ [38:61] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<Currency>>>.sumOrZero(token: Issued<Currency>): Amount<Issued<Currency>> defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<Currency>

'currency' @ [38:71] ==> value-parameter currency: Issued<Currency> defined in net.corda.finance.utils.sumCashOrZero[ValueParameterDescriptorImpl]

'filterIsInstance' @ [42:61] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<FungibleAsset<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> FungibleAsset<T>

'map' @ [42:98] ==> public inline fun <T, R> Iterable<FungibleAsset<T>>.map(transform: (FungibleAsset<T>) -> Amount<Issued<T>>): List<Amount<Issued<T>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<T>
    <R> -> Amount<Issued<T>>

'it' @ [42:104] ==> value-parameter it: FungibleAsset<T> defined in net.corda.finance.utils.sumFungibleOrNull.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [42:107] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'sumOrNull' @ [42:116] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<T>>>.sumOrNull(): Amount<Issued<T>>? defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<T>

'filterIsInstance' @ [45:77] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<FungibleAsset<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> FungibleAsset<T>

'map' @ [45:114] ==> public inline fun <T, R> Iterable<FungibleAsset<T>>.map(transform: (FungibleAsset<T>) -> Amount<Issued<T>>): List<Amount<Issued<T>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<T>
    <R> -> Amount<Issued<T>>

'it' @ [45:120] ==> value-parameter it: FungibleAsset<T> defined in net.corda.finance.utils.sumFungibleOrZero.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [45:123] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'sumOrZero' @ [45:132] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<T>>>.sumOrZero(token: Issued<T>): Amount<Issued<T>> defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<T>

'token' @ [45:142] ==> value-parameter token: Issued<T> defined in net.corda.finance.utils.sumFungibleOrZero[ValueParameterDescriptorImpl]

'filterIsInstance' @ [51:48] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CommodityContract.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State

'map' @ [51:92] ==> public inline fun <T, R> Iterable<CommodityContract.State>.map(transform: (CommodityContract.State) -> Amount<Issued<Commodity>>): List<Amount<Issued<Commodity>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> Amount<Issued<Commodity>>

'it' @ [51:98] ==> value-parameter it: CommodityContract.State defined in net.corda.finance.utils.sumCommodities.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [51:101] ==> public open val amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'sumOrThrow' @ [51:110] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<Commodity>>>.sumOrThrow(): Amount<Issued<Commodity>> defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<Commodity>

'Suppress' @ [54:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'filterIsInstance' @ [55:54] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CommodityContract.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State

'map' @ [55:98] ==> public inline fun <T, R> Iterable<CommodityContract.State>.map(transform: (CommodityContract.State) -> Amount<Issued<Commodity>>): List<Amount<Issued<Commodity>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> Amount<Issued<Commodity>>

'it' @ [55:104] ==> value-parameter it: CommodityContract.State defined in net.corda.finance.utils.sumCommoditiesOrNull.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [55:107] ==> public open val amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'sumOrNull' @ [55:116] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<Commodity>>>.sumOrNull(): Amount<Issued<Commodity>>? defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<Commodity>

'filterIsInstance' @ [58:81] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CommodityContract.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State

'map' @ [58:125] ==> public inline fun <T, R> Iterable<CommodityContract.State>.map(transform: (CommodityContract.State) -> Amount<Issued<Commodity>>): List<Amount<Issued<Commodity>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> Amount<Issued<Commodity>>

'it' @ [58:131] ==> value-parameter it: CommodityContract.State defined in net.corda.finance.utils.sumCommoditiesOrZero.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [58:134] ==> public open val amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'sumOrZero' @ [58:143] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<Commodity>>>.sumOrZero(token: Issued<Commodity>): Amount<Issued<Commodity>> defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<Commodity>

'currency' @ [58:153] ==> value-parameter currency: Issued<Commodity> defined in net.corda.finance.utils.sumCommoditiesOrZero[ValueParameterDescriptorImpl]

'filterIsInstance' @ [65:11] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State<P>

'map' @ [65:51] ==> public inline fun <T, R> Iterable<Obligation.State<P>>.map(transform: (Obligation.State<P>) -> Amount<Issued<Obligation.Terms<P>>>): List<Amount<Issued<Obligation.Terms<P>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>
    <R> -> Amount<Issued<Terms<P>>>

'it' @ [65:57] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.utils.sumObligations.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [65:60] ==> public open val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'sumOrThrow' @ [65:69] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<Obligation.Terms<P>>>>.sumOrThrow(): Amount<Issued<Obligation.Terms<P>>> defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<Terms<P>>

'filterIsInstance' @ [69:11] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State<P>

'filter' @ [69:51] ==> public inline fun <T> Iterable<Obligation.State<P>>.filter(predicate: (Obligation.State<P>) -> Boolean): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'it' @ [69:60] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.utils.sumObligationsOrNull.<anonymous>[ValueParameterDescriptorImpl]

'lifecycle' @ [69:63] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'NORMAL' @ [69:97] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'map' @ [69:106] ==> public inline fun <T, R> Iterable<Obligation.State<P>>.map(transform: (Obligation.State<P>) -> Amount<Issued<Obligation.Terms<P>>>): List<Amount<Issued<Obligation.Terms<P>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>
    <R> -> Amount<Issued<Terms<P>>>

'it' @ [69:112] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.utils.sumObligationsOrNull.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [69:115] ==> public open val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'sumOrNull' @ [69:124] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<Obligation.Terms<P>>>>.sumOrNull(): Amount<Issued<Obligation.Terms<P>>>? defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<Terms<P>>

'filterIsInstance' @ [73:11] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State<P>

'filter' @ [73:51] ==> public inline fun <T> Iterable<Obligation.State<P>>.filter(predicate: (Obligation.State<P>) -> Boolean): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'it' @ [73:60] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.utils.sumObligationsOrZero.<anonymous>[ValueParameterDescriptorImpl]

'lifecycle' @ [73:63] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'NORMAL' @ [73:97] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'map' @ [73:106] ==> public inline fun <T, R> Iterable<Obligation.State<P>>.map(transform: (Obligation.State<P>) -> Amount<Issued<Obligation.Terms<P>>>): List<Amount<Issued<Obligation.Terms<P>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>
    <R> -> Amount<Issued<Terms<P>>>

'it' @ [73:112] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.utils.sumObligationsOrZero.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [73:115] ==> public open val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'sumOrZero' @ [73:124] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<Obligation.Terms<P>>>>.sumOrZero(token: Issued<Obligation.Terms<P>>): Amount<Issued<Obligation.Terms<P>>> defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<Terms<P>>

'issuanceDef' @ [73:134] ==> value-parameter issuanceDef: Issued<Obligation.Terms<P>> defined in net.corda.finance.utils.sumObligationsOrZero[ValueParameterDescriptorImpl]

