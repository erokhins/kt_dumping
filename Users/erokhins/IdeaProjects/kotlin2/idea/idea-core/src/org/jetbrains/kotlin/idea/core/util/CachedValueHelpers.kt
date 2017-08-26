'value' @ [25:79] ==> public final val <T : (Any..Any?)> CachedValue<T>.value: (T..T?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'getManager' @ [28:29] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [28:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.util.CachedValue[ValueParameterDescriptorImpl]

'createCachedValue' @ [28:49] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(T..T?)>?, p1: Boolean): CachedValue<(T..T?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'provider' @ [28:67] ==> value-parameter provider: () -> CachedValueProvider.Result<T> defined in org.jetbrains.kotlin.idea.core.util.CachedValue[ValueParameterDescriptorImpl]

'trackValue' @ [28:77] ==> value-parameter trackValue: Boolean = ... defined in org.jetbrains.kotlin.idea.core.util.CachedValue[ValueParameterDescriptorImpl]

