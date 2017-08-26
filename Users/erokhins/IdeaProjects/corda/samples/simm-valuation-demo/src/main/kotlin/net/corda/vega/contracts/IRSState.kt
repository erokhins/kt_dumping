'UniqueIdentifier' @ [21:63] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'swap' @ [21:80] ==> value-parameter swap: SwapData defined in net.corda.vega.contracts.IRSState.<init>[ValueParameterDescriptorImpl]

'id' @ [21:85] ==> public final val id: Pair<String, String> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'first' @ [21:88] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'swap' @ [21:96] ==> value-parameter swap: SwapData defined in net.corda.vega.contracts.IRSState.<init>[ValueParameterDescriptorImpl]

'id' @ [21:101] ==> public final val id: Pair<String, String> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [21:104] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'linearId' @ [22:29] ==> public open val linearId: UniqueIdentifier defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'externalId' @ [22:38] ==> public final val externalId: String? defined in net.corda.core.contracts.UniqueIdentifier[DeserializedPropertyDescriptor]

'listOf' @ [23:60] ==> public fun <T> listOf(vararg elements: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'buyer' @ [23:67] ==> public final val buyer: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'seller' @ [23:74] ==> public final val seller: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'participants' @ [26:16] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'flatMap' @ [26:29] ==> public inline fun <T, R> Iterable<AbstractParty>.flatMap(transform: (AbstractParty) -> Iterable<PublicKey>): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [26:39] ==> value-parameter it: AbstractParty defined in net.corda.vega.contracts.IRSState.isRelevant.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [26:42] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'keys' @ [26:52] ==> public val PublicKey.keys: Set<PublicKey> defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'intersect' @ [26:59] ==> public infix fun <T> Iterable<PublicKey>.intersect(other: Iterable<PublicKey>): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'ourKeys' @ [26:69] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.vega.contracts.IRSState.isRelevant[ValueParameterDescriptorImpl]

'isNotEmpty' @ [26:78] ==> @InlineOnly public inline fun <T> Collection<PublicKey>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'IRSState' @ [30:21] ==> public constructor IRSState(swap: SwapData, buyer: AbstractParty, seller: AbstractParty, contract: OGTrade, linearId: UniqueIdentifier = ...) defined in net.corda.vega.contracts.IRSState[ClassConstructorDescriptorImpl]

'swap' @ [30:30] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'buyer' @ [30:36] ==> public final val buyer: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'seller' @ [30:43] ==> public final val seller: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'OGTrade' @ [30:51] ==> public constructor OGTrade() defined in net.corda.vega.contracts.OGTrade[ClassConstructorDescriptorImpl]

'TransactionBuilder' @ [31:16] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [31:35] ==> value-parameter notary: Party defined in net.corda.vega.contracts.IRSState.generateAgreement[ValueParameterDescriptorImpl]

'withItems' @ [31:43] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [31:53] ==> val state: IRSState defined in net.corda.vega.contracts.IRSState.generateAgreement[LocalVariableDescriptor]

'Command' @ [31:60] ==> public constructor Command<T : CommandData>(value: OGTrade.Commands.Agree, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Agree

'Agree' @ [31:85] ==> public constructor Agree() defined in net.corda.vega.contracts.OGTrade.Commands.Agree[ClassConstructorDescriptorImpl]

'participants' @ [31:94] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'map' @ [31:107] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [31:113] ==> value-parameter it: AbstractParty defined in net.corda.vega.contracts.IRSState.generateAgreement.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [31:116] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

