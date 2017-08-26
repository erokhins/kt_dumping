'require' @ [43:5] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'args' @ [43:13] ==> value-parameter args: Array<String> defined in net.corda.docs.main[ValueParameterDescriptorImpl]

'isNotEmpty' @ [43:18] ==> @InlineOnly public inline fun <T> Array<out String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'valueOf' @ [44:45] ==> public final fun valueOf(value: String): PrintOrVisualise defined in net.corda.docs.PrintOrVisualise[SimpleFunctionDescriptorImpl]

'args' @ [44:53] ==> value-parameter args: Array<String> defined in net.corda.docs.main[ValueParameterDescriptorImpl]

'get' @ [46:31] ==> public open fun get(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'User' @ [47:16] ==> public constructor User(username: String, password: String, permissions: Set<String>) defined in net.corda.nodeapi.User[DeserializedClassConstructorDescriptor]

'setOf' @ [47:55] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'startFlowPermission' @ [47:61] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> CashIssueFlow

'startFlowPermission' @ [48:13] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> CashPaymentFlow

'startFlowPermission' @ [49:13] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> CashExitFlow

'driver' @ [51:5] ==> @JvmOverloads public fun <A> driver(isDebug: Boolean = ..., driverDirectory: Path = ..., portAllocation: PortAllocation = ..., debugPortAllocation: PortAllocation = ..., systemProperties: Map<String, String> = ..., useTestClock: Boolean = ..., initialiseSerialization: Boolean = ..., networkMapStartStrategy: NetworkMapStartStrategy = ..., startNodesInProcess: Boolean = ..., dsl: DriverDSLExposedInterface.() -> Unit): Unit defined in net.corda.testing.driver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Unit

'baseDirectory' @ [51:30] ==> val baseDirectory: (Path..Path?) defined in net.corda.docs.main[LocalVariableDescriptor]

'startNode' @ [52:9] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [52:19] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [52:32] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'setOf' @ [52:59] ==> public fun <T> setOf(element: ServiceInfo): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'ServiceInfo' @ [52:65] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'type' @ [52:101] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.ValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'startNode' @ [53:20] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'ALICE' @ [53:30] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [53:36] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'listOf' @ [53:53] ==> public fun <T> listOf(element: User): List<User> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'user' @ [53:60] ==> val user: User defined in net.corda.docs.main[LocalVariableDescriptor]

'get' @ [53:67] ==> public abstract fun get(): (NodeHandle..NodeHandle?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'node' @ [57:22] ==> val node: (NodeHandle..NodeHandle?) defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'rpcClientToNode' @ [57:27] ==> public final fun rpcClientToNode(): CordaRPCClient defined in net.corda.testing.driver.NodeHandle[DeserializedSimpleFunctionDescriptor]

'client' @ [58:21] ==> val client: CordaRPCClient defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'start' @ [58:28] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'proxy' @ [58:54] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'thread' @ [60:9] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'generateTransactions' @ [61:13] ==> public fun generateTransactions(proxy: CordaRPCOps): Unit defined in net.corda.docs in file ClientRpcTutorial.kt[SimpleFunctionDescriptorImpl]

'proxy' @ [61:34] ==> val proxy: CordaRPCOps defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'component1' @ [66:14] ==> public final operator fun component1(): List<SignedTransaction> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [66:53] ==> public final operator fun component2(): Observable<SignedTransaction> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'proxy' @ [66:106] ==> val proxy: CordaRPCOps defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'verifiedTransactionsFeed' @ [66:112] ==> @RPCReturnsObservables public abstract fun verifiedTransactionsFeed(): DataFeed<List<SignedTransaction>, SignedTransaction> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'when (printOrVisualise) {
            PrintOrVisualise.Print -> {
                futureTransactions.startWith(transactions).subscribe { transaction ->
                    println("NODE ${transaction.id}")
                    transaction.tx.inputs.forEach { (txhash) ->
                        println("EDGE $txhash ${transaction.id}")
                    }
                }
            }
        // END 4
        // START 5
            PrintOrVisualise.Visualise -> {
                val graph = MultiGraph("transactions")
                transactions.forEach { transaction ->
                    graph.addNode<Node>("${transaction.id}")
                }
                transactions.forEach { transaction ->
                    transaction.tx.inputs.forEach { ref ->
                        graph.addEdge<Edge>("$ref", "${ref.txhash}", "${transaction.id}")
                    }
                }
                futureTransactions.subscribe { transaction ->
                    graph.addNode<Node>("${transaction.id}")
                    transaction.tx.inputs.forEach { ref ->
                        graph.addEdge<Edge>("$ref", "${ref.txhash}", "${transaction.id}")
                    }
                }
                graph.display()
            }
        }' @ [70:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Any..Any?), entry1: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'printOrVisualise' @ [70:15] ==> val printOrVisualise: PrintOrVisualise defined in net.corda.docs.main[LocalVariableDescriptor]

'Print' @ [71:30] ==> enum entry Print defined in net.corda.docs.PrintOrVisualise[FakeCallableDescriptorForObject]

'futureTransactions' @ [72:17] ==> val futureTransactions: Observable<SignedTransaction> defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'startWith' @ [72:36] ==> public final fun startWith(p0: (MutableIterable<(SignedTransaction..SignedTransaction?)>..Iterable<(SignedTransaction..SignedTransaction?)>?)): (Observable<(SignedTransaction..SignedTransaction?)>..Observable<(SignedTransaction..SignedTransaction?)>?) defined in rx.Observable[JavaMethodDescriptor]

'transactions' @ [72:46] ==> val transactions: List<SignedTransaction> defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'subscribe' @ [72:60] ==> public final fun subscribe(p0: (((SignedTransaction..SignedTransaction?)) -> Unit..(((SignedTransaction..SignedTransaction?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'println' @ [73:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'transaction' @ [73:37] ==> value-parameter transaction: (SignedTransaction..SignedTransaction?) defined in net.corda.docs.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [73:49] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'transaction' @ [74:21] ==> value-parameter transaction: (SignedTransaction..SignedTransaction?) defined in net.corda.docs.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [74:33] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'inputs' @ [74:36] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'forEach' @ [74:43] ==> @HidesMembers public inline fun <T> Iterable<StateRef>.forEach(action: (StateRef) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'component1' @ [74:54] ==> public final operator fun component1(): SecureHash defined in net.corda.core.contracts.StateRef[DeserializedSimpleFunctionDescriptor]

'println' @ [75:25] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'txhash' @ [75:40] ==> val txhash: SecureHash defined in net.corda.docs.main.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'transaction' @ [75:49] ==> value-parameter transaction: (SignedTransaction..SignedTransaction?) defined in net.corda.docs.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [75:61] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'Visualise' @ [81:30] ==> enum entry Visualise defined in net.corda.docs.PrintOrVisualise[FakeCallableDescriptorForObject]

'MultiGraph' @ [82:29] ==> public constructor MultiGraph(p0: (String..String?)) defined in org.graphstream.graph.implementations.MultiGraph[JavaClassConstructorDescriptor]

'transactions' @ [83:17] ==> val transactions: List<SignedTransaction> defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'forEach' @ [83:30] ==> @HidesMembers public inline fun <T> Iterable<SignedTransaction>.forEach(action: (SignedTransaction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'graph' @ [84:21] ==> val graph: MultiGraph defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'addNode' @ [84:27] ==> public open fun <T : (Node..Node?)> addNode(p0: (String..String?)): (Node..Node?) defined in org.graphstream.graph.implementations.MultiGraph[JavaMethodDescriptor]
Inferred types:
    <T : (Node..Node?)> -> Node

'transaction' @ [84:44] ==> value-parameter transaction: SignedTransaction defined in net.corda.docs.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [84:56] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'transactions' @ [86:17] ==> val transactions: List<SignedTransaction> defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'forEach' @ [86:30] ==> @HidesMembers public inline fun <T> Iterable<SignedTransaction>.forEach(action: (SignedTransaction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'transaction' @ [87:21] ==> value-parameter transaction: SignedTransaction defined in net.corda.docs.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [87:33] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'inputs' @ [87:36] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'forEach' @ [87:43] ==> @HidesMembers public inline fun <T> Iterable<StateRef>.forEach(action: (StateRef) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'graph' @ [88:25] ==> val graph: MultiGraph defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'addEdge' @ [88:31] ==> public open fun <T : (Edge..Edge?)> addEdge(p0: (String..String?), p1: (String..String?), p2: (String..String?)): (Edge..Edge?) defined in org.graphstream.graph.implementations.MultiGraph[JavaMethodDescriptor]
Inferred types:
    <T : (Edge..Edge?)> -> Edge

'ref' @ [88:47] ==> value-parameter ref: StateRef defined in net.corda.docs.main.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [88:56] ==> value-parameter ref: StateRef defined in net.corda.docs.main.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [88:60] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'transaction' @ [88:73] ==> value-parameter transaction: SignedTransaction defined in net.corda.docs.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [88:85] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'futureTransactions' @ [91:17] ==> val futureTransactions: Observable<SignedTransaction> defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'subscribe' @ [91:36] ==> public final fun subscribe(p0: (((SignedTransaction..SignedTransaction?)) -> Unit..(((SignedTransaction..SignedTransaction?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'graph' @ [92:21] ==> val graph: MultiGraph defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'addNode' @ [92:27] ==> public open fun <T : (Node..Node?)> addNode(p0: (String..String?)): (Node..Node?) defined in org.graphstream.graph.implementations.MultiGraph[JavaMethodDescriptor]
Inferred types:
    <T : (Node..Node?)> -> Node

'transaction' @ [92:44] ==> value-parameter transaction: (SignedTransaction..SignedTransaction?) defined in net.corda.docs.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [92:56] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'transaction' @ [93:21] ==> value-parameter transaction: (SignedTransaction..SignedTransaction?) defined in net.corda.docs.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [93:33] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'inputs' @ [93:36] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'forEach' @ [93:43] ==> @HidesMembers public inline fun <T> Iterable<StateRef>.forEach(action: (StateRef) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'graph' @ [94:25] ==> val graph: MultiGraph defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'addEdge' @ [94:31] ==> public open fun <T : (Edge..Edge?)> addEdge(p0: (String..String?), p1: (String..String?), p2: (String..String?)): (Edge..Edge?) defined in org.graphstream.graph.implementations.MultiGraph[JavaMethodDescriptor]
Inferred types:
    <T : (Edge..Edge?)> -> Edge

'ref' @ [94:47] ==> value-parameter ref: StateRef defined in net.corda.docs.main.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [94:56] ==> value-parameter ref: StateRef defined in net.corda.docs.main.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [94:60] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'transaction' @ [94:73] ==> value-parameter transaction: (SignedTransaction..SignedTransaction?) defined in net.corda.docs.main.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [94:85] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'graph' @ [97:17] ==> val graph: MultiGraph defined in net.corda.docs.main.<anonymous>[LocalVariableDescriptor]

'display' @ [97:23] ==> public open fun display(): (Viewer..Viewer?) defined in org.graphstream.graph.implementations.MultiGraph[JavaMethodDescriptor]

'waitForAllNodesToFinish' @ [100:9] ==> public abstract fun waitForAllNodesToFinish(): Unit defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'proxy' @ [108:17] ==> value-parameter proxy: CordaRPCOps defined in net.corda.docs.generateTransactions[ValueParameterDescriptorImpl]

'vaultQueryBy' @ [108:23] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<Cash.State> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [108:50] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'vault' @ [110:25] ==> val vault: List<StateAndRef<Cash.State>> defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'fold' @ [110:31] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.fold(initial: Long, operation: (acc: Long, StateAndRef<Cash.State>) -> Long): Long defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> Long

'sum' @ [111:9] ==> value-parameter sum: Long defined in net.corda.docs.generateTransactions.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [111:15] ==> value-parameter state: StateAndRef<Cash.State> defined in net.corda.docs.generateTransactions.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [111:21] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [111:27] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [111:32] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'quantity' @ [111:39] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'OpaqueBytes' @ [113:20] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [113:32] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'proxy' @ [114:19] ==> value-parameter proxy: CordaRPCOps defined in net.corda.docs.generateTransactions[ValueParameterDescriptorImpl]

'networkMapSnapshot' @ [114:25] ==> public abstract fun networkMapSnapshot(): List<NodeInfo> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'parties' @ [115:18] ==> val parties: List<NodeInfo> defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'first' @ [115:26] ==> public inline fun <T> Iterable<NodeInfo>.first(predicate: (NodeInfo) -> Boolean): NodeInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [115:34] ==> value-parameter it: NodeInfo defined in net.corda.docs.generateTransactions.<anonymous>[ValueParameterDescriptorImpl]

'advertisedServices' @ [115:37] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'any' @ [115:56] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [115:62] ==> value-parameter it: ServiceEntry defined in net.corda.docs.generateTransactions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [115:65] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'type' @ [115:70] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'isNotary' @ [115:75] ==> public final fun isNotary(): Boolean defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'notaryIdentity' @ [115:90] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'proxy' @ [116:14] ==> value-parameter proxy: CordaRPCOps defined in net.corda.docs.generateTransactions[ValueParameterDescriptorImpl]

'nodeIdentity' @ [116:20] ==> public abstract fun nodeIdentity(): NodeInfo defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'legalIdentity' @ [116:35] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'sleep' @ [118:16] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'SplittableRandom' @ [119:22] ==> public constructor SplittableRandom() defined in java.util.SplittableRandom[JavaClassConstructorDescriptor]

'random' @ [120:17] ==> val random: SplittableRandom defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'nextDouble' @ [120:24] ==> public open fun nextDouble(): Double defined in java.util.SplittableRandom[JavaMethodDescriptor]

'if (ownedQuantity > 10000 && n > 0.8) {
            val quantity = Math.abs(random.nextLong()) % 2000
            proxy.startFlow(::CashExitFlow, Amount(quantity, USD), issueRef)
            ownedQuantity -= quantity
        } else if (ownedQuantity > 1000 && n < 0.7) {
            val quantity = Math.abs(random.nextLong() % Math.min(ownedQuantity, 2000))
            proxy.startFlow(::CashPaymentFlow, Amount(quantity, USD), me)
        } else {
            val quantity = Math.abs(random.nextLong() % 1000)
            proxy.startFlow(::CashIssueFlow, Amount(quantity, USD), issueRef, notary)
            ownedQuantity += quantity
        }' @ [121:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'ownedQuantity' @ [121:13] ==> var ownedQuantity: Long defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'n' @ [121:38] ==> val n: Double defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'%' @ [122:28] ==> @SinceKotlin public final operator fun rem(other: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'abs' @ [122:33] ==> public open fun abs(p0: Long): Long defined in java.lang.Math[JavaMethodDescriptor]

'random' @ [122:37] ==> val random: SplittableRandom defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'nextLong' @ [122:44] ==> public open fun nextLong(): Long defined in java.util.SplittableRandom[JavaMethodDescriptor]

'proxy' @ [123:13] ==> value-parameter proxy: CordaRPCOps defined in net.corda.docs.generateTransactions[ValueParameterDescriptorImpl]

'startFlow' @ [123:19] ==> public inline fun <T : Any, A, B, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, OpaqueBytes) -> CashExitFlow, arg0: Amount<Currency>, arg1: OpaqueBytes): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> OpaqueBytes
    <reified R : FlowLogic<T>> -> CashExitFlow

'CashExitFlow' @ [123:31] ==> public constructor CashExitFlow(amount: Amount<Currency>, issueRef: OpaqueBytes) defined in net.corda.finance.flows.CashExitFlow[DeserializedClassConstructorDescriptor]

'Amount' @ [123:45] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'quantity' @ [123:52] ==> val quantity: Long defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'USD' @ [123:62] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'issueRef' @ [123:68] ==> val issueRef: OpaqueBytes defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'ownedQuantity' @ [124:13] ==> var ownedQuantity: Long defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'quantity' @ [124:30] ==> val quantity: Long defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'if (ownedQuantity > 1000 && n < 0.7) {
            val quantity = Math.abs(random.nextLong() % Math.min(ownedQuantity, 2000))
            proxy.startFlow(::CashPaymentFlow, Amount(quantity, USD), me)
        } else {
            val quantity = Math.abs(random.nextLong() % 1000)
            proxy.startFlow(::CashIssueFlow, Amount(quantity, USD), issueRef, notary)
            ownedQuantity += quantity
        }' @ [125:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'ownedQuantity' @ [125:20] ==> var ownedQuantity: Long defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'n' @ [125:44] ==> val n: Double defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'abs' @ [126:33] ==> public open fun abs(p0: Long): Long defined in java.lang.Math[JavaMethodDescriptor]

'random' @ [126:37] ==> val random: SplittableRandom defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'nextLong' @ [126:44] ==> public open fun nextLong(): Long defined in java.util.SplittableRandom[JavaMethodDescriptor]

'min' @ [126:62] ==> public open fun min(p0: Long, p1: Long): Long defined in java.lang.Math[JavaMethodDescriptor]

'ownedQuantity' @ [126:66] ==> var ownedQuantity: Long defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'proxy' @ [127:13] ==> value-parameter proxy: CordaRPCOps defined in net.corda.docs.generateTransactions[ValueParameterDescriptorImpl]

'startFlow' @ [127:19] ==> public inline fun <T : Any, A, B, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, Party) -> CashPaymentFlow, arg0: Amount<Currency>, arg1: Party): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> Party
    <reified R : FlowLogic<T>> -> CashPaymentFlow

'CashPaymentFlow' @ [127:31] ==> public constructor CashPaymentFlow(amount: Amount<Currency>, recipient: Party) defined in net.corda.finance.flows.CashPaymentFlow[DeserializedClassConstructorDescriptor]

'Amount' @ [127:48] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'quantity' @ [127:55] ==> val quantity: Long defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'USD' @ [127:65] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'me' @ [127:71] ==> val me: Party defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'abs' @ [129:33] ==> public open fun abs(p0: Long): Long defined in java.lang.Math[JavaMethodDescriptor]

'random' @ [129:37] ==> val random: SplittableRandom defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'nextLong' @ [129:44] ==> public open fun nextLong(): Long defined in java.util.SplittableRandom[JavaMethodDescriptor]

'proxy' @ [130:13] ==> value-parameter proxy: CordaRPCOps defined in net.corda.docs.generateTransactions[ValueParameterDescriptorImpl]

'startFlow' @ [130:19] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, OpaqueBytes, Party) -> CashIssueFlow, arg0: Amount<Currency>, arg1: OpaqueBytes, arg2: Party): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> OpaqueBytes
    <C> -> Party
    <reified R : FlowLogic<T>> -> CashIssueFlow

'CashIssueFlow' @ [130:31] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'Amount' @ [130:46] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'quantity' @ [130:53] ==> val quantity: Long defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'USD' @ [130:63] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'issueRef' @ [130:69] ==> val issueRef: OpaqueBytes defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'notary' @ [130:79] ==> val notary: Party defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'ownedQuantity' @ [131:13] ==> var ownedQuantity: Long defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'quantity' @ [131:30] ==> val quantity: Long defined in net.corda.docs.generateTransactions[LocalVariableDescriptor]

'CordaSerializable' @ [142:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'CordaPluginRegistry' @ [145:39] ==> public constructor CordaPluginRegistry() defined in net.corda.core.node.CordaPluginRegistry[DeserializedClassConstructorDescriptor]

'custom' @ [148:9] ==> value-parameter custom: SerializationCustomization defined in net.corda.docs.ExampleRPCCordaPluginRegistry.customizeSerialization[ValueParameterDescriptorImpl]

'addToWhitelist' @ [148:16] ==> public abstract fun addToWhitelist(type: Class<*>): Unit defined in net.corda.core.serialization.SerializationCustomization[DeserializedSimpleFunctionDescriptor]

'ExampleRPCValue' @ [148:31] ==> public constructor ExampleRPCValue(foo: String) defined in net.corda.docs.ExampleRPCValue[ClassConstructorDescriptorImpl]

'java' @ [148:54] ==> public val <T> KClass<ExampleRPCValue>.java: Class<ExampleRPCValue> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ExampleRPCValue

