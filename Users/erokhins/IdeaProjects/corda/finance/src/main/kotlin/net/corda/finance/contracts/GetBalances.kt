'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'builder' @ [20:15] ==> public inline fun <A> builder(block: Builder.() -> CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, Any>): CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, Any> defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> AggregateFunctionExpression<PersistentCashState, Any>

'CashSchemaV1' @ [20:25] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CashSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [20:38] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'pennies' @ [20:59] ==> @Column public final var pennies: Long defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[PropertyDescriptorImpl]

'sum' @ [20:67] ==> public final fun <O, R> KProperty1<CashSchemaV1.PersistentCashState, Any?>.sum(groupByColumns: List<KProperty1<CashSchemaV1.PersistentCashState, Any>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, Any> defined in net.corda.core.node.services.vault.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> PersistentCashState
    <R> -> Any

'listOf' @ [20:88] ==> public fun <T> listOf(element: KMutableProperty1<CashSchemaV1.PersistentCashState, String>): List<KMutableProperty1<CashSchemaV1.PersistentCashState, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KMutableProperty1<PersistentCashState, String>

'CashSchemaV1' @ [20:95] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CashSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [20:108] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'currency' @ [20:129] ==> @Column public final var currency: String defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[PropertyDescriptorImpl]

'VaultCustomQueryCriteria' @ [21:37] ==> @JvmOverloads public constructor VaultCustomQueryCriteria<L : PersistentState>(expression: CriteriaExpression<CashSchemaV1.PersistentCashState, Boolean>, status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedClassConstructorDescriptor]
Inferred types:
    <L : PersistentState> -> PersistentCashState

'sum' @ [21:62] ==> val sum: CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, Any> defined in net.corda.finance.contracts.generateCashSumCriteria[LocalVariableDescriptor]

'builder' @ [23:20] ==> public inline fun <A> builder(block: Builder.() -> CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, (String..String?)>): CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, (String..String?)> defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> ColumnPredicateExpression<PersistentCashState, (kotlin.String..kotlin.String?)>

'CashSchemaV1' @ [23:30] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CashSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [23:43] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'currency' @ [23:64] ==> @Column public final var currency: String defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[PropertyDescriptorImpl]

'equal' @ [23:73] ==> public final fun <O, R> KProperty1<CashSchemaV1.PersistentCashState, String?>.equal(value: (String..String?)): CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, (String..String?)> defined in net.corda.core.node.services.vault.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> PersistentCashState
    <R> -> (kotlin.String..kotlin.String?)

'currency' @ [23:79] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.generateCashSumCriteria[ValueParameterDescriptorImpl]

'currencyCode' @ [23:88] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'VaultCustomQueryCriteria' @ [24:37] ==> @JvmOverloads public constructor VaultCustomQueryCriteria<L : PersistentState>(expression: CriteriaExpression<CashSchemaV1.PersistentCashState, Boolean>, status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedClassConstructorDescriptor]
Inferred types:
    <L : PersistentState> -> PersistentCashState

'ccyIndex' @ [24:62] ==> val ccyIndex: CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, (String..String?)> defined in net.corda.finance.contracts.generateCashSumCriteria[LocalVariableDescriptor]

'sumCriteria' @ [25:12] ==> val sumCriteria: QueryCriteria.VaultCustomQueryCriteria<CashSchemaV1.PersistentCashState> defined in net.corda.finance.contracts.generateCashSumCriteria[LocalVariableDescriptor]

'and' @ [25:24] ==> public final fun and(criteria: QueryCriteria): QueryCriteria defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedSimpleFunctionDescriptor]

'ccyCriteria' @ [25:28] ==> val ccyCriteria: QueryCriteria.VaultCustomQueryCriteria<CashSchemaV1.PersistentCashState> defined in net.corda.finance.contracts.generateCashSumCriteria[LocalVariableDescriptor]

'builder' @ [29:15] ==> public inline fun <A> builder(block: Builder.() -> CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, Any>): CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, Any> defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> AggregateFunctionExpression<PersistentCashState, Any>

'CashSchemaV1' @ [30:9] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CashSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [30:22] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'pennies' @ [30:43] ==> @Column public final var pennies: Long defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[PropertyDescriptorImpl]

'sum' @ [30:51] ==> public final fun <O, R> KProperty1<CashSchemaV1.PersistentCashState, Any?>.sum(groupByColumns: List<KProperty1<CashSchemaV1.PersistentCashState, Any>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, Any> defined in net.corda.core.node.services.vault.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> PersistentCashState
    <R> -> Any

'listOf' @ [30:72] ==> public fun <T> listOf(element: KMutableProperty1<CashSchemaV1.PersistentCashState, String>): List<KMutableProperty1<CashSchemaV1.PersistentCashState, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KMutableProperty1<PersistentCashState, String>

'CashSchemaV1' @ [30:79] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CashSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [30:92] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'currency' @ [30:113] ==> @Column public final var currency: String defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[PropertyDescriptorImpl]

'DESC' @ [31:42] ==> enum entry DESC defined in net.corda.core.node.services.vault.Sort.Direction[FakeCallableDescriptorForObject]

'VaultCustomQueryCriteria' @ [33:26] ==> @JvmOverloads public constructor VaultCustomQueryCriteria<L : PersistentState>(expression: CriteriaExpression<CashSchemaV1.PersistentCashState, Boolean>, status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedClassConstructorDescriptor]
Inferred types:
    <L : PersistentState> -> PersistentCashState

'sum' @ [33:51] ==> val sum: CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, Any> defined in net.corda.finance.contracts.generateCashSumsCriteria[LocalVariableDescriptor]

'if (rows.otherResults.isEmpty()) {
        Amount(0L, currency)
    } else {
        require(rows.otherResults.size == 2)
        require(rows.otherResults[1] == currency.currencyCode)
        @Suppress("UNCHECKED_CAST")
        val quantity = rows.otherResults[0] as Long
        Amount(quantity, currency)
    }' @ [37:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Amount<Currency>, elseBranch: Amount<Currency>): Amount<Currency>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Amount<Currency>

'rows' @ [37:16] ==> value-parameter rows: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'otherResults' @ [37:21] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'isEmpty' @ [37:34] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Amount' @ [38:9] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'currency' @ [38:20] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'require' @ [40:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rows' @ [40:17] ==> value-parameter rows: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'otherResults' @ [40:22] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'size' @ [40:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'require' @ [41:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rows' @ [41:17] ==> value-parameter rows: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'otherResults' @ [41:22] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'currency' @ [41:41] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'currencyCode' @ [41:50] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'Suppress' @ [42:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'rows' @ [43:24] ==> value-parameter rows: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'otherResults' @ [43:29] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'Amount' @ [44:9] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'quantity' @ [44:16] ==> val quantity: Long defined in net.corda.finance.contracts.rowsToAmount[LocalVariableDescriptor]

'currency' @ [44:26] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'LinkedHashMap' @ [49:20] ==> public final fun <K, V> <init>(): LinkedHashMap<Currency, Amount<Currency>> /* = LinkedHashMap<Currency, Amount<Currency>> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> Currency
    <V> -> Amount<Currency>

'..' @ [50:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'rows' @ [50:22] ==> value-parameter rows: List<Any> defined in net.corda.finance.contracts.rowsToBalances[ValueParameterDescriptorImpl]

'size' @ [50:27] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'getInstance' @ [51:28] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'rows' @ [51:40] ==> value-parameter rows: List<Any> defined in net.corda.finance.contracts.rowsToBalances[ValueParameterDescriptorImpl]

'index' @ [51:45] ==> val index: Int defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'balances' @ [52:9] ==> val balances: LinkedHashMap<Currency, Amount<Currency>> /* = LinkedHashMap<Currency, Amount<Currency>> */ defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'ccy' @ [52:18] ==> val ccy: (Currency..Currency?) defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'Amount' @ [52:25] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'rows' @ [52:32] ==> value-parameter rows: List<Any> defined in net.corda.finance.contracts.rowsToBalances[ValueParameterDescriptorImpl]

'index' @ [52:37] ==> val index: Int defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'ccy' @ [52:53] ==> val ccy: (Currency..Currency?) defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'balances' @ [54:12] ==> val balances: LinkedHashMap<Currency, Amount<Currency>> /* = LinkedHashMap<Currency, Amount<Currency>> */ defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'this' @ [58:19] ==> <this> defined in net.corda.finance.contracts.getCashBalance[ReceiverParameterDescriptorImpl]

'vaultQueryByCriteria' @ [58:24] ==> public open fun <T : ContractState> vaultQueryByCriteria(criteria: QueryCriteria, contractType: Class<out FungibleAsset<*>>): Vault.Page<FungibleAsset<*>> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> FungibleAsset<*>

'generateCashSumCriteria' @ [58:45] ==> private fun generateCashSumCriteria(currency: Currency): QueryCriteria defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'currency' @ [58:69] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.getCashBalance[ValueParameterDescriptorImpl]

'java' @ [58:101] ==> public val <T> KClass<FungibleAsset<*>>.java: Class<FungibleAsset<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FungibleAsset<*>

'rowsToAmount' @ [59:12] ==> private fun rowsToAmount(currency: Currency, rows: Vault.Page<FungibleAsset<*>>): Amount<Currency> defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'currency' @ [59:25] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.getCashBalance[ValueParameterDescriptorImpl]

'results' @ [59:35] ==> val results: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.getCashBalance[LocalVariableDescriptor]

'this' @ [63:19] ==> <this> defined in net.corda.finance.contracts.getCashBalance[ReceiverParameterDescriptorImpl]

'vaultQueryService' @ [63:24] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [63:42] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<FungibleAsset<*>> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> FungibleAsset<*>

'generateCashSumCriteria' @ [63:68] ==> private fun generateCashSumCriteria(currency: Currency): QueryCriteria defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'currency' @ [63:92] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.getCashBalance[ValueParameterDescriptorImpl]

'rowsToAmount' @ [64:12] ==> private fun rowsToAmount(currency: Currency, rows: Vault.Page<FungibleAsset<*>>): Amount<Currency> defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'currency' @ [64:25] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.getCashBalance[ValueParameterDescriptorImpl]

'results' @ [64:35] ==> val results: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.getCashBalance[LocalVariableDescriptor]

'this' @ [68:16] ==> <this> defined in net.corda.finance.contracts.getCashBalances[ReceiverParameterDescriptorImpl]

'vaultQueryBy' @ [68:21] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<FungibleAsset<*>> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> FungibleAsset<*>

'generateCashSumsCriteria' @ [68:52] ==> private fun generateCashSumsCriteria(): QueryCriteria defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'otherResults' @ [68:80] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'rowsToBalances' @ [69:12] ==> private fun rowsToBalances(rows: List<Any>): Map<Currency, Amount<Currency>> defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'sums' @ [69:27] ==> val sums: List<Any> defined in net.corda.finance.contracts.getCashBalances[LocalVariableDescriptor]

'this' @ [73:16] ==> <this> defined in net.corda.finance.contracts.getCashBalances[ReceiverParameterDescriptorImpl]

'vaultQueryService' @ [73:21] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [73:39] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<FungibleAsset<*>> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> FungibleAsset<*>

'generateCashSumsCriteria' @ [73:65] ==> private fun generateCashSumsCriteria(): QueryCriteria defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'otherResults' @ [73:93] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'rowsToBalances' @ [74:12] ==> private fun rowsToBalances(rows: List<Any>): Map<Currency, Amount<Currency>> defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'sums' @ [74:27] ==> val sums: List<Any> defined in net.corda.finance.contracts.getCashBalances[LocalVariableDescriptor]

