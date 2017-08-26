'InitiatingFlow' @ [17:1] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[ClassConstructorDescriptorImpl]

'FlowLogic<Unit>' @ [19:72] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [20:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'participants' @ [23:9] ==> public final val participants: NonEmptySet<Party> defined in net.corda.core.flows.BroadcastTransactionFlow[PropertyDescriptorImpl]

'filter' @ [23:22] ==> public inline fun <T> Iterable<Party>.filter(predicate: (Party) -> Boolean): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'it' @ [23:31] ==> value-parameter it: Party defined in net.corda.core.flows.BroadcastTransactionFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'serviceHub' @ [23:37] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.BroadcastTransactionFlow[PropertyDescriptorImpl]

'myInfo' @ [23:48] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'legalIdentity' @ [23:55] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'forEach' @ [23:71] ==> @HidesMembers public inline fun <T> Iterable<Party>.forEach(action: (Party) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'subFlow' @ [25:13] ==> @Suspendable @Throws public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.core.flows.BroadcastTransactionFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Void?

'SendTransactionFlow' @ [25:21] ==> public constructor SendTransactionFlow(otherSide: Party, stx: SignedTransaction) defined in net.corda.core.flows.SendTransactionFlow[ClassConstructorDescriptorImpl]

'participant' @ [25:41] ==> value-parameter participant: Party defined in net.corda.core.flows.BroadcastTransactionFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'notarisedTransaction' @ [25:54] ==> public final val notarisedTransaction: SignedTransaction defined in net.corda.core.flows.BroadcastTransactionFlow[PropertyDescriptorImpl]

