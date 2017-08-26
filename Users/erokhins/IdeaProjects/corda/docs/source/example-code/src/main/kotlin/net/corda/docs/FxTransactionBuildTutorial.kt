'CordaSerializable' @ [24:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'serviceHub' @ [39:19] ==> value-parameter serviceHub: ServiceHub defined in net.corda.docs.gatherOurInputs[ValueParameterDescriptorImpl]

'keyManagementService' @ [39:30] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'keys' @ [39:51] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'ourKeys' @ [40:22] ==> val ourKeys: Set<PublicKey> defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'map' @ [40:30] ==> public inline fun <T, R> Iterable<PublicKey>.map(transform: (PublicKey) -> Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey
    <R> -> Party

'serviceHub' @ [40:36] ==> value-parameter serviceHub: ServiceHub defined in net.corda.docs.gatherOurInputs[ValueParameterDescriptorImpl]

'identityService' @ [40:47] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'partyFromKey' @ [40:63] ==> public abstract fun partyFromKey(key: PublicKey): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'it' @ [40:76] ==> value-parameter it: PublicKey defined in net.corda.docs.gatherOurInputs.<anonymous>[ValueParameterDescriptorImpl]

'IllegalStateException' @ [40:89] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'FungibleAssetQueryCriteria' @ [41:42] ==> @JvmOverloads public constructor FungibleAssetQueryCriteria(participants: List<AbstractParty>? = ..., owner: List<AbstractParty>? = ..., quantity: ColumnPredicate<Long>? = ..., issuer: List<AbstractParty>? = ..., issuerRef: List<OpaqueBytes>? = ..., status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedClassConstructorDescriptor]

'ourParties' @ [41:77] ==> val ourParties: List<Party> defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'notary' @ [43:20] ==> value-parameter notary: Party? defined in net.corda.docs.gatherOurInputs[ValueParameterDescriptorImpl]

'serviceHub' @ [43:30] ==> value-parameter serviceHub: ServiceHub defined in net.corda.docs.gatherOurInputs[ValueParameterDescriptorImpl]

'networkMapCache' @ [43:41] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'getAnyNotary' @ [43:57] ==> public open fun getAnyNotary(type: ServiceType? = ...): Party? defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'VaultQueryCriteria' @ [44:54] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'listOf' @ [44:82] ==> public fun <T> listOf(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'notaries' @ [44:89] ==> val notaries: Party? defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'builder' @ [46:29] ==> public inline fun <A> builder(block: Builder.() -> CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, String?>): CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, String?> defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> ColumnPredicateExpression<PersistentCashState, String?>

'CashSchemaV1' @ [46:39] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [46:52] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[DeserializedClassConstructorDescriptor]

'currency' @ [46:73] ==> @field:Column public final var currency: String defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[DeserializedPropertyDescriptor]

'equal' @ [46:82] ==> public final fun <O, R> KProperty1<CashSchemaV1.PersistentCashState, String?>.equal(value: (String..String?)): CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, String?> defined in net.corda.core.node.services.vault.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> PersistentCashState
    <R> -> (kotlin.String..kotlin.String?)

'amountRequired' @ [46:88] ==> value-parameter amountRequired: Amount<Issued<Currency>> defined in net.corda.docs.gatherOurInputs[ValueParameterDescriptorImpl]

'token' @ [46:103] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [46:109] ==> public final val product: Currency defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'currencyCode' @ [46:117] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'VaultCustomQueryCriteria' @ [47:38] ==> @JvmOverloads public constructor VaultCustomQueryCriteria<L : PersistentState>(expression: CriteriaExpression<CashSchemaV1.PersistentCashState, Boolean>, status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedClassConstructorDescriptor]
Inferred types:
    <L : PersistentState> -> PersistentCashState

'logicalExpression' @ [47:63] ==> val logicalExpression: CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, String?> defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'fungibleCriteria' @ [49:24] ==> val fungibleCriteria: QueryCriteria.FungibleAssetQueryCriteria defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'and' @ [49:41] ==> public final fun and(criteria: QueryCriteria): QueryCriteria defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedSimpleFunctionDescriptor]

'vaultCriteria' @ [49:45] ==> val vaultCriteria: QueryCriteria defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'and' @ [49:60] ==> public final infix fun and(criteria: QueryCriteria): QueryCriteria defined in net.corda.core.node.services.vault.QueryCriteria[DeserializedSimpleFunctionDescriptor]

'cashCriteria' @ [49:64] ==> val cashCriteria: QueryCriteria.VaultCustomQueryCriteria<CashSchemaV1.PersistentCashState> defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'serviceHub' @ [51:26] ==> value-parameter serviceHub: ServiceHub defined in net.corda.docs.gatherOurInputs[ValueParameterDescriptorImpl]

'vaultService' @ [51:37] ==> public abstract val vaultService: VaultService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'tryLockFungibleStatesForSpending' @ [51:50] ==> @Suspendable public abstract fun <T : FungibleAsset<Currency>, U : Any> tryLockFungibleStatesForSpending(lockId: UUID, eligibleStatesQuery: QueryCriteria, amount: Amount<Currency>, contractType: Class<out Cash.State>): List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FungibleAsset<U>> -> State
    <U : Any> -> Currency

'lockId' @ [51:105] ==> value-parameter lockId: UUID defined in net.corda.docs.gatherOurInputs[ValueParameterDescriptorImpl]

'fullCriteria' @ [51:113] ==> val fullCriteria: QueryCriteria defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'amountRequired' @ [51:127] ==> value-parameter amountRequired: Amount<Issued<Currency>> defined in net.corda.docs.gatherOurInputs[ValueParameterDescriptorImpl]

'withoutIssuer' @ [51:142] ==> public fun <T : Any> Amount<Issued<Currency>>.withoutIssuer(): Amount<Currency> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'Cash' @ [51:159] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'java' @ [51:177] ==> public val <T> KClass<Cash.State>.java: Class<Cash.State> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> State

'check' @ [53:5] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'eligibleStates' @ [53:11] ==> val eligibleStates: List<StateAndRef<Cash.State>> defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'isNotEmpty' @ [53:26] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<Cash.State>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'eligibleStates' @ [54:18] ==> val eligibleStates: List<StateAndRef<Cash.State>> defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'fold' @ [54:33] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.fold(initial: Long, operation: (Long, StateAndRef<Cash.State>) -> Long): Long defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> Long

'tot' @ [54:54] ==> value-parameter tot: Long defined in net.corda.docs.gatherOurInputs.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [54:60] ==> value-parameter x: StateAndRef<Cash.State> defined in net.corda.docs.gatherOurInputs.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [54:62] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [54:68] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [54:73] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'quantity' @ [54:80] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amount' @ [55:18] ==> val amount: Long defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'amountRequired' @ [55:27] ==> value-parameter amountRequired: Amount<Issued<Currency>> defined in net.corda.docs.gatherOurInputs[ValueParameterDescriptorImpl]

'quantity' @ [55:42] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Pair' @ [57:12] ==> public constructor Pair<out A, out B>(first: List<StateAndRef<Cash.State>>, second: Long) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<StateAndRef<State>>
    <out B> -> Long

'eligibleStates' @ [57:17] ==> val eligibleStates: List<StateAndRef<Cash.State>> defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'change' @ [57:33] ==> val change: Long defined in net.corda.docs.gatherOurInputs[LocalVariableDescriptor]

'request' @ [63:22] ==> value-parameter request: FxRequest defined in net.corda.docs.prepareOurInputsAndOutputs[ValueParameterDescriptorImpl]

'amount' @ [63:30] ==> public final val amount: Amount<Issued<Currency>> defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'component1' @ [71:10] ==> public final operator fun component1(): List<StateAndRef<Cash.State>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [71:18] ==> public final operator fun component2(): Long defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'gatherOurInputs' @ [71:30] ==> private fun gatherOurInputs(serviceHub: ServiceHub, lockId: UUID, amountRequired: Amount<Issued<Currency>>, notary: Party?): Pair<List<StateAndRef<Cash.State>>, Long> defined in net.corda.docs[SimpleFunctionDescriptorImpl]

'serviceHub' @ [71:46] ==> value-parameter serviceHub: ServiceHub defined in net.corda.docs.prepareOurInputsAndOutputs[ValueParameterDescriptorImpl]

'lockId' @ [71:58] ==> value-parameter lockId: UUID defined in net.corda.docs.prepareOurInputsAndOutputs[ValueParameterDescriptorImpl]

'sellAmount' @ [71:66] ==> val sellAmount: Amount<Issued<Currency>> defined in net.corda.docs.prepareOurInputsAndOutputs[LocalVariableDescriptor]

'request' @ [71:78] ==> value-parameter request: FxRequest defined in net.corda.docs.prepareOurInputsAndOutputs[ValueParameterDescriptorImpl]

'notary' @ [71:86] ==> public final val notary: Party? defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'Cash' @ [74:33] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [74:38] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'sellAmount' @ [74:44] ==> val sellAmount: Amount<Issued<Currency>> defined in net.corda.docs.prepareOurInputsAndOutputs[LocalVariableDescriptor]

'request' @ [74:56] ==> value-parameter request: FxRequest defined in net.corda.docs.prepareOurInputsAndOutputs[ValueParameterDescriptorImpl]

'counterparty' @ [74:64] ==> public final val counterparty: Party defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'if (residual > 0L) {
        // Build an output state for the residual change back to us
        val residualAmount = Amount(residual, sellAmount.token)
        val residualOutput = Cash.State(residualAmount, serviceHub.myInfo.legalIdentity)
        listOf(transferedFundsOutput, residualOutput)
    } else {
        listOf(transferedFundsOutput)
    }' @ [76:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Cash.State>, elseBranch: List<Cash.State>): List<Cash.State>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<State>

'residual' @ [76:23] ==> val residual: Long defined in net.corda.docs.prepareOurInputsAndOutputs[LocalVariableDescriptor]

'Amount' @ [78:30] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'residual' @ [78:37] ==> val residual: Long defined in net.corda.docs.prepareOurInputsAndOutputs[LocalVariableDescriptor]

'sellAmount' @ [78:47] ==> val sellAmount: Amount<Issued<Currency>> defined in net.corda.docs.prepareOurInputsAndOutputs[LocalVariableDescriptor]

'token' @ [78:58] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Cash' @ [79:30] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [79:35] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'residualAmount' @ [79:41] ==> val residualAmount: Amount<Issued<Currency>> defined in net.corda.docs.prepareOurInputsAndOutputs[LocalVariableDescriptor]

'serviceHub' @ [79:57] ==> value-parameter serviceHub: ServiceHub defined in net.corda.docs.prepareOurInputsAndOutputs[ValueParameterDescriptorImpl]

'myInfo' @ [79:68] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [79:75] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'listOf' @ [80:9] ==> public fun <T> listOf(vararg elements: Cash.State): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'transferedFundsOutput' @ [80:16] ==> val transferedFundsOutput: Cash.State defined in net.corda.docs.prepareOurInputsAndOutputs[LocalVariableDescriptor]

'residualOutput' @ [80:39] ==> val residualOutput: Cash.State defined in net.corda.docs.prepareOurInputsAndOutputs[LocalVariableDescriptor]

'listOf' @ [82:9] ==> public fun <T> listOf(element: Cash.State): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'transferedFundsOutput' @ [82:16] ==> val transferedFundsOutput: Cash.State defined in net.corda.docs.prepareOurInputsAndOutputs[LocalVariableDescriptor]

'Pair' @ [84:12] ==> public constructor Pair<out A, out B>(first: List<StateAndRef<Cash.State>>, second: List<Cash.State>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<StateAndRef<State>>
    <out B> -> List<State>

'inputs' @ [84:17] ==> val inputs: List<StateAndRef<Cash.State>> defined in net.corda.docs.prepareOurInputsAndOutputs[LocalVariableDescriptor]

'outputs' @ [84:25] ==> val outputs: List<Cash.State> defined in net.corda.docs.prepareOurInputsAndOutputs[LocalVariableDescriptor]

'InitiatingFlow' @ [90:1] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<SecureHash>' @ [95:60] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SecureHash

'Suspendable' @ [96:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'component1' @ [101:14] ==> public final operator fun component1(): FxRequest defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [101:28] ==> public final operator fun component2(): FxRequest defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (baseCurrencySeller == serviceHub.myInfo.legalIdentity) {
            val local = FxRequest(tradeId, baseCurrencyAmount, baseCurrencySeller, baseCurrencyBuyer)
            val remote = FxRequest(tradeId, quoteCurrencyAmount, baseCurrencyBuyer, baseCurrencySeller)
            Pair(local, remote)
        } else if (baseCurrencyBuyer == serviceHub.myInfo.legalIdentity) {
            val local = FxRequest(tradeId, quoteCurrencyAmount, baseCurrencyBuyer, baseCurrencySeller)
            val remote = FxRequest(tradeId, baseCurrencyAmount, baseCurrencySeller, baseCurrencyBuyer)
            Pair(local, remote)
        } else throw IllegalArgumentException("Our identity must be one of the parties in the trade.")' @ [101:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<FxRequest, FxRequest>, elseBranch: Pair<FxRequest, FxRequest>): Pair<FxRequest, FxRequest>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<FxRequest, FxRequest>

'baseCurrencySeller' @ [101:49] ==> public final val baseCurrencySeller: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'serviceHub' @ [101:71] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.ForeignExchangeFlow[DeserializedPropertyDescriptor]

'myInfo' @ [101:82] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [101:89] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'FxRequest' @ [102:25] ==> public constructor FxRequest(tradeId: String, amount: Amount<Issued<Currency>>, owner: Party, counterparty: Party, notary: Party? = ...) defined in net.corda.docs.FxRequest[ClassConstructorDescriptorImpl]

'tradeId' @ [102:35] ==> public final val tradeId: String defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'baseCurrencyAmount' @ [102:44] ==> public final val baseCurrencyAmount: Amount<Issued<Currency>> defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'baseCurrencySeller' @ [102:64] ==> public final val baseCurrencySeller: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'baseCurrencyBuyer' @ [102:84] ==> public final val baseCurrencyBuyer: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'FxRequest' @ [103:26] ==> public constructor FxRequest(tradeId: String, amount: Amount<Issued<Currency>>, owner: Party, counterparty: Party, notary: Party? = ...) defined in net.corda.docs.FxRequest[ClassConstructorDescriptorImpl]

'tradeId' @ [103:36] ==> public final val tradeId: String defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'quoteCurrencyAmount' @ [103:45] ==> public final val quoteCurrencyAmount: Amount<Issued<Currency>> defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'baseCurrencyBuyer' @ [103:66] ==> public final val baseCurrencyBuyer: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'baseCurrencySeller' @ [103:85] ==> public final val baseCurrencySeller: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'Pair' @ [104:13] ==> public constructor Pair<out A, out B>(first: FxRequest, second: FxRequest) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> FxRequest
    <out B> -> FxRequest

'local' @ [104:18] ==> val local: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'remote' @ [104:25] ==> val remote: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'if (baseCurrencyBuyer == serviceHub.myInfo.legalIdentity) {
            val local = FxRequest(tradeId, quoteCurrencyAmount, baseCurrencyBuyer, baseCurrencySeller)
            val remote = FxRequest(tradeId, baseCurrencyAmount, baseCurrencySeller, baseCurrencyBuyer)
            Pair(local, remote)
        } else throw IllegalArgumentException("Our identity must be one of the parties in the trade.")' @ [105:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<FxRequest, FxRequest>, elseBranch: Pair<FxRequest, FxRequest>): Pair<FxRequest, FxRequest>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<FxRequest, FxRequest>

'baseCurrencyBuyer' @ [105:20] ==> public final val baseCurrencyBuyer: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'serviceHub' @ [105:41] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.ForeignExchangeFlow[DeserializedPropertyDescriptor]

'myInfo' @ [105:52] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [105:59] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'FxRequest' @ [106:25] ==> public constructor FxRequest(tradeId: String, amount: Amount<Issued<Currency>>, owner: Party, counterparty: Party, notary: Party? = ...) defined in net.corda.docs.FxRequest[ClassConstructorDescriptorImpl]

'tradeId' @ [106:35] ==> public final val tradeId: String defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'quoteCurrencyAmount' @ [106:44] ==> public final val quoteCurrencyAmount: Amount<Issued<Currency>> defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'baseCurrencyBuyer' @ [106:65] ==> public final val baseCurrencyBuyer: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'baseCurrencySeller' @ [106:84] ==> public final val baseCurrencySeller: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'FxRequest' @ [107:26] ==> public constructor FxRequest(tradeId: String, amount: Amount<Issued<Currency>>, owner: Party, counterparty: Party, notary: Party? = ...) defined in net.corda.docs.FxRequest[ClassConstructorDescriptorImpl]

'tradeId' @ [107:36] ==> public final val tradeId: String defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'baseCurrencyAmount' @ [107:45] ==> public final val baseCurrencyAmount: Amount<Issued<Currency>> defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'baseCurrencySeller' @ [107:65] ==> public final val baseCurrencySeller: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'baseCurrencyBuyer' @ [107:85] ==> public final val baseCurrencyBuyer: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'Pair' @ [108:13] ==> public constructor Pair<out A, out B>(first: FxRequest, second: FxRequest) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> FxRequest
    <out B> -> FxRequest

'local' @ [108:18] ==> val local: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'remote' @ [108:25] ==> val remote: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'IllegalArgumentException' @ [109:22] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'component1' @ [112:14] ==> public final operator fun component1(): List<StateAndRef<Cash.State>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [112:30] ==> public final operator fun component2(): List<Cash.State> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'prepareOurInputsAndOutputs' @ [112:49] ==> private fun prepareOurInputsAndOutputs(serviceHub: ServiceHub, lockId: UUID, request: FxRequest): Pair<List<StateAndRef<Cash.State>>, List<Cash.State>> defined in net.corda.docs[SimpleFunctionDescriptorImpl]

'serviceHub' @ [112:76] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.ForeignExchangeFlow[DeserializedPropertyDescriptor]

'runId' @ [112:88] ==> public final val runId: StateMachineRunId defined in net.corda.docs.ForeignExchangeFlow[DeserializedPropertyDescriptor]

'uuid' @ [112:94] ==> public final val uuid: UUID defined in net.corda.core.flows.StateMachineRunId[DeserializedPropertyDescriptor]

'localRequest' @ [112:100] ==> val localRequest: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'outInputStates' @ [115:22] ==> val outInputStates: List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'first' @ [115:37] ==> public fun <T> List<StateAndRef<Cash.State>>.first(): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'state' @ [115:45] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [115:51] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'remoteRequest' @ [117:39] ==> val remoteRequest: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'copy' @ [117:53] ==> public final fun copy(tradeId: String = ..., amount: Amount<Issued<Currency>> = ..., owner: Party = ..., counterparty: Party = ..., notary: Party? = ...): FxRequest defined in net.corda.docs.FxRequest[SimpleFunctionDescriptorImpl]

'notary' @ [117:67] ==> val notary: Party defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'send' @ [121:9] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.docs.ForeignExchangeFlow[DeserializedSimpleFunctionDescriptor]

'remoteRequestWithNotary' @ [121:14] ==> val remoteRequestWithNotary: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'owner' @ [121:38] ==> public final val owner: Party defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'remoteRequestWithNotary' @ [121:45] ==> val remoteRequestWithNotary: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'subFlow' @ [122:32] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<@JvmSuppressWildcards List<StateAndRef<Cash.State>>>): @JvmSuppressWildcards List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> [@kotlin.jvm.JvmSuppressWildcards] List<StateAndRef<State>>

'ReceiveStateAndRefFlow' @ [122:40] ==> public constructor ReceiveStateAndRefFlow<out T : ContractState>(otherParty: Party) defined in net.corda.core.flows.ReceiveStateAndRefFlow[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'remoteRequestWithNotary' @ [122:75] ==> val remoteRequestWithNotary: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'owner' @ [122:99] ==> public final val owner: Party defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'receive' @ [123:33] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<List<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> List<State>

'remoteRequestWithNotary' @ [123:59] ==> val remoteRequestWithNotary: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'owner' @ [123:83] ==> public final val owner: Party defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'unwrap' @ [123:90] ==> public inline fun <T, R> UntrustworthyData<List<Cash.State>>.unwrap(validator: (List<Cash.State>) -> List<Cash.State>): List<Cash.State> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<State>
    <R> -> List<State>

'require' @ [124:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'theirInputStates' @ [124:21] ==> val theirInputStates: @JvmSuppressWildcards List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'all' @ [124:38] ==> public inline fun <T> Iterable<StateAndRef<Cash.State>>.all(predicate: (StateAndRef<Cash.State>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [124:44] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [124:47] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [124:53] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'notary' @ [124:63] ==> val notary: Party defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'require' @ [127:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'theirInputStates' @ [127:21] ==> val theirInputStates: @JvmSuppressWildcards List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'all' @ [127:38] ==> public inline fun <T> Iterable<StateAndRef<Cash.State>>.all(predicate: (StateAndRef<Cash.State>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [127:44] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [127:47] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [127:53] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [127:58] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [127:65] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'remoteRequestWithNotary' @ [127:74] ==> val remoteRequestWithNotary: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'amount' @ [127:98] ==> public final val amount: Amount<Issued<Currency>> defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'token' @ [127:105] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'require' @ [130:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'it' @ [130:21] ==> value-parameter it: List<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'all' @ [130:24] ==> public inline fun <T> Iterable<Cash.State>.all(predicate: (Cash.State) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'it' @ [130:30] ==> value-parameter it: Cash.State defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [130:33] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [130:40] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'remoteRequestWithNotary' @ [130:49] ==> val remoteRequestWithNotary: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'amount' @ [130:73] ==> public final val amount: Amount<Issued<Currency>> defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'token' @ [130:80] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'require' @ [133:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'theirInputStates' @ [133:21] ==> val theirInputStates: @JvmSuppressWildcards List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'map' @ [133:38] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> Long

'it' @ [133:44] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [133:47] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [133:53] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [133:58] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'quantity' @ [133:65] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'sum' @ [133:76] ==> @JvmName public fun Iterable<Long>.sum(): Long defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'remoteRequestWithNotary' @ [134:24] ==> val remoteRequestWithNotary: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'amount' @ [134:48] ==> public final val amount: Amount<Issued<Currency>> defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'quantity' @ [134:55] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'require' @ [137:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'it' @ [137:21] ==> value-parameter it: List<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [137:24] ==> public inline fun <T> Iterable<Cash.State>.filter(predicate: (Cash.State) -> Boolean): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'it' @ [137:33] ==> value-parameter it: Cash.State defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [137:36] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'serviceHub' @ [137:45] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.ForeignExchangeFlow[DeserializedPropertyDescriptor]

'myInfo' @ [137:56] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [137:63] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'map' @ [138:21] ==> public inline fun <T, R> Iterable<Cash.State>.map(transform: (Cash.State) -> Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> Long

'it' @ [138:27] ==> value-parameter it: Cash.State defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [138:30] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'quantity' @ [138:37] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'sum' @ [138:48] ==> @JvmName public fun Iterable<Long>.sum(): Long defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'remoteRequestWithNotary' @ [138:57] ==> val remoteRequestWithNotary: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'amount' @ [138:81] ==> public final val amount: Amount<Issued<Currency>> defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'quantity' @ [138:88] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'it' @ [141:13] ==> value-parameter it: List<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'buildTradeProposal' @ [145:33] ==> private final fun buildTradeProposal(ourInputStates: List<StateAndRef<Cash.State>>, ourOutputState: List<Cash.State>, theirInputStates: List<StateAndRef<Cash.State>>, theirOutputState: List<Cash.State>): SignedTransaction defined in net.corda.docs.ForeignExchangeFlow[SimpleFunctionDescriptorImpl]

'outInputStates' @ [145:52] ==> val outInputStates: List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'ourOutputStates' @ [145:68] ==> val ourOutputStates: List<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'theirInputStates' @ [145:85] ==> val theirInputStates: @JvmSuppressWildcards List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'theirOutputStates' @ [145:103] ==> val theirOutputStates: List<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'subFlow' @ [149:9] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.docs.ForeignExchangeFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'SendTransactionFlow' @ [149:17] ==> public constructor SendTransactionFlow(otherSide: Party, stx: SignedTransaction) defined in net.corda.core.flows.SendTransactionFlow[DeserializedClassConstructorDescriptor]

'remoteRequestWithNotary' @ [149:37] ==> val remoteRequestWithNotary: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'owner' @ [149:61] ==> public final val owner: Party defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'signedTransaction' @ [149:68] ==> val signedTransaction: SignedTransaction defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'receive' @ [150:32] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<TransactionSignature> defined in net.corda.docs.ForeignExchangeFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> TransactionSignature

'remoteRequestWithNotary' @ [150:62] ==> val remoteRequestWithNotary: FxRequest defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'owner' @ [150:86] ==> public final val owner: Party defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'unwrap' @ [150:93] ==> public inline fun <T, R> UntrustworthyData<TransactionSignature>.unwrap(validator: (TransactionSignature) -> SignedTransaction): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> SignedTransaction

'signedTransaction' @ [151:36] ==> val signedTransaction: SignedTransaction defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'it' @ [151:56] ==> value-parameter it: TransactionSignature defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'withNewSignature' @ [153:13] ==> val withNewSignature: SignedTransaction defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>[LocalVariableDescriptor]

'verifySignaturesExcept' @ [153:30] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'withNewSignature' @ [153:53] ==> val withNewSignature: SignedTransaction defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>[LocalVariableDescriptor]

'tx' @ [153:70] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'notary' @ [153:73] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'owningKey' @ [153:82] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'withNewSignature' @ [158:13] ==> val withNewSignature: SignedTransaction defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>[LocalVariableDescriptor]

'tx' @ [158:30] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'toLedgerTransaction' @ [158:33] ==> public final fun toLedgerTransaction(services: ServicesForResolution): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [158:53] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.ForeignExchangeFlow[DeserializedPropertyDescriptor]

'verify' @ [158:65] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'withNewSignature' @ [160:13] ==> val withNewSignature: SignedTransaction defined in net.corda.docs.ForeignExchangeFlow.call.<anonymous>[LocalVariableDescriptor]

'subFlow' @ [164:9] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.docs.ForeignExchangeFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [164:17] ==> public constructor FinalityFlow(transaction: SignedTransaction, extraParticipants: Set<Party>) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'allPartySignedTx' @ [164:30] ==> val allPartySignedTx: SignedTransaction defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'setOf' @ [164:48] ==> public fun <T> setOf(vararg elements: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'baseCurrencyBuyer' @ [164:54] ==> public final val baseCurrencyBuyer: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'baseCurrencySeller' @ [164:73] ==> public final val baseCurrencySeller: Party defined in net.corda.docs.ForeignExchangeFlow[PropertyDescriptorImpl]

'allPartySignedTx' @ [166:16] ==> val allPartySignedTx: SignedTransaction defined in net.corda.docs.ForeignExchangeFlow.call[LocalVariableDescriptor]

'id' @ [166:33] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [177:23] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'ourInputStates' @ [177:42] ==> value-parameter ourInputStates: List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[ValueParameterDescriptorImpl]

'first' @ [177:57] ==> public fun <T> List<StateAndRef<Cash.State>>.first(): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'state' @ [177:65] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [177:71] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'ourInputStates' @ [180:26] ==> value-parameter ourInputStates: List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[ValueParameterDescriptorImpl]

'map' @ [180:41] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> PublicKey

'it' @ [180:47] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [180:50] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [180:56] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owner' @ [180:61] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'owningKey' @ [180:67] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toSet' @ [180:79] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'theirInputStates' @ [181:28] ==> value-parameter theirInputStates: List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[ValueParameterDescriptorImpl]

'map' @ [181:45] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> PublicKey

'it' @ [181:51] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [181:54] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [181:60] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owner' @ [181:65] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'owningKey' @ [181:71] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toSet' @ [181:83] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'builder' @ [182:9] ==> val builder: TransactionBuilder defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[LocalVariableDescriptor]

'addCommand' @ [182:17] ==> public final fun addCommand(data: CommandData, keys: List<PublicKey>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Cash' @ [182:28] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [182:42] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'ourSigners' @ [182:51] ==> val ourSigners: Set<PublicKey> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[LocalVariableDescriptor]

'theirSigners' @ [182:64] ==> val theirSigners: Set<PublicKey> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[LocalVariableDescriptor]

'toList' @ [182:78] ==> public fun <T> Iterable<PublicKey>.toList(): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'builder' @ [185:9] ==> val builder: TransactionBuilder defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[LocalVariableDescriptor]

'withItems' @ [185:17] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'ourInputStates' @ [185:28] ==> value-parameter ourInputStates: List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[ValueParameterDescriptorImpl]

'toTypedArray' @ [185:43] ==> public inline fun <reified T> Collection<StateAndRef<Cash.State>>.toTypedArray(): Array<StateAndRef<Cash.State>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> StateAndRef<State>

'builder' @ [186:9] ==> val builder: TransactionBuilder defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[LocalVariableDescriptor]

'withItems' @ [186:17] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'theirInputStates' @ [186:28] ==> value-parameter theirInputStates: List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[ValueParameterDescriptorImpl]

'toTypedArray' @ [186:45] ==> public inline fun <reified T> Collection<StateAndRef<Cash.State>>.toTypedArray(): Array<StateAndRef<Cash.State>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> StateAndRef<State>

'builder' @ [187:9] ==> val builder: TransactionBuilder defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[LocalVariableDescriptor]

'withItems' @ [187:17] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'ourOutputState' @ [187:28] ==> value-parameter ourOutputState: List<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[ValueParameterDescriptorImpl]

'toTypedArray' @ [187:43] ==> public inline fun <reified T> Collection<Cash.State>.toTypedArray(): Array<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> State

'builder' @ [188:9] ==> val builder: TransactionBuilder defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[LocalVariableDescriptor]

'withItems' @ [188:17] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'theirOutputState' @ [188:28] ==> value-parameter theirOutputState: List<Cash.State> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[ValueParameterDescriptorImpl]

'toTypedArray' @ [188:45] ==> public inline fun <reified T> Collection<Cash.State>.toTypedArray(): Array<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> State

'serviceHub' @ [193:16] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.ForeignExchangeFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [193:27] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'builder' @ [193:50] ==> val builder: TransactionBuilder defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[LocalVariableDescriptor]

'ourSigners' @ [193:59] ==> val ourSigners: Set<PublicKey> defined in net.corda.docs.ForeignExchangeFlow.buildTradeProposal[LocalVariableDescriptor]

'single' @ [193:70] ==> public fun <T> Iterable<PublicKey>.single(): PublicKey defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'InitiatedBy' @ [198:1] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'ForeignExchangeFlow' @ [198:14] ==> public constructor ForeignExchangeFlow(tradeId: String, baseCurrencyAmount: Amount<Issued<Currency>>, quoteCurrencyAmount: Amount<Issued<Currency>>, baseCurrencyBuyer: Party, baseCurrencySeller: Party) defined in net.corda.docs.ForeignExchangeFlow[ClassConstructorDescriptorImpl]

'FlowLogic<Unit>' @ [199:54] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [200:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receive' @ [203:23] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<FxRequest> defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> FxRequest

'source' @ [203:42] ==> public final val source: Party defined in net.corda.docs.ForeignExchangeRemoteFlow[PropertyDescriptorImpl]

'unwrap' @ [203:50] ==> public inline fun <T, R> UntrustworthyData<FxRequest>.unwrap(validator: (FxRequest) -> FxRequest): FxRequest defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FxRequest
    <R> -> FxRequest

'require' @ [210:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [210:21] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedPropertyDescriptor]

'myInfo' @ [210:32] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [210:39] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'it' @ [210:56] ==> value-parameter it: FxRequest defined in net.corda.docs.ForeignExchangeRemoteFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [210:59] ==> public final val owner: Party defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'require' @ [213:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'source' @ [213:21] ==> public final val source: Party defined in net.corda.docs.ForeignExchangeRemoteFlow[PropertyDescriptorImpl]

'it' @ [213:31] ==> value-parameter it: FxRequest defined in net.corda.docs.ForeignExchangeRemoteFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'counterparty' @ [213:34] ==> public final val counterparty: Party defined in net.corda.docs.FxRequest[PropertyDescriptorImpl]

'it' @ [216:13] ==> value-parameter it: FxRequest defined in net.corda.docs.ForeignExchangeRemoteFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [224:14] ==> public final operator fun component1(): List<StateAndRef<Cash.State>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [224:29] ==> public final operator fun component2(): List<Cash.State> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'prepareOurInputsAndOutputs' @ [224:47] ==> private fun prepareOurInputsAndOutputs(serviceHub: ServiceHub, lockId: UUID, request: FxRequest): Pair<List<StateAndRef<Cash.State>>, List<Cash.State>> defined in net.corda.docs[SimpleFunctionDescriptorImpl]

'serviceHub' @ [224:74] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedPropertyDescriptor]

'runId' @ [224:86] ==> public final val runId: StateMachineRunId defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedPropertyDescriptor]

'uuid' @ [224:92] ==> public final val uuid: UUID defined in net.corda.core.flows.StateMachineRunId[DeserializedPropertyDescriptor]

'request' @ [224:98] ==> val request: FxRequest defined in net.corda.docs.ForeignExchangeRemoteFlow.call[LocalVariableDescriptor]

'serviceHub' @ [227:22] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedPropertyDescriptor]

'keyManagementService' @ [227:33] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'filterMyKeys' @ [227:54] ==> public abstract fun filterMyKeys(candidateKeys: Iterable<PublicKey>): Iterable<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'ourInputState' @ [227:67] ==> val ourInputState: List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeRemoteFlow.call[LocalVariableDescriptor]

'flatMap' @ [227:81] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.flatMap(transform: (StateAndRef<Cash.State>) -> Iterable<AbstractParty>): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> AbstractParty

'it' @ [227:91] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.docs.ForeignExchangeRemoteFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [227:94] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [227:100] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'participants' @ [227:105] ==> public open val participants: List<AbstractParty> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'map' @ [227:120] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [227:126] ==> value-parameter it: AbstractParty defined in net.corda.docs.ForeignExchangeRemoteFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [227:129] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'single' @ [227:142] ==> public fun <T> Iterable<PublicKey>.single(): PublicKey defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'subFlow' @ [229:9] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'SendStateAndRefFlow' @ [229:17] ==> public constructor SendStateAndRefFlow(otherSide: Party, stateAndRefs: List<StateAndRef<*>>) defined in net.corda.core.flows.SendStateAndRefFlow[DeserializedClassConstructorDescriptor]

'source' @ [229:37] ==> public final val source: Party defined in net.corda.docs.ForeignExchangeRemoteFlow[PropertyDescriptorImpl]

'ourInputState' @ [229:45] ==> val ourInputState: List<StateAndRef<Cash.State>> defined in net.corda.docs.ForeignExchangeRemoteFlow.call[LocalVariableDescriptor]

'send' @ [230:9] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedSimpleFunctionDescriptor]

'source' @ [230:14] ==> public final val source: Party defined in net.corda.docs.ForeignExchangeRemoteFlow[PropertyDescriptorImpl]

'ourOutputState' @ [230:22] ==> val ourOutputState: List<Cash.State> defined in net.corda.docs.ForeignExchangeRemoteFlow.call[LocalVariableDescriptor]

'subFlow' @ [231:29] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'ReceiveTransactionFlow' @ [231:37] ==> @JvmOverloads public constructor ReceiveTransactionFlow(otherParty: Party, checkSufficientSignatures: Boolean = ...) defined in net.corda.core.flows.ReceiveTransactionFlow[DeserializedClassConstructorDescriptor]

'source' @ [231:60] ==> public final val source: Party defined in net.corda.docs.ForeignExchangeRemoteFlow[PropertyDescriptorImpl]

'let' @ [231:104] ==> @InlineOnly public inline fun <T, R> SignedTransaction.let(block: (SignedTransaction) -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> SignedTransaction

'it' @ [232:23] ==> value-parameter it: SignedTransaction defined in net.corda.docs.ForeignExchangeRemoteFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [232:26] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'it' @ [234:13] ==> value-parameter it: SignedTransaction defined in net.corda.docs.ForeignExchangeRemoteFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'verifySignaturesExcept' @ [234:16] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'ourKey' @ [234:39] ==> val ourKey: PublicKey defined in net.corda.docs.ForeignExchangeRemoteFlow.call[LocalVariableDescriptor]

'wtx' @ [234:47] ==> val wtx: WireTransaction defined in net.corda.docs.ForeignExchangeRemoteFlow.call.<anonymous>[LocalVariableDescriptor]

'notary' @ [234:51] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'owningKey' @ [234:60] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'wtx' @ [239:13] ==> val wtx: WireTransaction defined in net.corda.docs.ForeignExchangeRemoteFlow.call.<anonymous>[LocalVariableDescriptor]

'toLedgerTransaction' @ [239:17] ==> public final fun toLedgerTransaction(services: ServicesForResolution): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [239:37] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedPropertyDescriptor]

'verify' @ [239:49] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'it' @ [240:13] ==> value-parameter it: SignedTransaction defined in net.corda.docs.ForeignExchangeRemoteFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'serviceHub' @ [244:28] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedPropertyDescriptor]

'createSignature' @ [244:39] ==> public open fun createSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): TransactionSignature defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'proposedTrade' @ [244:55] ==> val proposedTrade: SignedTransaction defined in net.corda.docs.ForeignExchangeRemoteFlow.call[LocalVariableDescriptor]

'ourKey' @ [244:70] ==> val ourKey: PublicKey defined in net.corda.docs.ForeignExchangeRemoteFlow.call[LocalVariableDescriptor]

'send' @ [247:9] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedSimpleFunctionDescriptor]

'source' @ [247:14] ==> public final val source: Party defined in net.corda.docs.ForeignExchangeRemoteFlow[PropertyDescriptorImpl]

'ourSignature' @ [247:22] ==> val ourSignature: TransactionSignature defined in net.corda.docs.ForeignExchangeRemoteFlow.call[LocalVariableDescriptor]

