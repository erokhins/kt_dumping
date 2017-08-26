'TrustedAuthorityNotaryService' @ [10:80] ==> public constructor TrustedAuthorityNotaryService() defined in net.corda.core.node.services.TrustedAuthorityNotaryService[DeserializedClassConstructorDescriptor]

'ValidatingNotaryService' @ [12:20] ==> public companion object defined in net.corda.node.services.transactions.ValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [12:44] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.ValidatingNotaryService.Companion[PropertyDescriptorImpl]

'getSubType' @ [12:49] ==> public final fun getSubType(subTypeId: String): ServiceType defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'TimeWindowChecker' @ [15:57] ==> public constructor TimeWindowChecker(clock: Clock = ...) defined in net.corda.core.node.services.TimeWindowChecker[DeserializedClassConstructorDescriptor]

'services' @ [15:75] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.RaftValidatingNotaryService[PropertyDescriptorImpl]

'clock' @ [15:84] ==> public abstract val clock: Clock defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'RaftUniquenessProvider' @ [16:63] ==> public constructor RaftUniquenessProvider(services: ServiceHubInternal) defined in net.corda.node.services.transactions.RaftUniquenessProvider[ClassConstructorDescriptorImpl]

'services' @ [16:86] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.RaftValidatingNotaryService[PropertyDescriptorImpl]

'ValidatingNotaryFlow' @ [18:77] ==> public constructor ValidatingNotaryFlow(otherSide: Party, service: TrustedAuthorityNotaryService) defined in net.corda.node.services.transactions.ValidatingNotaryFlow[ClassConstructorDescriptorImpl]

'otherParty' @ [18:98] ==> value-parameter otherParty: Party defined in net.corda.node.services.transactions.RaftValidatingNotaryService.createServiceFlow[ValueParameterDescriptorImpl]

'this' @ [18:110] ==> <this> defined in net.corda.node.services.transactions.RaftValidatingNotaryService[LazyClassReceiverParameterDescriptor]

'uniquenessProvider' @ [21:9] ==> protected open val uniquenessProvider: RaftUniquenessProvider defined in net.corda.node.services.transactions.RaftValidatingNotaryService[PropertyDescriptorImpl]

'start' @ [21:28] ==> public final fun start(): Unit defined in net.corda.node.services.transactions.RaftUniquenessProvider[SimpleFunctionDescriptorImpl]

'uniquenessProvider' @ [25:9] ==> protected open val uniquenessProvider: RaftUniquenessProvider defined in net.corda.node.services.transactions.RaftValidatingNotaryService[PropertyDescriptorImpl]

'stop' @ [25:28] ==> public final fun stop(): Unit defined in net.corda.node.services.transactions.RaftUniquenessProvider[SimpleFunctionDescriptorImpl]

