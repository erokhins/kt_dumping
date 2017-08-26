'getService' @ [30:35] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(NotPropertiesService..NotPropertiesService?)>): (NotPropertiesService..NotPropertiesService?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.core.NotPropertiesService..org.jetbrains.kotlin.idea.core.NotPropertiesService?)

'project' @ [30:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.NotPropertiesService.Companion.getInstance[ValueParameterDescriptorImpl]

'NotPropertiesService' @ [30:55] ==> public companion object defined in org.jetbrains.kotlin.idea.core.NotPropertiesService[FakeCallableDescriptorForObject]

'java' @ [30:83] ==> public val <T> KClass<NotPropertiesService>.java: Class<NotPropertiesService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NotPropertiesService

'getInstance' @ [34:17] ==> public final fun getInstance(project: Project): NotPropertiesService defined in org.jetbrains.kotlin.idea.core.NotPropertiesService.Companion[SimpleFunctionDescriptorImpl]

'element' @ [34:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.NotPropertiesService.Companion.getNotProperties[ValueParameterDescriptorImpl]

'project' @ [34:37] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getNotProperties' @ [34:46] ==> public abstract fun getNotProperties(element: PsiElement): Set<FqNameUnsafe> defined in org.jetbrains.kotlin.idea.core.NotPropertiesService[SimpleFunctionDescriptorImpl]

'element' @ [34:63] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.NotPropertiesService.Companion.getNotProperties[ValueParameterDescriptorImpl]

