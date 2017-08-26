'SendStateAndRefFlow' @ [9:47] ==> public constructor SendStateAndRefFlow(otherSide: Party, stateAndRefs: List<StateAndRef<*>>) defined in net.corda.core.flows.SendStateAndRefFlow[DeserializedClassConstructorDescriptor]

'otherSide' @ [9:67] ==> value-parameter otherSide: Party defined in net.corda.core.flows.TestDataVendingFlow.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [9:78] ==> public fun <T> emptyList(): List<StateAndRef<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<*>

'Suspendable' @ [10:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'if (payload is List<*> && payload.isEmpty()) {
            // Hack to not send the first message.
            receive(otherSide)
        } else {
            super.sendPayloadAndReceiveDataRequest(otherSide, payload)
        }' @ [12:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UntrustworthyData<FetchDataFlow.Request>, elseBranch: UntrustworthyData<FetchDataFlow.Request>): UntrustworthyData<FetchDataFlow.Request>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UntrustworthyData<Request>

'payload' @ [12:20] ==> value-parameter payload: Any defined in net.corda.core.flows.TestDataVendingFlow.sendPayloadAndReceiveDataRequest[ValueParameterDescriptorImpl]

'payload' @ [12:42] ==> value-parameter payload: Any defined in net.corda.core.flows.TestDataVendingFlow.sendPayloadAndReceiveDataRequest[ValueParameterDescriptorImpl]

'isEmpty' @ [12:50] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'receive' @ [14:13] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<FetchDataFlow.Request> defined in net.corda.core.flows.TestDataVendingFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Request

'otherSide' @ [14:21] ==> value-parameter otherSide: Party defined in net.corda.core.flows.TestDataVendingFlow.sendPayloadAndReceiveDataRequest[ValueParameterDescriptorImpl]

'super' @ [16:13] ==> <this> defined in net.corda.core.flows.TestDataVendingFlow[LazyClassReceiverParameterDescriptor]

'sendPayloadAndReceiveDataRequest' @ [16:19] ==> @Suspendable protected open fun sendPayloadAndReceiveDataRequest(otherSide: Party, payload: Any): UntrustworthyData<FetchDataFlow.Request> defined in net.corda.core.flows.SendStateAndRefFlow[DeserializedSimpleFunctionDescriptor]

'otherSide' @ [16:52] ==> value-parameter otherSide: Party defined in net.corda.core.flows.TestDataVendingFlow.sendPayloadAndReceiveDataRequest[ValueParameterDescriptorImpl]

'payload' @ [16:63] ==> value-parameter payload: Any defined in net.corda.core.flows.TestDataVendingFlow.sendPayloadAndReceiveDataRequest[ValueParameterDescriptorImpl]

