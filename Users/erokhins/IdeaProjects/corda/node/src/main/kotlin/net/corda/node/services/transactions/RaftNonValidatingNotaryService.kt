'TrustedAuthorityNotaryService' @ [10:83] ==> public constructor TrustedAuthorityNotaryService() defined in net.corda.core.node.services.TrustedAuthorityNotaryService[DeserializedClassConstructorDescriptor]

'SimpleNotaryService' @ [12:20] ==> public companion object defined in net.corda.node.services.transactions.SimpleNotaryService[FakeCallableDescriptorForObject]

'type' @ [12:40] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.SimpleNotaryService.Companion[PropertyDescriptorImpl]

'getSubType' @ [12:45] ==> public final fun getSubType(subTypeId: String): ServiceType defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'TimeWindowChecker' @ [15:57] ==> public constructor TimeWindowChecker(clock: Clock = ...) defined in net.corda.core.node.services.TimeWindowChecker[DeserializedClassConstructorDescriptor]

'services' @ [15:75] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.RaftNonValidatingNotaryService[PropertyDescriptorImpl]

'clock' @ [15:84] ==> public abstract val clock: Clock defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'RaftUniquenessProvider' @ [16:63] ==> public constructor RaftUniquenessProvider(services: ServiceHubInternal) defined in net.corda.node.services.transactions.RaftUniquenessProvider[ClassConstructorDescriptorImpl]

'services' @ [16:86] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.RaftNonValidatingNotaryService[PropertyDescriptorImpl]

'NonValidatingNotaryFlow' @ [18:77] ==> public constructor NonValidatingNotaryFlow(otherSide: Party, service: TrustedAuthorityNotaryService) defined in net.corda.node.services.transactions.NonValidatingNotaryFlow[ClassConstructorDescriptorImpl]

'otherParty' @ [18:101] ==> value-parameter otherParty: Party defined in net.corda.node.services.transactions.RaftNonValidatingNotaryService.createServiceFlow[ValueParameterDescriptorImpl]

'this' @ [18:113] ==> <this> defined in net.corda.node.services.transactions.RaftNonValidatingNotaryService[LazyClassReceiverParameterDescriptor]

'uniquenessProvider' @ [21:9] ==> protected open val uniquenessProvider: RaftUniquenessProvider defined in net.corda.node.services.transactions.RaftNonValidatingNotaryService[PropertyDescriptorImpl]

'start' @ [21:28] ==> public final fun start(): Unit defined in net.corda.node.services.transactions.RaftUniquenessProvider[SimpleFunctionDescriptorImpl]

'uniquenessProvider' @ [25:9] ==> protected open val uniquenessProvider: RaftUniquenessProvider defined in net.corda.node.services.transactions.RaftNonValidatingNotaryService[PropertyDescriptorImpl]

'stop' @ [25:28] ==> public final fun stop(): Unit defined in net.corda.node.services.transactions.RaftUniquenessProvider[SimpleFunctionDescriptorImpl]

