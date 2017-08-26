'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'builder' @ [20:15] ==> public inline fun <A> builder(block: Builder.() -> CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}>): CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}> defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> AggregateFunctionExpression<PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}>

'CashSchemaV1' @ [21:19] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CashSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [21:32] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'pennies' @ [21:53] ==> @Column public final var pennies: Long defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[PropertyDescriptorImpl]

'sum' @ [21:61] ==> public final fun <O, R> KProperty1<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}?>.sum(groupByColumns: List<KProperty1<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}> defined in net.corda.core.node.services.vault.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> PersistentCashState
    <R> -> {Comparable<{Long & String}> & java.io.Serializable}

'listOf' @ [21:82] ==> public fun <T> listOf(element: KMutableProperty1<CashSchemaV1.PersistentCashState, String>): List<KMutableProperty1<CashSchemaV1.PersistentCashState, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KMutableProperty1<PersistentCashState, String>

'CashSchemaV1' @ [21:89] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CashSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [21:102] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'sum' @ [22:9] ==> val sum: CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}> defined in net.corda.finance.contracts.generateCashSumCriteria.<anonymous>[LocalVariableDescriptor]

'VaultCustomQueryCriteria' @ [24:37] ==> @JvmOverloads public constructor VaultCustomQueryCriteria<L : PersistentState>(expression: CriteriaExpression<CashSchemaV1.PersistentCashState, Boolean>, status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedClassConstructorDescriptor]
Inferred types:
    <L : PersistentState> -> PersistentCashState

'sum' @ [24:62] ==> val sum: CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}> defined in net.corda.finance.contracts.generateCashSumCriteria[LocalVariableDescriptor]

'builder' @ [26:20] ==> public inline fun <A> builder(block: Builder.() -> CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, String?>): CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, String?> defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> ColumnPredicateExpression<PersistentCashState, String?>

'CashSchemaV1' @ [26:30] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CashSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [26:43] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'currency' @ [26:64] ==> @Column public final var currency: String defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[PropertyDescriptorImpl]

'equal' @ [26:73] ==> public final fun <O, R> KProperty1<CashSchemaV1.PersistentCashState, String?>.equal(value: (String..String?)): CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, String?> defined in net.corda.core.node.services.vault.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> PersistentCashState
    <R> -> (kotlin.String..kotlin.String?)

'currency' @ [26:79] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.generateCashSumCriteria[ValueParameterDescriptorImpl]

'currencyCode' @ [26:88] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'VaultCustomQueryCriteria' @ [27:37] ==> @JvmOverloads public constructor VaultCustomQueryCriteria<L : PersistentState>(expression: CriteriaExpression<CashSchemaV1.PersistentCashState, Boolean>, status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedClassConstructorDescriptor]
Inferred types:
    <L : PersistentState> -> PersistentCashState

'ccyIndex' @ [27:62] ==> val ccyIndex: CriteriaExpression.ColumnPredicateExpression<CashSchemaV1.PersistentCashState, String?> defined in net.corda.finance.contracts.generateCashSumCriteria[LocalVariableDescriptor]

'sumCriteria' @ [28:12] ==> val sumCriteria: QueryCriteria.VaultCustomQueryCriteria<CashSchemaV1.PersistentCashState> defined in net.corda.finance.contracts.generateCashSumCriteria[LocalVariableDescriptor]

'and' @ [28:24] ==> public final fun and(criteria: QueryCriteria): QueryCriteria defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedSimpleFunctionDescriptor]

'ccyCriteria' @ [28:28] ==> val ccyCriteria: QueryCriteria.VaultCustomQueryCriteria<CashSchemaV1.PersistentCashState> defined in net.corda.finance.contracts.generateCashSumCriteria[LocalVariableDescriptor]

'builder' @ [32:15] ==> public inline fun <A> builder(block: Builder.() -> CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}>): CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}> defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> AggregateFunctionExpression<PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}>

'CashSchemaV1' @ [33:19] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CashSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [33:32] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'pennies' @ [33:53] ==> @Column public final var pennies: Long defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[PropertyDescriptorImpl]

'sum' @ [33:61] ==> public final fun <O, R> KProperty1<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}?>.sum(groupByColumns: List<KProperty1<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}> defined in net.corda.core.node.services.vault.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> PersistentCashState
    <R> -> {Comparable<{Long & String}> & java.io.Serializable}

'listOf' @ [33:82] ==> public fun <T> listOf(element: KMutableProperty1<CashSchemaV1.PersistentCashState, String>): List<KMutableProperty1<CashSchemaV1.PersistentCashState, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KMutableProperty1<PersistentCashState, String>

'CashSchemaV1' @ [33:89] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CashSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [33:102] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'DESC' @ [34:42] ==> enum entry DESC defined in net.corda.core.node.services.vault.Sort.Direction[FakeCallableDescriptorForObject]

'sum' @ [35:9] ==> val sum: CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}> defined in net.corda.finance.contracts.generateCashSumsCriteria.<anonymous>[LocalVariableDescriptor]

'VaultCustomQueryCriteria' @ [37:26] ==> @JvmOverloads public constructor VaultCustomQueryCriteria<L : PersistentState>(expression: CriteriaExpression<CashSchemaV1.PersistentCashState, Boolean>, status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedClassConstructorDescriptor]
Inferred types:
    <L : PersistentState> -> PersistentCashState

'sum' @ [37:51] ==> val sum: CriteriaExpression.AggregateFunctionExpression<CashSchemaV1.PersistentCashState, {Comparable<{Long & String}> & java.io.Serializable}> defined in net.corda.finance.contracts.generateCashSumsCriteria[LocalVariableDescriptor]

'if (rows.otherResults.isEmpty()) {
        Amount(0L, currency)
    } else {
        require(rows.otherResults.size == 2)
        require(rows.otherResults[1] == currency.currencyCode)
        @Suppress("UNCHECKED_CAST")
        val quantity = rows.otherResults[0] as Long
        Amount(quantity, currency)
    }' @ [41:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Amount<Currency>, elseBranch: Amount<Currency>): Amount<Currency>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Amount<Currency>

'rows' @ [41:16] ==> value-parameter rows: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'otherResults' @ [41:21] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'isEmpty' @ [41:34] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Amount' @ [42:9] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'currency' @ [42:20] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'require' @ [44:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rows' @ [44:17] ==> value-parameter rows: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'otherResults' @ [44:22] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'size' @ [44:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'require' @ [45:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rows' @ [45:17] ==> value-parameter rows: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'otherResults' @ [45:22] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'currency' @ [45:41] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'currencyCode' @ [45:50] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'Suppress' @ [46:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'rows' @ [47:24] ==> value-parameter rows: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'otherResults' @ [47:29] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'Amount' @ [48:9] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'quantity' @ [48:16] ==> val quantity: Long defined in net.corda.finance.contracts.rowsToAmount[LocalVariableDescriptor]

'currency' @ [48:26] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.rowsToAmount[ValueParameterDescriptorImpl]

'LinkedHashMap' @ [53:20] ==> public final fun <K, V> <init>(): LinkedHashMap<Currency, Amount<Currency>> /* = LinkedHashMap<Currency, Amount<Currency>> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> Currency
    <V> -> Amount<Currency>

'..' @ [54:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'rows' @ [54:22] ==> value-parameter rows: List<Any> defined in net.corda.finance.contracts.rowsToBalances[ValueParameterDescriptorImpl]

'size' @ [54:27] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'getInstance' @ [55:28] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'rows' @ [55:40] ==> value-parameter rows: List<Any> defined in net.corda.finance.contracts.rowsToBalances[ValueParameterDescriptorImpl]

'index' @ [55:45] ==> val index: Int defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'balances' @ [56:9] ==> val balances: LinkedHashMap<Currency, Amount<Currency>> /* = LinkedHashMap<Currency, Amount<Currency>> */ defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'ccy' @ [56:18] ==> val ccy: (Currency..Currency?) defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'Amount' @ [56:25] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> (java.util.Currency..java.util.Currency?)

'rows' @ [56:32] ==> value-parameter rows: List<Any> defined in net.corda.finance.contracts.rowsToBalances[ValueParameterDescriptorImpl]

'index' @ [56:37] ==> val index: Int defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'ccy' @ [56:53] ==> val ccy: (Currency..Currency?) defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'balances' @ [58:12] ==> val balances: LinkedHashMap<Currency, Amount<Currency>> /* = LinkedHashMap<Currency, Amount<Currency>> */ defined in net.corda.finance.contracts.rowsToBalances[LocalVariableDescriptor]

'this' @ [62:19] ==> <this> defined in net.corda.finance.contracts.getCashBalance[ReceiverParameterDescriptorImpl]

'vaultQueryByCriteria' @ [62:24] ==> public open fun <T : ContractState> vaultQueryByCriteria(criteria: QueryCriteria, contractType: Class<out FungibleAsset<*>>): Vault.Page<FungibleAsset<*>> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> FungibleAsset<*>

'generateCashSumCriteria' @ [62:45] ==> private fun generateCashSumCriteria(currency: Currency): QueryCriteria defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'currency' @ [62:69] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.getCashBalance[ValueParameterDescriptorImpl]

'java' @ [62:101] ==> public val <T> KClass<FungibleAsset<*>>.java: Class<FungibleAsset<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FungibleAsset<*>

'rowsToAmount' @ [63:12] ==> private fun rowsToAmount(currency: Currency, rows: Vault.Page<FungibleAsset<*>>): Amount<Currency> defined in net.corda.finance.contracts[SimpleFunctionDescriptorImpl]

'currency' @ [63:25] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.getCashBalance[ValueParameterDescriptorImpl]

'results' @ [63:35] ==> val results: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.getCashBalance[LocalVariableDescriptor]

'this' @ [67:19] ==> <this> defined in net.corda.finance.contracts.getCashBalance[ReceiverParameterDescriptorImpl]

'vaultQueryService' @ [67:24] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [67:42] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<FungibleAsset<*>> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> FungibleAsset<*>

'generateCashSumCriteria' @ [67:68] ==> private fun generateCashSumCriteria(currency: Currency): QueryCriteria defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'currency' @ [67:92] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.getCashBalance[ValueParameterDescriptorImpl]

'rowsToAmount' @ [68:12] ==> private fun rowsToAmount(currency: Currency, rows: Vault.Page<FungibleAsset<*>>): Amount<Currency> defined in net.corda.finance.contracts[SimpleFunctionDescriptorImpl]

'currency' @ [68:25] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.getCashBalance[ValueParameterDescriptorImpl]

'results' @ [68:35] ==> val results: Vault.Page<FungibleAsset<*>> defined in net.corda.finance.contracts.getCashBalance[LocalVariableDescriptor]

'this' @ [72:16] ==> <this> defined in net.corda.finance.contracts.getCashBalances[ReceiverParameterDescriptorImpl]

'vaultQueryBy' @ [72:21] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<FungibleAsset<*>> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> FungibleAsset<*>

'generateCashSumsCriteria' @ [72:52] ==> private fun generateCashSumsCriteria(): QueryCriteria defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'otherResults' @ [72:80] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'rowsToBalances' @ [73:12] ==> private fun rowsToBalances(rows: List<Any>): Map<Currency, Amount<Currency>> defined in net.corda.finance.contracts[SimpleFunctionDescriptorImpl]

'sums' @ [73:27] ==> val sums: List<Any> defined in net.corda.finance.contracts.getCashBalances[LocalVariableDescriptor]

'this' @ [77:16] ==> <this> defined in net.corda.finance.contracts.getCashBalances[ReceiverParameterDescriptorImpl]

'vaultQueryService' @ [77:21] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [77:39] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<FungibleAsset<*>> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> FungibleAsset<*>

'generateCashSumsCriteria' @ [77:65] ==> private fun generateCashSumsCriteria(): QueryCriteria defined in net.corda.finance.contracts in file GetBalances.kt[SimpleFunctionDescriptorImpl]

'otherResults' @ [77:93] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'rowsToBalances' @ [78:12] ==> private fun rowsToBalances(rows: List<Any>): Map<Currency, Amount<Currency>> defined in net.corda.finance.contracts[SimpleFunctionDescriptorImpl]

'sums' @ [78:27] ==> val sums: List<Any> defined in net.corda.finance.contracts.getCashBalances[LocalVariableDescriptor]

