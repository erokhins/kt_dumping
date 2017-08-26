'Deprecated' @ [15:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'CashFlowCommand' @ [26:52] ==> private constructor CashFlowCommand() defined in net.corda.finance.flows.CashFlowCommand[ClassConstructorDescriptorImpl]

'proxy' @ [28:13] ==> value-parameter proxy: CordaRPCOps defined in net.corda.finance.flows.CashFlowCommand.IssueCash.startFlow[ValueParameterDescriptorImpl]

'startFlow' @ [28:19] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, OpaqueBytes, Party) -> CashIssueFlow, arg0: Amount<Currency>, arg1: OpaqueBytes, arg2: Party): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> OpaqueBytes
    <C> -> Party
    <reified R : FlowLogic<T>> -> CashIssueFlow

'amount' @ [28:46] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.CashFlowCommand.IssueCash[PropertyDescriptorImpl]

'issueRef' @ [28:54] ==> public final val issueRef: OpaqueBytes defined in net.corda.finance.flows.CashFlowCommand.IssueCash[PropertyDescriptorImpl]

'notary' @ [28:64] ==> public final val notary: Party defined in net.corda.finance.flows.CashFlowCommand.IssueCash[PropertyDescriptorImpl]

'returnValue' @ [28:72] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [28:84] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'proxy' @ [29:20] ==> value-parameter proxy: CordaRPCOps defined in net.corda.finance.flows.CashFlowCommand.IssueCash.startFlow[ValueParameterDescriptorImpl]

'startFlow' @ [29:26] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, Party, Boolean) -> CashPaymentFlow, arg0: Amount<Currency>, arg1: Party, arg2: Boolean): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> Party
    <C> -> Boolean
    <reified R : FlowLogic<T>> -> CashPaymentFlow

'amount' @ [29:55] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.CashFlowCommand.IssueCash[PropertyDescriptorImpl]

'recipient' @ [29:63] ==> public final val recipient: Party defined in net.corda.finance.flows.CashFlowCommand.IssueCash[PropertyDescriptorImpl]

'anonymous' @ [29:74] ==> public final val anonymous: Boolean defined in net.corda.finance.flows.CashFlowCommand.IssueCash[PropertyDescriptorImpl]

'CashFlowCommand' @ [40:50] ==> private constructor CashFlowCommand() defined in net.corda.finance.flows.CashFlowCommand[ClassConstructorDescriptorImpl]

'proxy' @ [41:54] ==> value-parameter proxy: CordaRPCOps defined in net.corda.finance.flows.CashFlowCommand.PayCash.startFlow[ValueParameterDescriptorImpl]

'startFlow' @ [41:60] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, Party, Boolean) -> CashPaymentFlow, arg0: Amount<Currency>, arg1: Party, arg2: Boolean): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> Party
    <C> -> Boolean
    <reified R : FlowLogic<T>> -> CashPaymentFlow

'amount' @ [41:89] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.CashFlowCommand.PayCash[PropertyDescriptorImpl]

'recipient' @ [41:97] ==> public final val recipient: Party defined in net.corda.finance.flows.CashFlowCommand.PayCash[PropertyDescriptorImpl]

'anonymous' @ [41:108] ==> public final val anonymous: Boolean defined in net.corda.finance.flows.CashFlowCommand.PayCash[PropertyDescriptorImpl]

'CashFlowCommand' @ [50:84] ==> private constructor CashFlowCommand() defined in net.corda.finance.flows.CashFlowCommand[ClassConstructorDescriptorImpl]

'proxy' @ [51:54] ==> value-parameter proxy: CordaRPCOps defined in net.corda.finance.flows.CashFlowCommand.ExitCash.startFlow[ValueParameterDescriptorImpl]

'startFlow' @ [51:60] ==> public inline fun <T : Any, A, B, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, OpaqueBytes) -> CashExitFlow, arg0: Amount<Currency>, arg1: OpaqueBytes): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> OpaqueBytes
    <reified R : FlowLogic<T>> -> CashExitFlow

'amount' @ [51:86] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.CashFlowCommand.ExitCash[PropertyDescriptorImpl]

'issueRef' @ [51:94] ==> public final val issueRef: OpaqueBytes defined in net.corda.finance.flows.CashFlowCommand.ExitCash[PropertyDescriptorImpl]

