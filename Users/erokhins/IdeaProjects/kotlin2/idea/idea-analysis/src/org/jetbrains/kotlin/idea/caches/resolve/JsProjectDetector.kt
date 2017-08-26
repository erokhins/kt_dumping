'JvmStatic' @ [29:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getManager' @ [31:36] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [31:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.JsProjectDetector.isJsProject[ValueParameterDescriptorImpl]

'getCachedValue' @ [31:56] ==> public final fun <T : (Any..Any?), D : (UserDataHolder..UserDataHolder?)> getCachedValue(@NotNull p0: Project, @NotNull p1: () -> CachedValueProvider.Result<(Boolean..Boolean?)>?): (Boolean..Boolean?) defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean
    <D : (UserDataHolder..UserDataHolder?)> -> Project

'project' @ [31:71] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.JsProjectDetector.isJsProject[ValueParameterDescriptorImpl]

'getInstance' @ [32:40] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [32:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.JsProjectDetector.isJsProject[ValueParameterDescriptorImpl]

'modules' @ [32:61] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'any' @ [32:69] ==> public inline fun <T> Array<out (Module..Module?)>.any(predicate: ((Module..Module?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'==' @ [32:75] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.TargetPlatform[DeserializedSimpleFunctionDescriptor]

'getPlatform' @ [32:98] ==> @NotNull public open fun getPlatform(@NotNull module: Module): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'it' @ [32:110] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.JsProjectDetector.isJsProject.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'JsPlatform' @ [32:117] ==> public object JsPlatform : TargetPlatform defined in org.jetbrains.kotlin.js.resolve[FakeCallableDescriptorForObject]

'Result' @ [33:33] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: Boolean?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'result' @ [33:40] ==> val result: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.JsProjectDetector.isJsProject.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [33:79] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [33:91] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.JsProjectDetector.isJsProject[ValueParameterDescriptorImpl]

