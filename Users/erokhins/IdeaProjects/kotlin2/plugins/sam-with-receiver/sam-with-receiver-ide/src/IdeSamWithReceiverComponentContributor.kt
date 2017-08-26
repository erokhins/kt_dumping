'PLUGIN_ID' @ [42:49] ==> public final val PLUGIN_ID: String defined in org.jetbrains.kotlin.samWithReceiver.SamWithReceiverCommandLineProcessor.Companion[PropertyImportedFromObject]

'ANNOTATION_OPTION' @ [42:61] ==> public final val ANNOTATION_OPTION: CliOption defined in org.jetbrains.kotlin.samWithReceiver.SamWithReceiverCommandLineProcessor.Companion[PropertyImportedFromObject]

'name' @ [42:79] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'getManager' @ [45:45] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [45:56] ==> public final val project: Project defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor[PropertyDescriptorImpl]

'createCachedValue' @ [45:65] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)>?, p1: Boolean): CachedValue<(WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.util.WeakHashMap<com.intellij.openapi.module.Module, kotlin.collections.List<kotlin.String>>..java.util.WeakHashMap<com.intellij.openapi.module.Module, kotlin.collections.List<kotlin.String>>?)

'create' @ [46:16] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: WeakHashMap<Module, List<String>>?, @NotNull vararg p1: (Any..Any?)): (CachedValueProvider.Result<(WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)>..CachedValueProvider.Result<(WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WeakHashMap<Module, List<String>>

'WeakHashMap' @ [46:23] ==> public constructor WeakHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.WeakHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Module
    <V : (Any..Any?)> -> List<String>

'getInstance' @ [46:91] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [46:103] ==> public final val project: Project defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor[PropertyDescriptorImpl]

'cache' @ [50:16] ==> private final val cache: CachedValue<(WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)> defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor[PropertyDescriptorImpl]

'value' @ [50:22] ==> public final val <T : (Any..Any?)> CachedValue<(WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)>.value: (WeakHashMap<Module, List<String>>..WeakHashMap<Module, List<String>>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.util.WeakHashMap<com.intellij.openapi.module.Module, kotlin.collections.List<kotlin.String>>..java.util.WeakHashMap<com.intellij.openapi.module.Module, kotlin.collections.List<kotlin.String>>?)

'getOrPut' @ [50:28] ==> public inline fun <K, V> MutableMap<(Module..Module?), (List<String>..List<String>?)>.getOrPut(key: (Module..Module?), defaultValue: () -> (List<String>..List<String>?)): (List<String>..List<String>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)
    <V> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<kotlin.String>?)

'module' @ [50:37] ==> value-parameter module: Module defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor.getAnnotationsForModule[ValueParameterDescriptorImpl]

'module' @ [50:47] ==> value-parameter module: Module defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor.getAnnotationsForModule[ValueParameterDescriptorImpl]

'getSpecialAnnotations' @ [50:54] ==> public fun Module.getSpecialAnnotations(prefix: String): List<String> defined in org.jetbrains.kotlin.annotation.plugin.ide[DeserializedSimpleFunctionDescriptor]

'ANNOTATION_OPTION_PREFIX' @ [50:76] ==> public final val ANNOTATION_OPTION_PREFIX: String defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor.Companion[PropertyDescriptorImpl]

'platform' @ [59:13] ==> value-parameter platform: TargetPlatform defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor.registerModuleComponents[ValueParameterDescriptorImpl]

'JvmPlatform' @ [59:25] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'moduleDescriptor' @ [61:26] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor.registerModuleComponents[ValueParameterDescriptorImpl]

'getCapability' @ [61:43] ==> public abstract fun <T> getCapability(capability: ModuleDescriptor.Capability<ModuleInfo>): ModuleInfo? defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleInfo

'Capability' @ [61:68] ==> public final val Capability: ModuleDescriptor.Capability<ModuleInfo> defined in org.jetbrains.kotlin.analyzer.ModuleInfo.Companion[DeserializedPropertyDescriptor]

'when (moduleInfo) {
                    is ScriptModuleInfo -> moduleInfo.scriptDefinition.annotationsForSamWithReceivers
                    is ScriptDependenciesModuleInfo -> moduleInfo.scriptModuleInfo?.scriptDefinition?.annotationsForSamWithReceivers
                    is ModuleProductionSourceInfo -> getAnnotationsForModule(moduleInfo.module)
                    else -> null
                }' @ [63:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<String>?, entry1: List<String>?, entry2: List<String>?, entry3: List<String>?): List<String>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<String>?

'moduleInfo' @ [63:23] ==> val moduleInfo: ModuleInfo? defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor.registerModuleComponents[LocalVariableDescriptor]

'moduleInfo' @ [64:44] ==> val moduleInfo: ModuleInfo? defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor.registerModuleComponents[LocalVariableDescriptor]

'scriptDefinition' @ [64:55] ==> public final val scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[DeserializedPropertyDescriptor]

'annotationsForSamWithReceivers' @ [64:72] ==> public open val annotationsForSamWithReceivers: List<String> defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'moduleInfo' @ [65:56] ==> val moduleInfo: ModuleInfo? defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor.registerModuleComponents[LocalVariableDescriptor]

'scriptModuleInfo' @ [65:67] ==> public final val scriptModuleInfo: ScriptModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[DeserializedPropertyDescriptor]

'scriptDefinition' @ [65:85] ==> public final val scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[DeserializedPropertyDescriptor]

'annotationsForSamWithReceivers' @ [65:103] ==> public open val annotationsForSamWithReceivers: List<String> defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'getAnnotationsForModule' @ [66:54] ==> private final fun getAnnotationsForModule(module: Module): List<String> defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [66:78] ==> val moduleInfo: ModuleInfo? defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor.registerModuleComponents[LocalVariableDescriptor]

'module' @ [66:89] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceInfo[DeserializedPropertyDescriptor]

'container' @ [70:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor.registerModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [70:19] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'SamWithReceiverResolverExtension' @ [70:31] ==> public constructor SamWithReceiverResolverExtension(annotations: List<String>) defined in org.jetbrains.kotlin.samWithReceiver.SamWithReceiverResolverExtension[DeserializedClassConstructorDescriptor]

'annotations' @ [70:64] ==> val annotations: List<String> defined in org.jetbrains.kotlin.samWithReceiver.ide.IdeSamWithReceiverComponentContributor.registerModuleComponents[LocalVariableDescriptor]

