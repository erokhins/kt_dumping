'loggerFor' @ [32:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> OnLedgerAsset<*, *, *>

'Throws' @ [51:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InsufficientBalanceException' @ [51:17] ==> public constructor InsufficientBalanceException(amountMissing: Amount<*>) defined in net.corda.core.contracts.InsufficientBalanceException[DeserializedClassConstructorDescriptor]

'JvmStatic' @ [52:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'tx' @ [84:13] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[ValueParameterDescriptorImpl]

'notary' @ [84:16] ==> public final var notary: Party? defined in net.corda.core.transactions.TransactionBuilder[DeserializedPropertyDescriptor]

'acceptableStates' @ [84:25] ==> value-parameter acceptableStates: List<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[ValueParameterDescriptorImpl]

'firstOrNull' @ [84:42] ==> public fun <T> List<StateAndRef<S>>.firstOrNull(): StateAndRef<S>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>

'state' @ [84:57] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [84:64] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'component1' @ [86:18] ==> public final operator fun component1(): ArrayList<StateAndRef<S>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [86:28] ==> public final operator fun component2(): Amount<T> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'gatherCoins' @ [86:46] ==> @Throws private final fun <S : FungibleAsset<T>, T : Any> gatherCoins(acceptableCoins: Collection<StateAndRef<S>>, amount: Amount<T>): Pair<ArrayList<StateAndRef<S>>, Amount<T>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : FungibleAsset<T>> -> S
    <T : Any> -> T

'acceptableStates' @ [86:58] ==> value-parameter acceptableStates: List<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[ValueParameterDescriptorImpl]

'amount' @ [86:76] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[ValueParameterDescriptorImpl]

'gathered' @ [88:34] ==> val gathered: ArrayList<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'firstOrNull' @ [88:43] ==> public fun <T> List<StateAndRef<S>>.firstOrNull(): StateAndRef<S>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>

'if (takeChangeFrom != null && gatheredAmount > amount) {
                Amount(gatheredAmount.quantity - amount.quantity, takeChangeFrom.state.data.amount.token)
            } else {
                null
            }' @ [89:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Amount<Issued<T>>?, elseBranch: Amount<Issued<T>>?): Amount<Issued<T>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Amount<Issued<T>>?

'takeChangeFrom' @ [89:30] ==> val takeChangeFrom: StateAndRef<S>? defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'gatheredAmount' @ [89:56] ==> val gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'amount' @ [89:73] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[ValueParameterDescriptorImpl]

'Amount' @ [90:17] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<T>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<T>

'gatheredAmount' @ [90:24] ==> val gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'quantity' @ [90:39] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amount' @ [90:50] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[ValueParameterDescriptorImpl]

'quantity' @ [90:57] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'takeChangeFrom' @ [90:67] ==> val takeChangeFrom: StateAndRef<S>? defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'state' @ [90:82] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [90:88] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [90:93] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [90:100] ==> public final val token: Issued<T> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'gathered' @ [94:28] ==> val gathered: ArrayList<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'map' @ [94:37] ==> public inline fun <T, R> Iterable<StateAndRef<S>>.map(transform: (StateAndRef<S>) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>
    <R> -> PublicKey

'it' @ [94:43] ==> value-parameter it: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [94:46] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [94:52] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owner' @ [94:57] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'owningKey' @ [94:63] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'gathered' @ [96:26] ==> val gathered: ArrayList<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'groupBy' @ [96:35] ==> public inline fun <T, K> Iterable<StateAndRef<S>>.groupBy(keySelector: (StateAndRef<S>) -> PartyAndReference): Map<PartyAndReference, List<StateAndRef<S>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>
    <K> -> PartyAndReference

'it' @ [96:45] ==> value-parameter it: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [96:48] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [96:54] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [96:59] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [96:66] ==> public final val token: Issued<T> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [96:72] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'map' @ [96:81] ==> public inline fun <K, V, R> Map<out PartyAndReference, List<StateAndRef<S>>>.map(transform: (Map.Entry<PartyAndReference, List<StateAndRef<S>>>) -> TransactionState<S>): List<TransactionState<S>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PartyAndReference
    <V> -> List<StateAndRef<S>>
    <R> -> TransactionState<S>

'it' @ [97:29] ==> value-parameter it: Map.Entry<PartyAndReference, List<StateAndRef<S>>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [97:32] ==> public abstract val value: List<StateAndRef<S>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'coins' @ [98:35] ==> val coins: List<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[LocalVariableDescriptor]

'map' @ [98:41] ==> public inline fun <T, R> Iterable<StateAndRef<S>>.map(transform: (StateAndRef<S>) -> Amount<Issued<T>>): List<Amount<Issued<T>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>
    <R> -> Amount<Issued<T>>

'it' @ [98:47] ==> value-parameter it: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [98:50] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [98:56] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [98:61] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'sumOrThrow' @ [98:70] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Issued<T>>>.sumOrThrow(): Amount<Issued<T>> defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Issued<T>

'invoke' @ [99:17] ==> public abstract operator fun invoke(p1: TransactionState<S>, p2: Amount<Issued<T>>, p3: AbstractParty): TransactionState<S> defined in kotlin.Function3[FunctionInvokeDescriptor]

'coins' @ [99:29] ==> val coins: List<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[LocalVariableDescriptor]

'first' @ [99:35] ==> public fun <T> List<StateAndRef<S>>.first(): StateAndRef<S> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>

'state' @ [99:43] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'totalAmount' @ [99:50] ==> val totalAmount: Amount<Issued<T>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[LocalVariableDescriptor]

'to' @ [99:63] ==> value-parameter to: AbstractParty defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[ValueParameterDescriptorImpl]

'sortedBy' @ [100:15] ==> public inline fun <T, R : Comparable<Long>> Iterable<TransactionState<S>>.sortedBy(crossinline selector: (TransactionState<S>) -> Long?): List<TransactionState<S>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<S>
    <R : Comparable<R>> -> Long

'it' @ [100:26] ==> value-parameter it: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [100:29] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [100:34] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'quantity' @ [100:41] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'if (change != null) {
                // Just copy a key across as the change key. In real life of course, this works but leaks private data.
                // In bitcoinj we derive a fresh key here and then shuffle the outputs to ensure it's hard to follow
                // value flows through the transaction graph.
                val existingOwner = gathered.first().state.data.owner
                // Add a change output and adjust the last output downwards.
                states.subList(0, states.lastIndex) +
                        states.last().let {
                            val spent = it.data.amount.withoutIssuer() - change.withoutIssuer()
                            deriveState(it, Amount(spent.quantity, it.data.amount.token), it.data.owner)
                        } +
                        states.last().let {
                            deriveState(it, Amount(change.quantity, it.data.amount.token), existingOwner)
                        }
            } else states' @ [102:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TransactionState<S>>, elseBranch: List<TransactionState<S>>): List<TransactionState<S>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TransactionState<S>>

'change' @ [102:31] ==> val change: Amount<Issued<T>>? defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'gathered' @ [106:37] ==> val gathered: ArrayList<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'first' @ [106:46] ==> public fun <T> List<StateAndRef<S>>.first(): StateAndRef<S> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>

'state' @ [106:54] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [106:60] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owner' @ [106:65] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'states' @ [108:17] ==> val states: List<TransactionState<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'subList' @ [108:24] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<TransactionState<S>> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'states' @ [108:35] ==> val states: List<TransactionState<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'lastIndex' @ [108:42] ==> public val <T> List<TransactionState<S>>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TransactionState<S>

'states' @ [109:25] ==> val states: List<TransactionState<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'last' @ [109:32] ==> public fun <T> List<TransactionState<S>>.last(): TransactionState<S> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<S>

'let' @ [109:39] ==> @InlineOnly public inline fun <T, R> TransactionState<S>.let(block: (TransactionState<S>) -> TransactionState<S>): TransactionState<S> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<S>
    <R> -> TransactionState<S>

'it' @ [110:41] ==> value-parameter it: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [110:44] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [110:49] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'withoutIssuer' @ [110:56] ==> public fun <T : Any> Amount<Issued<T>>.withoutIssuer(): Amount<T> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'change' @ [110:74] ==> val change: Amount<Issued<T>>? defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'withoutIssuer' @ [110:81] ==> public fun <T : Any> Amount<Issued<T>>.withoutIssuer(): Amount<T> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'invoke' @ [111:29] ==> public abstract operator fun invoke(p1: TransactionState<S>, p2: Amount<Issued<T>>, p3: AbstractParty): TransactionState<S> defined in kotlin.Function3[FunctionInvokeDescriptor]

'it' @ [111:41] ==> value-parameter it: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'Amount' @ [111:45] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<T>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<T>

'spent' @ [111:52] ==> val spent: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[LocalVariableDescriptor]

'quantity' @ [111:58] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'it' @ [111:68] ==> value-parameter it: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [111:71] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [111:76] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [111:83] ==> public final val token: Issued<T> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'it' @ [111:91] ==> value-parameter it: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [111:94] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owner' @ [111:99] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'states' @ [113:25] ==> val states: List<TransactionState<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'last' @ [113:32] ==> public fun <T> List<TransactionState<S>>.last(): TransactionState<S> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<S>

'let' @ [113:39] ==> @InlineOnly public inline fun <T, R> TransactionState<S>.let(block: (TransactionState<S>) -> TransactionState<S>): TransactionState<S> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<S>
    <R> -> TransactionState<S>

'invoke' @ [114:29] ==> public abstract operator fun invoke(p1: TransactionState<S>, p2: Amount<Issued<T>>, p3: AbstractParty): TransactionState<S> defined in kotlin.Function3[FunctionInvokeDescriptor]

'it' @ [114:41] ==> value-parameter it: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'Amount' @ [114:45] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<T>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<T>

'change' @ [114:52] ==> val change: Amount<Issued<T>>? defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'quantity' @ [114:59] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'it' @ [114:69] ==> value-parameter it: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [114:72] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [114:77] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [114:84] ==> public final val token: Issued<T> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'existingOwner' @ [114:92] ==> val existingOwner: AbstractParty defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'states' @ [116:20] ==> val states: List<TransactionState<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'gathered' @ [118:27] ==> val gathered: ArrayList<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'tx' @ [118:37] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[ValueParameterDescriptorImpl]

'addInputState' @ [118:40] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [118:54] ==> val state: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'outputs' @ [119:27] ==> val outputs: List<TransactionState<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'tx' @ [119:36] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[ValueParameterDescriptorImpl]

'addOutputState' @ [119:39] ==> public final fun addOutputState(state: TransactionState<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [119:54] ==> val state: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'tx' @ [122:13] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[ValueParameterDescriptorImpl]

'addCommand' @ [122:16] ==> public final fun addCommand(data: CommandData, keys: List<PublicKey>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'invoke' @ [122:27] ==> public abstract operator fun invoke(): CommandData defined in kotlin.Function0[FunctionInvokeDescriptor]

'keysUsed' @ [122:50] ==> val keysUsed: List<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'Pair' @ [124:20] ==> public constructor Pair<out A, out B>(first: TransactionBuilder, second: List<PublicKey>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> TransactionBuilder
    <out B> -> List<PublicKey>

'tx' @ [124:25] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[ValueParameterDescriptorImpl]

'keysUsed' @ [124:29] ==> val keysUsed: List<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateSpend[LocalVariableDescriptor]

'Throws' @ [134:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InsufficientBalanceException' @ [134:17] ==> public constructor InsufficientBalanceException(amountMissing: Amount<*>) defined in net.corda.core.contracts.InsufficientBalanceException[DeserializedClassConstructorDescriptor]

'require' @ [137:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'amount' @ [137:21] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[ValueParameterDescriptorImpl]

'quantity' @ [137:28] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'arrayListOf' @ [138:28] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<StateAndRef<S>> /* = ArrayList<StateAndRef<S>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>

'Amount' @ [139:34] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: T) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> T

'amount' @ [139:44] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[ValueParameterDescriptorImpl]

'token' @ [139:51] ==> public final val token: T defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'acceptableCoins' @ [140:23] ==> value-parameter acceptableCoins: Collection<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[ValueParameterDescriptorImpl]

'gatheredAmount' @ [141:21] ==> var gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'amount' @ [141:39] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[ValueParameterDescriptorImpl]

'gathered' @ [142:17] ==> val gathered: ArrayList<StateAndRef<S>> /* = ArrayList<StateAndRef<S>> */ defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'add' @ [142:26] ==> public open fun add(element: StateAndRef<S>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'c' @ [142:30] ==> val c: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'gatheredAmount' @ [143:17] ==> var gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'Amount' @ [143:35] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: T) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> T

'c' @ [143:42] ==> val c: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'state' @ [143:44] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [143:50] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [143:55] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'quantity' @ [143:62] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amount' @ [143:72] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[ValueParameterDescriptorImpl]

'token' @ [143:79] ==> public final val token: T defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'gatheredAmount' @ [146:17] ==> var gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'amount' @ [146:34] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[ValueParameterDescriptorImpl]

'log' @ [147:17] ==> public final val log: Logger defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion[PropertyDescriptorImpl]

'trace' @ [147:21] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'amount' @ [147:63] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[ValueParameterDescriptorImpl]

'gatheredAmount' @ [147:82] ==> var gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'InsufficientBalanceException' @ [148:23] ==> public constructor InsufficientBalanceException(amountMissing: Amount<*>) defined in net.corda.core.contracts.InsufficientBalanceException[DeserializedClassConstructorDescriptor]

'amount' @ [148:52] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[ValueParameterDescriptorImpl]

'gatheredAmount' @ [148:61] ==> var gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'log' @ [151:13] ==> public final val log: Logger defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion[PropertyDescriptorImpl]

'trace' @ [151:17] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'amount' @ [151:53] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[ValueParameterDescriptorImpl]

'gatheredAmount' @ [151:72] ==> var gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'gatheredAmount' @ [151:98] ==> var gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'amount' @ [151:115] ==> value-parameter amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[ValueParameterDescriptorImpl]

'Pair' @ [153:20] ==> public constructor Pair<out A, out B>(first: ArrayList<StateAndRef<S>>, second: Amount<T>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ArrayList<StateAndRef<S>>
    <out B> -> Amount<T>

'gathered' @ [153:25] ==> val gathered: ArrayList<StateAndRef<S>> /* = ArrayList<StateAndRef<S>> */ defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'gatheredAmount' @ [153:35] ==> var gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.gatherCoins[LocalVariableDescriptor]

'Throws' @ [165:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InsufficientBalanceException' @ [165:17] ==> public constructor InsufficientBalanceException(amountMissing: Amount<*>) defined in net.corda.core.contracts.InsufficientBalanceException[DeserializedClassConstructorDescriptor]

'JvmStatic' @ [166:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'assetStates' @ [172:25] ==> value-parameter assetStates: List<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'map' @ [172:37] ==> public inline fun <T, R> Iterable<StateAndRef<S>>.map(transform: (StateAndRef<S>) -> AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>
    <R> -> AbstractParty

'it' @ [172:43] ==> value-parameter it: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [172:46] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [172:52] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owner' @ [172:57] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'toSet' @ [172:65] ==> public fun <T> Iterable<AbstractParty>.toSet(): Set<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'singleOrNull' @ [172:73] ==> public fun <T> Iterable<AbstractParty>.singleOrNull(): AbstractParty? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'InsufficientBalanceException' @ [172:97] ==> public constructor InsufficientBalanceException(amountMissing: Amount<*>) defined in net.corda.core.contracts.InsufficientBalanceException[DeserializedClassConstructorDescriptor]

'amountIssued' @ [172:126] ==> value-parameter amountIssued: Amount<Issued<T>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'amountIssued' @ [173:28] ==> value-parameter amountIssued: Amount<Issued<T>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'token' @ [173:41] ==> public final val token: Issued<T> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [173:47] ==> public final val product: T defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'Amount' @ [174:26] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: T) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> T

'amountIssued' @ [174:33] ==> value-parameter amountIssued: Amount<Issued<T>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'quantity' @ [174:46] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'currency' @ [174:56] ==> val currency: T defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'assetStates' @ [175:35] ==> value-parameter assetStates: List<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'filter' @ [175:47] ==> public inline fun <T> Iterable<StateAndRef<S>>.filter(predicate: (StateAndRef<S>) -> Boolean): List<StateAndRef<S>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>

'ref' @ [175:63] ==> value-parameter ref: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [175:67] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [175:73] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [175:78] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [175:85] ==> public final val token: Issued<T> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amountIssued' @ [175:94] ==> value-parameter amountIssued: Amount<Issued<T>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'token' @ [175:107] ==> public final val token: Issued<T> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'tx' @ [176:13] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'notary' @ [176:16] ==> public final var notary: Party? defined in net.corda.core.transactions.TransactionBuilder[DeserializedPropertyDescriptor]

'acceptableCoins' @ [176:25] ==> var acceptableCoins: List<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'firstOrNull' @ [176:41] ==> public fun <T> List<StateAndRef<S>>.firstOrNull(): StateAndRef<S>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>

'state' @ [176:56] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [176:63] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'acceptableCoins' @ [180:13] ==> var acceptableCoins: List<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'acceptableCoins' @ [180:31] ==> var acceptableCoins: List<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'filter' @ [180:47] ==> public inline fun <T> Iterable<StateAndRef<S>>.filter(predicate: (StateAndRef<S>) -> Boolean): List<StateAndRef<S>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>

'it' @ [180:56] ==> value-parameter it: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [180:59] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [180:65] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'tx' @ [180:75] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'notary' @ [180:78] ==> public final var notary: Party? defined in net.corda.core.transactions.TransactionBuilder[DeserializedPropertyDescriptor]

'component1' @ [182:18] ==> public final operator fun component1(): ArrayList<StateAndRef<S>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [182:28] ==> public final operator fun component2(): Amount<T> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'gatherCoins' @ [182:46] ==> @Throws private final fun <S : FungibleAsset<T>, T : Any> gatherCoins(acceptableCoins: Collection<StateAndRef<S>>, amount: Amount<T>): Pair<ArrayList<StateAndRef<S>>, Amount<T>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : FungibleAsset<T>> -> S
    <T : Any> -> T

'acceptableCoins' @ [182:58] ==> var acceptableCoins: List<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'amount' @ [182:75] ==> val amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'gathered' @ [183:34] ==> val gathered: ArrayList<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'lastOrNull' @ [183:43] ==> public fun <T> List<StateAndRef<S>>.lastOrNull(): StateAndRef<S>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>

'if (takeChangeFrom != null && gatheredAmount > amount) {
                Amount(gatheredAmount.quantity - amount.quantity, takeChangeFrom.state.data.amount.token)
            } else {
                null
            }' @ [184:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Amount<Issued<T>>?, elseBranch: Amount<Issued<T>>?): Amount<Issued<T>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Amount<Issued<T>>?

'takeChangeFrom' @ [184:30] ==> val takeChangeFrom: StateAndRef<S>? defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'gatheredAmount' @ [184:56] ==> val gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'amount' @ [184:73] ==> val amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'Amount' @ [185:17] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<T>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<T>

'gatheredAmount' @ [185:24] ==> val gatheredAmount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'quantity' @ [185:39] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amount' @ [185:50] ==> val amount: Amount<T> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'quantity' @ [185:57] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'takeChangeFrom' @ [185:67] ==> val takeChangeFrom: StateAndRef<S>? defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'state' @ [185:82] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [185:88] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [185:93] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [185:100] ==> public final val token: Issued<T> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'if (change != null) {
                // Add a change output and adjust the last output downwards.
                listOf(deriveState(gathered.last().state, change, owner))
            } else emptyList()' @ [190:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TransactionState<S>>, elseBranch: List<TransactionState<S>>): List<TransactionState<S>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TransactionState<S>>

'change' @ [190:31] ==> val change: Amount<Issued<T>>? defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'listOf' @ [192:17] ==> public fun <T> listOf(element: TransactionState<S>): List<TransactionState<S>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<S>

'invoke' @ [192:24] ==> public abstract operator fun invoke(p1: TransactionState<S>, p2: Amount<Issued<T>>, p3: AbstractParty): TransactionState<S> defined in kotlin.Function3[FunctionInvokeDescriptor]

'gathered' @ [192:36] ==> val gathered: ArrayList<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'last' @ [192:45] ==> public fun <T> List<StateAndRef<S>>.last(): StateAndRef<S> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>

'state' @ [192:52] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'change' @ [192:59] ==> val change: Amount<Issued<T>>? defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'owner' @ [192:67] ==> val owner: AbstractParty defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'emptyList' @ [193:20] ==> public fun <T> emptyList(): List<TransactionState<S>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<S>

'gathered' @ [195:27] ==> val gathered: ArrayList<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'tx' @ [195:37] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'addInputState' @ [195:40] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [195:54] ==> val state: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'outputs' @ [196:27] ==> val outputs: List<TransactionState<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'tx' @ [196:36] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'addOutputState' @ [196:39] ==> public final fun addOutputState(state: TransactionState<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [196:54] ==> val state: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'gathered' @ [197:28] ==> val gathered: ArrayList<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'map' @ [197:37] ==> public inline fun <T, R> Iterable<StateAndRef<S>>.map(transform: (StateAndRef<S>) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>
    <R> -> PublicKey

'it' @ [197:43] ==> value-parameter it: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [197:46] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [197:52] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owner' @ [197:57] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'owningKey' @ [197:63] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'gathered' @ [198:28] ==> val gathered: ArrayList<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'flatMap' @ [198:37] ==> public inline fun <T, R> Iterable<StateAndRef<S>>.flatMap(transform: (StateAndRef<S>) -> Iterable<PublicKey>): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<S>
    <R> -> PublicKey

'it' @ [198:47] ==> value-parameter it: StateAndRef<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [198:50] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [198:56] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'exitKeys' @ [198:61] ==> public abstract val exitKeys: Collection<PublicKey> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'tx' @ [199:13] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'addCommand' @ [199:16] ==> public final fun addCommand(data: CommandData, keys: List<PublicKey>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'invoke' @ [199:27] ==> public abstract operator fun invoke(): CommandData defined in kotlin.Function0[FunctionInvokeDescriptor]

'moveKeys' @ [199:50] ==> val moveKeys: List<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'tx' @ [200:13] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'addCommand' @ [200:16] ==> public final fun addCommand(data: CommandData, keys: List<PublicKey>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'invoke' @ [200:27] ==> public abstract operator fun invoke(p1: Amount<Issued<T>>): CommandData defined in kotlin.Function1[FunctionInvokeDescriptor]

'amountIssued' @ [200:47] ==> value-parameter amountIssued: Amount<Issued<T>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[ValueParameterDescriptorImpl]

'exitKeys' @ [200:62] ==> val exitKeys: List<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'moveKeys' @ [201:21] ==> val moveKeys: List<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'exitKeys' @ [201:32] ==> val exitKeys: List<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateExit[LocalVariableDescriptor]

'toSet' @ [201:42] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'JvmStatic' @ [208:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'check' @ [212:13] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'tx' @ [212:19] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[ValueParameterDescriptorImpl]

'inputStates' @ [212:22] ==> public final fun inputStates(): List<StateRef> defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'isEmpty' @ [212:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'check' @ [213:13] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'tx' @ [213:19] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[ValueParameterDescriptorImpl]

'outputStates' @ [213:22] ==> public final fun outputStates(): List<TransactionState<*>> defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'map' @ [213:37] ==> public inline fun <T, R> Iterable<TransactionState<*>>.map(transform: (TransactionState<*>) -> ContractState): List<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<*>
    <R> -> ContractState

'it' @ [213:43] ==> value-parameter it: TransactionState<*> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [213:46] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'filterIsInstance' @ [213:53] ==> public fun <R> Iterable<*>.filterIsInstance(klass: Class<TransactionState<S>>): List<TransactionState<S>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> TransactionState<S>

'transactionState' @ [213:70] ==> value-parameter transactionState: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[ValueParameterDescriptorImpl]

'javaClass' @ [213:87] ==> public val <T : Any> TransactionState<S>.javaClass: Class<TransactionState<S>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> TransactionState<S>

'isEmpty' @ [213:98] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'require' @ [214:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'transactionState' @ [214:21] ==> value-parameter transactionState: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[ValueParameterDescriptorImpl]

'data' @ [214:38] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [214:43] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'quantity' @ [214:50] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'transactionState' @ [215:22] ==> value-parameter transactionState: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[ValueParameterDescriptorImpl]

'data' @ [215:39] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [215:44] ==> public abstract val amount: Amount<Issued<T>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [215:51] ==> public final val token: Issued<T> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [215:57] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'at' @ [216:33] ==> val at: PartyAndReference defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[LocalVariableDescriptor]

'party' @ [216:36] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [216:42] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'tx' @ [217:13] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[ValueParameterDescriptorImpl]

'addOutputState' @ [217:16] ==> public final fun addOutputState(state: TransactionState<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'transactionState' @ [217:31] ==> value-parameter transactionState: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[ValueParameterDescriptorImpl]

'tx' @ [218:13] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[ValueParameterDescriptorImpl]

'addCommand' @ [218:16] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'issueCommand' @ [218:27] ==> value-parameter issueCommand: CommandData defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[ValueParameterDescriptorImpl]

'commandSigner' @ [218:41] ==> val commandSigner: PublicKey defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[LocalVariableDescriptor]

'setOf' @ [219:20] ==> public fun <T> setOf(element: PublicKey): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'commandSigner' @ [219:26] ==> val commandSigner: PublicKey defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion.generateIssue[LocalVariableDescriptor]

'Throws' @ [234:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InsufficientBalanceException' @ [234:13] ==> public constructor InsufficientBalanceException(amountMissing: Amount<*>) defined in net.corda.core.contracts.InsufficientBalanceException[DeserializedClassConstructorDescriptor]

'generateExit' @ [237:16] ==> @Throws @JvmStatic public final fun <S : FungibleAsset<T>, T : Any> generateExit(tx: TransactionBuilder, amountIssued: Amount<Issued<T>>, assetStates: List<StateAndRef<S>>, deriveState: (TransactionState<S>, Amount<Issued<T>>, AbstractParty) -> TransactionState<S>, generateMoveCommand: () -> CommandData, generateExitCommand: (Amount<Issued<T>>) -> CommandData): Set<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : FungibleAsset<T>> -> S
    <T : Any> -> T

'tx' @ [238:17] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.OnLedgerAsset.generateExit[ValueParameterDescriptorImpl]

'amountIssued' @ [239:17] ==> value-parameter amountIssued: Amount<Issued<T>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.generateExit[ValueParameterDescriptorImpl]

'assetStates' @ [240:17] ==> value-parameter assetStates: List<StateAndRef<S>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.generateExit[ValueParameterDescriptorImpl]

'deriveState' @ [241:57] ==> public abstract fun deriveState(txState: TransactionState<S>, amount: Amount<Issued<T>>, owner: AbstractParty): TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset[SimpleFunctionDescriptorImpl]

'state' @ [241:69] ==> value-parameter state: TransactionState<S> defined in net.corda.finance.contracts.asset.OnLedgerAsset.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [241:76] ==> value-parameter amount: Amount<Issued<T>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [241:84] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.OnLedgerAsset.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'generateMoveCommand' @ [242:44] ==> public abstract fun generateMoveCommand(): MoveCommand defined in net.corda.finance.contracts.asset.OnLedgerAsset[SimpleFunctionDescriptorImpl]

'generateExitCommand' @ [243:51] ==> public abstract fun generateExitCommand(amount: Amount<Issued<T>>): CommandData defined in net.corda.finance.contracts.asset.OnLedgerAsset[SimpleFunctionDescriptorImpl]

'amount' @ [243:71] ==> value-parameter amount: Amount<Issued<T>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.generateExit.<anonymous>[ValueParameterDescriptorImpl]

