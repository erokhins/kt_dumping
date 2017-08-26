'getValue' @ [32:73] ==> public final operator fun getValue(thisRef: R, desc: KProperty<*>): T? defined in org.jetbrains.kotlin.psi.UserDataProperty[DeserializedSimpleFunctionDescriptor]

'create' @ [32:94] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(KotlinFacetSettings..KotlinFacetSettings?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.config.KotlinFacetSettings..org.jetbrains.kotlin.config.KotlinFacetSettings?)

'project' @ [36:9] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl[PropertyDescriptorImpl]

'messageBus' @ [36:17] ==> public final val Project.messageBus: MessageBus[MyPropertyDescriptor]

'connect' @ [36:28] ==> @NotNull public abstract fun connect(@NotNull p0: Disposable): MessageBusConnection defined in com.intellij.util.messages.MessageBus[JavaMethodDescriptor]

'project' @ [36:36] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl[PropertyDescriptorImpl]

'subscribe' @ [36:45] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(ModuleRootListener..ModuleRootListener?)>, @NotNull p1: ModuleRootListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> (com.intellij.openapi.roots.ModuleRootListener..com.intellij.openapi.roots.ModuleRootListener?)

'PROJECT_ROOTS' @ [37:31] ==> public final val PROJECT_ROOTS: (Topic<(ModuleRootListener..ModuleRootListener?)>..Topic<(ModuleRootListener..ModuleRootListener?)>?) defined in com.intellij.ProjectTopics[JavaPropertyDescriptor]

'getInstance' @ [40:39] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [40:51] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl[PropertyDescriptorImpl]

'modules' @ [40:60] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'forEach' @ [40:68] ==> public inline fun <T> Array<out (Module..Module?)>.forEach(action: ((Module..Module?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'it' @ [40:78] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.<init>.<no name provided>.rootsChanged.<anonymous>[ValueParameterDescriptorImpl]

'facetSettingsCache' @ [40:81] ==> private final var Module.facetSettingsCache: KotlinFacetSettings? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.Companion[PropertyDescriptorImpl]

'KotlinFacet' @ [46:48] ==> public companion object defined in org.jetbrains.kotlin.idea.facet.KotlinFacet[FakeCallableDescriptorForObject]

'get' @ [46:60] ==> public final fun get(module: Module): KotlinFacet? defined in org.jetbrains.kotlin.idea.facet.KotlinFacet.Companion[SimpleFunctionDescriptorImpl]

'module' @ [46:64] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.getSettings[ValueParameterDescriptorImpl]

'configuration' @ [46:73] ==> public final val KotlinFacet.configuration: KotlinFacetConfiguration[MyPropertyDescriptor]

'settings' @ [46:88] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'getSettings' @ [49:9] ==> public open fun getSettings(module: Module): KotlinFacetSettings? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl[SimpleFunctionDescriptorImpl]

'module' @ [49:21] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.getInitializedSettings[ValueParameterDescriptorImpl]

'let' @ [49:30] ==> @InlineOnly public inline fun <T, R> KotlinFacetSettings.let(block: (KotlinFacetSettings) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFacetSettings
    <R> -> Nothing

'it' @ [50:13] ==> value-parameter it: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.getInitializedSettings.<anonymous>[ValueParameterDescriptorImpl]

'initializeIfNeeded' @ [50:16] ==> public fun KotlinFacetSettings.initializeIfNeeded(module: Module, rootModel: ModuleRootModel?, platformKind: TargetPlatformKind<*>? = ...): Unit defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [50:35] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.getInitializedSettings[ValueParameterDescriptorImpl]

'it' @ [51:20] ==> value-parameter it: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.getInitializedSettings.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [54:9] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.getInitializedSettings[ValueParameterDescriptorImpl]

'facetSettingsCache' @ [54:16] ==> private final var Module.facetSettingsCache: KotlinFacetSettings? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.Companion[PropertyDescriptorImpl]

'let' @ [54:36] ==> @InlineOnly public inline fun <T, R> KotlinFacetSettings.let(block: (KotlinFacetSettings) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFacetSettings
    <R> -> Nothing

'it' @ [54:49] ==> value-parameter it: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.getInitializedSettings.<anonymous>[ValueParameterDescriptorImpl]

'KotlinFacetSettings' @ [56:16] ==> public constructor KotlinFacetSettings() defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedClassConstructorDescriptor]

'apply' @ [56:38] ==> @InlineOnly public inline fun <T> KotlinFacetSettings.apply(block: KotlinFacetSettings.() -> Unit): KotlinFacetSettings defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFacetSettings

'initializeIfNeeded' @ [57:13] ==> public fun KotlinFacetSettings.initializeIfNeeded(module: Module, rootModel: ModuleRootModel?, platformKind: TargetPlatformKind<*>? = ...): Unit defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [57:32] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.getInitializedSettings[ValueParameterDescriptorImpl]

'module' @ [58:13] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.getInitializedSettings[ValueParameterDescriptorImpl]

'facetSettingsCache' @ [58:20] ==> private final var Module.facetSettingsCache: KotlinFacetSettings? defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.Companion[PropertyDescriptorImpl]

'this' @ [58:41] ==> <this> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetSettingsProviderImpl.getInitializedSettings.<anonymous>[ReceiverParameterDescriptorImpl]

