'getService' @ [33:43] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(SampleResolutionService..SampleResolutionService?)>): (SampleResolutionService..SampleResolutionService?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SampleResolutionService

'resolutionFacade' @ [33:54] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.SampleResolutionService.Companion.resolveSample[ValueParameterDescriptorImpl]

'project' @ [33:71] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[PropertyDescriptorImpl]

'SampleResolutionService' @ [33:80] ==> public companion object defined in org.jetbrains.kotlin.idea.kdoc.SampleResolutionService[FakeCallableDescriptorForObject]

'java' @ [33:111] ==> public val <T> KClass<SampleResolutionService>.java: Class<SampleResolutionService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SampleResolutionService

'instance' @ [34:20] ==> val instance: (SampleResolutionService..SampleResolutionService?) defined in org.jetbrains.kotlin.idea.kdoc.SampleResolutionService.Companion.resolveSample[LocalVariableDescriptor]

'resolveSample' @ [34:30] ==> public abstract fun resolveSample(context: BindingContext, fromDescriptor: DeclarationDescriptor, resolutionFacade: ResolutionFacade, qualifiedName: List<String>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.kdoc.SampleResolutionService[SimpleFunctionDescriptorImpl]

'context' @ [34:44] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.kdoc.SampleResolutionService.Companion.resolveSample[ValueParameterDescriptorImpl]

'fromDescriptor' @ [34:53] ==> value-parameter fromDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.kdoc.SampleResolutionService.Companion.resolveSample[ValueParameterDescriptorImpl]

'resolutionFacade' @ [34:69] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.kdoc.SampleResolutionService.Companion.resolveSample[ValueParameterDescriptorImpl]

'qualifiedName' @ [34:87] ==> value-parameter qualifiedName: List<String> defined in org.jetbrains.kotlin.idea.kdoc.SampleResolutionService.Companion.resolveSample[ValueParameterDescriptorImpl]

'emptyList' @ [34:105] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

